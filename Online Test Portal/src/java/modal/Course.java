/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Parmjot Singh chahal
 */
@Entity
public class Course {
    @Id
    private String Course;
    private int ques;
    private String author;
    
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }

    public int getQues() {
        return ques;
    }

    public void setQues(int ques) {
        this.ques = ques;
    }
    
    
}
