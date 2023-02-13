package java01.thread.waitlock;

import java.util.ArrayList;

public class Table {
    String[] dishNames = {"도넛", "도넛", "버거"};
    final int MAX_FOOD = 6; // 테이블에 놓을 수 있는 최대 음식의 개수

    private ArrayList<String> dishes = new ArrayList<>();

    // 테이블에 음식 추가
    public void add(String dish) {
        // 테이블에 음식이 가득 찼으면 추가하지 않는다
        if (dishes.size() >= MAX_FOOD) {
            return;
        }

        dishes.add(dish);
        System.out.println("Dishes : " + dishes.toString());
    }

    // 테이블에서 음식 제거
    public boolean remove(String dishName) {
        // 지정된 요리와 일치하는 요리를 테이블에서 제거
        for (int i=0; i < dishes.size(); i++) {
            if(dishName.equals(dishes.get(i))) {
                dishes.remove(i);
                return true;
            }
        }
        return false;
    }

    public int dishNum() {
        return dishNames.length;
    }

}
