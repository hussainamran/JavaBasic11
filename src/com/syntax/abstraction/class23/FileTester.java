package com.syntax.abstraction.class23;

public class FileTester {
    public static void main(String[] args) {
        JavaFile javaFile=new JavaFile();
        javaFile.open();
        javaFile.close();
        javaFile.edit();

        File[]files={new JavaFile(),new WordFile(),new PDfFile()};
        for(File file:files){
            file.open();
            file.edit();
            file.close();
        }
    }
}
