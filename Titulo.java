package com.aluracursos.screenmatch.modelos;

public class Titulo {

    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;

    //Private se utiliza para ocultar y bloquear los atributos para que no puedan ser modificados
    private double sumaDeLasEvaluaciones;
    private int totalDeLasEvaluaciones;

    //Creando metodos que modifican valores

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    //Nuevo metodo, funciona para visualizar caracteristicas privadas (private)
    public int getTotalDeLasEvaluaciones(){
        return totalDeLasEvaluaciones;
    }

    //Nuevo Metodo
    public void muestaFichaTecnica(){
        System.out.println("El nombre de la pelicula es: " + nombre);
        System.out.println("Su fecha de lanzamiento es: " + fechaDeLanzamiento);
        System.out.println("Duracion en minutos: " + getDuracionEnMinutos());
    }
    //Nuevo metodo
    public void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        //sumaDeLasEvaluaciones = sumaDeLasEvaluaciones + nota; //Otra forma de hacerlo
        totalDeLasEvaluaciones++;
    }

    //otro metodo
    public double calculaMedia(){
        return sumaDeLasEvaluaciones / totalDeLasEvaluaciones;
    }
}
