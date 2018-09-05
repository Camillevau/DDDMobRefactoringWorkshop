package meeting;
import exception.*;
import java.util.Date;
import java.util.UUID;

public class Meeting {

    private UUID uuid;
    private Date start;
    private Date end;
    private String title;
    private String description;
    private Programme programme;

    public Meeting(UUID uuid,  String title, String description, Date start, Date end, Programme programme) throws IllegalArgumentException
    {
        if(title== null|| title.length() < 5)
{
throw new IllegalArgumentException("Meeting title must have a title with at least 5 chars");
}

        if(programme == null|| programme.getNumberOfSlots() < 0)
            {   
throw new ProgramSlotExpectedException("Program it's required for the meeting");
}

 	if(end.before(start)){
		throw new ConfusingDateException ("start date must be before end date");
     }

        this.uuid = uuid;
        this.start = start;
        this.end = end;
        this.title = title;
        this.description = description;
        this.programme = programme;
    }
   
}
