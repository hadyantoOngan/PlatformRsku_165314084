package pojos;
// Generated Oct 31, 2018 8:46:35 PM by Hibernate Tools 4.3.1



/**
 * Location generated by hbm2java
 */
public class Location  implements java.io.Serializable {


     private Long id;
     private Double lat;
     private Double lng;
     private String name;

    public Location() {
    }

    public Location(Double lat, Double lng, String name) {
       this.lat = lat;
       this.lng = lng;
       this.name = name;
    }

    public Location(Long id, Double lat, Double lng, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    public Double getLat() {
        return this.lat;
    }
    
    public void setLat(Double lat) {
        this.lat = lat;
    }
    public Double getLng() {
        return this.lng;
    }
    
    public void setLng(Double lng) {
        this.lng = lng;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }




}


