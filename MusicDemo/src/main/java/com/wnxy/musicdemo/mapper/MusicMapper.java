package com.wnxy.musicdemo.mapper;

import com.wnxy.musicdemo.entity.Music;
import org.apache.ibatis.annotations.Mapper;import org.apache.ibatis.annotations.Param;import java.util.Date;import java.util.List;

@Mapper
public interface MusicMapper {
    /**
     * delete by primary key
     *
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(Music record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(Music record);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    Music selectByPrimaryKey(Integer id);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(Music record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(Music record);

    /**
     * 发现音乐
     *
     * @param singerName 歌手的名字
     * @param parseDate  解析日期
     * @return {@link List}<{@link Music}>
     */
    List<Music> findMusics(@Param("singerName") String singerName, @Param("parseDate") Date parseDate);

    /**
     * 选择所有
     *
     * @return {@link List}<{@link Music}>
     */
    List<Music> selectAll();
}