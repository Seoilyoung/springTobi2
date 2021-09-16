package org.practice.Tobi2.hello;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.StaticApplicationContext;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

class HelloTest {

    @Test
    public void notNull(){
        StaticApplicationContext ac = new StaticApplicationContext();
        ac.registerSingleton("hello1", Hello.class);

        Hello hello1 = ac.getBean("hello1",Hello.class);
        assertThat(hello1, is(notNullValue()));
    }
}