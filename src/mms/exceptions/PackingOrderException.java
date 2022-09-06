package mms.exceptions;

public class PackingOrderException extends RuntimeException{
    private static final long serialVersionUID = -928554553515127096L;
    private String message;
    PackingOrderException(){
        super();
    }
    PackingOrderException(String message){
        super(message);
        this.message  = message;
    }
}