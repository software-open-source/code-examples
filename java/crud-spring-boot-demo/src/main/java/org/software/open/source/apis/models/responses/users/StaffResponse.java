package org.software.open.source.apis.models.responses.users;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Schema(name = "StaffResponse", description = "Staff Response")
public class StaffResponse extends PersonResponse {
    
    @Schema(name = "staffId", description = "Staff ID Response")
    private String staffId;

}
