package com.allinone.AllInOne.Dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "com.allinone")
@Getter
@Setter
public class DataBaseDetail {
    public String baseurl;
    public String openidUrl;
    public String openidClientId;
    public String openidResource;
    public String openidRedirectUrl;
    public String tokenurl;
}
