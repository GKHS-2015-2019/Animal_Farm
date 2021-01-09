public abstract class Animal {
    //fields
    private String type;
    private String sound;
    
    //constructor
    public Animal(String type, String sound){
        this.type = type;
        this.sound = sound;
    }
    
    //methods
    public String getType() {return type;}
    public String getSound() {return sound;}
    
    abstract String speak();
    
    public String toString(){
        return "The " + type + " goes " + speak();
    }
}
