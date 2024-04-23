import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<City> cities = new ArrayList<>();

        cities.add(new City("Indonesia", 1945));
        cities.add(new City("United States", 1776));
        cities.add(new City("Germany", 1949));
        cities.add(new City("France", 1789));

        List<City> sortedYear = cities.stream()
                .sorted(Comparator.comparing(city -> city.yearIndependence))
                .collect(Collectors.toList());

        sortedYear.forEach(city -> System.out.println(city.name));

        List<City> olderThan = cities.stream()
                .filter(city -> City.yearIndependence > 1945)
                .collect(Collectors.toList());




    }
}

class City{
    public String name;
    public static int yearIndependence;

    public City(String name, int yearIndependence) {
        this.name = name;
        this.yearIndependence = yearIndependence;
    }
}