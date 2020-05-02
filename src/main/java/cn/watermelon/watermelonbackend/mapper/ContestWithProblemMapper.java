package cn.watermelon.watermelonbackend.mapper;

import cn.watermelon.watermelonbackend.entity.Problem;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface ContestWithProblemMapper {
    List<Problem> findProblemByContest(int contestId);
    boolean deleteProblemFromContest(int contestId, int problemId);
    boolean deleteContest(int contestId);
}
