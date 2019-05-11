/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.*;

/**
 *
 * @author Parmjot Singh chahal
 */
@Entity
public class Student {
    @Id
    private int id;
    private String name;
    private String pwd;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public boolean equals(Object ob){
        Student obj=(Student)ob;
        if(obj == null){
            return false;
        }
                
        if((this.id == obj.getId()) && (this.pwd.equals(obj.getPwd())) ){
            return true;
        }
        else{
            return false;
        }
    }
}
