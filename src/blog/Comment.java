package blog;

import java.time.LocalDateTime;
import java.util.Date;

public class Comment extends Entry{

    public Comment(int id, LocalDateTime postedDate, User author, String content) {
        super(id, postedDate, author, content);


    }


}
