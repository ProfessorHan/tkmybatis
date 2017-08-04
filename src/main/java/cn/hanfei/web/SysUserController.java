package cn.hanfei.web;


import cn.hanfei.entity.SysUser;
import cn.hanfei.service.ISysUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author HanFei
 * @since 2017-08-04
 */
@Controller
@RequestMapping("/sysUser")
public class SysUserController {

    @Autowired
    private ISysUserService sysUserService;

    @GetMapping("/list")
    @ResponseBody
    public PageInfo list(@RequestParam(value = "pageNumber", defaultValue = "1") int pageNumber,
                         @RequestParam(value = "pageSize", defaultValue = "10") int pageSize) {
        PageHelper.startPage(pageNumber, pageSize);
        List<SysUser> sysUsers = sysUserService.selectList(null);
        PageInfo<SysUser> sysUserPageInfo = new PageInfo<>(sysUsers);
        return sysUserPageInfo;
    }
}
