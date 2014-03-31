package es.pilli.rotten_potatoes

class Movie {

	String title;
	String rating;
	Date releaseDate;
	String description;
	
    static constraints = {
		title (blank:false);
		rating (blank:false, inList: ["G", "PG", "PG-13", "R"]);
		releaseDate (blank:false);
		description (nullable:true);
    }
}
