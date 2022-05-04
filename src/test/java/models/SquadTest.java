//package models;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.util.ArrayList;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class SquadTest {
//
//    @BeforeEach
//    void setUp() {
//    }
//
//    @AfterEach
//    void tearDown() {
//    }
//
//    @Test
//    public void instantiatesSquadObjectsWithHeroObjectsCorrectly_true() {
//        ArrayList<Heros> heros = new ArrayList<>();
//        Squad squads = new Squad("PTOW", "sexism", 3, heros);
//        assertTrue(squads instanceof Squad);
//    }
//    @Test
//    public void returnsSquadNameCorrectly_String() {
//        ArrayList<Heros> heros = new ArrayList<>();
//        Squad squads = new Squad("PTOW", "sexism", 3, heros);
//        assertEquals("PTOW", squads.getSquadName());
//    }
//
//    @Test
//    public void returnsSquadCauseCorrectly_String() {
//        ArrayList<Heros> heros = new ArrayList<>();
//        Squad squads = new Squad("PTOW", "sexism", 3, heros);
//        assertEquals("sexism", squads.getSquadCause());
//    }
//
//    @Test
//    public void returnsSquadSizeCorrectly_String() {
//        ArrayList<Heros> heros = new ArrayList<>();
//        Squad squads = new Squad("PTOW", "sexism", 3, heros);
//        assertEquals(3, squads.getMaxSize());
//    }
//
//    @Test
//    public void returnsSquadHeroesCorrectly_ArrayList() {
//        ArrayList<Heros> heros = new ArrayList<>();
//        Squad squads = new Squad("PTOW", "sexism", 3, heros);
//        assertEquals(heros, squads.getHeros());
//    }
//
//    @Test
//    public void returnsAllSquadInstancesCorrectly_int() {
//        ArrayList<Heros> heros = new ArrayList<>();
//        Squad squads = new Squad("PTOW", "sexism", 3, heros);
//        Squad secondSquads = new Squad("Life Of Pi", "math problems", 3, heros);
//        Squad thirdSquads = new Squad("Power Puff Girls", "FGM", 2, heros);
//        assertEquals(3, Squad.getSquadsInstances().size());
//    }
//
//    @Test
//    public void squadsContainsAllSquadObjects_true() {
//        ArrayList<Heros> heros = new ArrayList<>();
//        Squad squads = new Squad("PTOW", "sexism", 3, heros);
//        Squad secondSquads = new Squad("Life Of Pi", "math problems", 3, heros);
//        Squad thirdSquads = new Squad("Power Puff Girls", "FGM", 2, heros);
//        assertTrue(Squad.getSquadsInstances().contains(squads));
//        assertTrue(Squad.getSquadsInstances().contains(secondSquads));
//        assertTrue(Squad.getSquadsInstances().contains(thirdSquads));
//    }
//
//    @Test
//    public void findSquadById() throws Exception {
//        ArrayList<Heros> heroes = new ArrayList<>();
//        Squad squads = new Squad("Champions", "fight corruption", 5, heroes);
//        Squad secondSquads = new Squad("Peace-makers", "fight war", 3, heroes);
//        Squad thirdSquads = new Squad("Entrepreneurs", "fight unemployment", 2, heroes);
//        Squad foundSquads = Squad.findById(1);
//        Squad foundSecondSquads = Squad.findById(2);
//        Squad foundThirdSquads = Squad.findById(3);
//        assertEquals(squads, foundSquads);
//        assertEquals(secondSquads, foundSecondSquads);
//        assertEquals(thirdSquads, foundThirdSquads);
//    }
//}