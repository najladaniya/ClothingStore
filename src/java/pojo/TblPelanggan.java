package pojo;
// Generated Oct 18, 2022 12:10:16 AM by Hibernate Tools 4.3.1



/**
 * TblPelanggan generated by hbm2java
 */
public class TblPelanggan  implements java.io.Serializable {


     private Integer idPelanggan;
     private String namaPelanggan;
     private String noTlp;
     private String email;
     private String password;
     private String produk;
     private String total;

    public TblPelanggan() {
    }

    public TblPelanggan(String namaPelanggan, String noTlp, String email, String password, String produk, String total) {
       this.namaPelanggan = namaPelanggan;
       this.noTlp = noTlp;
       this.email = email;
       this.password = password;
       this.produk = produk;
       this.total = total;
    }
   
    public Integer getIdPelanggan() {
        return this.idPelanggan;
    }
    
    public void setIdPelanggan(Integer idPelanggan) {
        this.idPelanggan = idPelanggan;
    }
    public String getNamaPelanggan() {
        return this.namaPelanggan;
    }
    
    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }
    public String getNoTlp() {
        return this.noTlp;
    }
    
    public void setNoTlp(String noTlp) {
        this.noTlp = noTlp;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getProduk() {
        return this.produk;
    }
    
    public void setProduk(String produk) {
        this.produk = produk;
    }
    public String getTotal() {
        return this.total;
    }
    
    public void setTotal(String total) {
        this.total = total;
    }




}


