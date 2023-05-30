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
    public static GreenfootImage sprite = new GreenfootImage("images/apple.png");
    int speed = 2;
    public Apple(int speed) {
        this.speed = speed;
        setImage(sprite);
    }
    
    public Apple() {
        setImage(sprite);
    }
    
    public void act() 
    {   
        MyWorld world = (MyWorld) getWorld();
        setLocation(getX(), getY() + speed);
        if (getY() >= world.getHeight() - 1) {
            world.lose();
        }
        if (isTouching(Elephant.class)) {
            world.removeObject(this);
            world.createApple(speed);
            world.score += 1;
            world.showText("Score: " + String.valueOf(world.score), 100, 25);
        }
    }
    
    
}
