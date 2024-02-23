

import java.util.ArrayList;
import java.util.List;

abstract class Course {
    private String title;
    private String code;
    private int credits;

    public Course(String title, String code, int credits) {
        this.title = title;
        this.code = code;
        this.credits = credits;
    }

    public String getTitle() {
        return title;
    }

    public String getCode() {
        return code;
    }

    public int getCredits() {
        return credits;
    }

    public abstract void displayDetails();
}

class ComputerScienceCourse extends Course {
    private String programmingLanguage;
    private List<String> prerequisites;

    public ComputerScienceCourse(String title, String code, int credits, String programmingLanguage, List<String> prerequisites) {
        super(title, code, credits);
        this.programmingLanguage = programmingLanguage;
        this.prerequisites = prerequisites;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public List<String> getPrerequisites() {
        return prerequisites;
    }

    
    public void displayDetails() {
        System.out.println("Computer Science Course: " + getTitle() + " (Code: " + getCode() + ")");
        System.out.println("Credits: " + getCredits());
        System.out.println("Programming Language: " + getProgrammingLanguage());
        System.out.println("Prerequisites: " + String.join(", ", getPrerequisites()));
        System.out.println();
    }
}

class MathematicsCourse extends Course {
    private String focusOnTheorem;
    private String requiredTextbook;

    public MathematicsCourse(String title, String code, int credits, String focusOnTheorem, String requiredTextbook) {
        super(title, code, credits);
        this.focusOnTheorem = focusOnTheorem;
        this.requiredTextbook = requiredTextbook;
    }

    public String getFocusOnTheorem() {
        return focusOnTheorem;
    }

    public String getRequiredTextbook() {
        return requiredTextbook;
    }

 
    public void displayDetails() {
        System.out.println("Mathematics Course: " + getTitle() + " (Code: " + getCode() + ")");
        System.out.println("Credits: " + getCredits());
        System.out.println("Focus on Theorem: " + getFocusOnTheorem());
        System.out.println("Required Textbook: " + getRequiredTextbook());
        System.out.println();
    }
}

class LiteratureCourse extends Course {
    private String literaryPeriodOrGenre;
    private List<String> requiredReadingList;

    public LiteratureCourse(String title, String code, int credits, String literaryPeriodOrGenre, List<String> requiredReadingList) {
        super(title, code, credits);
        this.literaryPeriodOrGenre = literaryPeriodOrGenre;
        this.requiredReadingList = requiredReadingList;
    }

    public String getLiteraryPeriodOrGenre() {
        return literaryPeriodOrGenre;
    }

    public List<String> getRequiredReadingList() {
        return requiredReadingList;
    }


    public void displayDetails() {
        System.out.println("Literature Course: " + getTitle() + " (Code: " + getCode() + ")");
        System.out.println("Credits: " + getCredits());
        System.out.println("Literary Period or Genre: " + getLiteraryPeriodOrGenre());
        System.out.println("Required Reading List: " + String.join(", ", getRequiredReadingList()));
        System.out.println();
    }
}

class CourseCatalog {
    private List<Course> courses;

    public CourseCatalog() {
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void displayCatalog() {
        for (Course course : courses) {
            course.displayDetails();
        }
    }
}

public class CourseManagement {
    public static void main(String[] args) {
        CourseCatalog courseCatalog = new CourseCatalog();

        ComputerScienceCourse csCourse = new ComputerScienceCourse("Introduction to Java", "CS101", 3, "Java", List.of("Basic Programming"));
        MathematicsCourse mathCourse = new MathematicsCourse("Calculus I", "MATH101", 4, "Limits and Continuity", "Calculus: Early Transcendentals");
        LiteratureCourse litCourse = new LiteratureCourse("American Literature", "LIT101", 3, "19th Century", List.of("The Scarlet Letter", "Moby-Dick", "Uncle Tom's Cabin"));

        courseCatalog.addCourse(csCourse);
        courseCatalog.addCourse(mathCourse);
        courseCatalog.addCourse(litCourse);

        courseCatalog.displayCatalog();
    }
}