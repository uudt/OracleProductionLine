/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.tyuleneva.oraclproduction;

/**
 *
 * @author udtyu
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Oraclproduction {

    static Scanner scanner = new Scanner(System.in, "UTF-8");
    static ArrayList<Product> products = new ArrayList<>();
    static boolean notDone = true;
    static String name;
    static int choice;

    public static void main(String args[]) {
        System.out.println("Welcome!");
        do{
            System.out.println("Enter 1 : Add product");
            System.out.println("Enter 2 : Display total # items produced");
            System.out.println("Enter 3 : Display all items");
            System.out.println("Enter any # to exit");
            try {
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        addProduct();
                        break;
                    case 2:
                        System.out.println("\nThe number of products : " + products.size());
                        break;
                    case 3:
                        CollectionDriver.print(products);
                        break;
                    default:
                        System.out.println("Goodbye");
                        notDone = false;
                }
            } catch (Exception e) {
                System.out.println("Didn't enter a number, try again");
                scanner.nextLine();
            }
        } while (notDone);
    }

    private static void addProduct() {
        System.out.println("Add a product name to continue");
        name = scanner.next();
        System.out.println("Name saved");
        System.out.println("Select 1 : Create MoviePlayer");
        System.out.println("Select 2 : Create AudioPlayer");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                createMP(name);
                break;
            case 2:
                createAP(name);
                break;
            default:
        }
    }

    private static void createAP(String name) {
        String audioSpec;
        System.out.print("Enter audio spec : ");
        audioSpec = scanner.next();

        AudioPlayer ap = new AudioPlayer(name, audioSpec);
        products.add(ap);

        System.out.println("\nAudioPlayer has been added");
        System.out.println();
    }

    private static void createMP(String name) {
        boolean valid = true;
        String screenResolution, monitorType;
        int refreshRate = 0, responseTime = 0;
        System.out.print("Enter screen resolution : ");
        screenResolution = scanner.next();
        while (valid) {
            try {
                System.out.print("Enter Refresh Rate: ");
                refreshRate = scanner.nextInt();
                valid = false;
            } catch (Exception e) {
                System.out.println("\nInvalid input. Enter a # for refresh rate\n");
                scanner.nextLine();
            }
        }
        valid = true;
        while (valid) {
            try {
                System.out.print("Enter response time: ");
                responseTime = scanner.nextInt();
                valid = false;
            } catch (Exception e) {
                System.out.println("\nInvalid input. Enter a # for response time\n");
                scanner.nextLine();
            }
        }
        System.out.print("Enter LED or LCD: ");
        monitorType = scanner.next();

        switch (monitorType.toUpperCase()) {
            case "LED":
                MoviePlayer mp1 = new MoviePlayer(name,
                        new Screen(screenResolution, refreshRate, responseTime), MonitorType.LED);
                products.add(mp1);
                break;
            case "LCD":
                MoviePlayer mp2 = new MoviePlayer(name,
                        new Screen(screenResolution, refreshRate, responseTime), MonitorType.LCD);
                products.add(mp2);
                break;
            default:
                System.out.println("Error");
        }
        System.out.println("\nMoviePlayer has been added");
        System.out.println();
    }
}
