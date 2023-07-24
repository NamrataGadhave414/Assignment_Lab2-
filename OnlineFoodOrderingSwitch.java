
package quest1;
import java.util.Scanner;


public class OnlineFoodOrderingSwitch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int drinksChoice, startersChoice , maincourseChoice , desertchoice;
        int drinksTotal = 0, startersTotal = 0, maincourseTotal=0 , desertTotal=0;

        System.out.println("Welcome to  My Haveli!");

        while (true) {
            System.out.println("1: Starters");
            System.out.println("2: Main Course");
            System.out.println("3: Desserts");
            System.out.println("4: Drinks");
            System.out.println("5: Exit");
            System.out.print("Enter your choice: ");

            int category = scanner.nextInt();

            switch (category) {
                case 1:
                    System.out.println("Menu of Starters:");
                    System.out.println("1: Chicken Crispy\tRs.650");
                    System.out.println("2: Chicken Lolipop\tRs.550");
                    System.out.println("3: Chicken Roll\tRs.330");
                    System.out.print("Enter your choice of item: ");
                    startersChoice = scanner.nextInt();
                    switch (startersChoice) {
                        case 1:
                            startersTotal += 650;
                            break;
                        case 2:
                            startersTotal += 550;
                            break;
                        case 3:
                            startersTotal += 330;
                            break;
                        default:
                            System.out.println("Invalid choice!");
                    }
                    break;
                case 2:
                	System.out.println("Main Course:");
                    System.out.println("1: Chicken Butter\tRs.650");
                    System.out.println("2: Chicken Biryani\tRs.550");
                    System.out.println("3: Mutton Biryani\tRs.330");
                    System.out.print("Enter your choice of item: ");
                    maincourseChoice = scanner.nextInt();
                    switch (maincourseChoice) {
                        case 1:
                            maincourseTotal += 650;
                            break;
                        case 2:
                          maincourseTotal += 550;
                            break;
                        case 3:
                           maincourseTotal += 330;
                            break;
                        default:
                            System.out.println("Invalid choice!");
                    }
                    break;

                case 3:
                	System.out.println("Desert Menu:");
                    System.out.println("1: ChocolateCake\tRs.500");
                    System.out.println("2: Gulabjaamun\tRs.550");
                    System.out.println("3: Rasgula\tRs.300");
                    System.out.print("Enter your choice of item: ");
                    desertchoice = scanner.nextInt();
                    switch (desertchoice) {
                        case 1:
                            desertTotal += 650;
                            break;
                        case 2:
                            desertTotal += 550;
                            break;
                        case 3:
                            desertTotal += 330;
                            break;
                        default:
                            System.out.println("Invalid choice!");
                    }
                    break;

                case 4:
                    System.out.println("Menu of Drinks:");
                    System.out.println("1: Coca cola\tRs.650");
                    System.out.println("2: Pepsi\tRs.550");
                    System.out.println("3: Maaza\tRs.330");
                    System.out.print("Enter your choice of item: ");
                    drinksChoice = scanner.nextInt();
                    switch (drinksChoice) {
                        case 1:
                            drinksTotal += 650;
                            break;
                        case 2:
                            drinksTotal += 550;
                            break;
                        case 3:
                            drinksTotal += 330;
                            break;
                        default:
                            System.out.println("Invalid choice!");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }

            System.out.println("Do you want to add another item? (Y/N)");
            char addAnother = scanner.next().charAt(0);
            if (addAnother == 'N' || addAnother == 'n') {
                break;
            }
        }

        int total = startersTotal + drinksTotal + maincourseTotal + desertTotal;
        System.out.println("Thanks for ordering!");
        System.out.println("Your Bill:");
        System.out.println("Starters Total: Rs." + startersTotal);
        System.out.println("Main Course Total : Rs." + maincourseTotal);
        System.out.println("Drinks Total: Rs." + drinksTotal);
        System.out.println("Desert total: Rs." + desertTotal);
        System.out.println("\tTotal: Rs." + total);
    }
}

