import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CustomerService{

    public static void main(String[] args){
		// Initialize the customer queue
        Queue<Integer> customerQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in); //Create a scanner object to read user input
        int choice;

        do{
			// Display menu options
            System.out.println("--- Customer Service Queue ---");
            System.out.println("1. Add Customer");
            System.out.println("2. Remove Customer");
            System.out.println("3. View Next Customer");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt(); // Get user choice

            switch (choice){
                case 1:
                 // Add a new customer
                    System.out.print("Enter Customer ID: ");
                    int customerId = scanner.nextInt();
                    customerQueue.add(customerId); // Add ID to queue
                    System.out.println("Customer added to the queue.");
                    break;
                case 2:
                // Remove a customer from the queue
                    if (!customerQueue.isEmpty()){
                        int removedCustomer = customerQueue.poll(); // Remove and get the head of the queue
                        System.out.println("Customer ID " + removedCustomer + " removed from the queue.");
                    }else{
                        System.out.println("The queue is empty. No customer to remove.");
                    }
                    break;
                case 3:
                 // View the next customer in the queue
                    if (!customerQueue.isEmpty()){
                        System.out.println("Next customer ID: " + customerQueue.peek()); // Peek at the head of the queue
                    }else{
                        System.out.println("The queue is empty. No next customer.");
                    }
                    break;
                case 4:
                // Exit the program
                    System.out.println("Exiting...");
                    break;
                default:
                // Handle invalid choices
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            System.out.println();
        } while (choice != 4); // Repeat until exit

        scanner.close();
    }
}