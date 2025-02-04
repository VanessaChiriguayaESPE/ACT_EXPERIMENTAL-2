import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void actualizarCantidad(int id, int nuevaCantidad) {
        for (Producto p : productos) {
            if (p.getId() == id) {
                p.setCantidad(nuevaCantidad);
                break;
            }
        }
    }

    public List<Producto> consultarProductos() {
        return new ArrayList<>(productos); // Devuelve una copia para proteger el encapsulamiento
    }

    public double calcularValorTotal() {
        return productos.stream()
                .mapToDouble(p -> p.getPrecio() * p.getCantidad())
                .sum();
    }
}
