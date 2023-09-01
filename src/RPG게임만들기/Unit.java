package RPG게임만들기;

    abstract public class Unit {
        protected String name; // 캐릭터 이름 설정
        protected int pPower; // 피지컬 Power (물리적인 힘)
        protected int mPower; // 매지컬 Power (마법의 힘)
        protected double pHit; // 물리 적중률
        protected double mHit; // 마법 적중률
        protected int ultraPower; // 궁극기 (해당 캐릭터가 가진 특수 능력)
        protected int hp; // 체력
    }
    // 실제 기능 구현 없고, 상속 받은 클래스 반드시 해당 메소드를 완성해줘야 함
// 자바는 다중 상속이 불가능 하지만 인터페이스를 이용하여 다중 상속처럼 사용 가능 하도록 해줌
    interface GameAction {
        double pAttack(); // 구현부가 없고 선언만 있음, 상속 받은 클래스 구현해줘야 함
        double mAttack(); // 마법 공격력
        int ultimate(); // 궁극의 기술로 입히는 공격량(?)
        // 반환 타입이 boolean 이유는 캐릭터의 아직살아 있는지 판별하기 위해서
        // 남아 있는 hp보다 damage가 크면 true를 반환(즉 죽었다는 의미)
        boolean setDamage(double damage); // 피해를 받는량
    }

 class Character extends Unit implements GameAction {
    // name : 캐릭터 이름
    // pP : 물리 힘
    // mP : 마법 힘
    // pH : 물리 적중률
    // mH : 마법 적중률
    // ultra : 특수 기술에 대한 공격력
    // hp : 체력
    // 캐릭터가 가지는 기본적인 능력치를 생성자를 통해서 결정 함 (캐릭터간의 밸런스를 맞춤)
    public Character(String name, int pP, int mP, double pH, double mH, int ultra, int hp) {
        this.name = name; // this 는 자신의 객체를 참조하는 참조 변수 임.
        this.pPower = pP;
        this.mPower = mP;
        this.pHit = pH;
        this.mHit = mH;
        this.ultraPower = ultra;
        this.hp = hp;
    }

    @Override
    // 물리 공격력 :물리적인 힘 * 원래는 확률로 계산하는게 원칙이지만 코드를 간단하기 위해서
    public double pAttack() {
        return pPower * pHit;
    }

    @Override
    // 마법 공격력
    public double mAttack() {
        return mPower * mHit;
    }

    @Override
    // 궁극기 : 특수 능력
    public int ultimate() {
        return ultraPower;
    }

    @Override
    // 해당 캐릭터가 공격을 받아서 받는 피해량 반영 함
    public boolean setDamage(double damage) {
        if(hp > damage) {
            hp -= damage;
            System.out.println("남아 있는 " + name + "의 체력은 " + hp + "입니다.");
            return false; // false 는 캐릭터가 살아 있음을 의미 함.
        } else {
            System.out.println(name + "이 죽었습니다. 게임을 종료 합니다.");
            return true;
        }
    }
}
    class GameThA extends Thread {
    private Character warrior; // 외부에서 접근 허용을 막기 위해 private 설정
    private Character wizard; // Character 클래스로 참조 변수를 생성

    // 생성자 호출 시 매개변수로 생성된 캐릭터의 객체를 넘겨 받음
    public GameThA(Character warrior, Character wizard) {
        this.warrior = warrior; // 매개변수로 넘겨 받은 객체를 인스턴스 필드 변수에 넘겨 줌
        this.wizard = wizard;
    }

    @Override // 생략 해도 됨, 어노테이션을 널어주는 이유는 컴파일 시 체크를 위함
    public void run() {
        int normal; // 일반공격에 대한 확률 구하기
        int special; // 특수 공격에 대한 확률 구하기
        boolean endGame = false; // 게임의 진행 여부 판단하는 플래그
        while(true) { // 해당 쓰레드를 무한 반복하도록 만듬
            try {
                sleep(3000); // 게임의 진행 속도를 맞추기 위함. (3초 대기)
                normal = (int)(Math.random() * 2); // 50% 확률을 구한다.
                special = (int)(Math.random() * 20); // 5% 확률을 구함.
                if(normal == 1) { // normal 은 0/1 만 있음
                    System.out.println("물리 공격 : " + wizard.name + "에게"
                            + warrior.pAttack() + "데미지를 입혔습니다.");
                    endGame = wizard.setDamage(warrior.pAttack());
                } else {
                    System.out.println("마법 공격 : " + wizard.name + "에게"
                            + warrior.mAttack() + "데미지를 입혔습니다.");
                    endGame = wizard.setDamage(warrior.mAttack());
                }
                if(special == 10) { // 10이라는 값이 나올 확률은 1/20 이다.
                    System.out.println(warrior.name + " 궁극기 발동 !!!, "
                            + wizard.name + "에게" + warrior.ultimate() +
                            "데미지를 입혔습니다.");
                    endGame = wizard.setDamage(warrior.ultimate());
                }
                if(endGame) {
                    System.exit(0);
                }

            } catch (InterruptedException e) {
            }
        }
    }
}
 class GameThB extends Thread {
    private Character warrior; // 외부에서 접근 허용을 막기 위해 private 설정
    private Character wizard; // Character 클래스로 참조 변수를 생성

    // 생성자 호출 시 매개변수로 생성된 캐릭터의 객체를 넘겨 받음
    public GameThB(Character warrior, Character wizard) {
        this.warrior = warrior; // 매개변수로 넘겨 받은 객체를 인스턴스 필드 변수에 넘겨 줌
        this.wizard = wizard;
    }
    @Override
    public void run() {
        int normal; // 일반공격에 대한 확률 구하기
        int special; // 특수 공격에 대한 확률 구하기
        boolean endGame = false; // 게임의 진행 여부 판단하는 플래그
        while(true) { // 해당 쓰레드를 무한 반복하도록 만듬
            try {
                sleep(3300);
                normal = (int)(Math.random() * 2);
                special = (int)(Math.random() * 18);
                if(normal == 1) {
                    System.out.println("마법 공격 : " + warrior.name + " 에게" +
                            wizard.mAttack() + " 데미지를 입혔습니다.");
                    endGame  = warrior.setDamage(wizard.mAttack());
                } else {
                    System.out.println("물리 공격 : " + warrior.name + " 에게" +
                            wizard.pAttack() + " 데미지를 입혔습니다.");
                    endGame  = warrior.setDamage(wizard.pAttack());
                }
                if(special == 10) { // 1/18 확률로 발동
                    System.out.println(wizard.name + " 궁극기 발동 !!!!, "
                            + warrior.name + "에게" + wizard.ultimate()
                            + "데미지를 입혔습니다.");
                    endGame = warrior.setDamage(wizard.ultimate());
                }
                if(endGame) System.exit(0);
            } catch (InterruptedException e) {
            }
        }
    }
}