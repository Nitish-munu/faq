package org.jt.faq;

import org.jt.faq.service.FaqService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
// public class FaqApplication {
	public class FaqApplication implements CommandLineRunner {
	 private final FaqService service1;
	 private final FaqService service2;

	public static void main(String[] args) {
		// SpringApplication.run(FaqApplication.class, args); //execution start from here
		// run method is of command linerunner
		ApplicationContext ctx = SpringApplication.run(FaqApplication.class, args);  
		// FaqService service = ctx.getBean("faqService", FaqService.class);
		// System.out.println(service.getQuestions().size());
	}
	// 	@Bean // it is taken by spring and can use at different places
    // FaqRepository faqRepository() {
    //     return new FaqRepository();
    // }

	@Override
	public void run(String... args) throws Exception {
		System.out.println(service1 == service2);
		// single object is created so true
	}
}
