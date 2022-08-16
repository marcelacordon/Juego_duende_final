import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Duende here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Duende extends Actor
{
    //cambiarle el tamaño al duende 
    public Duende(){
        getImage().scale(getImage().getWidth()/30,getImage().getHeight()/30);
    }
    
    /**
     * Act - do whatever the Duende wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //propiedades del duende, las que permiten que se mueva y salte
    int vSpeed = 0;
    int accel = 0; 
    int speed = 5;
    
    //lo que realiza el duende 
    public void act()
    {
        jump();
        checkFalling();
        fall();
        moveAround();
        fireProyectil();
        // Add your action code here.
    }
    //se creo una instancia de la clase proyectil, para que el duende pueda interactuar con el 
    public void fireProyectil()
    {
        if(Greenfoot.mousePressed(null))
        {
            Proyectil proyectil = new Proyectil();
            getWorld().addObject(proyectil, getX(), getY());
            proyectil.turnTowards(Greenfoot.getMouseInfo().getX(), Greenfoot.getMouseInfo().getY());
        }
    }
    public void moveAround()
    {
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX() + speed, getY());
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX() - speed, getY());
        }
    }
    public void fall()
    {
        setLocation(getX(), getY() + vSpeed);
    }
    //se hizo una instacia de la clase piso, para que el duende pudiera mantenerse en la superficie del piso
    public void checkFalling()
    {
        if(!isTouching(Piso.class))
        {
            vSpeed++;
        }
        else if(isTouching(Piso.class))
        {
            setLocation(getX(), getY() - 1);
            vSpeed = 0;
        }
    }
    public void jump()
    {
        if(Greenfoot.isKeyDown("Space"))
        {
            vSpeed = -12;
        }
    }

}

