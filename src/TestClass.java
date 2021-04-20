import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestClass {
    // ვინაიდან არ იყო მოთხოვნილი მთელი კონცეფციის ჩვენება და მხოლოდ ფუნქციონალის
    // მე ტესტ კლასში წარმოგიდგენთ ნაკადების შედეგად ინტერფეისისგან იმპლემენტირებული მეთოდის გამოყენებას
    // თვითონ OOP კონცეფცია წარმოდგენილია დანარჩენ კლასებში
    public static void main(String[] args) throws InterruptedException {
        GuestDAO a = new GuestDAO();

        System.out.println("\nAll Guests:");
        GuestDAO.getListOfGuestLAMBDA();

        System.out.println("\nBefore we start giving you a room, we need to clean it");
        Hotel h = new Hotel(); Motel m = new Motel();
        h.clearBilding();
        m.cleanFullObject();

        System.out.println("\nNow we can give you a rooms:");
        ThreadClass[] array = new ThreadClass[6];
        List<Guest> list = GuestDAO.getGuests();
        for (int i=0;i<6;i++){
            Hotel hotel = new Hotel(null, "Biltmore", 25.2+i);
            Motel motel = new Motel(null,"PandaMotel",7.2+i);
            if (i%2==0){
                hotel.setGuest(list.get(i));
                array[i] = new ThreadClass(hotel);
            }
            else {
                motel.setGuest(list.get(i));
                array[i] = new ThreadClass(motel);
            }
        }
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (ThreadClass i : array){
            executorService.execute(i);
        }
        executorService.shutdown();
        boolean tasksEnded = executorService.awaitTermination(5, TimeUnit.MINUTES);
        if (tasksEnded) {
            System.out.println("This is price for your friends");
        }
        else System.out.println("sorry :(");

    }
}
