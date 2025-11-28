/*  1 */ package me.konsolas.aac;public final class hl { static final int e = 256; public static final int a = 320; public static final int d = 16720; public static fK a(cA paramcA, int paramInt) { return new em(paramcA, paramInt); }
/*    */   
/*    */   public static final int g = 321; private static final int c = 20; public static final int b = 341; public static final kN f;
/*    */   public static fK a(int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3) {
/*  5 */     fG.a(paramArrayOfint, paramInt1, paramInt2);
/*  6 */     return new jD(paramArrayOfint, paramInt1, paramInt2, paramInt3); } public static fK a(cA paramcA, long paramLong, int paramInt, kx paramkx) { return new ee(paramcA, paramLong, paramInt, paramkx); }
/*    */    public static fK a(d paramd) {
/*  8 */     return new jo(paramd);
/*  9 */   } private static final long h = nc.a(139934769461597154L, 8223267660992339604L, MethodHandles.lookup().lookupClass()).a(72472870148150L); static { f = new kN(); } public static fK a(int paramInt) {
/* 10 */     return new kK(paramInt);
/*    */   }
/* 12 */   public static fK a(jW paramjW) { return new eS(paramjW); }
/* 13 */   public static fK a(fg paramfg) { return new cP(paramfg); } public static fK a(int[] paramArrayOfint, int paramInt1, int paramInt2) {
/* 14 */     fG.a(paramArrayOfint, paramInt1, paramInt2);
/*    */     return new jD(paramArrayOfint, paramInt1, paramInt2, 0);
/*    */   }
/* 17 */   public static fK a(int paramInt1, int paramInt2) { return new kD(paramInt1, paramInt2); } public static fK a(int[] paramArrayOfint) {
/* 18 */     return new jD(paramArrayOfint, 0, paramArrayOfint.length, 0);
/*    */   }
/* 20 */   public static fK a(int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3, kx paramkx) { fG.a(paramArrayOfint, paramInt1, paramInt2);
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 25 */     return new jf(paramArrayOfint, paramInt1, paramInt2, paramInt3, paramkx); } public static fK a(int[] paramArrayOfint, int paramInt1, int paramInt2, kx paramkx) { return a(paramArrayOfint, paramInt1, paramInt2, 0, paramkx); }
/* 26 */   public static fK a(int paramInt, kx paramkx) { return new kK(paramInt, paramkx); }
/*    */    public static fK a(fK[] paramArrayOffK, int paramInt1, int paramInt2) {
/* 28 */     return new lw(paramArrayOffK, paramInt1, paramInt2);
/*    */   }
/* 30 */   public static cA a(fK paramfK) { return new jv(paramfK); }
/* 31 */   public static fK a(cA paramcA, long paramLong, int paramInt) { return new em(paramcA, paramLong, paramInt); }
/* 32 */   public static fK a(fK[] paramArrayOffK) { return a(paramArrayOffK, 0, paramArrayOffK.length); }
/* 33 */   public static fK a(cA paramcA, int paramInt, kx paramkx) { return new ee(paramcA, paramInt, paramkx); } public static fK a(Spliterator paramSpliterator) { 
/* 34 */     try { if (paramSpliterator instanceof fK) return (fK)paramSpliterator;  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  try { if (paramSpliterator instanceof Spliterator.OfInt)
/*    */         return new mN((Spliterator.OfInt)paramSpliterator);  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  return new ax(paramSpliterator); } public static fK a(Spliterator paramSpliterator, kx paramkx) { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/hl.h : J
/*    */     //   3: ldc2_w 58557581287038
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: aload_0
/*    */     //   9: instanceof me/konsolas/aac/fK
/*    */     //   12: ifeq -> 79
/*    */     //   15: new java/lang/IllegalArgumentException
/*    */     //   18: dup
/*    */     //   19: new java/lang/StringBuilder
/*    */     //   22: dup
/*    */     //   23: invokespecial <init> : ()V
/*    */     //   26: ldc '▢ʏ纆⭻떣᥷˳玩㏢萄喚䦟∸᪼鴥䧅䲝㇎Ł⃄ᔅ묪टǱ襛쀖賡㩊낐⃘耀궋㡞텉㙰ꊌ膕꣛禆侰ʀ㙘?益錝ᬗ堿萰鵦鮓ȅ탐렴쫸羷ߎ'
/*    */     //   28: invokevirtual toCharArray : ()[C
/*    */     //   31: dup
/*    */     //   32: dup
/*    */     //   33: bipush #50
/*    */     //   35: dup_x1
/*    */     //   36: caload
/*    */     //   37: sipush #26759
/*    */     //   40: ixor
/*    */     //   41: i2c
/*    */     //   42: castore
/*    */     //   43: sipush #8333
/*    */     //   46: iconst_1
/*    */     //   47: iconst_1
/*    */     //   48: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   51: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   54: ldc me/konsolas/aac/fK
/*    */     //   56: invokevirtual getSimpleName : ()Ljava/lang/String;
/*    */     //   59: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   62: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   65: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   68: athrow
/*    */     //   69: ldc2_w -905432544017679035
/*    */     //   72: lload_2
/*    */     //   73: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   78: athrow
/*    */     //   79: aload_0
/*    */     //   80: instanceof java/util/Spliterator$OfInt
/*    */     //   83: ifeq -> 109
/*    */     //   86: new me/konsolas/aac/mX
/*    */     //   89: dup
/*    */     //   90: aload_0
/*    */     //   91: checkcast java/util/Spliterator$OfInt
/*    */     //   94: aload_1
/*    */     //   95: invokespecial <init> : (Ljava/util/Spliterator$OfInt;Lme/konsolas/aac/kx;)V
/*    */     //   98: areturn
/*    */     //   99: ldc2_w -905432544017679035
/*    */     //   102: lload_2
/*    */     //   103: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   108: athrow
/*    */     //   109: new me/konsolas/aac/as
/*    */     //   112: dup
/*    */     //   113: aload_0
/*    */     //   114: aload_1
/*    */     //   115: invokespecial <init> : (Ljava/util/Spliterator;Lme/konsolas/aac/kx;)V
/*    */     //   118: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #35	-> 8
/*    */     //   #23	-> 79
/*    */     //   #24	-> 109
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   8	69	69	java/lang/IllegalArgumentException
/*    */     //   79	99	99	java/lang/IllegalArgumentException }
/* 36 */   public static void a(fK paramfK, IntPredicate paramIntPredicate, IntConsumer paramIntConsumer) { Objects.requireNonNull(paramIntPredicate); Objects.requireNonNull(paramIntConsumer); paramfK.a(paramInt -> { try { if (paramIntPredicate.test(paramInt))
/* 37 */               paramIntConsumer.accept(paramInt);  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  }); } public static fK a(int[] paramArrayOfint, kx paramkx) { return a(paramArrayOfint, 0, paramArrayOfint.length, paramkx); }
/*    */ 
/*    */   
/*    */   private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
/*    */     return paramIllegalArgumentException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\hl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */