package blog;

import java.util.Date;
import java.util.Objects;

public abstract class Entry {
    private int id;
    private Date postedDate;
    private User Author;
    private String content;

    public Entry(int id, Date postedDate, User author, String content) {
        this.id = id;
        this.postedDate = postedDate;
        Author = author;
        this.content = content;
    }
    public Entry(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(Date postedDate) {
        this.postedDate = postedDate;
    }

    public User getAuthor() {
        return Author;
    }

    public void setAuthor(User author) {
        Author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entry entry = (Entry) o;
        return id == entry.id &&
                Objects.equals(postedDate, entry.postedDate) &&
                Objects.equals(Author, entry.Author) &&
                Objects.equals(content, entry.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, postedDate, Author, content);
    }
}
