package org.software.open.source.apis.models.responses.users;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class AuditReponse {
    
    private String createdBy;

    private LocalDateTime createdDate;

    private String updatedBy;

    private LocalDateTime lastModifiedDate;
    
}
