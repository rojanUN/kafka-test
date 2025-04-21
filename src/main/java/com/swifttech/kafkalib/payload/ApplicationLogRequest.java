package com.swifttech.kafkalib.payload;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import com.swifttech.kafkalib.enums.ApplicationStatusEnum;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApplicationLogRequest {
    private Long id;
    private String service;
    private Date logDate;
    private ApplicationStatusEnum status;

}
