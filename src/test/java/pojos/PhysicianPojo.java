package pojos;


import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PhysicianPojo {

    private Integer id;
    private String firstName;
    private String lastName;
    private String phone;

    public PhysicianPojo() {
    }

    public PhysicianPojo(Integer id, String firstName, String lastName, String phone) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public PhysicianPojo(String batch81, String s, int i, String doktor, String kaya, String s1, String s2, String male, String apositive, String s3, String s4, UserPojo user, String nuclearMedicine, Object o, Object o1, double v, String s5, Object o2) {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getphone() {
        return phone;
    }

    public void setSsn(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "PhysicianPojo{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

