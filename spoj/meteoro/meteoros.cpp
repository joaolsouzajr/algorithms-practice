#include <stdio.h>

int main()
{
    int x1, y1, x2, y2;


    int total_meteoros;
    int x, y;
   
    int meteoritos;
    int teste = 0;
    while(true)
    {
        //superior esquerdo
        scanf("%d", &x1);
        scanf("%d", &y1);
        //inferior direito
        scanf("%d", &x2);
        scanf("%d", &y2);
        
        if(x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0)
            break;
        meteoritos = 0;
        
        scanf("%d", &total_meteoros);

        for(int i = 0; i < total_meteoros; i++)
        {
            scanf("%d", &x);
            scanf("%d", &y);

            if((x >= x1 && x <= x2) 
                && (y >= y2 && y <= y1)){
                    //printf("(%d, %d)",x, y);   
                    meteoritos++;
            }
        } 
        printf("Teste %d\n%d\n\n",++teste,meteoritos);
        
    }
    return 0;

}

