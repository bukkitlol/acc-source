/* 1 */ package aacinternal;public class v extends u { private static final long serialVersionUID = -6024911025449780478L; private static String e; private static final long f; public v(Throwable paramThrowable, short paramShort1, short paramShort2, int paramInt, H paramH, Object[] paramArrayOfObject) { super(paramThrowable, paramH, l2, paramArrayOfObject); }
/*   */   static { // Byte code:
/*   */     //   0: ldc2_w -3880972446348344480
/*   */     //   3: ldc2_w 4250553529898288554
/*   */     //   6: invokestatic lookup : ()Ljava/lang/invoke/MethodHandles$Lookup;
/*   */     //   9: invokevirtual lookupClass : ()Ljava/lang/Class;
/*   */     //   12: invokestatic a : (JJLjava/lang/Object;)Lme/konsolas/aac/na;
/*   */     //   15: ldc2_w 243159776246321
/*   */     //   18: invokeinterface a : (J)J
/*   */     //   23: putstatic aacinternal/v.f : J
/*   */     //   26: getstatic aacinternal/v.f : J
/*   */     //   29: ldc2_w 127028413683855
/*   */     //   32: lxor
/*   */     //   33: lstore_0
/*   */     //   34: ldc2_w -5162759354336085272
/*   */     //   37: lload_0
/*   */     //   38: <illegal opcode> w : (JJ)Ljava/lang/String;
/*   */     //   43: ifnull -> 79
/*   */     //   46: ldc 'ꄐ⬴ᾼ⌗'
/*   */     //   48: invokevirtual toCharArray : ()[C
/*   */     //   51: dup
/*   */     //   52: dup
/*   */     //   53: iconst_0
/*   */     //   54: dup_x1
/*   */     //   55: caload
/*   */     //   56: sipush #3029
/*   */     //   59: ixor
/*   */     //   60: i2c
/*   */     //   61: castore
/*   */     //   62: sipush #25889
/*   */     //   65: iconst_0
/*   */     //   66: iconst_0
/*   */     //   67: invokestatic q : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*   */     //   70: ldc2_w -5163622696694688223
/*   */     //   73: lload_0
/*   */     //   74: <illegal opcode> w : (Ljava/lang/String;JJ)V
/* 2 */     //   79: return } public static String a() { return e; } public static void b(String paramString) { e = paramString; } public v(H paramH, Object[] paramArrayOfObject, short paramShort1, int paramInt, short paramShort2) { super(paramH, paramArrayOfObject, l2); }
/*   */    }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\aacinternal\v.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */