package agenda;

import java.util.Scanner;

public class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    public Hora() 
    {
        this.criarHora();

    }

    public void criarHora() 
    {
        Scanner s= new Scanner(System.in);

        System.out.print("Digite a hora: ");
        this.hora = s.nextInt();

        System.out.print("Digite o minuto: ");
        this.minuto = s.nextInt();

        System.out.print("Digite o segundo: ");
        this.segundo = s.nextInt();


    }


    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }



}