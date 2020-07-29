public class Applicant extends Person{

    public Applicant(String name, String gender, int age) {
        super(name, gender, age);
    }

    public void applyForAdmission(School school){
        school.acceptApplicant(this);
    }

}
