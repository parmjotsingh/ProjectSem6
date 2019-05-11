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
public class BusRouteDAO {
    public List<BusRoute> check(BusRoute original){
        Configuration cf;
        Session session;
        SessionFactory sf;
        Transaction tx=null;
        BusRoute db=null;
        Query query;
        List<BusRoute> l=null;
        try{
            cf=new Configuration();
            cf.configure("cfgpackage/hibernate.cfg.xml");
            
            sf= cf.buildSessionFactory();
            session=sf.openSession();
            tx = session.beginTransaction();
            System.out.println(original.getRoute());
            query=session.createQuery("from BusRoute where route='"+original.getRoute()+"'");
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
    public List<BusRoute> busList(){
       Configuration cf;
        Session session;
        SessionFactory sf;
        BusRoute db=null;
        Transaction tx = null;
        Query query= null;
        List<BusRoute> l=null;
        try{
            cf=new Configuration();
            cf.configure("cfgpackage/hibernate.cfg.xml");
            
            sf= cf.buildSessionFactory();
            session=sf.openSession();
            tx = session.beginTransaction();
//            System.out.println(original.getRoute());
            query=session.createQuery("from BusRoute");
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
    //========================================= ADDING NEW BUS ROUTE===================================
     public boolean add(BusRoute original){
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
            String route=(String)session.save(original);
            System.out.println("output after save"+route);
            if( !route.equals(original.getRoute()) ){
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
     
     //============================== For Delete =================================
     
     public void delete(String route){
         Configuration cf=null;
        Session session=null;
        SessionFactory sf=null;
        Transaction tx = null;
        BusRoute db;
        try{
            cf=new Configuration();
            cf.configure("cfgpackage/hibernate.cfg.xml");
            
            sf= cf.buildSessionFactory();
            session=sf.openSession();
            tx = session.beginTransaction();
            System.out.println(route);
            db=(BusRoute)session.get(BusRoute.class,route);
            session.delete(db);
            tx.commit();
            session.close();
            sf.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
     }

    public boolean update(BusRoute original) {
        Configuration cf;
        Session session=null;
        SessionFactory sf=null;
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
            session.update(original);
            tx.commit();
        }
        catch(Exception e){
            System.out.println(e);
            flag= false;
        }
        finally{
            session.close();
            sf.close();
        }
        return flag;
    }
}
