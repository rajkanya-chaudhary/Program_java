public class Largest_element {
    public static void main(String[] args) {
       String str ="dimpal is simplee girl";
       str = str + " ";
       String largest = "";
       String word ="";
       for(int i = 0;i<str.length();i++)
       {
        char ch = str.charAt(i);
        if(ch != ' ')
        {
           word = word + ch;
        }
        else
        {
            if(word.length()>largest.length())
            {
                largest = word;
            }
            word = "";
        }
       }
       System.out.println("Largest String = " + largest);
          
    }
}
