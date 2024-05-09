
/**
 * VideoStore
 */

public class VideoStore 
{
    Video[] store; 
    int count;

    // Constructor
    public VideoStore(int size) {
        store = new Video[size];
        count = 0;
    }

    // member functions
    void addVideo(String name) {
        if (count < store.length) {
            store[count] = new Video(name);
            count++;
        } else {
            System.out.println("Store is full, cannot add more videos.");
        }
    }

    void doCheckout(String name) {
        for (int i = 0; i < count; i++) {
            if (store[i].getName().equals(name)) {
                if (!store[i].getCheckout()) {
                    store[i].doCheckout();
                    System.out.println("Video " + name + " checked out successfully.");
                } else {
                    System.out.println("Video " + name + " is already checked out.");
                }
                return;
            }
        }
        System.out.println("Video " + name + " not found in the store.");
    }

    
    void doReturn(String name) {
        for (int i = 0; i < count; i++) {
            if (store[i].getName().equals(name)) {
                if (store[i].getCheckout()) {
                    store[i].doReturn();
                    System.out.println("Video " + name + " returned successfully.");
                } else {
                    System.out.println("Video " + name + " is not checked out.");
                }
                return;
            }
        }
        System.out.println("Video " + name + " not found in the store.");
    }


    void receiveRating(String name, int rating) 
    {
        for (int i = 0; i < count; i++) 
        {
            if ( store[i].getName().equals(name) ) 
            {
                store[i].receiveRating(rating);
                System.out.println("Rating " + rating + " received for video " + name + ".");
                return;
            }
        }
        System.out.println("Video " + name + " not found in the store.");
    }

    void listInventory() 
    {
        System.out.println("Inventory of the store:");
        for (int i = 0; i < count; i++) {
            System.out.println("Video Name: " + store[i].getName());
            System.out.println("Rating: " + (store[i].getRating() == -1 ? "Not Rated" : store[i].getRating()));
            System.out.println("Checkout: " + (store[i].getCheckout() ? "Yes" : "No"));
        }
    }
}
