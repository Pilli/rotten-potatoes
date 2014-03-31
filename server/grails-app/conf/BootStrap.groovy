import java.text.DateFormat;

import es.pilli.rotten_potatoes.Movie

class BootStrap {

	def init = { servletContext ->
		new Movie(title: "Aladdin", rating: "G", releaseDate: new Date().parse("dd-MM-yyyy", "25-11-1992")).save(failOnError:true, flush:true);
		new Movie(title: "The Terminator", rating: "R", releaseDate: new Date().parse("dd-MM-yyyy", "26-10-1984")).save(failOnError:true, flush:true);
		new Movie(title: "When Harry Met Sally", rating: "R", releaseDate: new Date().parse("dd-MM-yyyy", "21-07-1989")).save(failOnError:true, flush:true);
		new Movie(title: "The Help", rating: "PG-13", releaseDate: new Date().parse("dd-MM-yyyy", "10-08-2011")).save(failOnError:true, flush:true);
		new Movie(title: "Chocolat", rating: "PG-13", releaseDate: new Date().parse("dd-MM-yyyy", "5-01-2001")).save(failOnError:true, flush:true);
		new Movie(title: "Amelie", rating: "R", releaseDate: new Date().parse("dd-MM-yyyy", "25-04-2001")).save(failOnError:true, flush:true);
		new Movie(title: "2001: A Space Odyssey", rating: "G", releaseDate: new Date().parse("dd-MM-yyyy", "6-04-1968")).save(failOnError:true, flush:true);
		new Movie(title: "The Incredibles", rating: "PG", releaseDate: new Date().parse("dd-MM-yyyy", "5-11-2004")).save(failOnError:true, flush:true);
		new Movie(title: "Raiders of the Lost Ark", rating: "PG", releaseDate: new Date().parse("dd-MM-yyyy", "12-06-1981")).save(failOnError:true, flush:true);
		new Movie(title: "Chicken Run", rating: "G", releaseDate: new Date().parse("dd-MM-yyyy", "21-06-2000")).save(failOnError:true, flush:true);
	}
	def destroy = {
	}
}
