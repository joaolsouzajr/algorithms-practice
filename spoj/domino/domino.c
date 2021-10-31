#include <stdio.h>

int main(){

	int total_pecas = 0;

    scanf("%d", &total_pecas);
    //printf("%d \n", total_pecas);
    int count_teste = 0;
    while(total_pecas != 0)
    {
    	int pecas_part1[total_pecas];
    	int pecas_part2[total_pecas];
		int i,j;
        for(i = 0;i < total_pecas; i++)
        {
        	scanf("%d %d", &pecas_part1[i], &pecas_part2[i]);
        	//printf("%d %d", pecas[i], pecas[i+1]);
        	//printf("\n");
        }
        int count_pars = 0;
       	//int lido_p1[total_pecas];
        //int lido_p2[total_pecas];
        for(i = 0;i < total_pecas; i++)
        {

        	for(j = 0;j < total_pecas; j++)
        	{
        		if(i != j && 
        			(pecas_part1[i] == pecas_part1[j] || pecas_part1[i] == pecas_part2[j]))
        		{
        			//printf("%d %d - %d %d  ", pecas_part1[i], pecas_part1[j] ,pecas_part1[i], pecas_part2[j]);
        			++count_pars;
        		}
        	}
        }
        //printf("Pares %d \n", count_pars);
        if(count_pars/2 >= total_pecas/2 && count_pars/2 < total_pecas){
        	printf("Teste %d\nsim\n\n",++count_teste);
        }else{
        	printf("Teste %d\nnao\n\n",++count_teste);
        }
        scanf("%d", &total_pecas);
        //printf("%d \n", total_pecas);
        
    }

	return 0;
}