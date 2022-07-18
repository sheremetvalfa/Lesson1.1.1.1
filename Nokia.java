public class Nokia extends Phone implements PhoneConnection {
    public Nokia(String name,String model){
        super(name,model);
    }
    public void call(){
        System.out.println("I'm calling from "+getName() +" ,model "+getModel());
    }
    public void sendSMS(){
        System.out.println("I'm send message from "+getName()+" ,model "+getModel());
    }

}
