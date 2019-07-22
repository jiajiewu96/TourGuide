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

    private void createDummyEvents() {
        events.add(new Location("Seattle Seahawks vs. Denver Broncos", "NFL Football: Seattle Seahawks and Denver Broncos match off at CenturyLink Field.", "8/8/2019"));
        events.add(new Location("Seattle Mariners vs. Detroit Tigers", "Don’t miss the battle between Seattle Mariners and Detroit Tigers at Safeco Field.", "7/25/2019 through 7/28/2019"));
        events.add(new Location("Sounders FC vs. Sporting Kansas City", "Don’t miss the battle between Sounders FC and Sporting Kansas City at CenturyLink Field.", "8/4/2019"));
        events.add(new Location("Seattle Storm vs. Minnesota Lynx", "Women’s professional basketball. The Seattle Storm host the Minnesota Lynx in this WNBA matchup.", "8/18/2019"));

    }

    private void createDummyNature() {

    }

    private void createDummyFood() {

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
