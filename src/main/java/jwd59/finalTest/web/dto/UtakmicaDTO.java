package jwd59.finalTest.web.dto;


import org.springframework.stereotype.Component;


@Component
public class UtakmicaDTO {

    private Long id;
    
    private long reprezentacijaAId;
    
    private String reprezentacijaANaziv;
    
    private long reprezentacijaBId;
    
    private String reprezentacijaBNaziv;
    
    
    private int brojGolovaA;
    
    private int brojGolovaB;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public long getReprezentacijaAId() {
		return reprezentacijaAId;
	}

	public void setReprezentacijaAId(long reprezentacijaAId) {
		this.reprezentacijaAId = reprezentacijaAId;
	}

	public String getReprezentacijaANaziv() {
		return reprezentacijaANaziv;
	}

	public void setReprezentacijaANaziv(String reprezentacijaANaziv) {
		this.reprezentacijaANaziv = reprezentacijaANaziv;
	}

	public long getReprezentacijaBId() {
		return reprezentacijaBId;
	}

	public void setReprezentacijaBId(long reprezentacijaBId) {
		this.reprezentacijaBId = reprezentacijaBId;
	}

	public String getReprezentacijaBNaziv() {
		return reprezentacijaBNaziv;
	}

	public void setReprezentacijaBNaziv(String reprezentacijaBNaziv) {
		this.reprezentacijaBNaziv = reprezentacijaBNaziv;
	}

	public int getBrojGolovaA() {
		return brojGolovaA;
	}

	public void setBrojGolovaA(int brojGolovaA) {
		this.brojGolovaA = brojGolovaA;
	}

	public int getBrojGolovaB() {
		return brojGolovaB;
	}

	public void setBrojGolovaB(int brojGolovaB) {
		this.brojGolovaB = brojGolovaB;
	}

	@Override
	public String toString() {
		return "UtakmicaDTO [id=" + id + ", reprezentacijaAId=" + reprezentacijaAId + ", reprezentacijaANaziv="
				+ reprezentacijaANaziv + ", reprezentacijaBId=" + reprezentacijaBId + ", reprezentacijaBNaziv="
				+ reprezentacijaBNaziv + ", brojGolovaA=" + brojGolovaA + ", brojGolovaB=" + brojGolovaB + "]";
	}




}
