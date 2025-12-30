import java.util.ArrayList;
import java.util.List;

public class main2ver {
    public static void main(String[] args) {

        int currentYear = 2025;

        List<ContentItem> contentList = new ArrayList<>();

        contentList.add(new VideoLecture("Java OOP Basics", 2024, 90, "HD"));
        contentList.add(new PodcastEpisode("Tech Talk", 2022, 45, "Alice Smith"));

        for (ContentItem item : contentList) {
            System.out.println(item);
            System.out.println("License cost: $" + item.getLicenseCost(currentYear));
            System.out.println();
        }
    }
}
