import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Actor
{
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = 2;
    public void act() 
    {   
        MyWorld world = (MyWorld) getWorld();
        setLocation(getX(), getY() + speed);
        if (isTouching(Elephant.class)) {
            world.removeObject(this);
            world.createApple();
            world.score += 1;
            world.showText("Score: " + String.valueOf(world.score), 100, 25);
        }
    }
    
    
}
