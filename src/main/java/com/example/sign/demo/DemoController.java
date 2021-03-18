package com.example.sign.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yangjiahui
 * @Description: TODO
 * @Date: 2021/03/18 10:31
 */
@RestController
@RequestMapping("/api")
public class DemoController {
    /**
     * 根据订单号获取冲印配置信息
     * @param printingVo API接口入参
     * @return 订单详情
     */
    @PostMapping("/get")
    @SignVerification(type = EncryptEnum.MD5, exclude = {"type", "dataType", "version", "sign", "accessToken"})
    public ResponseResult get(@RequestBody @Valid DemoVo demoVo) {
        return DemoService.get(demoVo);
    }


}
               