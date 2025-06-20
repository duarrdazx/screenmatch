package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme outroFilme = new Filme("Avatar", 2014);
        outroFilme.avalia(9);
        var filmeDo = new Filme("Dogville", 2003);
        filmeDo.avalia(6);
        Filme meuFilme = new Filme("Baby Driver", 2015);
        meuFilme.avalia(10);

        Serie serie = new Serie("La Casa de Papel", 2017);
        serie.avalia(10);

        // modificado o arrayList para que armazene filmes e séries juntos
        List<Titulo> listaDeFilmes = new LinkedList<>();
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(filmeDo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(serie);

        // "foreach"
        for (Titulo item : listaDeFilmes) {
            System.out.println(item.getNome());
            //
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Eduarda");
        System.out.println("Antes da ordenação: " + buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenção: " + buscaPorArtista);

        Collections.sort(listaDeFilmes);
        System.out.println("Lista de títulos ordenados: " + listaDeFilmes);
        Collections.sort(listaDeFilmes);

        // comparador
        listaDeFilmes.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano: " + listaDeFilmes);
    }
}

