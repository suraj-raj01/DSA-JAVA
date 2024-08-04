package Design.Specification1;

public class MyUtility {
    public static int countVowel(UserName userName)
    {
        int count = 0;
        String str = userName.getFullName();
        for (int i = 0; i < str.length(); i++) {
        MyUtility myUtility = new MyUtility();
        if(myUtility.isVowel(str.charAt(i)))      
        {
            count++;
        }
        }
        return  count;
    }
    boolean isVowel(char character)
    {
        boolean response = false;
        if(character=='a' || character=='e' || character=='i' || character=='o' ||character=='u'
            || character=='A' || character=='E' || character=='I' || character=='O' ||character=='U'
        )
        {
            response = true;
        }
        return response;
    }
}
