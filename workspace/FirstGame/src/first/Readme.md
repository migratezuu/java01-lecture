# 슈의 데이트 준비

---
<br>

# 요약 
: 슈가 원빈과 데이트를 간다!

뭐를 입지? 뭐를 챙기지? 슈의 의상을 골라주자!

의상은 클릭과 함께 '랜덤'으로 골라지며 

상황에 따른 의상에 점수가 주어진다.

점수에 따라 데이트의 성공 등급이 주어진다

높은 등급을 얻어보자..~^^…

<br>

---

# 요구사항
 **1. 경복궁**
 
	1. 의상뽑기
		
	 2. 신발 뽑기
		
	 3. 소지품 뽑기

	4. …~

	 5. 총 점수 : 80점

	 6. 성공 등급 : B

	 7. “경복궁”을 다시 진행하시겠습니까? (1, 2)

 **2. 수영장**

 **3. 스키장**

 **4. 영화관**

 **5. 놀이공원**

 **6. 공략 및 점수표**
 
 **7. 플레이 이력**
> 1번째 플레이 - 경복궁 - 점수 : 70점 : 등급 B
    
**8. 게임 종료**


<br>


---


# 플레이버튼 설명

<br>

**1. 어플리케이션에서 위와같은 메뉴를 출력한다.**
    
    1.1 상황 (1~5번)을 선택후 랜덤메소드를 통해 슈의 의상과 소지품 등을 출력한다.
    
    1.2 출력된 물건의 상황에 따른 점수도 출력된다.
    
    1.3 하단에 총 점수와 등급을 띄운다.
    
    1.4 실행 후 (’선택한 상황’ 을 다시 진행하시겠습니까? (1, 2))와 같은 게임 재생성 메세지를 생성
    
    1.5 1번 클릭시 경복궁 재실행, 아니면 메인 화면으로 돌아간다.
    
<br>

<br>

**6. 공략 및 점수표(부가적인 항목)**

	6.1 상황에 따른 공략표(의상, 소지품)을 보여준다.

	6.2 1개가 맞을경우, 2개가 맞을 경우 등 점수 환산 법을 표기

<br>

**7. 플레이 이력 **
    
    7.1 [플레이 횟수] [상황] [점수] [등급]    나열
<br>   

** 8. 게임 종료**


---

#객체구분 - 클래스명


**1. 메뉴선택 - **Application**

<br>

**2. 슈 - **Player**

<br>


**3. 상황    - **Place**
    
    1. 경복궁 - GyeongbokGung
    2. 수영장 -SwimmingPool
    3. 스키장 -SkiResort
    4. 영화관 - Theater
    5. 놀이공원 - AmusmentPart

<br>

**4. 공략 및 점수표 기제 ** AttackScore**
	
	1. Attack
    2. Score


<br>

**5. 플레이 이력 **-TotalRecord**
	
	1. Record

<br>
<br>
<br>

