public class DuplicateCharacter {
    public static void main(String[] args){
        String input = "Programming";
        input = input.toLowerCase();
        int [] freq = new int[26];
        //count frequency of each character

        for (int i=0; i<input.length(); i++){
            char ch = input.charAt(i);

            if(ch>='a' && ch<='z'){
                freq[ch -'a']++;
            }
        }

        for(int i=0; i<26;i++){
            if (freq[i]>1)
            {
            char ch = (char) (i +'a');
            System.out.println(ch + "-" +freq[i] );
            }
        }
    }
}
