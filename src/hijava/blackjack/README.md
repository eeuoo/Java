
## Java Blackjack Project
블랙잭 카드 게임을 자바로 구현한 프로젝트입니다. 간단한 룰은 아래와 같습니다.

< Rules >

Dealer(Computer) & Player   
총 13 * 4 개 카드(Spade, Diamond, Heart, Clover)    
J, Q, K는 모두 10 으로 계산.     
A 카드는 1 또는 11 선택 가능.    
21에 가까운 사람이 승리 (단, 21 초과시 패)   
Dealer(Computer)는 17보다 작을 경우만 카드 추가됨.    
Player는 본인 의지대로 카드 추가 및 중지 가능.    
Card, Deck, Dealer, Player등의 Object 들은 Class로 작성    

<br>

![blackjack](https://user-images.githubusercontent.com/44750085/54094281-280ba600-43e3-11e9-8a3f-69c91c55d957.png)

<br>

### Card
Spade, Diamond, Heart, Clover 4가지 문양에 2~10,A,Q,J,K 13가지 숫자를 조합해 4x13, 총 42개의 카드를 만듭니다.

<br>


### Deck
Card 클래스를 불러서 한 개의 Deck 인터페이스로 만듭니다.   
게임은 하나의 Deck을 고유하면서 진행되기 때문에 static으로 만듭니다.    
Deck 인터페이스를 사용하는 클래스는 Game, Dealer, Player, Blackjack 입니다.   

<br>

### Game
게임에 필요한 함수들을 만듭니다.    
카드 초기값 세팅, 자동 카드 선택, 자동 합계 계산이 있습니다.

<br>


### Dealer
Game 크래스에 있는 모든 것을 상속받습니다.

<br>


### Player
Dealer와 마찬가지로 Game 클래스를 상속받지만, 플레이어는 본인 의지대로 게임을 실행하므로, 자동 카드 선택, 자동 합계 계산은 재정의합니다.    
자동 카드 선택은 Hit or Stand로 카드를 받을지 말지 input 값을 받습니다.    
자동 합계 계산은 A가 나왔을 때 1로 할 것인지, 11로 할 것인지 input 값을 받습니다.   

<br>


### Blackjack  
게임을 진행하는 메인 플로우 클래스입니다.   
딜러와 플레이어를 생성하고, 게임이 끝나면 결과값을 비교해서 승자를 알려줍니다. 

<br>


