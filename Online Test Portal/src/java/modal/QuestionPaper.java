/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Parmjot Singh chahal
 */
@Entity
public class QuestionPaper {
    @Id
    @GeneratedValue
    private int sNo;
    private String course;
    private int quesNo;
    private int ans;
    @Column(columnDefinition="TEXT")
    private String question;
    @Column(columnDefinition="TEXT")
    private String opt1,opt2,opt3,opt4;

    public int getsNo() {
        return sNo;
    }

    public void setsNo(int sNo) {
        this.sNo = sNo;
    }

    public int getQuesNo() {
        return quesNo;
    }

    public void setQuesNo(int quesNo) {
        this.quesNo = quesNo;
    }

    public int getAns() {
        return ans;
    }

    public void setAns(int ans) {
        this.ans = ans;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOpt1() {
        return opt1;
    }

    public void setOpt1(String opt1) {
        this.opt1 = opt1;
    }

    public String getOpt2() {
        return opt2;
    }

    public void setOpt2(String opt2) {
        this.opt2 = opt2;
    }

    public String getOpt3() {
        return opt3;
    }

    public void setOpt3(String opt3) {
        this.opt3 = opt3;
    }

    public String getOpt4() {
        return opt4;
    }

    public void setOpt4(String opt4) {
        this.opt4 = opt4;
    }

    @Override
    public String toString() {
        return "QuestionPaper{" + "sNo=" + sNo + ", course=" + course + ", quesNo=" + quesNo + ", ans=" + ans + ", question=" + question + ", opt1=" + opt1 + ", opt2=" + opt2 + ", opt3=" + opt3 + ", opt4=" + opt4 + '}';
    }

        
}
