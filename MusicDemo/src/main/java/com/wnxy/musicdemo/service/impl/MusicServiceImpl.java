package com.wnxy.musicdemo.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wnxy.musicdemo.entity.Music;
import com.wnxy.musicdemo.mapper.MusicMapper;
import com.wnxy.musicdemo.service.MusicService;
import com.wnxy.musicdemo.util.DateUtilFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 音乐服务impl
 *
 * @author AndyZhou
 * @date 2021-11-22 13:37:08
 */
@Service
public class MusicServiceImpl implements MusicService {
    private MusicMapper musicMapper;
    @Autowired
    public void setMusicMapper(MusicMapper musicMapper) {
        this.musicMapper = musicMapper;
    }

    /**
     * 更新的音乐收藏
     *
     * @param music 音乐
     * @return boolean
     */
    @Override
    public boolean updateMusicCollection(Music music) {
        Integer id = music.getId();
        Integer collectcount = musicMapper.selectByPrimaryKey(id).getCollectcount();
        if(collectcount == null){
            collectcount = 0;
        }
        Integer status = music.getStatus();
        if(status==0){
            status = 1;
            music.setStatus(status);
            Integer musicCollectcount = music.getCollectcount();
            System.out.println(musicCollectcount);
            musicCollectcount = musicCollectcount +1;
            music.setCollectcount(musicCollectcount);
            return musicMapper.updateByPrimaryKeySelective(music)>0;
        }
        if(status==1){
            status =0;
            music.setStatus(status);
            Integer musicCollectcount = music.getCollectcount();
            System.out.println(musicCollectcount);
            musicCollectcount = musicCollectcount -1;
            music.setCollectcount(musicCollectcount);
            return musicMapper.updateByPrimaryKeySelective(music)>0;

        }
        return false;
    }

    /**
     * 更新音乐播放数
     *
     * @param music 音乐
     * @return boolean
     */
    @Override
    public boolean updateMusicPlayCount(Music music) {
        Integer playcount = music.getPlaycount();
        playcount = playcount+1;
        music.setPlaycount(playcount);
        return musicMapper.updateByPrimaryKeySelective(music)>0;
    }

    @Override
    public Music findMusicId(Integer id) {
        return musicMapper.selectByPrimaryKey(id);
    }

    @Override
    public PageInfo<Music> findMusic(Integer pageNum, String SingerName, String issuedate) {
        PageHelper.startPage(pageNum,5);
        if(issuedate != null && issuedate != ""){
            Date parseDate = DateUtilFormat.parseDate(issuedate);
            List<Music> list = musicMapper.findMusics(SingerName,parseDate);
        }
        List<Music> list = musicMapper.selectAll();
        return new PageInfo<>(list);
    }


}
