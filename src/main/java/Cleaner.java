public class Cleaner extends NonAcademicStaff {
    public Cleaner(String name, String gender, int age) {
        super(name, gender, age,"cleaner", "ancillary");
    }

//    Service provided by cleaner
    @Override
    public String service() {
        return this.getName() + " is a " + this.getRole() +" and provides " + this.duty + " support.";
    }
}
