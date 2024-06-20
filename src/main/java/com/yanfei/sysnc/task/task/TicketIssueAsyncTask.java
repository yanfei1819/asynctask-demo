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
package com.yanfei.sysnc.task.task;

import com.yanfei.common.asynctask.api.AsyncTask;
import com.yanfei.common.asynctask.api.AsyncTaskSetter;
import com.yanfei.common.asynctask.entity.AsyncTaskEntity;
import org.springframework.stereotype.Component;

/**
 * TODO 测试任务
 *
 * @author Shi Yanfei
 * @since 2023-09-18
 */
@Component("ticket.issue")
public class TicketIssueAsyncTask implements AsyncTask {
    @Override
    public boolean handle(AsyncTaskEntity entity, AsyncTaskSetter setter) throws Throwable {
        setter.saveData(String.format("%d: 1", entity.retry));
        setter.saveData(String.format("%d: 2", entity.retry));
        System.out.printf("handle opr: %d", entity.id);
        return true;
    }

    @Override
    public boolean skipped(AsyncTaskEntity asyncTaskEntity) {
        return false;
    }
}
