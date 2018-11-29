
import greenfoot.*;


/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;
    
      
    private String teller;
    private int y = 1;
  private int SupTeller;
    
    
  private int frame1 = 0;
    private int animationCounter = 0;
    public static  int checkPointX = 1109;
    public static int checkPointY = 1333;
   
    

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
        
        //RightWalk();
        
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
        if(isTouching(goldCoin.class))
        {
            SupTeller = 1;
            
        }
        if(SupTeller >= 1 && Greenfoot.isKeyDown("up") && Greenfoot.isKeyDown("right"))
        {
            SupTeller ++;
            velocityY = -20;
        }
           
            if(Greenfoot.isKeyDown("up") && Greenfoot.isKeyDown("right")&& OnGround())
            {
                velocityY = -20;
            }
        
        
        if(SupTeller == 10 )
        {
           
            velocityY = -13;
        }
       
    }
    
    
    public void Animation()
    {
         String dir ="p1_walk";
       if (y != 12)
        {
            teller = Integer.toString(y);
            y ++;
        }
        else if(y == 12)
        {
            y = 1;
        }
        setImage(dir+teller+".png" );
        
    }
   
  
    public void respawn()
    {
       
        
        if(isTouching(Lava.class) )
        {
            
            checkPointX = 2762;
            checkPointY = 1275;
           setLocation(checkPointX,checkPointY);
           
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
           
            
        }
       
      if(Greenfoot.isKeyDown("up"))
      {
          setImage("p1_jump.png");
        }
        if(Greenfoot.isKeyDown("right") && OnGround() == false)
      {
          setImage("p1_jump.png");
        }
        if(OnGround())
        {
            setImage("p1_front.png");
        }

        if (Greenfoot.isKeyDown("left")) {
            velocityX = -10;
            Animation();
            getImage().mirrorHorizontally();
            
            
        } else if (Greenfoot.isKeyDown("right") ) {
            velocityX = 10;
            Animation();
        }
        if(Greenfoot.isKeyDown("up") && Greenfoot.isKeyDown("right"))
        {
           setImage("p1_jump.png");
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
