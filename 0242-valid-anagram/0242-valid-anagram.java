class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.putIfAbsent(s.charAt(i), 1);
            } else {
                int temp = map.get(s.charAt(i));
                temp++;
                map.put(s.charAt(i), temp);
            }
        }
        for (int i=0; i<t.length(); i++) {
            if (!map.containsKey(t.charAt(i))) return false;
            else {
                int temp = map.get(t.charAt(i));
                temp--;
                map.put(t.charAt(i), temp);
            }
            if (map.get(t.charAt(i)) == 0) map.remove(t.charAt(i));
        }
        return true;
    }
}