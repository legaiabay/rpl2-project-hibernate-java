package project.hibernate;

import project.hibernate.Barang;
import java.util.List;

public interface BarangDao {
    public void save(Barang barang);
    public void update(Barang barang);
    public void delete(Barang barang);
    public Barang getBarang(String idBarang);
    public List<Barang> getBarangs();
}
