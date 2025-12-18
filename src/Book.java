public class Book {
    private int id;
    private static int idGen;
    private String title;
    private String author;
    private int year;
    private boolean avialable;

    public Book() {
        this.id = idGen++;
        this.avialable = true;
    }

    public Book(String title, String author, int year) {
        this();
        setTitle(title);
        setAuthor(author);
        setYear(year);
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvialable() {
        return avialable;
    }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title must not be null or empty");
        }
        this.title = title;
    }

    public void setAuthor(String author) {
        if (author == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Author must not be null or empty");
        }
        this.author = author;
    }

    public void setYear(int year) {
        int currentYear = java.time.Year.now().getValue();
        if (year < 1500 || year > currentYear) {
            throw new IllegalArgumentException(
                    "Year must be between 1500 and" + currentYear
            );
        }
            this.year = year;
        }

    public void setAvialable(boolean avialable) {
        this.avialable = avialable;
    }

    public void markAsBorrowed(){
        this.avialable=false;
    }
    public void markAsReturned(){
        this.avialable=true;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", avialable=" + avialable +
                '}';
    }
}



