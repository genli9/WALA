/**
 * Alipay.com Inc. Copyright (c) 2004-2020 All Rights Reserved.
 */
package objSensitive;

/**
 *
 * @author genli
 * @version : A.java, v 0.1 2020年08月29日 8:34 下午 genli Exp $
 */
public class A {

  private B b;

  public void set(B b) {
    doSet(b);
  }

  public void doSet(B b) {
    this.b = b;
  }

  public B getB(){
    return this.b;
  }

  public Object foo(Object v) {
    B b = new B();
    return b.bar(v);
  }
}