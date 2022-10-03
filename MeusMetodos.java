/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mycompany.calculardatas;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class MeusMetodos {
    
    Scanner scan = new Scanner(System.in);
    
    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yy");
    DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    

    private int d1; // Dia ou Hora
    private int d2; // Mes ou Minutos
    private int d3; // Ano ou Segundos
    int minutos;

    public int getD1() {
        return d1;
    }

    public void setD1(int d1) {
        this.d1 = d1;
    }

    public int getD2() {
        return d2;
    }

    public void setD2(int d2) {
        this.d2 = d2;
    }

    public int getD3() {
        return d3;
    }

    public void setD3(int d3) {
        this.d3 = d3;
    }
    

    public void inserirDados(){
        
        System.out.print("Inserir Dia/Hora: ");
        d1 = scan.nextInt();
        
        System.out.print("Inserir Mês/Minutos: ");
        d2 = scan.nextInt();
        
        System.out.print("Inserir Ano/Segundos: ");
        d3 = scan.nextInt();
        scan.nextLine();
    }
    
    public void subtrairDias(){
        System.out.println("Subtrair dias de uma data\n");
        inserirDados();
        LocalDate data1 = LocalDate.of(this.d3,this.d2,this.d1);
        
        System.out.println("Quantos dias deseja subtrair da data " + d1 + "/" + d2 + "/" + d3 + "?");
        int subDia = scan.nextInt();
       
        LocalDate resultado = data1.minus(subDia, ChronoUnit.DAYS);  //subtração
       
        System.out.println("Data retrógrada: " + resultado.format(fmt1));
    }
    
    public void somarDias(){
        System.out.println("Somar dias a uma data\n");
        inserirDados();
        LocalDate data1 = LocalDate.of(d3, d2, d1);
        
        System.out.println("Quantos dias deseja somar à data " + d1 + "/" + d2 + "/" + d3 + "?");
        int maisDias = scan.nextInt();
       
        LocalDate resultado = data1.plusDays(maisDias);  //adição
       
        System.out.println("Data futura: " + resultado.format(fmt1));
    }
    
    public void diferencaEmDias(){
        System.out.println("Diferença (em dias) entre duas datas\n");
        
        System.out.println("Primeira data \n");
       
       inserirDados();
       LocalDateTime date1 = LocalDateTime.of(d3, d2, d1,0,0);
       
       System.out.println("\nSegunda data \n");
       
       inserirDados();
       LocalDateTime date2 = LocalDateTime.of(this.d3, this.d2, this.d1,0,0);
       
       date1.format(fmt2);
       date2.format(fmt2);
      
       Duration diferencaEmDias = Duration.between(date1, date2);
      
       System.out.println("Diferença entre as datas em dias São " + diferencaEmDias.toDays() + " dias.");  
    }
    
    public void diferencaDatasEmHoras(){
        System.out.println("Diferença (em dias) entre duas datas\n");
        
       System.out.println("Primeira data ");
       
       inserirDados();
       LocalDateTime date1 = LocalDateTime.of(d3, d2, d1,0,0);
       
       System.out.println("\nSegunda data ");
       
       inserirDados();
       LocalDateTime date2 = LocalDateTime.of(this.d3, this.d2, this.d1,0,0);
       
       date1.format(fmt2);
       date2.format(fmt2);
      
       Duration diferencaEmDias = Duration.between(date1, date2);
      
       System.out.println("Diferença entre as datas em dias são: " + diferencaEmDias.toHours());
    }
    
    public void subtrairHoras(){
        System.out.println("Subtrair minutos da hora informada\n");
        inserirDados();
        LocalTime d11 = LocalTime.of(d1, d2, d3);
        
        System.out.println("Quantos minutos deseja subtrair? ");
        int subHora = scan.nextInt();
        scan.nextLine();
        
        LocalTime resultado = d11.minusMinutes(subHora);
        
        System.out.println("Resultado: " + resultado);
    }
    
    public void somarHoras(){
        System.out.println("Adicionar minutos à hora informada\n");
        inserirDados();
        LocalTime d11 = LocalTime.of(d1, d2, d3);
        
        System.out.println("Quantos minutos deseja adicionar? ");
        int adcHora = scan.nextInt();
        scan.nextLine();
        
        LocalTime resultado = d11.plusMinutes(adcHora);
        
        System.out.println("Resultado: " + resultado);
        
    }
    
    public void diferencaEntreHoras(){
        System.out.println("Diferença entre as horas informadas\n");
        System.out.println("Primeira hora\n");
        
        inserirDados();
        LocalTime d11 = LocalTime.of(d1, d2, d3);
        
        System.out.println("\nSegunda hora\n");
        
        inserirDados();
        LocalTime d12 = LocalTime.of(d1, d2, d3);
        
        Duration resultado = Duration.between(d11, d12);
        
        System.out.println("Resultado: " + resultado.toString());
    }
    
}
