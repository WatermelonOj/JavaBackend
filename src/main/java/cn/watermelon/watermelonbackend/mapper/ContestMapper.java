package cn.watermelon.watermelonbackend.mapper;

import cn.watermelon.watermelonbackend.entity.Contest;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface ContestMapper
{
    List<Contest> findAllContest();
    Contest findContestById(int id);
}
