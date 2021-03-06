package com.baidu.unbiz.multiengine.transport.dto;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * rpc消息封装
 *
 * Created by wangchongjie on 16/4/13.
 */
public class Signal<T> {

    protected long seqId;
    protected T message;
    protected SignalType type = SignalType.TASK_COMMOND;

    public Signal() {
    }

    public Signal(T message) {
        this.message = message;
    }

    public T getMessage() {
        return message;
    }

    public void setMessage(T message) {
        this.message = message;
    }

    public long getSeqId() {
        return seqId;
    }

    public void setSeqId(long seqId) {
        this.seqId = seqId;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public SignalType getType() {
        return type;
    }

    public void setType(SignalType type) {
        this.type = type;
    }
}
