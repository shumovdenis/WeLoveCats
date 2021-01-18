package ru.netology;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.Objects;

public class Post {
    private Status status;
    private String type;
    private boolean deleted;
    private String id;
    private String user;
    private String text;
    private int v;
    private String source;
    private Date updatedAt;
    private Date createdAt;
    private boolean used;

    public Post(
            @JsonProperty("status") Status status,
            @JsonProperty("type") String type,
            @JsonProperty("deleted") boolean deleted,
            @JsonProperty("_id") String id,
            @JsonProperty("user") String user,
            @JsonProperty("text") String text,
            @JsonProperty("__v") int v,
            @JsonProperty("source") String source,
            @JsonProperty("used") boolean used,
            @JsonProperty("updatedAt") Date updatedAt,
            @JsonProperty("createdAt") Date createdAt
    ) {
        this.status = status;
        this.type = type;
        this.deleted = deleted;
        this.id = id;
        this.user = user;
        this.text = text;
        this.v = v;
        this.source = source;
        this.used = used;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(updatedAt, post.updatedAt);
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    @Override
    public int hashCode() {
        return Objects.hash(updatedAt);
    }

    @Override
    public String toString() {
        return  type + '\'' +
                ", id='" + id + '\'' +
                ", user='" + user + '\'' +
//                ", text='" + text + '\'' +
                ", updateAt=" + updatedAt +
                ", createAt=" + createdAt +
                '}';
    }


}
