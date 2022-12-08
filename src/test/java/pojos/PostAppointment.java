package pojos;

import lombok.*;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Data  // getter setter tostring
@NoArgsConstructor   // parametresiz cons.
@AllArgsConstructor  // parametreli cons.
@JsonIgnoreProperties(ignoreUnknown = true)
public class PostAppointment {
    private String appoSpeciality;
    private String email;
    private String firstName;
    private String lastName;
    private String gender;
    private String phone;
    private String snumber;
    private String ssn;


}
