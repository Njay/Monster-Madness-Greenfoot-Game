import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class laser extends Actor
{

    public void act()
    {
       setLocation (getX()+5, getY());
       if (getX()== 950)
       {
           getWorld().removeObject(this);
       }
    }
}
