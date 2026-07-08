package Project;

import java.util.ArrayList;

public class VideoStore {

    ArrayList<Video> store = new ArrayList<>();

    public void addVideo(String name) {
        store.add(new Video(name));
        System.out.println("Video \"" + name + "\" added successfully.");
    }

    public void doCheckout(String name) {
        for (Video v : store) {
            if (v.getName().equalsIgnoreCase(name)) {
                v.doCheckout();
                System.out.println("Video \"" + name + "\" checked out successfully.");
                return;
            }
        }
        System.out.println("Video not found.");
    }

    public void doReturn(String name) {
        for (Video v : store) {
            if (v.getName().equalsIgnoreCase(name)) {
                v.doReturn();
                System.out.println("Video \"" + name + "\" returned successfully.");
                return;
            }
        }
        System.out.println("Video not found.");
    }

    public void receiveRating(String name, int rating) {
        for (Video v : store) {
            if (v.getName().equalsIgnoreCase(name)) {
                v.receiveRating(rating);
                System.out.println("Rating \"" + rating +
                        "\" has been mapped to the Video \"" +
                        name + "\".");
                return;
            }
        }
        System.out.println("Video not found.");
    }

    public void listInventory() {
        System.out.println("-----------------------------------------------");
        System.out.printf("%-15s %-20s %-10s\n",
                "Video Name",
                "Checkout Status",
                "Rating");
        System.out.println("-----------------------------------------------");

        for (Video v : store) {
            System.out.printf("%-15s %-20s %-10d\n",
                    v.getName(),
                    v.getCheckout(),
                    v.getRating());
        }

        System.out.println("-----------------------------------------------");
    }
}
