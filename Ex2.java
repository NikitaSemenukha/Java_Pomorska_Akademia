class Person {
    protected String firstName;
    protected String lastName;
    protected String dateOfBirth;

    public Person(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public void displayInfo() {
        System.out.println("Person Information:");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Date of Birth: " + dateOfBirth);
    }
}

class Student extends Person {
    private int year;
    private String group;
    private String studentId;

    public Student(String firstName, String lastName, String dateOfBirth, int year, String group, String studentId) {
        super(firstName, lastName, dateOfBirth);
        this.year = year;
        this.group = group;
        this.studentId = studentId;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Year: " + year);
        System.out.println("Group: " + group);
        System.out.println("Student ID: " + studentId);
    }
}

class FootballPlayer extends Person {
    private String position;
    private String club;
    private int goalsScored;

    public FootballPlayer(String firstName, String lastName, String dateOfBirth, String position, String club) {
        super(firstName, lastName, dateOfBirth);
        this.position = position;
        this.club = club;
        this.goalsScored = 0;
    }

    @Override
    public void displayInfo() {
        System.out.println("Football Player Information:");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Position: " + position);
        System.out.println("Club: " + club);
        System.out.println("Goals Scored: " + goalsScored);
    }

    public void scoreGoal() {
        goalsScored++;
        System.out.println("Goal scored!");
    }
}

public class Ex2 {
    public static void main(String[] args) {
        Person person = new Person("Nikita", "Semenukha", "2004-07-13");
        person.displayInfo();

        System.out.println();

        Student student = new Student("Nikita", "Semenukha", "2004-07-13", 3, "Group A", "12345");
        student.displayInfo();

        System.out.println();

        FootballPlayer player = new FootballPlayer("Nikita", "Semenukha", "2004-07-13", "Forward", "FC Barcelona");
        player.displayInfo();
        player.scoreGoal();
        player.scoreGoal();
        player.displayInfo();
    }
}