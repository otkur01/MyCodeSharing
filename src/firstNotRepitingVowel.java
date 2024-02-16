import java.util.Map;



import java.util.LinkedHashMap;


    public class firstNotRepitingVowel {
        public static int firstNonRepeatingVowel(String str) {
            str = str.toLowerCase();
            Map<Character, Integer> charMap = new LinkedHashMap<>();
            for (char ch : str.toCharArray()) {
                charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
            }

            String temp = "";
            for (Character eachcha : charMap.keySet()) {
                if ((eachcha == 'a' || eachcha == 'e' || eachcha == 'i' || eachcha == 'u' || eachcha == 'o') && charMap.get(eachcha) == 1) {

                    temp = "" + eachcha;
                    break;
                }

            }
            if (str.contains(temp) && !temp.isEmpty()) return str.indexOf(temp);
            else return -1;
        }



        public static void main(String[] args) {


            String str = "moodeellli";
            System.out.println(firstNonRepeatingVowel(str));
        }
    }


