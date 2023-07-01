//Заполнить список названиями планет Солнечной системы в произвольном порядке
// с повторениями. Вывести название каждой планеты и количество его повторений в списке

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main3 {
    static  List<String> sunPlanet = new ArrayList<>();
    public static void main(String[] args) {

        sunPlanet.add("Меркурий");
        sunPlanet.add("Венера");
        sunPlanet.add("Земля");
        sunPlanet.add("Марс");
        sunPlanet.add("Юпитер");
        sunPlanet.add("Сатурн");
        sunPlanet.add("Уран");
        sunPlanet.add("Нептун");
        List<String> listOfSunPlanet = new ArrayList<>();
        listOfSunPlanetGenerate(listOfSunPlanet, 20);
        System.out.println(listOfSunPlanet);
        List CountOfPlanet = new ArrayList<>();
        countOfPlanet(listOfSunPlanet, CountOfPlanet);
        System.out.println(CountOfPlanet);

    }
    static void listOfSunPlanetGenerate(List<String> listOfSunPlanet, int countOfPanet){
        for (int i =0; i<countOfPanet; i++){
            int planet = (int)(Math.random()* (8-0)) ;
            listOfSunPlanet.add(sunPlanet.get(planet));
        }
    }

    static void countOfPlanet (List<String> listOfSunPlanet,List CountOfPlanet){
        for (int i =0; i<sunPlanet.size(); i++){
            int countOfplanet = Collections.frequency(listOfSunPlanet, sunPlanet.get(i));
            if (countOfplanet > 0){
                CountOfPlanet.add(sunPlanet.get(i));
                CountOfPlanet.add(countOfplanet);
            }
        }
    }
}
