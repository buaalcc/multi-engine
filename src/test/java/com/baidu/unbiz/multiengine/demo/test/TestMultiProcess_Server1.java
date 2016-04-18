package com.baidu.unbiz.multiengine.demo.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.baidu.unbiz.multiengine.utils.TestUtils;
import com.baidu.unbiz.multiengine.endpoint.EndpointSupervisor;

/**
 * Created by wangchongjie on 16/4/18.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/applicationContext-test2.xml")
public class TestMultiProcess_Server1 {

    @Before
    public void init() {
        EndpointSupervisor supervisor = new EndpointSupervisor();
        supervisor.setExportPort("8801;8802");
        EndpointSupervisor.init();
    }

    @After
    public void clean() {
        EndpointSupervisor.stop();
    }

    /**
     * 测试分布式并行执行task
     */
    @Test
    public void runServer() {
        TestUtils.dumySleep(TestUtils.VERY_LONG_TIME);
    }

}