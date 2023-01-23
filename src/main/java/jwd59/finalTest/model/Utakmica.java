package jwd59.finalTest.model;



import javax.persistence.*;


@Entity
public class Utakmica {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    private Reprezentacija reprezentacijaA;
    
    @ManyToOne
    private Reprezentacija reprezentacijaB;
    
    @Column
    int brojGolovaA;
    
    @Column
    int brojGolovaB;

	public Utakmica() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Reprezentacija getReprezentacijaA() {
		return reprezentacijaA;
	}

	public void setReprezentacijaA(Reprezentacija reprezentacijaA) {
		this.reprezentacijaA = reprezentacijaA;
	}

	public Reprezentacija getReprezentacijaB() {
		return reprezentacijaB;
	}

	public void setReprezentacijaB(Reprezentacija reprezentacijaB) {
		this.reprezentacijaB = reprezentacijaB;
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
		return "Utakmica [id=" + id + ", reprezentacijaA=" + reprezentacijaA + ", reprezentacijaB=" + reprezentacijaB
				+ ", brojGolovaA=" + brojGolovaA + ", brojGolovaB=" + brojGolovaB + "]";
	}
	
	
    
	
    
}
