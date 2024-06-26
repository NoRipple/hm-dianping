package com.hmdp;

import com.alibaba.dashscope.aigc.generation.Generation;
import com.alibaba.dashscope.aigc.generation.GenerationResult;
import com.alibaba.dashscope.aigc.generation.models.QwenParam;
import com.alibaba.dashscope.common.Message;
import com.alibaba.dashscope.common.MessageManager;
import com.alibaba.dashscope.common.Role;
import com.alibaba.dashscope.exception.ApiException;
import com.alibaba.dashscope.exception.InputRequiredException;
import com.alibaba.dashscope.exception.NoApiKeyException;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.hmdp.mapper")
@SpringBootApplication
public class HmDianPingApplication {
    //通义千问api问答调用
//    public static void callWithMessage()
//            throws NoApiKeyException, ApiException, InputRequiredException {
//        Generation gen = new Generation();
//        MessageManager msgManager = new MessageManager(10);
//        Message systemMsg =
//                Message.builder().role(Role.SYSTEM.getValue()).content("You are a helpful assistant.").build();
//        Message userMsg = Message.builder().role(Role.USER.getValue()).content("如何调用阿里云图片识别api").build();
//        msgManager.add(systemMsg);
//        msgManager.add(userMsg);
//        QwenParam param =
//                QwenParam.builder().model(Generation.Models.QWEN_TURBO).messages(msgManager.get())
//                        .resultFormat(QwenParam.ResultFormat.MESSAGE)
//                        .build();
//        GenerationResult result = gen.call(param);
//        System.out.println(result);
//    }
//
//    public static void main(String[] args){
//
//        try {
//            callWithMessage();
//        } catch (ApiException | NoApiKeyException | InputRequiredException e) {
//            System.out.println(e.getMessage());
//        }
//        System.exit(0);
//    }

    public static void main(String[] args) {
        SpringApplication.run(HmDianPingApplication.class, args);
    }

}
