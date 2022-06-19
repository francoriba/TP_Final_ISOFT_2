package Entity;

import javax.persistence.*;

public class KeyEntity{

    private int id;
    private String name;
    private String path;
    private String key;

    public KeyEntity(int id, String path, String key, String name) {
        this.name = name;
        this.id = id;
        this.path = path;
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
