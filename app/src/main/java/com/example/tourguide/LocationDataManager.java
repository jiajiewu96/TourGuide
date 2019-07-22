package com.example.tourguide;

import java.util.ArrayList;

public class LocationDataManager {
    private ArrayList<Location> attractions = new ArrayList<>();
    private ArrayList<Location> food = new ArrayList<>();
    private ArrayList<Location> nature = new ArrayList<>();
    private ArrayList<Location> events = new ArrayList<>();

    private static final LocationDataManager ourInstance = new LocationDataManager();

    public static LocationDataManager getInstance() {
        return ourInstance;
    }

    private LocationDataManager() {
        createDummyData();
    }

    private void createDummyData() {
        createDummyAttractions();
        createDummyFood();
        createDummyNature();
        createDummyEvents();
    }

    public ArrayList<Location> getAttractions(){
        return attractions;
    }
    public ArrayList<Location> getFood(){
        return food;
    }
    public ArrayList<Location> getNature(){
        return nature;
    }
    public ArrayList<Location> getEvents(){
        return events;
    }

    private void createDummyEvents() {
        events.add(new Location("Seattle Seahawks vs. Denver Broncos", "NFL Football: Seattle Seahawks and Denver Broncos match off at CenturyLink Field.", "8/8/2019"));
        events.add(new Location("Seattle Mariners vs. Detroit Tigers", "Don’t miss the battle between Seattle Mariners and Detroit Tigers at Safeco Field.", "7/25/2019 through 7/28/2019"));
        events.add(new Location("Sounders FC vs. Sporting Kansas City", "Don’t miss the battle between Sounders FC and Sporting Kansas City at CenturyLink Field.", "8/4/2019"));
        events.add(new Location("Seattle Storm vs. Minnesota Lynx", "Women’s professional basketball. The Seattle Storm host the Minnesota Lynx in this WNBA matchup.", "8/18/2019"));

    }

    private void createDummyNature() {
        nature.add(new Location("Discovery Park", "This 534-acre city park in Magnolia feels like true wilderness," +
                " with meadows, beaches, bluffs, mountain views, and tall trees. " +
                "Stroll the nearly 12 miles of walking trails, or visit the West Point Lighthouse for a postcard-worthy photo op."));
        nature.add(new Location("Mount Si", "One of the most popular hikes in the area," +
                " Mount Si is a great place to gain some elevation—3,150 feet of it, to be exact. " +
                "You’ll see plenty of people with loaded packs training for summits like Mount Rainier, " +
                "but it’s just as enjoyable for casual day hikers traveling at a leisurely pace."));
        nature.add(new Location("Mount Rainier", "Make a day trip to Mount Rainier, the icon looming on the horizon. " +
                "It’s a 2.5-hour drive to the active volcano, with many tour operators offering guided tours. " +
                "The Paradise visitor area is a great place to start, with trailheads that are both beginner-friendly and suited for expert climbers. " +
                "Take in the alpine meadows abloom with wildflowers in the summer, or embark on a snowshoe excursion in winter."));
    }

    private void createDummyFood() {
        food.add(new Location("Starbucks Reserve Roastery & Tasting Room", "Dubbed the “Willy Wonka factory of coffee,” " +
                "all of the rare, small-lot Starbucks Reserve coffees are roasted and packaged here before being shipped all over the world. " +
                "Speak with a Starbucks master roaster while watching coffees roast, enjoy a unique food and beverage menu, " +
                "and shop one-of-a-kind merchandise at the only Starbucks Roastery and Tasting Room in the world. " +
                "Located just nine blocks from the original Pike Place Market store, open daily 6:30am – 11pm."));
        food.add(new Location("Japonessa", "Housing the latest talents of renowned Chef Billy Beach, " +
                "Japonessa offers some of the best sushi Seattle has to offer. "));
        food.add(new Location("Aqua By El Guacho", "Savory seafood, sinful desserts, stunning dining room, 4,000 sq. ft. deck. " +
                "Open for dinner. Nightly piano music. Private dining rooms available."));
    }

    private void createDummyAttractions() {
        attractions.add(new Location("Space Needle", "Built for the 1962 World’s Fair, " +
                "the 605-foot-tall Space Needle quickly became an icon of the city that today is recognized far and wide. " +
                "On the observation level, which you can reach via a 43-second elevator ride, see the doodle-on-a-napkin concept that led to the Space Needle design. " +
                "Views from the top feature Elliott Bay, the Cascade Mountains, and even Mount Rainier."));
        attractions.add(new Location("Pacific Science Center", "This family-friendly museum is where science lessons come to life. " +
                "At Pacific Science Center, explore galaxies near and far in the planetarium," +
                "get up close and personal with colorful creatures in the Tropical Butterfly House, maneuver a two-ton granite ball, " +
                "find out what it means if you can roll your tongue, and much more."));
        attractions.add(new Location("Chihuly Garden and Glass", "The Chihuly Garden and Glass museum is dedicated to the work and career of locally born," +
                " world-renowned glassblower Dale Chihuly, " +
                "who was introduced to the craft while studying at the University of Washington. " +
                "It is the most comprehensive collection of his art to date, with interior galleries featuring a variety of his work in the medium. " +
                "The pièce de résistance is the glasshouse, with a vibrant 100-foot-long sculpture in hues of red, orange, and yellow suspended from the ceiling."));
        attractions.add(new Location("Seattle Great Wheel", "Although it was only built in 2012," +
                " the Seattle Great Wheel has quickly become a fixture of the city’s skyline—" +
                "plus it adds an entirely new sightseeing perspective, " +
                "thanks to its location perched on the end of Pier 57." +
                " Enjoy three revolutions around in one of the air-conditioned gondolas to see the city, water," +
                " and mountains on the horizon."));
        attractions.add(new Location("Pike Place Market", "From the iconic market sign and Rachel the Piggy Bank to the gum wall, " +
                "the original Starbucks cafe, well over 225 local artisans selling their wares," +
                " the famous fish-tossing tradition, and music-playing street performers," +
                " there are enough sights and sounds at Pike Place Market to pack a day (or more)." +
                " The market added its historic MarketFront expansion in 2017, featuring an open-air plaza and fantastic views of Elliott Bay."));
        attractions.add(new Location("Seattle Aquarium", "Down at the Seattle Aquarium on the waterfront’s Pier 59," +
                " learn all about salmon, meet a few adorable sea otters, and greet the various sea creatures of the Pacific Ocean, from puffers to giant clams. " +
                "Watch scuba divers feed the fish, gawk at sharks swimming overhead in the underwater dome, and even touch a sea anemone."));
    }
}
