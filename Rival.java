import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rival here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rival extends Mover
{
      private final double gravity;
    private final double acc;
    private final double drag;
    private String teller;
    private int y = 1;
    /**
     * Act - do whatever the Rival wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
      public Rival() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p2.png");
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
