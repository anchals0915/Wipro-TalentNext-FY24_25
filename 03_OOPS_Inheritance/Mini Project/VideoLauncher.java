import java.util.Scanner;

/**
 * VideoLauncher
 */
public class VideoLauncher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VideoStore store = new VideoStore(10); // Assuming a maximum of 10 videos

        do {
            System.out.println("MAIN MENU ");
            System.out.println("===================================");
            System.out.println("1. Add Video:");
            System.out.println("2. Check Out Video : ");
            System.out.println("3. Return Video : ");
            System.out.println("4. Receive Rating : ");
            System.out.println("5. List Inventory : ");
            System.out.println("6. Exit : ");
            System.out.println("===================================");
            System.out.println("Enter your choice (1..6) : ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1 -> {
                    System.out.println("Name of the Video: ");
                    String name = sc.next();
                    store.addVideo(name);
                    System.out.println("Video added successfully.");
                }
                case 2 -> {
                    System.out.println("Name of the Video to check out: ");
                    String name = sc.next();
                    store.doCheckout(name);
                }
                case 3 -> {
                    System.out.println("Name of the Video to return: ");
                    String name = sc.next();
                    store.doReturn(name);
                }
                case 4 -> {
                    System.out.println("Name of the Video to rate: ");
                    String name = sc.next();
                    System.out.println("Enter the rating: ");
                    int rating = sc.nextInt();
                    store.receiveRating(name, rating);
                }
                case 5 -> {
                    store.listInventory();
                }
                case 6 -> {
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                }
                default -> {
                    System.out.println("Invalid Choice !!! ");
                }
            }
        } while (true);
    }
}
