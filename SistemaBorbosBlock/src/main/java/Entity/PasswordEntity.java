package Entity;

import javax.persistence.*;

public class PasswordEntity{
    private int id;
    private String url;
    private String user;
    private String password;

    public PasswordEntity(int id, String url, String user, String password) {
        this.id = id;
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
