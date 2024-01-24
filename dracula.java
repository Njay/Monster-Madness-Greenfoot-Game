import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class dracula extends Actor
{
    
    int timesHit = 10; //jumlah tembakan yang diperlukan
    public dracula()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() / 2, image.getHeight() -100);
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
        setLocation(getX()-2, getY());
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
           timesHit--;
       }
       if (timesHit == 0)
       {
           getWorld().removeObject(this);
       }
    }
}
