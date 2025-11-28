/*    */ package me.konsolas.aac;
/*    */ import aacinternal.v;
/*    */ import java.lang.invoke.MethodHandles;
/*    */ import java.lang.invoke.MutableCallSite;
/*    */ import javax.crypto.Cipher;
/*    */ import javax.crypto.SecretKeyFactory;
/*    */ import javax.crypto.spec.DESKeySpec;
/*    */ import javax.crypto.spec.IvParameterSpec;
/*    */ 
/*    */ public class mc extends m8 {
/*    */   public mc(String paramString, eA parameA, double paramDouble, boolean paramBoolean) {
/* 12 */     super(paramString);
/*    */ 
/*    */     
/*    */     this.f = parameA;
/*    */ 
/*    */     
/* 18 */     this.e = paramDouble;
/*    */     this.d = paramBoolean;
/*    */   }
/*    */   
/*    */   private final eA f;
/*    */   private final double e;
/*    */   private final boolean d;
/*    */   private static final String[] g;
/*    */   private static final String[] h;
/*    */   private static final Map i = new HashMap<>(13);
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
/*    */     //   66: ldc_w 'ᰒ꺃⒥惓仴餼쒞憙ⷯظ홢ᥢ㴗ṂꦖᏖ⑾'
/*    */     //   69: invokevirtual toCharArray : ()[C
/*    */     //   72: dup
/*    */     //   73: dup
/*    */     //   74: bipush #17
/*    */     //   76: dup_x1
/*    */     //   77: caload
/*    */     //   78: sipush #4559
/*    */     //   81: ixor
/*    */     //   82: i2c
/*    */     //   83: castore
/*    */     //   84: sipush #3910
/*    */     //   87: iconst_2
/*    */     //   88: iconst_4
/*    */     //   89: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*    */     //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   95: ldc_w '쫿艻〱晛'
/*    */     //   98: invokevirtual toCharArray : ()[C
/*    */     //   101: dup
/*    */     //   102: dup
/*    */     //   103: iconst_1
/*    */     //   104: dup_x1
/*    */     //   105: caload
/*    */     //   106: sipush #8077
/*    */     //   109: ixor
/*    */     //   110: i2c
/*    */     //   111: castore
/*    */     //   112: sipush #10403
/*    */     //   115: iconst_1
/*    */     //   116: iconst_2
/*    */     //   117: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*    */     //   120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   123: aload_1
/*    */     //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   127: ldc_w '鷚膮䤉'
/*    */     //   130: invokevirtual toCharArray : ()[C
/*    */     //   133: dup
/*    */     //   134: dup
/*    */     //   135: iconst_2
/*    */     //   136: dup_x1
/*    */     //   137: caload
/*    */     //   138: sipush #26904
/*    */     //   141: ixor
/*    */     //   142: i2c
/*    */     //   143: castore
/*    */     //   144: sipush #23216
/*    */     //   147: iconst_0
/*    */     //   148: iconst_2
/*    */     //   149: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
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
/*    */     int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x716D;
/*    */     if (h[i] == null) {
/*    */       Object[] arrayOfObject;
/*    */       try {
/*    */         Long long_ = Long.valueOf(Thread.currentThread().getId());
/*    */         arrayOfObject = (Object[])i.get(long_);
/*    */         if (arrayOfObject == null) {
/*    */           arrayOfObject = new Object[3];
/*    */           "믢ຉၩ왭싲囜⵱죓ဳⴚ氀❿뻘ᓓ痝펀혥㞛?倶".toCharArray()[0] = (char)("믢ຉၩ왭싲囜⵱죓ဳⴚ氀❿뻘ᓓ痝펀혥㞛?倶".toCharArray()[0] ^ 0x54FD);
/*    */           arrayOfObject[0] = Cipher.getInstance(da$gx.U("믢ຉၩ왭싲囜⵱죓ဳⴚ氀❿뻘ᓓ痝펀혥㞛?倶".toCharArray(), (short)5655, true, false));
/*    */           "⏻駯κ⛹".toCharArray()[0] = (char)("⏻駯κ⛹".toCharArray()[0] ^ 0x3054);
/*    */           arrayOfObject[1] = SecretKeyFactory.getInstance(da$gx.U("⏻駯κ⛹".toCharArray(), (short)13473, false, false));
/*    */           arrayOfObject[2] = new IvParameterSpec(new byte[8]);
/*    */           i.put(long_, arrayOfObject);
/*    */         } 
/*    */       } catch (Exception exception) {
/*    */         "鴀ﯾ버홀⿸㷕阓帷˜뛊␇甕螤蕘傓旐裂吲".toCharArray()[16] = (char)("鴀ﯾ버홀⿸㷕阓帷˜뛊␇甕螤蕘傓旐裂吲".toCharArray()[16] ^ 0x238F);
/*    */         throw new RuntimeException(da$gx.U("鴀ﯾ버홀⿸㷕阓帷˜뛊␇甕螤蕘傓旐裂吲".toCharArray(), (short)31271, false, false), exception);
/*    */       } 
/*    */       byte[] arrayOfByte1 = new byte[8];
/*    */       arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
/*    */       for (byte b = 1; b < 8; b++)
/*    */         arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
/*    */       DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
/*    */       SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
/*    */       ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
/*    */       "籴ﭻ轪㍎帿率衇㜬ꀾ⛂㎄".toCharArray()[9] = (char)("籴ﭻ轪㍎帿率衇㜬ꀾ⛂㎄".toCharArray()[9] ^ 0x48E7);
/*    */       byte[] arrayOfByte2 = g[i].getBytes(da$gx.U("籴ﭻ轪㍎帿率衇㜬ꀾ⛂㎄".toCharArray(), (short)20614, false, true));
/*    */       h[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
/*    */     } 
/*    */     return h[i];
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
/*    */     long l = nc.a(8802831665999334747L, -3610632491556173706L, MethodHandles.lookup().lookupClass()).a(247007726833037L) ^ 0x729C817F7F9FL;
/*    */     "拐刱垛ꏵⶪ鷟謄癗Ꝏ뭂냬蟲칻勞춟杻撲ﱫ狦⇽".toCharArray()[19] = (char)("拐刱垛ꏵⶪ鷟謄癗Ꝏ뭂냬蟲칻勞춟杻撲ﱫ狦⇽".toCharArray()[19] ^ 0x4EF9);
/*    */     "졿쉰詣ᒚ".toCharArray()[2] = (char)("졿쉰詣ᒚ".toCharArray()[2] ^ 0x6278);
/*    */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*    */     for (byte b1 = 1; b1 < 8; b1++)
/*    */       (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
/*    */     Cipher cipher;
/*    */     (cipher = Cipher.getInstance(a0$cc.G("拐刱垛ꏵⶪ鷟謄癗Ꝏ뭂냬蟲칻勞춟杻撲ﱫ狦⇽".toCharArray(), (short)7811, true, (byte)5))).init(2, SecretKeyFactory.getInstance(a0$cc.G("졿쉰詣ᒚ".toCharArray(), (short)21691, true, (byte)4)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*    */     String[] arrayOfString = new String[10];
/*    */     boolean bool = false;
/*    */     "퍳袇꾨파緻䢰ǭ퓴⌂줡쪈澬ힽ쀬î뷷鱟삆魠厱ꖢ㼅庡흩嫌炁佢ﲍﮓ꬧O蝭꺨摽壔惊娉軡쎕ᰪꎕ銎쁢䇰┬❱ᕪ䅀希䶊篵덆ꨔ㋜䪗?쾌睱鉄ʾ忷锅꩔᪫墾Ⱈⅉ芪뷦沝ᮎꝟ駥㦂ᄀ댶牅䬅쌃◳ﱇ앒㙫瘵蔠탘퓥썾邦　⹎蟞︓㮄쯜돬䏼䏳泹咯拝陊蔉㐃◆꓉✙䀀硰䪙쓙γ럙쥦侟릌䊓鮸Ὢ仍쎉㷀⾻阋슾䅰劺穜⽄萇ऌ心똲㷒鷎伒ⱎ䁌ꀡꁰ⛺黽?륬쀭븁摇蘨桻㇦庼퍲熗澃鯞㝃Ḕ癵บ跚ꃸ힕ল".toCharArray()[45] = (char)("퍳袇꾨파緻䢰ǭ퓴⌂줡쪈澬ힽ쀬î뷷鱟삆魠厱ꖢ㼅庡흩嫌炁佢ﲍﮓ꬧O蝭꺨摽壔惊娉軡쎕ᰪꎕ銎쁢䇰┬❱ᕪ䅀希䶊篵덆ꨔ㋜䪗?쾌睱鉄ʾ忷锅꩔᪫墾Ⱈⅉ芪뷦沝ᮎꝟ駥㦂ᄀ댶牅䬅쌃◳ﱇ앒㙫瘵蔠탘퓥썾邦　⹎蟞︓㮄쯜돬䏼䏳泹咯拝陊蔉㐃◆꓉✙䀀硰䪙쓙γ럙쥦侟릌䊓鮸Ὢ仍쎉㷀⾻阋슾䅰劺穜⽄萇ऌ心똲㷒鷎伒ⱎ䁌ꀡꁰ⛺黽?륬쀭븁摇蘨桻㇦庼퍲熗澃鯞㝃Ḕ癵บ跚ꃸ힕ল".toCharArray()[45] ^ 0x1A72);
/*    */     String str;
/*    */     int i = (str = a0$cc.G("퍳袇꾨파緻䢰ǭ퓴⌂줡쪈澬ힽ쀬î뷷鱟삆魠厱ꖢ㼅庡흩嫌炁佢ﲍﮓ꬧O蝭꺨摽壔惊娉軡쎕ᰪꎕ銎쁢䇰┬❱ᕪ䅀希䶊篵덆ꨔ㋜䪗?쾌睱鉄ʾ忷锅꩔᪫墾Ⱈⅉ芪뷦沝ᮎꝟ駥㦂ᄀ댶牅䬅쌃◳ﱇ앒㙫瘵蔠탘퓥썾邦　⹎蟞︓㮄쯜돬䏼䏳泹咯拝陊蔉㐃◆꓉✙䀀硰䪙쓙γ럙쥦侟릌䊓鮸Ὢ仍쎉㷀⾻阋슾䅰劺穜⽄萇ऌ心똲㷒鷎伒ⱎ䁌ꀡꁰ⛺黽?륬쀭븁摇蘨桻㇦庼퍲熗澃鯞㝃Ḕ癵บ跚ꃸ힕ল".toCharArray(), (short)29652, true, (byte)1)).length();
/*    */     byte b2 = 16;
/*    */     byte b = -1;
/*    */     while (true);
/*    */   }
/*    */   
/*    */   public Optional a(long paramLong, List paramList, lY paramlY, ef paramef, String paramString) {
/*    */     // Byte code:
/*    */     //   0: lload_1
/*    */     //   1: dup2
/*    */     //   2: ldc2_w 17838594571380
/*    */     //   5: lxor
/*    */     //   6: lstore #7
/*    */     //   8: dup2
/*    */     //   9: ldc2_w 39108417017163
/*    */     //   12: lxor
/*    */     //   13: lstore #9
/*    */     //   15: pop2
/*    */     //   16: ldc2_w 341268060744998595
/*    */     //   19: lload_1
/*    */     //   20: <illegal opcode> w : (JJ)Z
/*    */     //   25: aload_0
/*    */     //   26: getfield f : Lme/konsolas/aac/eA;
/*    */     //   29: lload #7
/*    */     //   31: aload_3
/*    */     //   32: aload_0
/*    */     //   33: getfield e : D
/*    */     //   36: aload_0
/*    */     //   37: getfield d : Z
/*    */     //   40: ldc2_w 345846203868911712
/*    */     //   43: lload_1
/*    */     //   44: <illegal opcode> w : (Lme/konsolas/aac/eA;JLjava/util/List;DZJJ)Ljava/util/Optional;
/*    */     //   49: astore #12
/*    */     //   51: istore #11
/*    */     //   53: aload #12
/*    */     //   55: iload #11
/*    */     //   57: ifne -> 585
/*    */     //   60: ldc2_w 415828142305610250
/*    */     //   63: lload_1
/*    */     //   64: <illegal opcode> b : (Ljava/util/Optional;JJ)Z
/*    */     //   69: ifeq -> 576
/*    */     //   72: goto -> 85
/*    */     //   75: ldc2_w 423700718760945893
/*    */     //   78: lload_1
/*    */     //   79: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   84: athrow
/*    */     //   85: dconst_1
/*    */     //   86: aload #12
/*    */     //   88: ldc2_w 369121088297188938
/*    */     //   91: lload_1
/*    */     //   92: <illegal opcode> b : (Ljava/util/Optional;JJ)Ljava/lang/Object;
/*    */     //   97: checkcast me/konsolas/aac/hN
/*    */     //   100: ldc2_w 377994554364812009
/*    */     //   103: lload_1
/*    */     //   104: <illegal opcode> b : (Lme/konsolas/aac/hN;JJ)D
/*    */     //   109: ddiv
/*    */     //   110: ldc2_w 1000.0
/*    */     //   113: ldc2_w 423779890258894990
/*    */     //   116: lload_1
/*    */     //   117: <illegal opcode> w : (DDJJ)D
/*    */     //   122: dstore #13
/*    */     //   124: new java/util/LinkedHashMap
/*    */     //   127: dup
/*    */     //   128: invokespecial <init> : ()V
/*    */     //   131: astore #15
/*    */     //   133: aload #15
/*    */     //   135: sipush #9945
/*    */     //   138: ldc2_w 6657242728813777860
/*    */     //   141: lload_1
/*    */     //   142: lxor
/*    */     //   143: <illegal opcode> u : (IJ)Ljava/lang/String;
/*    */     //   148: aload_0
/*    */     //   149: ldc2_w 328938820908178744
/*    */     //   152: lload_1
/*    */     //   153: <illegal opcode> b : (Lme/konsolas/aac/m8;JJ)Ljava/lang/String;
/*    */     //   158: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   163: pop
/*    */     //   164: aload #15
/*    */     //   166: sipush #13690
/*    */     //   169: ldc2_w 3982147834900004970
/*    */     //   172: lload_1
/*    */     //   173: lxor
/*    */     //   174: <illegal opcode> u : (IJ)Ljava/lang/String;
/*    */     //   179: getstatic java/util/Locale.UK : Ljava/util/Locale;
/*    */     //   182: sipush #5005
/*    */     //   185: ldc2_w 5106533380768720540
/*    */     //   188: lload_1
/*    */     //   189: lxor
/*    */     //   190: <illegal opcode> u : (IJ)Ljava/lang/String;
/*    */     //   195: iconst_1
/*    */     //   196: anewarray java/lang/Object
/*    */     //   199: dup
/*    */     //   200: iconst_0
/*    */     //   201: dload #13
/*    */     //   203: ldc2_w 340189576066490091
/*    */     //   206: lload_1
/*    */     //   207: <illegal opcode> w : (DJJ)Ljava/lang/Double;
/*    */     //   212: aastore
/*    */     //   213: ldc2_w 394174069856740136
/*    */     //   216: lload_1
/*    */     //   217: <illegal opcode> w : (Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;JJ)Ljava/lang/String;
/*    */     //   222: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   227: pop
/*    */     //   228: aload #15
/*    */     //   230: sipush #30854
/*    */     //   233: ldc2_w 6171622640750398864
/*    */     //   236: lload_1
/*    */     //   237: lxor
/*    */     //   238: <illegal opcode> u : (IJ)Ljava/lang/String;
/*    */     //   243: aload #12
/*    */     //   245: ldc2_w 369121088297188938
/*    */     //   248: lload_1
/*    */     //   249: <illegal opcode> b : (Ljava/util/Optional;JJ)Ljava/lang/Object;
/*    */     //   254: checkcast me/konsolas/aac/hN
/*    */     //   257: ldc2_w 384796362202156073
/*    */     //   260: lload_1
/*    */     //   261: <illegal opcode> b : (Lme/konsolas/aac/hN;JJ)I
/*    */     //   266: ldc2_w 365847678624198656
/*    */     //   269: lload_1
/*    */     //   270: <illegal opcode> w : (IJJ)Ljava/lang/String;
/*    */     //   275: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   280: pop
/*    */     //   281: aload #15
/*    */     //   283: sipush #31862
/*    */     //   286: ldc2_w 1085367374443546981
/*    */     //   289: lload_1
/*    */     //   290: lxor
/*    */     //   291: <illegal opcode> u : (IJ)Ljava/lang/String;
/*    */     //   296: aload #12
/*    */     //   298: ldc2_w 369121088297188938
/*    */     //   301: lload_1
/*    */     //   302: <illegal opcode> b : (Ljava/util/Optional;JJ)Ljava/lang/Object;
/*    */     //   307: checkcast me/konsolas/aac/hN
/*    */     //   310: ldc2_w 426807124102807593
/*    */     //   313: lload_1
/*    */     //   314: <illegal opcode> b : (Lme/konsolas/aac/hN;JJ)I
/*    */     //   319: ldc2_w 365847678624198656
/*    */     //   322: lload_1
/*    */     //   323: <illegal opcode> w : (IJJ)Ljava/lang/String;
/*    */     //   328: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   333: pop
/*    */     //   334: aload #15
/*    */     //   336: sipush #15319
/*    */     //   339: ldc2_w 9191267335134826176
/*    */     //   342: lload_1
/*    */     //   343: lxor
/*    */     //   344: <illegal opcode> u : (IJ)Ljava/lang/String;
/*    */     //   349: getstatic java/util/Locale.UK : Ljava/util/Locale;
/*    */     //   352: sipush #4619
/*    */     //   355: ldc2_w 7686089798321792793
/*    */     //   358: lload_1
/*    */     //   359: lxor
/*    */     //   360: <illegal opcode> u : (IJ)Ljava/lang/String;
/*    */     //   365: iconst_1
/*    */     //   366: anewarray java/lang/Object
/*    */     //   369: dup
/*    */     //   370: iconst_0
/*    */     //   371: aload #12
/*    */     //   373: ldc2_w 369121088297188938
/*    */     //   376: lload_1
/*    */     //   377: <illegal opcode> b : (Ljava/util/Optional;JJ)Ljava/lang/Object;
/*    */     //   382: checkcast me/konsolas/aac/hN
/*    */     //   385: ldc2_w 375118357299771918
/*    */     //   388: lload_1
/*    */     //   389: <illegal opcode> b : (Lme/konsolas/aac/hN;JJ)D
/*    */     //   394: ldc2_w 340189576066490091
/*    */     //   397: lload_1
/*    */     //   398: <illegal opcode> w : (DJJ)Ljava/lang/Double;
/*    */     //   403: aastore
/*    */     //   404: ldc2_w 394174069856740136
/*    */     //   407: lload_1
/*    */     //   408: <illegal opcode> w : (Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;JJ)Ljava/lang/String;
/*    */     //   413: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   418: pop
/*    */     //   419: aload #15
/*    */     //   421: ldc '痯Ẳ'
/*    */     //   423: invokevirtual toCharArray : ()[C
/*    */     //   426: dup
/*    */     //   427: dup
/*    */     //   428: iconst_0
/*    */     //   429: dup_x1
/*    */     //   430: caload
/*    */     //   431: sipush #12034
/*    */     //   434: ixor
/*    */     //   435: i2c
/*    */     //   436: castore
/*    */     //   437: sipush #3347
/*    */     //   440: iconst_0
/*    */     //   441: iconst_5
/*    */     //   442: invokestatic H : (Ljava/lang/Object;SBB)Ljava/lang/String;
/*    */     //   445: getstatic java/util/Locale.UK : Ljava/util/Locale;
/*    */     //   448: sipush #18728
/*    */     //   451: ldc2_w 1290467397470174268
/*    */     //   454: lload_1
/*    */     //   455: lxor
/*    */     //   456: <illegal opcode> u : (IJ)Ljava/lang/String;
/*    */     //   461: iconst_1
/*    */     //   462: anewarray java/lang/Object
/*    */     //   465: dup
/*    */     //   466: iconst_0
/*    */     //   467: aload #12
/*    */     //   469: ldc2_w 369121088297188938
/*    */     //   472: lload_1
/*    */     //   473: <illegal opcode> b : (Ljava/util/Optional;JJ)Ljava/lang/Object;
/*    */     //   478: checkcast me/konsolas/aac/hN
/*    */     //   481: ldc2_w 377994554364812009
/*    */     //   484: lload_1
/*    */     //   485: <illegal opcode> b : (Lme/konsolas/aac/hN;JJ)D
/*    */     //   490: ldc2_w 340189576066490091
/*    */     //   493: lload_1
/*    */     //   494: <illegal opcode> w : (DJJ)Ljava/lang/Double;
/*    */     //   499: aastore
/*    */     //   500: ldc2_w 394174069856740136
/*    */     //   503: lload_1
/*    */     //   504: <illegal opcode> w : (Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;JJ)Ljava/lang/String;
/*    */     //   509: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   514: pop
/*    */     //   515: aload #15
/*    */     //   517: sipush #30035
/*    */     //   520: ldc2_w 3391632819120701519
/*    */     //   523: lload_1
/*    */     //   524: lxor
/*    */     //   525: <illegal opcode> u : (IJ)Ljava/lang/String;
/*    */     //   530: sipush #4322
/*    */     //   533: ldc2_w 4864879872889218551
/*    */     //   536: lload_1
/*    */     //   537: lxor
/*    */     //   538: <illegal opcode> u : (IJ)Ljava/lang/String;
/*    */     //   543: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   548: pop
/*    */     //   549: aload #6
/*    */     //   551: aload #15
/*    */     //   553: dload #13
/*    */     //   555: lload #9
/*    */     //   557: ldc2_w 339672891414467735
/*    */     //   560: lload_1
/*    */     //   561: <illegal opcode> w : (Ljava/lang/String;Ljava/util/Map;DJJJ)Lme/konsolas/aac/ah;
/*    */     //   566: ldc2_w 369840208558991866
/*    */     //   569: lload_1
/*    */     //   570: <illegal opcode> w : (Ljava/lang/Object;JJ)Ljava/util/Optional;
/*    */     //   575: areturn
/*    */     //   576: ldc2_w 335386802571957573
/*    */     //   579: lload_1
/*    */     //   580: <illegal opcode> w : (JJ)Ljava/util/Optional;
/*    */     //   585: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #2	-> 25
/*    */     //   #16	-> 53
/*    */     //   #13	-> 85
/*    */     //   #11	-> 124
/*    */     //   #9	-> 133
/*    */     //   #5	-> 164
/*    */     //   #6	-> 228
/*    */     //   #10	-> 281
/*    */     //   #4	-> 334
/*    */     //   #3	-> 419
/*    */     //   #8	-> 515
/*    */     //   #15	-> 549
/*    */     //   #14	-> 576
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   53	72	75	aacinternal/v
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\mc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */