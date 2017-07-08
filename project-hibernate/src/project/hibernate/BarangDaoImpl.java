package project.hibernate;

import project.hibernate.Barang;
import java.util.List;
import org.hibernate.*;

public class BarangDaoImpl implements BarangDao{

    private final SessionFactory sessionFactory;
    
    public BarangDaoImpl(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
    
    @Override
    public void save(Barang barang) {
        Session session = sessionFactory.openSession();
        
        try {
            session.beginTransaction();
            session.save(barang);
            session.getTransaction().commit();
        } catch (Exception c){
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    @Override
    public void update(Barang barang) {
        Session session = sessionFactory.openSession();
        
        try {
            session.beginTransaction();
            session.update(barang);
            session.getTransaction().commit();
        } catch (Exception c){
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    @Override
    public void delete(Barang barang) {
        Session session = sessionFactory.openSession();
        
        try {
            session.beginTransaction();
            session.delete(barang);
            session.getTransaction().commit();
        } catch (Exception c){
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    @Override
    public Barang getBarang(String idBarang) {
        Session session = sessionFactory.openSession();
        
        try {
            session.beginTransaction();
            Barang barang = (Barang) session.get(Barang.class, idBarang);
            session.getTransaction().commit();
            return barang;
        } catch (Exception c){
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }
    }

    @Override
    public List<Barang> getBarangs() {
        Session session = sessionFactory.openSession();
        
        try{
            session.beginTransaction();
            List<Barang> barangs = session.createCriteria(Barang.class).list();
            session.getTransaction().commit();
            return barangs;
        } catch (Exception e){
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }
    }
}
