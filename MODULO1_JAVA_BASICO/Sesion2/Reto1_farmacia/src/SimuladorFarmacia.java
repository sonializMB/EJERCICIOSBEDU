public class SimuladorFarmacia {
    //Atributos
    private String medic;
    public double precio;
    public int piezas;

    //Métodos get y set para acceder a los atributos en private
    public String getMedic() {return medic;}
    public void setMedic(String medic) {this.medic = medic;}

    public double getPrecio() {return precio;}
    public void setPrecio(double precio) {this.precio = precio;}

    public int getPiezas() {return piezas;}
    public void setPiezas(int piezas) {this.piezas = piezas;}

    //Métodos

    // Esto retorna el precio total del medicamento
    public double Precio_Total() {
        return precio * piezas;
    }
    // Esto calcula el descuento
    // NOTA:
    // Operador ternario "? :" -> es una forma facil y simple de escribir codigo que funciona de manera similar a un if-else simples
    // Sintaxis: condición ? valor_si_verdadero : valor_si_falso;
    public double Descuento() {
        var total_descuento = Precio_Total();
        return total_descuento > 500 ? total_descuento * 0.85 : total_descuento;
    }
}