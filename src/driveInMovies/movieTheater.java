package driveInMovies;

public class movieTheater {

    public static void main(String[] args){
    	//Print messages for project
    	producingMovies ProducingMovies = new producingMovies();
        ProducingMovies.getSelectedMovie("SCARY").getMovie();
        ProducingMovies.getSelectedMovie("ROMCOM").getMovie();
        ProducingMovies.getSelectedMovie("CARTOON").getMovie();
    }

}
