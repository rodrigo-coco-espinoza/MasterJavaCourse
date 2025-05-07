public class Option 
{
    private String text;
    private boolean isAnswer;

    public Option(String text, boolean isAnswer)
    {
        this.text = text;
        this.isAnswer = isAnswer;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public boolean isAnswer() {
        return isAnswer;
    }
    
}
