package teccr.justdoitcloud.data;

import lombok.Data;

import java.util.List;

@Data
public class User {
    private final String userName;
    private final String name;
    private final String email;
    private final String type;
    private List<Task> tasks;

    public enum Type {
        ADMIN,
        REGULAR
    }
}
