package Lab1;

public class Caller {

    int pNum;
    String name, message;
    boolean isOnHold ;

    Caller(int pNum){
        this.pNum=pNum;
        this.isOnHold = true;
    }

    Caller(int pNum, String name, String message){
        this.pNum=pNum;
        this.name=name;
        this.message=message;
        this.isOnHold=false;
    }

    @Override
    public String toString(){
        return ("Caller Name: "+name+"\nCaller Number: "+pNum+"\nCaller Message: "+message);
    }

}
