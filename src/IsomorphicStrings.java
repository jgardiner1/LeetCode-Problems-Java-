import com.sun.jdi.Value;

import java.awt.image.PixelInterleavedSampleModel;
import java.util.Arrays;
import java.util.HashMap;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        int[] sMap = new int[200];
        int[] tMap = new int[200];

        for (int i = 0; i < s.length(); i++){
            if (sMap[s.charAt(i)] != tMap[t.charAt(i)]){
                return false;
            }

            sMap[s.charAt(i)] = i + 1;
            tMap[t.charAt(i)] = i + 1;
        }
        return true;
    }

    public static void main(String[] args) {
        IsomorphicStrings is = new IsomorphicStrings();

        System.out.println(is.isIsomorphic("aba", "bac"));
    }
}
