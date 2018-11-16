
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;

    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p1.png");
    }

    @Override
    public void act() {
        handleInput();
        
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();

        for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {
                getWorld().removeObject(this);
                break;
            }
            
        }
             if(isTouching(Lava.class))
    {
        getWorld().removeObject(this);
    }
    }
    public void Remove()
    {
         if(isTouching(Lava.class))
    {
        getWorld().removeObject(this);
    }
    }
    public String Position()
    {
       String myPosition = "X" + getX() + " " + "Y" + getY();
       return myPosition;
    }
    public void handleInput() {
        if (Greenfoot.isKeyDown("up")) {
            velocityY = -10;
        }

        if (Greenfoot.isKeyDown("left")) {
            velocityX = -10;
        } else if (Greenfoot.isKeyDown("right")) {
            velocityX = 10;
        }
    }

    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }
}
