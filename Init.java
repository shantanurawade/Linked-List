import java.util.Scanner;

public class Init {
    public void init() {
        LinkedList list = new LinkedList();
        System.out.println("Welcome to implementation of LinkedList.");
        // Flag is used to exit from loop
        int flag = 0;
        while (flag == 0) {
            
            //Giving choices to choose
            System.out.println("1.Add to end of list.");
            System.out.println("2.Add to start of list.");
            System.out.println("3.Add at Index of list.");
            System.out.println("4.Delete element from list.");
            System.out.println("5.Print entire list.");
            System.out.println("6.Exit.");
            System.out.print("-->");
            Scanner userChoise = new Scanner(System.in);
            int userChoice = userChoise.nextInt();

            switch (userChoice) {
                case 1 -> {
                    System.out.println("Enter the number you want to add at end.");
                    int elementEnd = userChoise.nextInt();
                    list.addToTail(elementEnd);
                }
                case 2 -> {
                    System.out.println("Enter the number you want to add at start.");
                    int elementStart = userChoise.nextInt();
                    list.addToHead(elementStart);
                }
                case 3 -> {
                    System.out.println("Enter the index at which you want to add.");
                    int index = userChoise.nextInt();
                    System.out.println("Enter the number you want to add at " + index + " end.");
                    int elementIndex = userChoise.nextInt();
                    list.addAtIndex(index, elementIndex);
                }
                case 4 -> {
                    System.out.println("1.For deleting element by key.");
                    System.out.println("2.For deleting element by index.");
                    int choice1 = userChoise.nextInt();
                    switch (choice1) {
                        case 1 -> {
                            System.out.println("Enter Element which you want to delete.");
                            int elementToDelete = userChoise.nextInt();
                            list.deleteByKey(elementToDelete);
                        }
                        case 2 -> {
                            System.out.println("Enter Index of element which you want to delete.");
                            int indexToDelete = userChoise.nextInt();
                            list.deleteByIndex(indexToDelete);
                        }
                    }
                }
                case 5 -> {
                    System.out.println("Here is you list.");
                    list.show();
                    System.out.println();
                }
                case 6 -> flag = 1;
                default -> {
                    System.out.println("Invalid input......");
                    System.out.println("Enter the value from below options.");
                }
            }
        }
        System.out.println("Thank you for using Linked List....");
    }
}
