public class Samsung extends Phone implements PhoneConnection,PhoneMedia {
    private int ram;
    private double memory;
    public Samsung(String name,int ram,double memory,String model){
        super(name,model);
        this.ram = ram;
        this.memory = memory;
    }
    public void setRam(int phoneRam){
        ram = phoneRam;
    }
    int getRam(){
        return ram;
    }
    public void setMemory(double phoneMemory){
        memory = phoneMemory;
    }
    double getMemory(){
        return memory;
    }
    public void makePhoto(){
        System.out.println(getName()+", "+getModel()+" can make a photo, because he has a "+ getMemory()+ " GIG memory" );
    }
    public void recordVideo() {
        System.out.println(getName()+", "+getModel()+" can record a video, because he has a "+ getMemory()+ " GIG memory and "+getRam() +" GIG RAM");
    }
    public void call(){
        System.out.println("I'm calling from "+getName() );
    }
    public void sendSMS(){
        System.out.println("I'm send message from "+getName() );
    }


}
