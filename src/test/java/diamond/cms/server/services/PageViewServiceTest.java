package diamond.cms.server.services;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import diamond.cms.server.BasicTestCase;

public class PageViewServiceTest extends BasicTestCase{

    @Autowired
    PageViewService pageViewService;

    @Test
    public void pvRangCountTest() {
        pageViewService.pvRangeCount(System.currentTimeMillis() - 24 * 60 * 60 * 1000 * 7, System.currentTimeMillis());
    }

}
