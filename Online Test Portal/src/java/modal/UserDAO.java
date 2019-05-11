/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Parmjot Singh chahal
 */
public class UserDAO {
    public boolean add(User obj){
        Configuration cf;
        Session session;
        SessionFactory sf;
        Transaction tx=null;
        try{
            cf=new Configuration();
            cf.configure("cfgpackage/hibernate.cfg.xml");
            sf= cf.buildSessionFactory();
            session=sf.openSession();
            tx = session.beginTransaction();
//            System.out.println(obj.getCourse());
            session.save(obj);
            tx.commit();
            session.close();
            sf.close();
        }
        catch(Exception e){
            System.out.println(e);
            return false;
        }
        return true;
    }
    public User getUser(String name){
        Configuration cf;
        Session session;
        SessionFactory sf;
        Transaction tx=null;
        User u=null;
        try{
            cf=new Configuration();
            cf.configure("cfgpackage/hibernate.cfg.xml");
            sf= cf.buildSessionFactory();
            session=sf.openSession();
            tx = session.beginTransaction();
//            System.out.println(obj.getCourse());
            u=(User)session.get(User.class, name);
            tx.commit();
            session.close();
            sf.close();
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
        return u;
    }
    public boolean check(User obj){
        Configuration cf;
        Session session;
        SessionFactory sf;
        Transaction tx=null;
        User ob;
        try{
            cf=new Configuration();
            cf.configure("cfgpackage/hibernate.cfg.xml");
            sf= cf.buildSessionFactory();
            session=sf.openSession();
            tx = session.beginTransaction();
//            System.out.println(obj.getCourse());
            ob=(User)session.get(User.class, obj.getUsername());
            tx.commit();
            session.close();
            sf.close();
        }
        catch(Exception e){
            System.out.println(e);
            return false;
        }
        if(ob==null || obj==null){
            return false;
        }
        if(ob.equals(obj)){
            return true;
        }
        else{
            return false;
        }
    }

//    public List<User> list() {
//        Configuration cf;
//        Session session;
//        SessionFactory sf;
//        Transaction tx=null;
//        User ob;
//        try{
//            cf=new Configuration();
//            cf.configure();
//            sf= cf.buildSessionFactory();
//            session=sf.openSession();
//            tx = session.beginTransaction();
////            System.out.println(obj.getCourse());
//            ob=(User)session.get(User.class, obj.getUsername());
//            tx.commit();
//            session.close();
//            sf.close();
//        }
//        catch(Exception e){
//            System.out.println(e);
//            return false;
//        }
//    }
}
