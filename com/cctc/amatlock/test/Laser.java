package com.cctc.amatlock.test;

import java.awt.*;

public class Laser extends CoreObject
{
    public boolean ally;
    /**
     * Creates the core object. All subclasses
     * will call this with super.
     * The super call to the Rectangle class.
     *
     * @param x
     * @param y
     * @param width
     * @param height
     * @param color
     */
    public Laser(int x, int y, int width, int height, Color color)
    {
        super(x, y, width, height, color);
    }

    @Override
    public void tick()
    {
        CoreObject[] coreObjects = Screen.getCoreObjects();
        SpaceShip ship = Screen.getInstance().ship;

        for(int i = 0; i < Screen.getObjectCounter(); i++)
        {
            CoreObject  object = coreObjects[i];
            if( intersects(object) && !object.destroyed)
            {
                object.destroy();
                ship.score += 5;
                System.out.println("score: " + ship.score);
            }
        }

        x+= velX;
        y+= velY;
    }

    @Override
    public void render(Graphics g)
    {
        g.setColor(color);
        g.fillRect(x,y,width,height);
    }
}
