package ejercicios_semana_6.Ejercicio2;

public abstract class Entidad {
    protected int id;
    protected String nombre;
    public String getNombre(){
        return this.nombre;
    }
    public void setNobre(String valor){
        this.nombre = valor;
    }

}
