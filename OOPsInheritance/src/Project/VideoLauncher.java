package Project;

import java.util.Scanner;

public class VideoLauncher {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        VideoStore store = new VideoStore();

        int choice;

        do {
            System.out.println("\nMAIN MENU");
            System.out.println("==========");
            System.out.println("1.Add Videos:");
            System.out.println("2.Check Out Video :");
            System.out.println("3.Return Video :");
            System.out.println("4.Receive Rating :");
            System.out.println("5.List Inventory :");
            System.out.println("6.Exit :");

            System.out.print("Enter your choice (1..6): ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print(
                            "Enter the name of the video you want to add: ");
                    String addVideo = sc.nextLine();
                    store.addVideo(addVideo);
                    break;

                case 2:
                    System.out.print(
                            "Enter the name of the video you want to check out: ");
                    String checkVideo = sc.nextLine();
                    store.doCheckout(checkVideo);
                    break;

                case 3:
                    System.out.print(
                            "Enter the name of the video you want to Return: ");
                    String returnVideo = sc.nextLine();
                    store.doReturn(returnVideo);
                    break;

                case 4:
                    System.out.print(
                            "Enter the name of the video you want to Rate: ");
                    String rateVideo = sc.nextLine();

                    System.out.print(
                            "Enter the rating for this video: ");
                    int rating = sc.nextInt();

                    store.receiveRating(rateVideo, rating);
                    break;

                case 5:
                    store.listInventory();
                    break;

                case 6:
                    System.out.println(
                            "Exiting...!! Thanks for using the application.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}