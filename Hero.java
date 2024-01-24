import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Hero extends Actor
{
    private int speed = 4; //satuan gerakan hero
    private final int GRAVITY = 1; // satuan gerakan vertikal hero
    private int velocity; // kecepatan hero
    
    boolean canFire; //cek penembakan
    
    public Hero()
    {
        velocity = 0;
    }

    public void act()
    {
        fall();
        move();
        fireProjectile();
        attacked();
    }
    
    // method untuk menggerakan hero
    public void move()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation (getX() - speed, getY());
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation (getX() + speed, getY());
        }
        if (Greenfoot.isKeyDown("up") && getY() > getWorld().getHeight() -100)
        {
            jump();
        }
    }
    
    //method hero jatuh
    public void fall()
    {
        setLocation (getX(), getY() + velocity);
        if (getY() > getWorld().getHeight() -100) velocity = 0;
        else velocity += GRAVITY;
    }
    
    //method hero lompat
    public void jump()
    {
        velocity = -12;
        fall();
    }
    
    //method tembak laser
    public void fireProjectile()
    {
        if(Greenfoot.isKeyDown("space") && canFire == true)
        {
            getWorld().addObject(new laser(), getX() +100 , getY()+20);
            canFire = false;
            Greenfoot.playSound("shoot.wav");
        }
        else if (!Greenfoot.isKeyDown("space"))
        {
            canFire = true;
        }
    }
    //method saat hero terkena monster
    public void attacked()
    {
       werewolf B = (werewolf)getOneIntersectingObject(werewolf.class);
       if(B!=null)
       {
            Greenfoot.setWorld(new lose());
       }
       dracula C = (dracula)getOneIntersectingObject(dracula.class);
       if(C!=null)
       {
            Greenfoot.setWorld(new lose());
       }
       skeleton D = (skeleton)getOneIntersectingObject(skeleton.class);
       if(D!=null)
       {
            Greenfoot.setWorld(new lose());
       }
       mummy E = (mummy)getOneIntersectingObject(mummy.class);
       if(E!=null)
       {
            Greenfoot.setWorld(new lose());
       }
    }
}
