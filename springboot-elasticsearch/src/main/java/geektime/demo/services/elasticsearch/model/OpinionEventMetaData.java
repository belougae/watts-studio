package geektime.demo.services.elasticsearch.model;

import geektime.demo.services.elasticsearch.Constants;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.util.List;

/**
 * @author wangjing
 */
@Document(indexName = "opinion_event_meta_data", type = Constants.EMPLOYEE_INDEX_TYPE)
public class OpinionEventMetaData implements Serializable {
    @Id
    private String id;

    private Integer rank;
    private Integer count;
    private Integer createTime;

    @Transient
    private String name;
    @Transient
    private String createName;
    @Transient
    private String describe;
    @Transient
    private String type;
    @Transient
    private String pictureUrl;
    @Transient
    private String url;
    @Transient
    private List<OpinionWeiboSnapshot> weiboSnapshotList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public List<OpinionWeiboSnapshot> getWeiboSnapshotList() {
        return weiboSnapshotList;
    }

    public void setWeiboSnapshotList(List<OpinionWeiboSnapshot> weiboSnapshotList) {
        this.weiboSnapshotList = weiboSnapshotList;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }
}
