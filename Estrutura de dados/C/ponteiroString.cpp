#include <stdio.h>

int main(){
	char p[] = "Helo";
	char *c =p;
	while(*c != '\0'){
		printf("%c",*c);
		c++;
	}
	
	return 0;
}
