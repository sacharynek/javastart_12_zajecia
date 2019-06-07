package liczby;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] tab = new int[5];
        int sum = 0;
        for (int i = 0; i < tab.length; i++) {
            tab[i] = readLine();
            sum+=tab[i];
        }

        System.out.println(Arrays.toString(tab));
        System.out.println("suma = "+sum);
    }

    private static int readLine() {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int output = 0;

        while (flag) {
            System.out.println("podaj liczbę");
            try {
                output =  sc.nextInt();
                flag = false;
            } catch (InputMismatchException e) {
                System.out.println("niepoprawna liczba!");
            }finally{
                sc.nextLine();
            }
        }
        return output;
    }
}


