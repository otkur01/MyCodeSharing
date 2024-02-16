public class EmailTesting {
    public static boolean emailVakidate(String str) {
        if (!str.contains("@") || !str.contains(".")) return false;//if there is no any @ or "."
        else if (str.indexOf("@") != str.lastIndexOf("@")) return false;//check is there more than one @
        String firstHalf = str.substring(0, str.indexOf("@"));//devide string into two part
        String secondHlf = str.substring(str.indexOf("@") + 1);//
        if (firstHalf.isEmpty() || secondHlf.isEmpty()) return false;//check is any part of string null or not
        if (!secondHlf.contains(".")) return false;//check second part contains "." or not
        if (secondHlf.contains("com") && secondHlf.indexOf(".com") + 1 != secondHlf.indexOf("com"))
            return false;// check if there is "com" and "."just come before "com"
        if (secondHlf.charAt(0) == '.' || firstHalf.charAt(0) == '.')
            return false;//check first char of first or second part is "." or not
        if (secondHlf.charAt(secondHlf.length() - 1) == '.' || firstHalf.charAt(firstHalf.length() - 1) == '.')
            return false;//check the index of first and second part is "." or not

        return true;
    }

    public static void main(String[] args) {
        String s1 = "mike.Smith@n.cydeo.com";
        String s2 = "mike.Smith@com";
        String s3 = "mike.Smith@.cydeo.com";
        String s4 = "mike.Smith@@cydeo.com";
        String s5 = "mike.Smith@cydeo.uK.co";
        System.out.println(emailVakidate(s1));
        System.out.println(emailVakidate(s2));
        System.out.println(emailVakidate(s3));
        System.out.println(emailVakidate(s4));
        System.out.println(emailVakidate(s5));

    }

}
