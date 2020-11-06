package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Untuk mendeklarasi scanner, supaya bisa menerima inputan dari User.
        Scanner in = new Scanner(System.in);

        //Merupakan nilai.
        int base = 0;

        //Nilai untuk penghitungan sementara pada Kalkulator.
        int tempBase = 0;

        //Perintah untuk menjalankan kalkulator secara berulang sampai User selesai.
        while (true) {
            System.out.println("What do you want to do?");
            String decider = in.nextLine();
            if (decider.toLowerCase().contains("add") && decider.toLowerCase().charAt(0) == 'a') {
                String tempNumber = "";
                int tempIndex = 4;
                while (true) {
                    tempNumber += decider.charAt(tempIndex);
                    if(tempIndex == decider.length()-1) break;
                    if(decider.charAt(++tempIndex) == '.' || decider.charAt(++tempIndex) == ',') break;
                    else tempIndex++;
                }
                int tempAfter = Integer.parseInt(tempNumber);
                tempBase += tempAfter;
                System.out.printf("%.1f\n", (double)tempBase);
            }
            else if (decider.toLowerCase().contains("substract") && decider.toLowerCase().charAt(0) == 's') {
                String tempNumber = "";
                int tempIndex = 10;
                while (true) {
                    tempNumber += decider.charAt(tempIndex);
                    if(tempIndex == decider.length()-1) break;
                    if(decider.charAt(++tempIndex) == '.' || decider.charAt(++tempIndex) == ',') break;
                    else tempIndex++;
                }
                int tempAfter = Integer.parseInt(tempNumber);
                tempBase -= tempAfter;
                System.out.printf("%.1f\n", (double)tempBase);
            }
            else if (decider.toLowerCase().contains("multiply") && decider.toLowerCase().charAt(0) == 'm') {
                String tempNumber = "";
                int tempIndex = 9;
                while (true) {
                    tempNumber += decider.charAt(tempIndex);
                    if(tempIndex == decider.length()-1) break;
                    if(decider.charAt(++tempIndex) == '.' || decider.charAt(++tempIndex) == ',') break;
                    else tempIndex++;
                }
                int tempAfter = Integer.parseInt(tempNumber);
                tempBase *= tempAfter;
                System.out.printf("%.1f\n", (double)tempBase);
            }
            else if (decider.toLowerCase().contains("divide") && decider.toLowerCase().charAt(0) == 'd') {
                String tempNumber = "";
                int tempIndex = 7;
                while (true) {
                    tempNumber += decider.charAt(tempIndex);
                    if(tempIndex == decider.length()-1) break;
                    if(decider.charAt(++tempIndex) == '.' || decider.charAt(++tempIndex) == ',') break;
                    else tempIndex++;
                }
                int tempAfter = Integer.parseInt(tempNumber);
                if(tempAfter == 0){
                    System.out.println("Cannot divide by Zero");
                    break;
                }
                tempBase /= tempAfter;
                System.out.printf("%.1f\n", (double)tempBase);
            }
            else if (decider.toLowerCase().contains("cancel")) {
                tempBase = base;
                System.out.printf("%.1f\n", (double)tempBase);
            }
            else if (decider.toLowerCase().contains("exit")) {
                System.exit(1);
            }
            else System.out.println("Not found");
        }
    }
}
