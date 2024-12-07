package String_Buffer;

public class Practice_Methods {

	public static void main(String[] args)
	{
		StringBuffer story = new StringBuffer("Once upon a time");
		story.append(", there was a dragon.");
		story.insert(29, " brave");
		story.append("\n who guarded a treasure.");
		System.out.println(story);

	}

}
