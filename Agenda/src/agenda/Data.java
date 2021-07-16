package agenda;

import java.util.Scanner;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data() 
    {
        this.criarData();
    }

    public void criarData() 
    {
        Scanner s= new Scanner(System.in);

        System.out.print("Digite o dia: ");
        this.dia = s.nextInt();

        System.out.print("Digite o mes: ");
        this.mes = s.nextInt();

        System.out.print("Digite o ano: ");
        this.ano = s.nextInt();



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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


}