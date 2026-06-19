package Test_01;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//파일 읽기와 예외 처리 (FileIOExceptionExam.java)
public class TEST1 {
	public static void main(String[] args) {
        System.out.println("--- 예외처리 및 입출력 예제 ( 자동 자원 반환 검증 )---");

        // try(...) 안에 스트림을 선언하면 사용 후 자동으로 close()가 호출 (try-with-resources)
        // 파일 입출력은 컴파일러가 예외 처리를 강제하므로 try-catch가 필수
        // BufferedReader: 문자 입력 스트림을 버퍼링하여 읽기 성능을 크게 향상시키는 클래스 (scanner보다 빠름 ) 
        // FileReader: 파일 시스템에 접근할 권한
        
        
        try (BufferedReader br = new BufferedReader(new FileReader("JAVA.txt"))) {
            // 파일에 있 텍스트를 잠시 담아둘 주머니 역
        	String line;
        	// br.readLine(): 메모장에서 글자 한 줄을 읽어옴 
        	
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            // IOException e : 입력과 출력 과정에 생긴 예외 또는 예러 
        } catch (IOException e) {
            // [예외 가로채기] 파일이 없거나 읽기 오류가 발생했을 때 프로그램이 죽지 않도록 수습합니다.
            System.out.println("⚠️ [시스템 안내] 읽을 파일이 존재하지 않거나 입출력 오류가 발생했습니다.");
            System.out.println("🛑 에러 원인 메시지: " + e.getMessage());
            
            // 이 명령어를 넣으면 밑에 코드가 뭐든 간에 프로그래밍을 그 자리에서 즉시 종료합니다.
          // System.exit(0);
           
        }

        System.out.println("▶ 프로그램이 강제 종료되지 않고 안전하게 끝까지 실행되었습니다.");
    }

}

