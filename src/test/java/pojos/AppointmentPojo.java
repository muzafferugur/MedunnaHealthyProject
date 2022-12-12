package pojos;


import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class AppointmentPojo {

    private Integer id;
    private String status;
    private PhysicianPojo physician;

    public AppointmentPojo() {
    }

    public AppointmentPojo(Integer id, String status, PhysicianPojo physician) {
        this.id = id;
        this.status = status;
        this.physician = physician;
    }

    public AppointmentPojo(String hastack, String s, int i, String s1, String s2, String completed, Object o, Object o1, Object o2, Object o3, Object o4, PhysicianPojo physician, PatientPojo patient, Object o5) {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PhysicianPojo getPhysician() {
        return physician;
    }

    public void setPhysician(PhysicianPojo physician) {
        this.physician = physician;
    }

    @Override
    public String toString() {
        return "AppointmentPojo{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", physician=" + physician +
                '}';
    }
}
