import java.util.Arrays;
import java.util.HashMap;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()){
            return false;
        }

        int[] alphaStorage = new int[26];

        for (char c : magazine.toCharArray()){
            alphaStorage[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()){
            if (alphaStorage[c - 'a'] == 0){
                return false;
            }

            alphaStorage[c - 'a']--;
        }
        return true;
    }

    public static void main(String[] args) {
        RansomNote rn = new RansomNote();

        System.out.println(rn.canConstruct("abb", "bab"));
    }
}
