import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class mummy extends Actor
{
    
    int timesHit = 20; //jumlah tembakan yang diperlukan
    public mummy()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth(), image.getHeight() -50);
        setImage(image);
    }
    public void act()
    {
       move();
       getHit();
    }
    //method gerakan
    public void move()
    {
        setLocation(getX()-1, getY());
    }
    //method ketika terkena laser
    public void getHit()
    {
       laser A = (laser)getOneIntersectingObject(laser.class);
       if(A!=null)
       {
           getWorld().removeObject(A);
           World world = getWorld();
           graveyard myWorld = (graveyard)world;
           Score score = myWorld.getScore();
           score.addScore();
           timesHit--;
       }
       if (timesHit == 0)
       {
           getWorld().removeObject(this);
       }
    }
}
