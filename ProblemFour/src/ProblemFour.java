
public class ProblemFour {

	public static void main(String[] args){
		//String in="hello?";
		//System.out.println(ProblemFourA(in));
		
		int[][] inArr= {{1, 2} , {3, 4}};
		System.out.println(ProblemFourC(7));
		/*String[] out=ProblemFourB(inArr , 5);
	
		for(int i=0; i<out.length; i++) {
			System.out.println(out[i]);
		}
		*/
	
	}
	
	
	public static String[] ProblemFourB(int[][] inArr, int sum){
	//	int dimensions=inArr.length * inArr[0].length;
		String sums[]= {};
		int s=0;
		for(int i=0; i<inArr.length; i++){				//go through each row
			for(int j=0; j<inArr[i].length; j++){		//go through elements of each row
				for(int x=0; x<inArr.length; x++) {
					for(int y=0; y<inArr[x].length; y++) {
						if(i==x && j==y) {
							continue;
						}
						else if(inArr[i][j]+inArr[x][y]==sum) {
							sums[s]="(" + Integer.toString(inArr[i][j]) + "," + Integer.toString(inArr[x][y]) + ")";
							s++;
						}
					}
				}
			}
		}
	return sums;	
	}
	
	private static String ProblemFourA(String in){
		String out="";
		for(int i=in.length()-1; i>=0; i--){
			out+=in.charAt(i);
		}
		return out;
	}
	private static boolean contains(int[]arr, int num) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==num)
				return true;
		}
		return false;
	}
	public static int ProblemFourC(int n) {
		//n=n+1;
		if(n==0)
			return 1;
		if(n>3) {
			System.out.println("Sorry my program can't handle this because it's not very efficient.");
			return 0;
		}
		int list[]=new int[100];
		int count=0;
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
				for(int k=0; k<=n; k++) {
					int min=(int)Math.pow(9, i)*(int)Math.pow(15, j)* (int)Math.pow(7,k);
					if(!contains(list, min)) {
						list[count]=min;
						count++;
					}
				}
			}
		}
		/*
		for(int i=0; i<list.length; i++) {
			System.out.println(list[i]);
		}
		*/
		int arr[]=new int[count];
		for(int i=0;i<count; i++) {
			arr[i]=list[i];
		}
		
		
		for(int i=1; i<arr.length; i++) {
			int a=arr[i];
			int x=i-1;
			
			while(x>-1 && arr[x]>a) {
				arr[x+1]=arr[x];
				x--;
			}
			arr[x+1]=a;
		}

		
		return arr[n];
	}	
	
	
}

