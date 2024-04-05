import java.util.List;

public class SILab1_2 {

    private static String makeBigStringFrom (List<String> list, int minLength) {
        StringBuilder sb = new StringBuilder();
        for (String el : list) {
 HEAD
            if (el.length() < minLength) {
=======
            if (el.length() > minLength) {
>>>>>>> 65ca155 (Fixed line endings in SILab1_2.java)
                sb.append(el);
            }
        }
        return sb.toString();
    }
HEAD
}
=======
}
>>>>>>> 65ca155 (Fixed line endings in SILab1_2.java)
