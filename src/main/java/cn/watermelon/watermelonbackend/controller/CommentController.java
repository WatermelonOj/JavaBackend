package cn.watermelon.watermelonbackend.controller;

import cn.watermelon.watermelonbackend.dto.CommentResponseDTO;
import cn.watermelon.watermelonbackend.entity.Comment;
import cn.watermelon.watermelonbackend.service.CommentService;
import cn.watermelon.watermelonbackend.utils.ConvertUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    void createComment(Integer problemId, Integer userId, String title, String content, Integer followId) {
        Comment comment = new Comment();
        comment.setProblemId(problemId);
        comment.setUserId(userId);
        comment.setTitle(title);
        comment.setContent(content);
        comment.setFollowId(followId);
        commentService.insertComment(comment);
    }
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    void deleteComment(Integer commentId) {
        commentService.deleteComment(commentId);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    List<CommentResponseDTO> getCommentsByProblemId(Integer problemId)
    {
        return ConvertUtil.prs2Subs(commentService.getCommentByProblemId(problemId));
    }
}
