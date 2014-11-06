#include <stdio.h>

int main()
{
    int total_medicoes = 0;
    int intervalo = 1;
    
    scanf("%d", &total_medicoes);
    scanf("%d", &intervalo);
    
    int soma_medicao = 0;
    int count_teste = 0;
    while(!(intervalo == 0 && total_medicoes == 0))
    {
        soma_medicao = 0;
        int medicoes[total_medicoes];
        int maior_medicao = -200;
        int menor_medicao = 200;
        int lido = 0;
        for(int i = 0;i < total_medicoes; i++)
        {
            int med = 0;
            for(int j = 0; j < intervalo;j++)
            {
                int deve_somar = i+j < total_medicoes; 
                int deve_ler = lido < total_medicoes;
                if(deve_ler &&  deve_somar){
                    scanf("%d", &medicoes[lido++]);
                }
                if(deve_somar){
                    soma_medicao += medicoes[i+j];
                }
                if(j == intervalo - 1 && deve_somar){
                    med = soma_medicao/intervalo;    
                    soma_medicao = 0;
                    if(med > maior_medicao)
                        maior_medicao = med;
                    if(med < menor_medicao)
                        menor_medicao = med;
                }
            } 

        }
        printf("Teste %d\n%d %d\n\n",++count_teste,menor_medicao, maior_medicao);
        scanf("%d", &total_medicoes);
        scanf("%d", &intervalo);
    }
    return 0;

}

