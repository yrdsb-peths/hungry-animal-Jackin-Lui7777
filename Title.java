import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title extends World
{

    /**
     * Constructor for objects of class Title.
     * 
     */
    public Title()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        showText("Press space to start!", getWidth()/2, getHeight()/2);
    }
    public void act() {
        if (Greenfoot.isKeyDown("space")) {
              Greenfoot.setWorld(new MyWorld());
        }
    }
}
