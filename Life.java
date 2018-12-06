import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Life here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Life extends Mover
{
    /**
     * Act - do whatever the Life wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       Hero h = new Hero();
       switch(Hero.life)
       {
           
        
           case 3:
           setImage("hud_3.png");
           break;
            case 2:
            setImage("hud_2.png");
            break;
            case 1:
            setImage("hud_1.png");
            break;
           
            default:
            setImage("hud_0.png");
            break;
            
        }
    }    
}
