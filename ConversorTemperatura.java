import java.util.Scanner;

public class ConversorTemperatura {
     public static void main(String[] args) {

     //Declaração de variável
     double celsius, fahrenheit;
     int op;

      //Criação e instância do objeto de entrada
      Scanner entrada = new Scanner(System.in);

    {
        System.out.println("\n\t\t\t -- Conversor de temperatura --\n"); 
          
        System.out.println("1. Celsius");
        System.out.println("2. Fahreinheit");
        System.out.println("3. Sair"); 

        System.out.print("Opção: ");
            op = entrada.nextInt();

    //Celsius para fahrenheit
     if(op == 1){
        System.out.println("\n\t\t\t -- Celsius para fahrenheit-- \n");

    //Entrada
    System.out.println("Informe a temperatura em celsius: ");
    celsius = entrada.nextDouble();

    //Processamento
    fahrenheit = celsius * 1.8 + 32;

    //Saída
    System.out.printf("%f graus celcius equivale à %f", celsius, fahrenheit);}



 //Fahrenheit para celsius
    else if(op == 2){
    System.out.println("\n\t\t\t -- Farenheit para celsius -- \n");

    //Entrada
    System.out.println("Informe a temperatura em fahrenheit: ");
    fahrenheit = entrada.nextDouble();

    //Processamento
    celsius = (fahrenheit - 32) / 1.8;

    //Saída
    System.out.printf("%f graus celcius equivale à &f", fahrenheit, celsius);

    }else if(op == 3) {
        System.out.println("\n\t\t\t -- Forte abraço! -- \n");
    }else{
        System.out.println("Opção " + op + " Incorreta!");
    }



        

    }
}
}
  
 

