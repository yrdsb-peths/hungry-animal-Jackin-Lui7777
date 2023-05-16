import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public Apple apple = new Apple();
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        addObject(new Elephant(), 0, 0);
        addObject(apple, Greenfoot.getRandomNumber(getWidth()), 0);
    }
    
    public void createApple() {
        Apple a = new Apple();
        addObject(a, Greenfoot.getRandomNumber(getWidth()), 0);
        this.apple = a;
    }
    
    public Apple getApple() {
        return apple;
    }
    
    public int appleX() {
        try {
            return apple.getX();
        }
        catch(Exception e) {
            return 0;
        }
    }
    public int appleY() {
        try {
            return apple.getY();
        }
        catch(Exception e) {
            return 0;
        }
    }
}
