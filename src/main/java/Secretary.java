public class Secretary extends NonAcademicStaff{
    public Secretary(String name, String gender, int age) {
        super(name, gender, age,"secretary", "administrative");
    }

//    Service provided by Secretary
    @Override
    public String service() {
        return this.getName() + " is a competent " + this.getRole() +" and provides excellent " + this.duty + " duties.";
    }
}
