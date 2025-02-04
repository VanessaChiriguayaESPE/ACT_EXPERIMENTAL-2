import java.util.List;
import java.util.Scanner;

public class VistaConsola {
    private Scanner scanner = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n1. Agregar producto");
        System.out.println("2. Actualizar inventario");
        System.out.println("3. Listar productos");
        System.out.println("4. Calcular valor total");
        System.out.println("5. Salir");
        System.out.print("Seleccione opción: ");
        return scanner.nextInt();
    }

    public Producto solicitarDatosProducto() {
        System.out.print("ID: ");
        int id = scanner.nextInt();
        System.out.print("Nombre: ");
        String nombre = scanner.next();
        System.out.print("Precio: ");
        double precio = scanner.nextDouble();
        System.out.print("Cantidad: ");
        int cantidad = scanner.nextInt();
        return new Producto(id, nombre, precio, cantidad);
    }

    public int[] solicitarIdYCantidad() {
        System.out.print("ID del producto: ");
        int id = scanner.nextInt();
        System.out.print("Nueva cantidad: ");
        int cantidad = scanner.nextInt();
        return new int[]{id, cantidad};
    }

    public void mostrarProductos(List<Producto> productos) {
        System.out.println("\n--- LISTADO DE PRODUCTOS ---");
        for (Producto p : productos) {
            System.out.printf("ID: %d | Nombre: %s | Precio: $%.2f | Cantidad: %d%n",
                    p.getId(), p.getNombre(), p.getPrecio(), p.getCantidad());
        }
    }

    public void mostrarTotal(double total) {
        System.out.printf("\nValor total del inventario: $%.2f%n", total);
    }
}
