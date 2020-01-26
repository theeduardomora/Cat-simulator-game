
/**
 * Write a description of class CatGenerator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
class CatSimulatorV8 {
    public static String catskin;
    public static String action;
    public static String catname;
    public static int months;
    public static int max;
    public static int min;
    public static double average;
    //Scanner in = new Scanner(System.in);

    CatSimulatorV8(String name) {
        catname = name;
    }

    public String getcatname() {
        return catname;
    }

    public int Catage() {
        int months = ((int) (Math.random() * 11) + 1);
        return months;

    }


    public String Catfeatures() {
        int randnum = (int) (Math.random() * 12);
        String Tabby = "Brown and white with yellow eyes";  // descriptions taken from minecraft cat skins XD
        String Tuxedo = "Black and white with green eyes";
        String Red = "Orange and white with green eyes";
        String Siamese = "White and pale brown with blue eyes";
        String British = "Silver with yellow eyes";
        String Calico = "Orange, white and dark brown with yellow and blue eyes";
        String Persian = "Creamy with blue eyes";
        String Ragdoll = "White and soft amber with blue eyes";
        String White = "White with light blue and yellow eyes";
        String Jellie = "Gray and white with gray-green eyes";
        String Black = "Black with orange eyes";
        if (randnum <= 1) {
            catskin = Tabby;

        }
        if (randnum == 2) {
            catskin = Tuxedo;

        }
        if (randnum == 3) {
            catskin = Red;

        }
        if (randnum == 4) {
            catskin = Siamese;

        }
        if (randnum == 5) {
            catskin = British;

        }
        if (randnum == 6) {
            catskin = Calico;

        }
        if (randnum == 7) {
            catskin = Persian;

        }
        if (randnum == 8) {
            catskin = Ragdoll;

        }
        if (randnum == 9) {
            catskin = White;

        }
        if (randnum == 10) {
            catskin = Jellie;

        }
        if (randnum == 11) {
            catskin = Black;

        }
        return catskin;
    }

    public String Catfeatures(int num) {
        String Tabby = "Brown and white with yellow eyes";  // descriptions taken from minecraft cat skins XD
        String Tuxedo = "Black and white with green eyes";
        String Red = "Orange and white with green eyes";
        String Siamese = "White and pale brown with blue eyes";
        String British = "Silver with yellow eyes";
        String Calico = "Orange, white and dark brown with yellow and blue eyes";
        String Persian = "Creamy with blue eyes";
        String Ragdoll = "White and soft amber with blue eyes";
        String White = "White with light blue and yellow eyes";
        String Jellie = "Gray and white with gray-green eyes";
        String Black = "Black with orange eyes";
        if (num <= 1) {
            catskin = Tabby;

        }
        if (num == 2) {
            catskin = Tuxedo;

        }
        if (num == 3) {
            catskin = Red;

        }
        if (num == 4) {
            catskin = Siamese;

        }
        if (num == 5) {
            catskin = British;

        }
        if (num == 6) {
            catskin = Calico;

        }
        if (num == 7) {
            catskin = Persian;

        }
        if (num == 8) {
            catskin = Ragdoll;

        }
        if (num == 9) {
            catskin = White;

        }
        if (num == 10) {
            catskin = Jellie;

        }
        if (num == 11) {
            catskin = Black;

        }
        return catskin;
    }

    public String CatActions() {
        double randnum = (int) (Math.random() * 6);
        String action1 = "" + catname + "   loves to hunt";
        String action2 = "" + catname + "   loves companionship";
        String action3 = "" + catname + "   loves napping";
        String action4 = "" + catname + "   loves food";
        String action5 = "" + catname + "   loves playing";
        if (randnum <= 1) {
            action = action1;

        }
        if (randnum == 2) {
            action = action2;

        }
        if (randnum == 3) {
            action = action3;

        }
        if (randnum == 4) {
            action = action4;

        }
        if (randnum == 5) {
            action = action5;

        }
        return action;
    }

    public String CatActions(String action) {
        return action;
    }

    public static void toString(String catname, int months, String catskin, String action) {
        System.out.printf("%-62s %-2s %-50s %40s\n", catname, months, "months old", catskin);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.printf("%80s\n", action);
        System.out.println();
        System.out.println();
    }

    public static void toStringIntro(String catname, int months, String catskin, String action) {
        System.out.printf("%75s\n", "Cat Simulator!");
        System.out.println();
        System.out.println();
        System.out.printf("%-62s %-2s %-50s %40s\n", catname, months, "months old", catskin);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.printf("%80s\n", action);
        System.out.println();
        System.out.println();

    }

    public int Max(int[] months) {
        max = Integer.MIN_VALUE;
        for (int q : months) {
            if (q > max) {
                max = q;
            }
        }
        return max;
    }

    public int Min(int[] months) {
        min = Integer.MAX_VALUE;
        for (int q : months) {
            if (q < min) {
                min = q;
            }
        }
        return min;
    }

    public double Average(int[] months) {
        for (int q : months) {
            average += q;
        }
        average = (average / months.length); //.length for instance variables + indices in arrays.  .length() for string length
        return average;
    }


}