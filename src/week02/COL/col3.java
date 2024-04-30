package week02.COL;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class col3 {
    public static void main(String[] args) {
        //stack 원통형
        // 통
        // 값을 넣고 빼고 조회하는 3가지
        // push , peek , pop
        // (최근 저장된 데이터들만 나열하거나 데이터 중복 처리를 막고 싶을 때 사용)

        Stack<Integer> intstack = new Stack<Integer>(); //선언 및 생성

        //요 스택이 비어있는지 아닌지를 해주는 메소드 비어져잇으면 트루 안비워져있었으면 펄스
        //요 스택이 비어있는지 아닌지를 해주는 건데  비어져잇으면 트루 안비워져있었으면 펄스
//        while (intstack.isEmpty()){
//            intstack.pop() //pop이라는 친구는 제일 나중에 들어왔던 녀석부터 나오게 하는것
//        }
        //peek 가장 늦게 들어온놈 출력
        //size 몇놈 있나?

        //queue 선입 선출형 빨대
        //add 넣기, peek조회, poll 뺴기
        //생성자가 없는 인터페이스 뭔 개소리고
        //다른 애들은 new 만들었는데
        //예는 아니다.
        Queue<Integer> intQueue = new LinkedList<>();//queue 생성 선언
        //poll 빼기 예는 뺴기를 하면 첨들어간놈이 처음으로 나온다.
        //peek 맨 첨 인된게 맨 첨으로 조회됨
        //size는 똑같이 몇놈있는지

        //set 집합 순서, 중복 없음
        //순서가 보장되지 않아서 중복하면 뒤짐
        //set은 그냥 사용할수도 있지만 hashset, treeset 등으로 사용 가능
        //예도 생성자가 없어서 3주차 가야 설명가능
        //hashset예는 생성자 있음
        //반복 하면 그냥 처냄
        //contains (i) 메서드  i를 포함하고 있니? 라는 뜻 포함하면 ture 아니면 false

        //map 키 벨류 페어 라는 점이 중요
        //키 라는 값으로 유니크 하게 보장이 되야함
        //헤쉬 트리 맵으로 으용
        //



    }
}
