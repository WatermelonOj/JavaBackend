package cn.watermelon.watermelonbackend.controller;

import cn.watermelon.watermelonbackend.Upload;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UploadController {

    @RequestMapping(value = "/uploadfile/{filename}", method = RequestMethod.POST)
    public boolean uploadImg(@PathVariable("filename") String fileName,
                                        @RequestParam("file") MultipartFile file,@RequestParam("type") String type,@RequestParam("id") int id) {
        if(file != null) {
            String filePath = "~/problem/" + Integer.toString(id) + "/" + type;
            if (Upload.uploadFileInPath(file, fileName, filePath)) {
                return true;
            }
        }
        return false;
    }
}
