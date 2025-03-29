#include <stdio.h>
#define PI 3.13

// Função que calcula a área do quadrado usando ponteiro
void calcularArea(int *lado, int *area) {
	*area = ((*lado) * (*lado)) ;
}


void calcularAreaRetangulo(int *lado, int *lado2,int *area) {
	*area = (*lado) * (*lado2);
}

void calcularAraCirculo(double *raioCirculo,double *areaCirculo){

	
	
	*areaCirculo = PI * ((*raioCirculo)*(*raioCirculo));
}


void calcularAreaTriangulo(int *lado,int *lado2, int *area) {
	*area = ((*lado) * (*lado2))/2 ;
}


int volumeCubo(int *lado, int *lado1, int *lado2,int *area){
	
	*area = *(lado) * (*lado1) *(*lado2);
	
}


void calcularVolumeCilindro(int *raio, int *altura ,int *area){

	
	
	*volume = PI * (*raio) * (*raio) * (*altura);
}

int main() { 
	int lado, area,lado2, lado3; 
	double raioCirculo,areaCirculo;
// Entrada do usuário 
	printf("Digite o valor do lado ");
	scanf("%d", &lado);
	
	printf("Digite o valor do lado2 ");
	scanf("%d", &lado2);
	
	printf("Digite o valor do lado2 ");
	scanf("%d", &lado3);
	 // Chama a função para calcular a área 
	 
	 //calcularArea(&lado,&area);
	 //calcularAreaRetangulo(&lado, &lado2,&area);
	 //calcularAreaTriangulo(&lado,&lado2,&area);
	 volumeCubo(&lado,&lado2,&lado3,&area);
	  // Exibe o resultado 
	printf("A área  é: %d\n", area); 
	
//	printf("Digite o raio");
//	scanf("%lf", &raioCirculo);
//	calcularAraCirculo(&raioCirculo,&areaCirculo);
//	
//	printf("%.2f",areaCirculo);
	return 0;
}
