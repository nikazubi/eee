

public class ThreadClass implements Runnable{

    Hotel hotel;
    Motel motel;

    public ThreadClass(Hotel hotel) {
        this.hotel = hotel;
    }
    public ThreadClass(Motel motel) {
        this.motel = motel;
    }

    @Override
    public void run() {
        if (motel == null) {
            System.out.println("Welcome price for your room: "+hotel.rentPrice());
        }
        else
            System.out.println("Welcome price for your room: "+motel.rentPrice());
    }
}
