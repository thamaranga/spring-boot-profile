package com.hasithat.springbootprofile.config;

import com.hasithat.springbootprofile.dto.ProfileDetailsTestDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfigTest {

    /*Like below while creating bean also we can  give the relevant profile which this bean should be created*/
    @Bean
    @Profile("dev")
    public ProfileDetailsTestDTO devMessage(){
        ProfileDetailsTestDTO profileDetailsTestDTO= new ProfileDetailsTestDTO();
        profileDetailsTestDTO.setProfileMessage("Hi from DEV env");
        return profileDetailsTestDTO;
    }

    @Bean
    @Profile("prod")
    public ProfileDetailsTestDTO prodMessage(){
        ProfileDetailsTestDTO profileDetailsTestDTO= new ProfileDetailsTestDTO();
        profileDetailsTestDTO.setProfileMessage("Hi from PROD env");
        return profileDetailsTestDTO;

    }

    @Bean
    @Profile("stg")
    public ProfileDetailsTestDTO stgMessage(){
        ProfileDetailsTestDTO profileDetailsTestDTO= new ProfileDetailsTestDTO();
        profileDetailsTestDTO.setProfileMessage("Hi from STG env");
        return profileDetailsTestDTO;

    }
}
