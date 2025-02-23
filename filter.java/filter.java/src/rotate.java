import csteutils.*;
import csteutils.myro.*;
import java.awt.Color;
import java.util.Scanner;
import csteutils.myro.MyroColorImage;



public class rotate {
    public static void rotatepicture(MyroColorImage picture) {
        System.out.println("Hello, World!");
        picture.show();

        SimpleIO.showMessage("Tell me when you're ready!");
            int height = picture.getHeight();
            int width = picture.getWidth();
    
            for (int y = 0; y < height / 2; y++) {
                for (int x = 0; x < width; x++) {
                    Color apple = picture.getColor(x, y);
                    picture.setColor(x, y, picture.getColor(x, height - 1 - y));
                    picture.setColor(x, height - 1 - y, apple);
                }
            }
        
            picture.show();

    
    }
}   
