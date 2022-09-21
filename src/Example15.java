import java.util.Scanner;

public class Example15 {
    public static void main(String [] args){
        int x;
        System.out.println("Enter the exam mark:");

        Scanner inputValue;
        inputValue = new Scanner(System.in);
        x = inputValue.nextInt();

        if (x < 3){
            System.out.println("Deficiente");
        } if (x >= 3 && x <5){
            System.out.println("Insuficiente");
        } if (x == 5){
            System.out.println("Suficiente");
        } if (x == 6){
            System.out.println("Bien");
        } if (x < 9 && x > 6){
            System.out.println("Notable");
        } if (x > 8 && x < 11){
            System.out.println("Sobresaliente");
        }
    }
}
