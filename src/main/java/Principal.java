public class Principal extends Staff{

    public Principal(String name, String gender, int age) {
        super(name, gender, age,"Principal");
    }

    public void admitApplicant(Person applicant, School school){
//        Admit applicants into different classes depending on their age.

            switch (applicant.getAge()){
                case 5:
                    school.getGrades().get(0).getStudents().add(applicant);
                    break;
                case 6:
                    school.getGrades().get(1).getStudents().add(applicant);
                    break;
                case 7:
                    school.getGrades().get(2).getStudents().add(applicant);
                    break;
                case 8:
                    school.getGrades().get(3).getStudents().add(applicant);
                    break;
                case 9:
                    school.getGrades().get(4).getStudents().add(applicant);
                    break;
                case 10:
                    school.getGrades().get(5).getStudents().add(applicant);
                    break;
                default:
                    System.out.println("Applicants age is outside of range required for admission.");

            }

    }

    public void expelStudent(Person student, Grade grade, School school){

        switch (grade.getName()) {
            case "One":
                school.getGrades().get(0).getStudents().remove(student);
                break;
            case "Two":
                school.getGrades().get(1).getStudents().remove(student);
                break;
            case "Three":
                school.getGrades().get(2).getStudents().remove(student);
                break;
            case "Four":
                school.getGrades().get(3).getStudents().remove(student);
                break;
            case "Five":
                school.getGrades().get(4).getStudents().remove(student);
                break;
            case "Six":
                school.getGrades().get(5).getStudents().remove(student);
                break;
            default:
                System.out.println("Grade does not belong in this school.");
        }

    }
}
