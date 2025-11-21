// public class Count_vowel_string {
//     public static void main(String[] args) {
//         String s = "prepinstadimpal";
//         char c[] = s.toCharArray();
//         int vowel = 0;
//         for(int i = 0;i<s.length();i++)
//         {
//             if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='u'||s.charAt(i)=='o')
//             {
//                 vowel++;
//             }
//         }
//          System.out.println("vowels : " + vowel);

//     }
// }

// without method use 
public class Count_vowel_no_method {
    public static void main(String[] args) {
        char[] ch = {'p','r','e','p','i','n','s','t','a','d','i','m','p','a','l'};
        int vowel = 0;
        int n = ch.length;

        for(int i = 0; i < n; i++) {
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u');
                vowel++;
        }
        System.out.println("Vowels: " + vowel);
    }
}
