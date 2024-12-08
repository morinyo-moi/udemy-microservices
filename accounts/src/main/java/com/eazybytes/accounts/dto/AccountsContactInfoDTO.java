package com.eazybytes.accounts.dto;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties(prefix = "accounts")
// public record AccountsContactInfoDTO(String message, Map<String, String> contactDetails, List<String> onCallSupport) {
    
// }
@Setter
@Getter
public class AccountsContactInfoDTO{
    private String message;
    private Map<String,String> contactDetails;
    private List<String> onCallSupport;
}
