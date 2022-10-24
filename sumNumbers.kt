#include <stdio.h>

int main() {

int n,i,sum=0;

// reading input from user
printf("Enter a number: ");
scanf("%d",&n);

// running loop from 1 to n
for(i = 1;i<=n;i++){
// updating sum
sum += i;
}

// printing sum
printf("Sum is %d\n",sum);

return 0;
}
