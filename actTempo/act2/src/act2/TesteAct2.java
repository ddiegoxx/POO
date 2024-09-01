package act2;

import java.util.Scanner;

public class TesteAct2 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

  
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Tempo");
        System.out.println("2 - Horario");
        System.out.println("3 - Data");
        int escolha = scanner.nextInt();

        Tempo tempoObjeto;

        switch (escolha) {
            case 1:
                
                tempoObjeto = new Tempo();
                break;

            case 2:
                
                System.out.println("Digite a hora, minuto e segundo:");
                int hora = scanner.nextInt();
                int minuto = scanner.nextInt();
                int segundo = scanner.nextInt();
                tempoObjeto = new Horario(hora, minuto, segundo);
                break;

            case 3:
                
                System.out.println("Digite o dia, mês e ano:");
                int dia = scanner.nextInt();
                int mes = scanner.nextInt();
                int ano = scanner.nextInt();
                tempoObjeto = new Data(dia, mes, ano);
                break;

            default:
                System.out.println("Opção inválida!");
                return;
        }

        
        dadosTempo(tempoObjeto);
    }

    public static void dadosTempo(Tempo oTempo) {
        System.out.println("Tempo formatado: " + oTempo.toString());
        System.out.println("Tempo em segundos: " + oTempo.quantidade());
    }

}
