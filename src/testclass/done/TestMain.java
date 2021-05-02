package testclass.done;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

    public static void main(String[] args) {

//        String para="SMS Messages are really short";
        String para="SMS SMS SMS SMS SMS";

        int len=3;

        String[] s=para.split(" ");

        List<String> paras=new ArrayList<>();
        String currentPara="";

        for (int i=0;i<s.length;i++){

            String temp=currentPara + s[i];
            if (temp.length()>len){
                paras.add(currentPara.trim());
                currentPara=s[i];
            }else {
                currentPara=currentPara+" "+s[i];
            }
        }

        if (!currentPara.isEmpty()){
            paras.add(currentPara.trim());
        }

        paras.forEach(System.out::println);

    }
}
