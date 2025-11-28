/*    */ package me.konsolas.aac;
/*    */ import java.lang.invoke.MethodHandles;
/*    */ import java.util.function.ToLongFunction;
/*    */ import javax.crypto.Cipher;
/*    */ import javax.crypto.spec.DESKeySpec;
/*    */ import javax.crypto.spec.IvParameterSpec;
/*    */ 
/*    */ public class ms extends m8 {
/*    */   public ms(String paramString, double paramDouble, ToLongFunction paramToLongFunction) {
/* 10 */     super(paramString);
/*    */     
/*    */     this.d = paramDouble;
/*    */     
/* 14 */     this.e = paramToLongFunction;
/*    */   }
/*    */   
/*    */   private static final long f = 86400000L;
/*    */   private final double d;
/*    */   private final ToLongFunction e;
/*    */   private static final long g = nc.a(-2390434270743679818L, 8218342034725995446L, MethodHandles.lookup().lookupClass()).a(247545558618260L);
/*    */   private static final String[] h;
/*    */   private static final String[] i;
/*    */   private static final Map j = new HashMap<>(13);
/*    */   
/*    */   public Optional a(long paramLong, List paramList, lY paramlY, ef paramef, String paramString) {
/*    */     // Byte code:
/*    */     //   0: lload_1
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 73116393885666
/*    */     //   5: lxor
/*    */     //   6: lstore #7
/*    */     //   8: dup2
/*    */     //   9: ldc2_w 39108417017163
/*    */     //   12: lxor
/*    */     //   13: lstore #9
/*    */     //   15: pop2
/*    */     //   16: aload_0
/*    */     //   17: getfield e : Ljava/util/function/ToLongFunction;
/*    */     //   20: aload #5
/*    */     //   22: ldc2_w 421652625298813674
/*    */     //   25: lload_1
/*    */     //   26: <illegal opcode> b : (Ljava/util/function/ToLongFunction;Ljava/lang/Object;JJ)J
/*    */     //   31: lstore #11
/*    */     //   33: ldc2_w 428267985101423724
/*    */     //   36: lload_1
/*    */     //   37: <illegal opcode> w : (JJ)J
/*    */     //   42: lload #11
/*    */     //   44: lsub
/*    */     //   45: lstore #13
/*    */     //   47: aload_0
/*    */     //   48: getfield d : D
/*    */     //   51: lload #13
/*    */     //   53: l2d
/*    */     //   54: ldc2_w 8.64E7
/*    */     //   57: ddiv
/*    */     //   58: lload #7
/*    */     //   60: dup2_x2
/*    */     //   61: pop2
/*    */     //   62: ldc2_w 328283650753393817
/*    */     //   65: lload_1
/*    */     //   66: <illegal opcode> w : (JDJJ)D
/*    */     //   71: dmul
/*    */     //   72: ldc2_w 1000.0
/*    */     //   75: ldc2_w 423779890258894990
/*    */     //   78: lload_1
/*    */     //   79: <illegal opcode> w : (DDJJ)D
/*    */     //   84: dstore #15
/*    */     //   86: new java/util/LinkedHashMap
/*    */     //   89: dup
/*    */     //   90: invokespecial <init> : ()V
/*    */     //   93: astore #17
/*    */     //   95: aload #17
/*    */     //   97: sipush #29947
/*    */     //   100: ldc2_w 398306525617058424
/*    */     //   103: lload_1
/*    */     //   104: lxor
/*    */     //   105: <illegal opcode> k : (IJ)Ljava/lang/String;
/*    */     //   110: aload_0
/*    */     //   111: ldc2_w 328938820908178744
/*    */     //   114: lload_1
/*    */     //   115: <illegal opcode> b : (Lme/konsolas/aac/m8;JJ)Ljava/lang/String;
/*    */     //   120: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   125: pop
/*    */     //   126: aload #17
/*    */     //   128: sipush #10823
/*    */     //   131: ldc2_w 8593024050063453382
/*    */     //   134: lload_1
/*    */     //   135: lxor
/*    */     //   136: <illegal opcode> k : (IJ)Ljava/lang/String;
/*    */     //   141: getstatic java/util/Locale.UK : Ljava/util/Locale;
/*    */     //   144: sipush #6265
/*    */     //   147: ldc2_w 3340372311037681401
/*    */     //   150: lload_1
/*    */     //   151: lxor
/*    */     //   152: <illegal opcode> k : (IJ)Ljava/lang/String;
/*    */     //   157: iconst_1
/*    */     //   158: anewarray java/lang/Object
/*    */     //   161: dup
/*    */     //   162: iconst_0
/*    */     //   163: dload #15
/*    */     //   165: ldc2_w 340189576066490091
/*    */     //   168: lload_1
/*    */     //   169: <illegal opcode> w : (DJJ)Ljava/lang/Double;
/*    */     //   174: aastore
/*    */     //   175: ldc2_w 394174069856740136
/*    */     //   178: lload_1
/*    */     //   179: <illegal opcode> w : (Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;JJ)Ljava/lang/String;
/*    */     //   184: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   189: pop
/*    */     //   190: aload #17
/*    */     //   192: sipush #4272
/*    */     //   195: ldc2_w 8500597915575719479
/*    */     //   198: lload_1
/*    */     //   199: lxor
/*    */     //   200: <illegal opcode> k : (IJ)Ljava/lang/String;
/*    */     //   205: getstatic me/konsolas/aac/jX.h : Ljava/time/format/DateTimeFormatter;
/*    */     //   208: lload #11
/*    */     //   210: ldc2_w 386551386689057119
/*    */     //   213: lload_1
/*    */     //   214: <illegal opcode> w : (JJJ)Ljava/time/Instant;
/*    */     //   219: ldc2_w 382380460317903525
/*    */     //   222: lload_1
/*    */     //   223: <illegal opcode> b : (Ljava/time/format/DateTimeFormatter;Ljava/time/temporal/TemporalAccessor;JJ)Ljava/lang/String;
/*    */     //   228: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   233: pop
/*    */     //   234: aload #17
/*    */     //   236: sipush #15710
/*    */     //   239: ldc2_w 5928693969251744732
/*    */     //   242: lload_1
/*    */     //   243: lxor
/*    */     //   244: <illegal opcode> k : (IJ)Ljava/lang/String;
/*    */     //   249: getstatic me/konsolas/aac/jX.h : Ljava/time/format/DateTimeFormatter;
/*    */     //   252: ldc2_w 431535148006722990
/*    */     //   255: lload_1
/*    */     //   256: <illegal opcode> b : (Ljava/time/format/DateTimeFormatter;JJ)Ljava/time/ZoneId;
/*    */     //   261: ldc2_w 415090459269894091
/*    */     //   264: lload_1
/*    */     //   265: <illegal opcode> b : (Ljava/time/ZoneId;JJ)Ljava/lang/String;
/*    */     //   270: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   275: pop
/*    */     //   276: aload #17
/*    */     //   278: sipush #24969
/*    */     //   281: ldc2_w 4205179427348178703
/*    */     //   284: lload_1
/*    */     //   285: lxor
/*    */     //   286: <illegal opcode> k : (IJ)Ljava/lang/String;
/*    */     //   291: aload #5
/*    */     //   293: ldc2_w 327288168587428327
/*    */     //   296: lload_1
/*    */     //   297: <illegal opcode> b : (Lme/konsolas/aac/ef;JJ)Ljava/lang/String;
/*    */     //   302: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   307: pop
/*    */     //   308: aload #6
/*    */     //   310: aload #17
/*    */     //   312: dload #15
/*    */     //   314: lload #9
/*    */     //   316: ldc2_w 339672891414467735
/*    */     //   319: lload_1
/*    */     //   320: <illegal opcode> w : (Ljava/lang/String;Ljava/util/Map;DJJJ)Lme/konsolas/aac/ah;
/*    */     //   325: ldc2_w 369840208558991866
/*    */     //   328: lload_1
/*    */     //   329: <illegal opcode> w : (Ljava/lang/Object;JJ)Ljava/util/Optional;
/*    */     //   334: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #4	-> 16
/*    */     //   #13	-> 33
/*    */     //   #15	-> 47
/*    */     //   #3	-> 86
/*    */     //   #6	-> 95
/*    */     //   #7	-> 126
/*    */     //   #11	-> 190
/*    */     //   #1	-> 234
/*    */     //   #9	-> 276
/*    */     //   #5	-> 308
/*    */   }
/*    */   
/*    */   private static double a(long paramLong, double paramDouble) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/ms.g : J
/*    */     //   3: lload_0
/*    */     //   4: lxor
/*    */     //   5: lstore_0
/*    */     //   6: ldc2_w 2.0
/*    */     //   9: dload_2
/*    */     //   10: ldc2_w -2088296670101776101
/*    */     //   13: lload_0
/*    */     //   14: <illegal opcode> w : (DJJ)D
/*    */     //   19: dload_2
/*    */     //   20: dneg
/*    */     //   21: ldc2_w -2088296670101776101
/*    */     //   24: lload_0
/*    */     //   25: <illegal opcode> w : (DJJ)D
/*    */     //   30: dadd
/*    */     //   31: ddiv
/*    */     //   32: dreturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #12	-> 6
/*    */   }
/*    */   
/*    */   static {
/*    */     long l = g ^ 0x25228A09BAD0L;
/*    */     "꡼㙧ꈞﮌꀉ搅틇ᢜ뎒㘅ᖋ䓳괿ㆁ?߈ጤ".toCharArray()[14] = (char)("꡼㙧ꈞﮌꀉ搅틇ᢜ뎒㘅ᖋ䓳괿ㆁ?߈ጤ".toCharArray()[14] ^ 0x3FE);
/*    */     "杲詣㜅".toCharArray()[2] = (char)("杲詣㜅".toCharArray()[2] ^ 0x962);
/*    */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*    */     for (byte b1 = 1; b1 < 8; b1++)
/*    */       (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
/*    */     Cipher cipher;
/*    */     (cipher = Cipher.getInstance(hY$g6.H("꡼㙧ꈞﮌꀉ搅틇ᢜ뎒㘅ᖋ䓳괿ㆁ?߈ጤ".toCharArray(), (short)6108, (byte)0, (byte)1))).init(2, SecretKeyFactory.getInstance(hY$g6.H("杲詣㜅".toCharArray(), (short)29901, (byte)2, (byte)3)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*    */     String[] arrayOfString = new String[6];
/*    */     boolean bool = false;
/*    */     "䱧ꘖ?⬅휯庁?쾚꡸镝?쟮䞮ᜍ舯ꗆ蠚ᐣ짽ꨐ쐕໗枽㛪퍩﮾䩒ፚ瞸藺銇獘쮟䩫ꌠ渂叠ᄘ唄⽷㜼䐕魘㝮澱䋟㰲?斒쮯팴詗䒑๾煗ኋ㬨뷣?ㅠ∲蝇殱".toCharArray()[27] = (char)("䱧ꘖ?⬅휯庁?쾚꡸镝?쟮䞮ᜍ舯ꗆ蠚ᐣ짽ꨐ쐕໗枽㛪퍩﮾䩒ፚ瞸藺銇獘쮟䩫ꌠ渂叠ᄘ唄⽷㜼䐕魘㝮澱䋟㰲?斒쮯팴詗䒑๾煗ኋ㬨뷣?ㅠ∲蝇殱".toCharArray()[27] ^ 0x3C2B);
/*    */     String str;
/*    */     int i = (str = hY$g6.H("䱧ꘖ?⬅휯庁?쾚꡸镝?쟮䞮ᜍ舯ꗆ蠚ᐣ짽ꨐ쐕໗枽㛪퍩﮾䩒ፚ瞸藺銇獘쮟䩫ꌠ渂叠ᄘ唄⽷㜼䐕魘㝮澱䋟㰲?斒쮯팴詗䒑๾煗ኋ㬨뷣?ㅠ∲蝇殱".toCharArray(), (short)21860, (byte)3, (byte)5)).length();
/*    */     byte b2 = 24;
/*    */     byte b = -1;
/*    */     while (true);
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
/*    */     int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x2FB;
/*    */     if (i[i] == null) {
/*    */       Object[] arrayOfObject;
/*    */       try {
/*    */         Long long_ = Long.valueOf(Thread.currentThread().getId());
/*    */         arrayOfObject = (Object[])j.get(long_);
/*    */         if (arrayOfObject == null) {
/*    */           arrayOfObject = new Object[3];
/*    */           "͔?☜砕͝႙궘鹽盛翌些⍚潁瓧庍퐹᥃ᵏೝ㏇".toCharArray()[4] = (char)("͔?☜砕͝႙궘鹽盛翌些⍚潁瓧庍퐹᥃ᵏೝ㏇".toCharArray()[4] ^ 0x395A);
/*    */           arrayOfObject[0] = Cipher.getInstance(dP$dt.X("͔?☜砕͝႙궘鹽盛翌些⍚潁瓧庍퐹᥃ᵏೝ㏇".toCharArray(), (short)21083, true, false));
/*    */           "霾Ằ畅".toCharArray()[1] = (char)("霾Ằ畅".toCharArray()[1] ^ 0x60F6);
/*    */           arrayOfObject[1] = SecretKeyFactory.getInstance(dP$dt.X("霾Ằ畅".toCharArray(), (short)25817, false, false));
/*    */           arrayOfObject[2] = new IvParameterSpec(new byte[8]);
/*    */           j.put(long_, arrayOfObject);
/*    */         } 
/*    */       } catch (Exception exception) {
/*    */         "福裦꫏眈딊䃬埘▦ꬫ柆⧴皺៣?Ἅৡ?亣".toCharArray()[6] = (char)("福裦꫏眈딊䃬埘▦ꬫ柆⧴皺៣?Ἅৡ?亣".toCharArray()[6] ^ 0x71AB);
/*    */         throw new RuntimeException(dP$dt.X("福裦꫏眈딊䃬埘▦ꬫ柆⧴皺៣?Ἅৡ?亣".toCharArray(), (short)7197, true, false), exception);
/*    */       } 
/*    */       byte[] arrayOfByte1 = new byte[8];
/*    */       arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
/*    */       for (byte b = 1; b < 8; b++)
/*    */         arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
/*    */       DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
/*    */       SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
/*    */       ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
/*    */       "笌鹬磚쑄幓छ鲬䃭腗ꋀ㢛".toCharArray()[9] = (char)("笌鹬磚쑄幓छ鲬䃭腗ꋀ㢛".toCharArray()[9] ^ 0x5899);
/*    */       byte[] arrayOfByte2 = h[i].getBytes(dP$dt.X("笌鹬磚쑄幓छ鲬䃭腗ꋀ㢛".toCharArray(), (short)25375, false, true));
/*    */       i[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
/*    */     } 
/*    */     return i[i];
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
/*    */     //   66: ldc_w '䦤ꁚ⎷ꀾ킆✑狩溘꽙䗽蝶탂졂꓉ꎱ䰃⒵'
/*    */     //   69: invokevirtual toCharArray : ()[C
/*    */     //   72: dup
/*    */     //   73: dup
/*    */     //   74: bipush #7
/*    */     //   76: dup_x1
/*    */     //   77: caload
/*    */     //   78: sipush #1661
/*    */     //   81: ixor
/*    */     //   82: i2c
/*    */     //   83: castore
/*    */     //   84: sipush #31710
/*    */     //   87: iconst_1
/*    */     //   88: iconst_2
/*    */     //   89: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*    */     //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   95: ldc_w '恈쯵?㛣'
/*    */     //   98: invokevirtual toCharArray : ()[C
/*    */     //   101: dup
/*    */     //   102: dup
/*    */     //   103: iconst_1
/*    */     //   104: dup_x1
/*    */     //   105: caload
/*    */     //   106: sipush #31993
/*    */     //   109: ixor
/*    */     //   110: i2c
/*    */     //   111: castore
/*    */     //   112: sipush #24172
/*    */     //   115: iconst_0
/*    */     //   116: iconst_2
/*    */     //   117: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*    */     //   120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   123: aload_1
/*    */     //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   127: ldc_w '❳ܥ鈺瘿'
/*    */     //   130: invokevirtual toCharArray : ()[C
/*    */     //   133: dup
/*    */     //   134: dup
/*    */     //   135: iconst_1
/*    */     //   136: dup_x1
/*    */     //   137: caload
/*    */     //   138: sipush #26499
/*    */     //   141: ixor
/*    */     //   142: i2c
/*    */     //   143: castore
/*    */     //   144: sipush #26638
/*    */     //   147: iconst_0
/*    */     //   148: iconst_1
/*    */     //   149: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
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


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ms.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */