package factory_DP;
class Recipe
{
	int rid,ptime,ctime,totcal,totprot,totcarbo,totfat;
	String rname,rtype,rperson;
	void addIngredient()
	{
		System.out.println("depending upon the type of reciepe the ingredients were added");
	}
	void addInstruction()
	{
		System.out.println("Instructions for preparing recipe");
	}
	void addTags()
	{
		System.out.println("addings some of commeting tags for our recipe");
	}
	void addUser()
	{
		System.out.println("name of the chef ");
	}
	void addFavotites()
	{
		System.out.println("favorite items of the user or people");
	}
	void addRatings()
	{
		System.out.println("ratings were given from 1 to 5 depending upon the quality and taste of the recipe");
	}
	void addReviews()
	{
		System.out.println("public reviws on that reciepe");
	}
	
}
class ingredients extends Recipe
{
	int price,cal,prot,crabo,fat;
	String iname,iid,itype,iunit;
}
class reviews extends Recipe
{
	String review;
}
class tags extends Recipe
{
	float ratings;
	String tags;
}
class favorites extends Recipe
{
	String favname,username;
}
class Instructions extends Recipe
{
	String rules;
}
public class factory_ms {

	public static void main(String[] args) {
		
       Recipe r=new Recipe();
       r.addFavotites();
       r.addIngredient();
       r.addInstruction();
       r.addRatings();
       r.addReviews();
       r.addTags();
       r.addUser();
	}

}
