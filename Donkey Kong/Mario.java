import greenfoot.*;
public class Mario extends Actor

{
    int speed;
    String Marioimage = "mariopixelCopy.png";
    long lastTime;
    int Lives = 3;
    public void act() 
    {
        speed = speed + 1;
        setLocation( getX(), getY() + speed);
        getWorld().showText("Lives : "+ Lives +"",1450, 50);
        if(isTouching(Barrel.class))
        {
            removeTouching(Barrel.class);
            Lives = Lives - 1;
        }
        if(Lives == 0)
        {
            getWorld().showText("GAME OVER", 750, 600);
            Greenfoot.stop();
        }
        if(speed > 0)
        {
            while(isTouching(Floor.class))
            {
                speed = 0;
                setLocation(getX(), getY() - 1);
                if(Greenfoot.isKeyDown("up"))
                {
                    speed = - 27;
                }
            }
        }
        if(speed <= 0)
        {
            while(isTouching(Floor.class))
            {
                speed = 0;
                setLocation(getX(), getY() + 1);
            }
        }    
        if(Greenfoot.isKeyDown("left"))
        {
            move(-5);
            /*if(System.currentTimeMillis() - lastTime > 500 && Marioimage.equals("mariopixelCopy.png"))
            {
                Marioimage = "marioleft.png";
                setImage("marioleft.png");
                lastTime = System.currentTimeMillis();
            } else {
                if(System.currentTimeMillis() - lastTime > 500)
                {
                    Marioimage = "mariopixelCopy.png";
                    setImage("mariopixelCopy.png");
                    lastTime = System.currentTimeMillis();
                }
            } */
            GreenfootImage img = new GreenfootImage("mariopixelCopy.png");
            img.scale(50,50);
            setImage(img);
            
            
            while(isTouching(Floor.class))
            {
               move(1);
            } 
        } else {
            if(Greenfoot.isKeyDown("right"))
            {
               move(5);
                GreenfootImage img = new GreenfootImage("mariopixel.png");
                img.scale(50,50);
                setImage(img);
               
               
                while(isTouching(Floor.class))
                {
                  move(-1);
               }
            } else{
            GreenfootImage image = new GreenfootImage("mario-big.png");
            image.scale(50,50);
            setImage(image);
                
            }
        }
        if(Greenfoot.isKeyDown("down"))
        {
            speed = 50;
        }
    } 
}
