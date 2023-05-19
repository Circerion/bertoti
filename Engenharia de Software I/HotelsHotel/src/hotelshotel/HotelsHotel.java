/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotelshotel;

import java.util.LinkedList;
import java.util.List;

public class HotelsHotel {

     private List<Quarto> Quarto = new LinkedList<Quarto>();

     public void cadastrarQuarto(Quarto Quarto){
          Quarto.add(Quarto);
     }

     public List<Quarto> buscarQuartoPorCategoria(Categoria categoria){
           List<Quarto> QuartoEncontrados = new LinkedList<Quarto>();
           for(Quarto Quarto:Quarto){
                if(Quarto.getcategoria().comparar(categoria)) QuartoEncontrados.add(Quarto);
           }
           return QuartoEncontrados;
     }

     public Quarto buscarQuartoPorAndar(String Andar){
          for(Quarto Quarto:Quarto){
               if(Quarto.getAndar().equals(Andar)) return Quarto; 
          }
          return null;
     }

     public List<Quarto> getQuarto(){
           return Quarto;
     }
}