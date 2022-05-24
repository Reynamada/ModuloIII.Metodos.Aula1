package practicas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        //*******************************************************************
        //Calculadora
        Scanner scan = new Scanner(System.in);
        System.out.println("Calculadora");
        System.out.println("Digite o primer valor: ");
        double a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        double b = scan.nextInt();

        Calculo.suma(a,b);
        Calculo.subtracao(a,b);
        Calculo.multiplicar(a,b);
        Calculo.dividir(a,b);


        //*****************************************************************
        //Mensagem
        System.out.println("************************************************** ");
        System.out.println("Saludos");
        System.out.println("Que hora é: ");
        int hora;
        hora = scan.nextInt();

        Mensagem.obterMensagem(hora);

        //************************************************************
        //Emprestimo
        System.out.println("************************************************** ");
        System.out.println("Emprestimo: ");
        System.out.println("Quanto dinheiro voce solicita: ");
        int valor;
        valor= scan.nextInt();
        System.out.println("Quantas parcelas: ");
        int parcelas;
        parcelas= scan.nextInt();
        Emprestimo.calcular(valor, parcelas);





        }
}
