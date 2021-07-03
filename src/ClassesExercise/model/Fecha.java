package ClassesExercise.model;

import java.time.LocalDate;

public class Fecha {

    private int dia;
    private int mes;
    private int anio;
    private LocalDate ld;

    public Fecha(){
        dia = 1;
        mes = 1;
        anio = 2021;
        ld = LocalDate.of(anio,mes,dia);
    }
    public Fecha(int dia, int mes, int anio){
        if (validateFecha(dia, mes, anio)){
            this.dia = dia;
            this.mes = mes;
            this.anio = anio;
            ld = LocalDate.of(anio,mes,dia);
        }
        else {
            dia = 1;
            mes = 1;
            anio = 2021;
            ld = LocalDate.of(anio,mes,dia);
        }
    }

    public boolean validateFecha(int d, int m, int a) {
        try {
            LocalDate l = LocalDate.of(a, m, d);
            return true;
        }
        catch (Exception e) {return false;}
    }

    public void nextDay() {
        ld = ld.plusDays(1);
        dia = ld.getDayOfMonth();
        mes = ld.getMonthValue();
        anio = ld.getYear();
    }

    public String toString() {
        return dia + "/" + mes + "/" + anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
