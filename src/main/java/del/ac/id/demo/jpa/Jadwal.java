package del.ac.id.demo.jpa;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_jadwal")
public class Jadwal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="id")
	private String id;
	
	@Column (name ="harga")
	private int harga;
	
	@Column (name="asal")
	private String asal;
	
	@Column (name="tujuan")
	private String tujuan;
	
	@Column (name="kuota")
	private int kuota;
	
	@Column (name="waktu")
	private Date waktu;
	
	public Jadwal() {}
	public Jadwal (String id,int harga,String asal,String tujuan,int kuota,Date waktu) {
		this.id=id;
		this.asal=asal;
		this.harga=harga;
		this.kuota=kuota;
		this.tujuan=tujuan;
		this.waktu=waktu;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getHarga() {
		return harga;
	}
	public void setHarga(int harga) {
		this.harga = harga;
	}
	public String getAsal() {
		return asal;
	}
	public void setAsal(String asal) {
		this.asal = asal;
	}
	public String getTujuan() {
		return tujuan;
	}
	public void setTujuan(String tujuan) {
		this.tujuan = tujuan;
	}
	public int getKuota() {
		return kuota;
	}
	public void setKuota(int kuota) {
		this.kuota = kuota;
	}
	public Date getWaktu() {
		return waktu;
	}
	public void setWaktu(Date waktu) {
		this.waktu = waktu;
	}

}
