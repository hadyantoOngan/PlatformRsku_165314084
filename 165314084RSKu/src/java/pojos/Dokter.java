package pojos;
// Generated Oct 31, 2018 8:46:35 PM by Hibernate Tools 4.3.1



/**
 * Dokter generated by hbm2java
 */
public class Dokter  implements java.io.Serializable {


     private Integer id;
     private String nama;
     private String spesialis;

    public Dokter() {
    }

    public Dokter(String nama, String spesialis) {
       this.nama = nama;
       this.spesialis = spesialis;
    }

//    public Dokter(Integer id, String nama, String spesialis) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNama() {
        return this.nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getSpesialis() {
        return this.spesialis;
    }
    
    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }




}


