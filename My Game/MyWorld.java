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
    //this tracks the score of the character
    public int score;
    //this is the time that the game will run for
    
    private int time = 6000;
    // in order for the player to understand the time better it will be 
    //devided by a 100 which would make it in to seconds
    private int timeleft;
    
    

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        //creates the StickMan
        addObject(new StickMan(), 50, 248);

    }
    public void act()
    { 
        //this gets a random number from 1 to 500
        getYY= getRandomNumber(1,500);
        //shows how much time is left 
        timeleft = time/100;
        //every 140 frames this program will run
        if ((time % 140) == 0)
        {
        //if this equals to 2 an EvilDown class will be created
            if(getRandomNumber(1,3) == 2){
            
            
            addObject(new EvilDown(), 590, 250);
                       
        }
        //if this equals to 1 an Apple class will be created 
        if(getRandomNumber(1,3) == 1){
            addObject(new Apple(),600 , 250);

        }
        
        }
        //This shows your overall score on the screen
        showText("Score: " + score, 50, 50);
        //if your score is less than 0 the game will stop
        if(score < 0){
            Greenfoot.stop();
            showText("Game Over", 325, 225);
            showText("Final Score" + score, 325,200);
            Greenfoot.playSound("gameover.mp3");

            
        }
        //This shows how much time you have left on the screen
        showText("Time Left:" + timeleft, 500, 50);
        //every frame the time you have left get less by a frame
        time = time - 1;
        //if your time is less than 0 the game will stop
        if(time <= 0){
            Greenfoot.stop();
            Greenfoot.playSound("gameover.mp3");

        }

    }
    //this creates the getrandomnumber 
    public int getRandomNumber(int start,int end)
    { 
       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
    } 
}