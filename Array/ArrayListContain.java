// 배열의 요소를 로직을 통해 중복 제거
// contains을 사용

package main.java;

import java.util.ArrayList;

public class test {

    public static void main(String[] args) {

        String[] goodsList = {"notebook", "TV", "monitor", "keyboard", "mouse", "TV", "monitor", "keyboard"};
        ArrayList<String> arrayList = new ArrayList<>();

        for(String item : goodsList){
            if(!arrayList.contains(item))
                arrayList.add(item);
        }

        System.out.println(arrayList);
        //결과 = [notebook, TV, monitor, keyboard, mouse]
    }


}
