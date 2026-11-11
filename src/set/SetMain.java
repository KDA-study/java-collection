package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    static void main(String[] args) {
        // set은 중복을 허용하지 않는 자료구조이다.
        // ex> 로또번호, 최근본상품
        // set은 순서를 보장하지 않아요.
        Set<String> fruits = new HashSet<>(Arrays.asList("apple", "banana"));
        // .set() 없음 -> 수정 안 됨, 삭제만 가능
        fruits.add("grape");
        fruits.add("mango");
        fruits.add("banana");
        System.out.println("과일바구니 사이즈 : "+fruits.size());    // 4
        System.out.println("============================================");
        for (String f : fruits) {
            System.out.println(f);
        }

    }
}
