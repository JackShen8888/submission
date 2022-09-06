package mms.exceptions;

public class PackingException extends RuntimeException {
    private static final long serialVersionUID = -7605578321320427694L;
    private String message;

    public PackingException(){
        super();
    }
    public PackingException(String message){
        super(message);
        this.message  = message;
    }
}