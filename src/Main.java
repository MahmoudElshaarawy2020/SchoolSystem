public class Main {
    public static void main(String[] args) {
        Students student1 = new Students();
        student1.setStudentId(12345);
        student1.setGrade("grade 5");
        student1.setSubjects(5);
        student1.setName("Khaled");
        student1.setDegree(90);

        Person person1 = new Person();
        person1.setNationality("Japanese");

        student1.avgDegree(student1.getDegree(), student1.getSubjects());
        System.out.println(Students.gender);

        Students.printNationality(person1.getNationality());



    }
}