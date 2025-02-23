import csteutils.*;
import csteutils.myro.*;
import java.awt.Color;
import java.util.Scanner;
import csteutils.myro.MyroColorImage;


public class NegativeFilter {
    public static void negfilter(MyroColorImage picture) {
        System.out.println("Hello, World!");
        picture.show();

        SimpleIO.showMessage("Tell me when you're ready!");
            for (MyroPixel pixel : picture)
            {
                System.out.print(pixel.getColor());
                Color currentcolor = pixel.getColor();
                int invertedRed = 255 - currentcolor.getRed();
                int invertedGreen = 255 - currentcolor.getGreen();
                int invertedBlue = 255 - currentcolor.getBlue();
                pixel.setColor(new Color(invertedRed, invertedGreen, invertedBlue));

            }
            picture.show();
            
            }
    }

