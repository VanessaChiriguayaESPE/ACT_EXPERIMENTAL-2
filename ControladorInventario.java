public class ControladorInventario {
    private Inventario inventario;
    private VistaConsola vista;

    public ControladorInventario(Inventario inventario, VistaConsola vista) {
        this.inventario = inventario;
        this.vista = vista;
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    actualizarInventario();
                    break;
                case 3:
                    listarProductos();
                    break;
                case 4:
                    calcularTotal();
                    break;
            }
        } while (opcion != 5);
    }

    private void agregarProducto() {
        Producto producto = vista.solicitarDatosProducto();
        inventario.agregarProducto(producto);
    }

    private void actualizarInventario() {
        int[] datos = vista.solicitarIdYCantidad();
        inventario.actualizarCantidad(datos[0], datos[1]);
    }

    private void listarProductos() {
        vista.mostrarProductos(inventario.consultarProductos());
    }

    private void calcularTotal() {
        vista.mostrarTotal(inventario.calcularValorTotal());
    }
}
