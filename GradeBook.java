/*
edith haggai
151790
23/1/2023
 */
public class GradeBook {
    private String courseName;

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }
    public void displayMessage() {
        System.out.println("welcome to:" + courseName);

    }
}
