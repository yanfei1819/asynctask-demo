/************************ CHANGE REPORT HISTORY ******************************\
 ** Product VERSION,UPDATED BY,UPDATE DATE                                     *
 *   DESCRIPTION OF CHANGE: modify(M),add(+),del(-)                             *
 *-----------------------------------------------------------------------------*
 * V1.0.0,yl,2023-09-18
 * create 注释
 *-----------------------------------------------------------------------------*
 * V1.0.0,yl,2023-09-18
 * M  {modifyComment}
 * -  {delComment}
 * +  {addCommnet}
 \*************************** END OF CHANGE REPORT HISTORY ********************/
package com.yanfei.sysnc.task.controller;

import com.yanfei.common.asynctask.api.AsyncTaskBuilder;
import com.yanfei.common.asynctask.api.AsyncTaskExecutor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Shi Yanfei
 * @since 2023-09-18
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/async/add")
    public String createSysnc(){
        // 任务名称
        AsyncTaskBuilder builder = new AsyncTaskBuilder("ticket.issue","1",0);
        builder.data("{}");
        builder.tablePostfix("order");
        builder.createIfNotExists();
        return "done";
    }

    @GetMapping("/async/execute")
    public String transExecute() {
        AsyncTaskExecutor.execute("ticket.issue", "order");
        return "done";
    }

}
