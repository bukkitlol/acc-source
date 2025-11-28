/*    */ package me.konsolas.aac;
/*    */ public class ah {
/*    */   private static final double a = 25.0D;
/*    */   private static final double c = 100.0D;
/*    */   public static final double f = 1000.0D;
/*    */   private final e6 d;
/*    */   
/*    */   public ah a(long paramLong, double paramDouble) {
/*  9 */     paramLong = h ^ paramLong; long l = paramLong ^ 0x6AC0914BE283L; return new ah(this.d, l, this.g, this.b, this.e * paramDouble);
/*    */   } private final String g; private final Map b; private final double e; private static final long h = nc.a(-4449715180169972692L, 1257774935067904594L, MethodHandles.lookup().lookupClass()).a(1908090258239L); public ah(e6 parame6, long paramLong, String paramString, Map paramMap, double paramDouble) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/ah.h : J
/*    */     //   3: lload_2
/*    */     //   4: lxor
/*    */     //   5: lstore_2
/*    */     //   6: ldc2_w 907594943386799996
/*    */     //   9: lload_2
/*    */     //   10: <illegal opcode> w : (JJ)I
/*    */     //   15: aload_0
/*    */     //   16: invokespecial <init> : ()V
/*    */     //   19: istore #8
/*    */     //   21: aload #5
/*    */     //   23: invokeinterface entrySet : ()Ljava/util/Set;
/*    */     //   28: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   33: astore #9
/*    */     //   35: aload #9
/*    */     //   37: invokeinterface hasNext : ()Z
/*    */     //   42: ifeq -> 186
/*    */     //   45: aload #9
/*    */     //   47: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   52: checkcast java/util/Map$Entry
/*    */     //   55: astore #10
/*    */     //   57: aload #4
/*    */     //   59: new java/lang/StringBuilder
/*    */     //   62: dup
/*    */     //   63: invokespecial <init> : ()V
/*    */     //   66: ldc '件仦'
/*    */     //   68: invokevirtual toCharArray : ()[C
/*    */     //   71: dup
/*    */     //   72: dup
/*    */     //   73: iconst_0
/*    */     //   74: dup_x1
/*    */     //   75: caload
/*    */     //   76: sipush #17514
/*    */     //   79: ixor
/*    */     //   80: i2c
/*    */     //   81: castore
/*    */     //   82: sipush #21219
/*    */     //   85: iconst_5
/*    */     //   86: iconst_5
/*    */     //   87: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*    */     //   90: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   93: aload #10
/*    */     //   95: invokeinterface getKey : ()Ljava/lang/Object;
/*    */     //   100: checkcast java/lang/String
/*    */     //   103: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   106: ldc 'ᖍ樔'
/*    */     //   108: invokevirtual toCharArray : ()[C
/*    */     //   111: dup
/*    */     //   112: dup
/*    */     //   113: iconst_0
/*    */     //   114: dup_x1
/*    */     //   115: caload
/*    */     //   116: sipush #26367
/*    */     //   119: ixor
/*    */     //   120: i2c
/*    */     //   121: castore
/*    */     //   122: sipush #19420
/*    */     //   125: iconst_0
/*    */     //   126: iconst_4
/*    */     //   127: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*    */     //   130: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   133: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   136: aload #10
/*    */     //   138: invokeinterface getValue : ()Ljava/lang/Object;
/*    */     //   143: checkcast java/lang/CharSequence
/*    */     //   146: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
/*    */     //   149: astore #4
/*    */     //   151: iload #8
/*    */     //   153: lload_2
/*    */     //   154: lconst_0
/*    */     //   155: lcmp
/*    */     //   156: iflt -> 164
/*    */     //   159: ifne -> 209
/*    */     //   162: iload #8
/*    */     //   164: ifeq -> 35
/*    */     //   167: lload_2
/*    */     //   168: lconst_0
/*    */     //   169: lcmp
/*    */     //   170: ifle -> 151
/*    */     //   173: goto -> 186
/*    */     //   176: ldc2_w 942503451288297423
/*    */     //   179: lload_2
/*    */     //   180: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   185: athrow
/*    */     //   186: aload_0
/*    */     //   187: aload_1
/*    */     //   188: putfield d : Lme/konsolas/aac/e6;
/*    */     //   191: aload_0
/*    */     //   192: aload #4
/*    */     //   194: putfield g : Ljava/lang/String;
/*    */     //   197: aload_0
/*    */     //   198: aload #5
/*    */     //   200: putfield b : Ljava/util/Map;
/*    */     //   203: aload_0
/*    */     //   204: dload #6
/*    */     //   206: putfield e : D
/*    */     //   209: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #5	-> 15
/*    */     //   #1	-> 21
/*    */     //   #12	-> 57
/*    */     //   #7	-> 151
/*    */     //   #2	-> 186
/*    */     //   #13	-> 191
/*    */     //   #6	-> 197
/*    */     //   #4	-> 203
/*    */     //   #11	-> 209
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   151	167	176	aacinternal/v
/*    */   }
/*    */   public String a() {
/* 14 */     return this.g;
/*    */   }
/* 16 */   public double a() { return this.e; } public static ah a(String paramString, Map paramMap, double paramDouble, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/ah.h : J
/*    */     //   3: lload #4
/*    */     //   5: lxor
/*    */     //   6: lstore #4
/*    */     //   8: lload #4
/*    */     //   10: dup2
/*    */     //   11: ldc2_w 83840797629719
/*    */     //   14: lxor
/*    */     //   15: lstore #6
/*    */     //   17: pop2
/*    */     //   18: dload_2
/*    */     //   19: ldc2_w 10.0
/*    */     //   22: dcmpl
/*    */     //   23: iflt -> 104
/*    */     //   26: new me/konsolas/aac/ah
/*    */     //   29: dup
/*    */     //   30: dload_2
/*    */     //   31: ldc2_w 25.0
/*    */     //   34: dcmpl
/*    */     //   35: ifle -> 86
/*    */     //   38: goto -> 52
/*    */     //   41: ldc2_w -860701257932167467
/*    */     //   44: lload #4
/*    */     //   46: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   51: athrow
/*    */     //   52: dload_2
/*    */     //   53: ldc2_w 100.0
/*    */     //   56: dcmpl
/*    */     //   57: ifle -> 80
/*    */     //   60: goto -> 74
/*    */     //   63: ldc2_w -860701257932167467
/*    */     //   66: lload #4
/*    */     //   68: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   73: athrow
/*    */     //   74: getstatic me/konsolas/aac/e6.HIGH : Lme/konsolas/aac/e6;
/*    */     //   77: goto -> 89
/*    */     //   80: getstatic me/konsolas/aac/e6.SUSPICIOUS : Lme/konsolas/aac/e6;
/*    */     //   83: goto -> 89
/*    */     //   86: getstatic me/konsolas/aac/e6.NEUTRAL : Lme/konsolas/aac/e6;
/*    */     //   89: lload #6
/*    */     //   91: aload_0
/*    */     //   92: aload_1
/*    */     //   93: dload_2
/*    */     //   94: ldc2_w 250.0
/*    */     //   97: invokestatic min : (DD)D
/*    */     //   100: invokespecial <init> : (Lme/konsolas/aac/e6;JLjava/lang/String;Ljava/util/Map;D)V
/*    */     //   103: areturn
/*    */     //   104: aconst_null
/*    */     //   105: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #18	-> 18
/*    */     //   #3	-> 26
/*    */     //   #10	-> 52
/*    */     //   #17	-> 97
/*    */     //   #8	-> 103
/*    */     //   #15	-> 104
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   18	38	41	aacinternal/v
/*    */     //   26	60	63	aacinternal/v
/*    */   }
/* 19 */   public e6 a() { return this.d; } public Map a() {
/* 20 */     return this.b;
/*    */   }
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ah.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */