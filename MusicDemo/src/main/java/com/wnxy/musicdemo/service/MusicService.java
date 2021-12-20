package com.wnxy.musicdemo.service;

import com.github.pagehelper.PageInfo;
import com.wnxy.musicdemo.entity.Music;

/**
 * 音乐服务
 *
 * @author AndyZhou
 * @date 2021-11-22 13:37:11
 */
public interface MusicService {
    /**
     * 更新的音乐收藏
     * @param music 音乐
     * @return boolean
     */
    boolean updateMusicCollection(Music music);

    /**
     * 更新音乐播放数
     *
     * @param music 音乐
     * @return boolean
     */
    boolean updateMusicPlayCount(Music music);

    /**
     * 找到音乐id
     *
     * @param id id
     * @return {@link Music}
     */
    Music findMusicId(Integer id);


    /**
     * 发现音乐
     *
     * @param pageNum    页面num
     * @param SingerName 歌手的名字
     * @param issuedate  issuedate
     * @return {@link PageInfo}<{@link Music}>
     */
    PageInfo<Music> findMusic(Integer pageNum, String SingerName, String issuedate );
}
