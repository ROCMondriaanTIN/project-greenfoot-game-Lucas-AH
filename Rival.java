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
    /**
     * Act - do whatever the Rival wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Rival()
    {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("hud_p2.png");
    }

    public void act() 
    {

        velocityX *= drag;
        velocityY += acc;

        if (velocityY > gravity) {
            velocityY = gravity;
        }  
        applyVelocity();
        velocityX = 10;

    }    

    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }
}
