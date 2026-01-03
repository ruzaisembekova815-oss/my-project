import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class ContentDemo {

    public static void main(String[] args) {

        int currentYear = Year.now().getValue();

        List<ContentItem> items = new ArrayList<>();

        items.add(new VideoLecture("Java Basics", 2024, 90, "HD"));
        items.add(new VideoLecture("Advanced OOP", 2023, 120, "4K"));

        items.add(new PodcastEpisode("Tech Talk", 2022, 45, "Alice"));
        items.add(new PodcastEpisode("AI Weekly", 2024, 30, "Bob"));

        for (ContentItem item : items) {
            System.out.println(item + " | licenseCost=" +
                    item.getLicenseCost(currentYear));

            if (item instanceof Downloadable) {
                Downloadable d = (Downloadable) item;
                d.download();
                System.out.println("Max downloads per day: " +
                        d.getMaxDownloadsPerDay());
            }

            System.out.println();
        }
    }
}
