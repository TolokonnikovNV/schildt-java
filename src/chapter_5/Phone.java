package chapter_5;

public class Phone {
    public static void main(String[] args) {
        String numbers[][] = {
                {"Tom", "555-3322"},
                {"Marry", "555-8976"},
                {"John", "555-1037"},
                {"Rachel", "555-1400"}
        };

        int i;

        if (args.length != 1) {
            System.out.println("Using: java Phone <name>");
        } else {
            for (i = 0; i < numbers.length; i++) {
                if (numbers[i][0].equals(args[0])){
                    System.out.println(numbers[i][0] + ": " + numbers[i][1]);
                    break;
                }
            }
            if (numbers.length == i){
                System.out.println("Name not found");
            }
        }
    }
}
