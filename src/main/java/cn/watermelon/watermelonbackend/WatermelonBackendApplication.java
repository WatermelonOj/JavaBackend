package cn.watermelon.watermelonbackend;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(exclude = MongoAutoConfiguration.class)
@MapperScan("cn.watermelon.watermelonbackend.mapper")

public class WatermelonBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(WatermelonBackendApplication.class, args);
    }

}
