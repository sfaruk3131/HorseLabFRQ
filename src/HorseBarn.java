public class HorseBarn {
    private Horse[] spaces;

    public HorseBarn(Horse[] spaces)
    {
        this.spaces = spaces;
    }
    public int findHorseSpace(String name)
    {
        for(int i = 0; i < spaces.length; i++)
        {
            if(spaces[i] != null)
            {
                if (spaces[i].getName().equals(name))
                    return i;
            }
        }
        return -1;
    }

    public void consolidate()
    {
        Horse[] newSpaces = new Horse[this.spaces.length];
        int spot = 0;
        for(Horse next: this.spaces)
        {
            if(next != null)
            {
                newSpaces[spot] = next;
                spot++;
            }
        }
        this.spaces = newSpaces;
    }
}
