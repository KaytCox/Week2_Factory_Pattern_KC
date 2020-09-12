package driveInMovies;

public class producingMovies {

    public enjoyTheShow getSelectedMovie(String enjoyTheShow){
    	//connections from movie files to printing
        if (enjoyTheShow.equalsIgnoreCase("SCARY") ) {
            return new scaryMovies();
        }
        
        else if (enjoyTheShow.equalsIgnoreCase("ROMCOM") ){
            return new romComMovies();
        }
        
        else if (enjoyTheShow.equalsIgnoreCase("CARTOON") ){
            return new cartoonMovies();
        }

        return null;
    }
}