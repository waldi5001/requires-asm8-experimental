package de.fk.wlp;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;

@Stateless
public class TestFeature {

    @PostConstruct
    public void testMethod() {
        String multiline = """
                Test
                Multiline
                String""";
    }
}
