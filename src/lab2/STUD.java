package lab2;

public class STUD {
    public static void main(String[] vma) {
        Student student = new Student("Konstantin", "Mukhin", "bap1801", 5);
        Aspirant aspirant = new Aspirant("Dmitry", "Panov", "IB", 4, "5G");
        Student un = new Aspirant("Marat", "Mingaleev", "bap1801", 5, "IoT");
        Student[] students = { student, aspirant, un };
        for (Student s : students)
            System.out.println("Сумма стипендии " + s.lastName+ ": " + s.getScholarship());
    }
    public static class Student {
        String firstName, lastName, group;
        double averageMark;
        public Student(String firstName, String lastName, String group, double averageMark) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.group = group;
            this.averageMark = averageMark;
        }
        int getScholarship() {
            return averageMark == 5 ? 100 : 80;
        }
    }
    public static class Aspirant extends Student {
        String scientificWork;
        public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
            super(firstName, lastName, group, averageMark);
            this.scientificWork = scientificWork;
        }
        @Override
        public int getScholarship() {
            return averageMark == 5 ? 200 : 180;
        }
    }
}
