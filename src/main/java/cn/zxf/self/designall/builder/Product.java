package cn.zxf.self.designall.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Product
 * @Description TODO
 * @Author zxf
 * @DATE 2019/2/18
 */
public class Product {
    List<String> parts = new ArrayList<>();
    
    public void add(String part){
        System.out.println("添加的部件+" + part);
        parts.add(part);
    }

    public void show(){
        System.out.println("产品创建---");
        for (String part:parts) {
            System.out.println("部件："+ part);
    }
    }
}
