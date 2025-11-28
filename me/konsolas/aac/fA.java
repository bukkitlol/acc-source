/*    */ package me.konsolas.aac;
/*    */ 
/*    */ import aacinternal.v;
/*    */ import java.lang.invoke.MethodHandles;
/*    */ import java.util.Arrays;
/*    */ 
/*    */ public class fa extends AbstractList {
/*    */   private final Object[] b;
/*    */   
/* 10 */   public fa(int paramInt) { this.b = new Object[paramInt]; } private int a; private static final long c = nc.a(-4095865265576864834L, -1628688246306298892L, MethodHandles.lookup().lookupClass()).a(75771966598364L); public int size() {
/* 11 */     return this.b.length;
/*    */   }
/*    */   
/*    */   public Object a() {
/*    */     return get(this.b.length - 1);
/*    */   }
/*    */   
/*    */   public void a() {
/*    */     Arrays.fill(this.b, (Object)null);
/*    */   }
/*    */   
/*    */   public boolean add(Object paramObject) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/fa.c : J
/*    */     //   3: ldc2_w 48608310325287
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: ldc2_w -2018149562489445282
/*    */     //   11: lload_2
/*    */     //   12: <illegal opcode> w : (JJ)[Ljava/lang/String;
/*    */     //   17: aload_0
/*    */     //   18: getfield b : [Ljava/lang/Object;
/*    */     //   21: aload_0
/*    */     //   22: dup
/*    */     //   23: getfield a : I
/*    */     //   26: dup_x1
/*    */     //   27: iconst_1
/*    */     //   28: iadd
/*    */     //   29: putfield a : I
/*    */     //   32: aload_1
/*    */     //   33: aastore
/*    */     //   34: astore #4
/*    */     //   36: aload_0
/*    */     //   37: getfield a : I
/*    */     //   40: aload #4
/*    */     //   42: ifnull -> 85
/*    */     //   45: aload_0
/*    */     //   46: getfield b : [Ljava/lang/Object;
/*    */     //   49: arraylength
/*    */     //   50: if_icmpne -> 84
/*    */     //   53: goto -> 66
/*    */     //   56: ldc2_w -2055526336902398426
/*    */     //   59: lload_2
/*    */     //   60: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   65: athrow
/*    */     //   66: aload_0
/*    */     //   67: iconst_0
/*    */     //   68: putfield a : I
/*    */     //   71: goto -> 84
/*    */     //   74: ldc2_w -2055526336902398426
/*    */     //   77: lload_2
/*    */     //   78: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   83: athrow
/*    */     //   84: iconst_1
/*    */     //   85: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #8	-> 17
/*    */     //   #1	-> 36
/*    */     //   #12	-> 66
/*    */     //   #2	-> 84
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   36	53	56	aacinternal/v
/*    */     //   45	71	74	aacinternal/v
/*    */   }
/*    */   
/*    */   public Object get(int paramInt) {
/*    */     return this.b[(this.a + paramInt) % this.b.length];
/*    */   }
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\fa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */