public abstract class Staff extends Person{
    private String role;

    public Staff(String name, String gender, int age, String role) {
        super(name, gender, age);
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
