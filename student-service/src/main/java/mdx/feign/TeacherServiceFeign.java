package mdx.feign;

import mdx.entity.Teacher;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * TODO
 *
 * @Description
 * @Author Administrator
 * @Date 2024/4/16 13:59
 **/

@FeignClient(
    value = "teacherservice",
    fallback = TeacherServiceFeignFallBack.class
)
public interface TeacherServiceFeign {

    /**
     * 获取老师信息
     * @param id 老师id
     * @return
     */
    @GetMapping("/getTeacher/{id}")
    Teacher getInfo(@PathVariable("id") String id);

}
