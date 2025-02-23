import csteutils.*;
import csteutils.myro.*;
import java.awt.Color;
import java.util.Scanner;

public class Filters {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String[] pictures = {"sunset4.jpeg", "picture2.jpeg", "picture3.jpeg"};
        MyroColorImage picture = new MyroColorImage();
        Scanner scanner = new Scanner(System.in);

        boolean endProgram = false;

        while (!endProgram) {
            System.out.print("Which picture would you like to choose?/n sunset, flower1, flower2 (type 'end' to exit)");
            String answer = scanner.next();

            if (answer.equals("end")) {
                endProgram = true;
                break;
            }

            boolean valid = false;

            while (!valid) {
                if (answer.equals("sunset")) {
                    picture.loadImage("sunset4.jpeg");
                    valid = true;
                } else if (answer.equals("flower1")) {
                    picture.loadImage("picture2.jpeg");
                    valid = true;
                } else if (answer.equals("flower2")) {
                    picture.loadImage("picture3.jpeg");
                    valid = true;
                } else {
                    System.out.println("Invalid input. Please enter sunset, flower1, or flower2 (type 'end' to exit).");
                    answer = scanner.next();
                }
            }

            boolean continueApplyingFilters = true;

            while (continueApplyingFilters) {
                System.out.print("Which filter would you like to choose?/n pictureshrinker, negativefilter (type 'end' to exit)");
                String filterChoice = scanner.next();

                if (filterChoice.equals("end")) {
                    continueApplyingFilters = false;
                    break;
                }

                boolean filterValid = false;

                while (!filterValid) {
                    if (filterChoice.equals("pictureshrinker")) {
                        PictureShrinker shrinker = new PictureShrinker();
                        shrinker.shrink(picture);
                        filterValid = true;
                    } else if (filterChoice.equals("negativefilter")) {
                        NegativeFilter negfil = new NegativeFilter();
                        negfil.negfilter(picture);
                        filterValid = true;
                    
                    } 
                    else if(filterChoice.equals("rotatefilter"))
                    {
                        //rotate rotatefil = new rotate();
                        rotate.rotatepicture(picture);
                        filterValid = true;
                    }
                    else if(filterChoice.equals("sepiatone"))
                    {
                        SepiaMaker sepia = new SepiaMaker();
                        sepia.sepiatone(picture);
                        filterValid = true;
                    }
                    else if(filterChoice.equals("colorfilter"))
                    {
                        Colorfilter colorfill = new Colorfilter();
                        colorfill.colorfil(picture);
                        filterValid = true;
                    }
                    
                    
                    else {
                        System.out.println("Invalid filter choice. Please enter pictureshrinker or negativefilter (type 'end' to exit).");
                        filterChoice = scanner.next();
                    }
                }
            }
        }
    }
}
