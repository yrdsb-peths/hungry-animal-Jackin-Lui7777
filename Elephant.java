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
    int speed = 8;
    boolean teleport = false;
    GreenfootSound sound = new GreenfootSound("sounds/elephantcub.mp3");
    public boolean facingRight = true;
    public GreenfootImage[] sprites = new GreenfootImage[8];
    public int spriteIndex = 0;
    public int spriteTimer = 0;
    public int maxSpriteTimer = 15;
    
    public Elephant(){
        for(int i = 0; i < 8; i++) {
            sprites[i] = new GreenfootImage("images/elephant_idle/idle" + Integer.toString(i) + ".png");
        }
        changeSprite();
    }
    
    public void switchSprite() {
        setImage(sprites[spriteIndex]);
        spriteIndex += 1;
        if (spriteIndex >= sprites.length) {
            spriteIndex = 0;
        }
    }
    
    public void changeSprite() {
        spriteTimer += 1;
        if (spriteTimer > maxSpriteTimer) {
            spriteTimer = 0;
            switchSprite();
        }
    }
    
    public void act() 
    {
        changeSprite();
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
