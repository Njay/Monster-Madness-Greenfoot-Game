import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class win extends World
{
    private Score score; //inisiasi variable score
    
    public win(Score s) /*parameter score yang dibawa dari world sebelumnya, 
                          agar nilainya sama dan dapat ditampilkan.*/
    {    
        super(920, 520, 1); 
        this.score = s; //memanggil score pada world sebelumnya
        addObject(score, 300, 300);
        Greenfoot.playSound("winner.mp3");
    }
}
