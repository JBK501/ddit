package kr.or.ddit.study09;

import java.util.HashMap;

import kr.or.ddit.study09.ClassA.ClassB;
import kr.or.ddit.study09.ClassA.ClassC;

public class ClassD {
	public static void main(String[] args) {
		
		ClassA ca = new ClassA();
		ClassB cb = ca.new ClassB();
		System.out.println(cb.a);
		
		
		ClassC cc = new ClassA.ClassC();
		System.out.println(cc.b);
		
		HashMap h = new HashMap();
	}
}
