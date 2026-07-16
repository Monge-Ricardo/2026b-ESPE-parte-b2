package es.upm.grise.cruiseControl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CruiseControlTest {

	@Test
	public void smokeTest() {}

    @Test
    void cuandoLaVelocidadEsMenorQueSpeedSet_entoncesIncrease() throws Exception {
        // velocidad actual = 40
        CruiseControl cruiseControl = new CruiseControl(40);
        cruiseControl.setSpeedSet(60);

        Response response = cruiseControl.nextCommand();

        assertEquals(Command.INCREASE, response.command);
    }
}
