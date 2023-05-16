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
    int speed = 3;
    
    public void act() 
    {
        /*
        if (Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY() - speed);
        }
        if (Greenfoot.isKeyDown("a")) {
            setLocation(getX() - speed, getY());
        }
        if (Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY() + speed);
        }
        if (Greenfoot.isKeyDown("d")) {
            setLocation(getX() + speed, getY());
        }
        */
        MyWorld world = (MyWorld) getWorld();
        try{
            if (world.appleY() < getY()) {
                setLocation(getX(), getY() - speed);
            }
            if (world.appleX() < getX()) {
                setLocation(getX() - speed, getY());
            }
            if (world.appleY() > getY()) {
                setLocation(getX(), getY() + speed);
            }
            if (world.appleX() > getX()) {
                setLocation(getX() + speed, getY());
            }
        }
        catch(Exception e) {
            ;
        }
    }
    
    }   
