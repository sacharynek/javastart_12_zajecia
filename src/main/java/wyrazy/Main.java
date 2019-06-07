package wyrazy;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] tab = new String[3];
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        int index = 0;
        while (flag) {
            System.out.println("Podaj wyraz");
            tab[index] = sc.nextLine();
            index++;
            if (index >= tab.length) {
                flag = false;
            }
        }

        System.out.println(Arrays.toString(tab));

        System.out.println("który element chcesz wyświetlić?");

        try {
            System.out.println(tab[sc.nextInt()]);
        } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
            System.out.println("podano zły index");
        }


    }


}
