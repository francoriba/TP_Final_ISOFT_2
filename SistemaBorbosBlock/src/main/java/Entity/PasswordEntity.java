package Entity;

import javax.persistence.*;

@Entity
@Table(name = "password")
public class PasswordEntity extends RegisterEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "register_idp")
    private int id;

    @Column(name = "url")
    private String url;

    @Column(name = "userName")
    private String user;

    @Column(name = "password")
    private String password;

    public PasswordEntity(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
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
