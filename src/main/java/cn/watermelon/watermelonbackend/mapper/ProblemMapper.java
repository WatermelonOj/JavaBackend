package cn.watermelon.watermelonbackend.mapper;

import cn.watermelon.watermelonbackend.entity.Problem;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
<<<<<<< HEAD
@Mapper
@Repository
public interface ProblemMapper
{
    List<Problem> findAll();
    List<Problem> findProblemById(int id);
    List<Problem> findProblemByName(String name);
=======

@Mapper
@Repository
public interface ProblemMapper {

    List<Problem> findAll();

    List<Problem> findProblemById(int id);

    List<Problem> findProblemByName(String name);

    int addProblem(Problem problem);
>>>>>>> dbeed8fb9adc7adadc42aef706c68dffd03163d5
}