#include <stdio.h> // Necessário para pr
void swap(int a, int b, int *resultado) { 

	*resultado = a * b;

}

int main() {	
	int a = 10;
	int b = 20;
	int resultado;
	
	swap(a,b,&resultado);
	
	printf("%d",resultado);
	
	return 0;
}
