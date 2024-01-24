import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Level extends Actor
{
    int counter = 1; //inisiasi nilai awal level
    public Level()
    {
        setImage(new GreenfootImage("LEVEL " +counter,32,Color.RED,Color.BLACK));
    }
    public void act()
    {
        setImage(new GreenfootImage("LEVEL " +counter,32,Color.RED,Color.BLACK));
    }
    //method menambah nilai level
    public void addLevel()
    {
        counter++;
    }
}
