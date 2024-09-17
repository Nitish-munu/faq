package org.jt.faq.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
// import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
// @ToString
public class Heading {
    private String title;
    private String subTitle;

    // public Heading() {
    // }

    // public Heading(String title, String subTitle) {
    // this.title = title;
    // this.subTitle = subTitle;
    // }

    // public String getSubTitle() {
    // return subTitle;
    // }

    // public String getTitle() {
    // return title;
    // }

    // public void setTitle(String title) {
    // this.title = title;
    // }

    // public void setSubTitle(String subTitle) {
    // this.subTitle = subTitle;
    // }

}
