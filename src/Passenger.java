public class Passenger {
    private String firstName;
    private String lastName;
    private String fullName;
    private int age;
    public BoardingPass boardingPass;

    public Passenger(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.fullName = firstName.substring(0, 1) + " " + lastName;
        this.boardingPass = null;
    }

    public BoardingPass getBoardingPass() {
        return boardingPass;
    }

    public void setBoardingPass(Gate gate) {
        this.boardingPass = new BoardingPass(firstName, lastName, age, gate);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }
}
