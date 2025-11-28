/*  1 */ package aacinternal;public class g extends NullPointerException implements aC { private static final long serialVersionUID = 20160217L; private final H b; public String a(Locale paramLocale, long paramLong) { long l = paramLong ^ 0x57A8B4C3D78AL; return a(paramLocale, this.b, this.a, l); } private final Object[] a; private static final long c = nc.a(-5933018270806769554L, -7282541087212178940L, MethodHandles.lookup().lookupClass()).a(220986965594241L); public String getLocalizedMessage() {
/*  2 */     long l1 = c ^ 0x1B596E18C255L, l2 = l1 ^ 0x1D568D3915CEL; return a(Locale.getDefault(), l2);
/*    */   } public H a() {
/*  4 */     return this.b;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public g(long paramLong, H paramH, Object[] paramArrayOfObject) {
/* 10 */     this.b = paramH;
/*    */     this.a = (paramArrayOfObject == null) ? new Object[0] : (Object[])paramArrayOfObject.clone();
/* 12 */   } public Object[] a() { return (Object[])this.a.clone(); } public String getMessage() { long l1 = c ^ 0x4EADD7E0598CL, l2 = l1 ^ 0x48A234C18E17L; return a(Locale.US, l2); }
/*    */ 
/*    */   
/*    */   public g(long paramLong) {
/*    */     this(l, P.NULL_NOT_ALLOWED, new Object[0]);
/*    */   }
/*    */   
/*    */   private static String a(Locale paramLocale, H paramH, Object[] paramArrayOfObject, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic aacinternal/g.c : J
/*    */     //   3: lload_3
/*    */     //   4: lxor
/*    */     //   5: lstore_3
/*    */     //   6: lload_3
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 30274850945357
/*    */     //   11: lxor
/*    */     //   12: lstore #5
/*    */     //   14: pop2
/*    */     //   15: aload_1
/*    */     //   16: ifnonnull -> 34
/*    */     //   19: ldc ''
/*    */     //   21: goto -> 55
/*    */     //   24: ldc2_w 66597305749939700
/*    */     //   27: lload_3
/*    */     //   28: <illegal opcode> w : (Laacinternal/g;JJ)Laacinternal/g;
/*    */     //   33: athrow
/*    */     //   34: new java/text/MessageFormat
/*    */     //   37: dup
/*    */     //   38: aload_1
/*    */     //   39: aload_0
/*    */     //   40: lload #5
/*    */     //   42: invokeinterface a : (Ljava/util/Locale;J)Ljava/lang/String;
/*    */     //   47: aload_0
/*    */     //   48: invokespecial <init> : (Ljava/lang/String;Ljava/util/Locale;)V
/*    */     //   51: aload_2
/*    */     //   52: invokevirtual format : (Ljava/lang/Object;)Ljava/lang/String;
/*    */     //   55: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #8	-> 15
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   15	24	24	aacinternal/g
/*    */   }
/*    */   
/*    */   private static g a(g paramg) {
/*    */     return paramg;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\aacinternal\g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */