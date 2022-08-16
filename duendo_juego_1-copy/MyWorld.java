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
    public MyWorld()
    {    
        // se cambio el tamaño y color de mundo para adaptarlo al juego
        super(1250, 700, 1, false); 
        getBackground().setColor(new Color(135, 206, 235));
        getBackground().fill();
        addObject(new Duende(), 40, 620);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        // todo los objetos en el juego y sus coordenadas 
        Tall tall = new Tall(150, 50);
        addObject(tall,70,678);

        Tall tall2 = new Tall(150, 50);
        addObject(tall2,287,579);
        tall2.setLocation(205,587);
        Tall tall3 = new Tall(100, 50);
        addObject(tall3,331,483);
        tall3.setLocation(337,456);
        Enemy enemy = new Enemy();
        addObject(enemy,371,410);
        Enemy enemy2 = new Enemy();
        addObject(enemy2,271,536);
        Piso piso = new Piso();
        addObject(piso,693,658);
        piso.setLocation(689,661);
        Enemy enemy3 = new Enemy();
        addObject(enemy3,564,611);
        Enemy enemy4 = new Enemy();
        addObject(enemy4,570,564);
        Enemy enemy5 = new Enemy();
        addObject(enemy5,570,516);
        enemy5.setLocation(570,520);
        Enemy enemy6 = new Enemy();
        addObject(enemy6,890,608);
        Enemy enemy7 = new Enemy();
        addObject(enemy7,895,567);
        Enemy enemy8 = new Enemy();
        addObject(enemy8,895,527);
        piso.setLocation(737,652);
        piso.setLocation(863,643);
        piso.setLocation(715,661);
        removeObject(piso);
        Tall tall4 = new Tall(300, 50);
        addObject(tall4,745,647);
        tall4.setLocation(519,697);
        tall4.setLocation(591,662);
        enemy3.setLocation(484,628);
        enemy4.setLocation(474,577);
        enemy5.setLocation(479,517);
        tall4.setLocation(676,667);
        enemy6.setLocation(894,601);
        removeObject(enemy6);
        removeObject(enemy7);
        enemy8.setLocation(890,526);
        removeObject(enemy8);
        tall4.setLocation(509,677);
        Oro oro = new Oro();
        addObject(oro,556,391);
        oro.setLocation(378,638);
        oro.setLocation(388,627);
        Tall tall5 = new Tall(150, 50);
        addObject(tall5,462,146);
        tall5.setLocation(472,290);
        Wide wide = new Wide();
        addObject(wide,876,143);
        wide.setLocation(836,122);
        wide.setLocation(1025,116);
        wide.setLocation(1144,117);
        wide.setLocation(1148,125);
        Oro oro2 = new Oro();
        addObject(oro2,1135,12);
        oro2.setLocation(1220,45);
        oro2.setLocation(1222,60);
        Enemy enemy9 = new Enemy();
        addObject(enemy9,872,54);
        Enemy enemy10 = new Enemy();
        addObject(enemy10,1032,50);
        Enemy enemy11 = new Enemy();
        addObject(enemy11,1167,49);
        enemy11.setLocation(1148,49);
        enemy10.setLocation(1033,40);
        Tall tall6 = new Tall(150, 50);
        addObject(tall6,1135,663);
        tall6.setLocation(1183,679);
        Oro oro3 = new Oro();
        addObject(oro3,1094,557);
        oro3.setLocation(1207,639);
        Tall tall7 = new Tall(100, 50);
        addObject(tall7,738,478);
        tall7.setLocation(716,531);
        tall7.setLocation(713,497);
        tall7.setLocation(671,497);
        tall7.setLocation(663,450);
        tall7.setLocation(662,431);
        Enemy enemy12 = new Enemy();
        addObject(enemy12,726,384);
        enemy12.setLocation(719,389);
        enemy12.setLocation(712,281);
        tall7.setLocation(694,341);
        tall7.setLocation(671,139);
        tall7.setLocation(649,151);
        enemy12.setLocation(688,152);
        tall7.setLocation(1030,227);
        Tall tall8 = new Tall(50, 50);
        addObject(tall8,740,389);
        tall8.setLocation(736,336);
        Tall tall9 = new Tall(50, 50);
        addObject(tall9,862,457);
        tall9.setLocation(851,415);
        tall9.setLocation(1064,554);
        tall9.setLocation(1047,546);
        Tall tall10 = new Tall(250,50);
        Tall tall12 = new Tall(150, 50);
        tall9.setLocation(1061,561);
        tall8.setLocation(679,353);
        tall7.setLocation(576,158);
        tall8.setLocation(720,128);
        tall8.setLocation(739,150);
        enemy12.setLocation(735,104);
        Tall tall18 = new Tall(250, 50);
        addObject(tall10,823,473);
        tall18.setLocation(843,471);
        Enemy enemy13 = new Enemy();
        addObject(enemy13,927,418);
    }
}
