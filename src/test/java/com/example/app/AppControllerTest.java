package com.example.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppControllerTest {

    @Test
    void probarHolaMundo() {
        AppController controller = new AppController();
        String texto = controller.holaMundo();
        assertEquals("Hola mundo", texto);

    }
}
