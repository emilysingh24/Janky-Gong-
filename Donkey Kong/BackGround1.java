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
        
        setBackground(new GreenfootImage("board.jpg"));
        addObject(new DK(), 125, 85);
        
        Floors(60,119);
        Floors(178,119);
        
        addObject(new Floor2(), 1070, 199);
        addObject(new Floor2(), 904, 199);
        addObject(new Floor2(), 80,  323);
        addObject(new Floor2(), 249, 323);
        addObject(new Floor(), 390, 323);
        addObject(new Floor(), 908, 367);
        addObject(new Floor(), 1077, 367);
        addObject(new Floor(), 1247, 367);
        addObject(new Floor2(), 258, 492);
        addObject(new Floor2(), 90, 492);
        addObject(new Floor2(), 398, 492);
        addObject(new Floor2(), 916, 569);
        addObject(new Floor2(), 1255, 569);
        addObject(new Floor2(), 1087, 569);
        addObject(new Mario(), 125, 540);
    }
            public void Floors(int floorX, int floorY){
        addObject(new Floor(), floorX, floorY);
        addObject(new Floor(), floorX + 118, floorY);
        addObject(new Floor(), floorX + 236, floorY);
        addObject(new Floor(), floorX + 356, floorY);
        addObject(new Floor(), floorX + 474, floorY);
        addObject(new Floor(), floorX + 572, floorY);
        addObject(new Floor(), floorX + 691, floorY);
        addObject(new Floor(), floorX + 810, floorY);
        addObject(new Floor(), floorX + 928, floorY);
    }
}
