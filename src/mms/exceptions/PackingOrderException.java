package mms.exceptions;

public class PackingOrderException extends PackingException{
    private static final long serialVersionUID = -928554553515127096L;
    private String message;
    public PackingOrderException(){
        super();
    }
    public PackingOrderException(String message){
        super(message);
        this.message  = message;
    }
}