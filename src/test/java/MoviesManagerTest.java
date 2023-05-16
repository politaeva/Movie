import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviesManagerTest {

    @Test
    public void test(){
        MoviesManager manager = new MoviesManager();

        manager. addMovie("Film I");
        manager. addMovie("Film II");
        manager. addMovie("Film III");

        String[] expected = {"Film I","Film II", "Film III"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test1(){
        MoviesManager manager = new MoviesManager();

        manager. addMovie("Film I");
        manager. addMovie("Film II");
        manager. addMovie("Film III");

        String[] expected = {"Film III","Film II", "Film I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
