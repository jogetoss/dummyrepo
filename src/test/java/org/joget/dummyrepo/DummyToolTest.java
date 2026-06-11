package org.joget.dummyrepo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DummyToolTest {

    @Test
    public void defaultMessageConstantIsSet() {
        assertEquals("Hello from dummyrepo plugin", "Hello from dummyrepo plugin");
    }
}
