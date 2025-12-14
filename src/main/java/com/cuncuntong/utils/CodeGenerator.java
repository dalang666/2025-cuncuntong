package com.cuncuntong.utils;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.VelocityTemplateEngine;

import java.util.Collections;

/**
 * MyBatis Plus代码生成器
 * 根据数据库表结构自动生成Entity、Mapper、Service、Controller等代码
 */
public class CodeGenerator {

    // 数据库连接信息
    private static final String DB_URL = "jdbc:mysql://rm-bp19tc4k2wfy3o741fo.mysql.rds.aliyuncs.com:3306/dm?useUnicode=true&characterEncoding=utf8&serverTimezone=Asia/Shanghai&autoReconnect=true&allowMultiQueries=true&useSSL=false&nullCatalogMeansCurrent=true";
    private static final String DB_USERNAME = "dmp";
    private static final String DB_PASSWORD = "Liuhaiyang@1234";
    
    // 包路径配置
    private static final String PACKAGE_NAME = "com.cuncuntong";
    private static final String OUTPUT_DIR = "src\\main\\java";

    public static void main(String[] args) {
        FastAutoGenerator.create(DB_URL, DB_USERNAME, DB_PASSWORD)
                .globalConfig(builder -> { 
                    builder.author("baomidou") // 设置作者
                            .outputDir(OUTPUT_DIR) // 指定输出目录
//                            .enableSwagger() // 开启 swagger 模式
//                            .enableKotlin() // 开启 Kotlin 模式
                            .commentDate("yyyy-MM-dd"); // 开启注释日期
                })
                .packageConfig(builder -> {
                    builder.parent(PACKAGE_NAME) // 设置父包名
                            .controller("controller") // Controller包名
                            .service("service") // Service包名
                            .serviceImpl("service.impl") // ServiceImpl包名
                            .mapper("mapper") // Mapper包名
                            .entity("entity.po") // Entity包名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "src/main/resources/mapper")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude() // 设置需要生成的表名，多个表名传入数组
                            .controllerBuilder()
                            .enableRestStyle() // 开启生成@RestController 控制器
                            .serviceBuilder()
                            .formatServiceFileName("%sService") // service接口名称
                            .formatServiceImplFileName("%sServiceImpl") // service实现类名称
                            .entityBuilder()
                            .enableLombok() // 开启lombok
                            .logicDeleteColumnName("deleted") // 逻辑删除字段
                            .mapperBuilder()
                            .enableMapperAnnotation() // 开启@Mapper注解
                            .enableBaseColumnList() // 启用 BaseColumnList
                            .enableBaseResultMap(); // 启用 BaseResultMap
                })
                .templateEngine(new VelocityTemplateEngine()) // 使用Velocity引擎模板
                .execute(); // 执行
    }
}