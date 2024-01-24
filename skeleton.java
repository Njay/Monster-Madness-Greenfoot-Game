import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class skeleton extends Actor
{
    public skeleton()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()-50, image.getHeight()-50);
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
        setLocation(getX()-4, getY());
    }
    
    //function ketika terkena laser
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
           getWorld().removeObject(this);
       }
    }

}
