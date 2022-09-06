package mms.exceptions;

public class PackingException extends Throwable {
    private static final long serialVersionUID = -7605578321320427694L;
    private String message;

    PackingException(){

    }
    PackingException(String message){
        super(message);
        this.message  = message;
    }
}