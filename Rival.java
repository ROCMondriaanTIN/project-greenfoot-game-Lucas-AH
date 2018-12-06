import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rival here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rival extends Mover
{
      
    /**
     * Act - do whatever the Rival wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
      
    public void act() 
    {
       setImage("hud_p2.png");
       
    }    
    
    public void Move()
    {
        velocityX = 10;
        
    }
}
