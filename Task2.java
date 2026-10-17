
import java.util.Scanner;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello greetings, Mrs/Ms- " + name);

        System.out.println("Enter your city-->");
        String city = sc.nextLine();

        while (true) {
            System.out.println("\nBook Ride: 1");
            System.out.println("Exit: 2");
            System.out.print("Enter your choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter 1 or 2.");
                sc.next();
                continue;
            }

            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.println("Select the vehicle-->");
                System.out.println("Auto : 1 or Auto/auto");
                System.out.println("Sedan : 2 or Sedan/sedan");
                System.out.println("SUV : 3 or SUV/suv");

                String vehicle_choice = sc.next();

                if (vehicle_choice.equals("1") ||
                    vehicle_choice.equalsIgnoreCase("Auto")) {

                    System.out.println("Select the Route from following-->");
                    System.out.println(city + " to Pune (148 KM): 1");
                    System.out.println(city + " to Jaipur (1,180 KM): 2");
                    System.out.println(city + " to Jaisalmer (1,311 KM): 3");
                    System.out.println(city + " to Udaipur (771 KM): 4");
                    System.out.println("Custom location : 5");

                    String destination_choice = sc.next();
                    int fare = 0;

                    if (destination_choice.equals("1")) {
                        fare = 148 * 10;
                    }
                    else if (destination_choice.equals("2")) {
                        fare = 1180 * 10;
                    }
                    else if (destination_choice.equals("3")) {
                        fare = 1311 * 10;
                    }
                    else if (destination_choice.equals("4")) {
                        fare = 771 * 10;
                    }
                    else if (destination_choice.equals("5")) {
                        System.out.println("Custom location is not implemented yet.");
                        continue;
                    }
                    else {
                        System.out.println("Invalid destination choice!");
                        continue;
                    }

                    System.out.println("Auto rate is 10 Rs/KM");
                    System.out.println("So Total fare will be-- " + fare + " RS");
                    System.out.println("Enter |ok| to confirm ride.");

                    String auto_choice = sc.next();

                    if (auto_choice.equalsIgnoreCase("ok")) {
                        Random random = new Random();
                        int system_otp = 1000 + random.nextInt(9000);

                        System.out.println("Otp= " + system_otp
                                + "\nEnter otp to confirm ur Ride-");

                        if (!sc.hasNextInt()) {
                            System.out.println("Invalid OTP input!");
                            sc.next();
                            continue;
                        }

                        int user_otp = sc.nextInt();

                        if (user_otp == system_otp) {
                            System.out.println("Thanks for booking\nRider is arriving in just 5 min.");
                        }
                        else {
                            System.out.println("Invalid OTP!");
                        }
                    }
                    else {
                        System.out.println("Cancelling the ride");
                    }
                }

                else if (vehicle_choice.equals("2") ||
                         vehicle_choice.equalsIgnoreCase("Sedan")) {

                    System.out.println("Select the Route from following-->");
                    System.out.println(city + " to Pune (148 KM): 1");
                    System.out.println(city + " to Jaipur (1,180 KM): 2");
                    System.out.println(city + " to Jaisalmer (1,311 KM): 3");
                    System.out.println(city + " to Udaipur (771 KM): 4");
                    System.out.println("Custom location : 5");

                    String destination_choice = sc.next();
                    int fare = 0;

                    if (destination_choice.equals("1")) {
                        fare = 148 * 19;
                    }
                    else if (destination_choice.equals("2")) {
                        fare = 1180 * 19;
                    }
                    else if (destination_choice.equals("3")) {
                        fare = 1311 * 19;
                    }
                    else if (destination_choice.equals("4")) {
                        fare = 771 * 19;
                    }
                    else if (destination_choice.equals("5")) {
                        System.out.println("Custom location is not implemented yet.");
                        continue;
                    }
                    else {
                        System.out.println("Invalid destination choice!");
                        continue;
                    }

                    System.out.println("Sedan rate is 19 Rs/KM");
                    System.out.println("So Total fare will be-- " + fare + " RS");
                    System.out.println("Enter |ok| to confirm ride.");

                    String sedan_choice = sc.next();

                    if (sedan_choice.equalsIgnoreCase("ok")) {
                        Random random = new Random();
                        int system_otp = 1000 + random.nextInt(9000);

                        System.out.println("Otp= " + system_otp
                                + "\nEnter otp to confirm ur Ride-");

                        if (!sc.hasNextInt()) {
                            System.out.println("Invalid OTP input!");
                            sc.next();
                            continue;
                        }

                        int user_otp = sc.nextInt();

                        if (user_otp == system_otp) {
                            System.out.println("Thanks for booking\nRider is arriving in just 5 min.");
                        }
                        else {
                            System.out.println("Invalid OTP!");
                        }
                    }
                    else {
                        System.out.println("Cancelling the ride");
                    }
                }

                else if (vehicle_choice.equals("3") ||
                         vehicle_choice.equalsIgnoreCase("SUV")) {

                    System.out.println("Select the Route from following-->");
                    System.out.println(city + " to Pune (148 KM): 1");
                    System.out.println(city + " to Jaipur (1,180 KM): 2");
                    System.out.println(city + " to Jaisalmer (1,311 KM): 3");
                    System.out.println(city + " to Udaipur (771 KM): 4");
                    System.out.println("Custom location : 5");

                    String destination_choice = sc.next();
                    int fare = 0;

                    if (destination_choice.equals("1")) {
                        fare = 148 * 25;
                    }
                    else if (destination_choice.equals("2")) {
                        fare = 1180 * 25;
                    }
                    else if (destination_choice.equals("3")) {
                        fare = 1311 * 25;
                    }
                    else if (destination_choice.equals("4")) {
                        fare = 771 * 25;
                    }
                    else if (destination_choice.equals("5")) {
                        System.out.println("Custom location is not implemented yet.");
                        continue;
                    }
                    else {
                        System.out.println("Invalid destination choice!");
                        continue;
                    }

                    System.out.println("SUV rate is 25 Rs/KM");
                    System.out.println("So Total fare will be-- " + fare + " RS");
                    System.out.println("Enter |ok| to confirm ride.");

                    String suv_choice = sc.next();

                    if (suv_choice.equalsIgnoreCase("ok")) {
                        Random random = new Random();
                        int system_otp = 1000 + random.nextInt(9000);

                        System.out.println("Otp= " + system_otp
                                + "\nEnter otp to confirm ur Ride-");

                        if (!sc.hasNextInt()) {
                            System.out.println("Invalid OTP input!");
                            sc.next();
                            continue;
                        }

                        int user_otp = sc.nextInt();

                        if (user_otp == system_otp) {
                            System.out.println("Thanks for booking\nRider is arriving in just 5 min.");
                        }
                        else {
                            System.out.println("Invalid OTP!");
                        }
                    }
                    else {
                        System.out.println("Cancelling the ride");
                    }
                }

                else {
                    System.out.println("Invalid vehicle choice!");
                }
            }
            else if (choice == 2) {
                System.out.println("Exiting the program....!!!");
                break;
            }
            else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
