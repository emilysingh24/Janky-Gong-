import greenfoot.*;

/**
 * Write a description of class BackGround1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackGround1 extends World
{

    /**
     * Constructor for objects of class BackGround1.
     * 
     */
    public BackGround1()
    {    
        super(1350, 700, 1); 
        
        setBackground(new GreenfootImage("brick.jpg"));
    
        addObject(new DK(), 125, 85);
        addObject(new Floor(), 90, 119);
        addObject(new Floor(), 370, 119);
        addObject(new Floor(), 259, 119);
        addObject(new Floor(), 1239, 199);
        addObject(new Floor2(), 1071, 199);
        addObject(new Floor2(), 904, 199);
        addObject(new Floor2(), 1125, 500);
        addObject(new Floor2(), 1375, 500);
        addObject(new Floor(), 125, 781);
        addObject(new Floor(), 375, 781);
        addObject(new Floor(), 625, 781);
        addObject(new Floor(), 875, 781);
        addObject(new Floor2(), 125, 1000);
        addObject(new Floor2(), 375, 1000);
        addObject(new Floor2(), 625, 1000);
        addObject(new Floor2(), 875, 1000);
        addObject(new Floor2(), 1125, 1000);
        addObject(new Floor2(), 1375, 1000);
        addObject(new Mario(), 125, 540);
    }
}
