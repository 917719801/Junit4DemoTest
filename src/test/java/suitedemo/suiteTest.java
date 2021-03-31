package suitedemo;


import com.junittestcase.JuintTest01;
import com.junittestcase.JuintTest02;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        JuintTest01.class,
        JuintTest02.class
})
public class suiteTest {
}
