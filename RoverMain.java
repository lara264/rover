
/**
 * Write a description of class RoverMain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RoverMain
{
    public static void main(String[] args)
    {
        RoverInformation r1 = new RoverInformation("Curiosity");
        
        System.out.println(r1);
        
        r1.move(1);
        r1.move(3);
        r1.move(-5);
        r1.move(7);
    }    
    
    
}
