import Modelo.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // --- INSTANCIACIÓN SEGÚN EL DIAGRAMA ---

        // (1) OBJETO 1: Hamburguesa Clásica - Cliente: Kovin
        Hamburguesa h1 = new Hamburguesa("Kovin", "Res", "Mediana");
        h1.configurarIngredientes("Brioche", 1, true, true);
        h1.calcularPrecioTotal();

        // (2) OBJETO 2: Hamburguesa BBQ Doble - Cliente: Luis/Ana
        Hamburguesa h2 = new Hamburguesa("Ana", "Res", "Grande");
        h2.configurarIngredientes("Artesanal", 2, true, true);
        h2.calcularPrecioTotal();

        // (3) OBJETO 3: Hamburguesa Pollo BBQ - Cliente: Luis
        Hamburguesa h3 = new Hamburguesa("Luis", "Pollo BBQ", "Grande");
        h3.configurarIngredientes("Rústico", 1, true, true);
        h3.calcularPrecioTotal();

        // (4) OBJETO 4: Hamburguesa Vegetariana - Cliente: Maria
        Hamburguesa h4 = new Hamburguesa("Maria", "Vegetariana", "Mediana");
        h4.configurarIngredientes("Integral", 1, true, false);
        h4.calcularPrecioTotal();

        // --- GENERAR FICHAS (Salida en consola) ---
        System.out.println("======= FICHAS TÉCNICAS DE PEDIDOS =======");
        h1.mostrarInfo();
        h2.mostrarInfo();
        h3.mostrarInfo();
        h4.mostrarInfo();

        System.out.println("\n=== FIN DEL PROCESO ===");
    }
}