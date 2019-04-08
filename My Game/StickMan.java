import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Good here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StickMan extends Actor
{
    //this is the gravity of the character, the velocity will increase by this much
    
    private final int gravity = 1;
    //the speed at which the character will fall
    private int velocity;
    
    public void act() 
    {
        //runs forever and checks what keys are pressed
        checkKeyPress();
        fall();
        
    }    
    public StickMan(){
        //original velocity
        velocity = 0;
    }
    private void checkKeyPress()
    {
        //if you click the right key the character will move right
        if (Greenfoot.isKeyDown("right")) 
        {
            setLocation(getX()+4, getY());
        }
        //if you press the left key the character will move left
        if (Greenfoot.isKeyDown("left")) 
        {
            setLocation(getX()-4, getY());
        }
        //if you press space the character will jump and then fall down
        //to its original spot
        if (Greenfoot.isKeyDown("space") && getY() > getWorld().getHeight() - 160){
            jump();
        }
        //When the character touches the apple it will gain one point
        // and the apple class will dissapear
        if(isTouching(Apple.class)){
            MyWorld world = (MyWorld)getWorld();
            world.score = world.score + 1;
            removeTouching(Apple.class);
            
            
        }
        //When the character touches the EvilDown class
        //10 points will be removed and the EvilDown class will dissapear
        if(isTouching(EvilDown.class)){
            MyWorld world = (MyWorld)getWorld();
            world.score = world.score - 10;
            removeTouching(EvilDown.class);
            
        }

    }
    //this is hwat makes the StickMan fall after it jumps
    public void fall(){
        setLocation(getX(),getY() + velocity);
        if(getY() > getWorld().getHeight() - 160) velocity = 0;
        else velocity += gravity; 
        
    }
    public void jump(){
        velocity = -15;
    }
    
}