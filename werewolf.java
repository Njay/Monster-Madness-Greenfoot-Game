import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class werewolf extends Actor
{

    public void act()
    {
       move();
       getHit();
    }
    //method gerakan
    public void move()
    {
        setLocation(getX()-5, getY());
    }
    //method ketika terkena laser
    public void getHit()
    {
       laser A = (laser)getOneIntersectingObject(laser.class);
       if(A!=null)
       {
           getWorld().removeObject(A);
           World world = getWorld();
           Cave myWorld = (Cave)world;
           Score score = myWorld.getScore();
           score.addScore();
           getWorld().removeObject(this);
       }
    }

}
