package com.syntax.abstraction.class23;

public abstract class File {
    /*
    Create a class File that will have the following behaviors: open, edit, close. Edit and close
    are implemented method while open is an abstract. Create 3 subclasses: JavaFile, WordFile,
    PdfFile that will provide specific implementation of open behaviour: Example:
    to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc
     */
    abstract void open();

    void edit(){
        System.out.println("Editing a file");
    }
    void close(){
        System.out.println("closing file");
    }
}
class JavaFile extends File{
    @Override
    void open() {
        System.out.println("Use intellij to open file");
    }
}
class  WordFile extends File{
    @Override
    void open() {
        System.out.println("Use Microsoft word  to open this file ");
    }
}
class PDfFile extends File{
    @Override
    void open() {
        System.out.println("Use note pad to open files");
    }
}


