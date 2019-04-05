import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EvilDown here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EvilDown extends Actor
{
    private final int gravity = 1;
    private int velocity;
    public void act() 
    {
        setRotation(-90);
        fall();
        if(isTouching(Good.class)){
            Greenfoot.stop();
            
        }
    }    
    public void fall(){
        setLocation(getX(),getY() + velocity);
        if(getY() > getWorld().getHeight() - 0) velocity = 0;
        else velocity += gravity; 
        
        
        
        
    }
    
}
