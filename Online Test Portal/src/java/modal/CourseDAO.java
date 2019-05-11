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
public class CourseDAO {
    public boolean create(Course obj){
        Configuration cf;
        Session session;
        SessionFactory sf;
        Transaction tx=null;
        Query query;
        try{
            cf=new Configuration();
            cf.configure("cfgpackage/hibernate.cfg.xml");
            sf= cf.buildSessionFactory();
            session=sf.openSession();
            tx = session.beginTransaction();
            System.out.println(obj.getCourse());
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
    public boolean addQuestions(QuestionPaper obj){
        Configuration cf;
        Session session;
        SessionFactory sf;
        Transaction tx=null;
        Query query;
        try{
            cf=new Configuration();
            cf.configure("cfgpackage/hibernate.cfg.xml");
            sf= cf.buildSessionFactory();
            session=sf.openSession();
            tx = session.beginTransaction();
            System.out.println(obj.getCourse());
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
    public int getTotalQuestion(String c){
        Configuration cf;
        Session session=null;
        SessionFactory sf=null;
        Transaction tx;
        Query query;
        Course l;
         try {
            cf= new Configuration();
            cf.configure("cfgpackage/hibernate.cfg.xml");
            sf=cf.buildSessionFactory();
            session=sf.openSession();
            tx= session.beginTransaction();
            l=(Course)session.get(Course.class, c);
            tx.commit();
            
        } catch (Exception e) {
             System.out.println(e);
             return -99;
        }
         finally{
             session.close();
             sf.close();
         }
         return l.getQues();
    }
    
    public QuestionPaper getQuestion(int qNo,String course){
        Configuration cf;
        Session session=null;
        SessionFactory sf=null;
        Transaction tx;
        Query query;
        List<QuestionPaper> q=null;
         try {
            cf= new Configuration();
            cf.configure("cfgpackage/hibernate.cfg.xml");
            sf=cf.buildSessionFactory();
            session=sf.openSession();
            tx= session.beginTransaction();
            query=session.createQuery("from QuestionPaper where quesNo="+qNo+"and course='"+course+"'");
            q=query.list();
            tx.commit();
            
        } catch (Exception e) {
             System.out.println(e);
             return null;
        }
         finally{
             session.close();
             sf.close();
         }
         if(q.iterator().hasNext() == false){
             return null;
         }
         return q.iterator().next();
    }
    public List<QuestionPaper> getQuestionPaper(String course){
        Configuration cf;
        Session session=null;
        SessionFactory sf=null;
        Transaction tx;
        Query query;
        List<QuestionPaper> q=null;
         try {
            cf= new Configuration();
            cf.configure("cfgpackage/hibernate.cfg.xml");
            sf=cf.buildSessionFactory();
            session=sf.openSession();
            tx= session.beginTransaction();
            query=session.createQuery("from QuestionPaper where course='"+course+"'");
            q=query.list();
            tx.commit();
            
        } catch (Exception e) {
             System.out.println(e);
             return null;
        }
         finally{
             session.close();
             sf.close();
         }
         if(q.iterator().hasNext() == false){
             return null;
         }
         return q;
    }
    
    public List getExam(){
        Configuration cf;
        Session session=null;
        SessionFactory sf=null;
        Transaction tx;
        Query query;
        List<Course> q=null;
         try {
            cf= new Configuration();
            cf.configure("cfgpackage/hibernate.cfg.xml");
            sf=cf.buildSessionFactory();
            session=sf.openSession();
            tx= session.beginTransaction();
            query=session.createQuery("from Course");
            q=query.list();
            tx.commit();
            
        } catch (Exception e) {
             System.out.println(e);
             return null;
        }
         finally{
             session.close();
             sf.close();
         }
         if(q.iterator().hasNext() == false){
             return null;
         }
         return q;
    }
    
    public List getExam(String authorName){
        Configuration cf;
        Session session=null;
        SessionFactory sf=null;
        Transaction tx;
        Query query;
        List<Course> q=null;
         try {
            cf= new Configuration();
            cf.configure("cfgpackage/hibernate.cfg.xml");
            sf=cf.buildSessionFactory();
            session=sf.openSession();
            tx= session.beginTransaction();
            query=session.createQuery("from Course where author='"+authorName+"'");
            q=query.list();
            tx.commit();
            
        } catch (Exception e) {
             System.out.println(e);
             return null;
        }
         finally{
             session.close();
             sf.close();
         }
         if(q.iterator().hasNext() == false){
             return null;
         }
         return q;
    }
    public Course getCourseDetail(String course){
        Configuration cf;
        Session session=null;
        SessionFactory sf=null;
        Transaction tx;
        Query query;
        Course q=null;
         try {
            cf= new Configuration();
            cf.configure("cfgpackage/hibernate.cfg.xml");
            sf=cf.buildSessionFactory();
            session=sf.openSession();
            tx= session.beginTransaction();
            q=(Course)session.get(Course.class, course);
            tx.commit();
            
        } catch (Exception e) {
             System.out.println(e);
             return null;
        }
         finally{
             session.close();
             sf.close();
         }
         return q;
    }
}
