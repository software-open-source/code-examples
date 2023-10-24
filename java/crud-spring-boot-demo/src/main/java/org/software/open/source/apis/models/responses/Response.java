package org.software.open.source.apis.models.responses;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "ApiResponse", description = "Base Response")
public class Response<T> {

    @Schema(name = "code", description = "Bussiness code response")
    private int code;

    @Schema(name = "message", description = "Message response")
    private String message;

    @Schema(name = "isSuccess", description = "Is success response")
    private boolean isSuccess;

    @Schema(name = "data", description = "Data response")
    private T data;

    public Response(T data) {
        this.isSuccess = true;
        this.message = "Success";
        this.data = data;
    }

    public Response(int code, String message) {
        this.code = code;
        this.message = message;
    }

}
