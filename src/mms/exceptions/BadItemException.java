package mms.exceptions;

public class BadItemException extends RuntimeException{
    private static final long serialVersionUID = -8770584266172243189L;
    private String message;

    public BadItemException(){
        super();
    }
    public BadItemException(String message){
        super(message);
        this.message  = message;
    }
}