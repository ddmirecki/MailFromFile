package pl.sda;

import com.google.common.base.Charsets;
import com.google.common.base.Strings;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-01-10.
 */
public class FileReader {

    public static void main(String[] args) throws IOException {


        List<String> strings1 = Files.readLines(new File("C://mail.txt"), Charsets.UTF_8);

        System.out.println(strings1);
    }
}
