package Test_01;
import java.util.HashSet;
import java.util.Objects;
// lang패키지 & 컬렉션 + 오버라이딩  
// 학생 정보를 담는 데이터 클래스 정의
class Student {
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    //  Object의 equals를 오버라이딩하여 주소가 아닌 '값'을 비교하도록 수정
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // s1와 s2 비교해서 같으면 true 
        if (obj == null || getClass() != obj.getClass()) return false; //getClass(): 데이터 종류(클라스)가 같은지 확인 
        Student student = (Student) obj;
        return id == student.id && Objects.equals(name, student.name); //이름과 학번이 동일한지 비교 ( And연산비교 )  
    }

    // [중요] equals를 바꿨다면 hashCode도 세트로 바꾼다. 그래야 컬렉션(Set/Map)이 인지함
    @Override
    public int hashCode() { // hashCode():  데이터값을 빠르게 분류해주는 '주소록 번호'같은 것  
        return Objects.hash(name, id); // 이름과 학번이 같으면 무조건 똑같은 숫자가 나옴
    }
}
public class TEST2 {
	
	public static void main(String[] args) {
        System.out.println("--- equals/hashCode 오버라이딩 검증 ---");

        // HashSet: 순서가 없고 중복을 허용하지 않는 자료구조
        HashSet<Student> set = new HashSet<>();

        // 데이터가 완벽히 똑같은 두 학생 객체 생성 (하지만 메모리 주소는 다름)
        Student s1 = new Student("홍길동", 202601);
        Student s2 = new Student("홍길동", 202601);

        set.add(s1);
        set.add(s2); // 내부적으로 hashCode()와 equals()를 호출해 중복인지 판별함

        // 오버라이딩이 성공했다면 중복이 제거되어 Set의 크기는 1이 되어야 합니다.
        System.out.println("👥 저장된 총 학생 수: " + set.size() + "명 (1명이면 중복 제거 성공!)");
    }	

}
