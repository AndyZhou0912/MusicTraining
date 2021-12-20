package com.wnxy.musicdemo.mapper;

import com.wnxy.musicdemo.entity.Music;
import com.wnxy.musicdemo.util.DateUtilFormat;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class MusicMapperTest {
    private static MusicMapper mapper;

    @BeforeClass
    public static void setUpMybatisDatabase() {
        SqlSessionFactory builder = new SqlSessionFactoryBuilder().build(MusicMapperTest.class.getClassLoader().getResourceAsStream("mybatisTestConfiguration/MusicMapperTestConfiguration.xml"));
        //you can use builder.openSession(false) to not commit to database
        mapper = builder.getConfiguration().getMapper(MusicMapper.class, builder.openSession(true));
    }

    @Test
    public void testSelectByPrimaryKey() {
        Music music = mapper.selectByPrimaryKey(1);
        System.out.println(music);
    }

    @Test
    public void testUpdateByPrimaryKeySelective() {
        Music music = new Music();
        music.setId(4);
        music.setSongname("EZ4ENCE");
        music.setSinger("");
        music.setPlaycount(0);
        music.setCollectcount(0);
        music.setPlaytime("");
        music.setUrl("https://bucketworkspace.oss-cn-shanghai.aliyuncs.com/image-20211119233802549.png");
        music.setStatus(1);


        int rows = mapper.updateByPrimaryKeySelective(music);
        System.out.println(rows > 0 ? "成功" : "失败");
    }

    @Test
    public void testInsertSelective() {
        Music music = new Music();
        music.setSongname("EZ4ENCE");
        music.setSinger("");
        music.setIssuedate(new Date());
        music.setPlaycount(0);
        music.setCollectcount(0);
        music.setPlaytime("");
        music.setUrl("");
        music.setStatus(0);
        int rows = mapper.insertSelective(music);
        System.out.println(rows > 0 ? "添加成功" : "添加失败");
    }

    @Test
    public void testFindMusics() {
        String singerName = "赵";
        String date1 = "2021-11-22";
        Date date2 = DateUtilFormat.parseDate(date1);
        System.out.println(date2);
        List<Music> list = mapper.findMusics(singerName, date2);
        list.forEach(System.out::println);
    }

    @Test
    public void testSelectAll() {
        List<Music> list = mapper.selectAll();
        list.forEach(System.out::println);
    }
}
