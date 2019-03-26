package cn.adbyte.swagger;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Adam.Yao
 * @date: 2019/3/26 15:27
 */
@RestController
@Api("用户相关的api")
public class UserController {
    @ApiOperation(value = "根据id查询用户信息", notes = "查询用户信息")
    @ApiImplicitParam(name = "id", value = "用户ID", paramType = "query", required = false, dataType = "Integer")
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(Integer id) {
        return "hello 新用户" + id;
    }

}
