package pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Data  // getter setter tostring
@NoArgsConstructor   // parametresiz cons.
@AllArgsConstructor  // parametreli cons.
@JsonIgnoreProperties(ignoreUnknown = true)
public class TestItemsPojo {

private String name;
private String description;
private Double price;
private String defaultValMin;
private String defaultValMax;






/*
{
    "createdBy": "team11",
        "createdDate": "2022-12-06T17:43:39.380741Z",
        "id": 376845,
        "name": "Ayse Nazli",
        "description": "Ates",
        "price": 310.00,
        "defaultValMin": "270",
        "defaultValMax": "400"
}
*/

}
