public class Executor
{
	String text;
	String chars;

	public void Execute(String text, String chars)
	{
		this.text = text;
		this.chars = chars;
	}

	public String delCharsFromStr()
	{
		int tempS = 0, tempE = 0;
		StringBuffer string = new StringBuffer(text);
		for (int i = 0; i < text.toCharArray().length; i++) 
		{
			if(text.toCharArray()[i] == chars.toCharArray()[0]) tempS = i;
			if(text.toCharArray()[i] == chars.toCharArray()[1]) tempE = i;
		}
		string.delete(tempS + 1, tempE); 
		text = string.toString();
		System.out.printf("%s\n", text);

		return text;
	}

	public Long getWordsCountFromStr()
	{
		long count = text.chars().filter(ch -> ch == '(').count();
		System.out.printf("%d\n", count + 1);
		return count;
	}
}