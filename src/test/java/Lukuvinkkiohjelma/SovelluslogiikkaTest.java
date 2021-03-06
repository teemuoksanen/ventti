/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lukuvinkkiohjelma;

import Lukuvinkkiohjelma.dao.VinkkiJsonDao;
import Lukuvinkkiohjelma.domain.Kirja;
import Lukuvinkkiohjelma.domain.Sovelluslogiikka;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hilla
 */
public class SovelluslogiikkaTest {

    Sovelluslogiikka sovelluslogiikka;

    public SovelluslogiikkaTest() {
        sovelluslogiikka = new Sovelluslogiikka(new VinkkiJsonDao("testi"));
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void vinkinLisaysOnnistuu() {
        assertTrue(sovelluslogiikka.lisaaVinkki(new Kirja(
                "Testikirja", "Testikirjoittaja", "TestiISBN")));
    }
}
