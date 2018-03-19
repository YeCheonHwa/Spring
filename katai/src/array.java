import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.Validator;

import common.Constant;
import dto.LineInfoDto;

public class array {
    public static void main(String[] args) {
        

        List<List<String>> defail_list = new ArrayList<List<String>>();
       
        List<String> defailList = new ArrayList<String>();
        defailList.add("test1");
        defailList.add("test2");
        defail_list.add(defailList);
        
        List<String> defailList1 = new ArrayList<String>();
        defailList1.add("eee1");
        defailList1.add("eee2");
        defail_list.add(defailList1);
        
        List<String> defailList2 = new ArrayList<String>();
        defailList2.add("dadsfasdf1");
        defailList2.add("asdfasdf2");
        defail_list.add(defailList2);
        
        
        System.out.println(defail_list);

        List<String> FileList = new ArrayList<String>();
        FileList.addAll(fileList());
        System.out.println(FileList);

        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(Constant.SuccessFile1), "UTF-8"));
            for (int i = 0; i < defail_list.size(); i++) {
                List<String> newList = defail_list.get(i);
                for(String List : newList) {
                System.out.println("new List " + newList);
                System.out.println(List);
                bw.write(List);
                bw.write(Constant.CSV_SEPARATOR);
                }
                bw.newLine();
            }
            bw.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static List<String> fileList() {
        List<String> list = new ArrayList<String>();
        File f = new File(Constant.InputFilePath);

        if (f.isDirectory()) {
            String[] fileList = f.list();
            for (int i = 0; i < fileList.length; i++) {
                list.add(fileList[i]);
            }
        }
        return list;
    }
};
