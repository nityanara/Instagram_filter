import csteutils.*;
import csteutils.myro.*;
import java.awt.Color;
import java.util.Scanner;





public class PictureShrinker {
    public static void shrink(MyroColorImage picture) 
    {
        picture.show();

        SimpleIO.showMessage("Tell me when you're ready!");
        MyroColorImage smallpicture = new MyroColorImage(picture.getWidth()/2, picture.getHeight()/2);
        int width = 0;
        int height = 0;
        int x = 1;
        int y = 1;
        for (MyroPixel pixel : picture)
        {
            
            if(width%2==0)
            {
                if(height%2 == 0)
                {
                    MyroPixel Oldpix = picture.getPixel(width,height);
                    MyroPixel newPixel = smallpicture.getPixel(x, y);
                    newPixel.setColor(Oldpix.getColor());
                    x += 1;
                }
            }
            width += 1;
            
            if(x >= smallpicture.getWidth())
            {
                x = 0;

                if(y < (smallpicture.getHeight() - 1))
                {
                    y +=1;
                }
            }
            if(width >= picture.getWidth())
            {
                width = 0;

                if(height < (picture.getHeight() - 1))
                {
                    height +=1;
                }
            }
        

        }
        smallpicture.show();
    }        
}