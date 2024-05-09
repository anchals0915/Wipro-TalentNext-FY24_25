/**
 * Video
 */
public class Video {

    // member variables
    private String videoName;
    private boolean checkout;
    private int rating;

    // Constructors
    public Video(String name) {
        videoName = name;
        checkout = false; // Initially not checked out
        rating = -1; // Default rating when not rated yet
    }

    // member functions
    public String getName() {
        return videoName;
    }

    public void doCheckout() {
        checkout = true; // Mark as checked out
    }

    public void doReturn() {
        checkout = false; // Mark as returned
    }

    public void receiveRating(int rating) {
        this.rating = rating; // Set the rating
    }

    public int getRating() {
        return rating;
    }

    public boolean getCheckout() {
        return checkout;
    }
}
