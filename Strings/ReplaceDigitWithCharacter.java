public class ReplaceDigitWithCharacter{

    public char shift(char c , int x)
    {   
        int ascii = (int)c;
        ascii += x;
        char ch = (char) ascii;
        return ch;
    }
    public String replaceDigits(String s) {
        StringBuilder result = new StringBuilder();
        
        for(int i = 0 ; i<s.length() ;i++)
        { 
             char c = s.charAt(i);

            if(i%2 != 0)
            {   
                int x = c - '0';
                char ascii = shift(s.charAt(i-1), x);
                c =ascii;

                result.append(c);


            }
            else
            {
                  result.append(c);
            }
        }
        return result.toString();
    }
}