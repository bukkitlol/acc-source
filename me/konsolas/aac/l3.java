/*    */ package me.konsolas.aac;public class l3 extends li { private li e; private static final long f = nc.a(-2015159557711974346L, -4767315322121665098L, MethodHandles.lookup().lookupClass()).a(88054377911182L); public void a(long paramLong) {
/*  2 */     long l = paramLong ^ 0x0L; this.e.a(l);
/*    */   }
/*    */   private static final String[] g; private static final String[] h; private static final Map i = new HashMap<>(13);
/*    */   public li a() {
/*  6 */     return this.e.a();
/*  7 */   } public li a(long paramLong) { return this.e.a(paramLong); } public final l3 a(li paramli, long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/l3.f : J
/*    */     //   3: lload_2
/*    */     //   4: lxor
/*    */     //   5: lstore_2
/*    */     //   6: ldc2_w 101227375018137439
/*    */     //   9: lload_2
/*    */     //   10: <illegal opcode> w : (JJ)I
/*    */     //   15: istore #4
/*    */     //   17: iload #4
/*    */     //   19: ifne -> 75
/*    */     //   22: aload_1
/*    */     //   23: ifnonnull -> 70
/*    */     //   26: goto -> 39
/*    */     //   29: ldc2_w 116382395151372130
/*    */     //   32: lload_2
/*    */     //   33: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   38: athrow
/*    */     //   39: new java/lang/IllegalArgumentException
/*    */     //   42: dup
/*    */     //   43: sipush #21038
/*    */     //   46: ldc2_w 7609483036789660268
/*    */     //   49: lload_2
/*    */     //   50: lxor
/*    */     //   51: <illegal opcode> r : (IJ)Ljava/lang/String;
/*    */     //   56: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   59: athrow
/*    */     //   60: ldc2_w 116382395151372130
/*    */     //   63: lload_2
/*    */     //   64: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   69: athrow
/*    */     //   70: aload_0
/*    */     //   71: aload_1
/*    */     //   72: putfield e : Lme/konsolas/aac/li;
/*    */     //   75: aload_0
/*    */     //   76: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #9	-> 17
/*    */     //   #3	-> 70
/*    */     //   #8	-> 75
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   17	26	29	java/lang/IllegalArgumentException
/*    */     //   22	60	60	java/lang/IllegalArgumentException
/*    */   } public long a(int paramInt1, int paramInt2) {
/* 10 */     long l = paramInt1 << 32L | paramInt2 << 32L >>> 32L; int i = (int)((l ^ 0x0L) >>> 32L), j = (int)((l ^ 0x0L) << 32L >>> 32L); l ^ 0x0L; return this.e.a(i, j);
/*    */   }
/* 12 */   public long b() { return this.e.b(); }
/* 13 */   public final li c() { return this.e; }
/* 14 */   public li b() { return this.e.b(); }
/* 15 */   public li a(long paramLong1, long paramLong2, TimeUnit paramTimeUnit) { long l = paramLong2 ^ 0x0L; return this.e.a(paramLong1, l, paramTimeUnit); } public boolean a() {
/* 16 */     return this.e.a();
/*    */   }
/*    */   
/*    */   public l3(long paramLong, li paramli) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/l3.f : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: ldc2_w -4485514064651880056
/*    */     //   9: lload_1
/*    */     //   10: <illegal opcode> w : (JJ)I
/*    */     //   15: aload_0
/*    */     //   16: invokespecial <init> : ()V
/*    */     //   19: istore #4
/*    */     //   21: iload #4
/*    */     //   23: ifeq -> 79
/*    */     //   26: aload_3
/*    */     //   27: ifnonnull -> 74
/*    */     //   30: goto -> 43
/*    */     //   33: ldc2_w -4486972074370298044
/*    */     //   36: lload_1
/*    */     //   37: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   42: athrow
/*    */     //   43: new java/lang/IllegalArgumentException
/*    */     //   46: dup
/*    */     //   47: sipush #6157
/*    */     //   50: ldc2_w 6114037706512420968
/*    */     //   53: lload_1
/*    */     //   54: lxor
/*    */     //   55: <illegal opcode> r : (IJ)Ljava/lang/String;
/*    */     //   60: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   63: athrow
/*    */     //   64: ldc2_w -4486972074370298044
/*    */     //   67: lload_1
/*    */     //   68: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
/*    */     //   73: athrow
/*    */     //   74: aload_0
/*    */     //   75: aload_3
/*    */     //   76: putfield e : Lme/konsolas/aac/li;
/*    */     //   79: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #17	-> 15
/*    */     //   #5	-> 21
/*    */     //   #11	-> 74
/*    */     //   #1	-> 79
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   21	30	33	java/lang/IllegalArgumentException
/*    */     //   26	64	64	java/lang/IllegalArgumentException
/*    */   }
/*    */   
/*    */   static {
/*    */     long l = f ^ 0x49F06864DEEFL;
/*    */     "틣?⬴顂侃庪儨剖呺됣䦯⅑献?똏ዣ洉偹쏯⡳".toCharArray()[11] = (char)("틣?⬴顂侃庪儨剖呺됣䦯⅑献?똏ዣ洉偹쏯⡳".toCharArray()[11] ^ 0x4A1C);
/*    */     "縶㓽?糉".toCharArray()[2] = (char)("縶㓽?糉".toCharArray()[2] ^ 0x54C2);
/*    */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*    */     for (byte b1 = 1; b1 < 8; b1++)
/*    */       (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
/*    */     Cipher cipher;
/*    */     (cipher = Cipher.getInstance(a0$cc.G("틣?⬴顂侃庪儨剖呺됣䦯⅑献?똏ዣ洉偹쏯⡳".toCharArray(), (short)30852, true, (byte)2))).init(2, SecretKeyFactory.getInstance(a0$cc.G("縶㓽?糉".toCharArray(), (short)7194, true, (byte)1)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*    */     String[] arrayOfString = new String[2];
/*    */     boolean bool = false;
/*    */     "盀䛺腭뇫額뙛鰳梼禅냭ႅ羪쓿뷻ἧ墨㔴몟ၿ嚴⡋뗔?亊瑿귊덁夰?ﳪ腘Ϗ⣂?ꆴ춺屬啇㞬뉑藝톻ꅗꙎ똶㓄?徠薶夷겍眣䋊뚓뛂ꊦ뺋閌뼡ﳄ脺걑ﴀ喬㚜ꉈ쏢鉯监悧슌꩏⮮央쫣ᅮ".toCharArray()[2] = (char)("盀䛺腭뇫額뙛鰳梼禅냭ႅ羪쓿뷻ἧ墨㔴몟ၿ嚴⡋뗔?亊瑿귊덁夰?ﳪ腘Ϗ⣂?ꆴ춺屬啇㞬뉑藝톻ꅗꙎ똶㓄?徠薶夷겍眣䋊뚓뛂ꊦ뺋閌뼡ﳄ脺걑ﴀ喬㚜ꉈ쏢鉯监悧슌꩏⮮央쫣ᅮ".toCharArray()[2] ^ 0x68D6);
/*    */     String str;
/*    */     int i = (str = a0$cc.G("盀䛺腭뇫額뙛鰳梼禅냭ႅ羪쓿뷻ἧ墨㔴몟ၿ嚴⡋뗔?亊瑿귊덁夰?ﳪ腘Ϗ⣂?ꆴ춺屬啇㞬뉑藝톻ꅗꙎ똶㓄?徠薶夷겍眣䋊뚓뛂ꊦ뺋閌뼡ﳄ脺걑ﴀ喬㚜ꉈ쏢鉯监悧슌꩏⮮央쫣ᅮ".toCharArray(), (short)26320, true, (byte)3)).length();
/*    */     byte b2 = 40;
/*    */     byte b = -1;
/*    */     while (true);
/*    */   }
/*    */   
/*    */   private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
/*    */     return paramIllegalArgumentException;
/*    */   }
/*    */   
/*    */   private static String b(byte[] paramArrayOfbyte) {
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
/*    */   private static String b(int paramInt, long paramLong) {
/*    */     int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x8A7;
/*    */     if (h[i] == null) {
/*    */       Object[] arrayOfObject;
/*    */       try {
/*    */         Long long_ = Long.valueOf(Thread.currentThread().getId());
/*    */         arrayOfObject = (Object[])i.get(long_);
/*    */         if (arrayOfObject == null) {
/*    */           arrayOfObject = new Object[3];
/*    */           "ቔ锄⯅顡滠믾᭸⼸?ṓ䇒䂤픷ր䦒᣼ࡒ".toCharArray()[6] = (char)("ቔ锄⯅顡滠믾᭸⼸?ṓ䇒䂤픷ր䦒᣼ࡒ".toCharArray()[6] ^ 0x50AA);
/*    */           arrayOfObject[0] = Cipher.getInstance(da$gx.U("ቔ锄⯅顡滠믾᭸⼸?ṓ䇒䂤픷ր䦒᣼ࡒ".toCharArray(), (short)7548, false, false));
/*    */           "뾠飅橌".toCharArray()[1] = (char)("뾠飅橌".toCharArray()[1] ^ 0x7202);
/*    */           arrayOfObject[1] = SecretKeyFactory.getInstance(da$gx.U("뾠飅橌".toCharArray(), (short)29212, true, false));
/*    */           arrayOfObject[2] = new IvParameterSpec(new byte[8]);
/*    */           i.put(long_, arrayOfObject);
/*    */         } 
/*    */       } catch (Exception exception) {
/*    */         "慷೜⨣뱜웡퀅ꁳ?ᙿ䑆쎄嚙㫹⚯︉ꝼ偑".toCharArray()[0] = (char)("慷೜⨣뱜웡퀅ꁳ?ᙿ䑆쎄嚙㫹⚯︉ꝼ偑".toCharArray()[0] ^ 0x4DC3);
/*    */         throw new RuntimeException(da$gx.U("慷೜⨣뱜웡퀅ꁳ?ᙿ䑆쎄嚙㫹⚯︉ꝼ偑".toCharArray(), (short)30181, true, false), exception);
/*    */       } 
/*    */       byte[] arrayOfByte1 = new byte[8];
/*    */       arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
/*    */       for (byte b = 1; b < 8; b++)
/*    */         arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
/*    */       DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
/*    */       SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
/*    */       ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
/*    */       "쭇윮檳핻뎟픝૚䏤뢐䄡示".toCharArray()[8] = (char)("쭇윮檳핻뎟픝૚䏤뢐䄡示".toCharArray()[8] ^ 0x53BD);
/*    */       byte[] arrayOfByte2 = g[i].getBytes(da$gx.U("쭇윮檳핻뎟픝૚䏤뢐䄡示".toCharArray(), (short)13427, false, false));
/*    */       h[i] = b(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
/*    */     } 
/*    */     return h[i];
/*    */   }
/*    */   
/*    */   private static Object b(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
/*    */     int i = ((Integer)paramArrayOfObject[0]).intValue();
/*    */     long l = ((Long)paramArrayOfObject[1]).longValue();
/*    */     String str = b(i, l);
/*    */     MethodHandle methodHandle = MethodHandles.constant(String.class, str);
/*    */     paramMutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[] { int.class, long.class }));
/*    */     return str;
/*    */   }
/*    */   
/*    */   private static CallSite b(MethodHandles.Lookup paramLookup, String paramString, MethodType paramMethodType) {
/*    */     // Byte code:
/*    */     //   0: new java/lang/invoke/MutableCallSite
/*    */     //   3: dup
/*    */     //   4: aload_2
/*    */     //   5: invokespecial <init> : (Ljava/lang/invoke/MethodType;)V
/*    */     //   8: astore_3
/*    */     //   9: aload_3
/*    */     //   10: ldc_w
/*    */     //   13: ldc [Ljava/lang/Object;
/*    */     //   15: aload_2
/*    */     //   16: invokevirtual parameterCount : ()I
/*    */     //   19: invokevirtual asCollector : (Ljava/lang/Class;I)Ljava/lang/invoke/MethodHandle;
/*    */     //   22: iconst_0
/*    */     //   23: iconst_3
/*    */     //   24: anewarray java/lang/Object
/*    */     //   27: dup
/*    */     //   28: iconst_0
/*    */     //   29: aload_0
/*    */     //   30: aastore
/*    */     //   31: dup
/*    */     //   32: iconst_1
/*    */     //   33: aload_3
/*    */     //   34: aastore
/*    */     //   35: dup
/*    */     //   36: iconst_2
/*    */     //   37: aload_1
/*    */     //   38: aastore
/*    */     //   39: invokestatic insertArguments : (Ljava/lang/invoke/MethodHandle;I[Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;
/*    */     //   42: aload_2
/*    */     //   43: invokestatic explicitCastArguments : (Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;
/*    */     //   46: invokevirtual setTarget : (Ljava/lang/invoke/MethodHandle;)V
/*    */     //   49: goto -> 170
/*    */     //   52: astore #4
/*    */     //   54: new java/lang/RuntimeException
/*    */     //   57: dup
/*    */     //   58: new java/lang/StringBuilder
/*    */     //   61: dup
/*    */     //   62: invokespecial <init> : ()V
/*    */     //   65: ldc_w 'ぅ␏띛碒ⷧ眚殍믠厃?㿷훖瘥蟳᧗隕签'
/*    */     //   68: invokevirtual toCharArray : ()[C
/*    */     //   71: dup
/*    */     //   72: dup
/*    */     //   73: bipush #16
/*    */     //   75: dup_x1
/*    */     //   76: caload
/*    */     //   77: sipush #6750
/*    */     //   80: ixor
/*    */     //   81: i2c
/*    */     //   82: castore
/*    */     //   83: sipush #30298
/*    */     //   86: iconst_0
/*    */     //   87: iconst_2
/*    */     //   88: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*    */     //   91: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   94: ldc_w '辰肋ݼ'
/*    */     //   97: invokevirtual toCharArray : ()[C
/*    */     //   100: dup
/*    */     //   101: dup
/*    */     //   102: iconst_0
/*    */     //   103: dup_x1
/*    */     //   104: caload
/*    */     //   105: sipush #25241
/*    */     //   108: ixor
/*    */     //   109: i2c
/*    */     //   110: castore
/*    */     //   111: sipush #13774
/*    */     //   114: iconst_0
/*    */     //   115: iconst_2
/*    */     //   116: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*    */     //   119: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   122: aload_1
/*    */     //   123: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   126: ldc_w '퇍銎᬴'
/*    */     //   129: invokevirtual toCharArray : ()[C
/*    */     //   132: dup
/*    */     //   133: dup
/*    */     //   134: iconst_2
/*    */     //   135: dup_x1
/*    */     //   136: caload
/*    */     //   137: sipush #12392
/*    */     //   140: ixor
/*    */     //   141: i2c
/*    */     //   142: castore
/*    */     //   143: sipush #20773
/*    */     //   146: iconst_0
/*    */     //   147: iconst_0
/*    */     //   148: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
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
/*    */     //   9	49	52	java/lang/Exception
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\l3.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */