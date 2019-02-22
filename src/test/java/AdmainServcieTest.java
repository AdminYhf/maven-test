import com.yhf.First;
import com.yhf.dao.AlbumMapper;
import com.yhf.service.AdmainService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = First.class)


public class AdmainServcieTest {
    @Autowired
    private AlbumMapper albumMapper;

    @Autowired
    private AdmainService admainService;


    @Test
    public void getall() {
        //admainService.toString();
        //System.out.println(admainService.getAll());
        //System.out.println(admain);
        System.out.println(albumMapper.selectByPrimaryKey(3));
    }
}
