
import greenfoot.*;


/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;
    boolean isdown;
    boolean isFalling;
    

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
        respawn();
        OnGround();
        
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
            /* if(isTouching(Lava.class))
    {
        getWorld().removeObject(this);
    }*/
    }
    /*public void checkpoint()
    {
        boolean IsDown;
     if(isTouching(greenflag.class))
     {
         is
        }
    }*/
    public void respawn()
    {
        
        if( isTouching(Lava.class) && isdown == true )
        {
            
           setLocation(2754,1273);
           
        }
    }
    public boolean  OnGround()
    {
        Actor onder = getOneObjectAtOffset(0,getImage().getHeight()/2,Tile.class);
        return onder != null;
        
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
        if (Greenfoot.isKeyDown("up") && OnGround()) {
            velocityY = -13;
            setImage("p1_jump.png");
            isFalling = true;
        }
         else
        {
            setImage("p1_jump.png");
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
