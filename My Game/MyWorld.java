import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int getYY;
    public int score;
    private int time = 6000;
    
    

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        addObject(new StickMan(), 50, 248);

    }
    public void act()
    { 
        getYY= getRandomNumber(1,500);
        
        if ((time % 60) == 0)
        {
            if(getRandomNumber(1,3) == 2){
                
            addObject(new EvilDown(), 500, 250);
        }
        }
        if(getRandomNumber(1,100) == 2){
            addObject(new Apple(),500 , 250);

        }
        showText("Score: " + score, 50, 50);
        if(score < 0){
            Greenfoot.stop();
            showText("Game Over", 325, 225);
            showText("Final Score" + score, 325,200);
            Greenfoot.playSound("gameover.mp3");

            
        }
        showText("Time Left:" + time, 545, 50);
        time = time - 1;
        if(time <= 0){
            Greenfoot.stop();
            Greenfoot.playSound("gameover.mp3");

        }

    }
    public int getRandomNumber(int start,int end)
    { 
       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
    } 
}
