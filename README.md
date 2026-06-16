# OOP_JAVA_Study


## Chapter 2. 변수 
### 변수(Variable)
변수: 하나의 값을 저장할 수 있는 **기억공간**

* 기본형 (Primitive type)

   * 8개(boolean, char, byte, short, int, lonh, float, double)
   * 실제 값을 저장
 
* 참조형 (Referemce type)
   * 기본형을 제외한 나머지 (String, System 등)
   * 객체의 주소를 저장 (4 bype, 0x00000000~ 0xffffffff)

논라형 - true와 false중 하나를 값으로 갖으며, 조건식과 논리적 계산에 사용된다.

문자형 - 문자를 저장하는데 사용되먀, 변수 당 하나의 문자만을 저장할 수 있다

정수형 - 정수 값을 저장하는데 사용된다. 주로 사용하는 것은 int와 long이며, byte는 이진데이터를 다루는데 사용되며, short은 c언어와 호환을 위해 추가되었다.

실수형 - 실수 값을 저장하는데 사용된다. float와 double이 있다. 

| 종류 \ 크기 |1|2|4|8|
| :---: | :---: | :---: | :---: | :---: |
| 논리형 | boolean | - | - | - |
| 문자형 | - | char | - | - |
| 정수형 | byte | short | int | long |
| 실수형 | - | - | float | double |
<img width="1024" height="400" alt="1024" src="https://github.com/user-attachments/assets/adaa68c4-3520-4a9a-8b6b-5117a8cc4437" />

*출처:https://codegym.cc/ko/quests/lectures/ko.questsyntax.level10.lecture03*

-------------------------------------------------
### 정수의 오버플로우 (Overflow)
byte b =128; --> 에러 발생

byte타입의 최대 크기가 127이기 때문에 출력은 -128로 출력함. 
*최대값이 최소값을 버뀌게 됨.*

<img width="772" height="426" alt="image" src="https://github.com/user-attachments/assets/ef375e0c-9017-4224-9097-5f729d80533b" />

*출처:자바의 정석*

-------------------------------------------------
### 형변환

 * 값의 타입을 다른 타입으로 변환하는 것이다.
 * boolean을 제외한 7개의 기본형은 서로 형변환이 가능하다.

| 변환 | 수식 | 결과 |
| :--: | :--: | :--: |
|int -> char | (char) 65 | 'A' |
|char -> int | (int) 'A' | 65 |
|float -> int | (int) 1.6f | 1 |
|int -> float | (float) 10 | 10.0f |

1. byte -> int

byte b =10

int i = (int) b; // 생략가능


2. int -> byte

int i2 =300

byte b2 = (byte)i2; // 생략불가

 * 크기가 작은 타입에서 큰 타입으로 변환하는 경우에는 형변환을 생략가능
 * 큰 타입에서 작은 타입으로 변환한 경우에는 값손실이 발생할 수 있지만 작은 타입에서 큰 타입으로 변환하는 경우에는 값손실이 발생하지 않기 때문에 형변환을 자동적으로 수행하도록 허용하는 것입니다. 


-------------------------------------------------



-------------------------------------------------

## 💻주차별 학습 및 실습 코드

| 주차 | 학습 내용 | 소스 코드 및 정리 | 상태 |
| :---: | :--- | :--- | :---: |
| 1주차 | 객체지향의 개요 | [이론 정리 노트](./Lecture-Notes/Week01.md) | ✅ 완료 |
| 2주차 | 클래스와 객체 (Class & Object) | [실습 코드 이동](./Practice/Week02/Main.java) | ✅ 완료 |
| 3주차 | 캡슐화 (Encapsulation) | [과제 소스 보기](./Assignments/Assignment1/) | ✅ 완료 |



**글자를 굵게 강조할 때 (볼드)**
*글자를 기울이고 싶을 때 (이탤릭)*
~~내용을 취소하고 싶을 때 (취소선)~~

* 객체지향 프로그래밍의 특징
  * 캡슐화 (Encapsulation)
  * 상속 (Inheritance)
