package com.cctc.amatlock.test.utilities;

import java.io.IOException;

public class ResourceLoader
{
    // Creates an instance of ImageLoader
    // This is used to load each image
    private static ImageLoader imageLoader = new ImageLoader();
    private static SoundLoader soundLoader = new SoundLoader();

    /**
     * This method will load and store every image
     * we plan to use in our program. This is the
     * only method we will change when we need to
     * add more images.
     */
    public static void loadImages()
    {
        // The try/catch is code to catch if
        // any image isn't found.
        try{
            Images.background = imageLoader.loadImage("background.png");
            Images.ship = imageLoader.loadImage("ship.png");
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public static void loadSounds()
    {
        // The try/catch is code to catch if
        // any image isn't found.
        try{
            Sounds.background = soundLoader.loadSound("background.wav");
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
