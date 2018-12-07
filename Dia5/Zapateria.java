package zapateria;
import java.util.ArrayList;
public class Zapateria {

    public static void main(String[] args) {
        //Arreglo dinámico
        ArrayList<Zapato> zapatera = new ArrayList<Zapato>();
        Zapato zapato1 = new Zapato(7.5, "Café", "Flexi");
        zapatera.add(zapato1);
        zapato1 = new Zapato(8.5, "Negro", "Nike");
        zapatera.add(zapato1);
        zapato1 = new Zapato(9.5, "Gris", "Adidas");
        zapatera.add(zapato1);
        zapato1 = new Zapato(8.5, "Negro", "Nike");
        zapatera.add(zapato1);
        zapato1 = new Zapato(9.5, "Gris", "Adidas");
        zapatera.add(zapato1);
        
        if(zapatera.isEmpty()){
            System.out.println("La zapatera está vacía");            
        }else{
            System.out.println("La zapatera no está vacía");
            for (Zapato zapato : zapatera) {
                System.out.println(zapato);
            }
        }
        System.out.println("El tamaño del arraylist es: " + zapatera.size());
        System.out.println("Contiene al zapato 1?: "+ zapatera.contains(zapato1));
        System.out.println("El índice del zapato 1 es: " + zapatera.indexOf(zapato1));
        System.out.println(zapatera.get(4));
        
        //Buscar zapato por marca
        System.out.println("Busqueda: ------------------------");
        String marcaBuscada = "Nike";
        for (Zapato zapato : zapatera) {
            if(zapato.getMarca().equals(marcaBuscada)){
                System.out.println(zapato);
            }            
        }
        
        System.out.println("Separador: ------------------------");
        for (Zapato zapato : zapatera) {
            System.out.println(zapato);
        }
        zapatera.remove(3);
        zapatera.remove(zapato1);
        //zapatera.clear();
        System.out.println("Borrando: ------------------------");
        for (Zapato zapato : zapatera) {
            System.out.println(zapato);
        }
        
        System.out.println("Copiando: ------------------------");
        ArrayList copiaZapatera = (ArrayList)zapatera.clone();
        for (Object zapato : copiaZapatera) {
            System.out.println(zapato);
        }
        
        Zapato nuevo = (Zapato)copiaZapatera.get(0);
        System.out.println(nuevo);
        
        
        
        System.out.println("ArrayList de enteros: ------------------------");
        ArrayList<Integer> enteros = new ArrayList<Integer>();
        enteros.add(7);
        enteros.add(2);
        enteros.add(9);
        enteros.add(2);
        enteros.add(7);
        enteros.add(3);
        enteros.add(10);
        enteros.add(2);
        for (Integer entero : enteros) {
            System.out.println(entero);
        }
        
        System.out.println("index del numero 2: " + enteros.indexOf(2));
        System.out.println("index del numero 2: " + enteros.lastIndexOf(2));
        
    }
    
}
