/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package objSensitive;

/**
 *
 * @author genli
 * @version : TestObjSensitive2.java, v 0.1 2020年08月29日 8:43 下午 genli Exp $
 */
public class TestObjSensitive2 {

  public static void main(String[] args) {
    A a1 = new A();
    Object v1 = a1.foo(new Object());

    A a2 = new A();
    Object v2 = a2.foo(new Object());  //pts(v2) -> {O19}  && c#identity() Context
  }
}