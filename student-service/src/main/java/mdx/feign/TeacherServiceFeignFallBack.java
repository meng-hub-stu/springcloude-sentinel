package mdx.feign;

import mdx.entity.Student;
import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @Description
 * @Author Administrator
 * @Date 2024/4/16 14:07
 **/
@Component
public class TeacherServiceFeignFallBack implements TeacherServiceFeign{

    /**
     * 返回失败
     * @param id 老师id
     * @return
     */
    @Override
    public Student getInfo(String id) {
        return null;
    }

}
