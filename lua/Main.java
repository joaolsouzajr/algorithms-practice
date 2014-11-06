import java.util.Scanner;
public class Main{

    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        int total_medicoes =  sc.nextInt();
        int intervalo = sc.nextInt(); 
        int soma_medicao = 0;
        int count_teste = 0;
        int maior_medicao; 
        int menor_medicao;
        int [] medicoes;
        int med;
        while(!(intervalo == 0 && total_medicoes == 0))
        {
            soma_medicao = 0;
            medicoes = new int[total_medicoes];
            for(int i = 0;i < total_medicoes; i++)
            {
                medicoes[i]=sc.nextInt();
            }
            maior_medicao = -200;
            menor_medicao = 200;
            med = 0;
            boolean deve_somar = false;
            for(int j = 0; j < intervalo;j++)
            {
                deve_somar = j < total_medicoes;
                if(deve_somar)
                    soma_medicao += medicoes[j];
                    
                if(j == intervalo - 1 && deve_somar){
                    med = soma_medicao/intervalo;    
                    if(med > maior_medicao)
                        maior_medicao = med;
                    if(med < menor_medicao)
                        menor_medicao = med;
                }
            }
            for(int i = 1;i < total_medicoes; i++)
            {
                if(i+intervalo-1 < total_medicoes){
                    soma_medicao = (soma_medicao - medicoes[i-1]) + medicoes[i+intervalo-1];
                    med = soma_medicao/intervalo;    
                    if(med > maior_medicao)
                        maior_medicao = med;
                    if(med < menor_medicao)
                        menor_medicao = med;
                }        
        
            }
            System.out.println("Teste "+(++count_teste));
            System.out.print(menor_medicao);
            System.out.print(" ");
            System.out.print(maior_medicao);
            System.out.println("\n");

            total_medicoes = sc.nextInt();
            intervalo = sc.nextInt();
        } 

        // 1   2   3   4   5   6
        // 0   1   2   3   4   5
        // v0 + v1  v0 + v1 + v2
        // v1 + v2  v1 + v2 + v3
        // v2 + v3  
        // v3 + v4
        // v4 + v5

    }
}

