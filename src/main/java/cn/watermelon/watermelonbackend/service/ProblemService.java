package cn.watermelon.watermelonbackend.service;

import cn.watermelon.watermelonbackend.entity.Problem;
import org.springframework.stereotype.Service;

import java.util.List;
public interface ProblemService {
    List<Problem> findAll();
    List<Problem> findProblemByName(String name);
<<<<<<< HEAD
    List<Problem> getFindProblemByName(int id);
=======
    List<Problem> findProblemById(int id);
>>>>>>> dbeed8fb9adc7adadc42aef706c68dffd03163d5
}
