package org.example.livine;

public class SpecBeeQuestion {

    public static void main(String[] args) {
        System.out.println(scanString("+++++ abcdedhhhhhh"));
    }

    public static String scanString(String str) {
        String[] words=str.split(" ");
        String pattern=words[0];
        String word=words[1];
        int i=0;
        int j=0;
        while(i<pattern.length())
        {
            char p=pattern.charAt(i);
            if(p=='+')
            {
                if(!Character.isLowerCase(word.charAt(j)))
                {
                    return "false";
                }
                i++;
                j++;
            }
            else if(p=='$')
            {
                if(!Character.isDigit(word.charAt(j)))
                {
                    return "false";
                }
                i++;
                j++;
            }
            else if(p=='*')
            {
                int val=3;
                char h=word.charAt(j);
                if(pattern.charAt(i+1)=='{')
                {
                    val=Character.getNumericValue(pattern.charAt(i+2));
                }

                for(int k=j;k<j+val;k++)
                {
                    if(word.charAt(k)!=h)
                    {
                        return "false";
                    }
                }
                i=i+4;
                j=j+val;
            }
        }
        return "true";
    }

}
