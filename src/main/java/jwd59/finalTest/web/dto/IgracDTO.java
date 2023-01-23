package jwd59.finalTest.web.dto;


import org.springframework.stereotype.Component;


@Component
public class IgracDTO {

    private Long id;
    
    private String ime;
    
    private String prezime;
    
    private int postignutiGolovi;
    
    private String reprezentacijaNaziv;
    
    

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public int getPostignutiGolovi() {
		return postignutiGolovi;
	}

	public void setPostignutiGolovi(int postignutiGolovi) {
		this.postignutiGolovi = postignutiGolovi;
	}

	public String getReprezentacijaNaziv() {
		return reprezentacijaNaziv;
	}

	public void setReprezentacijaNaziv(String reprezentacijaNaziv) {
		this.reprezentacijaNaziv = reprezentacijaNaziv;
	}

	@Override
	public String toString() {
		return "IgracDTO [id=" + id + ", ime=" + ime + ", prezime=" + prezime + ", postignutiGolovi=" + postignutiGolovi
				+ ", reprezentacijaNaziv=" + reprezentacijaNaziv + "]";
	}
    
    
}
