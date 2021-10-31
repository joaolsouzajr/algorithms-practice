#include <stdio.h>

int main()
{
    int total_medicoes;
    int intervalo;
    
    int soma_medicao;
    int count_teste = 0;
    while(true)
    {
        scanf("%d", &total_medicoes);
        scanf("%d", &intervalo);
        
        if(total_medicoes == 0 && intervalo == 0)
            break;

        soma_medicao = 0;
        int medicoes[total_medicoes];
        int maior_medicao = -200;
        int menor_medicao = 200;
        int lido = 0;
        bool deve_somar;
        bool deve_ler;
        int med = 0;
        for(int i = 0; i < total_medicoes; i++){
            scanf("%d",&medicoes[i]);
        }
        for(int j = 0; j < intervalo;j++)
        {
            deve_somar = j < total_medicoes; 
                
            if(deve_somar){
                soma_medicao += medicoes[j];
            }
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
            med = 0;
            if(i+intervalo-1 < total_medicoes){
                soma_medicao = (soma_medicao - medicoes[i-1]) + medicoes[i+intervalo-1];
                med = soma_medicao/intervalo;    
                if(med > maior_medicao)
                    maior_medicao = med;
                if(med < menor_medicao)
                    menor_medicao = med;
            }

        }
        printf("Teste %d\n%d %d\n\n",++count_teste,menor_medicao, maior_medicao);
    }
    return 0;

}

