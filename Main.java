//1)
/*import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    float ant = 1, prox = 0, aux = 0;
	    boolean encontrou = false;
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.print("Digite um número: ");
	    int numero = scan.nextInt();
	    
	    for(int i = 0; i <= numero; i++){
	        aux = ant;
	        ant = prox;
	        prox = aux + prox;
	        
	        if(prox == numero){
	            encontrou = true;
	            break;
	        }
	    }
	    if(encontrou == false){
	        System.out.println("O número " + numero + " não pertence a frequência de Fibonacci");
	    }
	    else{
	        System.out.println("O número " + numero + " pertence a frequência de Fibonacci");
	    }
	}
}*/

//2)
/*import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int quant = 0, cont = 0;
		
		System.out.print("Digite uma string: ");
		String palavra = scan.nextLine();
		palavra = palavra.toLowerCase();
		char c[] = palavra.toCharArray();
		
		for(int i = 0; i <= c.length - 1; i++){
		    if(c[i] == 'a'){
		        cont++;
		    }
		    else if(c[i] == 'á'){
		        cont++;
		    }
		    else if(c[i] == 'à'){
		        cont++;
		    }
		}
		
		System.out.println("A letra 'a' aparece " + cont + " vezes na string");
	}
}*/

//3)
/*public class Main
{
	public static void main(String[] args) {
		int indice = 12, soma = 0, k = 1;
		
		while(k < indice){
		    k = k + 1;
		    soma = soma + k;
		}
		
		System.out.println(soma);
	}
}*/