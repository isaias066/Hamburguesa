package Modelo;

public class Hamburguesa {
    // Atributos definidos en el diagrama
    private String tipoPan;
    private String tipoCarne;
    private int cantidadCarnes;
    private boolean tieneQueso;
    private boolean tieneTocineta;
    private String nombreCliente;
    private String tamaño;
    private double precio;

    // Constructor: Recibe los datos básicos del INPUT
    public Hamburguesa(String nombreCliente, String tipoCarne, String tamaño) {
        this.nombreCliente = nombreCliente;
        this.tipoCarne = tipoCarne;
        this.tamaño = tamaño;
        this.cantidadCarnes = 1; // Valor por defecto
        this.tipoPan = "Regular"; // Valor por defecto
    }

    // Métodos para asignar atributos (Asignación de Atributos en el diagrama)
    public void configurarIngredientes(String pan, int carnes, boolean queso, boolean tocineta) {
        this.tipoPan = pan;
        this.cantidadCarnes = carnes;
        this.tieneQueso = queso;
        this.tieneTocineta = tocineta;
    }

    // Método: calcularPrecioTotal() - Lógica de costos extras
    public void calcularPrecioTotal() {
        double base = 10.00; // Precio base estándar
        double extraQueso = tieneQueso ? 1.50 : 0;
        double extraTocineta = tieneTocineta ? 2.00 : 0;
        double extraCarnes = (cantidadCarnes > 1) ? (cantidadCarnes - 1) * 3.00 : 0;

        // Si es vegetariana, podríamos aplicar un ajuste si fuera necesario
        this.precio = base + extraQueso + extraTocineta + extraCarnes;
    }

    // Método: esVegetariana()
    public boolean esVegetariana() {
        return tipoCarne.equalsIgnoreCase("Vegetariana");
    }

    // Método: mostrarInfo() - Generar Fichas
    public void mostrarInfo() {
        System.out.println("\n--------------------------------------");
        System.out.println("OBJETO: Hamburguesa para " + nombreCliente);
        System.out.println("Pan: " + tipoPan);
        System.out.println("Carne: " + tipoCarne + " (" + cantidadCarnes + ")");
        System.out.println("Queso: " + (tieneQueso ? "Si" : "No"));
        System.out.println("Tocineta: " + (tieneTocineta ? "Si" : "No"));
        System.out.println("Tamaño: " + tamaño);
        System.out.println("Es Vegetariana: " + (esVegetariana() ? "🌱 Si" : "No"));
        System.out.printf("Precio Total: $%.2f\n", precio);
    }
}