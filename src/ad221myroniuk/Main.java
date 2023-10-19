package ad221myroniuk;

class Person {
    private String lastName;
    private String firstName;
    private int age;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String printInfo() {
        return "Человек " + lastName + " " + firstName + ", возраст: " + age;
    }
}

class Student extends Person {
    private String group;
    private int studentId;

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String printInfo() {
        return "Студент группы " + group + " " + getLastName() + " " + getFirstName() + ", возраст: " + getAge() +
                ". Номер студенческого билета: " + studentId;
    }
}

class Lecturer extends Person {
    private String department;
    private double salary;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String printInfo() {
        return "Преподаватель кафедры " + department + " " + getLastName() + " " + getFirstName() +
                ", возраст: " + getAge() + ". Зарплата: " + salary;
    }
}

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setLastName("Иванов");
        person1.setFirstName("Иван");
        person1.setAge(30);

        Student student1 = new Student();
        student1.setLastName("Петров");
        student1.setFirstName("Петр");
        student1.setAge(20);
        student1.setGroup("A123");
        student1.setStudentId(12345);

        Lecturer lecturer1 = new Lecturer();
        lecturer1.setLastName("Сидоров");
        lecturer1.setFirstName("Сергей");
        lecturer1.setAge(40);
        lecturer1.setDepartment("Математика");
        lecturer1.setSalary(50000);

        Person[] people = {person1, student1, lecturer1};

        for (Person person : people) {
            System.out.println(person.printInfo());
        }
    }
}
