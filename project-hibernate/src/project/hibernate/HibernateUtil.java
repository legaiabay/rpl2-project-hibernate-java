package project.hibernate;

import project.hibernate.BarangDao;
import project.hibernate.BarangDaoImpl;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory SESSION_FACTORY;
    private static final BarangDao BARANG_DAO;
    
    static {
        try {
            SESSION_FACTORY = new Configuration().configure().buildSessionFactory();
            BARANG_DAO = new BarangDaoImpl(SESSION_FACTORY);
        }catch (Throwable ex){
            System.err.println("Initital Session Failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFacoty(){
        return SESSION_FACTORY;
    }
    
    public static BarangDao getBarangDao(){
        return BARANG_DAO;
    }
}
