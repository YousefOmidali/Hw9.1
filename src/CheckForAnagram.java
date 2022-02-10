import java.util.HashMap;

public class CheckForAnagram {
    public boolean areAnagram(String key, String value) {

        HashMap<Character, Integer> hashMap1 = new HashMap<>();
        HashMap<Character, Integer> hashMap2 = new HashMap<>();

        char keyArr[] = key.toCharArray();
        char valueArr[] = value.toCharArray();

        // Mapping first string
        for (int i = 0; i < keyArr.length; i++) {

            if (hashMap1.get(keyArr[i]) == null) {

                hashMap1.put(keyArr[i], 1);
            } else {
                Integer c = (int) hashMap1.get(keyArr[i]);
                hashMap1.put(keyArr[i], ++c);
            }
        }

        // Mapping second String
        for (int j = 0; j < valueArr.length; j++) {

            if (hashMap2.get(valueArr[j]) == null)
                hashMap2.put(valueArr[j], 1);
            else {

                Integer d = (int) hashMap2.get(valueArr[j]);
                hashMap2.put(valueArr[j], ++d);
            }
        }

        if (hashMap1.equals(hashMap2))
            return true;
        else
            return false;
    }
}
