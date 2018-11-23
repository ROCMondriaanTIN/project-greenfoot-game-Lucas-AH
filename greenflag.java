import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class greenflag here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class greenflag extends Tile
{
    
    public greenflag(String image, int width, int heigth) {
        super(image,width,heigth);
    /**
     * Act - do whatever the greenflag wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */}
    public void act() 
    {
       if(isTouching(Hero.class))
       {
           setImage("flagGreenHanging.png");
           
        }
        
    }    
}
