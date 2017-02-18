import java.util.Scanner;
class Tic{
	public static void main(String[] args){
 		char tic[][]=new char[3][3];
		int i,j,count=0;
		boolean result=false;
		for(i=0;i<3;i++){
		for(j=0;j<3;j++){
		tic[i][j]='?';
		System.out.print("   "+tic[i][j]);	
		if(j!=2)
		System.out.print("  |");
		}
		System.out.println();
		if(i!=2)
		System.out.print("----------------------");
		System.out.println();
		}
	
	do{
		
		if(count%2==0){  //player condition starts
		System.out.println("Please enter position coordinates:");
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc1.nextInt();
				System.out.println("After your move:status");
		if(tic[a][b]=='?'){  //empty condition starts 
			tic[a][b]='X';
			
		for(i=0;i<3;i++){
		for(j=0;j<3;j++){
		System.out.print("   "+tic[i][j]);	
		if(j!=2)
		System.out.print("  |");
		}
		System.out.println();
		if(i!=2)
		System.out.print("----------------------");
		System.out.println();}  //for loop closed
		//CHECKING RESULT
			
			
			for(i=0;i<3;i++){
			if(tic[i][0]=='X' && tic[i][1]=='X' && tic[i][2]=='X')
			{System.out.println("Congrats you won!");
			result=true;
			 }
			if(tic[i][0]=='O' && tic[i][1]=='O'&&tic[i][2]=='O')
			{System.out.println("Sorry you lost!");
			result=true;
			 }
                    	}
				for(i=0;i<3;i++){
			if(tic[0][i]=='X' && tic[1][i]=='X' && tic[2][i]=='X')
			{System.out.println("Congrats you won!");
			result=true;
			 }
			if(tic[0][i]=='O' && tic[1][i]=='O' && tic[2][i]=='O')
			{System.out.println("Sorry you lost!");
			result=true;
			 }
                    	}
					
			if(tic[0][0]=='X' && tic[1][1]=='X' && tic[2][2]=='X'){
			System.out.println("Congrats you won!");
			result=true;
			 }
			if(tic[0][0]=='O' && tic[1][1]=='O' && tic[2][2]=='O'){
			System.out.println("Sorry you lost!");
			result=true;
			 
                    	}
			
			if(tic[2][0]=='X' && tic[1][1]=='X' && tic[0][2]=='X'){
			System.out.println("Congrats you won!");
			result=true;
			 }
			if(tic[2][0]=='O' && tic[1][1]=='O' && tic[0][2]=='O'){
			System.out.println("Sorry you lost!");
			result=true;
			 
                    	}
			
			
			if(count==9)
			{System.out.println("Its a tie");
				result=true;
				 }
		
			count++;} // if of empty ends
			
		else
			System.out.println("Position taken try again!");  // else of empty ends
			
				} //player chance ends
			else{
				System.out.println("After machine's move:status");
			int m=(int)((Math.random()*10)%3);  //machine chances start
			int n=(int)((Math.random()*100)%3);
			if(tic[m][n]=='?'){ //checks for empty space
			tic[m][n]='O';
			
			for(i=0;i<3;i++){
		for(j=0;j<3;j++){
		System.out.print("   "+tic[i][j]);	
		if(j!=2)
		System.out.print("  |");
		}
		System.out.println();
		if(i!=2)
		System.out.print("----------------------");
		System.out.println();
		}  //loop ends
			//CHECKING RESULT
			
			
			for(i=0;i<3;i++){
			if(tic[i][0]=='X' && tic[i][1]=='X' && tic[i][2]=='X')
			{System.out.println("Congrats you won!");
			result=true;
			 }
			if(tic[i][0]=='O' && tic[i][1]=='O'&&tic[i][2]=='O')
			{System.out.println("Sorry you lost!");
			result=true;
			 }
                    	}
				for(i=0;i<3;i++){
			if(tic[0][i]=='X' && tic[i][1]=='X' && tic[2][i]=='X')
			{System.out.println("Congrats you won!");
			result=true;
			 }
			if(tic[0][i]=='O' && tic[1][i]=='O' && tic[2][i]=='O')
			{System.out.println("Sorry you lost!");
			result=true;
			 }
                    	}
					
			if(tic[0][0]=='X' && tic[1][1]=='X' && tic[2][2]=='X'){
			System.out.println("Congrats you won!");
			result=true;
			 }
			if(tic[0][0]=='O' && tic[1][1]=='O' && tic[2][2]=='O'){
			System.out.println("Sorry you lost!");
			result=true;
			 
                    	}
			
			if(tic[2][0]=='X' && tic[1][1]=='X' && tic[0][2]=='X'){
			System.out.println("Congrats you won!");
			result=true;
			 }
			if(tic[2][0]=='O' && tic[1][1]=='O' && tic[0][2]=='O'){
			System.out.println("Sorry you lost!");
			result=true;
			 
                    	}
			
			if(count==9)
			{System.out.println("Its a tie");
				result=true;
				 }
				count++;}// if of empty ends
		
		else
			System.out.println("Position taken try again!");//else of empty ends
			
		
		}  // machine chance ends
		} //do ends
	while(result==false);
				
		}}