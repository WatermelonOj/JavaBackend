package cn.watermelon.watermelonbackend.service;

import cn.watermelon.watermelonbackend.entity.Problem;
import org.springframework.stereotype.Service;

import java.util.List;
public interface ProblemService {
    List<Problem> findAll();
    List<Problem> findProblemByName(String name);
    List<Problem> findProblemById(int id);
}
