package meeting;

import java.util.Date;

public class Programme {

    private ProgramSlot[] programSlots;

    public Programme(ProgramSlot[] slots)
    {
        this.programSlots = slots;
    }

   public Integer getNumberOfSlots(){
       return this.programSlots.length;
   }
}