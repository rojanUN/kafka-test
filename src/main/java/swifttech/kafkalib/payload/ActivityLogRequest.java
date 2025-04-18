package swifttech.kafkalib.payload;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ActivityLogRequest {
    private Long id;
    private String requestId;
    private Date requestDate;
    private Date responseDate;
    private String url;
    private String method;
    private String requestHeader;
    private String requestBody;
    private String requestParam;
    private String response;
    private Integer statusCode;
    private String origin;
    private String device;
    private String ipAddress;
    private String userId;

}
