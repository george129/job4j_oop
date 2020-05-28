package ru.job4j.pojo;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;

public class LicenseTest {

    @Test
    public void eqName() {
        License lic1 = new License();
        lic1.setCode("audio");
        License lic2 = new License();
        lic2.setCode("audio");
        assertThat(lic1, is(lic2));
    }
}