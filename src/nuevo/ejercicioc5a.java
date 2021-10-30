package nuevo;

public class ejercicioc5a {

    private String descripcion;
    private double precioVenta;
    private int stock;

    public ejercicioc5a(String descripcion, double precio, int stock) {

        this.descripcion = descripcion;
        precioVenta = precio;
        this.stock = stock;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    public boolean hayStock(){
        return stock>0;
    }

    public double consultarPrecio(){
        return precioVenta;
    }


}
