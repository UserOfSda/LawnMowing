package menu;

import model.Customers;
import persistence.*;
import util.DBUtil;

import java.util.List;
import java.util.Scanner;

public class SubMenu {
    private RepositoryCustomers repositoryCustomers;
    private RepositoryLawnMowers repositoryLawnMowers;
    private RepositoryLawnMowingEquipment repositoryLawnMowingEquipment;
    private RepositoryPricing repositoryPricing;
    private RepositoryWorkschedule repositoryWorkschedule;

    public SubMenu() {
        this.repositoryCustomers = repositoryCustomers;
        this.repositoryLawnMowers = repositoryLawnMowers;
        this.repositoryLawnMowingEquipment = repositoryLawnMowingEquipment;
        this.repositoryPricing = repositoryPricing;
        this.repositoryWorkschedule = repositoryWorkschedule;
    }

    private int menuOptions(Scanner input) {
        System.out.println("\n***********************");
        System.out.println("Select the option menu: ");
        System.out.println("***********************\n");
        System.out.println();
        System.out.println("1: List all customers");
        System.out.println("2: ");
        System.out.println("3: ");
        System.out.println("4: ");
        System.out.println("5: ");
        System.out.println("6: ");
        System.out.println("7: ");
        System.out.println("8: ");
        System.out.println("9: ");
        System.out.println("10 - Quit");

        return input.nextInt();
    }
    public void menuChoice(Scanner input) {

        int userChoice;
        do {
            userChoice = menuOptions(input);
            switch (userChoice) {
                case 1:
                    listAllCustomers(input);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9: ;
                    break;
                case 10:
                    DBUtil.shutdown();
                    input.close();
                    break;
                default:
                    System.out.println("\nSorry, please enter valid Option");
                    menuOptions(input);
                    break;
            }// End of switch statement
        } while (userChoice != 10);
        System.out.println("Menu Closed");
    }

    private void listAllCustomers(Scanner input) {
        List<Customers> listOfCustomers =repositoryCustomers.listAllCustomers();
        System.out.println("\nList of customers:");
        for (Customers customerslist : listOfCustomers) {
            System.out.println("Name: " + customerslist.getCustomerName() + " Phone number: " + customerslist.getCustomerPhoneNumber() + " Email: " + customerslist.getCustomerEmail());
        }
    }


}
