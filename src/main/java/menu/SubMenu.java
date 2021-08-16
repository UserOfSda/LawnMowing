package menu;

import model.Customers;
import model.LawnMowers;
import model.LawnMowingEquipment;
import model.Pricing;
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
        this.repositoryCustomers = new RepositoryCustomers();
        this.repositoryLawnMowers = new RepositoryLawnMowers();
        this.repositoryLawnMowingEquipment = new RepositoryLawnMowingEquipment();
        this.repositoryPricing = new RepositoryPricing();
        this.repositoryWorkschedule = new RepositoryWorkschedule();
    }

    private int menuOptions(Scanner input) {
        System.out.println("\n***********************");
        System.out.println("Select the option menu: ");
        System.out.println("***********************\n");
        System.out.println();
        System.out.println("0: Close menu");
        System.out.println("1: List all customers");
        System.out.println("2: List all customers sorted by address");
        System.out.println("3: List all customers sorted by working area");
        System.out.println("4: Add new customer");
        System.out.println("5: Update customers");
        System.out.println("6: List all equipment");
        System.out.println("7: Update equipment");
        System.out.println("8: Show pricing");
        System.out.println("9: Update pricing");
        System.out.println("10: Show workschedule");
        System.out.println("11: Update workschedule");
        System.out.println("12: List all workers");
        System.out.println("13: Update workers");

        return input.nextInt();
    }

    public void menuChoice(Scanner input) {

        int userChoice;
        do {
            userChoice = menuOptions(input);
            switch (userChoice) {
                case 0:
                    DBUtil.shutdown();
                    input.close();
                    break;
                case 1:
                    listAllCustomers();
                    break;
                case 2:
                    listAllCustomersByAddress();
                    break;
                case 3:
                    listAllCustomersByWorkingArea();
                    break;
                case 4:
                    addNewCustomer(input);
                    break;
                case 5:
                    updateCustomer(input);
                    break;
                case 6:
                    listAllEquipment();
                    break;
                case 7:
                    updateEquipment();
                    break;
                case 8:
                    showPricing();
                    break;
                case 9:
                    updatePricing();
                    break;
                case 10:
                    showWorkschedule();
                    break;
                case 11:
                    updateWorkschedule();
                    break;
                case 12:
                    listAllWorkers();
                    break;
                case 13:
                    updateWorkers();
                    break;


                default:
                    System.out.println("\nSorry, please enter valid Option");
                    menuOptions(input);
                    break;
            }
        } while (userChoice != 0);
        System.out.println("Menu Closed");
    }


    private void listAllCustomers() {
        List<Customers> listOfCustomers = repositoryCustomers.listAllCustomers();
        System.out.println("\nList of customers:");
        for (Customers customerslist : listOfCustomers) {
            System.out.println(customerslist.getCustomerId() + ". Name: " + customerslist.getCustomerName() + ". Phone number: " + customerslist.getCustomerPhoneNumber() + ". Address: " + customerslist.getCustomerAddress() + ". Email: " + customerslist.getCustomerEmail() + ". Working area: " + customerslist.getCustomerWorkingArea() + "m2.");
        }
    }

    public void listAllCustomersByAddress() {
        List<Customers> listOfCustomersByAddress = repositoryCustomers.listAllCustomersByAddress();
        System.out.println("\nList all customers sorted by address:");
        for (Customers customerslistSortedByAddress : listOfCustomersByAddress) {
            System.out.println(customerslistSortedByAddress.getCustomerId() + ". Name: " + customerslistSortedByAddress.getCustomerName() + ". Address: " + customerslistSortedByAddress.getCustomerAddress() + ". Working area: " + customerslistSortedByAddress.getCustomerWorkingArea() + "m2.");
        }
    }

    public void listAllCustomersByWorkingArea() {
        List<Customers> listOfCustomersByWorkingArea = repositoryCustomers.listAllCustomersByWorkingArea();
        System.out.println("\nList all customers sorted by working area:");
        for (Customers customerslistSortedByWorkingArea : listOfCustomersByWorkingArea) {
            System.out.println(customerslistSortedByWorkingArea.getCustomerId() + ". Name: " + customerslistSortedByWorkingArea.getCustomerName() + ". Address: " + customerslistSortedByWorkingArea.getCustomerAddress() + ". Working area: " + customerslistSortedByWorkingArea.getCustomerWorkingArea() + "m2.");
        }
    }

    public void addNewCustomer(Scanner input) {
        System.out.println("Type the name");
        String name = input.next();
        System.out.println("Type the address");
        String address = input.next();
        System.out.println("Type the phone number");
        String phoneNr = input.next();
        System.out.println("Type the email");
        String email = input.next();
        System.out.println("Type the working area");
        int workingarea = input.nextInt();

        Customers customers = new Customers();
        customers.setCustomerName(name);
        customers.setCustomerAddress(address);
        customers.setCustomerPhoneNumber(phoneNr);
        customers.setCustomerEmail(email);
        customers.setCustomerWorkingArea(workingarea);

        repositoryCustomers.addCustomer(customers);
        System.out.println("Customer added to the list");
    }

    public void updateCustomer(Scanner input) {
        System.out.println("Type the Customer ID");
        int id = input.nextInt();
        System.out.println("Choose from options what do you want to change");
        System.out.println("1. Don't change anything");
        System.out.println("2. Change name");
        System.out.println("3. Change phone number");
        System.out.println("4. Change address");
        System.out.println("5. Change email");
        System.out.println("6. Change size of a working area");
        int nr = input.nextInt();

        Customers customers = new Customers();
        switch (menuOptions(input)){
            case 1:
                input.close();
                System.out.println("Nothing changed");
            case 2:
                System.out.println("Type the name");
                String name = input.next();
                customers.setCustomerName(input.next());
                repositoryCustomers.updateCustomer(customers);
            case 3:
                customers.setCustomerPhoneNumber(input.next());
            case 4:
                customers.setCustomerAddress(input.next());
            case 5:
                customers.setCustomerEmail(input.next());
            case 6:
                customers.setCustomerWorkingArea(input.nextInt());


            repositoryCustomers.updateCustomer(customers);
            System.out.println("Customer info updated");

        }
    }

    public void listAllEquipment() {
        List<LawnMowingEquipment> listOfEquipment = repositoryLawnMowingEquipment.listAllEquipment();
        System.out.println("\nList of equipment:");
        for (LawnMowingEquipment equipmentlist : listOfEquipment) {
            System.out.println(equipmentlist.getEquipmentId() + ". Name: " + equipmentlist.getEquipmentName() + ". workCapacity: " + equipmentlist.getWorkCapacity()+ " m2/h.");
        }

    }

    public void updateEquipment() {

    }

    public void showPricing() {
        List<Pricing> pricelist = repositoryPricing.listOfPricing();
        System.out.println("\nList of prices:");
        for (Pricing prices : pricelist) {
            System.out.println(prices.getPriceId() + ". Description: " + prices.getDescription() +". Price for work ..." + " eur/m2.");
        }

    }

    public void updatePricing() {

    }

    public void showWorkschedule() {

    }

    public void updateWorkschedule() {

    }

    public void listAllWorkers() {
        List<LawnMowers> workers = repositoryLawnMowers.listOfWorkers();
        System.out.println("\nList of workers:");
        for (LawnMowers lawnMowers : workers) {
            System.out.println(lawnMowers.getLawnMowerID() + ". Name: " + lawnMowers.getLawnmowerName() +". Phone number: " + lawnMowers.getLawnmowerPhoneNumber()+ ". Salary: " + lawnMowers.getLawnmowerSalary() + " eur/month.");
        }

    }

    public void updateWorkers() {

    }
}