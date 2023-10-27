//for Input user
import java.util.Scanner;
//for GUI
import javax.swing.JOptionPane;
//for Random
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // this is a comment
        System.out.println("\t\"Hola\"");
        System.out.println("Mundo");

        // Variables
        int num = 123;
        System.out.println(num);
        char symbol = '@';
        System.out.println(symbol);

        // String is a referenc, referenc init with oppercCase
        String hi = "\t\"Hola Mundo\"";
        System.out.println(hi);

        // User Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name");
        String name = scanner.nextLine();
        System.out.println("How old are you");
        int age = scanner.nextInt();
        // clean scanner, because it´s save value
        scanner.nextLine();
        System.out.println("What´s your favorite food");
        String favFood = scanner.nextLine();

        System.out.println("\t Hello " + name);
        System.out.println("\t you have " + age + " years old");
        System.out.println("\t your favorite food is: " + favFood);
        scanner.close();

        // expresions
        int friends = 10;
        friends++; // addition
        // friends--; subtraction
        double fr = (double) friends / 3;
        System.out.println(friends);
        System.out.println(fr);

        // Graphical User Interface
        String firstName = JOptionPane.showInputDialog(null, "Enter your first Name");
        JOptionPane.showMessageDialog(null, "Hello " + firstName);

        int ageGUI = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your first Name"));
        JOptionPane.showMessageDialog(null, "you have " + ageGUI+" years old");

        //function Math() JAVA === Math() JS
        //Random 
        Random random = new Random();
        int xRandom = random.nextInt(6)+1;
        boolean yRandom = random.nextBoolean();


        System.out.println(xRandom);
        System.out.println(yRandom);

        int array[][] = new int[3][3];    
        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[1][0] = 4;
        array[1][1] = 5;
        array[1][2] = 6;
        array[2][0] = 7;
        array[2][1] = 8;
        array[2][2] = 9;
        for(int i = 0; i<3 ; i++){
            for(int j = 0; j<3; j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

    }
}