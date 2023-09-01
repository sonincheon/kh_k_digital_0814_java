package RPG게임만들기;

public class es {
    public static void main(String[] args) {
        int[] a= {1,2};
        try {
            System.out.println(a[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println(a[0]);
        }

    }

}
