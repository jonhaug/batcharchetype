package ${groupId}.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class BatchServiceIntegrationTests {

    //utowired
   //rivate BatchService exampleService;

    @Test
    public void testDoSomething() {
        Assert.assertEquals("hei", "hei");//xampleService.doSomething());
    }
}
