package com.allinone.AllInOne.configuration;

import com.allinone.AllInOne.Dto.DataBaseDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.oauth2.client.AuthorizedClientServiceReactiveOAuth2AuthorizedClientManager;
//import org.springframework.security.oauth2.client.ReactiveOAuth2AuthorizedClientManager;
//import org.springframework.security.oauth2.client.ReactiveOAuth2AuthorizedClientService;
//import org.springframework.security.oauth2.client.registration.ClientRegistration;
//import org.springframework.security.oauth2.client.registration.InMemoryReactiveClientRegistrationRepository;
//import org.springframework.security.oauth2.client.registration.ReactiveClientRegistrationRepository;
//import org.springframework.security.oauth2.core.AuthorizationGrantType;
//import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfiguration {
    @Autowired
    DataBaseDetail dataDetail;


//    @Bean
//    WebClient getWebClient(){
//
//        WebClient.builder()
//                .baseUrl(dataDetail.getBaseurl())
//                .
//
//    }


//    @Bean
//    ReactiveClientRegistrationRepository clientRegistrations() {
//        ClientRegistration registration = ClientRegistration
//                .withRegistrationId("technopedia-apigee")
//                .tokenUri(dataDetail.getTokenurl())
//                .clientId(dataDetail.getOpenidClientId())
//                .clientSecret(dataDetail.getOpenidClientId())
//                .authorizationGrantType(AuthorizationGrantType.CLIENT_CREDENTIALS)
//                .build();
//        return new InMemoryReactiveClientRegistrationRepository(registration);
//    }


}
