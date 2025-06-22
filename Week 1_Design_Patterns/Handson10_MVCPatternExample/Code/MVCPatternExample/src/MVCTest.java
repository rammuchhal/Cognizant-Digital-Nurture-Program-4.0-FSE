public class MVCTest {
    public static void main(String[] args) {

        System.out.println();
        
        Student student = new Student("Ram", "STU101", "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);

        controller.updateView();
        controller.setStudentName("Ram Muchhal");
        controller.setStudentGrade("A+");

        controller.updateView();
    }
}
