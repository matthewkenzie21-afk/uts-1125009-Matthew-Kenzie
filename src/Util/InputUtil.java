package Util;

import java.util.Scanner;

public class InputUtil {
    private static Scanner scan = new Scanner(System.in);

    public static String inputUtil(String pesan) {
        System.out.print(pesan);
        return scan.nextLine();
    }

    public static int inputInt(String pesan) {
        while (true) {
            try {
                System.out.print(pesan);
                return Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Masukkan angka yang benar!");
            }
        }
    }
}