import server.Database;
import shared.Pokemon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*List<Pokemon> myP = new ArrayList<Pokemon>();
        myP.add(new Pokemon("popo", 2));
        myP.add(new Pokemon("pipo", 3));
        myP.add(new Pokemon("pipoudou", 4));

        Database dbTest = new Database("pokemons.db");
        dbTest.savePokemons((ArrayList<Pokemon>)myP);*/
        Database dbTest = new Database("pokemons.db");
        List<Pokemon> myP = dbTest.loadPokemons();
        for (Pokemon p : myP) {
            System.out.println(p.toString());
        }
    }
}
