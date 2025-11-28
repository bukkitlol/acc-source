/*  1 */ package me.konsolas.aac;public class i3 { private static final int a = -1640531527; private static final int c = 340573321; private static final long d = -7046029254386353131L; private static final long b = -1018231460777725123L; private static final long e = nc.a(9013504549407099302L, 4542094873564981234L, MethodHandles.lookup().lookupClass()).a(257995097008470L); public static long b(long paramLong, float paramFloat) { return Math.min((long)Math.ceil(((float)paramLong * paramFloat)), paramLong - 1L); }
/*  2 */   public static int d(int paramInt) { paramInt ^= paramInt >>> 16;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 38 */     paramInt *= -2048144789; paramInt ^= paramInt >>> 13; paramInt *= -1028477387; paramInt ^= paramInt >>> 16; return paramInt; } public static int b(int paramInt) { try {
/*    */       if (paramInt == 0)
/*    */         return 1; 
/*    */     } catch (IllegalArgumentException illegalArgumentException) {
/*    */       throw a(null);
/*    */     }  paramInt--; paramInt |= paramInt >> 1; paramInt |= paramInt >> 2; paramInt |= paramInt >> 4;
/* 44 */     paramInt |= paramInt >> 8; return (paramInt | paramInt >> 16) + 1; }
/*    */   public static int a(float paramFloat) { return Float.floatToRawIntBits(paramFloat); } public static int a(int paramInt, float paramFloat) { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/i3.e : J
/*    */     //   3: ldc2_w 89869366745571
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: ldc2_w 2
/*    */     //   11: iload_0
/*    */     //   12: i2f
/*    */     //   13: fload_1
/*    */     //   14: fdiv
/*    */     //   15: f2d
/*    */     //   16: invokestatic ceil : (D)D
/*    */     //   19: d2l
/*    */     //   20: invokestatic d : (J)J
/*    */     //   23: invokestatic max : (JJ)J
/*    */     //   26: lstore #4
/*    */     //   28: lload #4
/*    */     //   30: ldc2_w 1073741824
/*    */     //   33: lcmp
/*    */     //   34: ifle -> 155
/*    */     //   37: new java/lang/IllegalArgumentException
/*    */     //   40: dup
/*    */     //   41: new java/lang/StringBuilder
/*    */     //   44: dup
/*    */     //   45: invokespecial <init> : ()V
/*    */     //   48: ldc '謜皜隕⸬藚ň?쎥䘢並⠟'
/*    */     //   50: invokevirtual toCharArray : ()[C
/*    */     //   53: dup
/*    */     //   54: dup
/*    */     //   55: iconst_4
/*    */     //   56: dup_x1
/*    */     //   57: caload
/*    */     //   58: sipush #24745
/*    */     //   61: ixor
/*    */     //   62: i2c
/*    */     //   63: castore
/*    */     //   64: sipush #12869
/*    */     //   67: iconst_0
/*    */     //   68: iconst_0
/*    */     //   69: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   72: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   75: iload_0
/*    */     //   76: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   79: ldc '篜ৄ뿹ᩘ耵釞㯃艸鐆᤻셑겁晸ӿ?×ꥨᔔ?ꪟ翯꙱অﰊ켫䱗髺㘑'
/*    */     //   81: invokevirtual toCharArray : ()[C
/*    */     //   84: dup
/*    */     //   85: dup
/*    */     //   86: bipush #35
/*    */     //   88: dup_x1
/*    */     //   89: caload
/*    */     //   90: sipush #6823
/*    */     //   93: ixor
/*    */     //   94: i2c
/*    */     //   95: castore
/*    */     //   96: sipush #28904
/*    */     //   99: iconst_0
/*    */     //   100: iconst_1
/*    */     //   101: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   104: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   107: fload_1
/*    */     //   108: invokevirtual append : (F)Ljava/lang/StringBuilder;
/*    */     //   111: ldc '䍥↮'
/*    */     //   113: invokevirtual toCharArray : ()[C
/*    */     //   116: dup
/*    */     //   117: dup
/*    */     //   118: iconst_0
/*    */     //   119: dup_x1
/*    */     //   120: caload
/*    */     //   121: sipush #6744
/*    */     //   124: ixor
/*    */     //   125: i2c
/*    */     //   126: castore
/*    */     //   127: sipush #2069
/*    */     //   130: iconst_1
/*    */     //   131: iconst_1
/*    */     //   132: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   135: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   138: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   141: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   144: athrow
/*    */     //   145: ldc2_w 9196420699072265643
/*    */     //   148: lload_2
/*    */     //   149: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   154: athrow
/*    */     //   155: lload #4
/*    */     //   157: l2i
/*    */     //   158: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #20	-> 8
/*    */     //   #46	-> 28
/*    */     //   #14	-> 155
/*    */     // Exception table:
/*    */     //   from	to	target	type
/* 45 */     //   28	145	145	java/lang/IllegalArgumentException } public static long b(long paramLong) { long l = paramLong * -7046029254386353131L; l ^= l >>> 32L; return l ^ l >>> 16L; } public static int b(int paramInt, float paramFloat) { return Math.min((int)Math.ceil((paramInt * paramFloat)), paramInt - 1); } public static int c(int paramInt) { int i = paramInt * -1640531527; return i ^ i >>> 16; } public static long a(long paramLong) { paramLong ^= paramLong >>> 33L; paramLong *= -49064778989728563L; paramLong ^= paramLong >>> 33L; paramLong *= -4265267296055464877L; paramLong ^= paramLong >>> 33L; return paramLong; }
/*    */   public static int a(double paramDouble) { long l = Double.doubleToRawLongBits(paramDouble); return (int)(l ^ l >>> 32L); }
/* 47 */   public static long c(long paramLong) { paramLong ^= paramLong >>> 32L; paramLong ^= paramLong >>> 16L; return (paramLong ^ paramLong >>> 32L) * -1018231460777725123L; } public static int a(long paramLong) { return (int)(paramLong ^ paramLong >>> 32L); } public static long d(long paramLong) { try { if (paramLong == 0L) return 1L;  } catch (IllegalArgumentException illegalArgumentException) { throw a(null); }  paramLong--; paramLong |= paramLong >> 1L; paramLong |= paramLong >> 2L; paramLong |= paramLong >> 4L; paramLong |= paramLong >> 8L; paramLong |= paramLong >> 16L; return (paramLong | paramLong >> 32L) + 1L; } public static long a(long paramLong, float paramFloat) { return d((long)Math.ceil(((float)paramLong / paramFloat))); } public static int a(int paramInt) { return (paramInt ^ paramInt >>> 16) * 340573321; }
/*    */ 
/*    */   
/*    */   private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
/*    */     return paramIllegalArgumentException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\i3.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */