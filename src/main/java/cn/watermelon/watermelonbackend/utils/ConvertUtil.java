package cn.watermelon.watermelonbackend.utils;

import cn.watermelon.watermelonbackend.dto.CommentResponseDTO;
import cn.watermelon.watermelonbackend.entity.Comment;

import java.util.ArrayList;
import java.util.List;

public class ConvertUtil {

        public static List<CommentResponseDTO> prs2Subs(List<Comment> list) {
            List<CommentResponseDTO> result = new ArrayList<>();
            if (list != null) {
                for (Comment comment : list) {
                    result.add(new CommentResponseDTO(comment));
                }
            }
            return result;
        }

}
