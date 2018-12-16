public class HiddenWord {
    private String hidden;

    /**
     * Constructor for HiddenWord Object
     * @param hidden String to set field hidden to
     */
    public HiddenWord(String hidden)
    {
        this.hidden = hidden;
    }

    /**
     * Gives the user a hint as to what the word is based on their input
     * @param guess guess that the player has made
     * @return hint with:
     * '*' if not in the word
     * '+' if in the word but at another position
     * the letter if it is in the word and at the correct position
     */
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
