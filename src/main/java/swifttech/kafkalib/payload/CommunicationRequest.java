package swifttech.kafkalib.payload;

import com.swifttech.user.enums.ChannelEnum;
import com.swifttech.user.enums.LanguageEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommunicationRequest {

    private String username;
    private Long mobile;
    private String email;
    private String countryCode;
    private LanguageEnum language;
    private String topic;
    private List<String> tokens;
    private Map<String, String> data;
    private ChannelEnum sendTo;
}
