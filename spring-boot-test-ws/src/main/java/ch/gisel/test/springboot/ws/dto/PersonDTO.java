package ch.gisel.test.springboot.ws.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PersonDTO {

    private Long id;
    private String name;
    private String firstName;
}
