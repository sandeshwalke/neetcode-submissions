class Solution {
    public boolean isAnagram(String s, String t) 
    {
       
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        int a = t.length()-1;
        
        // Arrays.sort(ch1);
        // Arrays.sort(ch2);

        // if(Arrays.equals(ch1,ch2)){
        //     return true;
        // }

        for(int i = 0; i<s.length() && i<t.length(); i++)
        {
            if(ch1[i]==ch2[a] && a>=0)
            {
                      a--;
                return true;

            }
      

        }
        return false;
    }
}
