/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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
public class StopDAO {
    public boolean add(Stop original){
        Configuration cf;
        Session session;
        SessionFactory sf;
        Transaction tx;
        Query query= null;
        boolean flag=true;
        try{
            cf=new Configuration();
            cf.configure("cfgpackage/hibernate.cfg.xml");
            sf= cf.buildSessionFactory();
            session=sf.openSession();
            tx = session.beginTransaction();
            System.out.println(original.getRoute());
            int route=(int)session.save(original);
            System.out.println("output after save"+route);
            if( route!=original.getNo() ){
                flag= false;
            }
            tx.commit();
            session.close();
            sf.close();
        }
        catch(Exception e){
            System.out.println(e);
            flag= false;
        }

        return flag;
    }
    
    public List<Stop> list(){
        Configuration cf;
        Session session;
        SessionFactory sf;
        Transaction tx=null;
        Query query;
        List<Stop> l=null;
        try{
            cf=new Configuration();
            cf.configure("cfgpackage/hibernate.cfg.xml");
            
            sf= cf.buildSessionFactory();
            session=sf.openSession();
            tx = session.beginTransaction();
            query=session.createQuery("from Stop");
            l= query.list();
            tx.commit();
            session.close();
            sf.close();
        }
        catch(Exception e){
            System.out.println(e);
        }

        return l;
    }
    
    public void delete(Stop obj){
         Configuration cf=null;
        Session session=null;
        SessionFactory sf=null;
        Transaction tx = null;
        Stop db;
        try{
            cf=new Configuration();
            cf.configure("cfgpackage/hibernate.cfg.xml");
            
            sf= cf.buildSessionFactory();
            session=sf.openSession();
            tx = session.beginTransaction();
            System.out.println(obj.getNo());
            db=(Stop)session.get(Stop.class,obj.getNo());
            session.delete(db);
            tx.commit();
            session.close();
            sf.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
     }

}
