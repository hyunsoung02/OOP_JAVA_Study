public class Test1 {
    public static void main(String[] args) {
        
        // if조건문은 무조건 true 또는 false의 결과가 도출되어야 한다. 
        boolean isManager = true; 
        int loginPermission = 1; 

        System.out.println("--- [1] 중첩 if문 및 switch문 검증 ---");
        
        // [if문 특징] if-else if-else 구조 및 중첩 if문 사용
        if (isManager == true) { // 결과가 boolean인 조건식
            System.out.println("🎯 관리자 권한으로 시스템에 접속합니다.");
            
          
            int securityLevel = 5;
            if (securityLevel >= 4) {
                System.out.println(" ->  보안 등급 확인 완료: 모든 메뉴 접근 가능");
            }
            
            // [switch문 특징] 조건식 결과가 int 범위 이하의 정수를 사용하어 loginPermission의 변수는 int형임. 
            // [if문과 switch문 비교] 모든 switch문은 이처럼 if문으로도 변경 가능합니다.
            switch (loginPermission) {
                case 1: // [switch문 특징] case문 값으로 변수 불가, '1'이라는 상수만 가능
                    System.out.println(" ->  관리자 설정 메뉴를 활성화합니다.");
                    break; // [switch문 특징] break를 만나 switch문을 빠져나감 (없으면 다음 case까지 진행)
                case 2:
                    System.out.println(" ->  일반 마이페이지를 활성화합니다.");
                    break;
                default: // [switch문 특징] 일치하는 case가 없을 때 (생략 가능하지만 예외 처리를 위해 작성)
                    System.out.println(" -> 알 수 없는 권한입니다.");
                    break;
            }
            
        } else {
            System.out.println(" 비회원 상태입니다.");
        }

        System.out.println("\n--- [2] 반복문 및 중첩for문, 이름 붙은 반복문 검증 ---");

        int appleStock = 5;  
        int bananaStock = 3; 

      
        FruitWarehouse: 
        for (int row = 1; row <= 3; row++) { // [for문 특징] 초기화, 조건식, 증감식으로 구성 (반복 횟수가 중요할 때)
            
            System.out.println(" 창고 " + row + "층 진열대를 점검합니다.");
            
            // [중첩 for문] for문 안에 또 다른 for문을 포함 (횟수 제한 거의 없음)
            for (int col = 1; col <= 5; col++) {
                
                // [continue문 특징] 특정 조건을 만나면 다음 반복으로 건너뜀
                if (col == 3) {
                    System.out.println("   [안내] " + col + "번 칸은 빈 칸이므로 패스합니다.");
                    continue; // 이 명령어를 만나면 아래 코드를 무시하고 'col++' 증감식으로 바로 이동함
                }
                
                System.out.println("   -> [" + row + "층 - " + col + "번 칸] 사과를 하나 출고합니다.");
                appleStock--; 
                
                // [break문 특징] 자신이 포함된 하나의 반복문을 빠져나감 (보통 if문과 함께 사용)
                if (appleStock == 0) {
                    System.out.println("    [경고] 사과 재고가 모두 소진되어 이 층의 점검을 중단합니다.");
                    break; // 이 break는 자기를 감싸고 있는 안쪽 for문 하나만 탈출합니다.
                }
            }
            
            System.out.println(" 현재 남은 바나나 재고: " + bananaStock + "개");
            bananaStock--;
            
        
            if (bananaStock < 0) {
                System.out.println(" 바나나 재고가 바닥나서 전체 창고 점검을 '통째로' 종료합니다.");
                break FruitWarehouse; // 안쪽이 아니라 바깥쪽의 FruitWarehouse 반복문을 즉시 깨뜨리고 나감
            }
        }

        System.out.println("\n--- [3] do-while문 검증 ---");
        
        int checkCount = 0;
        // [do-while문 특징] while문의 변형으로, 조건이 맞지 않아도 블록{}이 '최소한 한 번'은 무조건 수행됨
        do {
            System.out.println("🔄 최초 1회 시스템 정상 작동 여부를 강제 점검합니다. (점검 횟수: " + (checkCount + 1) + ")");
            checkCount++;
        } while (checkCount < 0); // 조건식이 처음부터 false(0 < 0)이지만, 위의 do 블록은 이미 1번 실행 완료됨

        System.out.println("\n프로그램이 안전하게 종료되었습니다.");
    }
}
