package com.yupi.maker.generator.file;

import cn.hutool.core.io.FileUtil;

import java.io.File;

/**
 * 静态文件生成
 */
public class StaticFileGenerator {

    /**
     * 拷贝文件（Hutool 实现，会将输入目录完整拷贝到输出目录下）
     *
     * @param inputPath
     * @param outputPath
     */
    public static void copyFilesByHutool(String inputPath, String outputPath) {
        // 打印检查文件存在的日志
        System.out.println("Checking if file exists: " + inputPath);

        // 检查文件是否存在
        File inputFile = new File(inputPath);
        if (!inputFile.exists()) {
            // 如果文件不存在，打印日志并跳过
            System.out.println("Warning: File " + inputPath + " not found, skipping copy.");
            return; // 跳过文件复制
        }

        // 执行文件复制
        FileUtil.copy(inputPath, outputPath, false);
        System.out.println("Copied: " + inputPath + " to " + outputPath);
    }
}
