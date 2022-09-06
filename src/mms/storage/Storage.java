package mms.storage;

import mms.exceptions.PackingException;
import mms.utility.Packable;
import mms.utility.Size;

import java.util.ArrayList;
import java.util.List;

public class Storage implements Packable{
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

   /**
    * 构造方法
    * @param width
    * @param height
    * @param length
    * @param size
    */
   public Storage(double width, double height, double length, Size size) {
      if(width<0 || height <0 || length<0){
         throw new IllegalArgumentException("容积不可为负数");
      }
      this.width = width;
      this.height = height;
      this.length = length;
      this.size = size;
      this.pageableList = new ArrayList<>();
   }
   public Storage(double width, double height, double length) {
      if(width<0 || height <0 || length<0){
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

   protected int  getMultiplier() {
      return 2;
   }
   /**
    * 装载
    * @param packable
    */
   public void pack(Packable packable){
      if(this instanceof Storage){
         Storage storage1 = (Storage)this;
         if(storage1.getWidth()<0){
            throw new IllegalArgumentException();
         }
         if(storage1.getHeight()<0){
            throw new IllegalArgumentException();
         }
         if(storage1.getLength()<0){
            throw new IllegalArgumentException();
         }
      }
      if(this instanceof Storage){
         Storage storage2 = (Storage)this;

         if(packable.width> storage2.getWidth()){
            throw new PackingException();
         }
         if(packable.height > storage2.getHeight()){
            throw new PackingException();
         }
         if(packable.length > storage2.getLength()){
            throw new PackingException();
         }
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

}