#include <stdio.h>

int main(){
	int x = 10;
	int *y = &x;
	int **z = &y;
	printf("%d",**z);
	return 0;
}

