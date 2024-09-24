public class Main {
    public static void main(String[] args) {
        NewsFeed feed = new NewsFeed();
        PhotoPost post = new PhotoPost("Tom Stieh","Urlaub.png","Sonnenuntergang am Meer");
        feed.addMessagePost(post);
        post.addComment("Was für ein hässliches Bild!!");
        feed.show();

    }
}
