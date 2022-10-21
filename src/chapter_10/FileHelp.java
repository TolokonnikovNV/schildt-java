package chapter_10;

public class FileHelp {
    public static void main(String[] args) {
        Help help = new Help("helpfile.txt");
        String topic;

        System.out.println("Use the help system");
        System.out.println("Enter stop to log out");

        do {
            topic = help.getSelection();

            if (!help.helpon(topic)) {
                System.out.println("Topic not found");
            }
        } while (topic.compareTo("stop") != 0);
    }
}
