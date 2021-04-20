



public class Hotel implements RentBildings{
    String name;
    double pricePerRoom;
    Guest guest;

    public Hotel() {
    }

    public Hotel(Guest guest, String name, double pricePerRoom) {
        this.name = name;
        this.pricePerRoom = pricePerRoom;
        CleaningService.cleanRoom();
        this.guest = guest;
    }

    void clearBilding(){
        CleaningService c = new CleaningService();
        c.cleanFullObject();
    }

    @Override
    public double rentPrice() {
        double price = guest.getDaysForRent() * pricePerRoom;
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPricePerRoom() {
        return pricePerRoom;
    }

    public void setPricePerRoom(double pricePerRoom) {
        this.pricePerRoom = pricePerRoom;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", pricePerRoom=" + pricePerRoom +
                ", guest=" + guest +
                '}';
    }
}
