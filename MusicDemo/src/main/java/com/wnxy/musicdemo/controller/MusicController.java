package com.wnxy.musicdemo.controller;

import com.github.pagehelper.PageInfo;
import com.wnxy.musicdemo.entity.Music;
import com.wnxy.musicdemo.service.MusicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * 音乐控制器
 *
 * @author AndyZhou
 * @date 2021-11-22 13:24:09
 */
@RestController
@RequestMapping("/music")
public class MusicController {
    private MusicService musicService;
    @Autowired
    public void setMusicService(MusicService musicService) {
        this.musicService = musicService;
    }

    /**
     * 日志记录器
     */
    private final Logger logger = LoggerFactory.getLogger(MusicController.class);

    /**
     * 通过id找到音乐
     *
     * @param id id
     * @return {@link ModelAndView}
     */
    @RequestMapping("/music")
    public ModelAndView findMusicById(Integer id) {
        ModelAndView mv = new ModelAndView("music/music.html");
        return mv;
    }

    /**
     * 发现音乐
     *
     * @param pageNum    页面num
     * @param singer 歌手的名字
     * @param issuedate  issuedate
     * @return {@link PageInfo}<{@link Music}>
     */
    @ResponseBody
    @GetMapping("/musicPage")
    public PageInfo<Music> findMusic(@RequestParam(value = "pageNum", required = true, defaultValue = "1") Integer pageNum,
                                     @RequestParam("singer") String singer,
                                     @RequestParam("issuedate") String issuedate) {
        return musicService.findMusic(pageNum, singer, issuedate);
    }
}
