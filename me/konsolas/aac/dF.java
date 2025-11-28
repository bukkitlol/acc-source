/*    */ package me.konsolas.aac;
/*    */ 
/*    */ import aacinternal.v;
/*    */ import java.lang.invoke.CallSite;
/*    */ import java.lang.invoke.MethodHandle;
/*    */ import java.lang.invoke.MethodHandles;
/*    */ import java.lang.invoke.MethodType;
/*    */ import java.lang.invoke.MutableCallSite;
/*    */ import java.util.HashMap;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import javax.crypto.Cipher;
/*    */ import javax.crypto.SecretKey;
/*    */ import javax.crypto.SecretKeyFactory;
/*    */ import javax.crypto.spec.DESKeySpec;
/*    */ import javax.crypto.spec.IvParameterSpec;
/*    */ import org.bukkit.configuration.ConfigurationSection;
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
/*    */ public class df
/*    */ {
/*    */   private final long a;
/*    */   private final List c;
/*    */   private final List b;
/*    */   private final c5 d;
/*    */   private static final long e = nc.a(-7013187233428273586L, -72082793995729036L, MethodHandles.lookup().lookupClass()).a(93959107140757L);
/*    */   
/*    */   public long a() {
/* 40 */     return this.a;
/*    */   }
/*    */   
/*    */   private static final String[] f;
/*    */   private static final String[] g;
/*    */   private static final Map h = new HashMap<>(13);
/*    */   
/*    */   private boolean a(long paramLong, String paramString) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/df.e : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: ldc2_w 6719404721229925505
/*    */     //   9: lload_1
/*    */     //   10: <illegal opcode> w : (JJ)I
/*    */     //   15: aload_0
/*    */     //   16: getfield b : Ljava/util/List;
/*    */     //   19: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   24: astore #5
/*    */     //   26: istore #4
/*    */     //   28: aload #5
/*    */     //   30: invokeinterface hasNext : ()Z
/*    */     //   35: ifeq -> 111
/*    */     //   38: aload #5
/*    */     //   40: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   45: checkcast java/util/regex/Pattern
/*    */     //   48: astore #6
/*    */     //   50: aload #6
/*    */     //   52: aload_3
/*    */     //   53: invokevirtual matcher : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
/*    */     //   56: invokevirtual matches : ()Z
/*    */     //   59: iload #4
/*    */     //   61: lload_1
/*    */     //   62: lconst_0
/*    */     //   63: lcmp
/*    */     //   64: iflt -> 72
/*    */     //   67: ifeq -> 135
/*    */     //   70: iload #4
/*    */     //   72: ifeq -> 105
/*    */     //   75: goto -> 88
/*    */     //   78: ldc2_w 6721984438653214451
/*    */     //   81: lload_1
/*    */     //   82: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   87: athrow
/*    */     //   88: ifeq -> 106
/*    */     //   91: goto -> 104
/*    */     //   94: ldc2_w 6721984438653214451
/*    */     //   97: lload_1
/*    */     //   98: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   103: athrow
/*    */     //   104: iconst_0
/*    */     //   105: ireturn
/*    */     //   106: iload #4
/*    */     //   108: ifne -> 28
/*    */     //   111: aload_0
/*    */     //   112: getfield c : Ljava/util/List;
/*    */     //   115: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   120: lload_1
/*    */     //   121: lconst_0
/*    */     //   122: lcmp
/*    */     //   123: ifle -> 45
/*    */     //   126: astore #5
/*    */     //   128: aload #5
/*    */     //   130: invokeinterface hasNext : ()Z
/*    */     //   135: ifeq -> 211
/*    */     //   138: aload #5
/*    */     //   140: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   145: checkcast java/util/regex/Pattern
/*    */     //   148: astore #6
/*    */     //   150: aload #6
/*    */     //   152: aload_3
/*    */     //   153: invokevirtual matcher : (Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
/*    */     //   156: invokevirtual matches : ()Z
/*    */     //   159: iload #4
/*    */     //   161: lload_1
/*    */     //   162: lconst_0
/*    */     //   163: lcmp
/*    */     //   164: ifle -> 172
/*    */     //   167: ifeq -> 212
/*    */     //   170: iload #4
/*    */     //   172: ifeq -> 205
/*    */     //   175: goto -> 188
/*    */     //   178: ldc2_w 6721984438653214451
/*    */     //   181: lload_1
/*    */     //   182: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   187: athrow
/*    */     //   188: ifeq -> 206
/*    */     //   191: goto -> 204
/*    */     //   194: ldc2_w 6721984438653214451
/*    */     //   197: lload_1
/*    */     //   198: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   203: athrow
/*    */     //   204: iconst_1
/*    */     //   205: ireturn
/*    */     //   206: iload #4
/*    */     //   208: ifne -> 128
/*    */     //   211: iconst_0
/*    */     //   212: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #7	-> 15
/*    */     //   #37	-> 50
/*    */     //   #5	-> 106
/*    */     //   #14	-> 111
/*    */     //   #29	-> 150
/*    */     //   #20	-> 206
/*    */     //   #23	-> 211
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   50	75	78	aacinternal/v
/*    */     //   70	91	94	aacinternal/v
/*    */     //   150	175	178	aacinternal/v
/*    */     //   170	191	194	aacinternal/v
/*    */   }
/*    */   
/*    */   public List a(char paramChar, int paramInt, short paramShort, jX paramjX) {
/*    */     // Byte code:
/*    */     //   0: iload_1
/*    */     //   1: i2l
/*    */     //   2: bipush #48
/*    */     //   4: lshl
/*    */     //   5: iload_2
/*    */     //   6: i2l
/*    */     //   7: bipush #32
/*    */     //   9: lshl
/*    */     //   10: bipush #16
/*    */     //   12: lushr
/*    */     //   13: lor
/*    */     //   14: iload_3
/*    */     //   15: i2l
/*    */     //   16: bipush #48
/*    */     //   18: lshl
/*    */     //   19: bipush #48
/*    */     //   21: lushr
/*    */     //   22: lor
/*    */     //   23: getstatic me/konsolas/aac/df.e : J
/*    */     //   26: lxor
/*    */     //   27: lstore #5
/*    */     //   29: lload #5
/*    */     //   31: dup2
/*    */     //   32: ldc2_w 10192430310195
/*    */     //   35: lxor
/*    */     //   36: lstore #7
/*    */     //   38: pop2
/*    */     //   39: ldc2_w -4752116884062081076
/*    */     //   42: lload #5
/*    */     //   44: <illegal opcode> w : (JJ)I
/*    */     //   49: dconst_0
/*    */     //   50: dstore #10
/*    */     //   52: istore #9
/*    */     //   54: aload #4
/*    */     //   56: invokevirtual a : ()Ljava/util/List;
/*    */     //   59: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   64: astore #12
/*    */     //   66: aload #12
/*    */     //   68: invokeinterface hasNext : ()Z
/*    */     //   73: ifeq -> 145
/*    */     //   76: aload #12
/*    */     //   78: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   83: checkcast me/konsolas/aac/ah
/*    */     //   86: astore #13
/*    */     //   88: aload_0
/*    */     //   89: aload #13
/*    */     //   91: invokevirtual a : ()Ljava/util/Map;
/*    */     //   94: sipush #14300
/*    */     //   97: ldc2_w 5749877676130039748
/*    */     //   100: lload #5
/*    */     //   102: lxor
/*    */     //   103: <illegal opcode> l : (IJ)Ljava/lang/String;
/*    */     //   108: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   113: lload #7
/*    */     //   115: dup2_x1
/*    */     //   116: pop2
/*    */     //   117: checkcast java/lang/String
/*    */     //   120: invokespecial a : (JLjava/lang/String;)Z
/*    */     //   123: iload_3
/*    */     //   124: ifle -> 142
/*    */     //   127: ifeq -> 140
/*    */     //   130: dload #10
/*    */     //   132: aload #13
/*    */     //   134: invokevirtual a : ()D
/*    */     //   137: dadd
/*    */     //   138: dstore #10
/*    */     //   140: iload #9
/*    */     //   142: ifne -> 66
/*    */     //   145: aconst_null
/*    */     //   146: astore #12
/*    */     //   148: aload_0
/*    */     //   149: getfield d : Lme/konsolas/aac/c5;
/*    */     //   152: invokeinterface a : ()Lme/konsolas/aac/hy;
/*    */     //   157: invokeinterface b : ()Lme/konsolas/aac/ea;
/*    */     //   162: astore #13
/*    */     //   164: aload #13
/*    */     //   166: invokeinterface hasNext : ()Z
/*    */     //   171: ifeq -> 365
/*    */     //   174: aload #13
/*    */     //   176: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   181: checkcast me/konsolas/aac/eB
/*    */     //   184: astore #14
/*    */     //   186: aload #14
/*    */     //   188: iload #9
/*    */     //   190: iload_2
/*    */     //   191: iflt -> 373
/*    */     //   194: ifeq -> 371
/*    */     //   197: iload #9
/*    */     //   199: iload_2
/*    */     //   200: iflt -> 268
/*    */     //   203: ifeq -> 266
/*    */     //   206: goto -> 220
/*    */     //   209: ldc2_w -4754603724942787138
/*    */     //   212: lload #5
/*    */     //   214: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   219: athrow
/*    */     //   220: invokeinterface a : ()I
/*    */     //   225: i2d
/*    */     //   226: dload #10
/*    */     //   228: dcmpg
/*    */     //   229: iload_1
/*    */     //   230: iflt -> 362
/*    */     //   233: ifge -> 360
/*    */     //   236: goto -> 250
/*    */     //   239: ldc2_w -4754603724942787138
/*    */     //   242: lload #5
/*    */     //   244: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   249: athrow
/*    */     //   250: aload #12
/*    */     //   252: goto -> 266
/*    */     //   255: ldc2_w -4754603724942787138
/*    */     //   258: lload #5
/*    */     //   260: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   265: athrow
/*    */     //   266: iload #9
/*    */     //   268: ifeq -> 358
/*    */     //   271: ifnull -> 342
/*    */     //   274: goto -> 288
/*    */     //   277: ldc2_w -4754603724942787138
/*    */     //   280: lload #5
/*    */     //   282: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   287: athrow
/*    */     //   288: aload #14
/*    */     //   290: iload #9
/*    */     //   292: ifeq -> 358
/*    */     //   295: goto -> 309
/*    */     //   298: ldc2_w -4754603724942787138
/*    */     //   301: lload #5
/*    */     //   303: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   308: athrow
/*    */     //   309: invokeinterface a : ()I
/*    */     //   314: iload_1
/*    */     //   315: iflt -> 362
/*    */     //   318: aload #12
/*    */     //   320: invokeinterface a : ()I
/*    */     //   325: if_icmple -> 360
/*    */     //   328: goto -> 342
/*    */     //   331: ldc2_w -4754603724942787138
/*    */     //   334: lload #5
/*    */     //   336: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   341: athrow
/*    */     //   342: aload #14
/*    */     //   344: goto -> 358
/*    */     //   347: ldc2_w -4754603724942787138
/*    */     //   350: lload #5
/*    */     //   352: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   357: athrow
/*    */     //   358: astore #12
/*    */     //   360: iload #9
/*    */     //   362: ifne -> 164
/*    */     //   365: iload_1
/*    */     //   366: iflt -> 408
/*    */     //   369: aload #12
/*    */     //   371: iload #9
/*    */     //   373: ifeq -> 415
/*    */     //   376: ifnonnull -> 408
/*    */     //   379: goto -> 393
/*    */     //   382: ldc2_w -4754603724942787138
/*    */     //   385: lload #5
/*    */     //   387: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   392: athrow
/*    */     //   393: aconst_null
/*    */     //   394: goto -> 418
/*    */     //   397: ldc2_w -4754603724942787138
/*    */     //   400: lload #5
/*    */     //   402: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   407: athrow
/*    */     //   408: aload #12
/*    */     //   410: invokeinterface getValue : ()Ljava/lang/Object;
/*    */     //   415: checkcast java/util/List
/*    */     //   418: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #17	-> 49
/*    */     //   #2	-> 54
/*    */     //   #34	-> 88
/*    */     //   #31	-> 130
/*    */     //   #15	-> 140
/*    */     //   #28	-> 145
/*    */     //   #18	-> 148
/*    */     //   #21	-> 186
/*    */     //   #26	-> 250
/*    */     //   #11	-> 342
/*    */     //   #4	-> 360
/*    */     //   #13	-> 365
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   186	206	209	aacinternal/v
/*    */     //   197	236	239	aacinternal/v
/*    */     //   220	252	255	aacinternal/v
/*    */     //   266	274	277	aacinternal/v
/*    */     //   271	295	298	aacinternal/v
/*    */     //   288	328	331	aacinternal/v
/*    */     //   309	344	347	aacinternal/v
/*    */     //   371	379	382	aacinternal/v
/*    */     //   376	397	397	aacinternal/v
/*    */   }
/*    */   
/*    */   public df(ConfigurationSection paramConfigurationSection, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/df.e : J
/*    */     //   3: lload_2
/*    */     //   4: lxor
/*    */     //   5: lstore_2
/*    */     //   6: ldc2_w -8881569656122190465
/*    */     //   9: lload_2
/*    */     //   10: <illegal opcode> w : (JJ)I
/*    */     //   15: aload_0
/*    */     //   16: invokespecial <init> : ()V
/*    */     //   19: istore #4
/*    */     //   21: aload_0
/*    */     //   22: new java/util/ArrayList
/*    */     //   25: dup
/*    */     //   26: invokespecial <init> : ()V
/*    */     //   29: putfield c : Ljava/util/List;
/*    */     //   32: aload_0
/*    */     //   33: new java/util/ArrayList
/*    */     //   36: dup
/*    */     //   37: invokespecial <init> : ()V
/*    */     //   40: putfield b : Ljava/util/List;
/*    */     //   43: aload_0
/*    */     //   44: new me/konsolas/aac/i7
/*    */     //   47: dup
/*    */     //   48: invokespecial <init> : ()V
/*    */     //   51: putfield d : Lme/konsolas/aac/c5;
/*    */     //   54: aload_0
/*    */     //   55: ldc2_w 20.0
/*    */     //   58: aload_1
/*    */     //   59: sipush #19943
/*    */     //   62: ldc2_w 4161931931864708937
/*    */     //   65: lload_2
/*    */     //   66: lxor
/*    */     //   67: <illegal opcode> l : (IJ)Ljava/lang/String;
/*    */     //   72: dconst_0
/*    */     //   73: invokeinterface getDouble : (Ljava/lang/String;D)D
/*    */     //   78: dmul
/*    */     //   79: d2l
/*    */     //   80: putfield a : J
/*    */     //   83: aload_1
/*    */     //   84: sipush #29409
/*    */     //   87: ldc2_w 4467131004840937547
/*    */     //   90: lload_2
/*    */     //   91: lxor
/*    */     //   92: <illegal opcode> l : (IJ)Ljava/lang/String;
/*    */     //   97: invokeinterface getStringList : (Ljava/lang/String;)Ljava/util/List;
/*    */     //   102: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   107: astore #5
/*    */     //   109: aload #5
/*    */     //   111: invokeinterface hasNext : ()Z
/*    */     //   116: ifeq -> 427
/*    */     //   119: aload #5
/*    */     //   121: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   126: checkcast java/lang/String
/*    */     //   129: astore #6
/*    */     //   131: aload #6
/*    */     //   133: ldc '錫汲'
/*    */     //   135: invokevirtual toCharArray : ()[C
/*    */     //   138: dup
/*    */     //   139: dup
/*    */     //   140: iconst_0
/*    */     //   141: dup_x1
/*    */     //   142: caload
/*    */     //   143: sipush #30678
/*    */     //   146: ixor
/*    */     //   147: i2c
/*    */     //   148: castore
/*    */     //   149: sipush #14737
/*    */     //   152: iconst_0
/*    */     //   153: iconst_1
/*    */     //   154: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   157: invokevirtual startsWith : (Ljava/lang/String;)Z
/*    */     //   160: iload #4
/*    */     //   162: ifeq -> 421
/*    */     //   165: ifeq -> 309
/*    */     //   168: goto -> 181
/*    */     //   171: ldc2_w -8883626581647685875
/*    */     //   174: lload_2
/*    */     //   175: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   180: athrow
/*    */     //   181: aload_0
/*    */     //   182: getfield b : Ljava/util/List;
/*    */     //   185: new java/lang/StringBuilder
/*    */     //   188: dup
/*    */     //   189: invokespecial <init> : ()V
/*    */     //   192: sipush #5534
/*    */     //   195: ldc2_w 4853671159158009651
/*    */     //   198: lload_2
/*    */     //   199: lxor
/*    */     //   200: <illegal opcode> l : (IJ)Ljava/lang/String;
/*    */     //   205: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   208: aload #6
/*    */     //   210: iconst_1
/*    */     //   211: invokevirtual substring : (I)Ljava/lang/String;
/*    */     //   214: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   217: sipush #13643
/*    */     //   220: ldc2_w 8174989700084322282
/*    */     //   223: lload_2
/*    */     //   224: lxor
/*    */     //   225: <illegal opcode> l : (IJ)Ljava/lang/String;
/*    */     //   230: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   233: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   236: ldc '⽐䓰'
/*    */     //   238: invokevirtual toCharArray : ()[C
/*    */     //   241: dup
/*    */     //   242: dup
/*    */     //   243: iconst_0
/*    */     //   244: dup_x1
/*    */     //   245: caload
/*    */     //   246: sipush #5029
/*    */     //   249: ixor
/*    */     //   250: i2c
/*    */     //   251: castore
/*    */     //   252: sipush #27692
/*    */     //   255: iconst_0
/*    */     //   256: iconst_1
/*    */     //   257: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   260: sipush #3164
/*    */     //   263: ldc2_w 5870983810812671733
/*    */     //   266: lload_2
/*    */     //   267: lxor
/*    */     //   268: <illegal opcode> l : (IJ)Ljava/lang/String;
/*    */     //   273: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
/*    */     //   276: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
/*    */     //   279: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   284: pop
/*    */     //   285: iload #4
/*    */     //   287: lload_2
/*    */     //   288: lconst_0
/*    */     //   289: lcmp
/*    */     //   290: iflt -> 424
/*    */     //   293: ifne -> 422
/*    */     //   296: goto -> 309
/*    */     //   299: ldc2_w -8883626581647685875
/*    */     //   302: lload_2
/*    */     //   303: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   308: athrow
/*    */     //   309: aload_0
/*    */     //   310: getfield c : Ljava/util/List;
/*    */     //   313: new java/lang/StringBuilder
/*    */     //   316: dup
/*    */     //   317: invokespecial <init> : ()V
/*    */     //   320: sipush #32282
/*    */     //   323: ldc2_w 2986097883815904442
/*    */     //   326: lload_2
/*    */     //   327: lxor
/*    */     //   328: <illegal opcode> l : (IJ)Ljava/lang/String;
/*    */     //   333: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   336: aload #6
/*    */     //   338: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   341: sipush #25332
/*    */     //   344: ldc2_w 3180432464590739544
/*    */     //   347: lload_2
/*    */     //   348: lxor
/*    */     //   349: <illegal opcode> l : (IJ)Ljava/lang/String;
/*    */     //   354: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   357: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   360: ldc '쉉᫂'
/*    */     //   362: invokevirtual toCharArray : ()[C
/*    */     //   365: dup
/*    */     //   366: dup
/*    */     //   367: iconst_0
/*    */     //   368: dup_x1
/*    */     //   369: caload
/*    */     //   370: sipush #15032
/*    */     //   373: ixor
/*    */     //   374: i2c
/*    */     //   375: castore
/*    */     //   376: sipush #18184
/*    */     //   379: iconst_1
/*    */     //   380: iconst_1
/*    */     //   381: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   384: sipush #30488
/*    */     //   387: ldc2_w 7665308385214664112
/*    */     //   390: lload_2
/*    */     //   391: lxor
/*    */     //   392: <illegal opcode> l : (IJ)Ljava/lang/String;
/*    */     //   397: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
/*    */     //   400: invokestatic compile : (Ljava/lang/String;)Ljava/util/regex/Pattern;
/*    */     //   403: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   408: goto -> 421
/*    */     //   411: ldc2_w -8883626581647685875
/*    */     //   414: lload_2
/*    */     //   415: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   420: athrow
/*    */     //   421: pop
/*    */     //   422: iload #4
/*    */     //   424: ifne -> 109
/*    */     //   427: aload_1
/*    */     //   428: sipush #24772
/*    */     //   431: ldc2_w 2781341663864101483
/*    */     //   434: lload_2
/*    */     //   435: lxor
/*    */     //   436: <illegal opcode> l : (IJ)Ljava/lang/String;
/*    */     //   441: invokeinterface getConfigurationSection : (Ljava/lang/String;)Lorg/bukkit/configuration/ConfigurationSection;
/*    */     //   446: lload_2
/*    */     //   447: lconst_0
/*    */     //   448: lcmp
/*    */     //   449: ifle -> 126
/*    */     //   452: astore #5
/*    */     //   454: aload #5
/*    */     //   456: iload #4
/*    */     //   458: lload_2
/*    */     //   459: lconst_0
/*    */     //   460: lcmp
/*    */     //   461: iflt -> 486
/*    */     //   464: ifeq -> 485
/*    */     //   467: ifnull -> 646
/*    */     //   470: goto -> 483
/*    */     //   473: ldc2_w -8883626581647685875
/*    */     //   476: lload_2
/*    */     //   477: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   482: athrow
/*    */     //   483: aload #5
/*    */     //   485: iconst_0
/*    */     //   486: invokeinterface getKeys : (Z)Ljava/util/Set;
/*    */     //   491: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   496: astore #6
/*    */     //   498: aload #6
/*    */     //   500: invokeinterface hasNext : ()Z
/*    */     //   505: ifeq -> 646
/*    */     //   508: aload #6
/*    */     //   510: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   515: checkcast java/lang/String
/*    */     //   518: astore #7
/*    */     //   520: aload #5
/*    */     //   522: aload #7
/*    */     //   524: invokeinterface get : (Ljava/lang/String;)Ljava/lang/Object;
/*    */     //   529: iload #4
/*    */     //   531: ifeq -> 640
/*    */     //   534: instanceof java/lang/String
/*    */     //   537: ifeq -> 604
/*    */     //   540: goto -> 553
/*    */     //   543: ldc2_w -8883626581647685875
/*    */     //   546: lload_2
/*    */     //   547: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   552: athrow
/*    */     //   553: aload_0
/*    */     //   554: getfield d : Lme/konsolas/aac/c5;
/*    */     //   557: aload #7
/*    */     //   559: invokestatic parseInt : (Ljava/lang/String;)I
/*    */     //   562: aload #5
/*    */     //   564: aload #7
/*    */     //   566: invokeinterface getString : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   571: invokestatic singletonList : (Ljava/lang/Object;)Ljava/util/List;
/*    */     //   574: invokeinterface b : (ILjava/lang/Object;)Ljava/lang/Object;
/*    */     //   579: pop
/*    */     //   580: iload #4
/*    */     //   582: lload_2
/*    */     //   583: lconst_0
/*    */     //   584: lcmp
/*    */     //   585: iflt -> 643
/*    */     //   588: ifne -> 641
/*    */     //   591: goto -> 604
/*    */     //   594: ldc2_w -8883626581647685875
/*    */     //   597: lload_2
/*    */     //   598: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   603: athrow
/*    */     //   604: aload_0
/*    */     //   605: getfield d : Lme/konsolas/aac/c5;
/*    */     //   608: aload #7
/*    */     //   610: invokestatic parseInt : (Ljava/lang/String;)I
/*    */     //   613: aload #5
/*    */     //   615: aload #7
/*    */     //   617: invokeinterface getStringList : (Ljava/lang/String;)Ljava/util/List;
/*    */     //   622: invokeinterface b : (ILjava/lang/Object;)Ljava/lang/Object;
/*    */     //   627: goto -> 640
/*    */     //   630: ldc2_w -8883626581647685875
/*    */     //   633: lload_2
/*    */     //   634: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   639: athrow
/*    */     //   640: pop
/*    */     //   641: iload #4
/*    */     //   643: ifne -> 498
/*    */     //   646: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #24	-> 15
/*    */     //   #22	-> 21
/*    */     //   #25	-> 32
/*    */     //   #27	-> 43
/*    */     //   #1	-> 54
/*    */     //   #38	-> 83
/*    */     //   #39	-> 131
/*    */     //   #19	-> 181
/*    */     //   #3	-> 309
/*    */     //   #33	-> 422
/*    */     //   #32	-> 427
/*    */     //   #36	-> 454
/*    */     //   #6	-> 483
/*    */     //   #30	-> 520
/*    */     //   #8	-> 553
/*    */     //   #9	-> 566
/*    */     //   #16	-> 574
/*    */     //   #12	-> 604
/*    */     //   #35	-> 641
/*    */     //   #10	-> 646
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   131	168	171	aacinternal/v
/*    */     //   165	296	299	aacinternal/v
/*    */     //   181	408	411	aacinternal/v
/*    */     //   454	470	473	aacinternal/v
/*    */     //   520	540	543	aacinternal/v
/*    */     //   534	591	594	aacinternal/v
/*    */     //   553	627	630	aacinternal/v
/*    */   }
/*    */   
/*    */   static {
/*    */     long l = e ^ 0x169807A92A15L;
/*    */     "駦栾쥋㧲尵驒풹Ꭵ遊뵓쐐濥ᆨ뎓䑔픆؞鑃댞ߟ".toCharArray()[18] = (char)("駦栾쥋㧲尵驒풹Ꭵ遊뵓쐐濥ᆨ뎓䑔픆؞鑃댞ߟ".toCharArray()[18] ^ 0x371B);
/*    */     "㣍폭噺廧".toCharArray()[0] = (char)("㣍폭噺廧".toCharArray()[0] ^ 0x1219);
/*    */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*    */     for (byte b1 = 1; b1 < 8; b1++)
/*    */       (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
/*    */     Cipher cipher;
/*    */     (cipher = Cipher.getInstance(hY$g6.H("駦栾쥋㧲尵驒풹Ꭵ遊뵓쐐濥ᆨ뎓䑔픆؞鑃댞ߟ".toCharArray(), (short)8081, (byte)0, (byte)1))).init(2, SecretKeyFactory.getInstance(hY$g6.H("㣍폭噺廧".toCharArray(), (short)15307, (byte)0, (byte)2)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*    */     String[] arrayOfString = new String[10];
/*    */     boolean bool = false;
/*    */     "ⅽ鰕䏳ᘽꢫ缻巟ꕤ䖑돈駟櫰咈㘐聐侞ぼ姰剴⭮¸셤秫憉飄?魖ꙗ쳙?✵ꉩᤆ㿎㭓ℵ࠱朞棍▾᳦㨌牻롌ᾦ䱕䘐蔧뀶?螷ᝮ컙眧卜뙊鬞ꪴ춛⡶쨳ﳔ淮⵺핿뾫ꎜჟ诲猪ꈤ떅煴쩥⾡⬒槷誳?䎔ㅧ쒴냭⛏⪏矝냗ﳌ힎菸苫릒걂꺖둹㵦낈ꇼ蕡䡐稭氛緞鱔娭燯㑒誋妳簭?䍚Ꙋ෍ﾶ혚⁧좹㛜桏ᛚꗱߍ뷐젇寣៣ᮘ똗⨓뤠䉵聞?죑᫪빅ᩋ⟯뢉ഗ晶紈".toCharArray()[125] = (char)("ⅽ鰕䏳ᘽꢫ缻巟ꕤ䖑돈駟櫰咈㘐聐侞ぼ姰剴⭮¸셤秫憉飄?魖ꙗ쳙?✵ꉩᤆ㿎㭓ℵ࠱朞棍▾᳦㨌牻롌ᾦ䱕䘐蔧뀶?螷ᝮ컙眧卜뙊鬞ꪴ춛⡶쨳ﳔ淮⵺핿뾫ꎜჟ诲猪ꈤ떅煴쩥⾡⬒槷誳?䎔ㅧ쒴냭⛏⪏矝냗ﳌ힎菸苫릒걂꺖둹㵦낈ꇼ蕡䡐稭氛緞鱔娭燯㑒誋妳簭?䍚Ꙋ෍ﾶ혚⁧좹㛜桏ᛚꗱߍ뷐젇寣៣ᮘ똗⨓뤠䉵聞?죑᫪빅ᩋ⟯뢉ഗ晶紈".toCharArray()[125] ^ 0x2CA0);
/*    */     String str;
/*    */     int i = (str = hY$g6.H("ⅽ鰕䏳ᘽꢫ缻巟ꕤ䖑돈駟櫰咈㘐聐侞ぼ姰剴⭮¸셤秫憉飄?魖ꙗ쳙?✵ꉩᤆ㿎㭓ℵ࠱朞棍▾᳦㨌牻롌ᾦ䱕䘐蔧뀶?螷ᝮ컙眧卜뙊鬞ꪴ춛⡶쨳ﳔ淮⵺핿뾫ꎜჟ诲猪ꈤ떅煴쩥⾡⬒槷誳?䎔ㅧ쒴냭⛏⪏矝냗ﳌ힎菸苫릒걂꺖둹㵦낈ꇼ蕡䡐稭氛緞鱔娭燯㑒誋妳簭?䍚Ꙋ෍ﾶ혚⁧좹㛜桏ᛚꗱߍ뷐젇寣៣ᮘ똗⨓뤠䉵聞?죑᫪빅ᩋ⟯뢉ഗ晶紈".toCharArray(), (short)13438, (byte)5, (byte)3)).length();
/*    */     byte b2 = 16;
/*    */     byte b = -1;
/*    */     while (true);
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
/*    */     int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x7F8A;
/*    */     if (g[i] == null) {
/*    */       Object[] arrayOfObject;
/*    */       try {
/*    */         Long long_ = Long.valueOf(Thread.currentThread().getId());
/*    */         arrayOfObject = (Object[])h.get(long_);
/*    */         if (arrayOfObject == null) {
/*    */           arrayOfObject = new Object[3];
/*    */           "쐦渮ಕ㨣ẘ鯆瘝뇄빳狕鑕젉囀㣘᧜Ⳃ稲簕荷䭙杲".toCharArray()[6] = (char)("쐦渮ಕ㨣ẘ鯆瘝뇄빳狕鑕젉囀㣘᧜Ⳃ稲簕荷䭙杲".toCharArray()[6] ^ 0x6999);
/*    */           arrayOfObject[0] = Cipher.getInstance(fW$gy.A("쐦渮ಕ㨣ẘ鯆瘝뇄빳狕鑕젉囀㣘᧜Ⳃ稲簕荷䭙杲".toCharArray(), (short)8767, true, 5));
/*    */           "?⁪䶤夓".toCharArray()[2] = (char)("?⁪䶤夓".toCharArray()[2] ^ 0x5640);
/*    */           arrayOfObject[1] = SecretKeyFactory.getInstance(fW$gy.A("?⁪䶤夓".toCharArray(), (short)10061, false, 5));
/*    */           arrayOfObject[2] = new IvParameterSpec(new byte[8]);
/*    */           h.put(long_, arrayOfObject);
/*    */         } 
/*    */       } catch (Exception exception) {
/*    */         "궣㊈䵌浳⌴೽䚎핆??䊟鬂൤攽覄ꓳ⸅".toCharArray()[13] = (char)("궣㊈䵌浳⌴೽䚎핆??䊟鬂൤攽覄ꓳ⸅".toCharArray()[13] ^ 0x5E8E);
/*    */         throw new RuntimeException(fW$gy.A("궣㊈䵌浳⌴೽䚎핆??䊟鬂൤攽覄ꓳ⸅".toCharArray(), (short)9364, true, 3), exception);
/*    */       } 
/*    */       byte[] arrayOfByte1 = new byte[8];
/*    */       arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
/*    */       for (byte b = 1; b < 8; b++)
/*    */         arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
/*    */       DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
/*    */       SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
/*    */       ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
/*    */       "樈髿࢜?㲌덂ﮱ₝럃瞤ປ".toCharArray()[4] = (char)("樈髿࢜?㲌덂ﮱ₝럃瞤ປ".toCharArray()[4] ^ 0x6EEF);
/*    */       byte[] arrayOfByte2 = f[i].getBytes(fW$gy.A("樈髿࢜?㲌덂ﮱ₝럃瞤ປ".toCharArray(), (short)2302, false, 5));
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
/*    */     //   50: goto -> 171
/*    */     //   53: astore #4
/*    */     //   55: new java/lang/RuntimeException
/*    */     //   58: dup
/*    */     //   59: new java/lang/StringBuilder
/*    */     //   62: dup
/*    */     //   63: invokespecial <init> : ()V
/*    */     //   66: ldc_w '⼤鞣ㄒ燤攞ꓺ屧阄禥骹颛?뵳묧债?㊡婸'
/*    */     //   69: invokevirtual toCharArray : ()[C
/*    */     //   72: dup
/*    */     //   73: dup
/*    */     //   74: bipush #17
/*    */     //   76: dup_x1
/*    */     //   77: caload
/*    */     //   78: sipush #3418
/*    */     //   81: ixor
/*    */     //   82: i2c
/*    */     //   83: castore
/*    */     //   84: sipush #24892
/*    */     //   87: iconst_1
/*    */     //   88: iconst_3
/*    */     //   89: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   95: ldc_w '䄼֬㶂'
/*    */     //   98: invokevirtual toCharArray : ()[C
/*    */     //   101: dup
/*    */     //   102: dup
/*    */     //   103: iconst_2
/*    */     //   104: dup_x1
/*    */     //   105: caload
/*    */     //   106: sipush #25549
/*    */     //   109: ixor
/*    */     //   110: i2c
/*    */     //   111: castore
/*    */     //   112: sipush #19990
/*    */     //   115: iconst_1
/*    */     //   116: iconst_1
/*    */     //   117: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   123: aload_1
/*    */     //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   127: ldc_w 'Ǟ쒶蒀⮡'
/*    */     //   130: invokevirtual toCharArray : ()[C
/*    */     //   133: dup
/*    */     //   134: dup
/*    */     //   135: iconst_0
/*    */     //   136: dup_x1
/*    */     //   137: caload
/*    */     //   138: sipush #31412
/*    */     //   141: ixor
/*    */     //   142: i2c
/*    */     //   143: castore
/*    */     //   144: sipush #1949
/*    */     //   147: iconst_1
/*    */     //   148: iconst_4
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


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\df.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */