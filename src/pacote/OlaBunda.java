package pacote;import java.util.Scanner;public class OlaBunda{public static void darABunda(){System.out.println("Ai to dando");}public static void main(String[] args){Scanner leitor = new Scanner(System.in);System.out.println("dar a bunda = 1");int dar = leitor.nextInt();leitor.close();if(dar == 1){darABunda();}else{System.out.println("nao dei so masculo");}}}