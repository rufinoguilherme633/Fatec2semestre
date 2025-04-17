#include <cstdio>  

void calcularComprimento(int *r, float *resultado) {     
    float pi = 3.14;     
    *resultado = 2 * pi * (*r);  
}  

int main() {     
    int r;     
    float resultado;  
	    
    printf("Digite o raio: ");     
    scanf("%d", &r);     
    calcularComprimento(&r, &resultado);  

    printf("Comprimento: %f\n", resultado);      


	printf("ola");
    return 0; 
}

