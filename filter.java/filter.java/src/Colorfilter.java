import csteutils.*;
import csteutils.myro.*;
import java.awt.Color;
import java.util.Scanner;
import csteutils.myro.MyroColorImage;
import java.util.Random;



public class Colorfilter {
    public static void colorfil(MyroColorImage picture) {
        System.out.println("Hello, World!");
        picture.show();

        SimpleIO.showMessage("Tell me when you're ready!");
        int width = picture.getWidth();
        int height = picture.getHeight();
        Random random = new Random();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int randomRed = random.nextInt(256);   
                int randomGreen = random.nextInt(256);
                int randomBlue = random.nextInt(256);
                Color randomColor = new Color(randomRed, randomGreen, randomBlue);
                picture.setColor(x, y, randomColor);
            }

        }
        picture.show();
    }
}

