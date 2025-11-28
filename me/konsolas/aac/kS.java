/*   */ package me.konsolas.aac;public class ks { static { byte b1; long l;
/*   */     int j, k, m, n, i1, i2;
/* 3 */     for (e = nc.a(-2296196912879819988L, -6874910720341604830L, MethodHandles.lookup().lookupClass()).a(72523560480781L), l = e ^ 0x67EC659AEB22L, j = (int)((l ^ 0x36C3CB143B36L) >>> 48L), k = (int)((l ^ 0x36C3CB143B36L) << 16L >>> 48L), m = (int)((l ^ 0x36C3CB143B36L) << 32L >>> 32L), l ^ 0x36C3CB143B36L, n = (int)((l ^ 0x217DDDDE100DL) >>> 48L), i1 = (int)((l ^ 0x217DDDDE100DL) << 16L >>> 32L), i2 = (int)((l ^ 0x217DDDDE100DL) << 48L >>> 48L), l ^ 0x217DDDDE100DL, h = new HashMap<>(13), "㐼엤턼괇澉染頂殖뀯改未䍕㞨ꜷ鿣牀⣵焩".toCharArray()[14] = (char)("㐼엤턼괇澉染頂殖뀯改未䍕㞨ꜷ鿣牀⣵焩".toCharArray()[14] ^ 0x2487), "ဿ긾䓂户".toCharArray()[1] = (char)("ဿ긾䓂户".toCharArray()[1] ^ 0x4AFD), (new byte[8])[0] = (byte)(int)(l >>> 56L), b1 = 1; b1 < 8; ) { (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); b1++; }  Cipher cipher; (cipher = Cipher.getInstance(a0$cc.G("㐼엤턼괇澉染頂殖뀯改未䍕㞨ꜷ鿣牀⣵焩".toCharArray(), (short)3136, false, (byte)0))).init(2, SecretKeyFactory.getInstance(a0$cc.G("ဿ긾䓂户".toCharArray(), (short)17056, false, (byte)2)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8])); String[] arrayOfString = new String[2]; boolean bool = false; "狊蠮低河頂鸳Ὺ忝⛘ﯨ釯꥗ຽ䠋穦뱞像倫ᙙ瘬ឃ㧸령㢠桚櫚᯵⛞䛂点霈檜蛽䮳빱赜?꿻ָ行䇫넗⽾핫辳冀圁艑ࢺ᭨뚮?枤뺟苹艕숻噖".toCharArray()[52] = (char)("狊蠮低河頂鸳Ὺ忝⛘ﯨ釯꥗ຽ䠋穦뱞像倫ᙙ瘬ឃ㧸령㢠桚櫚᯵⛞䛂点霈檜蛽䮳빱赜?꿻ָ行䇫넗⽾핫辳冀圁艑ࢺ᭨뚮?枤뺟苹艕숻噖".toCharArray()[52] ^ 0x6963); String str; int i = (str = a0$cc.G("狊蠮低河頂鸳Ὺ忝⛘ﯨ釯꥗ຽ䠋穦뱞像倫ᙙ瘬ឃ㧸령㢠桚櫚᯵⛞䛂点霈檜蛽䮳빱赜?꿻ָ行䇫넗⽾핫辳冀圁艑ࢺ᭨뚮?枤뺟苹艕숻噖".toCharArray(), (short)619, true, (byte)5)).length(); byte b2 = 40; byte b = -1;
/*   */     while (true); }
/*   */ 
/*   */   
/*   */   public static final mt b;
/*   */   private static final iV c;
/*   */   private static final Map d;
/*   */   private static G a;
/*   */   private static final long e;
/*   */   private static final String[] f;
/*   */   private static final String[] g;
/*   */   private static final Map h;
/*   */   
/*   */   private static CallSite a(MethodHandles.Lookup paramLookup, String paramString, MethodType paramMethodType) {
/*   */     // Byte code:
/*   */     //   0: new java/lang/invoke/MutableCallSite
/*   */     //   3: dup
/*   */     //   4: aload_2
/*   */     //   5: invokespecial <init> : (Ljava/lang/invoke/MethodType;)V
/*   */     //   8: astore_3
/*   */     //   9: aload_3
/*   */     //   10: ldc_w
/*   */     //   13: ldc_w [Ljava/lang/Object;
/*   */     //   16: aload_2
/*   */     //   17: invokevirtual parameterCount : ()I
/*   */     //   20: invokevirtual asCollector : (Ljava/lang/Class;I)Ljava/lang/invoke/MethodHandle;
/*   */     //   23: iconst_0
/*   */     //   24: iconst_3
/*   */     //   25: anewarray java/lang/Object
/*   */     //   28: dup
/*   */     //   29: iconst_0
/*   */     //   30: aload_0
/*   */     //   31: aastore
/*   */     //   32: dup
/*   */     //   33: iconst_1
/*   */     //   34: aload_3
/*   */     //   35: aastore
/*   */     //   36: dup
/*   */     //   37: iconst_2
/*   */     //   38: aload_1
/*   */     //   39: aastore
/*   */     //   40: invokestatic insertArguments : (Ljava/lang/invoke/MethodHandle;I[Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;
/*   */     //   43: aload_2
/*   */     //   44: invokestatic explicitCastArguments : (Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;
/*   */     //   47: invokevirtual setTarget : (Ljava/lang/invoke/MethodHandle;)V
/*   */     //   50: goto -> 171
/*   */     //   53: astore #4
/*   */     //   55: new java/lang/RuntimeException
/*   */     //   58: dup
/*   */     //   59: new java/lang/StringBuilder
/*   */     //   62: dup
/*   */     //   63: invokespecial <init> : ()V
/*   */     //   66: ldc_w '⍦끺穧?䥡ⶌἬ堢뉒‒Ꮦ䅭炰㛒⩠艮笼弫'
/*   */     //   69: invokevirtual toCharArray : ()[C
/*   */     //   72: dup
/*   */     //   73: dup
/*   */     //   74: bipush #6
/*   */     //   76: dup_x1
/*   */     //   77: caload
/*   */     //   78: sipush #4481
/*   */     //   81: ixor
/*   */     //   82: i2c
/*   */     //   83: castore
/*   */     //   84: sipush #3202
/*   */     //   87: iconst_4
/*   */     //   88: iconst_0
/*   */     //   89: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*   */     //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   95: ldc_w '植墄㔻㸐'
/*   */     //   98: invokevirtual toCharArray : ()[C
/*   */     //   101: dup
/*   */     //   102: dup
/*   */     //   103: iconst_0
/*   */     //   104: dup_x1
/*   */     //   105: caload
/*   */     //   106: sipush #14464
/*   */     //   109: ixor
/*   */     //   110: i2c
/*   */     //   111: castore
/*   */     //   112: sipush #5657
/*   */     //   115: iconst_0
/*   */     //   116: iconst_4
/*   */     //   117: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*   */     //   120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   123: aload_1
/*   */     //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   127: ldc_w '㙦䣮'
/*   */     //   130: invokevirtual toCharArray : ()[C
/*   */     //   133: dup
/*   */     //   134: dup
/*   */     //   135: iconst_0
/*   */     //   136: dup_x1
/*   */     //   137: caload
/*   */     //   138: sipush #16933
/*   */     //   141: ixor
/*   */     //   142: i2c
/*   */     //   143: castore
/*   */     //   144: sipush #29465
/*   */     //   147: iconst_0
/*   */     //   148: iconst_1
/*   */     //   149: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*   */     //   152: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   155: aload_2
/*   */     //   156: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   159: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   162: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   165: aload #4
/*   */     //   167: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*   */     //   170: athrow
/*   */     //   171: aload_3
/*   */     //   172: areturn
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   9	50	53	java/lang/Exception
/*   */   }
/*   */   
/*   */   private static Object a(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
/*   */     int i = ((Integer)paramArrayOfObject[0]).intValue();
/*   */     long l = ((Long)paramArrayOfObject[1]).longValue();
/*   */     String str = a(i, l);
/*   */     MethodHandle methodHandle = MethodHandles.constant(String.class, str);
/*   */     paramMutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[] { int.class, long.class }));
/*   */     return str;
/*   */   }
/*   */   
/*   */   private static String a(int paramInt, long paramLong) {
/*   */     int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x3AFE;
/*   */     if (g[i] == null) {
/*   */       Object[] arrayOfObject;
/*   */       try {
/*   */         Long long_ = Long.valueOf(Thread.currentThread().getId());
/*   */         arrayOfObject = (Object[])h.get(long_);
/*   */         if (arrayOfObject == null) {
/*   */           arrayOfObject = new Object[3];
/*   */           "歩㫍歪ꦾࡠ鶰尃䴤啯얡⃽梾쏸쒂ꙅ⹭숐쁑讳屔".toCharArray()[7] = (char)("歩㫍歪ꦾࡠ鶰尃䴤啯얡⃽梾쏸쒂ꙅ⹭숐쁑讳屔".toCharArray()[7] ^ 0x3189);
/*   */           arrayOfObject[0] = Cipher.getInstance(hY$g6.H("歩㫍歪ꦾࡠ鶰尃䴤啯얡⃽梾쏸쒂ꙅ⹭숐쁑讳屔".toCharArray(), (short)21998, (byte)2, (byte)2));
/*   */           "⬈噢庅⾀".toCharArray()[1] = (char)("⬈噢庅⾀".toCharArray()[1] ^ 0x5D09);
/*   */           arrayOfObject[1] = SecretKeyFactory.getInstance(hY$g6.H("⬈噢庅⾀".toCharArray(), (short)2824, (byte)0, (byte)0));
/*   */           arrayOfObject[2] = new IvParameterSpec(new byte[8]);
/*   */           h.put(long_, arrayOfObject);
/*   */         } 
/*   */       } catch (Exception exception) {
/*   */         "望홞཰糎꓊ඛ몮袒퐏樝?㽛ᑧ齴紵㣝㙽".toCharArray()[0] = (char)("望홞཰糎꓊ඛ몮袒퐏樝?㽛ᑧ齴紵㣝㙽".toCharArray()[0] ^ 0x65CB);
/*   */         throw new RuntimeException(hY$g6.H("望홞཰糎꓊ඛ몮袒퐏樝?㽛ᑧ齴紵㣝㙽".toCharArray(), (short)3837, (byte)5, (byte)2), exception);
/*   */       } 
/*   */       byte[] arrayOfByte1 = new byte[8];
/*   */       arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
/*   */       for (byte b = 1; b < 8; b++)
/*   */         arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
/*   */       DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
/*   */       SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
/*   */       ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
/*   */       "㥑ᛮ婹衽奅ꀋ⁠Ȧ垝䅝拻".toCharArray()[2] = (char)("㥑ᛮ婹衽奅ꀋ⁠Ȧ垝䅝拻".toCharArray()[2] ^ 0x48B1);
/*   */       byte[] arrayOfByte2 = f[i].getBytes(hY$g6.H("㥑ᛮ婹衽奅ꀋ⁠Ȧ垝䅝拻".toCharArray(), (short)20646, (byte)5, (byte)1));
/*   */       g[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
/*   */     } 
/*   */     return g[i];
/*   */   }
/*   */   
/*   */   private static String a(byte[] paramArrayOfbyte) {
/*   */     byte b1 = 0;
/*   */     int i;
/*   */     char[] arrayOfChar = new char[i = paramArrayOfbyte.length];
/*   */     for (byte b2 = 0; b2 < i; b2++) {
/*   */       int j;
/*   */       if ((j = 0xFF & paramArrayOfbyte[b2]) < 192) {
/*   */         arrayOfChar[b1++] = (char)j;
/*   */       } else if (j < 224) {
/*   */         char c = (char)((char)(j & 0x1F) << 6);
/*   */         j = paramArrayOfbyte[++b2];
/*   */         c = (char)(c | (char)(j & 0x3F));
/*   */         arrayOfChar[b1++] = c;
/*   */       } else if (b2 < i - 2) {
/*   */         char c = (char)((char)(j & 0xF) << 12);
/*   */         j = paramArrayOfbyte[++b2];
/*   */         c = (char)(c | (char)(j & 0x3F) << 6);
/*   */         j = paramArrayOfbyte[++b2];
/*   */         c = (char)(c | (char)(j & 0x3F));
/*   */         arrayOfChar[b1++] = c;
/*   */       } 
/*   */     } 
/*   */     return new String(arrayOfChar, 0, b1);
/*   */   }
/*   */   
/*   */   private static v a(v paramv) {
/*   */     return paramv;
/*   */   }
/*   */   
/*   */   public static mt a(long paramLong, Player paramPlayer, Block paramBlock, kP paramkP) {
/*   */     // Byte code:
/*   */     //   0: getstatic me/konsolas/aac/ks.e : J
/*   */     //   3: lload_0
/*   */     //   4: lxor
/*   */     //   5: lstore_0
/*   */     //   6: lload_0
/*   */     //   7: dup2
/*   */     //   8: ldc2_w 120565319789418
/*   */     //   11: lxor
/*   */     //   12: dup2
/*   */     //   13: bipush #32
/*   */     //   15: lushr
/*   */     //   16: l2i
/*   */     //   17: istore #5
/*   */     //   19: dup2
/*   */     //   20: bipush #32
/*   */     //   22: lshl
/*   */     //   23: bipush #48
/*   */     //   25: lushr
/*   */     //   26: l2i
/*   */     //   27: istore #6
/*   */     //   29: dup2
/*   */     //   30: bipush #48
/*   */     //   32: lshl
/*   */     //   33: bipush #48
/*   */     //   35: lushr
/*   */     //   36: l2i
/*   */     //   37: istore #7
/*   */     //   39: pop2
/*   */     //   40: dup2
/*   */     //   41: ldc2_w 34604447951002
/*   */     //   44: lxor
/*   */     //   45: dup2
/*   */     //   46: bipush #48
/*   */     //   48: lushr
/*   */     //   49: l2i
/*   */     //   50: istore #8
/*   */     //   52: dup2
/*   */     //   53: bipush #16
/*   */     //   55: lshl
/*   */     //   56: bipush #32
/*   */     //   58: lushr
/*   */     //   59: l2i
/*   */     //   60: istore #9
/*   */     //   62: dup2
/*   */     //   63: bipush #48
/*   */     //   65: lshl
/*   */     //   66: bipush #48
/*   */     //   68: lushr
/*   */     //   69: l2i
/*   */     //   70: istore #10
/*   */     //   72: pop2
/*   */     //   73: dup2
/*   */     //   74: ldc2_w 61838046182428
/*   */     //   77: lxor
/*   */     //   78: dup2
/*   */     //   79: bipush #48
/*   */     //   81: lushr
/*   */     //   82: l2i
/*   */     //   83: istore #11
/*   */     //   85: dup2
/*   */     //   86: bipush #16
/*   */     //   88: lshl
/*   */     //   89: bipush #32
/*   */     //   91: lushr
/*   */     //   92: l2i
/*   */     //   93: istore #12
/*   */     //   95: dup2
/*   */     //   96: bipush #48
/*   */     //   98: lshl
/*   */     //   99: bipush #48
/*   */     //   101: lushr
/*   */     //   102: l2i
/*   */     //   103: istore #13
/*   */     //   105: pop2
/*   */     //   106: pop2
/*   */     //   107: ldc2_w -6049955426608704646
/*   */     //   110: lload_0
/*   */     //   111: <illegal opcode> w : (JJ)Ljava/lang/String;
/*   */     //   116: astore #14
/*   */     //   118: aload_3
/*   */     //   119: invokeinterface isEmpty : ()Z
/*   */     //   124: ifeq -> 141
/*   */     //   127: getstatic me/konsolas/aac/ks.b : Lme/konsolas/aac/mt;
/*   */     //   130: areturn
/*   */     //   131: ldc2_w -6046658563301895138
/*   */     //   134: lload_0
/*   */     //   135: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*   */     //   140: athrow
/*   */     //   141: iload #5
/*   */     //   143: iload #6
/*   */     //   145: i2s
/*   */     //   146: aload #4
/*   */     //   148: iload #7
/*   */     //   150: i2c
/*   */     //   151: aload_3
/*   */     //   152: invokestatic a : (ISLme/konsolas/aac/kP;CLorg/bukkit/block/Block;)Lme/konsolas/aac/G;
/*   */     //   155: astore #15
/*   */     //   157: getstatic me/konsolas/aac/ks.d : Ljava/util/Map;
/*   */     //   160: aload #15
/*   */     //   162: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   167: checkcast me/konsolas/aac/mt
/*   */     //   170: astore #16
/*   */     //   172: aload #16
/*   */     //   174: lload_0
/*   */     //   175: lconst_0
/*   */     //   176: lcmp
/*   */     //   177: iflt -> 257
/*   */     //   180: aload #14
/*   */     //   182: ifnull -> 257
/*   */     //   185: ifnull -> 214
/*   */     //   188: goto -> 201
/*   */     //   191: ldc2_w -6046658563301895138
/*   */     //   194: lload_0
/*   */     //   195: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*   */     //   200: athrow
/*   */     //   201: aload #16
/*   */     //   203: areturn
/*   */     //   204: ldc2_w -6046658563301895138
/*   */     //   207: lload_0
/*   */     //   208: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*   */     //   213: athrow
/*   */     //   214: new me/konsolas/aac/mt
/*   */     //   217: dup
/*   */     //   218: aload_2
/*   */     //   219: iload #8
/*   */     //   221: i2s
/*   */     //   222: iload #9
/*   */     //   224: iload #10
/*   */     //   226: i2c
/*   */     //   227: aload_3
/*   */     //   228: aload #4
/*   */     //   230: invokespecial <init> : (Lorg/bukkit/entity/Player;SICLorg/bukkit/block/Block;Lme/konsolas/aac/kP;)V
/*   */     //   233: aload #14
/*   */     //   235: ifnull -> 386
/*   */     //   238: astore #16
/*   */     //   240: getstatic me/konsolas/aac/ks.d : Ljava/util/Map;
/*   */     //   243: aload #15
/*   */     //   245: invokeinterface a : ()Lme/konsolas/aac/G;
/*   */     //   250: aload #16
/*   */     //   252: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   257: pop
/*   */     //   258: lload_0
/*   */     //   259: lconst_0
/*   */     //   260: lcmp
/*   */     //   261: ifle -> 371
/*   */     //   264: getstatic me/konsolas/aac/ks.c : Lme/konsolas/aac/iV;
/*   */     //   267: iload #11
/*   */     //   269: i2c
/*   */     //   270: iload #12
/*   */     //   272: iload #13
/*   */     //   274: invokevirtual a : (CII)Z
/*   */     //   277: ifeq -> 384
/*   */     //   280: invokestatic getLogger : ()Ljava/util/logging/Logger;
/*   */     //   283: new java/lang/StringBuilder
/*   */     //   286: dup
/*   */     //   287: invokespecial <init> : ()V
/*   */     //   290: sipush #22139
/*   */     //   293: ldc2_w 8430920455086391709
/*   */     //   296: lload_0
/*   */     //   297: lxor
/*   */     //   298: <illegal opcode> h : (IJ)Ljava/lang/String;
/*   */     //   303: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   306: getstatic me/konsolas/aac/ks.d : Ljava/util/Map;
/*   */     //   309: invokeinterface size : ()I
/*   */     //   314: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*   */     //   317: sipush #31126
/*   */     //   320: ldc2_w 1521547949461663345
/*   */     //   323: lload_0
/*   */     //   324: lxor
/*   */     //   325: <illegal opcode> h : (IJ)Ljava/lang/String;
/*   */     //   330: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   333: aload #15
/*   */     //   335: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*   */     //   338: ldc 'ꕹ䞗'
/*   */     //   340: invokevirtual toCharArray : ()[C
/*   */     //   343: dup
/*   */     //   344: dup
/*   */     //   345: iconst_0
/*   */     //   346: dup_x1
/*   */     //   347: caload
/*   */     //   348: sipush #30044
/*   */     //   351: ixor
/*   */     //   352: i2c
/*   */     //   353: castore
/*   */     //   354: sipush #28069
/*   */     //   357: iconst_1
/*   */     //   358: iconst_1
/*   */     //   359: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*   */     //   362: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   365: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   368: invokevirtual info : (Ljava/lang/String;)V
/*   */     //   371: goto -> 384
/*   */     //   374: ldc2_w -6046658563301895138
/*   */     //   377: lload_0
/*   */     //   378: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*   */     //   383: athrow
/*   */     //   384: aload #16
/*   */     //   386: areturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #14	-> 118
/*   */     //   #15	-> 141
/*   */     //   #1	-> 157
/*   */     //   #4	-> 172
/*   */     //   #9	-> 214
/*   */     //   #13	-> 240
/*   */     //   #16	-> 258
/*   */     //   #17	-> 280
/*   */     //   #20	-> 384
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   118	131	131	aacinternal/v
/*   */     //   172	188	191	aacinternal/v
/*   */     //   185	204	204	aacinternal/v
/*   */     //   257	371	374	aacinternal/v
/*   */   }
/*   */   
/*   */   private static G a(int paramInt, short paramShort, kP paramkP, char paramChar, Block paramBlock) {
/*   */     // Byte code:
/*   */     //   0: iload_0
/*   */     //   1: i2l
/*   */     //   2: bipush #32
/*   */     //   4: lshl
/*   */     //   5: iload_1
/*   */     //   6: i2l
/*   */     //   7: bipush #48
/*   */     //   9: lshl
/*   */     //   10: bipush #32
/*   */     //   12: lushr
/*   */     //   13: lor
/*   */     //   14: iload_3
/*   */     //   15: i2l
/*   */     //   16: bipush #48
/*   */     //   18: lshl
/*   */     //   19: bipush #48
/*   */     //   21: lushr
/*   */     //   22: lor
/*   */     //   23: getstatic me/konsolas/aac/ks.e : J
/*   */     //   26: lxor
/*   */     //   27: lstore #5
/*   */     //   29: lload #5
/*   */     //   31: dup2
/*   */     //   32: ldc2_w 1054174292821
/*   */     //   35: lxor
/*   */     //   36: lstore #7
/*   */     //   38: dup2
/*   */     //   39: ldc2_w 140444413019735
/*   */     //   42: lxor
/*   */     //   43: lstore #9
/*   */     //   45: dup2
/*   */     //   46: ldc2_w 63537119765339
/*   */     //   49: lxor
/*   */     //   50: lstore #11
/*   */     //   52: dup2
/*   */     //   53: ldc2_w 30062233491284
/*   */     //   56: lxor
/*   */     //   57: lstore #13
/*   */     //   59: pop2
/*   */     //   60: ldc2_w -5959857915212230086
/*   */     //   63: lload #5
/*   */     //   65: <illegal opcode> w : (JJ)Ljava/lang/String;
/*   */     //   70: astore #15
/*   */     //   72: getstatic me/konsolas/aac/ks.a : Lme/konsolas/aac/G;
/*   */     //   75: aload #15
/*   */     //   77: ifnull -> 100
/*   */     //   80: ifnull -> 119
/*   */     //   83: goto -> 97
/*   */     //   86: ldc2_w -5956681996584217250
/*   */     //   89: lload #5
/*   */     //   91: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*   */     //   96: athrow
/*   */     //   97: getstatic me/konsolas/aac/ks.a : Lme/konsolas/aac/G;
/*   */     //   100: iload_1
/*   */     //   101: iflt -> 191
/*   */     //   104: lload #11
/*   */     //   106: aload_2
/*   */     //   107: aload #4
/*   */     //   109: invokeinterface a : (JLme/konsolas/aac/kP;Lorg/bukkit/block/Block;)V
/*   */     //   114: aload #15
/*   */     //   116: ifnonnull -> 188
/*   */     //   119: invokestatic a : ()Lme/konsolas/aac/kP;
/*   */     //   122: lload #7
/*   */     //   124: getstatic me/konsolas/aac/kP.V1_13 : Lme/konsolas/aac/kP;
/*   */     //   127: invokevirtual a : (JLme/konsolas/aac/kP;)Z
/*   */     //   130: ifeq -> 173
/*   */     //   133: goto -> 147
/*   */     //   136: ldc2_w -5956681996584217250
/*   */     //   139: lload #5
/*   */     //   141: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*   */     //   146: athrow
/*   */     //   147: new me/konsolas/aac/kr
/*   */     //   150: dup
/*   */     //   151: aload_2
/*   */     //   152: aload #4
/*   */     //   154: lload #9
/*   */     //   156: invokespecial <init> : (Lme/konsolas/aac/kP;Lorg/bukkit/block/Block;J)V
/*   */     //   159: goto -> 185
/*   */     //   162: ldc2_w -5956681996584217250
/*   */     //   165: lload #5
/*   */     //   167: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*   */     //   172: athrow
/*   */     //   173: new me/konsolas/aac/m3
/*   */     //   176: dup
/*   */     //   177: lload #13
/*   */     //   179: aload_2
/*   */     //   180: aload #4
/*   */     //   182: invokespecial <init> : (JLme/konsolas/aac/kP;Lorg/bukkit/block/Block;)V
/*   */     //   185: putstatic me/konsolas/aac/ks.a : Lme/konsolas/aac/G;
/*   */     //   188: getstatic me/konsolas/aac/ks.a : Lme/konsolas/aac/G;
/*   */     //   191: areturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #21	-> 72
/*   */     //   #8	-> 97
/*   */     //   #11	-> 119
/*   */     //   #12	-> 147
/*   */     //   #7	-> 188
/*   */     // Exception table:
/*   */     //   from	to	target	type
/*   */     //   72	83	86	aacinternal/v
/*   */     //   100	133	136	aacinternal/v
/*   */     //   119	162	162	aacinternal/v
/*   */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ks.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */