public class Main {
	public int addTwoNumbers(int a, int b) {
		return a+b;
	}

	public int multiplyTwoNumbers(int a, int b) {
		return a*b; 
	}

	public float divideTwoNumbers(int a, int b) {
		return a/b;
	}

	public int substractTwoNumbers(int a, int b) {
		return a-b;
	}

	public boolean isNumberEven(int a){
		if (a%2==0) {
            return true;
			
        }
		else{
			return false;
		}
	}

	public int calculateFirstRightDigit(int a){
		if (a >= 0){
			return a % 10;
		}else {
			return (a*-1) % 10;
		}
		
	}

	public float celciusToFahrenheit(float a){
	 return (a * 9/5) + 32;
	}

	public float areaOfATriangle(float height, float base){
		return (base * height) / 2;
	}

	public boolean isLeapYear(int year){
		if(year%4==0){
			if(year%100!=0){
				return true;
			}
			else{
				if (year%400==0){
					return true;
				}
				else{
					return false;
				}
				
			}
		}
		else{
			return false;
		}
	}

    public boolean isPrime(int number) {
		int n= 0;
		for(int i=1; i<number+1; i++){
			if(number%i==0){
				n = n+1 ;
			}
		}
			if (n==2){
				return true;
			}
			else{
				return false;
			}
			
	   
    }

    public int calculateFactorial(int number){
		int n= 1;
		for(int i=1; i<number+1; i++){
			n= n*i;
		}
		return n;
    }

    public int calculateLastNFibonnacci(int n){
		int a= 1;
		int b =1;
		int c =0;
		for(int i=3; i<n+1; i++){
	     c=a;
		 a=b;
		 b=b+c;
		}
		return b;
    }

    public int getNumberOfDigits(int number){
		int c=0;
		float a= number;
		
		while (a >= 1) {
			a = a/10;

			c=c+1;
        }
		return c;
	}

    public int rotateNumber(int number){
		int x;
		int y = 0;
		
		while (number>=1) {
			x=number%10;
			y=x+(y*10);
			number=number/10;
			
			
		}
		
		return y;
    }

    public int sumOffirstNNumbersMultiplesOfFiveOrThree(int N){
		int a = 0;
		for(int i=1; i<N+1; i++){
			if(i%3==0 || i%5==0 ){
				a=a+i;
			}
				
		}
		return a;
    }

}