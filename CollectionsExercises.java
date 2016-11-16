import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.*;

public class CollectionsExercises {

    public static final String HOP_CASCADE = "Cascade";
    public static final String HOP_AMARILLO = "Amarillo";
    public static final String HOP_CITRA = "Citra";

    public static class Beer {
        public static final String DELIMETER = " ";
        public static final String PERCENT_POSTFIX = "% alc";
        public static final String VOLUME_UNIT = "ml";

        private String name;
        private Double alcoholByValue;
        private Integer bottleVolume;
        private List<String> hops;

        public Beer(String name, Double alcoholByValue, Integer bottleVolume, List<String> hops) {
            this.name = name;
            this.alcoholByValue = alcoholByValue;
            this.bottleVolume = bottleVolume;
            this.hops = hops;
        }

        public String getName() {
            return name;
        }

        public Double getAlcoholByValue() {
            return alcoholByValue;
        }

        public Integer getBottleVolume() {
            return bottleVolume;
        }

        public List<String> getHops() {
            return hops;
        }

        @Override
        public String toString() {
            return new StringBuilder().append(name).append(DELIMETER).append(bottleVolume.toString())
                    .append(VOLUME_UNIT).append(DELIMETER).append(hops.toString()).append(DELIMETER)
                    .append(alcoholByValue.toString()).append(PERCENT_POSTFIX).toString();
        }
    }

    public static void main(String[] args) {

        List<Beer> beers = new ArrayList<>();
        beers.add(new Beer("Edale", 5.6, 500, asList(HOP_CASCADE, HOP_AMARILLO)));
        beers.add(new Beer("Hope", 3.8, 750, asList(HOP_CASCADE, HOP_CITRA)));
        beers.add(new Beer("Castleton", 4.2, 660, asList(HOP_AMARILLO, HOP_CITRA)));
        beers.add(new Beer("Penine", 5.2, 660, asList(HOP_AMARILLO, HOP_CITRA, HOP_CASCADE)));

        List<String> beerNames = Arrays.asList("stout", "porter", "pale ale", "witbier");
        
    }
}
