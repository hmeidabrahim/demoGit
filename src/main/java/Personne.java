import java.util.Objects;

public class Personne {
    String name;
    Integer age;


    public Personne(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personne personne = (Personne) o;
        return name.equals(personne.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
