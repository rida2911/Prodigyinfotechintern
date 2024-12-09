// task 3

import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    String name;
    String phone;
    String email;

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phone + ", Email: " + email;
    }
}

public class ContactManagementSystem {

    public static void main(String[] args) {
        ArrayList<Contact> contacts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nContact Management System");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Edit Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone: ");
                    String phone = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    contacts.add(new Contact(name, phone, email));
                    System.out.println("Contact added successfully.");
                    break;

                case 2:
                    System.out.println("\nContact List:");
                    if (contacts.isEmpty()) {
                        System.out.println("No contacts found.");
                    } else {
                        for (int i = 0; i < contacts.size(); i++) {
                            System.out.println((i + 1) + ". " + contacts.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.println("\nEnter the number of the contact to edit:");
                    int editIndex = scanner.nextInt() - 1;
                    scanner.nextLine();
                    if (editIndex >= 0 && editIndex < contacts.size()) {
                        System.out.print("Enter new name: ");
                        contacts.get(editIndex).name = scanner.nextLine();
                        System.out.print("Enter new phone: ");
                        contacts.get(editIndex).phone = scanner.nextLine();
                        System.out.print("Enter new email: ");
                        contacts.get(editIndex).email = scanner.nextLine();
                        System.out.println("Contact updated successfully.");
                    } else {
                        System.out.println("Invalid contact number.");
                    }
                    break;

                case 4:
                    System.out.println("\nEnter the number of the contact to delete:");
                    int deleteIndex = scanner.nextInt() - 1;
                    scanner.nextLine();
                    if (deleteIndex >= 0 && deleteIndex < contacts.size()) {
                        contacts.remove(deleteIndex);
                        System.out.println("Contact deleted successfully.");
                    } else {
                        System.out.println("Invalid contact number.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting Contact Management System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}

