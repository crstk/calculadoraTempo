

package br.com.mycompany.calculardatas;


import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 *
 * @author Cristian
 */
public class Calculardatas {
    
    
    
    static void menu(){
        LocalDate hoje = LocalDate.now();
        System.out.println("CALCULADORA DE DATAS - \t" + hoje + "\n");
        
        System.out.println("Escolha uma opção:");
        System.out.println("\t1. Adicionar dias a uma data");
        System.out.println("\t2. Subtrair dias de uma data");
        System.out.println("\t3. Diferença entre duas datas");
        System.out.println("\t4. Adicionar minutos");
        System.out.println("\t5. Subtrair minutos");
        System.out.println("\t6. Diferença entre duas horas");
        System.out.println("\t7. Diferença em horas entre datas");
        System.out.println("\t0. Sair");
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
       MeusMetodos calculos = new MeusMetodos();
       int i;
       int op;
       
       try{
       
       do{
          menu();

          op = scan.nextInt();

                 switch(op){

                     case 1 -> calculos.somarDias();

                     case 2 -> calculos.subtrairDias();

                     case 3 -> calculos.diferencaEmDias();

                     case 4 -> calculos.somarHoras();

                     case 5 -> calculos.subtrairHoras();

                     case 6 -> calculos.diferencaEntreHoras();

                     case 7 -> calculos.diferencaDatasEmHoras();

                     case 0 -> {
                         break;
                      }

                     default -> System.out.println("Escolha uma opção da lista!");
                 }

                     System.out.println("\nDeseja encerrar a operação?\n1. SIM\n2. NÃO");

                     i = scan.nextInt();
                
       } while(i != 1);
       
       } catch(InputMismatchException e){

                System.out.println("Valor inválido! Tente novamente escolhendo entre as opções disponíveis");
            }
       
       
    }
}
