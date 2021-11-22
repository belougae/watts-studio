package geektime.demo.services.elasticsearch.model;

import java.io.Serializable;

/**
 * @author wangjing
 */
public class OpinionWeiboSnapshot implements Serializable {

    private String text;
    private String userName;
    private String createTime;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
