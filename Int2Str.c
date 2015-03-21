#include <string.h>
#include <stdio.h>
#include <stdlib.h>



int main(){

	int var = 0;
	char str1[4];
	char str2[4];
	int temp = 0;
	char buffer[5];

	strcpy(str1,"00");
	strcpy(str2,"0");


	while (var <=250)
	{

		strcpy(buffer,"");

		if(var<10)
		{
			temp = var;
			sprintf(buffer,%d,temp);
			strcat(str1,buffer);

			printf("%s\n", str1 );

		}
		else if(var > 10 && var < 100)
		{
			temp = var;
			sprintf(buffer, %d,temp);
			strcat(str2,buffer);

			printf("%s\n", buffer );
		}
		else
		{
			printf("%d\n", var );
		}

		var++;
	}


return 0;
}