package Level_2;

public class Square_Concat {

	public static void main(String[] args) {
		char arr[] = {'8','7','9'};
		StringBuilder sb = new StringBuilder();
		for(char ch :arr) 
		{
			int num= Character.getNumericValue(ch);
			sb.append(num*num);
		}
		System.out.println(sb);
	}
	
}
