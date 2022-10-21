package chapter_5;


public class StrOps {
    public static void main(String[] args) {
        String str1 = "Java is a leader of the internet";
        String str2 = new String(str1);
        String str3 = "Java string are efficient";
        int result, idx;
        char ch;

        System.out.println("str1 length: " + str1.length());

        for (int i = 0; i < str1.length(); i++) {
            System.out.print(str1.charAt(i));
        }
        System.out.println();

        if(str1.equals(str2)){
            System.out.println("str1 equivalent str2");
        } else {
            System.out.println("str1 not equivalent str2");
        }

        if(str1.equals(str3)){
            System.out.println("str1 equivalent str3");
        } else {
            System.out.println("str1 not equivalent str3");
        }

        result = str1.compareTo(str3);
        if (result==0){
            System.out.println("str1 equals str3");
        } else if (result<0){
            System.out.println("str1 less then str3");
        } else {
            System.out.println("str1 is greater then str3");
        }

        str2 = "One Two Three One";

        idx = str2.indexOf("One");
        System.out.println("The index of the first occurrence in the string \"One\": " + idx);
        idx = str2.lastIndexOf("One");
        System.out.println("The index of the last occurrence in the string \"One\": " + idx);

    }
}
