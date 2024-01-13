package Task1;

import java.util.List;

public interface DirectorRepository {
    Director get(int id);

    List<Director> get(List<String> genres);

    void save(Director director);

    void delete(Director director);
}
