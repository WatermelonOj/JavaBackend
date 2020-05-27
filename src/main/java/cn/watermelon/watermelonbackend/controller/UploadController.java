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
    public boolean uploadInputAndOutput(@PathVariable("filename") String fileName,
                                        @RequestParam("file") MultipartFile file,@RequestParam("type") String type,@RequestParam("id") int id) {
        if(file != null) {
            String filePath = "../problem/" + Integer.toString(id) + "/" + type;
            if (Upload.getInstance().uploadFileInPath(file, fileName, filePath)) {
                return true;
            }
        }
        return false;
    }
    @RequestMapping(value = "/uploadimg/{filename}",method = RequestMethod.POST)
    public boolean uploadUserImg(@PathVariable("filename") String fileName, @RequestParam("file") MultipartFile file ,@RequestParam("id") int id)
    {
        if(file != null)
        {
            String filePath = "../Img/" + Integer.toString(id) + "/";
            if (Upload.getInstance().uploadFileInPath(file, fileName, filePath)) {
                return true;
            }
        }
        return false;
    }
    @RequestMapping(value = "/uploadbackground/{filename}",method = RequestMethod.POST)
    public boolean uploadUserBackGroud(@PathVariable("filename") String fileName, @RequestParam("file") MultipartFile file ,@RequestParam("id") int id)
    {
        if(file != null)
        {
            String filePath = "../BackGround/" + Integer.toString(id) + "/";
            if (Upload.getInstance().uploadFileInPath(file, fileName, filePath)) {
                return true;
            }
        }
        return false;
    }
}
