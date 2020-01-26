
/**
 * Write a description of class CatGeneratorV3Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class CatSimulatorV8Tester {
    public static int max;
    public static int min;
    public static double average;

    public static void main(String[] args) {
        // declaration of strings
        boolean terminator = true;
        Scanner in = new Scanner(System.in);
        System.out.println("Hello! Welcome to the Cat Simulator!");
        System.out.println("What do you want the name of your first cat to be?");
        String catname = in.next();
        CatSimulatorV8 cat = new CatSimulatorV8(catname);
        String thecatname = cat.getcatname();
        String catfeature = cat.Catfeatures();
        String cataction = cat.CatActions();
        int months1 = cat.Catage();
        cat.toStringIntro(thecatname, months1, catfeature, cataction);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Are you satisfied with your cat's features? (Y for yes and N for no)");
        String choice1 = in.next();
        boolean error = true;
        if (choice1.charAt(0) == 'Y' || choice1.charAt(0) == 'y') {
            System.out.println("Good. Your cat will forever remain this way.");
        }
        if (choice1.charAt(0) == 'N' || choice1.charAt(0) == 'n') {
            System.out.println("Choose your prefered features for your cat:");
            System.out.printf("%-80s\n", "[1] Brown and white with yellow eyes");
            System.out.printf("%-80s\n", "[2] Black and white with green eyes");
            System.out.printf("%-80s\n", "[3] Orange and white with green eyes");
            System.out.printf("%-80s\n", "[4] White and pale brown with blue eyes");
            System.out.printf("%-80s\n", "[5] Silver with yellow eyes");
            System.out.printf("%-80s\n", "[6] Orange, white and dark brown with yellow and blue eyes");
            System.out.printf("%-80s\n", "[7] Creamy with blue eyes");
            System.out.printf("%-80s\n", "[8] White and soft amber with blue eyes");
            System.out.printf("%-80s\n", "[9] White with light blue and yellow eyes");
            System.out.printf("%-80s\n", "[10] Gray and white with gray-green eyes");
            System.out.printf("%-80s\n", "[11] Black with orange eyes");
            do {
                try {
                    int catskinnum = in.nextInt();
                    System.out.println("Ok, your cat will now be changed.");
                    catfeature = cat.Catfeatures(catskinnum);
                    error = false;
                } catch (Exception a) {
                    System.out.println("uh oh, seems like we didn't quite understand you");
                    System.out.println("Try again please:  ");
                    System.out.printf("%-80s\n", "[1] Brown and white with yellow eyes");
                    System.out.printf("%-80s\n", "[2] Black and white with green eyes");
                    System.out.printf("%-80s\n", "[3] Orange and white with green eyes");
                    System.out.printf("%-80s\n", "[4] White and pale brown with blue eyes");
                    System.out.printf("%-80s\n", "[5] Silver with yellow eyes");
                    System.out.printf("%-80s\n", "[6] Orange, white and dark brown with yellow and blue eyes");
                    System.out.printf("%-80s\n", "[7] Creamy with blue eyes");
                    System.out.printf("%-80s\n", "[8] White and soft amber with blue eyes");
                    System.out.printf("%-80s\n", "[9] White with light blue and yellow eyes");
                    System.out.printf("%-80s\n", "[10] Gray and white with gray-green eyes");
                    System.out.printf("%-80s\n", "[11] Black with orange eyes");
                    in.next();
                }
            } while (error);
        }
        while (!((choice1.charAt(0) == 'Y' || choice1.charAt(0) == 'y') || (choice1.charAt(0) == 'N' || choice1.charAt(0) == 'n'))) {
            System.out.println("I didn't understand you. Please type yes or no ");
            choice1 = in.next();

        }


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Hmmmm..... your friend seems a bit lonely. Do you want more cats to accompany him? (Y or N)");
        String choice2 = in.next();
        while (terminator) {
            if (choice2.charAt(0) == 'Y' || choice2.charAt(0) == 'y') {
                System.out.println("How many more cats do you want? Enter integer below:");
                while (!in.hasNextInt()) {
                    System.out.println("'" + in.nextLine() + "'" + " is not a valid entry. Please enter an integer: ");

                }
                int catnums = in.nextInt();
                // boolean error2 = true;
                // do {
                //   error2 = true;
                //try {
                CatSimulatorV8[] cats = new CatSimulatorV8[catnums + 1];
                String[] catskins = new String[catnums + 1];
                String[] actions = new String[catnums + 1];
                String[] catnames = new String[catnums + 1];
                int[] months = new int[catnums + 1];
                catskins[0] = catfeature;
                actions[0] = cataction;
                catnames[0] = thecatname;
                months[0] = months1;

                for (int z = 1; z <= catnums; z++) {
                    int y = z + 1;
                    System.out.println("What will cat" + y + "'s name be ?");
                    String catnames2 = in.next();
                    cats[z] = new CatSimulatorV8(catnames2);
                    catskins[z] = cats[z].Catfeatures();
                    actions[z] = cats[z].CatActions();
                    catnames[z] = cats[z].getcatname();
                    months[z] = cats[z].Catage();
                    cats[z].toString(catnames[z], months[z], catskins[z], actions[z]);
                    System.out.println();
                }

                cats[0].toStringIntro(thecatname, months1, catfeature, cataction);

                for (int z = 1; z <= catnums; z++) {
                    cats[z].toString(catnames[z], months[z], catskins[z], actions[z]);

                }

             /*  abandoned code ----------
             catch (Exception a ) {
               System.out.println("That's not a catname. Try again please");
               in.next(); */

                // } }   while(error2);

                max = Integer.MIN_VALUE;
                for (int q : months) {
                    if (q > max) {
                        max = q;
                    }
                }

                min = Integer.MAX_VALUE;
                for (int q : months) {
                    if (q < min) {
                        min = q;
                    }
                }

                for (int q : months) {
                    average += q;
                }

                average = (average / months.length); //.length for instance variables + indices in arrays.  .length() for string length

                System.out.printf("%70s\n", "Months Data:");
                System.out.printf("%70s %4d\n", "Minimum: ", min);
                System.out.printf("%70s %4d\n", "Maximum: ", max);
                System.out.printf("%70s %4.4f\n", "Average: ", average);

                terminator = false;
            }
            if (choice2.charAt(0) == 'N' || choice2.charAt(0) == 'n') {
                System.out.println("Ok... one cat it is.");
                cat.toStringIntro(thecatname, months1, catfeature, cataction);
                terminator = false;
            }
            while (!((choice2.charAt(0) == 'N' || choice2.charAt(0) == 'n') || (choice2.charAt(0) == 'Y' || choice2.charAt(0) == 'y'))) {
                System.out.println("'" + in.nextLine() + "'" + " is not a valid entry. Please enter yes or no: ");
                choice2 = in.next();
            }


        }
    }
}
