import csteutils.*;
import csteutils.myro.*;
import java.awt.Color;
import java.util.Scanner;



public class SepiaMaker 
{
    public static void sepiatone(MyroColorImage picture) 
    {
        System.out.println("Hello, World!");
        picture.show();

        SimpleIO.showMessage("Tell me when you're ready!");
        for (MyroPixel pixel : picture)
        {
            pixel.setColor(new Color(pixel.getGray(), pixel.getGray(), pixel.getGray()));
            Color y = pixel.getColor();

            int red = y.getRed();
            int blue = y.getBlue();
            int green = y.getGreen();
            int avgLuminance = (int) ((red + green + blue)/3);
            if(avgLuminance < 63)
            {
                red = (int) (red*1.1);
                blue = (int) (blue*0.9);
            }
            else if(avgLuminance > 63 && avgLuminance < 192)
            {
                red = (int) (red*1.15);
                blue = (int) (blue*0.85);
            }
            else if(avgLuminance > 192)
            {
                red = (int) (red*1.08);
                blue = (int) (blue*0.93);
            }

            if(red > 225)
            {
                red = 255;
            }
            if(blue > 225)
            {
                blue = 255;
            }

            pixel.setColor(new Color(red, green, blue));
        }
        picture.show();
    }

}
