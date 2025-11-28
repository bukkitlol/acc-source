/*    */ package me.konsolas.aac;
/*    */ 
/*    */ import aacinternal.v;
/*    */ import java.lang.invoke.CallSite;
/*    */ import java.lang.invoke.MethodHandle;
/*    */ import java.lang.invoke.MethodHandles;
/*    */ import java.lang.invoke.MethodType;
/*    */ import java.lang.invoke.MutableCallSite;
/*    */ import java.util.Arrays;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
/*    */ import javax.crypto.Cipher;
/*    */ import javax.crypto.SecretKey;
/*    */ import javax.crypto.SecretKeyFactory;
/*    */ import javax.crypto.spec.DESKeySpec;
/*    */ import javax.crypto.spec.IvParameterSpec;
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.block.Block;
/*    */ import org.bukkit.block.BlockFace;
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
/*    */ class m3
/*    */   implements G
/*    */ {
/*    */   static Set d;
/*    */   static BlockFace[] c;
/*    */   kP f;
/*    */   Material g;
/*    */   byte a;
/*    */   Material[] e;
/*    */   byte[] b;
/*    */   private static final long h;
/*    */   private static final String[] i;
/*    */   private static final String[] j;
/*    */   private static final Map k;
/*    */   
/*    */   public void a(long paramLong, kP paramkP, Block paramBlock) {
/*    */     // Byte code:
/*    */     //   0: ldc2_w -8209660778005024415
/*    */     //   3: lload_1
/*    */     //   4: <illegal opcode> w : (JJ)Ljava/lang/String;
/*    */     //   9: aload_0
/*    */     //   10: aload_3
/*    */     //   11: putfield f : Lme/konsolas/aac/kP;
/*    */     //   14: astore #5
/*    */     //   16: aload_0
/*    */     //   17: aload #4
/*    */     //   19: invokeinterface getType : ()Lorg/bukkit/Material;
/*    */     //   24: putfield g : Lorg/bukkit/Material;
/*    */     //   27: aload_0
/*    */     //   28: lload_1
/*    */     //   29: lconst_0
/*    */     //   30: lcmp
/*    */     //   31: ifle -> 203
/*    */     //   34: aload #4
/*    */     //   36: invokeinterface getData : ()B
/*    */     //   41: putfield a : B
/*    */     //   44: aload #5
/*    */     //   46: ifnull -> 202
/*    */     //   49: getstatic me/konsolas/aac/m3.d : Ljava/util/Set;
/*    */     //   52: aload_0
/*    */     //   53: getfield g : Lorg/bukkit/Material;
/*    */     //   56: invokeinterface contains : (Ljava/lang/Object;)Z
/*    */     //   61: ifeq -> 181
/*    */     //   64: goto -> 77
/*    */     //   67: ldc2_w -8211156981313170906
/*    */     //   70: lload_1
/*    */     //   71: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   76: athrow
/*    */     //   77: iconst_0
/*    */     //   78: istore #6
/*    */     //   80: iload #6
/*    */     //   82: getstatic me/konsolas/aac/m3.c : [Lorg/bukkit/block/BlockFace;
/*    */     //   85: arraylength
/*    */     //   86: if_icmpge -> 170
/*    */     //   89: aload #4
/*    */     //   91: getstatic me/konsolas/aac/m3.c : [Lorg/bukkit/block/BlockFace;
/*    */     //   94: iload #6
/*    */     //   96: aaload
/*    */     //   97: invokeinterface getRelative : (Lorg/bukkit/block/BlockFace;)Lorg/bukkit/block/Block;
/*    */     //   102: astore #7
/*    */     //   104: aload_0
/*    */     //   105: getfield e : [Lorg/bukkit/Material;
/*    */     //   108: iload #6
/*    */     //   110: aload #7
/*    */     //   112: invokeinterface getType : ()Lorg/bukkit/Material;
/*    */     //   117: aastore
/*    */     //   118: aload_0
/*    */     //   119: getfield b : [B
/*    */     //   122: iload #6
/*    */     //   124: aload #7
/*    */     //   126: invokeinterface getData : ()B
/*    */     //   131: bastore
/*    */     //   132: iinc #6, 1
/*    */     //   135: aload #5
/*    */     //   137: lload_1
/*    */     //   138: lconst_0
/*    */     //   139: lcmp
/*    */     //   140: iflt -> 148
/*    */     //   143: ifnull -> 210
/*    */     //   146: aload #5
/*    */     //   148: ifnonnull -> 80
/*    */     //   151: lload_1
/*    */     //   152: lconst_0
/*    */     //   153: lcmp
/*    */     //   154: iflt -> 135
/*    */     //   157: goto -> 170
/*    */     //   160: ldc2_w -8211156981313170906
/*    */     //   163: lload_1
/*    */     //   164: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   169: athrow
/*    */     //   170: lload_1
/*    */     //   171: lconst_0
/*    */     //   172: lcmp
/*    */     //   173: iflt -> 189
/*    */     //   176: aload #5
/*    */     //   178: ifnonnull -> 210
/*    */     //   181: aload_0
/*    */     //   182: getfield e : [Lorg/bukkit/Material;
/*    */     //   185: aconst_null
/*    */     //   186: invokestatic fill : ([Ljava/lang/Object;Ljava/lang/Object;)V
/*    */     //   189: goto -> 202
/*    */     //   192: ldc2_w -8211156981313170906
/*    */     //   195: lload_1
/*    */     //   196: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   201: athrow
/*    */     //   202: aload_0
/*    */     //   203: getfield b : [B
/*    */     //   206: iconst_0
/*    */     //   207: invokestatic fill : ([BB)V
/*    */     //   210: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #9	-> 9
/*    */     //   #6	-> 16
/*    */     //   #37	-> 27
/*    */     //   #57	-> 44
/*    */     //   #5	-> 77
/*    */     //   #8	-> 89
/*    */     //   #35	-> 104
/*    */     //   #67	-> 118
/*    */     //   #44	-> 132
/*    */     //   #12	-> 181
/*    */     //   #31	-> 202
/*    */     //   #33	-> 210
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   16	64	67	aacinternal/v
/*    */     //   104	151	160	aacinternal/v
/*    */     //   170	189	192	aacinternal/v
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/m3.h : J
/*    */     //   3: ldc2_w 33080027716006
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: ldc2_w -5811534505578950615
/*    */     //   11: lload_2
/*    */     //   12: <illegal opcode> w : (JJ)Ljava/lang/String;
/*    */     //   17: astore #4
/*    */     //   19: aload_0
/*    */     //   20: aload #4
/*    */     //   22: ifnull -> 55
/*    */     //   25: aload_1
/*    */     //   26: if_acmpne -> 54
/*    */     //   29: goto -> 42
/*    */     //   32: ldc2_w -5817462050018086034
/*    */     //   35: lload_2
/*    */     //   36: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   41: athrow
/*    */     //   42: iconst_1
/*    */     //   43: ireturn
/*    */     //   44: ldc2_w -5817462050018086034
/*    */     //   47: lload_2
/*    */     //   48: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   53: athrow
/*    */     //   54: aload_1
/*    */     //   55: ifnull -> 100
/*    */     //   58: aload_0
/*    */     //   59: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   62: aload #4
/*    */     //   64: ifnull -> 113
/*    */     //   67: goto -> 80
/*    */     //   70: ldc2_w -5817462050018086034
/*    */     //   73: lload_2
/*    */     //   74: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   79: athrow
/*    */     //   80: aload_1
/*    */     //   81: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   84: if_acmpeq -> 112
/*    */     //   87: goto -> 100
/*    */     //   90: ldc2_w -5817462050018086034
/*    */     //   93: lload_2
/*    */     //   94: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   99: athrow
/*    */     //   100: iconst_0
/*    */     //   101: ireturn
/*    */     //   102: ldc2_w -5817462050018086034
/*    */     //   105: lload_2
/*    */     //   106: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   111: athrow
/*    */     //   112: aload_1
/*    */     //   113: checkcast me/konsolas/aac/m3
/*    */     //   116: astore #5
/*    */     //   118: aload_0
/*    */     //   119: aload #4
/*    */     //   121: ifnull -> 161
/*    */     //   124: getfield a : B
/*    */     //   127: aload #5
/*    */     //   129: getfield a : B
/*    */     //   132: if_icmpeq -> 160
/*    */     //   135: goto -> 148
/*    */     //   138: ldc2_w -5817462050018086034
/*    */     //   141: lload_2
/*    */     //   142: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   147: athrow
/*    */     //   148: iconst_0
/*    */     //   149: ireturn
/*    */     //   150: ldc2_w -5817462050018086034
/*    */     //   153: lload_2
/*    */     //   154: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   159: athrow
/*    */     //   160: aload_0
/*    */     //   161: aload #4
/*    */     //   163: ifnull -> 203
/*    */     //   166: getfield f : Lme/konsolas/aac/kP;
/*    */     //   169: aload #5
/*    */     //   171: getfield f : Lme/konsolas/aac/kP;
/*    */     //   174: if_acmpeq -> 202
/*    */     //   177: goto -> 190
/*    */     //   180: ldc2_w -5817462050018086034
/*    */     //   183: lload_2
/*    */     //   184: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   189: athrow
/*    */     //   190: iconst_0
/*    */     //   191: ireturn
/*    */     //   192: ldc2_w -5817462050018086034
/*    */     //   195: lload_2
/*    */     //   196: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   201: athrow
/*    */     //   202: aload_0
/*    */     //   203: aload #4
/*    */     //   205: ifnull -> 245
/*    */     //   208: getfield g : Lorg/bukkit/Material;
/*    */     //   211: aload #5
/*    */     //   213: getfield g : Lorg/bukkit/Material;
/*    */     //   216: if_acmpeq -> 244
/*    */     //   219: goto -> 232
/*    */     //   222: ldc2_w -5817462050018086034
/*    */     //   225: lload_2
/*    */     //   226: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   231: athrow
/*    */     //   232: iconst_0
/*    */     //   233: ireturn
/*    */     //   234: ldc2_w -5817462050018086034
/*    */     //   237: lload_2
/*    */     //   238: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   243: athrow
/*    */     //   244: aload_0
/*    */     //   245: getfield e : [Lorg/bukkit/Material;
/*    */     //   248: aload #5
/*    */     //   250: getfield e : [Lorg/bukkit/Material;
/*    */     //   253: invokestatic equals : ([Ljava/lang/Object;[Ljava/lang/Object;)Z
/*    */     //   256: aload #4
/*    */     //   258: ifnull -> 301
/*    */     //   261: ifne -> 289
/*    */     //   264: goto -> 277
/*    */     //   267: ldc2_w -5817462050018086034
/*    */     //   270: lload_2
/*    */     //   271: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   276: athrow
/*    */     //   277: iconst_0
/*    */     //   278: ireturn
/*    */     //   279: ldc2_w -5817462050018086034
/*    */     //   282: lload_2
/*    */     //   283: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   288: athrow
/*    */     //   289: aload_0
/*    */     //   290: getfield b : [B
/*    */     //   293: aload #5
/*    */     //   295: getfield b : [B
/*    */     //   298: invokestatic equals : ([B[B)Z
/*    */     //   301: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #10	-> 19
/*    */     //   #50	-> 54
/*    */     //   #15	-> 112
/*    */     //   #16	-> 118
/*    */     //   #39	-> 160
/*    */     //   #13	-> 202
/*    */     //   #25	-> 244
/*    */     //   #62	-> 289
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   19	29	32	aacinternal/v
/*    */     //   25	44	44	aacinternal/v
/*    */     //   55	67	70	aacinternal/v
/*    */     //   58	87	90	aacinternal/v
/*    */     //   80	102	102	aacinternal/v
/*    */     //   118	135	138	aacinternal/v
/*    */     //   124	150	150	aacinternal/v
/*    */     //   161	177	180	aacinternal/v
/*    */     //   166	192	192	aacinternal/v
/*    */     //   203	219	222	aacinternal/v
/*    */     //   208	234	234	aacinternal/v
/*    */     //   245	264	267	aacinternal/v
/*    */     //   261	279	279	aacinternal/v
/*    */   }
/*    */   
/*    */   m3(m3 paramm3) {
/* 64 */     this.e = new Material[6]; this.b = new byte[6]; this.f = paramm3.f; this.g = paramm3.g; this.a = paramm3.a; this.e = (Material[])paramm3.e.clone(); this.b = (byte[])paramm3.b.clone(); } m3(long paramLong, kP paramkP, Block paramBlock) { this.e = new Material[6];
/* 65 */     this.b = new byte[6];
/*    */     a(l, paramkP, paramBlock); }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/*    */     null = this.f.hashCode();
/*    */     null = 31 * null + this.g.hashCode();
/*    */     null = 31 * null + this.a;
/*    */     null = 31 * null + Arrays.hashCode((Object[])this.e);
/*    */     return 31 * null + Arrays.hashCode(this.b);
/*    */   }
/*    */   
/*    */   public G a() {
/*    */     return new m3(this);
/*    */   }
/*    */   
/*    */   public String toString() {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/m3.h : J
/*    */     //   3: ldc2_w 93251522376973
/*    */     //   6: lxor
/*    */     //   7: lstore_1
/*    */     //   8: ldc2_w 284292963668475010
/*    */     //   11: lload_1
/*    */     //   12: <illegal opcode> w : (JJ)Ljava/lang/String;
/*    */     //   17: astore_3
/*    */     //   18: new java/lang/StringBuilder
/*    */     //   21: dup
/*    */     //   22: invokespecial <init> : ()V
/*    */     //   25: sipush #23754
/*    */     //   28: ldc2_w 7297247276353161312
/*    */     //   31: lload_1
/*    */     //   32: lxor
/*    */     //   33: <illegal opcode> t : (IJ)Ljava/lang/String;
/*    */     //   38: iconst_3
/*    */     //   39: anewarray java/lang/Object
/*    */     //   42: dup
/*    */     //   43: iconst_0
/*    */     //   44: aload_0
/*    */     //   45: getfield f : Lme/konsolas/aac/kP;
/*    */     //   48: invokevirtual name : ()Ljava/lang/String;
/*    */     //   51: aastore
/*    */     //   52: dup
/*    */     //   53: iconst_1
/*    */     //   54: new java/lang/StringBuilder
/*    */     //   57: dup
/*    */     //   58: invokespecial <init> : ()V
/*    */     //   61: sipush #16000
/*    */     //   64: ldc2_w 9025473180222220845
/*    */     //   67: lload_1
/*    */     //   68: lxor
/*    */     //   69: <illegal opcode> t : (IJ)Ljava/lang/String;
/*    */     //   74: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   77: aload_0
/*    */     //   78: getfield g : Lorg/bukkit/Material;
/*    */     //   81: invokevirtual name : ()Ljava/lang/String;
/*    */     //   84: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*    */     //   87: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*    */     //   90: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   93: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   96: aastore
/*    */     //   97: dup
/*    */     //   98: iconst_2
/*    */     //   99: aload_0
/*    */     //   100: getfield a : B
/*    */     //   103: invokestatic valueOf : (B)Ljava/lang/Byte;
/*    */     //   106: aastore
/*    */     //   107: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*    */     //   110: aload_3
/*    */     //   111: ifnull -> 365
/*    */     //   114: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   117: getstatic me/konsolas/aac/m3.d : Ljava/util/Set;
/*    */     //   120: aload_0
/*    */     //   121: getfield g : Lorg/bukkit/Material;
/*    */     //   124: invokeinterface contains : (Ljava/lang/Object;)Z
/*    */     //   129: ifeq -> 368
/*    */     //   132: goto -> 145
/*    */     //   135: ldc2_w 283572637442744261
/*    */     //   138: lload_1
/*    */     //   139: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   144: athrow
/*    */     //   145: sipush #12825
/*    */     //   148: ldc2_w 7184129248066430646
/*    */     //   151: lload_1
/*    */     //   152: lxor
/*    */     //   153: <illegal opcode> t : (IJ)Ljava/lang/String;
/*    */     //   158: bipush #12
/*    */     //   160: anewarray java/lang/Object
/*    */     //   163: dup
/*    */     //   164: iconst_0
/*    */     //   165: aload_0
/*    */     //   166: getfield e : [Lorg/bukkit/Material;
/*    */     //   169: iconst_0
/*    */     //   170: aaload
/*    */     //   171: invokevirtual name : ()Ljava/lang/String;
/*    */     //   174: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*    */     //   177: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*    */     //   180: aastore
/*    */     //   181: dup
/*    */     //   182: iconst_1
/*    */     //   183: aload_0
/*    */     //   184: getfield b : [B
/*    */     //   187: iconst_0
/*    */     //   188: baload
/*    */     //   189: invokestatic valueOf : (B)Ljava/lang/Byte;
/*    */     //   192: aastore
/*    */     //   193: dup
/*    */     //   194: iconst_2
/*    */     //   195: aload_0
/*    */     //   196: getfield e : [Lorg/bukkit/Material;
/*    */     //   199: iconst_1
/*    */     //   200: aaload
/*    */     //   201: invokevirtual name : ()Ljava/lang/String;
/*    */     //   204: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*    */     //   207: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*    */     //   210: aastore
/*    */     //   211: dup
/*    */     //   212: iconst_3
/*    */     //   213: aload_0
/*    */     //   214: getfield b : [B
/*    */     //   217: iconst_1
/*    */     //   218: baload
/*    */     //   219: invokestatic valueOf : (B)Ljava/lang/Byte;
/*    */     //   222: aastore
/*    */     //   223: dup
/*    */     //   224: iconst_4
/*    */     //   225: aload_0
/*    */     //   226: getfield e : [Lorg/bukkit/Material;
/*    */     //   229: iconst_2
/*    */     //   230: aaload
/*    */     //   231: invokevirtual name : ()Ljava/lang/String;
/*    */     //   234: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*    */     //   237: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*    */     //   240: aastore
/*    */     //   241: dup
/*    */     //   242: iconst_5
/*    */     //   243: aload_0
/*    */     //   244: getfield b : [B
/*    */     //   247: iconst_2
/*    */     //   248: baload
/*    */     //   249: invokestatic valueOf : (B)Ljava/lang/Byte;
/*    */     //   252: aastore
/*    */     //   253: dup
/*    */     //   254: bipush #6
/*    */     //   256: aload_0
/*    */     //   257: getfield e : [Lorg/bukkit/Material;
/*    */     //   260: iconst_3
/*    */     //   261: aaload
/*    */     //   262: invokevirtual name : ()Ljava/lang/String;
/*    */     //   265: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*    */     //   268: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*    */     //   271: aastore
/*    */     //   272: dup
/*    */     //   273: bipush #7
/*    */     //   275: aload_0
/*    */     //   276: getfield b : [B
/*    */     //   279: iconst_3
/*    */     //   280: baload
/*    */     //   281: invokestatic valueOf : (B)Ljava/lang/Byte;
/*    */     //   284: aastore
/*    */     //   285: dup
/*    */     //   286: bipush #8
/*    */     //   288: aload_0
/*    */     //   289: getfield e : [Lorg/bukkit/Material;
/*    */     //   292: iconst_4
/*    */     //   293: aaload
/*    */     //   294: invokevirtual name : ()Ljava/lang/String;
/*    */     //   297: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*    */     //   300: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*    */     //   303: aastore
/*    */     //   304: dup
/*    */     //   305: bipush #9
/*    */     //   307: aload_0
/*    */     //   308: getfield b : [B
/*    */     //   311: iconst_4
/*    */     //   312: baload
/*    */     //   313: invokestatic valueOf : (B)Ljava/lang/Byte;
/*    */     //   316: aastore
/*    */     //   317: dup
/*    */     //   318: bipush #10
/*    */     //   320: aload_0
/*    */     //   321: getfield e : [Lorg/bukkit/Material;
/*    */     //   324: iconst_5
/*    */     //   325: aaload
/*    */     //   326: invokevirtual name : ()Ljava/lang/String;
/*    */     //   329: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*    */     //   332: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*    */     //   335: aastore
/*    */     //   336: dup
/*    */     //   337: bipush #11
/*    */     //   339: aload_0
/*    */     //   340: getfield b : [B
/*    */     //   343: iconst_5
/*    */     //   344: baload
/*    */     //   345: invokestatic valueOf : (B)Ljava/lang/Byte;
/*    */     //   348: aastore
/*    */     //   349: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*    */     //   352: goto -> 365
/*    */     //   355: ldc2_w 283572637442744261
/*    */     //   358: lload_1
/*    */     //   359: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   364: athrow
/*    */     //   365: goto -> 370
/*    */     //   368: ldc ''
/*    */     //   370: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   373: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   376: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #56	-> 18
/*    */     //   #18	-> 103
/*    */     //   #28	-> 107
/*    */     //   #34	-> 117
/*    */     //   #53	-> 171
/*    */     //   #52	-> 201
/*    */     //   #48	-> 231
/*    */     //   #2	-> 262
/*    */     //   #58	-> 294
/*    */     //   #4	-> 326
/*    */     //   #66	-> 349
/*    */     //   #41	-> 368
/*    */     //   #24	-> 376
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   18	132	135	aacinternal/v
/*    */     //   114	352	355	aacinternal/v
/*    */   }
/*    */   
/*    */   static {
/*    */     // Byte code:
/*    */     //   0: ldc2_w 2680908327900327174
/*    */     //   3: ldc2_w 6347219023221882466
/*    */     //   6: invokestatic lookup : ()Ljava/lang/invoke/MethodHandles$Lookup;
/*    */     //   9: invokevirtual lookupClass : ()Ljava/lang/Class;
/*    */     //   12: invokestatic a : (JJLjava/lang/Object;)Lme/konsolas/aac/na;
/*    */     //   15: ldc2_w 146290376726043
/*    */     //   18: invokeinterface a : (J)J
/*    */     //   23: putstatic me/konsolas/aac/m3.h : J
/*    */     //   26: getstatic me/konsolas/aac/m3.h : J
/*    */     //   29: ldc2_w 10299721712158
/*    */     //   32: lxor
/*    */     //   33: lstore #9
/*    */     //   35: new java/util/HashMap
/*    */     //   38: dup
/*    */     //   39: bipush #13
/*    */     //   41: invokespecial <init> : (I)V
/*    */     //   44: putstatic me/konsolas/aac/m3.k : Ljava/util/Map;
/*    */     //   47: ldc '瞫䒇꽰윃ꭉघケ䨏㦥릻⭝켜ﰕ鲮莁?嘝妐껻瀦'
/*    */     //   49: invokevirtual toCharArray : ()[C
/*    */     //   52: dup
/*    */     //   53: dup
/*    */     //   54: bipush #12
/*    */     //   56: dup_x1
/*    */     //   57: caload
/*    */     //   58: sipush #30302
/*    */     //   61: ixor
/*    */     //   62: i2c
/*    */     //   63: castore
/*    */     //   64: sipush #19970
/*    */     //   67: iconst_0
/*    */     //   68: iconst_0
/*    */     //   69: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   72: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/Cipher;
/*    */     //   75: dup
/*    */     //   76: astore_0
/*    */     //   77: iconst_2
/*    */     //   78: ldc_w '풝㊹㩺ゅ'
/*    */     //   81: invokevirtual toCharArray : ()[C
/*    */     //   84: dup
/*    */     //   85: dup
/*    */     //   86: iconst_0
/*    */     //   87: dup_x1
/*    */     //   88: caload
/*    */     //   89: sipush #1357
/*    */     //   92: ixor
/*    */     //   93: i2c
/*    */     //   94: castore
/*    */     //   95: sipush #30174
/*    */     //   98: iconst_0
/*    */     //   99: iconst_0
/*    */     //   100: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   103: invokestatic getInstance : (Ljava/lang/String;)Ljavax/crypto/SecretKeyFactory;
/*    */     //   106: bipush #8
/*    */     //   108: newarray byte
/*    */     //   110: dup
/*    */     //   111: iconst_0
/*    */     //   112: lload #9
/*    */     //   114: bipush #56
/*    */     //   116: lushr
/*    */     //   117: l2i
/*    */     //   118: i2b
/*    */     //   119: bastore
/*    */     //   120: iconst_1
/*    */     //   121: istore_1
/*    */     //   122: iload_1
/*    */     //   123: bipush #8
/*    */     //   125: if_icmpge -> 149
/*    */     //   128: dup
/*    */     //   129: iload_1
/*    */     //   130: lload #9
/*    */     //   132: iload_1
/*    */     //   133: bipush #8
/*    */     //   135: imul
/*    */     //   136: lshl
/*    */     //   137: bipush #56
/*    */     //   139: lushr
/*    */     //   140: l2i
/*    */     //   141: i2b
/*    */     //   142: bastore
/*    */     //   143: iinc #1, 1
/*    */     //   146: goto -> 122
/*    */     //   149: new javax/crypto/spec/DESKeySpec
/*    */     //   152: dup_x1
/*    */     //   153: swap
/*    */     //   154: invokespecial <init> : ([B)V
/*    */     //   157: invokevirtual generateSecret : (Ljava/security/spec/KeySpec;)Ljavax/crypto/SecretKey;
/*    */     //   160: new javax/crypto/spec/IvParameterSpec
/*    */     //   163: dup
/*    */     //   164: bipush #8
/*    */     //   166: newarray byte
/*    */     //   168: invokespecial <init> : ([B)V
/*    */     //   171: invokevirtual init : (ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
/*    */     //   174: bipush #9
/*    */     //   176: anewarray java/lang/String
/*    */     //   179: astore #7
/*    */     //   181: iconst_0
/*    */     //   182: istore #5
/*    */     //   184: ldc_w '㳻椾髓ᯡ⏧ᢦ壱?뀏⼝䝱ꝁ掜윯귦ᗂ놲杈瀰㾀੟⹜ퟝ?ங첪嗈஧騜歫긔꽈螿䓷歪䎮퐙鴄봯➤鬆뒣珪ⶑ⭒換疊鑬睏ྥ뽤ɏ砐御畇ꮰ傗ꅗᢁ渞蚟⩅쁆갡ᚄ浟탿숃馽᭬墲?勁ᘥꣾ凹퍶샤都⟈ᬫ㸨攸莘Ꙛ跛㧪䰔㍗뀳뜹ಠ?綹윾嵎阾壛枋픯螂긂幍옽Ʋ濾謭蕹승說紙珅ꆣ㓴釖ࣤ㈭㲼砃⤗䆎ꫴ澽勆섑성坁༤஝縷ꈩ똧?챹㒨⑦ἦК쨱?ݪ鬔줚ꫡ䶁顖༬䊴庞Ԫ罶?劂➃哦砨⍖땾먜袮Ⱗ렾ჹᠫ⁸㎊钍੒跎ទ踃쉷톎?ﱺᯐ쪵娯쥼덬ڱ彸۝㏪'
/*    */     //   187: invokevirtual toCharArray : ()[C
/*    */     //   190: dup
/*    */     //   191: dup
/*    */     //   192: bipush #18
/*    */     //   194: dup_x1
/*    */     //   195: caload
/*    */     //   196: sipush #25638
/*    */     //   199: ixor
/*    */     //   200: i2c
/*    */     //   201: castore
/*    */     //   202: sipush #21754
/*    */     //   205: iconst_1
/*    */     //   206: iconst_1
/*    */     //   207: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   210: dup
/*    */     //   211: astore #4
/*    */     //   213: invokevirtual length : ()I
/*    */     //   216: istore #6
/*    */     //   218: bipush #16
/*    */     //   220: istore_3
/*    */     //   221: iconst_m1
/*    */     //   222: istore_2
/*    */     //   223: iinc #2, 1
/*    */     //   226: aload #4
/*    */     //   228: iload_2
/*    */     //   229: dup
/*    */     //   230: iload_3
/*    */     //   231: iadd
/*    */     //   232: invokevirtual substring : (II)Ljava/lang/String;
/*    */     //   235: iconst_m1
/*    */     //   236: goto -> 370
/*    */     //   239: aload #7
/*    */     //   241: swap
/*    */     //   242: iload #5
/*    */     //   244: iinc #5, 1
/*    */     //   247: swap
/*    */     //   248: aastore
/*    */     //   249: iload_2
/*    */     //   250: iload_3
/*    */     //   251: iadd
/*    */     //   252: dup
/*    */     //   253: istore_2
/*    */     //   254: iload #6
/*    */     //   256: if_icmpge -> 269
/*    */     //   259: aload #4
/*    */     //   261: iload_2
/*    */     //   262: invokevirtual charAt : (I)C
/*    */     //   265: istore_3
/*    */     //   266: goto -> 223
/*    */     //   269: ldc_w '㡰኎쮀덣츓ᾲ떭㪬釙褠梅Վ딼?份〩ぇཌ옯꾏꟧뻪﨩朥꓍㗠귺燿'
/*    */     //   272: invokevirtual toCharArray : ()[C
/*    */     //   275: dup
/*    */     //   276: dup
/*    */     //   277: bipush #10
/*    */     //   279: dup_x1
/*    */     //   280: caload
/*    */     //   281: sipush #20568
/*    */     //   284: ixor
/*    */     //   285: i2c
/*    */     //   286: castore
/*    */     //   287: sipush #19560
/*    */     //   290: iconst_1
/*    */     //   291: iconst_0
/*    */     //   292: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   295: dup
/*    */     //   296: astore #4
/*    */     //   298: invokevirtual length : ()I
/*    */     //   301: istore #6
/*    */     //   303: bipush #16
/*    */     //   305: istore_3
/*    */     //   306: iconst_m1
/*    */     //   307: istore_2
/*    */     //   308: iinc #2, 1
/*    */     //   311: aload #4
/*    */     //   313: iload_2
/*    */     //   314: dup
/*    */     //   315: iload_3
/*    */     //   316: iadd
/*    */     //   317: invokevirtual substring : (II)Ljava/lang/String;
/*    */     //   320: iconst_0
/*    */     //   321: goto -> 370
/*    */     //   324: aload #7
/*    */     //   326: swap
/*    */     //   327: iload #5
/*    */     //   329: iinc #5, 1
/*    */     //   332: swap
/*    */     //   333: aastore
/*    */     //   334: iload_2
/*    */     //   335: iload_3
/*    */     //   336: iadd
/*    */     //   337: dup
/*    */     //   338: istore_2
/*    */     //   339: iload #6
/*    */     //   341: if_icmpge -> 354
/*    */     //   344: aload #4
/*    */     //   346: iload_2
/*    */     //   347: invokevirtual charAt : (I)C
/*    */     //   350: istore_3
/*    */     //   351: goto -> 308
/*    */     //   354: aload #7
/*    */     //   356: putstatic me/konsolas/aac/m3.i : [Ljava/lang/String;
/*    */     //   359: bipush #9
/*    */     //   361: anewarray java/lang/String
/*    */     //   364: putstatic me/konsolas/aac/m3.j : [Ljava/lang/String;
/*    */     //   367: goto -> 432
/*    */     //   370: swap
/*    */     //   371: ldc_w '흚坎蠿儭〲ᯮ耼೵䄅囑弹'
/*    */     //   374: invokevirtual toCharArray : ()[C
/*    */     //   377: dup
/*    */     //   378: dup
/*    */     //   379: iconst_5
/*    */     //   380: dup_x1
/*    */     //   381: caload
/*    */     //   382: sipush #27332
/*    */     //   385: ixor
/*    */     //   386: i2c
/*    */     //   387: castore
/*    */     //   388: sipush #16062
/*    */     //   391: iconst_0
/*    */     //   392: iconst_1
/*    */     //   393: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   396: invokevirtual getBytes : (Ljava/lang/String;)[B
/*    */     //   399: aload_0
/*    */     //   400: swap
/*    */     //   401: invokevirtual doFinal : ([B)[B
/*    */     //   404: astore #8
/*    */     //   406: aload #8
/*    */     //   408: invokestatic a : ([B)Ljava/lang/String;
/*    */     //   411: invokevirtual intern : ()Ljava/lang/String;
/*    */     //   414: swap
/*    */     //   415: tableswitch default -> 239, 0 -> 324
/*    */     //   432: ldc org/bukkit/Material
/*    */     //   434: invokestatic noneOf : (Ljava/lang/Class;)Ljava/util/EnumSet;
/*    */     //   437: putstatic me/konsolas/aac/m3.d : Ljava/util/Set;
/*    */     //   440: bipush #6
/*    */     //   442: anewarray org/bukkit/block/BlockFace
/*    */     //   445: dup
/*    */     //   446: iconst_0
/*    */     //   447: getstatic org/bukkit/block/BlockFace.NORTH : Lorg/bukkit/block/BlockFace;
/*    */     //   450: aastore
/*    */     //   451: dup
/*    */     //   452: iconst_1
/*    */     //   453: getstatic org/bukkit/block/BlockFace.EAST : Lorg/bukkit/block/BlockFace;
/*    */     //   456: aastore
/*    */     //   457: dup
/*    */     //   458: iconst_2
/*    */     //   459: getstatic org/bukkit/block/BlockFace.SOUTH : Lorg/bukkit/block/BlockFace;
/*    */     //   462: aastore
/*    */     //   463: dup
/*    */     //   464: iconst_3
/*    */     //   465: getstatic org/bukkit/block/BlockFace.WEST : Lorg/bukkit/block/BlockFace;
/*    */     //   468: aastore
/*    */     //   469: dup
/*    */     //   470: iconst_4
/*    */     //   471: getstatic org/bukkit/block/BlockFace.UP : Lorg/bukkit/block/BlockFace;
/*    */     //   474: aastore
/*    */     //   475: dup
/*    */     //   476: iconst_5
/*    */     //   477: getstatic org/bukkit/block/BlockFace.DOWN : Lorg/bukkit/block/BlockFace;
/*    */     //   480: aastore
/*    */     //   481: putstatic me/konsolas/aac/m3.c : [Lorg/bukkit/block/BlockFace;
/*    */     //   484: invokestatic values : ()[Lorg/bukkit/Material;
/*    */     //   487: astore #11
/*    */     //   489: aload #11
/*    */     //   491: arraylength
/*    */     //   492: istore #12
/*    */     //   494: iconst_0
/*    */     //   495: istore #13
/*    */     //   497: iload #13
/*    */     //   499: iload #12
/*    */     //   501: if_icmpge -> 784
/*    */     //   504: aload #11
/*    */     //   506: iload #13
/*    */     //   508: aaload
/*    */     //   509: astore #14
/*    */     //   511: aload #14
/*    */     //   513: invokevirtual isBlock : ()Z
/*    */     //   516: ifne -> 533
/*    */     //   519: goto -> 778
/*    */     //   522: ldc2_w -5405394469705537322
/*    */     //   525: lload #9
/*    */     //   527: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   532: athrow
/*    */     //   533: aload #14
/*    */     //   535: invokevirtual name : ()Ljava/lang/String;
/*    */     //   538: sipush #28326
/*    */     //   541: ldc2_w 8439459988097502491
/*    */     //   544: lload #9
/*    */     //   546: lxor
/*    */     //   547: <illegal opcode> t : (IJ)Ljava/lang/String;
/*    */     //   552: invokevirtual contains : (Ljava/lang/CharSequence;)Z
/*    */     //   555: ifne -> 753
/*    */     //   558: aload #14
/*    */     //   560: invokevirtual name : ()Ljava/lang/String;
/*    */     //   563: sipush #18351
/*    */     //   566: ldc2_w 8233230442486342672
/*    */     //   569: lload #9
/*    */     //   571: lxor
/*    */     //   572: <illegal opcode> t : (IJ)Ljava/lang/String;
/*    */     //   577: invokevirtual contains : (Ljava/lang/CharSequence;)Z
/*    */     //   580: ifne -> 753
/*    */     //   583: goto -> 597
/*    */     //   586: ldc2_w -5405394469705537322
/*    */     //   589: lload #9
/*    */     //   591: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   596: athrow
/*    */     //   597: aload #14
/*    */     //   599: invokevirtual name : ()Ljava/lang/String;
/*    */     //   602: sipush #19186
/*    */     //   605: ldc2_w 118392859676813642
/*    */     //   608: lload #9
/*    */     //   610: lxor
/*    */     //   611: <illegal opcode> t : (IJ)Ljava/lang/String;
/*    */     //   616: invokevirtual contains : (Ljava/lang/CharSequence;)Z
/*    */     //   619: ifne -> 753
/*    */     //   622: goto -> 636
/*    */     //   625: ldc2_w -5405394469705537322
/*    */     //   628: lload #9
/*    */     //   630: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   635: athrow
/*    */     //   636: aload #14
/*    */     //   638: invokevirtual name : ()Ljava/lang/String;
/*    */     //   641: sipush #10379
/*    */     //   644: ldc2_w 1272426473820834608
/*    */     //   647: lload #9
/*    */     //   649: lxor
/*    */     //   650: <illegal opcode> t : (IJ)Ljava/lang/String;
/*    */     //   655: invokevirtual contains : (Ljava/lang/CharSequence;)Z
/*    */     //   658: ifne -> 753
/*    */     //   661: goto -> 675
/*    */     //   664: ldc2_w -5405394469705537322
/*    */     //   667: lload #9
/*    */     //   669: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   674: athrow
/*    */     //   675: aload #14
/*    */     //   677: invokevirtual name : ()Ljava/lang/String;
/*    */     //   680: sipush #3510
/*    */     //   683: ldc2_w 721989273178959372
/*    */     //   686: lload #9
/*    */     //   688: lxor
/*    */     //   689: <illegal opcode> t : (IJ)Ljava/lang/String;
/*    */     //   694: invokevirtual contains : (Ljava/lang/CharSequence;)Z
/*    */     //   697: ifne -> 753
/*    */     //   700: goto -> 714
/*    */     //   703: ldc2_w -5405394469705537322
/*    */     //   706: lload #9
/*    */     //   708: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   713: athrow
/*    */     //   714: aload #14
/*    */     //   716: invokevirtual name : ()Ljava/lang/String;
/*    */     //   719: sipush #31011
/*    */     //   722: ldc2_w 9183174840715221651
/*    */     //   725: lload #9
/*    */     //   727: lxor
/*    */     //   728: <illegal opcode> t : (IJ)Ljava/lang/String;
/*    */     //   733: invokevirtual contains : (Ljava/lang/CharSequence;)Z
/*    */     //   736: ifeq -> 778
/*    */     //   739: goto -> 753
/*    */     //   742: ldc2_w -5405394469705537322
/*    */     //   745: lload #9
/*    */     //   747: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   752: athrow
/*    */     //   753: getstatic me/konsolas/aac/m3.d : Ljava/util/Set;
/*    */     //   756: aload #14
/*    */     //   758: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   763: pop
/*    */     //   764: goto -> 778
/*    */     //   767: ldc2_w -5405394469705537322
/*    */     //   770: lload #9
/*    */     //   772: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   777: athrow
/*    */     //   778: iinc #13, 1
/*    */     //   781: goto -> 497
/*    */     //   784: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #23	-> 432
/*    */     //   #26	-> 440
/*    */     //   #63	-> 484
/*    */     //   #21	-> 511
/*    */     //   #32	-> 533
/*    */     //   #55	-> 560
/*    */     //   #59	-> 599
/*    */     //   #27	-> 638
/*    */     //   #45	-> 677
/*    */     //   #47	-> 716
/*    */     //   #29	-> 753
/*    */     //   #22	-> 778
/*    */     //   #3	-> 784
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   511	522	522	aacinternal/v
/*    */     //   533	583	586	aacinternal/v
/*    */     //   558	622	625	aacinternal/v
/*    */     //   597	661	664	aacinternal/v
/*    */     //   636	700	703	aacinternal/v
/*    */     //   675	739	742	aacinternal/v
/*    */     //   714	764	767	aacinternal/v
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
/*    */     int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x564A;
/*    */     if (j[i] == null) {
/*    */       Object[] arrayOfObject;
/*    */       try {
/*    */         Long long_ = Long.valueOf(Thread.currentThread().getId());
/*    */         arrayOfObject = (Object[])k.get(long_);
/*    */         if (arrayOfObject == null) {
/*    */           arrayOfObject = new Object[3];
/*    */           "ᲈ山뙰舿靥㳈?㲹␾䒳?౗Ꜷ裙ẛ鐹媦媕⌱".toCharArray()[11] = (char)("ᲈ山뙰舿靥㳈?㲹␾䒳?౗Ꜷ裙ẛ鐹媦媕⌱".toCharArray()[11] ^ 0x7CA2);
/*    */           arrayOfObject[0] = Cipher.getInstance(fW$gy.A("ᲈ山뙰舿靥㳈?㲹␾䒳?౗Ꜷ裙ẛ鐹媦媕⌱".toCharArray(), (short)24316, false, 5));
/*    */           "풆寀䑌".toCharArray()[2] = (char)("풆寀䑌".toCharArray()[2] ^ 0xA3A);
/*    */           arrayOfObject[1] = SecretKeyFactory.getInstance(fW$gy.A("풆寀䑌".toCharArray(), (short)25603, true, 5));
/*    */           arrayOfObject[2] = new IvParameterSpec(new byte[8]);
/*    */           k.put(long_, arrayOfObject);
/*    */         } 
/*    */       } catch (Exception exception) {
/*    */         "强䋿潀覶됛덀劘䢟淌蓝똌添➕솑梳蕨⫃".toCharArray()[14] = (char)("强䋿潀覶됛덀劘䢟淌蓝똌添➕솑梳蕨⫃".toCharArray()[14] ^ 0x86F);
/*    */         throw new RuntimeException(fW$gy.A("强䋿潀覶됛덀劘䢟淌蓝똌添➕솑梳蕨⫃".toCharArray(), (short)29541, false, 4), exception);
/*    */       } 
/*    */       byte[] arrayOfByte1 = new byte[8];
/*    */       arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
/*    */       for (byte b = 1; b < 8; b++)
/*    */         arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
/*    */       DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
/*    */       SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
/*    */       ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
/*    */       "璉끠縠澑䂵ῃ몺魂ᥓ".toCharArray()[7] = (char)("璉끠縠澑䂵ῃ몺魂ᥓ".toCharArray()[7] ^ 0xE38);
/*    */       byte[] arrayOfByte2 = i[i].getBytes(fW$gy.A("璉끠縠澑䂵ῃ몺魂ᥓ".toCharArray(), (short)14397, true, 5));
/*    */       j[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
/*    */     } 
/*    */     return j[i];
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
/*    */     //   50: goto -> 171
/*    */     //   53: astore #4
/*    */     //   55: new java/lang/RuntimeException
/*    */     //   58: dup
/*    */     //   59: new java/lang/StringBuilder
/*    */     //   62: dup
/*    */     //   63: invokespecial <init> : ()V
/*    */     //   66: ldc_w '㮗铑㯇娢㣼檙뗭회廳啐垼䩶藐葺ᰔ?ㆫ'
/*    */     //   69: invokevirtual toCharArray : ()[C
/*    */     //   72: dup
/*    */     //   73: dup
/*    */     //   74: bipush #6
/*    */     //   76: dup_x1
/*    */     //   77: caload
/*    */     //   78: sipush #26082
/*    */     //   81: ixor
/*    */     //   82: i2c
/*    */     //   83: castore
/*    */     //   84: sipush #23374
/*    */     //   87: iconst_1
/*    */     //   88: iconst_4
/*    */     //   89: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   95: ldc_w '芯졌줂ഭ'
/*    */     //   98: invokevirtual toCharArray : ()[C
/*    */     //   101: dup
/*    */     //   102: dup
/*    */     //   103: iconst_2
/*    */     //   104: dup_x1
/*    */     //   105: caload
/*    */     //   106: sipush #15488
/*    */     //   109: ixor
/*    */     //   110: i2c
/*    */     //   111: castore
/*    */     //   112: sipush #25780
/*    */     //   115: iconst_0
/*    */     //   116: iconst_4
/*    */     //   117: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   123: aload_1
/*    */     //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   127: ldc_w '衦욿䎫'
/*    */     //   130: invokevirtual toCharArray : ()[C
/*    */     //   133: dup
/*    */     //   134: dup
/*    */     //   135: iconst_0
/*    */     //   136: dup_x1
/*    */     //   137: caload
/*    */     //   138: sipush #16244
/*    */     //   141: ixor
/*    */     //   142: i2c
/*    */     //   143: castore
/*    */     //   144: sipush #26707
/*    */     //   147: iconst_0
/*    */     //   148: iconst_2
/*    */     //   149: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   152: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   155: aload_2
/*    */     //   156: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   159: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   162: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   165: aload #4
/*    */     //   167: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   170: athrow
/*    */     //   171: aload_3
/*    */     //   172: areturn
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   9	50	53	java/lang/Exception
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\m3.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */