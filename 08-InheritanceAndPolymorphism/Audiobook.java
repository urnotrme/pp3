public class Audiobook extends Book{
    private int minutes,seconds;

    public Audiobook(String title, String author, int publication, int minutes, int seconds, Writer writer) {
        super(title, publication, writer);
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public String display() {
        return "Title: " + this.getTitle() + "\nAuthor: " + this.getAuthor()
                            + "\nMinutes: " + minutes + "\nSeconds: " + seconds;
    }    
}
