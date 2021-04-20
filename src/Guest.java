public class Guest {

    private String name;
    private String surname;
    private int age;
    private int daysForRent;

    public Guest() {
    }

    public Guest(String name, String surname, int age, int daysForRent) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.daysForRent = daysForRent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDaysForRent() {
        return daysForRent;
    }

    public void setDaysForRent(int daysForRent) {
        this.daysForRent = daysForRent;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", daysForRent=" + daysForRent +
                '}';
    }
}
