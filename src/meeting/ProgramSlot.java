package meeting;

import java.util.Date;

public class ProgramSlot {
    private Date start;
    private Date end;
    private String title;
    private String room;

    public ProgramSlot(Date start, Date end, String title, String room)
    {
        this.start = start;
        this.end = end;
        this.title = title;
        this.room = room;
    }

    
}