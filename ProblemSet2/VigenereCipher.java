import java.util.Scanner;
public class VigenereCipher{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s;
		StringBuffer result=new StringBuffer();
		String keyChar;
        int key=0;
		keyChar=scan.nextLine();
		s=scan.nextLine();
		for(int i=0,j=0;i<s.length();i++){
			char a;
            if(Character.isUpperCase(keyChar.charAt(j))){
                key=(int)keyChar.charAt(j)-65;
            }
            else if(Character.isLowerCase(keyChar.charAt(j))){
                key=(int)keyChar.charAt(j)-97;
            }
			if(Character.isUpperCase(s.charAt(i))){

                a=(char)(((int)s.charAt(i)-65+key) % 26 + 65);
                result.append(a);
                j=(j+1)%keyChar.length();
            }
            else if (Character.isLowerCase(s.charAt(i))){
                a=(char)(((int)s.charAt(i)-97+key) % 26 + 97);
                result.append(a);
                j=(j+1)%keyChar.length();
            }
            else
            {
            	a=s.charAt(i);
                result.append(a);
            }
            }
        System.out.println(result);
        scan.close();
		}


}