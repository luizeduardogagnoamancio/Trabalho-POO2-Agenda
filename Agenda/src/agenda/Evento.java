package agenda;

import java.util.List;
import java.util.Scanner;

public class Evento {
    private String nome;
    private Data data;
    private Hora hora;
    
    public Evento() {
        
        this.criarEvento();
        
        
    }
    
    public void criarEvento()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o nome do evento: ");        
        this.nome = s.nextLine();
        this.data = new Data();
        this.hora = new Hora();
        
        System.out.println("Evento Criado");
    }
    
    public void editarEvento()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o novo nome do evento: ");        
        this.nome = s.nextLine();
        
        System.out.print("Digite o novo dia: ");        
        this.getData().setDia(s.nextInt());
        
        System.out.print("Digite o novo mes: ");        
        this.getData().setMes(s.nextInt());
        
        System.out.print("Digite o novo ano: ");        
        this.getData().setAno(s.nextInt());
        
        System.out.print("Digite o nova hora: ");
        this.getHora().setHora(s.nextInt());
                
        System.out.print("Digite o novo minuto: ");
        this.getHora().setMinuto(s.nextInt());
                
        System.out.print("Digite o novo segundo: ");
        this.getHora().setSegundo(s.nextInt());
        
        System.out.println("Evento Editado");
    }
    
    public void deletarEvento(List<Evento> lista,int posicao)
    {
        lista.remove(posicao);
        System.out.println("Evento Deletado");
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Hora getHora() {
        return hora;
    }

    public void setHora(Hora hora) {
        this.hora = hora;
    }
    
}