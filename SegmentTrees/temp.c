#include <stdio.h>

int po(int i, int j) {
	int res = 1;

	for(int x=0;x<j;x++)
		res *= i; 
	return res;
}

int main() {

	int base[100], power[100];
	char x, ch=' ';

	int  len =0 ;
	int num;

	while(1) {
		scanf("%c", &ch);

		if(ch == '\n') 
			break;
		scanf("%d%c%c%d", &base[len], &x, &x, &power[len]);
		

		if(ch == '+')
			base[len] *= -1;

		printf("%d %d %c\n", base[len], power[len], ch);
		len++;
	}
	scanf("%d", &num);

	for(int i=0;i<len;i++) {
		power[i] = po(num, power[i]);
		printf("%d ", power[i]);

	}
	int sum = 0;

	for(int i=0;i<len;i++) {
		sum += base[i] * power[i];
	}
	printf("%d", sum);




// +10x^2+4x^1-3x^0
	return 0;
}