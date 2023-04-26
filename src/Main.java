
public class Main {
    public static void main(String[] args) {
        for (SolarSystem planets : SolarSystem.values()) {
            System.out.println(planets + " " + planets.getNoFromSun() + " " + planets.getDistanceFromPreviousPlanet() + " " + planets.getRadius() + " "
                    + planets.getPreviousPlanet() + " " + planets.getNextPlanet()+ " " + planets.getDistanceFromSun());
        }
    }

}
