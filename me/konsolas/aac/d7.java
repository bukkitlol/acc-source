/*    */ package me.konsolas.aac;public class d7 {
/*  2 */   private final BlockVector c = null;
/*    */   public BlockFace a() {
/*  4 */     return this.a;
/*  5 */   } private final BlockFace a = null;
/*  6 */   private final Vector b = null; private static int[] d; private static final long e; private static final String[] f; private static final String[] g; private static final Map h;
/*    */   
/*    */   public BlockVector a() {
/*  9 */     return this.c;
/*    */   } public String toString() {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/d7.e : J
/*    */     //   3: ldc2_w 77976376044940
/*    */     //   6: lxor
/*    */     //   7: lstore_1
/*    */     //   8: ldc2_w -1898737678038879967
/*    */     //   11: lload_1
/*    */     //   12: <illegal opcode> w : (JJ)[I
/*    */     //   17: astore_3
/*    */     //   18: new java/lang/StringBuilder
/*    */     //   21: dup
/*    */     //   22: invokespecial <init> : ()V
/*    */     //   25: sipush #16929
/*    */     //   28: ldc2_w 1203875537554495121
/*    */     //   31: lload_1
/*    */     //   32: lxor
/*    */     //   33: <illegal opcode> y : (IJ)Ljava/lang/String;
/*    */     //   38: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   41: aload_0
/*    */     //   42: getfield b : Lorg/bukkit/util/Vector;
/*    */     //   45: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   48: sipush #17122
/*    */     //   51: ldc2_w 7265167006819243601
/*    */     //   54: lload_1
/*    */     //   55: lxor
/*    */     //   56: <illegal opcode> y : (IJ)Ljava/lang/String;
/*    */     //   61: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   64: aload_0
/*    */     //   65: getfield c : Lorg/bukkit/util/BlockVector;
/*    */     //   68: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   71: sipush #4327
/*    */     //   74: ldc2_w 7441400288772719701
/*    */     //   77: lload_1
/*    */     //   78: lxor
/*    */     //   79: <illegal opcode> y : (IJ)Ljava/lang/String;
/*    */     //   84: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   87: aload_0
/*    */     //   88: getfield a : Lorg/bukkit/block/BlockFace;
/*    */     //   91: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   94: bipush #125
/*    */     //   96: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*    */     //   99: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   102: ldc2_w -1889965433242279578
/*    */     //   105: lload_1
/*    */     //   106: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*    */     //   111: ifnull -> 139
/*    */     //   114: iconst_1
/*    */     //   115: newarray int
/*    */     //   117: ldc2_w -1930786646708047620
/*    */     //   120: lload_1
/*    */     //   121: <illegal opcode> w : ([IJJ)V
/*    */     //   126: goto -> 139
/*    */     //   129: ldc2_w -1895401341016932552
/*    */     //   132: lload_1
/*    */     //   133: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   138: athrow
/*    */     //   139: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #13	-> 18
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   18	126	129	aacinternal/v
/*    */   }
/*    */   public Vector a() {
/* 14 */     return this.b.clone();
/*    */   }
/*    */   
/*    */   public d7(long paramLong, short paramShort, Vector paramVector, BlockVector paramBlockVector, BlockFace paramBlockFace) {
/*    */     // Byte code:
/*    */     //   0: lload_1
/*    */     //   1: bipush #16
/*    */     //   3: lshl
/*    */     //   4: iload_3
/*    */     //   5: i2l
/*    */     //   6: bipush #48
/*    */     //   8: lshl
/*    */     //   9: bipush #48
/*    */     //   11: lushr
/*    */     //   12: lor
/*    */     //   13: getstatic me/konsolas/aac/d7.e : J
/*    */     //   16: lxor
/*    */     //   17: lstore #7
/*    */     //   19: aload_0
/*    */     //   20: invokespecial <init> : ()V
/*    */     //   23: aload_0
/*    */     //   24: aload #4
/*    */     //   26: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   29: checkcast org/bukkit/util/Vector
/*    */     //   32: invokevirtual clone : ()Lorg/bukkit/util/Vector;
/*    */     //   35: putfield b : Lorg/bukkit/util/Vector;
/*    */     //   38: ldc2_w -7324965915648602401
/*    */     //   41: lload #7
/*    */     //   43: <illegal opcode> w : (JJ)[I
/*    */     //   48: aload_0
/*    */     //   49: aload #5
/*    */     //   51: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   54: checkcast org/bukkit/util/BlockVector
/*    */     //   57: putfield c : Lorg/bukkit/util/BlockVector;
/*    */     //   60: aload_0
/*    */     //   61: aload #6
/*    */     //   63: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   66: checkcast org/bukkit/block/BlockFace
/*    */     //   69: putfield a : Lorg/bukkit/block/BlockFace;
/*    */     //   72: astore #9
/*    */     //   74: aload #9
/*    */     //   76: ifnull -> 107
/*    */     //   79: iconst_3
/*    */     //   80: anewarray me/konsolas/aac/aN
/*    */     //   83: ldc2_w -7348043250556058669
/*    */     //   86: lload #7
/*    */     //   88: <illegal opcode> w : ([Lme/konsolas/aac/aN;JJ)V
/*    */     //   93: goto -> 107
/*    */     //   96: ldc2_w -7328477070724529978
/*    */     //   99: lload #7
/*    */     //   101: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   106: athrow
/*    */     //   107: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #15	-> 19
/*    */     //   #3	-> 23
/*    */     //   #10	-> 48
/*    */     //   #12	-> 60
/*    */     //   #8	-> 74
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   74	93	96	aacinternal/v
/*    */   }
/*    */   
/*    */   public static d7 a(RayTraceResult paramRayTraceResult, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/d7.e : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: lload_1
/*    */     //   7: dup2
/*    */     //   8: ldc2_w 34782068020696
/*    */     //   11: lxor
/*    */     //   12: dup2
/*    */     //   13: bipush #16
/*    */     //   15: lushr
/*    */     //   16: lstore_3
/*    */     //   17: dup2
/*    */     //   18: bipush #48
/*    */     //   20: lshl
/*    */     //   21: bipush #48
/*    */     //   23: lushr
/*    */     //   24: l2i
/*    */     //   25: istore #5
/*    */     //   27: pop2
/*    */     //   28: pop2
/*    */     //   29: ldc2_w -8745410070016568795
/*    */     //   32: lload_1
/*    */     //   33: <illegal opcode> w : (JJ)[I
/*    */     //   38: astore #6
/*    */     //   40: aload_0
/*    */     //   41: aload #6
/*    */     //   43: ifnonnull -> 63
/*    */     //   46: ifnull -> 69
/*    */     //   49: goto -> 62
/*    */     //   52: ldc2_w -8739669101028533188
/*    */     //   55: lload_1
/*    */     //   56: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   61: athrow
/*    */     //   62: aload_0
/*    */     //   63: invokevirtual getHitBlock : ()Lorg/bukkit/block/Block;
/*    */     //   66: ifnonnull -> 87
/*    */     //   69: new me/konsolas/aac/d7
/*    */     //   72: dup
/*    */     //   73: invokespecial <init> : ()V
/*    */     //   76: areturn
/*    */     //   77: ldc2_w -8739669101028533188
/*    */     //   80: lload_1
/*    */     //   81: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   86: athrow
/*    */     //   87: new me/konsolas/aac/d7
/*    */     //   90: dup
/*    */     //   91: aload_0
/*    */     //   92: invokevirtual getHitPosition : ()Lorg/bukkit/util/Vector;
/*    */     //   95: lload_3
/*    */     //   96: dup2_x1
/*    */     //   97: pop2
/*    */     //   98: iload #5
/*    */     //   100: i2s
/*    */     //   101: swap
/*    */     //   102: aload_0
/*    */     //   103: invokevirtual getHitBlock : ()Lorg/bukkit/block/Block;
/*    */     //   106: invokeinterface getLocation : ()Lorg/bukkit/Location;
/*    */     //   111: invokevirtual toVector : ()Lorg/bukkit/util/Vector;
/*    */     //   114: invokevirtual toBlockVector : ()Lorg/bukkit/util/BlockVector;
/*    */     //   117: aload_0
/*    */     //   118: invokevirtual getHitBlockFace : ()Lorg/bukkit/block/BlockFace;
/*    */     //   121: invokespecial <init> : (JSLorg/bukkit/util/Vector;Lorg/bukkit/util/BlockVector;Lorg/bukkit/block/BlockFace;)V
/*    */     //   124: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #16	-> 40
/*    */     //   #7	-> 69
/*    */     //   #19	-> 87
/*    */     //   #1	-> 103
/*    */     //   #18	-> 124
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   40	49	52	aacinternal/v
/*    */     //   63	77	77	aacinternal/v
/*    */   }
/*    */   
/*    */   public boolean a(long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/d7.e : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: ldc2_w -2653103413611425879
/*    */     //   9: lload_1
/*    */     //   10: <illegal opcode> w : (JJ)[I
/*    */     //   15: astore_3
/*    */     //   16: aload_0
/*    */     //   17: aload_3
/*    */     //   18: ifnonnull -> 54
/*    */     //   21: getfield b : Lorg/bukkit/util/Vector;
/*    */     //   24: ifnull -> 117
/*    */     //   27: goto -> 40
/*    */     //   30: ldc2_w -2649750313365028432
/*    */     //   33: lload_1
/*    */     //   34: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   39: athrow
/*    */     //   40: aload_0
/*    */     //   41: goto -> 54
/*    */     //   44: ldc2_w -2649750313365028432
/*    */     //   47: lload_1
/*    */     //   48: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   53: athrow
/*    */     //   54: lload_1
/*    */     //   55: lconst_0
/*    */     //   56: lcmp
/*    */     //   57: iflt -> 97
/*    */     //   60: aload_3
/*    */     //   61: ifnonnull -> 97
/*    */     //   64: getfield c : Lorg/bukkit/util/BlockVector;
/*    */     //   67: ifnull -> 117
/*    */     //   70: goto -> 83
/*    */     //   73: ldc2_w -2649750313365028432
/*    */     //   76: lload_1
/*    */     //   77: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   82: athrow
/*    */     //   83: aload_0
/*    */     //   84: goto -> 97
/*    */     //   87: ldc2_w -2649750313365028432
/*    */     //   90: lload_1
/*    */     //   91: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   96: athrow
/*    */     //   97: getfield a : Lorg/bukkit/block/BlockFace;
/*    */     //   100: ifnull -> 117
/*    */     //   103: iconst_1
/*    */     //   104: goto -> 118
/*    */     //   107: ldc2_w -2649750313365028432
/*    */     //   110: lload_1
/*    */     //   111: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   116: athrow
/*    */     //   117: iconst_0
/*    */     //   118: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #20	-> 16
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   16	27	30	aacinternal/v
/*    */     //   21	41	44	aacinternal/v
/*    */     //   54	70	73	aacinternal/v
/*    */     //   64	84	87	aacinternal/v
/*    */     //   97	107	107	aacinternal/v
/*    */   }
/*    */   
/*    */   public d7() {}
/*    */   
/*    */   public static void b(int[] paramArrayOfint) {
/*    */     d = paramArrayOfint;
/*    */   }
/*    */   
/*    */   public static int[] b() {
/*    */     return d;
/*    */   }
/*    */   
/*    */   static {
/*    */     // Byte code:
/*    */     //   0: ldc2_w 474135864401378410
/*    */     //   3: ldc2_w 7025670105731316012
/*    */     //   6: invokestatic lookup : ()Ljava/lang/invoke/MethodHandles$Lookup;
/*    */     //   9: invokevirtual lookupClass : ()Ljava/lang/Class;
/*    */     //   12: invokestatic a : (JJLjava/lang/Object;)Lme/konsolas/aac/na;
/*    */     //   15: ldc2_w 116670085425386
/*    */     //   18: invokeinterface a : (J)J
/*    */     //   23: putstatic me/konsolas/aac/d7.e : J
/*    */     //   26: getstatic me/konsolas/aac/d7.e : J
/*    */     //   29: ldc2_w 107889019419024
/*    */     //   32: lxor
/*    */     //   33: lstore #9
/*    */     //   35: aconst_null
/*    */     //   36: new java/util/HashMap
/*    */     //   39: dup
/*    */     //   40: bipush #13
/*    */     //   42: invokespecial <init> : (I)V
/*    */     //   45: putstatic me/konsolas/aac/d7.h : Ljava/util/Map;
/*    */     //   48: ldc2_w 8153858603283555552
/*    */     //   51: lload #9
/*    */     //   53: <illegal opcode> w : ([IJJ)V
/*    */     //   58: ldc '晽댶䠓鬁ꄘ⺀㽃勞얚﹂˭鎘抁ө㡑꽽搂ካ'
/*    */     //   60: invokevirtual toCharArray : ()[C
/*    */     //   63: dup
/*    */     //   64: dup
/*    */     //   65: iconst_1
/*    */     //   66: dup_x1
/*    */     //   67: caload
/*    */     //   68: sipush #18475
/*    */     //   71: ixor
/*    */     //   72: i2c
/*    */     //   73: castore
/*    */     //   74: sipush #3436
/*    */     //   77: iconst_1
/*    */     //   78: iconst_0
/*    */     //   79: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   82: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/Cipher;
/*    */     //   85: dup
/*    */     //   86: astore_0
/*    */     //   87: iconst_2
/*    */     //   88: ldc '곡獬䡻畼'
/*    */     //   90: invokevirtual toCharArray : ()[C
/*    */     //   93: dup
/*    */     //   94: dup
/*    */     //   95: iconst_1
/*    */     //   96: dup_x1
/*    */     //   97: caload
/*    */     //   98: sipush #9277
/*    */     //   101: ixor
/*    */     //   102: i2c
/*    */     //   103: castore
/*    */     //   104: sipush #18113
/*    */     //   107: iconst_0
/*    */     //   108: iconst_0
/*    */     //   109: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   112: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;
/*    */     //   115: bipush #8
/*    */     //   117: newarray byte
/*    */     //   119: dup
/*    */     //   120: iconst_0
/*    */     //   121: lload #9
/*    */     //   123: bipush #56
/*    */     //   125: lushr
/*    */     //   126: l2i
/*    */     //   127: i2b
/*    */     //   128: bastore
/*    */     //   129: iconst_1
/*    */     //   130: istore_1
/*    */     //   131: iload_1
/*    */     //   132: bipush #8
/*    */     //   134: if_icmpge -> 158
/*    */     //   137: dup
/*    */     //   138: iload_1
/*    */     //   139: lload #9
/*    */     //   141: iload_1
/*    */     //   142: bipush #8
/*    */     //   144: imul
/*    */     //   145: lshl
/*    */     //   146: bipush #56
/*    */     //   148: lushr
/*    */     //   149: l2i
/*    */     //   150: i2b
/*    */     //   151: bastore
/*    */     //   152: iinc #1, 1
/*    */     //   155: goto -> 131
/*    */     //   158: new javax/crypto/spec/DESKeySpec
/*    */     //   161: dup_x1
/*    */     //   162: swap
/*    */     //   163: invokespecial <init> : ([B)V
/*    */     //   166: invokevirtual generateSecret : (Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
/*    */     //   169: new javax/crypto/spec/IvParameterSpec
/*    */     //   172: dup
/*    */     //   173: bipush #8
/*    */     //   175: newarray byte
/*    */     //   177: invokespecial <init> : ([B)V
/*    */     //   180: invokevirtual init : (ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
/*    */     //   183: iconst_3
/*    */     //   184: anewarray java/lang/String
/*    */     //   187: astore #7
/*    */     //   189: iconst_0
/*    */     //   190: istore #5
/*    */     //   192: ldc 'î膕⁻ꗒｹ弣虋༎ꠌ섦潈鯫ᙲ铰?㬶שּׂ㿽ݓ睮꧱Ϩ籃?ಋ함ꗩꭖ煅倱ꭡꉒ蜀틺촗䲼ढ↤緊?ꟑ콭퟊꫷誃붌ᄬꨛ⨀脍秠寍埧痙ꮲ읔磁Ӏ⍗琸힇촁齤꥛仄웈美ꘒ퍉쟫㒝診칽㸻풝潒舊ㄺ苙搔塿?君럽?㩟橯ᤧ羾T<'
/*    */     //   194: invokevirtual toCharArray : ()[C
/*    */     //   197: dup
/*    */     //   198: dup
/*    */     //   199: bipush #23
/*    */     //   201: dup_x1
/*    */     //   202: caload
/*    */     //   203: sipush #3377
/*    */     //   206: ixor
/*    */     //   207: i2c
/*    */     //   208: castore
/*    */     //   209: sipush #231
/*    */     //   212: iconst_0
/*    */     //   213: iconst_0
/*    */     //   214: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   217: dup
/*    */     //   218: astore #4
/*    */     //   220: invokevirtual length : ()I
/*    */     //   223: istore #6
/*    */     //   225: bipush #16
/*    */     //   227: istore_3
/*    */     //   228: iconst_m1
/*    */     //   229: istore_2
/*    */     //   230: iinc #2, 1
/*    */     //   233: aload #4
/*    */     //   235: iload_2
/*    */     //   236: dup
/*    */     //   237: iload_3
/*    */     //   238: iadd
/*    */     //   239: invokevirtual substring : (II)Ljava/lang/String;
/*    */     //   242: iconst_m1
/*    */     //   243: goto -> 291
/*    */     //   246: aload #7
/*    */     //   248: swap
/*    */     //   249: iload #5
/*    */     //   251: iinc #5, 1
/*    */     //   254: swap
/*    */     //   255: aastore
/*    */     //   256: iload_2
/*    */     //   257: iload_3
/*    */     //   258: iadd
/*    */     //   259: dup
/*    */     //   260: istore_2
/*    */     //   261: iload #6
/*    */     //   263: if_icmpge -> 276
/*    */     //   266: aload #4
/*    */     //   268: iload_2
/*    */     //   269: invokevirtual charAt : (I)C
/*    */     //   272: istore_3
/*    */     //   273: goto -> 230
/*    */     //   276: aload #7
/*    */     //   278: putstatic me/konsolas/aac/d7.f : [Ljava/lang/String;
/*    */     //   281: iconst_3
/*    */     //   282: anewarray java/lang/String
/*    */     //   285: putstatic me/konsolas/aac/d7.g : [Ljava/lang/String;
/*    */     //   288: goto -> 340
/*    */     //   291: swap
/*    */     //   292: ldc_w '卿랅⫏㟯㲸㳵ꈕ뱢키⥂'
/*    */     //   295: invokevirtual toCharArray : ()[C
/*    */     //   298: dup
/*    */     //   299: dup
/*    */     //   300: iconst_5
/*    */     //   301: dup_x1
/*    */     //   302: caload
/*    */     //   303: sipush #948
/*    */     //   306: ixor
/*    */     //   307: i2c
/*    */     //   308: castore
/*    */     //   309: sipush #6104
/*    */     //   312: iconst_0
/*    */     //   313: iconst_1
/*    */     //   314: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   317: invokevirtual getBytes : (Ljava/lang/String;)[B
/*    */     //   320: aload_0
/*    */     //   321: swap
/*    */     //   322: invokevirtual doFinal : ([B)[B
/*    */     //   325: astore #8
/*    */     //   327: aload #8
/*    */     //   329: invokestatic a : ([B)Ljava/lang/String;
/*    */     //   332: invokevirtual intern : ()Ljava/lang/String;
/*    */     //   335: swap
/*    */     //   336: pop
/*    */     //   337: goto -> 246
/*    */     //   340: return
/*    */   }
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   }
/*    */   
/*    */   private static String a(byte[] paramArrayOfbyte) {
/*    */     byte b1 = 0;
/*    */     int i;
/*    */     char[] arrayOfChar = new char[i = paramArrayOfbyte.length];
/*    */     for (byte b2 = 0; b2 < i; b2++) {
/*    */       int j;
/*    */       if ((j = 0xFF & paramArrayOfbyte[b2]) < 192) {
/*    */         arrayOfChar[b1++] = (char)j;
/*    */       } else if (j < 224) {
/*    */         char c = (char)((char)(j & 0x1F) << 6);
/*    */         j = paramArrayOfbyte[++b2];
/*    */         c = (char)(c | (char)(j & 0x3F));
/*    */         arrayOfChar[b1++] = c;
/*    */       } else if (b2 < i - 2) {
/*    */         char c = (char)((char)(j & 0xF) << 12);
/*    */         j = paramArrayOfbyte[++b2];
/*    */         c = (char)(c | (char)(j & 0x3F) << 6);
/*    */         j = paramArrayOfbyte[++b2];
/*    */         c = (char)(c | (char)(j & 0x3F));
/*    */         arrayOfChar[b1++] = c;
/*    */       } 
/*    */     } 
/*    */     return new String(arrayOfChar, 0, b1);
/*    */   }
/*    */   
/*    */   private static String a(int paramInt, long paramLong) {
/*    */     int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x701C;
/*    */     if (g[i] == null) {
/*    */       Object[] arrayOfObject;
/*    */       try {
/*    */         Long long_ = Long.valueOf(Thread.currentThread().getId());
/*    */         arrayOfObject = (Object[])h.get(long_);
/*    */         if (arrayOfObject == null) {
/*    */           arrayOfObject = new Object[3];
/*    */           "⦀쟈딍䤈쵹ﶆ携㧐꧜茶㠌邷ꁱ챞컓猷뙏奡ﳉ䯙".toCharArray()[6] = (char)("⦀쟈딍䤈쵹ﶆ携㧐꧜茶㠌邷ꁱ챞컓猷뙏奡ﳉ䯙".toCharArray()[6] ^ 0x38F6);
/*    */           arrayOfObject[0] = Cipher.getInstance(a0$cc.G("⦀쟈딍䤈쵹ﶆ携㧐꧜茶㠌邷ꁱ챞컓猷뙏奡ﳉ䯙".toCharArray(), (short)12099, true, (byte)5));
/*    */           "무髊濓䨝".toCharArray()[1] = (char)("무髊濓䨝".toCharArray()[1] ^ 0x4FC4);
/*    */           arrayOfObject[1] = SecretKeyFactory.getInstance(a0$cc.G("무髊濓䨝".toCharArray(), (short)7625, true, (byte)2));
/*    */           arrayOfObject[2] = new IvParameterSpec(new byte[8]);
/*    */           h.put(long_, arrayOfObject);
/*    */         } 
/*    */       } catch (Exception exception) {
/*    */         "嚼㇨䋰깥渤㠯疪ᛢ﯑㞆᭺䁲땮ᠿ䘊⎬䠘".toCharArray()[1] = (char)("嚼㇨䋰깥渤㠯疪ᛢ﯑㞆᭺䁲땮ᠿ䘊⎬䠘".toCharArray()[1] ^ 0x7F22);
/*    */         throw new RuntimeException(a0$cc.G("嚼㇨䋰깥渤㠯疪ᛢ﯑㞆᭺䁲땮ᠿ䘊⎬䠘".toCharArray(), (short)7634, true, (byte)1), exception);
/*    */       } 
/*    */       byte[] arrayOfByte1 = new byte[8];
/*    */       arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
/*    */       for (byte b = 1; b < 8; b++)
/*    */         arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
/*    */       DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
/*    */       SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
/*    */       ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
/*    */       "砒⾕漣蚘⋈ꩭᎆ褫怠璐".toCharArray()[6] = (char)("砒⾕漣蚘⋈ꩭᎆ褫怠璐".toCharArray()[6] ^ 0x4602);
/*    */       byte[] arrayOfByte2 = f[i].getBytes(a0$cc.G("砒⾕漣蚘⋈ꩭᎆ褫怠璐".toCharArray(), (short)2717, false, (byte)2));
/*    */       g[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
/*    */     } 
/*    */     return g[i];
/*    */   }
/*    */   
/*    */   private static Object a(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
/*    */     int i = ((Integer)paramArrayOfObject[0]).intValue();
/*    */     long l = ((Long)paramArrayOfObject[1]).longValue();
/*    */     String str = a(i, l);
/*    */     MethodHandle methodHandle = MethodHandles.constant(String.class, str);
/*    */     paramMutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[] { int.class, long.class }));
/*    */     return str;
/*    */   }
/*    */   
/*    */   private static CallSite a(MethodHandles.Lookup paramLookup, String paramString, MethodType paramMethodType) {
/*    */     // Byte code:
/*    */     //   0: new java/lang/invoke/MutableCallSite
/*    */     //   3: dup
/*    */     //   4: aload_2
/*    */     //   5: invokespecial <init> : (Ljava/lang/invoke/MethodType;)V
/*    */     //   8: astore_3
/*    */     //   9: aload_3
/*    */     //   10: ldc_w
/*    */     //   13: ldc_w [Ljava/lang/Object;
/*    */     //   16: aload_2
/*    */     //   17: invokevirtual parameterCount : ()I
/*    */     //   20: invokevirtual asCollector : (Ljava/lang/Class;I)Ljava/lang/invoke/MethodHandle;
/*    */     //   23: iconst_0
/*    */     //   24: iconst_3
/*    */     //   25: anewarray java/lang/Object
/*    */     //   28: dup
/*    */     //   29: iconst_0
/*    */     //   30: aload_0
/*    */     //   31: aastore
/*    */     //   32: dup
/*    */     //   33: iconst_1
/*    */     //   34: aload_3
/*    */     //   35: aastore
/*    */     //   36: dup
/*    */     //   37: iconst_2
/*    */     //   38: aload_1
/*    */     //   39: aastore
/*    */     //   40: invokestatic insertArguments : (Ljava/lang/invoke/MethodHandle;I[Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;
/*    */     //   43: aload_2
/*    */     //   44: invokestatic explicitCastArguments : (Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;
/*    */     //   47: invokevirtual setTarget : (Ljava/lang/invoke/MethodHandle;)V
/*    */     //   50: goto -> 170
/*    */     //   53: astore #4
/*    */     //   55: new java/lang/RuntimeException
/*    */     //   58: dup
/*    */     //   59: new java/lang/StringBuilder
/*    */     //   62: dup
/*    */     //   63: invokespecial <init> : ()V
/*    */     //   66: ldc_w '쟐韔壟ꦋ찾魰쎚䘹妬閙缜륮얿㵖昦殿'
/*    */     //   69: invokevirtual toCharArray : ()[C
/*    */     //   72: dup
/*    */     //   73: dup
/*    */     //   74: iconst_3
/*    */     //   75: dup_x1
/*    */     //   76: caload
/*    */     //   77: sipush #10155
/*    */     //   80: ixor
/*    */     //   81: i2c
/*    */     //   82: castore
/*    */     //   83: sipush #2431
/*    */     //   86: iconst_4
/*    */     //   87: iconst_3
/*    */     //   88: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*    */     //   91: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   94: ldc_w '멖揶먽坤'
/*    */     //   97: invokevirtual toCharArray : ()[C
/*    */     //   100: dup
/*    */     //   101: dup
/*    */     //   102: iconst_0
/*    */     //   103: dup_x1
/*    */     //   104: caload
/*    */     //   105: sipush #3415
/*    */     //   108: ixor
/*    */     //   109: i2c
/*    */     //   110: castore
/*    */     //   111: sipush #392
/*    */     //   114: iconst_2
/*    */     //   115: iconst_1
/*    */     //   116: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*    */     //   119: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   122: aload_1
/*    */     //   123: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   126: ldc_w '橄僥밓㳓'
/*    */     //   129: invokevirtual toCharArray : ()[C
/*    */     //   132: dup
/*    */     //   133: dup
/*    */     //   134: iconst_0
/*    */     //   135: dup_x1
/*    */     //   136: caload
/*    */     //   137: sipush #22065
/*    */     //   140: ixor
/*    */     //   141: i2c
/*    */     //   142: castore
/*    */     //   143: sipush #159
/*    */     //   146: iconst_1
/*    */     //   147: iconst_3
/*    */     //   148: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*    */     //   151: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   154: aload_2
/*    */     //   155: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   158: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   161: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   164: aload #4
/*    */     //   166: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   169: athrow
/*    */     //   170: aload_3
/*    */     //   171: areturn
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   9	50	53	java/lang/Exception
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\d7.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */