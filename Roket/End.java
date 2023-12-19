import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class End here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class End extends Menu
{

    /**
     * Constructor for objects of class End.
     * 
     */
    public End()
    {
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        TombolMulai tombolMulai = new TombolMulai();
        addObject(tombolMulai,147,483);
        Ulang ulang = new Ulang();
        addObject(ulang,373,480);

        removeObject(tombolMulai);

        KembaliMenu kembaliMenu = new KembaliMenu();
        addObject(kembaliMenu,159,476);
    }
}
