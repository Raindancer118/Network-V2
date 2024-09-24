import java.util.ArrayList;

/**
 * The NewsFeed class stores news posts for the news feed in a social network 
 * application.
 * 
 * Display of the posts is currently simulated by printing the details to the
 * terminal. (Later, this should display in a browser.)
 * 
 * This version does not save the data to disk, and it does not provide any
 * search or ordering functions.
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 0.1
 */
public class NewsFeed{
    private ArrayList<IPost> posts;

    /**
     * Construct an empty news feed.
     */
    public NewsFeed()    {
        posts = new ArrayList<>();
    }

    /**
     * Add a post to the news feed.
     * 
     * @param post  The post to be added.
     */
    public void addMessagePost(IPost post)   {
        posts.add(post);
    }

    /**
     * Show the news feed. Currently: print the news feed details to the
     * terminal. (To do: replace this later with display in web browser.)
     */
    public void show()  {
        // display all text posts
        for(IPost post : posts) {
            post.display();
            System.out.println();   // empty line between posts
        }
    }
}
