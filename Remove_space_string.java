public class Remove_space_string {
    public static void main(String[] args) {
        String str = "d i m p a l chuadhary";
        String result = "";
        for(int i = 0;i<str.length();i++)
        {
            if(str.charAt(i) != ' ')
            {
                result = result + str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
