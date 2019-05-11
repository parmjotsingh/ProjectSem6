/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.hibernate.*;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Parmjot Singh chahal
 */
public class StudentDAO {
    
    public String check(Student original){
        Configuration cf=null;
        Session session=null;
        SessionFactory sf=null;
        Student db=null;
        Transaction tx = null;
        try{
            cf=new Configuration();
            cf.configure("cfgpackage/hibernate.cfg.xml");
            
            sf= cf.buildSessionFactory();
            session=sf.openSession();
            tx = session.beginTransaction();
            System.out.println(original.getId());
            db=(Student)session.get(Student.class,original.getId());
            
            tx.commit();
            session.close();
            sf.close();
        }
        catch(Exception e){
            System.out.println(e);
        }

        if(original.equals(db)){
            return db.getName();
        }
        else{
            return null;
        }
    }
}