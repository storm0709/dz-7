public enum SolarSystem {
        MERCURY(0, 100, 10, null, "Venus"),
        VENUS(1, 200, 20, SolarSystem.MERCURY, "Earth"),
        EARTH(2, 300, 30, SolarSystem.VENUS, "Mars"),
        MARS(3, 400, 40, SolarSystem.EARTH, "Jupiter"),
        JUPITER(4, 500, 50, SolarSystem.MARS, "Saturn"),
        SATURN(5, 600, 60, SolarSystem.JUPITER, "Uranus"),
        URANUS(6, 700, 70, SolarSystem.SATURN, "Neptune"),
        NEPTUNE(7, 800, 20, SolarSystem.URANUS, null);

        private final int noFromSun;
        private final int distanceFromPreviousPlanet;
        private final int distanceFromSun;
        private final int radius;
        private final SolarSystem previousPlanet;
        private final String nextPlanet;

        SolarSystem(int noFromSun, int distanceFromPreviousPlanet, int radius, SolarSystem previousPlanet, String nextPlanet) {
            this.noFromSun = noFromSun;
            this.distanceFromPreviousPlanet = distanceFromPreviousPlanet;
            this.distanceFromSun = previousPlanet != null ? previousPlanet.distanceFromSun + distanceFromPreviousPlanet : distanceFromPreviousPlanet;
            this.radius = radius;
            this.previousPlanet = previousPlanet;
            this.nextPlanet = nextPlanet;
        }

        public int getNoFromSun() {
            return noFromSun;
        }

        public int getDistanceFromPreviousPlanet() {
            return distanceFromPreviousPlanet;
        }

        public int getDistanceFromSun() {
            return distanceFromSun;
        }

        public int getRadius() {
            return radius;
        }

        public SolarSystem getPreviousPlanet() {
            return previousPlanet;
        }

        public String getNextPlanet() {
            return nextPlanet;
        }
}
