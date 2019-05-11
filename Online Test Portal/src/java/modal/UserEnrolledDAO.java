/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

import java.util.Iterator;
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
public class UserEnrolledDAO {
    public boolean addUserAns(UserEnrolled obj){
        Configuration cf;
        Session session=null;
        SessionFactory sf=null;
        Transaction tx=null;
        Query query;
        List<UserEnrolled> l;
        boolean flag=false;
        try{
            cf=new Configuration();
            cf.configure("cfgpackage/hibernate.cfg.xml");
            sf= cf.buildSessionFactory();
            session=sf.openSession();
            tx = session.beginTransaction();
//            obj.setUser("ramuu");
            System.out.println(obj.getCourse());
            query= session.createQuery("from UserEnrolled where course ='"+obj.getCourse()+"' and user='"+obj.getUser()+"' and qNo="+obj.getqNo());
            l=query.list();
            
            Iterator itr=l.iterator();

            if(itr.hasNext()){
                UserEnrolled w=(UserEnrolled)itr.next();
//                System.out.println("//////////////////////// "+w);
                obj.setsNo( w.getsNo() );
//                System.out.println("//////////////////////// "+obj);
                session.delete(w);
                session.clear();
                session.update(obj);
            }
            else
                session.save(obj);
            
            tx.commit();
//            session.close();
//            sf.close();
        }
        catch(Exception e){
            System.out.println(e);
            return false;
        }
        finally{
            session.close();
            sf.close();
        }
        return true;
    }
    
    public boolean checkUser(UserEnrolled obj){
        Configuration cf;
        Session session=null;
        SessionFactory sf=null;
        Transaction tx;
        List<UserEnrolled> l;
        Query query;
        try{
            cf= new Configuration();
            cf.configure("cfgpackage/hibernate.cfg.xml");
            sf= cf.buildSessionFactory();
            session= sf.openSession();
            tx= session.beginTransaction();
            
            query= session.createQuery("from UserEnrolled where course ='"+obj.getCourse()+"' and user='"+obj.getUser()+"'");
            l=query.list();
            
            tx.commit();
        }
        catch(Exception e){
            System.out.println(e);
            return false;
        }
        finally{
            session.close();
            sf.close();
        }
        
//        Iterator itr=l.iterator();
//        
//        while(itr.hasNext()){
//            System.out.println( itr.next() );
//        }
        
        if(l.iterator().hasNext()){
            System.out.println("========================  TURE RETURNED HERE ----");
            return true;
        }
        else{
            System.out.println("========================  FALSE RETURNED HERE ----"+l.size());
            return false;
        }
    }
    
    public int getAns(UserEnrolled obj){
        Configuration cf;
        Session session=null;
        SessionFactory sf=null;
        Transaction tx;
        List<UserEnrolled> l;
        Query query;
        try{
            cf= new Configuration();
            cf.configure("cfgpackage/hibernate.cfg.xml");
            sf= cf.buildSessionFactory();
            session= sf.openSession();
            tx= session.beginTransaction();
            
            query= session.createQuery("from UserEnrolled where course ='"+obj.getCourse()+"' and user='"+obj.getUser()+"' and qNo="+obj.getqNo());
            l=query.list();
            
            tx.commit();
        }
        catch(Exception e){
            System.out.println(e);
            return 0;
        }
        finally{
            session.close();
            sf.close();
        }
        
        Iterator itr= l.iterator();
        if(itr.hasNext()){
            return ((UserEnrolled)itr.next()).getUserAnswer();
        }
        else{
            System.out.println("========================  FALSE RETURNED HERE --for getAns()--"+l.size());
            return 0;
        }
    }
    
    public List getList(String course,String user){
        Configuration cf;
        Session session=null;
        SessionFactory sf=null;
        Transaction tx;
        List<UserEnrolled> l;
        Query query;
        try{
            cf= new Configuration();
            cf.configure("cfgpackage/hibernate.cfg.xml");
            sf= cf.buildSessionFactory();
            session= sf.openSession();
            tx= session.beginTransaction();
            
            query= session.createQuery("from UserEnrolled where course ='"+course+"' and user='"+user+"'");
            l=query.list();
            
            tx.commit();
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
        finally{
            session.close();
            sf.close();
        }
        return l;
    }
    public List<UserEnrolled> getCourseResult(String course){
        Configuration cf;
        Session session=null;
        SessionFactory sf=null;
        Transaction tx;
        List<UserEnrolled> l;
        Query query;
        try{
            cf= new Configuration();
            cf.configure("cfgpackage/hibernate.cfg.xml");
            sf= cf.buildSessionFactory();
            session= sf.openSession();
            tx= session.beginTransaction();
            
            query= session.createQuery("from UserEnrolled where course ='"+course+"'");
            l=query.list();
            
            tx.commit();
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
        finally{
            session.close();
            sf.close();
        }
        return l;
    }
}
