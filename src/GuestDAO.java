import java.util.Arrays;
import java.util.List;

public class GuestDAO {
    static Guest[] guests = {
            new Guest("Nika","Zubi",20,5),
            new Guest("Nana","gvari1",21,50),
            new Guest("Ana","gvari2",22,4),
            new Guest("Nukri","gvari3",23,17),
            new Guest("Dato","gvari4",17,13),
            new Guest("Mari","gvari5",28,1)
    };
    static List<Guest> listOfGuest;

    GuestDAO(){
        listOfGuest = Arrays.asList(guests);
    }

    public static List<Guest> getGuests() {
        return listOfGuest;
    }

    public static void setGuests(List<Guest> listOfGuest) {
        GuestDAO.listOfGuest = listOfGuest;
    }

    public static void getListOfGuestLAMBDA() {
        listOfGuest.stream()
                 .forEach(x -> System.out.println(x.toString()));
    }

}
