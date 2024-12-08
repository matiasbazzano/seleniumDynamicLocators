package suites;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import tests.ElementsTest;
import tests.FormsTest;
import tests.AlertsFrameWindowsTest;
import tests.WidgetsTest;

    @Suite
    @SelectClasses({
            ElementsTest.class,
            FormsTest.class,
            AlertsFrameWindowsTest.class,
            WidgetsTest.class
    })

public class TestSuite { }