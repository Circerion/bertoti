/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelshotel;

/**
 *
 * @author DELL
 */
public class Quarto {
    private String andar;
	private Categoria categoria;
	
	public Quarto(String andar, Categoria categoria) {
		this.andar = andar;
		this.categoria = categoria;
	}

	public String getandar(){
		return andar;
	}
	
	public void setandar(String novoandar){
		andar = novoandar;
	}

	public Categoria getcategoria() {
		return categoria;
	}

	public void setcategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
