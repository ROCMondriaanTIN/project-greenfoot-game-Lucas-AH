import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class water here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class water extends Tile
{
       public water(String image, int width, int heigth) {
        super(image,width,heigth);
    /**
     * Act - do whatever the Lava wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
}
    public void act() 
    {
      if(isTouching(Hero.class))
      {
          removeTouching(Hero.class);
        }
    }    
}
