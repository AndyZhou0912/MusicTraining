package com.wnxy.musicdemo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@ApiModel(value = "tb_music")
public class Music implements Serializable {
    /**
     * 主键
     */
    @ApiModelProperty(value = "主键")
    private Integer id;

    /**
     * 歌曲名称
     */
    @ApiModelProperty(value = "歌曲名称")
    private String songname;

    /**
     * 歌手名称
     */
    @ApiModelProperty(value = "歌手名称")
    private String singer;

    /**
     * 发行日期
     */
    @ApiModelProperty(value = "发行日期")
    private Date issuedate;

    /**
     * 播放次数
     */
    @ApiModelProperty(value = "播放次数")
    private Integer playcount;

    /**
     * 收藏次数
     */
    @ApiModelProperty(value = "收藏次数")
    private Integer collectcount;

    /**
     * 歌曲时长
     */
    @ApiModelProperty(value = "歌曲时长")
    private String playtime;

    /**
     * 歌曲mp3的url地址
     */
    @ApiModelProperty(value = "歌曲mp3的url地址")
    private String url;

    /**
     * 是否收藏 txt-已收藏 0-未收藏
     */
    @ApiModelProperty(value = "是否收藏 txt-已收藏 0-未收藏")
    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSongname() {
        return songname;
    }

    public void setSongname(String songname) {
        this.songname = songname;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public Date getIssuedate() {
        return issuedate;
    }

    public void setIssuedate(Date issuedate) {
        this.issuedate = issuedate;
    }

    public Integer getPlaycount() {
        return playcount;
    }

    public void setPlaycount(Integer playcount) {
        this.playcount = playcount;
    }

    public Integer getCollectcount() {
        return collectcount;
    }

    public void setCollectcount(Integer collectcount) {
        this.collectcount = collectcount;
    }

    public String getPlaytime() {
        return playtime;
    }

    public void setPlaytime(String playtime) {
        this.playtime = playtime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", songname=").append(songname);
        sb.append(", singer=").append(singer);
        sb.append(", issuedate=").append(issuedate);
        sb.append(", playcount=").append(playcount);
        sb.append(", collectcount=").append(collectcount);
        sb.append(", playtime=").append(playtime);
        sb.append(", url=").append(url);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Music other = (Music) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getSongname() == null ? other.getSongname() == null : this.getSongname().equals(other.getSongname()))
                && (this.getSinger() == null ? other.getSinger() == null : this.getSinger().equals(other.getSinger()))
                && (this.getIssuedate() == null ? other.getIssuedate() == null : this.getIssuedate().equals(other.getIssuedate()))
                && (this.getPlaycount() == null ? other.getPlaycount() == null : this.getPlaycount().equals(other.getPlaycount()))
                && (this.getCollectcount() == null ? other.getCollectcount() == null : this.getCollectcount().equals(other.getCollectcount()))
                && (this.getPlaytime() == null ? other.getPlaytime() == null : this.getPlaytime().equals(other.getPlaytime()))
                && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
                && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, songname, singer, issuedate, playcount, collectcount, playtime, url, status);
    }
}