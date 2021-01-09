public class Cow extends Animal {
    //methods
    public Cow(){
        super("Cow", "Moo");
    }
    
    public String speak(){
        return this.getSound();
    }
}
