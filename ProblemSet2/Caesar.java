import java.util.Scanner;
public class Caesar{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String text;
		int s;
		s=scan.nextInt();
		scan.nextLine();
		text=scan.nextLine();
		StringBuffer result= new StringBuffer();
 
        for (int i=0; i<text.length(); i++)
        {
            if (Character.isUpperCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) +
                                  s - 65) % 26 + 65);
                result.append(ch);
            }
            else
            {
                char ch = (char)(((int)text.charAt(i) +
                                  s - 97) % 26 + 97);
                result.append(ch);
            }
        }
        System.out.println(result);
    }
}
