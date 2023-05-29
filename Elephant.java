import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elephant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Elephant extends Actor
{
    /**
     * Act - do whatever the Elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = 1;
    boolean teleport = false;
    GreenfootSound sound = new GreenfootSound("C:/Users/348691063/Hungry-Animal/sounds/elephantcub.mp3");
    public boolean facingRight = true;  
    public void act() 
    {
        MyWorld world = (MyWorld) getWorld(); 
        try{
            if (world.appleY() < getY()) {
                setLocation(getX(), getY() - speed);
            }
            if (world.appleX() < getX()) {
                setLocation(getX() - speed, getY());
                if (facingRight) {
                    getImage().mirrorHorizontally();
                    facingRight = false;
                }
            }
            if (world.appleY() > getY()) {
                setLocation(getX(), getY() + speed);
            }
            if (world.appleX() > getX()) {
                setLocation(getX() + speed, getY());
                if (!facingRight) {
                    getImage().mirrorHorizontally();
                    facingRight = true;
                }
            }
        }
        catch(Exception e) {
            ;
        }
        if (isTouching(Apple.class)) {
            sound.play();
        }
    }
    
}   
