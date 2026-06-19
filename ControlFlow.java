package Test_01;

public class TEST0 {
    public static void main(String[] args) {
        
        // 배열을 이용하여 학생 성적데이터 입
        int[] scores = {95, 82, 74, 61, 48};
        
        // 반복문(for): scores.length크기 만큼 반
        for (int i = 0; i < scores.length; i++) {
            
            int score = scores[i]; // 현재 순서의 학생 점수
            char grade;            // 등급을 저장할 변수
            
            // 조건문(if-else if-else): 점수 구간별로 등급 나누기
            if (score >= 90) {
                grade = 'A';
            } else if (score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 'C'; 
            } else if (score >= 60) {
                grade = 'D';
            } else {
                grade = 'F'; // 60점 미만은 모두 F 학점
            }
            
            
//         //  switch-case문: 점수를 10으로 나눈 몫을 구합니다. (예: 95 / 10 = 9)
//            // int(정수)끼리 나누면 소수점은 버려집니다.
//            int quotient = score / 10;
//            
//            // 조건문(switch-case): 10의 자리 숫자에 따라 등급 분류
//            switch (quotient) {
//                case 10: // 100점인 경우 (100 / 10 = 10)
//                case 9:  // 90점대인 경우 (95 / 10 = 9)
//                    grade = 'A';
//                    break; // 해당 학점을 구했으니 switch문을 탈출합니다.
//                    
//                case 8:  // 80점대인 경우
//                    grade = 'B';
//                    break;
//                    
//                case 7:  // 70점대인 경우
//                    grade = 'C';
//                    break;
//                    
//                case 6:  // 60점대인 경우
//                    grade = 'D';
//                    break;
//                    
//                default: // 위의 케이스에 모두 해당하지 않는 경우 (50점대 이하)
//                    grade = 'F';
//                    break;
//            }
            
            // 4. 결과 출력
            System.out.println((i + 1) + "번 학생의 점수는 " + score + "점이며, 등급은 " + grade + "입니다.");
        }
    }
}
