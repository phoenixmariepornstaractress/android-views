package com.zarinpal.views;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Instrumented test executed on an Android device to validate application context.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Test
    public void testAppContext() throws Exception {
        Context context = InstrumentationRegistry.getTargetContext();
        String expectedPackageName = "com.zarinpal.views";
        String actualPackageName = context.getPackageName();

        assertEquals("Package name should match", expectedPackageName, actualPackageName);
    }
}
 
