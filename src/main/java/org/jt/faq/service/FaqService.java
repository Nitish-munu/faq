package org.jt.faq.service;

import java.util.List;

import org.jt.faq.model.Faq;
import org.jt.faq.repository.FaqRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.RequiredArgsConstructor;
// import lombok.Value; not required

// all this is use to create object //
// @Component   // it create object
// @Repository
@Service
// @Scope("prototype") // to create different class
@RequiredArgsConstructor
public class FaqService {

    private final FaqRepository repository;

    // public FaqService(FaqRepository repository) {
    // this.repository = repository;
    // }

    // to add Ans at first of every answer
    // private String prefix = "Ans: ";
    @PostConstruct
    void init(){
        System.out.println("");
    }
    @PreDestroy
    void destroy() {
        System.out.println("Destroyed called");
    }
    @Value("${prefix}")
    private String prefix;
    // public List<Faq> getQuestions() {
    //     return getMultipleQuestions()
    //     .stream().map(question -> {
    //         var answer = question.getAnswer();
    //         // question.setAnswer("Ans: "+ answer);
    //         question.setAnswer(prefix + answer);
    //         return question;
    //     }).toList();
    // }

    public List<Faq> getQuestions() {
        return getMultipleQuestions()
        .stream().map(faq -> {
            var answer = faq.getAnswer();
            // question.setAnswer("Ans: "+ answer);
            faq.setAnswer(prefix + answer);
            return faq;
        }).toList();
    }

    public List<Faq> getMultipleQuestions() {
        return List.of(
                repository.getQuestion1(),
                repository.getQuestion2(),
                repository.getQuestion3(),
                repository.getQuestion4(),
                repository.getQuestion5());
    }

    // public List<Faq> getQuestions() {
    //     return List.of(
    //             repository.getQuestion1(),
    //             repository.getQuestion2(),
    //             repository.getQuestion3(),
    //             repository.getQuestion4(),
    //             repository.getQuestion5());
    // }

    // public List<Faq> getQuestions() {
    // return List.of(getQuestion1(),
    // getQuestion2(),
    // getQuestion3(),
    // getQuestion4(),
    // getQuestion5());
    // }

    // public Faq getQuestion1() {
    // var faq = new Faq();
    // faq.setQuestion("What is Spring Framework?");
    // faq.setAnswer(
    // "Spring Framework is an open-source framework for building enterprise Java
    // applications. It provides comprehensive infrastructure support for developing
    // Java applications. The framework includes features such as dependency
    // injection, aspect-oriented programming, transaction management, and more. It
    // aims to simplify the development of Java applications by providing a
    // consistent programming model and reducing boilerplate code.");
    // return faq;
    // }

    // public Faq getQuestion2() {
    // var faq = new Faq();
    // faq.setQuestion("What is Dependency Injection in Spring?");
    // faq.setAnswer(
    // "Dependency Injection (DI) is a design pattern used in Spring Framework to
    // achieve Inversion of Control (IoC) between classes and their dependencies. It
    // allows for the automatic injection of dependencies into a class, which
    // simplifies testing, configuration, and management of dependencies. In Spring,
    // DI can be achieved through constructor injection, setter injection, or field
    // injection.");
    // return faq;
    // }

    // public Faq getQuestion3() {
    // var faq = new Faq();
    // faq.setQuestion("What is Spring Boot?");
    // faq.setAnswer(
    // "Spring Boot is an extension of the Spring Framework that simplifies the
    // process of setting up and developing new Spring applications. It provides a
    // set of conventions and defaults for application configuration and setup,
    // making it easier to create stand-alone, production-grade Spring applications
    // with minimal configuration. Spring Boot includes embedded servers and a range
    // of starter dependencies to get you up and running quickly.");
    // return faq;
    // }

    // public Faq getQuestion4() {
    // var faq = new Faq();
    // faq.setQuestion("What is Spring MVC?");
    // faq.setAnswer(
    // "Spring MVC (Model-View-Controller) is a web framework built on the Spring
    // Framework that provides a comprehensive model for building web applications.
    // It separates an application into three main components: the Model (business
    // logic), the View (user interface), and the Controller (request handling).
    // This separation promotes a clean architecture, making the application more
    // modular and easier to manage.");
    // return faq;
    // }

    // public Faq getQuestion5() {
    // var faq = new Faq();
    // faq.setQuestion("What is Spring MVC?");
    // faq.setAnswer(
    // "Spring MVC (Model-View-Controller) is a web framework built on the Spring
    // Framework that provides a comprehensive model for building web applications.
    // It separates an application into three main components: the Model (business
    // logic), the View (user interface), and the Controller (request handling).
    // This separation promotes a clean architecture, making the application more
    // modular and easier to manage.");
    // return faq;
    // }
}
