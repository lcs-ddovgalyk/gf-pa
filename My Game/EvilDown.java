import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EvilDown here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EvilDown extends Actor
{
    
    private final int gravity = -1;
    //the speed the character moves at
    private int velocity;
    //this will act all the time
   
    public void act() 
    {
        
        
        fall();
        
        if(isAtEdge()){
           setLocation(700,700);
           
        }
    }    
    public void fall(){
        setLocation(getX()+ velocity,getY() );
        if(getX() > getWorld().getWidth() + 0) velocity = 0;
        else velocity = gravity; 
        
        
        
       
    }
    
    
}
