import java.util.Scanner;
import java.util.HashMap;
import java.util.Map.Entry;

class Calender {
    public static void main(String[] args) {
        System.out.println("Calender application which tells how many days are in a month");
        HashMap<String, Integer> months = new HashMap<String, Integer>() 
        {{
            put("January", 31);
            put("February", 28);
            put("March", 31);
            put("April", 30);
            put("May", 31);
            put("June", 30);
            put("July", 31);
            put("August", 31);
            put("September", 30);
            put("October", 31);
            put("November", 30);
            put("December", 31);
        }};
        System.out.println("Enter the operation which the user wants to perform");
        System.out.println("1. Enter the month to find number of days \n2. Enter the number of days to find out monthhs");
        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();
        scan.nextLine();

        //Switch cases
        switch(option) {
            case 1:
                System.out.println("Enter the full month");
                String month = scan.nextLine();
                System.out.printf("Number of days for the month of %s is %d \n", month, months.get(month));
                break;
            case 2:
                System.out.println("Enter the number of days");
                int days = scan.nextInt();
                scan.nextLine();
                System.out.printf("Months with number of days as %d are \n", days);
                for(Entry<String, Integer> entry: months.entrySet()) {
                    if(entry.getValue() == days) {
                        System.out.printf("%s ", entry.getKey()); 
                    }
                }
                System.out.println();
                break;
            default:
                System.out.println("Please enter the correct option program exiting");
                break;
        }
        scan.close();

    }
}