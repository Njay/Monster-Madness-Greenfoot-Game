import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Score extends Actor
{
    int counter = 0; //inisiasi nilai awal score
    
    public Score()
    {
        setImage(new GreenfootImage("SCORE : " +counter,25,Color.YELLOW,Color.BLACK));
    }
    public void act()
    {
        setImage(new GreenfootImage("SCORE : " +counter,25,Color.YELLOW,Color.BLACK));
    }
    //method menambah nilai score
    public void addScore()
    {
        counter++;
    }
}
