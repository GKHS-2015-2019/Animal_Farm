public class Horse extends Animal implements Named, Ridable {
    //feilds
    private String name;
    private String rider;
    
    //constructor
    public Horse(String name){
        super("Horse", "Neah");
        this.name = name;
        this.rider = "";
    }
    
    //methods
    public String speak(){
        return this.getSound();
    }
    
    public String getName(){
        return name;
    }
    
    public String toString(){
        String res = "The " + getName() + " goes " + this.getSound();
        if(rider.isEmpty()){
            return res;
        } else {
            return res + "\n The " + rider + " goes Howdy folks";
        }
    }
    
    public void mount(String rider){
        this.rider = rider;
    }
}
