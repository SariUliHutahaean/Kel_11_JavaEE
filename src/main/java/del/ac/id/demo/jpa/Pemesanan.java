package del.ac.id.demo.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_pemesanan")
public class Pemesanan {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "kota_asal")
	private String kotaAsal;
	
	@Column(name = "kota_tujuan")
	private String kotaTujuan;
	
	@Column(name = "keberangkatan")
	private String keberangkatan;
	
	@Column(name = "kedatangan")
	private String kedatangan;
	
	@Column(name = "jumlah_penumpang")
	private int jumlahPenumpang;
	
	public Pemesanan() {
		super();
	}

	public Pemesanan(String kotaAsal, String kotaTujuan, String keberangkatan, String kedatangan, int jumlahPenumpang) {
		super();
		this.kotaAsal = kotaAsal;
		this.kotaTujuan = kotaTujuan;
		this.keberangkatan = keberangkatan;
		this.kedatangan = kedatangan;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKotaAsal() {
		return kotaAsal;
	}

	public void setKotaAsal(String kotaAsal) {
		this.kotaAsal = kotaAsal;
	}

	public String getKotaTujuan() {
		return kotaTujuan;
	}

	public void setKotaTujuan(String kotaTujuan) {
		this.kotaTujuan = kotaTujuan;
	}

	public String getKeberangkatan() {
		return keberangkatan;
	}

	public void setKeberangkatan(String keberangkatan) {
		this.keberangkatan = keberangkatan;
	}

	public String getKedatangan() {
		return kedatangan;
	}

	public void setKedatangan(String kedatangan) {
		this.kedatangan = kedatangan;
	}

	public int getJumlahPenumpang() {
		return jumlahPenumpang;
	}

	public void setJumlahPenumpang(int jumlahPenumpang) {
		this.jumlahPenumpang = jumlahPenumpang;
	}
	
	
}
