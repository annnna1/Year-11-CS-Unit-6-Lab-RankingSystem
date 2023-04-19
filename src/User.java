public class User
{
    //properties
    private int rank;
    private int progress;

    //constructors
    public User ()
    {
        rank = -8;
        progress = 0;
    }
    //behaviours

    public int getRank()
    {
        return rank;
    }

    public int getProgress()
    {
        return progress;
    }

    public void incProgress(int actRank)
    {
        if(actRank<=8 && actRank>=-8 && (!(actRank == 0)))
        {
            int d = actRank - rank;

            if (actRank > 0 && rank < 0){

                d--;

            } else if (actRank<0&&rank>0) {

                d++;

            }
            if (d == 0)
            {
                progress += 3;
            }
            if (d == -1)
            {
                progress ++;
            }
            if (d < -1)
            {
                progress += 0;
            }
            if (d > 0)
            {
                progress += d * d * 10;
            }
            while (progress >=100)
            {
                if (rank < 8)
                {
                    rank ++;
                    progress -= 100;
                    if (rank == 0)
                    {
                        rank ++;
                    }
                }
                else
                {
                    progress = 0;
                }
            }
        }
        else
        {
        throw new IllegalArgumentException("The rank of an activity cannot be less than 8, 0, or greater than 8!");
        }
    }

    public String toString()
    {

        return ("User{rank=" + rank + ", progress=" + progress + "}");

    }

}
