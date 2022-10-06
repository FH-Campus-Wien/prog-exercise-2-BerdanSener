package at.ac.fhcampuswien;

import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.rint;

public class App {

    //todo Task 1
    public void largestNumber(){
        Scanner sc = new Scanner(System.in);
        int z = 0;
        double eingabe = 0;
        double highest = 0;
        do{
            System.out.print("Number "+(z+1)+": ");
            eingabe = sc.nextDouble();
            if(eingabe <= 0 && z == 0){
                System.out.println("No number entered.");
                return;
            }
            if(eingabe > highest){
                highest = eingabe;
            }
            z++;
        }while(eingabe > 0);
        System.out.printf("The largest number is %.2f\n", highest);
    }

    //todo Task 2
    public void stairs(){
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int zeilen = sc.nextInt();
        if(zeilen <= 0){
            System.out.println("Invalid number!");
        }
        int ausgabe = 1;
        for (int r = 0; r<zeilen; r++){
            for (int c = 0; c<=r ; c++){
                System.out.print(ausgabe+" ");
                ausgabe++;
            }
            System.out.print("\n");
        }
    }

    //todo Task 3
    public void printPyramid(){
        final int ROWS = 6;
        final int COLUMS = 11;
        int abstand = COLUMS - ROWS;
        //String ausgabe[] = {"*\n", "    ***\n", "   *****\n", "  *******\n", " *********\n", "***********\n"};
        for(int i = 1; i<=ROWS; i++){
            for (int i2 = 0; i2<abstand; i2++){
                System.out.print(" ");
            }
            int sterne = i * 2 - 1;
            for (int x = sterne ; x<=sterne && x != 0; x--) {
                System.out.print("*");
            }
            abstand--;
            System.out.print("\n");
        }
    }

    //todo Task 4
    public void printRhombus(){
        Scanner sc = new Scanner(System.in);
        System.out.print("h: ");
        int hoehe = sc.nextInt();
        System.out.print("c: ");
        if(hoehe%2 == 0){
            System.out.println("Invalid number!");
            return;
        }
        char zeichen = sc.next().charAt(0);


        int abstand = (hoehe/2);
        for(int i = 1; i <= hoehe/2+1; i++){
            for (int i2 = 0; i2<abstand; i2++){
                System.out.print(" ");
            }
            int sterne = i * 2 - 1;
            int z = sterne/2 * (-1);
            for (int x = sterne ; x<=sterne && x != 0; x--) {
                System.out.print(""+(char) (zeichen-Math.abs(z)));
                z++;
            }
            abstand--;
            System.out.print("\n");
        }

        abstand = 1;
        int i2 = 1;
        for(int i = 1; i < hoehe/2+1; i++){
            for (int z = 0; i2>=abstand && z < i2; z++){
                System.out.print(" ");
            }
            i2++;
            int sterne = hoehe - abstand*2;
            int z = sterne/2 * (-1);
            for (int x = sterne ; x<=sterne && x != 0; x--) {
                System.out.print(""+(char) (zeichen-Math.abs(z)));
                z++;
            }
            abstand++;
            System.out.print("\n");
        }
    }

    //todo Task 5
    public void marks(){
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int eingabe = 0;
        int gesamt = 0;
        int fuenfer = 0;
        do{
            System.out.print("Mark "+(i+1)+": ");
            eingabe = sc.nextInt();;
            if(eingabe < 0 || eingabe > 5){
                System.out.println("Invalid mark!");
            }else{
                gesamt = gesamt + eingabe;
                if (eingabe == 5){
                    fuenfer++;
                }
                i++;
            }
        }while (eingabe != 0);
        double schnitt = (double) gesamt/((double) i-1.0);
        double roundDbl = Math.round(schnitt*100.0)/100.0;
        System.out.printf("Average: %.2f"+System.lineSeparator(), roundDbl);
        System.out.println("Negative marks: "+fuenfer);
    }

    //todo Task 6
    public void happyNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int eingabe = sc.nextInt();
        int puffer = 0;
        do{
            puffer = 0;

            for (int i = 0; eingabe > 0; i++) {
                puffer += Math.pow(eingabe % 10, 2);
                eingabe = eingabe / 10;
            }
            eingabe = puffer;
        }while (puffer != 1 && puffer != 4);
        if(puffer == 1){
            System.out.println("Happy number!");
        }else {
            System.out.println("Sad number!");
        }
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}
