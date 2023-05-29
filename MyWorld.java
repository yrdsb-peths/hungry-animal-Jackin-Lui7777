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
    public int score = 0;
    public Apple apple = new Apple();
    public boolean gameOver = false;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        addObject(new Elephant(), 0, 0);
        addObject(apple, Greenfoot.getRandomNumber(getWidth()), 0);
        showText("Score: " + String.valueOf(score), 100, 25);
    }
    
    public void createApple(int speed) {
        if (!gameOver) {
            Apple a = new Apple(speed);
            addObject(a, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()/2));
            this.apple = a;
        }
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
    
    public void lose() {
        GameOver gameOver = new GameOver();
        Greenfoot.setWorld(gameOver);
        gameOver.showText("Game Over!", getWidth()/2, getHeight()/2);
        gameOver.showText("Press space to return to menu!", getWidth()/2, getHeight()/2 + 50);
        gameOver.showText("Score: " + String.valueOf(score), 100, 25);
    }
    
}
