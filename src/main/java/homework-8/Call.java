

import java.time.LocalDateTime;

public class Call {
    private String callReceiver;
    private LocalDateTime time;

    public Call(LocalDateTime time, String callReceiver) {
        this.time=time;
        this.callReceiver=callReceiver;
    }

    @Override
    public String toString() {
        return "Call{" +
                "callReceiver='" + callReceiver + '\'' +
                ", time=" + time +
                '}';
    }
}
