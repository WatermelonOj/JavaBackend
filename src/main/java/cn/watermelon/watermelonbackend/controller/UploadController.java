package cn.watermelon.watermelonbackend.controller;

import cn.watermelon.watermelonbackend.Upload;
import org.apache.catalina.loader.ResourceEntry;
import org.apache.tomcat.util.file.ConfigurationSource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UploadController {

    private ResourceLoader resourceLoader;
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
            //fileName = "img.png";
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
    @RequestMapping(value = "/getimg")
    @ResponseBody
    public ResponseEntity<Resource  > preview(int id) throws FileNotFoundException
    {
        String url = "../Img" + Integer.toString(id) + "/" + "img.png";
        try
        {
            return ResponseEntity.ok(resourceLoader.getResource(url));
        }catch (Exception e)
        {
            return ResponseEntity.notFound().build();
        }

    }
}
