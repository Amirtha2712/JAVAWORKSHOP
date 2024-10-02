public class SimpleSwitch {
    public static void main(String[] args) {
        int choice = 3; 

        switch (choice) {
            case 1:
                System.out.println("You choose 1");
                break;
            case 2:
                System.out.println("You choose 2");
                break;
            case 3:
                System.out.println("You choose 3");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}