/*    */ package me.konsolas.aac;
/*    */ import aacinternal.v;
/*    */ import java.lang.invoke.MethodHandles;
/*    */ import java.util.function.DoubleUnaryOperator;
/*    */ import javax.crypto.Cipher;
/*    */ import javax.crypto.spec.DESKeySpec;
/*    */ import javax.crypto.spec.IvParameterSpec;
/*    */ 
/*    */ public class my extends m8 {
/*    */   public my(String paramString, eA parameA, DoubleUnaryOperator paramDoubleUnaryOperator) {
/* 11 */     super(paramString);
/*    */     this.e = parameA;
/*    */     this.d = paramDoubleUnaryOperator;
/*    */   }
/*    */   
/*    */   private final eA e;
/*    */   
/*    */   private final DoubleUnaryOperator d;
/*    */   private static final String[] f;
/*    */   private static final String[] g;
/*    */   private static final Map h = new HashMap<>(13);
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
/*    */     //   66: ldc_w 'ᮾ䓆ﭦ뻳튿깏久同偠糃帢䷓뇒墬줶彩凕羋'
/*    */     //   69: invokevirtual toCharArray : ()[C
/*    */     //   72: dup
/*    */     //   73: dup
/*    */     //   74: bipush #15
/*    */     //   76: dup_x1
/*    */     //   77: caload
/*    */     //   78: sipush #28486
/*    */     //   81: ixor
/*    */     //   82: i2c
/*    */     //   83: castore
/*    */     //   84: sipush #812
/*    */     //   87: iconst_0
/*    */     //   88: iconst_1
/*    */     //   89: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   95: ldc_w '❢ꠈ⢂'
/*    */     //   98: invokevirtual toCharArray : ()[C
/*    */     //   101: dup
/*    */     //   102: dup
/*    */     //   103: iconst_1
/*    */     //   104: dup_x1
/*    */     //   105: caload
/*    */     //   106: sipush #18295
/*    */     //   109: ixor
/*    */     //   110: i2c
/*    */     //   111: castore
/*    */     //   112: sipush #18195
/*    */     //   115: iconst_1
/*    */     //   116: iconst_1
/*    */     //   117: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*    */     //   120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   123: aload_1
/*    */     //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   127: ldc_w 'ᖞ﬋牧'
/*    */     //   130: invokevirtual toCharArray : ()[C
/*    */     //   133: dup
/*    */     //   134: dup
/*    */     //   135: iconst_2
/*    */     //   136: dup_x1
/*    */     //   137: caload
/*    */     //   138: sipush #9064
/*    */     //   141: ixor
/*    */     //   142: i2c
/*    */     //   143: castore
/*    */     //   144: sipush #20996
/*    */     //   147: iconst_0
/*    */     //   148: iconst_1
/*    */     //   149: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
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
/*    */   private static String a(int paramInt, long paramLong) {
/*    */     int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0xB1D;
/*    */     if (g[i] == null) {
/*    */       Object[] arrayOfObject;
/*    */       try {
/*    */         Long long_ = Long.valueOf(Thread.currentThread().getId());
/*    */         arrayOfObject = (Object[])h.get(long_);
/*    */         if (arrayOfObject == null) {
/*    */           arrayOfObject = new Object[3];
/*    */           "팒粣⿂ઁ䟀쁗鼚㌭៚ۿ龮፝잙쎺䢲ꏎ呃ᇮ쩐뀒甾".toCharArray()[12] = (char)("팒粣⿂ઁ䟀쁗鼚㌭៚ۿ龮፝잙쎺䢲ꏎ呃ᇮ쩐뀒甾".toCharArray()[12] ^ 0x1D75);
/*    */           arrayOfObject[0] = Cipher.getInstance(fW$gy.A("팒粣⿂ઁ䟀쁗鼚㌭៚ۿ龮፝잙쎺䢲ꏎ呃ᇮ쩐뀒甾".toCharArray(), (short)491, true, 2));
/*    */           "浦깋登拂".toCharArray()[2] = (char)("浦깋登拂".toCharArray()[2] ^ 0xAA6);
/*    */           arrayOfObject[1] = SecretKeyFactory.getInstance(fW$gy.A("浦깋登拂".toCharArray(), (short)18921, true, 1));
/*    */           arrayOfObject[2] = new IvParameterSpec(new byte[8]);
/*    */           h.put(long_, arrayOfObject);
/*    */         } 
/*    */       } catch (Exception exception) {
/*    */         "漴搿轱ᇄ尳뜇鸨潰傢駃눭གྷ뭩﷏蘣㧜".toCharArray()[8] = (char)("漴搿轱ᇄ尳뜇鸨潰傢駃눭གྷ뭩﷏蘣㧜".toCharArray()[8] ^ 0xFCE);
/*    */         throw new RuntimeException(fW$gy.A("漴搿轱ᇄ尳뜇鸨潰傢駃눭གྷ뭩﷏蘣㧜".toCharArray(), (short)32269, false, 4), exception);
/*    */       } 
/*    */       byte[] arrayOfByte1 = new byte[8];
/*    */       arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
/*    */       for (byte b = 1; b < 8; b++)
/*    */         arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
/*    */       DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
/*    */       SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
/*    */       ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
/*    */       "㟵諅汱扄ᑬ涜瞝䑢".toCharArray()[1] = (char)("㟵諅汱扄ᑬ涜瞝䑢".toCharArray()[1] ^ 0x2FED);
/*    */       byte[] arrayOfByte2 = f[i].getBytes(fW$gy.A("㟵諅汱扄ᑬ涜瞝䑢".toCharArray(), (short)8727, false, 3));
/*    */       g[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
/*    */     } 
/*    */     return g[i];
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
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   }
/*    */   
/*    */   static {
/*    */     long l = nc.a(-3105546479002259049L, -2956967500385593116L, MethodHandles.lookup().lookupClass()).a(277712106298714L) ^ 0x2AEF46AD0254L;
/*    */     "暇킫?运胧ᗺ?뚺裞뱃迼ᾮ䂛淊嶁䎟ᢋ簚ไ".toCharArray()[1] = (char)("暇킫?运胧ᗺ?뚺裞뱃迼ᾮ䂛淊嶁䎟ᢋ簚ไ".toCharArray()[1] ^ 0x52C2);
/*    */     "굌䮘䬠旄".toCharArray()[2] = (char)("굌䮘䬠旄".toCharArray()[2] ^ 0x56FA);
/*    */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*    */     for (byte b1 = 1; b1 < 8; b1++)
/*    */       (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
/*    */     Cipher cipher;
/*    */     (cipher = Cipher.getInstance(da$gx.U("暇킫?运胧ᗺ?뚺裞뱃迼ᾮ䂛淊嶁䎟ᢋ簚ไ".toCharArray(), (short)13872, true, false))).init(2, SecretKeyFactory.getInstance(da$gx.U("굌䮘䬠旄".toCharArray(), (short)10505, true, false)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*    */     String[] arrayOfString = new String[6];
/*    */     boolean bool = false;
/*    */     "譼歳ꆏ鏮仿黇鯮솞վⲞ⷇㜱坻?ꃍ?۩ᆝ洴㇌䳫࿨⛿浼ﻹ䨪癓?⧈힃匐䭻֯珶錮敮礥쀎ᠱ날韅榧?ﾴM䷤縩⠓㻍ꃆᨾ瓐뤫?ⶈ弓ేꋓ漝".toCharArray()[10] = (char)("譼歳ꆏ鏮仿黇鯮솞վⲞ⷇㜱坻?ꃍ?۩ᆝ洴㇌䳫࿨⛿浼ﻹ䨪癓?⧈힃匐䭻֯珶錮敮礥쀎ᠱ날韅榧?ﾴM䷤縩⠓㻍ꃆᨾ瓐뤫?ⶈ弓ేꋓ漝".toCharArray()[10] ^ 0x6150);
/*    */     String str;
/*    */     int i = (str = da$gx.U("譼歳ꆏ鏮仿黇鯮솞վⲞ⷇㜱坻?ꃍ?۩ᆝ洴㇌䳫࿨⛿浼ﻹ䨪癓?⧈힃匐䭻֯珶錮敮礥쀎ᠱ날韅榧?ﾴM䷤縩⠓㻍ꃆᨾ瓐뤫?ⶈ弓ేꋓ漝".toCharArray(), (short)32391, true, true)).length();
/*    */     byte b2 = 16;
/*    */     byte b = -1;
/*    */     while (true);
/*    */   }
/*    */   
/*    */   public Optional a(long paramLong, List paramList, lY paramlY, ef paramef, String paramString) {
/*    */     // Byte code:
/*    */     //   0: lload_1
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 39108417017163
/*    */     //   5: lxor
/*    */     //   6: lstore #7
/*    */     //   8: pop2
/*    */     //   9: ldc2_w 341268060744998595
/*    */     //   12: lload_1
/*    */     //   13: <illegal opcode> w : (JJ)Z
/*    */     //   18: dconst_0
/*    */     //   19: dstore #10
/*    */     //   21: istore #9
/*    */     //   23: iconst_0
/*    */     //   24: istore #12
/*    */     //   26: aload_3
/*    */     //   27: ldc2_w 374283803615272591
/*    */     //   30: lload_1
/*    */     //   31: <illegal opcode> b : (Ljava/util/List;JJ)Ljava/util/Iterator;
/*    */     //   36: astore #13
/*    */     //   38: aload #13
/*    */     //   40: invokeinterface hasNext : ()Z
/*    */     //   45: ifeq -> 128
/*    */     //   48: aload #13
/*    */     //   50: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   55: checkcast me/konsolas/aac/eD
/*    */     //   58: astore #14
/*    */     //   60: iload #9
/*    */     //   62: ifne -> 160
/*    */     //   65: aload #14
/*    */     //   67: ldc2_w 374871675162322402
/*    */     //   70: lload_1
/*    */     //   71: <illegal opcode> b : (Lme/konsolas/aac/eD;JJ)Lme/konsolas/aac/eA;
/*    */     //   76: aload_0
/*    */     //   77: getfield e : Lme/konsolas/aac/eA;
/*    */     //   80: if_acmpne -> 123
/*    */     //   83: goto -> 96
/*    */     //   86: ldc2_w 430529605459236344
/*    */     //   89: lload_1
/*    */     //   90: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   95: athrow
/*    */     //   96: dload #10
/*    */     //   98: aload #14
/*    */     //   100: ldc2_w 326406014191700000
/*    */     //   103: lload_1
/*    */     //   104: <illegal opcode> b : (Lme/konsolas/aac/eD;JJ)F
/*    */     //   109: f2d
/*    */     //   110: dload #10
/*    */     //   112: dsub
/*    */     //   113: iinc #12, 1
/*    */     //   116: iload #12
/*    */     //   118: i2d
/*    */     //   119: ddiv
/*    */     //   120: dadd
/*    */     //   121: dstore #10
/*    */     //   123: iload #9
/*    */     //   125: ifeq -> 38
/*    */     //   128: lload_1
/*    */     //   129: lconst_0
/*    */     //   130: lcmp
/*    */     //   131: iflt -> 160
/*    */     //   134: iload #12
/*    */     //   136: iconst_2
/*    */     //   137: if_icmpge -> 160
/*    */     //   140: ldc2_w 335386802571957573
/*    */     //   143: lload_1
/*    */     //   144: <illegal opcode> w : (JJ)Ljava/util/Optional;
/*    */     //   149: areturn
/*    */     //   150: ldc2_w 430529605459236344
/*    */     //   153: lload_1
/*    */     //   154: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   159: athrow
/*    */     //   160: aload_0
/*    */     //   161: getfield d : Ljava/util/function/DoubleUnaryOperator;
/*    */     //   164: dload #10
/*    */     //   166: ldc2_w 393918399441373073
/*    */     //   169: lload_1
/*    */     //   170: <illegal opcode> b : (Ljava/util/function/DoubleUnaryOperator;DJJ)D
/*    */     //   175: ldc2_w 1000.0
/*    */     //   178: ldc2_w 423779890258894990
/*    */     //   181: lload_1
/*    */     //   182: <illegal opcode> w : (DDJJ)D
/*    */     //   187: dstore #13
/*    */     //   189: new java/util/LinkedHashMap
/*    */     //   192: dup
/*    */     //   193: invokespecial <init> : ()V
/*    */     //   196: astore #15
/*    */     //   198: aload #15
/*    */     //   200: sipush #15846
/*    */     //   203: ldc2_w 4924398948204458625
/*    */     //   206: lload_1
/*    */     //   207: lxor
/*    */     //   208: <illegal opcode> y : (IJ)Ljava/lang/String;
/*    */     //   213: aload_0
/*    */     //   214: ldc2_w 328938820908178744
/*    */     //   217: lload_1
/*    */     //   218: <illegal opcode> b : (Lme/konsolas/aac/m8;JJ)Ljava/lang/String;
/*    */     //   223: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   228: pop
/*    */     //   229: aload #15
/*    */     //   231: sipush #7645
/*    */     //   234: ldc2_w 7861358885922509497
/*    */     //   237: lload_1
/*    */     //   238: lxor
/*    */     //   239: <illegal opcode> y : (IJ)Ljava/lang/String;
/*    */     //   244: getstatic java/util/Locale.UK : Ljava/util/Locale;
/*    */     //   247: sipush #30911
/*    */     //   250: ldc2_w 3828637639257159647
/*    */     //   253: lload_1
/*    */     //   254: lxor
/*    */     //   255: <illegal opcode> y : (IJ)Ljava/lang/String;
/*    */     //   260: iconst_1
/*    */     //   261: anewarray java/lang/Object
/*    */     //   264: dup
/*    */     //   265: iconst_0
/*    */     //   266: dload #13
/*    */     //   268: ldc2_w 340189576066490091
/*    */     //   271: lload_1
/*    */     //   272: <illegal opcode> w : (DJJ)Ljava/lang/Double;
/*    */     //   277: aastore
/*    */     //   278: ldc2_w 394174069856740136
/*    */     //   281: lload_1
/*    */     //   282: <illegal opcode> w : (Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;JJ)Ljava/lang/String;
/*    */     //   287: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   292: pop
/*    */     //   293: aload #15
/*    */     //   295: sipush #7959
/*    */     //   298: ldc2_w 7414818585055203442
/*    */     //   301: lload_1
/*    */     //   302: lxor
/*    */     //   303: <illegal opcode> y : (IJ)Ljava/lang/String;
/*    */     //   308: getstatic java/util/Locale.UK : Ljava/util/Locale;
/*    */     //   311: sipush #10958
/*    */     //   314: ldc2_w 4173816007513679279
/*    */     //   317: lload_1
/*    */     //   318: lxor
/*    */     //   319: <illegal opcode> y : (IJ)Ljava/lang/String;
/*    */     //   324: iconst_1
/*    */     //   325: anewarray java/lang/Object
/*    */     //   328: dup
/*    */     //   329: iconst_0
/*    */     //   330: dload #10
/*    */     //   332: ldc2_w 340189576066490091
/*    */     //   335: lload_1
/*    */     //   336: <illegal opcode> w : (DJJ)Ljava/lang/Double;
/*    */     //   341: aastore
/*    */     //   342: ldc2_w 394174069856740136
/*    */     //   345: lload_1
/*    */     //   346: <illegal opcode> w : (Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;JJ)Ljava/lang/String;
/*    */     //   351: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   356: pop
/*    */     //   357: aload #15
/*    */     //   359: sipush #185
/*    */     //   362: ldc2_w 6763954788924428255
/*    */     //   365: lload_1
/*    */     //   366: lxor
/*    */     //   367: <illegal opcode> y : (IJ)Ljava/lang/String;
/*    */     //   372: iload #12
/*    */     //   374: ldc2_w 365847678624198656
/*    */     //   377: lload_1
/*    */     //   378: <illegal opcode> w : (IJJ)Ljava/lang/String;
/*    */     //   383: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   388: pop
/*    */     //   389: aload #6
/*    */     //   391: aload #15
/*    */     //   393: dload #13
/*    */     //   395: lload #7
/*    */     //   397: ldc2_w 339672891414467735
/*    */     //   400: lload_1
/*    */     //   401: <illegal opcode> w : (Ljava/lang/String;Ljava/util/Map;DJJJ)Lme/konsolas/aac/ah;
/*    */     //   406: ldc2_w 369840208558991866
/*    */     //   409: lload_1
/*    */     //   410: <illegal opcode> w : (Ljava/lang/Object;JJ)Ljava/util/Optional;
/*    */     //   415: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #5	-> 18
/*    */     //   #18	-> 23
/*    */     //   #14	-> 26
/*    */     //   #8	-> 60
/*    */     //   #15	-> 96
/*    */     //   #2	-> 123
/*    */     //   #17	-> 128
/*    */     //   #10	-> 160
/*    */     //   #3	-> 189
/*    */     //   #4	-> 198
/*    */     //   #9	-> 229
/*    */     //   #16	-> 293
/*    */     //   #12	-> 357
/*    */     //   #1	-> 389
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   60	83	86	aacinternal/v
/*    */     //   128	150	150	aacinternal/v
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\my.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */