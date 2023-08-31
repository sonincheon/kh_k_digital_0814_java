package 커피메뉴만들기;
// HashMap 으로 커피 메뉴 리스트 만들기
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CoffeeMenuList {
    // 문자열로 만들어진 키와 커피의 정보가 포함된 객체를 값으로 사용
    static Map<String, MenuInfo> map = new HashMap<>();
    public static void main(String[] args) {
        makeMenu();
        selectMenu();
    }
    static void makeMenu(){
        map.put("Americano",new MenuInfo("Americano",1500,"coffee","기본커피"));
        map.put("Espresso",new MenuInfo("Espresso",500,"coffee","액기스커피"));
        map.put("Latte",new MenuInfo("Latte",4500,"coffee","우유 포함 커피"));
    }
    static void selectMenu(){
        Scanner sc = new Scanner(System.in);
        String key = ""; // 키를 받기 위한 문자열 변수
        while (true){
            System.out.println("=".repeat(10) +"메뉴 리스트"+ "=".repeat(10));
            System.out.print("[1]메뉴보기 [2]메뉴조회 [3]메뉴추가 [4]메뉴삭제 [5]메뉴수정  [6]종료 : ");
            int selMenu = sc.nextInt();
            switch (selMenu){
                case 1:
                    System.out.println("=".repeat(10) +"메뉴 보기"+ "=".repeat(10));
                    for(String e : map.keySet()){
                        System.out.println("메뉴 : " +map.get(e).name);
                        System.out.println("가격 : " +map.get(e).price);
                        System.out.println("분류 : " +map.get(e).category);
                        System.out.println("설명 : " +map.get(e).description);
                        System.out.println("-".repeat(25));
                    }break;
                case 2:
                    System.out.print("조회할 메뉴를 입력 하세요 : ");
                    key = sc.next();
                    //포함여부를 확인하는 메소드 containsKey(key): map내에 해당 키가 있는지 확인하여 결과를 반환
                    if(map.containsKey(key)) {
                        System.out.println("메뉴 : " + map.get(key).name);
                        System.out.println("가격 : " + map.get(key).price);
                        System.out.println("분류 : " + map.get(key).category);
                        System.out.println("설명 : " + map.get(key).description);
                    }else System.out.println("해당 메뉴는 존재하지 않습니다."); break;
                case 3:
                    System.out.print("추가 할 메뉴를 입력 하세요 : ");
                    key = sc.next();
                    if(map.containsKey(key)){
                        System.out.println("해당 메뉴가 이미 존재 합니다.");
                    }else {
                        System.out.print("가격 입력 : ");
                        int price =sc.nextInt();
                        System.out.print("분류 입력 : ");
                        String category = sc.nextLine();
                        sc.nextLine();
                        System.out.print("설명 입력 : ");
                        String description = sc.nextLine();
                        map.put(key,new MenuInfo(key,price,category,description));
                    }break;
                case 4:
                    System.out.print("삭제할 메뉴를 선택하세요 : ");
                    key =sc.next();
                    if(map.containsKey(key)){
                        map.remove(key);
                        System.out.println(key + "메뉴를 삭제 하였습니다 . ");
                    }else {
                        System.out.println("삭제할 메뉴가 없습니다.");
                    }break;
                case 5:
                    System.out.println("수정할 메뉴를 입력하세요 : ");
                    key =sc.next();
                    if(map.containsKey(key)) {
                        System.out.print("가격 입력 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 입력 : ");
                        String category = sc.nextLine();
                        sc.nextLine();
                        System.out.print("설명 입력 : ");
                        String description = sc.nextLine();
                        map.replace(key, new MenuInfo(key, price, category, description));
                    }else {
                        System.out.println("수정 할 메뉴가 없습니다.");
                    }break;
                case 6:
                    System.out.println("메뉴를 종료합니다.");
                    return;
                default:
                    System.out.println("선택하신 메뉴가 없습니다.");
            }
        }

    }
}
