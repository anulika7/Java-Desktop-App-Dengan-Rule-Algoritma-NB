/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dmapp.Model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author G4_HOMES
 */
@Entity
@Table(name = "indikator")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Indikator.findAll", query = "SELECT i FROM Indikator i")
    , @NamedQuery(name = "Indikator.findById", query = "SELECT i FROM Indikator i WHERE i.id = :id")
    , @NamedQuery(name = "Indikator.findByWilayah", query = "SELECT i FROM Indikator i WHERE i.wilayah = :wilayah")
    , @NamedQuery(name = "Indikator.findByPm10", query = "SELECT i FROM Indikator i WHERE i.pm10 = :pm10")
    , @NamedQuery(name = "Indikator.findBySo2", query = "SELECT i FROM Indikator i WHERE i.so2 = :so2")
    , @NamedQuery(name = "Indikator.findByCo", query = "SELECT i FROM Indikator i WHERE i.co = :co")
    , @NamedQuery(name = "Indikator.findByOzon", query = "SELECT i FROM Indikator i WHERE i.ozon = :ozon")
    , @NamedQuery(name = "Indikator.findByNo2", query = "SELECT i FROM Indikator i WHERE i.no2 = :no2")
    , @NamedQuery(name = "Indikator.findByKategori", query = "SELECT i FROM Indikator i WHERE i.kategori = :kategori")
    , @NamedQuery(name = "Indikator.findByRerata", query = "SELECT i FROM Indikator i WHERE i.rerata = :rerata")})
public class Indikator implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "wilayah")
    private String wilayah;
    @Basic(optional = false)
    @Column(name = "pm10")
    private short pm10;
    @Basic(optional = false)
    @Column(name = "so2")
    private short so2;
    @Basic(optional = false)
    @Column(name = "co")
    private short co;
    @Basic(optional = false)
    @Column(name = "ozon")
    private short ozon;
    @Basic(optional = false)
    @Column(name = "no2")
    private short no2;
    @Basic(optional = false)
    @Column(name = "kategori")
    private String kategori;
    @Basic(optional = false)
    @Column(name = "rerata")
    private String rerata;

    public Indikator() {
    }

    public Indikator(Long id) {
        this.id = id;
    }

    public Indikator(Long id, String wilayah, short pm10, short so2, short co, short ozon, short no2, String kategori, String rerata) {
        this.id = id;
        this.wilayah = wilayah;
        this.pm10 = pm10;
        this.so2 = so2;
        this.co = co;
        this.ozon = ozon;
        this.no2 = no2;
        this.kategori = kategori;
        this.rerata = rerata;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWilayah() {
        return wilayah;
    }

    public void setWilayah(String wilayah) {
        this.wilayah = wilayah;
    }

    public short getPm10() {
        return pm10;
    }

    public void setPm10(short pm10) {
        this.pm10 = pm10;
    }

    public short getSo2() {
        return so2;
    }

    public void setSo2(short so2) {
        this.so2 = so2;
    }

    public short getCo() {
        return co;
    }

    public void setCo(short co) {
        this.co = co;
    }

    public short getOzon() {
        return ozon;
    }

    public void setOzon(short ozon) {
        this.ozon = ozon;
    }

    public short getNo2() {
        return no2;
    }

    public void setNo2(short no2) {
        this.no2 = no2;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getRerata() {
        return rerata;
    }

    public void setRerata(String rerata) {
        this.rerata = rerata;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Indikator)) {
            return false;
        }
        Indikator other = (Indikator) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dmapp.Model.Indikator[ id=" + id + " ]";
    }
    
}
