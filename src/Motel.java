



public class Motel extends CleaningService implements RentBildings{
    String motelName;
    double pricePerHourse;
    Guest guest;


    public Motel() {
    }

    public Motel(Guest guest, String motelName, double pricePerHourse) {
        this.motelName = motelName;
        this.pricePerHourse = pricePerHourse;
        this.guest = guest;
        CleaningService.cleanRoom();
    }

    void cleanMotel(){
        // აქ წარმოდგენილია ის ვარიანტი როდესაც შვილი პირდაპირ იყენებს მშობლის მეთოდს ხოლო Hotel-ში
        // მემკვიდრეობის გარეშე ობიექტის დახმარებით შეუძლია ამ მეთოდის გამოყენება
        this.cleanFullObject();
    }


    @Override
    public double rentPrice() {
        double price =  (guest.getDaysForRent() * 24) * pricePerHourse;
        return price;
    }

    public String getMotelName() {
        return motelName;
    }

    public void setMotelName(String motelName) {
        this.motelName = motelName;
    }

    public double getPricePerHourse() {
        return pricePerHourse;
    }

    public void setPricePerHourse(double pricePerHourse) {
        this.pricePerHourse = pricePerHourse;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    @Override
    public String toString() {
        return "Motel{" +
                "motelName='" + motelName + '\'' +
                ", pricePerHourse=" + pricePerHourse +
                ", guest=" + guest +
                '}';
    }
}
