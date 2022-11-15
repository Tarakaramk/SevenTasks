public class UniqueNumber {
    public int uniqueFrequency(String s) {
        int len = s.length();
        int i, j;
        char newarr[] = s.toCharArray();
        for (i = 0; i < len; i++) {
            boolean found = true;
            for (j = i + 1; j < len; j++) {
                if (newarr[i] == newarr[j]) {
                    found = false;
                    break;
                }
            }
            if (found == true) {
                return newarr[i];
            }
        }
        return -1;
    }
}
