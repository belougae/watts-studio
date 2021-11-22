package geektime.demo.services.elasticsearch.model;

import geektime.demo.services.elasticsearch.Constants;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.util.List;

/**
 * 索引1：db.opinion_event_info.createIndex({"type":1,"name":1,"createTime":-1})
 * 索引2：db.opinion_event_info.createIndex({"type":1,"name":1, "riseSpeed":-1})
 * 索引3：db.opinion_event_info.createIndex({"type":1,"name":1,""duration":-1})
 *
 * @author wangjing
 */
@Document(indexName = "opinion_event_info", type = Constants.EMPLOYEE_INDEX_TYPE)
public class OpinionEventInfo {
    @Id
    private String id;

    private String name;
    private String introduction;
    private String createName;
    private String type;
    private String url;
    private String pictureUrl;
    private Integer latestRank;
    private Integer latestCount;
    private Integer highestRank;
    private Integer highestCount;
    private Double riseSpeed;
    private Integer createTime;
    private Integer updateTime;
    private Integer duration;
    private List<OpinionEventMetaData> metaDataList;
    private List<OpinionWeiboSnapshot> weiboSnapshotList;

    @Transient
    private Boolean collected;
    @Transient
    private Boolean firstTime;
    @Transient
    private Boolean newHigh;
    @Transient
    private Boolean newIntroduction;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public Integer getLatestRank() {
        return latestRank;
    }

    public void setLatestRank(Integer latestRank) {
        this.latestRank = latestRank;
    }

    public Integer getLatestCount() {
        return latestCount;
    }

    public void setLatestCount(Integer latestCount) {
        this.latestCount = latestCount;
    }

    public Integer getHighestRank() {
        return highestRank;
    }

    public void setHighestRank(Integer highestRank) {
        this.highestRank = highestRank;
    }

    public Integer getHighestCount() {
        return highestCount;
    }

    public void setHighestCount(Integer highestCount) {
        this.highestCount = highestCount;
    }

    public Double getRiseSpeed() {
        return riseSpeed;
    }

    public void setRiseSpeed(Double riseSpeed) {
        this.riseSpeed = riseSpeed;
    }

    public List<OpinionEventMetaData> getMetaDataList() {
        return metaDataList;
    }

    public void setMetaDataList(List<OpinionEventMetaData> metaDataList) {
        this.metaDataList = metaDataList;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<OpinionWeiboSnapshot> getWeiboSnapshotList() {
        return weiboSnapshotList;
    }

    public void setWeiboSnapshotList(List<OpinionWeiboSnapshot> weiboSnapshotList) {
        this.weiboSnapshotList = weiboSnapshotList;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public Boolean getCollected() {
        return collected;
    }

    public void setCollected(Boolean collected) {
        this.collected = collected;
    }

    public Boolean getFirstTime() {
        return firstTime;
    }

    public void setFirstTime(Boolean firstTime) {
        this.firstTime = firstTime;
    }

    public Boolean getNewHigh() {
        return newHigh;
    }

    public void setNewHigh(Boolean newHigh) {
        this.newHigh = newHigh;
    }

    public Boolean getNewIntroduction() {
        return newIntroduction;
    }

    public void setNewIntroduction(Boolean newIntroduction) {
        this.newIntroduction = newIntroduction;
    }

}
