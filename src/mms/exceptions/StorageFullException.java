package mms.exceptions;

public class StorageFullException extends RuntimeException{
    private static final long serialVersionUID = -6321456652552093227L;
    private String message;
    public StorageFullException(){
        super();
    }
    public StorageFullException(String message){
        super(message);
        this.message  = message;
    }
}