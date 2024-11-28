package mdx.controller;
import lombok.AllArgsConstructor;
import mdx.entity.Student;
import mdx.feign.TeacherServiceFeign;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @Description
 * @Author Administrator
 * @Date 2024/4/16 13:55
 **/
@RestController
@AllArgsConstructor
public class StudentController {

    private final TeacherServiceFeign teacherServiceFeign;

    /**
     * 查询数据
     * @return
     */
    @GetMapping("/getTeacherInfo")
    public Student getInfo(){
        Student info = teacherServiceFeign.getInfo("111");
        return info;
    }

}
