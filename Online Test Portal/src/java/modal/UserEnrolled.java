/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Parmjot Singh chahal
 */
@Entity
public class UserEnrolled {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int sNo;
    private String user;
    private String course;
    private int qNo;
    private int userAnswer;

    public int getsNo() {
        return sNo;
    }

    public void setsNo(int sNo) {
        this.sNo = sNo;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getqNo() {
        return qNo;
    }

    public void setqNo(int qNo) {
        this.qNo = qNo;
    }

    public int getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(int userAnswer) {
        this.userAnswer = userAnswer;
    }

    @Override
    public String toString() {
        return "UserEnrolled{" + "sNo=" + sNo + ", user=" + user + ", course=" + course + ", qNo=" + qNo + ", userAnswer=" + userAnswer + '}';
    }
    
    
}
