public abstract class NonAcademicStaff extends Staff {
    String duty;
    public NonAcademicStaff(String name, String gender, int age, String role, String duty) {
        super(name, gender, age, role);
        this.duty = duty;
    }

    public String getDuty() {
        return duty;
    }

    abstract String service();
}
