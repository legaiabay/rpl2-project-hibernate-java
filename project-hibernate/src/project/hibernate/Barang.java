package project.hibernate;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "tb_barang")

public class Barang implements Serializable{
    @Id
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @GeneratedValue(generator = "uuid2")
    @Column(name = "id_barang",length=50)
    private String idBarang;
    
    @Column(name = "nama_barang", length=50)
    private String namaBarang;
    
    @Column(name = "harga_barang",length = 15)
    //@Enumerated(EnumType.STRING)
    private String hargaBarang;
    
    @Column(name = "stok_barang", length = 3)
    private String stokBarang;

    /**
     * @return the idBarang
     */
    public String getIdBarang() {
        return idBarang;
    }

    /**
     * @param idBarang the idBarang to set
     */
    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    /**
     * @return the namaBarang
     */
    public String getNamaBarang() {
        return namaBarang;
    }

    /**
     * @param namaBarang the namaBarang to set
     */
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    /**
     * @return the jenisBarang
     */
    public String getHargaBarang() {
        return hargaBarang;
    }

    /**
     * @param jenisBarang the jenisBarang to set
     */
    public void setJenisBarang(String hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    /**
     * @return the tanggalKadaluarsa
     */
    public String getStokBarang() {
        return stokBarang;
    }

    /**
     * @param tanggalKadaluarsa the tanggalKadaluarsa to set
     */
    public void setStokBarang(String stokBarang) {
        this.stokBarang = stokBarang;
    }
}
