public class Students extends Person{
    private int subjects;
    private int studentId;
    private String grade;
    private int degree;
    public static String gender = "Male";



    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public int getSubjects() {
        return subjects;
    }

    public void setSubjects(int subjects) {
        this.subjects = subjects;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void avgDegree(double degree, double numOfSubjects){
        System.out.println("the average degree for the student " + getName() + ": "+ degree / numOfSubjects);
    }

    public static void printNationality(String nationality){
        System.out.println("the nationality : " + nationality);
    }
}
