
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
       private GreenfootImage run1r = new GreenfootImage("p1_walk01.png");
    private GreenfootImage run2r = new GreenfootImage("p1_walk02.png");
    private GreenfootImage run3r = new GreenfootImage("p1_walk03.png");
    private GreenfootImage run4r = new GreenfootImage("p1_walk04.png");
    private GreenfootImage run5r = new GreenfootImage("p1_walk05.png");
    private GreenfootImage run6r = new GreenfootImage("p1_walk06.png");
    
    private GreenfootImage run1l = new GreenfootImage("p1_walk01.png");
    private GreenfootImage run2l = new GreenfootImage("p1_walk02.png");
    private GreenfootImage run3l = new GreenfootImage("p1_walk03.png");
    private GreenfootImage run4l = new GreenfootImage("p1_walk04.png");
    private GreenfootImage run5l = new GreenfootImage("p1_walk05.png");
    private GreenfootImage run6l = new GreenfootImage("p1_walk06.png");
    
    private int frame = 0;
    boolean facingRight = true;
   public int y;
  public int teller;
    private int animationCounter = 0;

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
    public void RightWalk()
    {
          
        if(animationCounter % 4 == 0)
        {
            rightWalkingAnimation();
        }
     
    }
    public void rightWalkingAnimation()
    {
        if(frame == 0)
        {
            setImage(run1r);
        }
        else if(frame == 1)
        {
            setImage(run2r);
        }
        else if(frame == 2)
        {
            setImage(run3r);
        }
        else if(frame == 3)
        {
            setImage(run4r);
        }
        else if(frame == 4)
        {
            setImage(run5r);
        }
        else if(frame == 5)
        {
            setImage(run6r);
            frame = 0;
        }
        frame++;
        return;
    }
    
    public void LeftWalk()
    {
          
        if(animationCounter % 4 == 0)
        {
           LeftAnimation();
        }
     
    }
   
    public void LeftAnimation()
    {
       
         if(frame == 0)
        {
            setImage(run1l);
             getImage().mirrorHorizontally();
             
        }
        else if(frame == 1)
        {
            setImage(run2l);
             getImage().mirrorHorizontally();
             
             
        }
        else if(frame == 2)
        {
            setImage(run3l);
            getImage().mirrorHorizontally();
            
             
        }
        else if(frame == 3)
        {
            setImage(run4l);
             //getImage().mirrorHorizontally();
             
        }
        else if(frame == 4)
        {
            setImage(run5l);
             //getImage().mirrorHorizontally();
             
        }
        else if(frame == 5)
        {
            setImage(run6l);
            // getImage().mirrorHorizontally();
              //setImage(run6l);
             
            frame = 0;
           
        }
        
        frame++;
        
        return;
    }
    public void respawn()
    {
        
        if(flag() )
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
    public boolean flag()
    {
        Actor onder = getOneObjectAtOffset(0,getImage().getHeight()/2,greenflag.class);
        return onder != null;
    }
    public String Position()
    {
       String myPosition = "X" + getX() + " " + "Y" + getY();
       return myPosition;
    }
    /*public void Walking()
    {
        
       
        
        
        String dir ="images/p1_walk/PNG/p1_walk";
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
    }*/
    
    public void handleInput() {
        if (Greenfoot.isKeyDown("up") && OnGround()) {
            velocityY = -13;
            RightWalk();
            
        }
        /* else
        {
            setImage("p1.png");
        }*/
      if(Greenfoot.isKeyDown("up"))
      {
          setImage("p1_jump.png");
        }
        if(OnGround())
        {
            setImage("p1_front.png");
        }

        if (Greenfoot.isKeyDown("left")) {
            velocityX = -10;
            getImage().mirrorHorizontally();
             //LeftWalk();
             //getImage().mirrorHorizontally();
            
            
        } else if (Greenfoot.isKeyDown("right")) {
            velocityX = 10;
            //setImage("p1_walk01.png");
            //setImage("p1_walk05.png");
            //setImage("p1_walk04.png");
            RightWalk();
        }
        /*if( Greenfoot.isKeyDown("left") == true )
       {
           getImage().mirrorHorizontally();
        }*/
        /* else
        {
            setImage("p1_front.png");
        }
        */
     
        
    }
    

    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }
}
