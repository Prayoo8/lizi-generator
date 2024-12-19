package com.yupi;

import com.yupi.cli.CommandExecutor;
import com.yupi.model.MainTemplateConfig;
import freemarker.template.TemplateException;

import java.io.IOException;

import static com.yupi.generator.MainGenerator.doGenerate;

public class Main {

    public static void main(String[] args) throws TemplateException, IOException {
//        args = new String[]{"generate", "-l", "-a", "-o"};
//        args = new String[]{"config"};
//        args = new String[]{"list"};
//        CommandExecutor commandExecutor = new CommandExecutor();
//        commandExecutor.doExecute(args);
            MainTemplateConfig mainTemplateConfig = new MainTemplateConfig();
            mainTemplateConfig.setAuthor("yupi");
            mainTemplateConfig.setLoop(false);
            mainTemplateConfig.setOutputText("求和结果：");
            doGenerate(mainTemplateConfig);


    }
}
