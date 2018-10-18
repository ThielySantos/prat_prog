package Model;
import java.io.Serializable;

public class Pais implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String nome;
	private double populacao;
	private double area;
	
	
	
	
	public Pais() {
	
	}
	
	public Pais(int id, String nome, double populacao, double area) {
		this.id = id;
		this.nome = nome;
		this.populacao = populacao;
		this.area = area;
	}
	
	public int getId() {
		return id;
	}
 	public void setId(int id) {
		this.id = id;
	}
 	public String getNome() {
		return nome;
	}
 	public void setNome(String nome) {
		this.nome = nome;
	}
 	public double getPopulacao() {
		return populacao;
	}
 	public void setPopulacao(double populacao) {
		this.populacao = populacao;
	}
 	public double getArea() {
		return area;
	}
 	public void setArea(double area) {
		this.area = area;
	}
	
	
 	public String toString () {
 		return "ID: " + id + " Nome: " + nome + " População: " + populacao + " Área: " + area;
 	}
 	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pais other = (Pais) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (populacao == 0) {
			if (other.populacao != 0)
				return false;
		} else if (!(populacao ==(other.populacao)))
			return false;
		if(area == 0) {
			if (other.area != 0)
				return false;
		} else if (!(area ==(other.area)))
			return false;
		if (id != other.id)
			return false;
		if (id == 0) {
			if (other.id != 0)
				return false;
		} else if (!(id == (other.id)))
			return false;
		return true;
		
		
		
	}

	

}