public class PodcastEpisode extends ContentItem implements Downloadable {

    private String hostName;

    public PodcastEpisode(String title, int year, int durationMinutes, String hostName) {
        super(title, year, durationMinutes);
        setHostName(hostName);
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        if (hostName == null || hostName.isBlank()) {
            throw new IllegalArgumentException("Host name cannot be null or blank");
        }
        this.hostName = hostName;
    }

    @Override
    public double getLicenseCost(int currentYear) {
        int age = getAge(currentYear);
        int ageFactor = (age <= 2) ? 3 : 1;
        return 0.03 * durationMinutes + ageFactor;
    }

    @Override
    public void download() {
        System.out.println("Downloading podcast hosted by " + hostName + "...");
    }

    @Override
    public int getMaxDownloadsPerDay() {
        return 10;
    }

    @Override
    public String toString() {
        return super.toString() + ", Host: " + hostName;
    }
}
