package mms.exceptions;

public class PackingOrderException extends Throwable{
    private static final long serialVersionUID = -928554553515127096L;
    private String message;
    PackingOrderException(){

    }
    PackingOrderException(String message){
        super(message);
        this.message  = message;
    }
}