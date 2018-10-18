package exception;

public class PokemonAlreadyExistException extends Exception {

    public PokemonAlreadyExistException(String message) {
        super(message);
    }
}
