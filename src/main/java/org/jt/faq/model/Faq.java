package org.jt.faq.model;

// import lombok.AllArgsConstructor;
// import lombok.Builder;
import lombok.Data;
// import lombok.NoArgsConstructor;

@Data

/* Builder sould be used with NoargConstructor */
// @AllArgsConstructor
// @NoArgsConstructor
// @Builder
public class Faq {
    private String question;
    private String answer;
}
