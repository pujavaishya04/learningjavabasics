package Learning;

public class User {
    int id;
    String email;
    private int phone;
    protected String name;
    private String gender;
    boolean isActive; // default false


    public User (String email, Integer p) {
        this.email = email;
        phone = p;
    }

    public User (int id, String email, Integer p, String name, boolean available) {
        this.id = id;
        this.email = email;
        this.phone = p;
        this.name = name;
        this.isActive = available;
    }

    public User () {}


    public void setPhone(int phone) {
        this.phone = phone;
    }
//    public int getPhone() {
//        return phone;
//    }

    @Override
    public String toString() {
        return "User{" +
                "id = '" + id + '\'' +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", isActive=" + isActive +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
