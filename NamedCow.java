public class NamedCow extends Cow implements Named
{
    //feilds
    private String name;
    
    //constructor
    public NamedCow(String name){
        super();
        this.name = name;
    }
    
    public String getName() {return name;}
    
    public String toString(){
        return "The " + getName() + " goes " + this.getSound();
    }
}
