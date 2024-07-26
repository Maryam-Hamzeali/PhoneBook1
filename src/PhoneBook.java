import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1.Add your number");
            System.out.println("2.Print all names and numbers");
            System.out.println("3.Exit \n");
            System.out.println("Enter your choic:");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("enter your name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter your number: ");
                    String number = scanner.nextLine();
                    names.add(name);
                    numbers.add(number);
                    System.out.println("contact added successfully");
                    break;
                case 2:
                    if (names.isEmpty()){
                        System.out.println("phone book is empty");
                    }else {
                        System.out.println("print all names and numbers");
                        for (int i = 0; i< names.size(); i++){
                            System.out.println("name: " + names.get(i));
                            System.out.println("number: " + numbers.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.println("exit");
                    break;
                default:
                    System.out.println("invalid number.");
            }
        } while (choice != 3);
        scanner.close();
    }
}
