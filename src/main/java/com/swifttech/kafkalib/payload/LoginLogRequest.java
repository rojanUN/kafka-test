package com.swifttech.kafkalib.payload;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.swifttech.kafkalib.enums.LoginStatusEnum;

import java.util.Date;
import java.util.UUID;

/*
 * @Created At 15/03/2024
 * @Author suroj.awal
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoginLogRequest {
    private Date date;
    private String branchCode;
    private String username;
    private String ipAddress;
    private String device;
    private String userAgent;
    private UUID userId;
    private LoginStatusEnum loginStatus;
}
