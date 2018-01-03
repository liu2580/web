import com.jskj.ssm.controller.ArticleController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-mybatis.xml","classpath:spring/spring-webmvc.xml"})
public class testUserController {

    @Autowired
   // private UserController userController;
    private ArticleController articleController;

    MockMvc mockMvc;
    @Before
    public void setUp() {
         mockMvc = MockMvcBuilders.standaloneSetup(articleController).build();
    }

//    @Test
//    public void testGetAllUser() throws Exception{
//        System.out.println("--------分割线----------");
//        try {
//            mockMvc.perform(get("/user/getall"))
//                    .andDo(MockMvcResultHandlers.print());
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//    }

        @Test
    public void testGetAllUser() throws Exception{
        System.out.println("--------分割线----------");
        try {
            mockMvc.perform(get("/article/getAllArticles"))
                    .andDo(MockMvcResultHandlers.print());
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
