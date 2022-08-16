import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    /// propiedades del proyectil 
    
    int speed = -3; 
    int contador = 0; 
    int health = 3;
    boolean hitByProyectil = false;
    
    public Enemy()
    {
        //se hizo mas por estetica, para que estuviera viendo al personaje 
        getImage().mirrorHorizontally();
    }
    
    public void act()
    {
        contador++;
        moveAroundE();
        hitByProyectil();
        
        // Add your action code here.
    }
    
    public void moveAroundE()
    {
        //para que los enemigos esten en constante movimiento y agregarle un nivel de dificultad 
        if (contador < 60)
        setLocation(getX() + speed, getY());
        else
        {
        speed = -speed;
        getImage().mirrorHorizontally();
        contador = 0;
        }
    }
    public void hitByProyectil()
    {
        //se tuvo que crear una interseccion entre dos clases para que funcionara eliminar los enemigos
        Actor proyectil = getOneIntersectingObject(Proyectil.class);
        if (proyectil != null && !hitByProyectil)
        {
            health--;
            hitByProyectil = true; 
            getWorld().removeObject(proyectil);
        }
        else if (!isTouching(Proyectil.class))
        {
            hitByProyectil = false; 
        }
        if (health <= 0) 
        getWorld().removeObject(this);
        
    }
}
