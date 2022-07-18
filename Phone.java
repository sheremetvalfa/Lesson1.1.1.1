public abstract class Phone  {
    private String name;
    private String model;

    public Phone(String name, String model) {
        this.name = name;
        this.model = model;
    }
    public void setName(String phoneName){
        name = phoneName;
    }
    public String getName(){
        return name;
    }
    public void setModel(String phoneModel){
        model = phoneModel;
    }
    public String getModel(){
        return model;
    }}
