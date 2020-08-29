/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package objSensitive;

/**
 *
 * @author genli
 * @version : TestObjSensitive.java, v 0.1 2020年08月29日 8:29 下午 genli Exp $
 */
public class TestObjSensitive1 {

  public static void main(String[] args) {
    A a1 = new A();
    A a2 = new A();
    B b1 = new B();
    B b2 = new B();

    a1.set(b1);
    a2.set(b2);

    B b = a1.getB(); //pts{b} -> {O16}
  }
}