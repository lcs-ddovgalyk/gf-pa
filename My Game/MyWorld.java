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
    private int time;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        addObject(new Good(), 50, 225);
        showText("Score: " + time, 50, 50);
    }
    public void act()
    { 
        getYY= getRandomNumber(1,500);
        
        if(getRandomNumber(1,100) == 1){
            
            addObject(new EvilDown(),getYY, 50);
            
        }
        if(getRandomNumber(1,100) == 2){
            addObject(new Evil(),500 , 240);

        }
        
    }
    public int getRandomNumber(int start,int end)
    { 
       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
    } 
}
