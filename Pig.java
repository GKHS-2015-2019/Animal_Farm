public class Pig extends Animal
{
   //feilds
   private boolean isBig;
   //constructor
   public Pig(boolean isBig){
       super("Pig", "Oink");
       this.isBig = isBig;
   }
   //methods
   public String speak(){
       String sound = this.getSound();
       if(isBig){ 
            sound = sound.toUpperCase();
            sound = sound + " " + sound  + " " + sound;
        }
        return sound;
    }
   
}
