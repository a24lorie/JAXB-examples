package org.superbiz.calculator.jaxb.moxy.model;

import javax.xml.bind.annotation.XmlElement;

public class Result {

    private String course;
    private String score;

    public String getCourse() {
        return course;
    }
    @XmlElement(name="Course")
    public void setCourse(String course) {
        this.course = course;
    }

    public String getScore() {
        return score;
    }
    @XmlElement(name="Score")
    public void setScore(String score) {
        this.score = score;
    }

}