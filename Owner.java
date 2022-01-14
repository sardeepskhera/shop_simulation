public class Owner
{
    public static final String firstName = "Sardeep";
    public static final String lastName = "Khera";
    public static final String caption = "*The smirk that goes mild!*";
    public static final String quote = "\"Winning feels better when you take a little damage.\" -Oddisee 2014";
    public static final String personalBackground = "Northern boy, raised in the South, with family from the East. I play video games, do cosplay and watch movies. Typical nerd with a typical degree path!";
    public static final String professionalBackground = "5 years of experience working as a secretary to physicians in an ER";
    public static final String academicBackground = "Associate's Degree from Wake Tech Community College";
    public static final String programmingExperience = "A little Python and Java";
    public static final String currentClass1 = "INTL 1101 - Intro to International Studies: Need elective and I am interested in global studies";
    public static final String currentClass2 = "SOCY 1101 - Intro to Sociology: This subject is very interesting to me";
    public static final String currentClass3 = "MATH 2164 - Matrices & Linear Algebra: Need for CS degree completion";
    public static final String currentClass4 = "ITSC 1212 - Intro to Comp Sci: My core focus for my degree requires an introduction!";
    public static final int graduationYear = 2023;
    public static final String funStory = "One of my friend groups is a bunch of idiots I met playing Halo 3 back in middle school and now I'm the groomsman for once of those friends in a wedding where we will all finally meet!";
    boolean fromNorthCarolina = true;

    public String toString()
    {
        String objectSummary = "The owner is: " + firstName + " " + lastName + ". Their caption goes: " + caption + " and their quote is " + quote;
        return objectSummary;
    }
}