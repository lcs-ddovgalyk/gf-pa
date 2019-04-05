import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Good here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Good extends Actor
{
    private final int gravity = 1;
    private int velocity;
    
    public void act() 
    {
        checkKeyPress();
        fall();
        
    }    
    public Good(){
        velocity = 0;
    }
    private void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("right")) 
        {
            setLocation(getX()+4, getY());
        }
        
        if (Greenfoot.isKeyDown("left")) 
        {
            setLocation(getX()-4, getY());
        }
        if (Greenfoot.isKeyDown("space") && getY() > getWorld().getHeight() - 180){
            jump();
        }
        if(isTouching(Apple.class)){
            MyWorld world = (MyWorld)getWorld();
            world.score = world.score + 1;
            
            
            removeTouching(Apple.class);
            
            
        }

    }
    public void fall(){
        setLocation(getX(),getY() + velocity);
        if(getY() > getWorld().getHeight() - 180) velocity = 0;
        else velocity += gravity; 
        
    }
    public void jump(){
        velocity = -15;
    }
    
}
