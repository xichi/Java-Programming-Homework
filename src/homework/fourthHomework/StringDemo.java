package homework.fourthHomework;

public class StringDemo {
    public static void main(String[] args){
        String palindrome = "hello1234";
        palindrome = palindrome.toUpperCase();
        int len = palindrome.length();
        char[]temp = new char[len];
        for(int i = 0; i < len; i++){
            int ch = palindrome.charAt(i);
            if(ch < 48 || ch > 57){
                temp[i] = (char)(ch);
            }
            else temp[i] = (char)(ch + 1);
        }
        palindrome = String.valueOf(temp);
        System.out.println(palindrome);
    }
}
