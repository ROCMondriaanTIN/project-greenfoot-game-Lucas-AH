import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class door extends Tile
{
    public door(String image, int width, int heigth) {
        super(image,width,heigth);
    /**
     * Act - do whatever the door wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */}
    public void act() 
    {
        
        if(isTouching(Hero.class))
    {
        setImage("door_openMid.png");
    }
    else
    {
        setImage("door_closedMid.png");
    }
    for(Actor hero : getIntersectingObjects(Hero.class))
    {
    if(hero != null  && getWorld()instanceof TheWorld && (Greenfoot.isKeyDown("right")))
    {
       
        TheWorld2 W2 = new TheWorld2();
        Greenfoot.setWorld(W2);
        break;
    }
}
}
    
}

