package mms.storage;

import mms.exceptions.PackingException;
import mms.exceptions.StorageFullException;
import mms.utility.Packable;
import mms.utility.Size;

import java.util.ArrayList;
import java.util.List;

public abstract class Storage implements Packable{
   public double width;
   public double height;
   public double length;
   public Size size;
   public List<Packable> pageableList;

   public double getWidth() {
      return width;
   }

   public void setWidth(double width) {
      this.width = width;
   }

   public double getHeight() {
      return height;
   }

   public void setHeight(double height) {
      this.height = height;
   }

   public double getLength() {
      return length;
   }

   public void setLength(double length) {
      this.length = length;
   }

   public Size getSize() {
      return size;
   }

   public void setSize(Size size) {
      this.size = size;
   }

   @Override
   public double getVolume() {
      return width*height*length;
   }

   @Override
   public String toString() {
      return "Storage(" + width + ", " + height +", " + length + ")" + size ;
   }

   /**
    * 构造方法
    * @param width
    * @param height
    * @param length
    * @param size
    */
   public Storage(double width, double height, double length, Size size) {
      if(width<=0 || height <=0 || length<=0){
         throw new IllegalArgumentException("容积不可为负数");
      }
      this.width = width;
      this.height = height;
      this.length = length;
      this.size = size;
      this.pageableList = new ArrayList<>();
   }
   public Storage(double width, double height, double length) {
      if(width<=0 || height <=0 || length<=0){
         throw new IllegalArgumentException("容积不可为负数");
      }
      this.width = width;
      this.height = height;
      this.length = length;
      this.pageableList = new ArrayList<>();
      if(width<5 && height<5 && length<5){
         this.size = Size.MEDIUM;
      }
   }
   /**
    * 求面积
    * @return
    */

   protected abstract int  getMultiplier();
   /**
    * 装载
    * @param packable
    */
   public void pack(Packable packable) throws PackingException{
      if(this instanceof Storage){
         Storage storage1 = (Storage)this;
         if(storage1.getWidth()<=0){
            throw new IllegalArgumentException();
         }
         if(storage1.getHeight()<=0){
            throw new IllegalArgumentException();
         }
         if(storage1.getLength()<=0){
            throw new IllegalArgumentException();
         }
      }
      if(this instanceof Storage){
         Storage storage2 = (Storage)this;

         if(packable.getWidth()> storage2.getWidth()){
            throw new PackingException();
         }
         if(packable.getHeight() > storage2.getHeight()){
            throw new PackingException();
         }
         if(packable.getLength() > storage2.getLength()){
            throw new PackingException();
         }
      }
      double totalHeight = packable.getHeight();
      double totalLength = packable.getLength();
      double totalWidth = packable.getWidth();
      for(Packable item : pageableList){
         totalHeight  = totalHeight + item.getHeight();
         totalLength  = totalLength + item.getLength();
         totalWidth  = totalWidth + item.getWidth();
      }
      if(totalHeight>height || totalLength>length || totalWidth>width){
         throw new StorageFullException("超载");
      }
      this.pageableList.add(packable);
   }

   /**
    * 卸载
    * @return
    */
   public Packable unpack(){
      return this.pageableList.remove(0);
   }

   public List getElements() {
      return this.pageableList;
   }

   public List<Packable> getElementsOfType(Packable packable) {
      List<Packable> res = new ArrayList<>();
      for(Packable packable1 : pageableList){
         if(packable1 == packable){
            res.add(packable);
         }
      }
      return res;
   }

   public int getOccupiedCapacity() {
      return this.pageableList.size();
   }

   public int getCapacity(){
      if(size.equals(Size.SMALL)){
         return 3;
      }else if(size.equals(Size.MEDIUM)){
         return 5;
      }else if(size.equals(Size.LARGE)){
         return 10;
      }
      return 1;
   }
}