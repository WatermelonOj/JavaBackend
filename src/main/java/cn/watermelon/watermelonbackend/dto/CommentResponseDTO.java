package cn.watermelon.watermelonbackend.dto;

import cn.watermelon.watermelonbackend.entity.Comment;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class CommentResponseDTO {

    int commentId;

    int userId;

    int problemId;

    String title;

    String content;

    Integer followId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    Date createTime;

    int BrownsingNum;
    public CommentResponseDTO(Comment comment) {
        this.commentId = comment.getCommentId();
        this.userId = comment.getUserId();
        this.problemId = comment.getProblemId();
        this.title = comment.getTitle();
        this.content = comment.getContent();
        this.followId = comment.getCommentId();
        this.createTime = comment.getCreateTime();
        this.BrownsingNum = comment.getBrowsingNum();
    }
}
