package mms.exceptions;

public class StorageFullException extends Throwable{
    private static final long serialVersionUID = -6321456652552093227L;
    private String message;
    StorageFullException(){

    }
    StorageFullException(String message){
        super(message);
        this.message  = message;
    }
}