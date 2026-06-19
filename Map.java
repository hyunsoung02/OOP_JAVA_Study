package Test_01;
import java.util.HashMap;
//Map 활용 데이터 관리 (MapQuizExam.java)
public class TEST3 {

	
	public static void main(String[] args) {
        System.out.println("---HashMap 데이터 관리 및 카운팅 ---");

        // Key와 Value의 쌍으로 이루어짐. Key는 중복 불가, Value는 중복 가능.
        // String 는 글자를 입력, Integer 는 숫자를 입
        HashMap<String, Integer> fruitInventory = new HashMap<>();

        // 1. 데이터 추가 (put)
        fruitInventory.put("Apple", 5);
        fruitInventory.put("Banana", 12);
        fruitInventory.put("Orange", 8);

        // 이미 존재하는 Key에 다른 값을 다시 put하면? -> 값이 새로 덮어써짐(Update)
        fruitInventory.put("Apple", 3); 

        System.out.println("사과의 최종 재고(3이 출력되어야 함): " + fruitInventory.get("Apple") + "개");

        System.out.println("\n[전체 창고 재고 현황판]");
        // Map의 전체 데이터를 순회하며 출력하는 방법
        for (String key : fruitInventory.keySet()) {
            System.out.println(" -> 과일명: " + key + ", 재고량: " + fruitInventory.get(key) + "개");
        }
    }
}
