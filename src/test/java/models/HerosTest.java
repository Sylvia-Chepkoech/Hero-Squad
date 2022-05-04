//package models;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.Test;
//
//import java.util.ArrayList;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class HerosTest {
//
//    @BeforeEach
//    void setUp() throws Exception{
//    }
//
//    @AfterEach
//    void tearDown() {
//    }
//
//
//    @Test
//    public void instatiatesCorrectly_true(){
//        Heros hero = new Heros("Jonah", 54, "Disobedience", "Whales");
//        assertTrue(hero instanceof Heros);
//    }
//
//    @Test
//    public void returnsHeroNameCorrectly_String() {
//        Heros hero = new Heros("Jonah", 54, "Disobedience", "Whales");
//        assertEquals("Jonah", hero.getName());
//    }
//
//    @Test
//    public void returnsHeroAgeCorrectly_int() {
//        Heros hero = new Heros("Jonah", 54, "Disobedience", "Whales");
//        assertEquals(54, hero.getAge());
//    }
//
//    @Test
//    public void returnsHeroPowerCorrectly_String() {
//        Heros hero = new Heros("Jonah", 54, "Disobedience", "Whales");
//        assertEquals("Disobedience", hero.getPower());
//    }
//
//    @Test
//    public void returnsHeroWeaknessCorrectly_String() {
//        Heros hero = new Heros("Jonah", 54, "Disobedience", "Whales");
//        assertEquals("Whales", hero.getWeakness());
//    }
//
//    @Test
//    public void AllHeroReturnedCorrectly_int() {
//        Heros hero = new Heros("Jonah", 54, "Disobedience", "Whales");
//        Heros secondHero = new Heros("OralB", 12, "Teeth-whitening", "Cavities");
//        Heros thirdHero = new Heros("TripleAce", 23, "Germ-killer", "Oduor");
//        assertEquals(3, hero.getAllInstances().size());
//    }
//
//    @Test
//    public void allHeroesContainsAllHeroesObjects_true() {
//        Heros hero = new Heros("Jonah", 54, "Disobedience", "Whales");
//        Heros secondHero = new Heros ("OralB", 12, "Teeth-whitening", "Cavities");
//        Heros thirdHero = new Heros("TripleAce", 23, "Germ-killer", "Oduor");
//        assertTrue(Heros.getAllInstances().contains(hero));
//        assertTrue(Heros.getAllInstances().contains(secondHero));
//        assertTrue(Heros.getAllInstances().contains(thirdHero));
//    }
//
//    @Test
//    public void checkIfNewHeroIsSquadMember_false() {
//        Heros hero = new Heros("Jonah", 54, "Disobedience", "Whales");
//        assertFalse(hero.isSquadMember());
//    }
//
//    @Test
//    public void findHeroById() throws Exception {
//        Heros hero = new Heros("Jonah", 54, "Disobedience", "Whales");
//        Heros secondHero = new Heros ("OralB", 12, "Teeth-whitening", "Cavities");
//        Heros foundHero = Heros.findById(1);
//        Heros foundSecondHero = Heros.findById(2);
//        assertEquals(hero, foundHero);
//        assertEquals(secondHero, foundSecondHero);
//    }
//}