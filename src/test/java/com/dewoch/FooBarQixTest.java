package com.dewoch;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by boris on 16/01/2017.
 */
public class FooBarQixTest {

    @Test
    public void should_be_1() throws Exception {

        Assert.assertEquals("1", FooBarQix.calculate(1));

    }

    @Test
    public void should_be_FooFoo() throws Exception {

        Assert.assertEquals("FooFoo", FooBarQix.calculate(3));

    }

    @Test
    public void should_be_BarBar() throws Exception {

        Assert.assertEquals("BarBar", FooBarQix.calculate(5));

    }

    @Test
    public void should_be_QixQix() throws Exception {

        Assert.assertEquals("QixQix", FooBarQix.calculate(7));

    }

    @Test
    public void should_be_FooBarBar() throws Exception {

        Assert.assertEquals("FooBarBar", FooBarQix.calculate(15));

    }

    @Test
    public void should_be_FooBar() throws Exception {

        Assert.assertEquals("FooBar", FooBarQix.calculate(51));

    }

    @Test
    public void should_be_BarFoo() throws Exception {

        Assert.assertEquals("BarFoo", FooBarQix.calculate(53));

    }

    @Test
    public void should_be_FooFooFoo() throws Exception {

        Assert.assertEquals("FooFooFoo", FooBarQix.calculate(33));

    }
}
