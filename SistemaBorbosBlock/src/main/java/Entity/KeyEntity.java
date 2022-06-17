package Entity;

import javax.persistence.*;

@Entity
@Table(name = "key")
public class KeyEntity extends RegisterEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "register_id")
    private int id;

    @Column(name = "path")
    private String path;

    @Column(name = "key")
    private String key;

    public KeyEntity(String path, String key) {
        this.path = path;
        this.key = key;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
