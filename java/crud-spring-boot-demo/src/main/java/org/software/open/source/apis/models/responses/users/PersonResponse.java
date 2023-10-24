package org.software.open.source.apis.models.responses.users;

import java.time.LocalDate;
import java.util.UUID;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Schema(name = "PersonResponse", description = "Person Response")
public class PersonResponse extends AuditReponse {
    
    @Schema(name = "id", description = "Person Id Response")
    private UUID id;

    @Schema(name = "firstName", description = "Person firstName Response")
    private String firstName;
    
    @Schema(name = "middleName", description = "Person middleName Response")
    private String middleName;

    @Schema(name = "lastName", description = "Person lastName Response")
    private String lastName;

    @Schema(name = "birthDay", description = "Person birthDay Response")
    private LocalDate birthDay;

    @Schema(name = "age", description = "Person age Response")
    private int age;

    @Schema(name = "email", description = "Person email Response")
    private String email;

    @Schema(name = "address", description = "Person address Response")
    private String address;

}
