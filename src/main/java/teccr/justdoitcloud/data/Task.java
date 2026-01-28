package teccr.justdoitcloud.data;
import lombok.Data;
import java.time.LocalDateTime;
import java.time.LocalDate;

@Data
public class Task {
    private final String description;
    private final LocalDateTime created;
    private final LocalDate deadline;
    private final Status status;

    public enum Status {
        PENDING,
        INPROGRESS,
        DONE
    }
}
