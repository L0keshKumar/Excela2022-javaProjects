package permutation;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application permutation=new Application();
		permutation.permutateWord("","Cat");
	}
	public void permutateWord(String str1,String str2) {
		System.out.println("STR1:::"+str1+"	STR2:::"+str2);
		int n=str2.length();
		if(n==0)
			System.out.println(str1);
		else {
			for(int i=0;i<n;i++)
			{
				permutateWord(str1+str2.charAt(i), 
						str2.substring(0, i)
						+str2.substring(i+1, n));
			}
		}
	}

}
