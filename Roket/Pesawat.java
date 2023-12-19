import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pesawat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pesawat extends Actor
{
    public int tahan=10;
    private int jeda=0;
    private int nyawa;
    
    public Pesawat(){
        GreenfootImage myImage = getImage();
        int newWidth = 70;
        int newHeight = 110;
        myImage.scale(newWidth, newHeight);
        setImage(myImage);
    }
    public void tombol(){
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY()-4);
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY()+4);
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-4, getY());
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+4, getY());
        }
        if (tahan==0){
            if(Greenfoot.isKeyDown("Space"))
            {
               getWorld().addObject(new Rudal(),getX(),getY());
               Greenfoot.playSound("bullet.wav");
            }
            tahan=10;
        }
    }
                
    public void act() 
    {
        tahan--;
        tombol();
        if(jeda>0)jeda--;
        if(jeda==1)
        if(jeda==0)jeda=20;
        //GreenfootImage image = getImage();
        //image.scale(image.getWidth() / 2, image.getHeight() / 2);
        //setImage(image);
    }
     
}
