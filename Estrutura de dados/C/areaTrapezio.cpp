#include <cstdio>
void calcularAreaTrapezio(int *baseMaior, int *baseMenor, int *altura, int *area){

 *area = ((*baseMaior) + (*baseMenor)) * (*altura) / 2;
 


}

int main(){
	
	
	int baseMaior; 
	int baseMenor; 
	int altura;
	int area;
	
	printf("Digite base maior");
	scanf("%d",&baseMaior);
	
	
	printf("Digite base menor");
	scanf("%d",&baseMenor);
	
	printf("Digite base altura");
	scanf("%d",&altura);
	
	
	calcularAreaTrapezio(&baseMaior,&baseMenor,&altura, &area);
	printf("%d",area);
	return 0;
}

