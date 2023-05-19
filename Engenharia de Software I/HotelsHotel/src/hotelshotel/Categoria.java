/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelshotel;

/**
 *
 * @author DELL
 */
public class Categoria {
    private String camas;
	private String banheiros;
	private String preco;

	public Categoria(String camas, String banheiros, String preco) {
		this.camas = camas;
		this.banheiros = banheiros;
		this.preco = preco;
	}
	
	public String getcamas() {
		return camas;
	}
	
	public void setcamas(String novacamas) {
		this.camas = novacamas;
	}
	
	public String getbanheiros() {
		return banheiros;
	}
	
	public void setbanheiros(String novobanheiros) {
		this.banheiros = novobanheiros;
	}
	
	public String getpreco() {
		return preco;
	}
	
	public void setpreco(String novaCor) {
		this.preco = novaCor;
	}
	
	public boolean comparar(Categoria Categoria){
		if(this.camas.equals(Categoria.camas) && this.banheiros.equals(Categoria.banheiros) && this.preco.equals(Categoria.preco)){
			return true;
		} else {
			return false;
		}
	}

}
