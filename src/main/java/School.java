import java.util.ArrayList;
import java.util.List;

public class School {

    private String name;
    private String location;
    private int yearEstablished;
    private List<Staff> staffList = new ArrayList<Staff>();
    private List<Applicant> applicants = new ArrayList<Applicant>();
    private List<Grade> grades = new ArrayList<Grade>();


    public School(String name, String location, int yearEstablished) {
        this.name = name;
        this.location = location;
        this.yearEstablished = yearEstablished;

//        Initialize all grades as school is being created.
        grades.add(new Grade("One"));
        grades.add(new Grade("Two"));
        grades.add(new Grade("Three"));
        grades.add(new Grade("Four"));
        grades.add(new Grade("Five"));
        grades.add(new Grade("Six"));
    }

    public String getName() {
        return name;
    }

    public int getYearEstablished() {
        return yearEstablished;
    }

    public List<Staff> getStaffList() {
        return staffList;
    }

    public List<Applicant> getApplicants() {
        return applicants;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void employStaff(Staff staff){
        this.staffList.add(staff);
    }

    public void acceptApplicant(Applicant applicant) {
        this.applicants.add(applicant);
    }

}
