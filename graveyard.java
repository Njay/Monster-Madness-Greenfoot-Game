import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class graveyard extends World
{

    private Hero hero; //inisiasi hero
    private Score score; //inisiasi score
    private Level level;
    
    boolean bossLevel = false; //inisiasi bossLevel
    
    public graveyard(Hero h, Score s, Level l) //memanggil hero dan score di level sebelumnya
    {    
        super(1000, 400, 1); 
        this.hero = h; //memanggil hero yang sama dengan world sebelumnya
        this.score = s; //memanggil score yang sama dengan world sebelumnya
        this.level = l; //memanggil status level
        prepare();
    }
    //method untuk menambah nilai score
    public Score getScore()
    {
        return score;
    }
    
    public void act()
    {
        Enemy2();
        Boss2();
        nextLevel();
    }
    
    public void prepare()
    {
        addObject(hero,100, 300);
        addObject(score, 80, 30);    
        addObject(level, 920, 30);
    }
    //method memanggil monster di level 2
    public void Enemy2()
    {
        if(Greenfoot.getRandomNumber (30)<1)
        {
            addObject(new skeleton(), 950 , 320);
        }
    }
    //method memunculkan boss level 2
    public void Boss2()
    {
        if(score.counter == 40 || score.counter == 41)
        {
            if(bossLevel == false)
            {
                addObject(new mummy(), 950 , 320);
                bossLevel = true;
            }
            
        }
    }
    
    public void nextLevel()
    {
        if(score.counter >60 && getObjects(mummy.class).size() == 0)
        {
            Greenfoot.setWorld(new win(score)); /**parameter score, agar dapat dipanggil pada
                                                    world sebelumnya dengan nilai yang sama**/
        }
    }
}
