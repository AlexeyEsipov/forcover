package ru.job4j;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class AppTest {

    @Test
    void whenThenOk() {
        App app = new App();
        boolean a = true;
        assertThat(app.get()).isTrue();
    }

}