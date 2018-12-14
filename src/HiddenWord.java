public class HiddenWord {
    private String hidden;

    public HiddenWord(String hidden)
    {
        this.hidden = hidden;
    }

    public String getHint(String guess)
    {
        String result = "";
        String check = "";

        for(int i = 0;i<guess.length();i++)
        {
            check = guess.substring(i,i+1);

            if(!hidden.contains(check))
            {
                result += "*";
            }
            else
            {
                if(check.equals(hidden.substring(i,i+1)))
                {
                    result += check;
                }
                else
                {
                    result += "+";
                }
            }
        }
        return result;
    }

}
