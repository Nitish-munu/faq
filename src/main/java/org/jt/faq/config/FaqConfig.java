package org.jt.faq.config;

import org.jt.faq.repository.FaqRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//it is used when FaqRepository is internal class and we can not use @Repository
@Configuration
public class FaqConfig {
    @Bean // it is taken by spring and can use at different places
    FaqRepository faqRepository() {
        return new FaqRepository();
    }
}

// learn code with durgesh