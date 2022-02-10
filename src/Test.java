public class Test {
    public void test(String key, String value) {
        CheckForAnagram checkForAnagram = new CheckForAnagram();

        System.out.println("Strings to be checked are:\n"
                + key + "\n" + value + "\n");

        // Find the result
        if (checkForAnagram.areAnagram(key, value))
            System.out.println("The two strings are "
                    + "anagrams of each other\n");
        else
            System.out.println("The two strings are not"
                    + " anagrams of each other\n");
    }
}
