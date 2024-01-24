import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Cave extends World
{
    private Score score; //inisiasi score di world cave
    private Hero hero; //inisiasi hero
    private Level level; //inisiasi status level saat ini
    
    boolean bossLevel = false; //inisiasi akan munculnya boss monster pada level ini

    public Cave()
    {    
        super(1000, 400, 1);
        prepare();
        
    }
    public void act ()
    {
        Boss1();
        Enemy1();
        nextLevel();
    }
    //method menampilkan nilai score
    public Score getScore()
    {
        return score;
    }
    //method menampilkan status level
    public Level getLevel()
    {
        return level;
    }
    //method memanggil hero dan score
    public void prepare()
    {
        hero = new Hero();
        addObject(hero,100, 300);
        score = new Score();
        addObject(score, 80, 30);
        level = new Level();
        addObject(level, 920, 30);
             
    }
    //method memanggil monster di level 1
    public void Enemy1()
    {
        if(Greenfoot.getRandomNumber (50)<1)
        {
            addObject(new werewolf(), 950 , 320);
        }
    }
    //method memunculkan boss level 1
    public void Boss1()
    {
        if(score.counter == 10 || score.counter == 11)
        {
            if(bossLevel == false)
            {
                addObject(new dracula(), 950 , 320);
                bossLevel = true;
            }
            
        }
    }
    //method untuk beralih ke level selanjutnya
    public void nextLevel()
    {
        if(score.counter >=11 && getObjects(dracula.class).size() == 0)
        {
            level.addLevel();
            Greenfoot.setWorld(new graveyard( hero, score, level)); /**parameter hero, score, dan level
                                                                    agar dapat dipanggil di world yang lain
                                                                    dengan nilai yang sama**/
        }
    }
}
