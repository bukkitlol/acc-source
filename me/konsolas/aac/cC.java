/*  1 */ package me.konsolas.aac;final class cc { public static final Charset a; private static void a(Throwable paramThrowable) { throw paramThrowable; }
/*    */   
/*    */   private static final long b; private static final String[] c;
/*    */   private static final String[] d;
/*    */   private static final Map e;
/*    */   
/*    */   public static int a(int paramInt) {
/*  8 */     return (paramInt & 0xFF000000) >>> 24 | (paramInt & 0xFF0000) >>> 8 | (paramInt & 0xFF00) << 8 | (paramInt & 0xFF) << 24;
/*    */   } public static void a(long paramLong1, long paramLong2, long paramLong3, long paramLong4) { // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/cc.b : J
/*    */     //   3: lload #6
/*    */     //   5: lxor
/*    */     //   6: lstore #6
/*    */     //   8: lload_2
/*    */     //   9: lload #4
/*    */     //   11: lor
/*    */     //   12: lconst_0
/*    */     //   13: lcmp
/*    */     //   14: iflt -> 60
/*    */     //   17: lload_2
/*    */     //   18: lload_0
/*    */     //   19: lcmp
/*    */     //   20: ifgt -> 60
/*    */     //   23: goto -> 37
/*    */     //   26: ldc2_w 1560487422736100712
/*    */     //   29: lload #6
/*    */     //   31: <illegal opcode> w : (Ljava/lang/ArrayIndexOutOfBoundsException;JJ)Ljava/lang/ArrayIndexOutOfBoundsException;
/*    */     //   36: athrow
/*    */     //   37: lload_0
/*    */     //   38: lload_2
/*    */     //   39: lsub
/*    */     //   40: lload #4
/*    */     //   42: lcmp
/*    */     //   43: ifge -> 122
/*    */     //   46: goto -> 60
/*    */     //   49: ldc2_w 1560487422736100712
/*    */     //   52: lload #6
/*    */     //   54: <illegal opcode> w : (Ljava/lang/ArrayIndexOutOfBoundsException;JJ)Ljava/lang/ArrayIndexOutOfBoundsException;
/*    */     //   59: athrow
/*    */     //   60: new java/lang/ArrayIndexOutOfBoundsException
/*    */     //   63: dup
/*    */     //   64: sipush #13391
/*    */     //   67: ldc2_w 5574122454764993448
/*    */     //   70: lload #6
/*    */     //   72: lxor
/*    */     //   73: <illegal opcode> x : (IJ)Ljava/lang/String;
/*    */     //   78: iconst_3
/*    */     //   79: anewarray java/lang/Object
/*    */     //   82: dup
/*    */     //   83: iconst_0
/*    */     //   84: lload_0
/*    */     //   85: invokestatic valueOf : (J)Ljava/lang/Long;
/*    */     //   88: aastore
/*    */     //   89: dup
/*    */     //   90: iconst_1
/*    */     //   91: lload_2
/*    */     //   92: invokestatic valueOf : (J)Ljava/lang/Long;
/*    */     //   95: aastore
/*    */     //   96: dup
/*    */     //   97: iconst_2
/*    */     //   98: lload #4
/*    */     //   100: invokestatic valueOf : (J)Ljava/lang/Long;
/*    */     //   103: aastore
/*    */     //   104: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*    */     //   107: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   110: athrow
/*    */     //   111: ldc2_w 1560487422736100712
/*    */     //   114: lload #6
/*    */     //   116: <illegal opcode> w : (Ljava/lang/ArrayIndexOutOfBoundsException;JJ)Ljava/lang/ArrayIndexOutOfBoundsException;
/*    */     //   121: athrow
/*    */     //   122: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #9	-> 8
/*    */     //   #7	-> 60
/*    */     //   #5	-> 85
/*    */     //   #2	-> 122
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   8	23	26	java/lang/ArrayIndexOutOfBoundsException
/*    */     //   17	46	49	java/lang/ArrayIndexOutOfBoundsException
/*    */     //   37	111	111	java/lang/ArrayIndexOutOfBoundsException } static { byte b1; long l;
/* 10 */     for (b = nc.a(6600531568748907160L, 7798047021761373862L, MethodHandles.lookup().lookupClass()).a(210617852613699L), l = b ^ 0x5351EA28DA24L, e = new HashMap<>(13), "舻ౠ錏ꃒ⦣㽥诱祸ᅎ웞侦筒矪䓓냎룵ě੗뵒⧃".toCharArray()[3] = (char)("舻ౠ錏ꃒ⦣㽥诱祸ᅎ웞侦筒矪䓓냎룵ě੗뵒⧃".toCharArray()[3] ^ 0x20), "ꄑ咺陵ⁿ".toCharArray()[2] = (char)("ꄑ咺陵ⁿ".toCharArray()[2] ^ 0x3835), (new byte[8])[0] = (byte)(int)(l >>> 56L), b1 = 1; b1 < 8; ) { (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); b1++; }  Cipher cipher; (cipher = Cipher.getInstance(fW$gy.A("舻ౠ錏ꃒ⦣㽥诱祸ᅎ웞侦筒矪䓓냎룵ě੗뵒⧃".toCharArray(), (short)32741, true, 3))).init(2, SecretKeyFactory.getInstance(fW$gy.A("ꄑ咺陵ⁿ".toCharArray(), (short)32472, false, 1)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8])); String[] arrayOfString = new String[2]; boolean bool = false; "飾⻂鹫⡏驗弛鰅敩↧?犬똶쁽?ﬗƁ萵ຶ䉩풭㬦ầ땞䩲䇦芓뫴쓎볛ය㋨췡戮茕羂빣愷?ϸ說?ꇫ諺ﶴ풭싍ˏ앑蝥ꖪ擴牳想ᇚ샩顑ᨈ诇郕샒윓틽ކ".toCharArray()[28] = (char)("飾⻂鹫⡏驗弛鰅敩↧?犬똶쁽?ﬗƁ萵ຶ䉩풭㬦ầ땞䩲䇦芓뫴쓎볛ය㋨췡戮茕羂빣愷?ϸ說?ꇫ諺ﶴ풭싍ˏ앑蝥ꖪ擴牳想ᇚ샩顑ᨈ诇郕샒윓틽ކ".toCharArray()[28] ^ 0x53EC); String str; int i = (str = fW$gy.A("飾⻂鹫⡏驗弛鰅敩↧?犬똶쁽?ﬗƁ萵ຶ䉩풭㬦ầ땞䩲䇦芓뫴쓎볛ය㋨췡戮茕羂빣愷?ϸ說?ꇫ諺ﶴ풭싍ˏ앑蝥ꖪ擴牳想ᇚ샩顑ᨈ诇郕샒윓틽ކ".toCharArray(), (short)29694, true, 4)).length(); byte b2 = 16; byte b = -1;
/* 11 */     while (true); } public static long a(long paramLong) { return (paramLong & 0xFF00000000000000L) >>> 56L | (paramLong & 0xFF000000000000L) >>> 40L | (paramLong & 0xFF0000000000L) >>> 24L | (paramLong & 0xFF00000000L) >>> 8L | (paramLong & 0xFF000000L) << 8L | (paramLong & 0xFF0000L) << 24L | (paramLong & 0xFF00L) << 40L | (paramLong & 0xFFL) << 56L; }
/*    */    public static boolean a(byte[] paramArrayOfbyte1, long paramLong, int paramInt1, byte[] paramArrayOfbyte2, int paramInt2, int paramInt3) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/cc.b : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: iconst_0
/*    */     //   7: istore #7
/*    */     //   9: iload #7
/*    */     //   11: iload #6
/*    */     //   13: if_icmpge -> 79
/*    */     //   16: lload_1
/*    */     //   17: lconst_0
/*    */     //   18: lcmp
/*    */     //   19: iflt -> 73
/*    */     //   22: aload_0
/*    */     //   23: iload #7
/*    */     //   25: iload_3
/*    */     //   26: iadd
/*    */     //   27: baload
/*    */     //   28: lload_1
/*    */     //   29: lconst_0
/*    */     //   30: lcmp
/*    */     //   31: iflt -> 80
/*    */     //   34: aload #4
/*    */     //   36: iload #7
/*    */     //   38: iload #5
/*    */     //   40: iadd
/*    */     //   41: baload
/*    */     //   42: if_icmpeq -> 70
/*    */     //   45: goto -> 58
/*    */     //   48: ldc2_w -4031297244693483326
/*    */     //   51: lload_1
/*    */     //   52: <illegal opcode> w : (Ljava/lang/ArrayIndexOutOfBoundsException;JJ)Ljava/lang/ArrayIndexOutOfBoundsException;
/*    */     //   57: athrow
/*    */     //   58: iconst_0
/*    */     //   59: ireturn
/*    */     //   60: ldc2_w -4031297244693483326
/*    */     //   63: lload_1
/*    */     //   64: <illegal opcode> w : (Ljava/lang/ArrayIndexOutOfBoundsException;JJ)Ljava/lang/ArrayIndexOutOfBoundsException;
/*    */     //   69: athrow
/*    */     //   70: iinc #7, 1
/*    */     //   73: lload_1
/*    */     //   74: lconst_0
/*    */     //   75: lcmp
/*    */     //   76: ifgt -> 9
/*    */     //   79: iconst_1
/*    */     //   80: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #12	-> 6
/*    */     //   #19	-> 16
/*    */     //   #14	-> 70
/*    */     //   #4	-> 79
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   9	45	48	java/lang/ArrayIndexOutOfBoundsException
/*    */     //   16	60	60	java/lang/ArrayIndexOutOfBoundsException
/*    */   } public static short a(short paramShort) {
/* 15 */     int i = paramShort & 0xFFFF;
/*    */ 
/*    */     
/* 18 */     int j = (i & 0xFF00) >>> 8 | (i & 0xFF) << 8;
/*    */     return (short)j;
/*    */   }
/*    */   
/*    */   public static void b(Throwable paramThrowable) {
/*    */     a(paramThrowable);
/*    */   }
/*    */   
/*    */   private static ArrayIndexOutOfBoundsException a(ArrayIndexOutOfBoundsException paramArrayIndexOutOfBoundsException) {
/*    */     return paramArrayIndexOutOfBoundsException;
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
/*    */     int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x1A86;
/*    */     if (d[i] == null) {
/*    */       Object[] arrayOfObject;
/*    */       try {
/*    */         Long long_ = Long.valueOf(Thread.currentThread().getId());
/*    */         arrayOfObject = (Object[])e.get(long_);
/*    */         if (arrayOfObject == null) {
/*    */           arrayOfObject = new Object[3];
/*    */           "ࡂᣐᇻ釤梃翳촗稕䮊螚쯞엞轹띞ﮉ﯈ﱼ耫﹏ᛤ".toCharArray()[11] = (char)("ࡂᣐᇻ釤梃翳촗稕䮊螚쯞엞轹띞ﮉ﯈ﱼ耫﹏ᛤ".toCharArray()[11] ^ 0x6AEA);
/*    */           arrayOfObject[0] = Cipher.getInstance(fW$gy.A("ࡂᣐᇻ釤梃翳촗稕䮊螚쯞엞轹띞ﮉ﯈ﱼ耫﹏ᛤ".toCharArray(), (short)16647, false, 5));
/*    */           "㩫ቺ뀲废".toCharArray()[1] = (char)("㩫ቺ뀲废".toCharArray()[1] ^ 0x78A0);
/*    */           arrayOfObject[1] = SecretKeyFactory.getInstance(fW$gy.A("㩫ቺ뀲废".toCharArray(), (short)9299, true, 4));
/*    */           arrayOfObject[2] = new IvParameterSpec(new byte[8]);
/*    */           e.put(long_, arrayOfObject);
/*    */         } 
/*    */       } catch (Exception exception) {
/*    */         "?ᵿ醃嗓䱿⩌館・齏ꢵ蹷?㿏뗕䷛鋜῱ꓻɓ".toCharArray()[8] = (char)("?ᵿ醃嗓䱿⩌館・齏ꢵ蹷?㿏뗕䷛鋜῱ꓻɓ".toCharArray()[8] ^ 0x3825);
/*    */         throw new RuntimeException(fW$gy.A("?ᵿ醃嗓䱿⩌館・齏ꢵ蹷?㿏뗕䷛鋜῱ꓻɓ".toCharArray(), (short)15411, false, 2), exception);
/*    */       } 
/*    */       byte[] arrayOfByte1 = new byte[8];
/*    */       arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
/*    */       for (byte b = 1; b < 8; b++)
/*    */         arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
/*    */       DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
/*    */       SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
/*    */       ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
/*    */       "氩끤馺塀뗰簌蠤⛦".toCharArray()[9] = (char)("氩끤馺塀뗰簌蠤⛦".toCharArray()[9] ^ 0x1B40);
/*    */       byte[] arrayOfByte2 = c[i].getBytes(fW$gy.A("氩끤馺塀뗰簌蠤⛦".toCharArray(), (short)1677, true, 3));
/*    */       d[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
/*    */     } 
/*    */     return d[i];
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
/*    */     //   65: ldc_w '냁镮㽫説噉ⱹ返芫项棆萴?핪넗雝嗙崋'
/*    */     //   68: invokevirtual toCharArray : ()[C
/*    */     //   71: dup
/*    */     //   72: dup
/*    */     //   73: bipush #15
/*    */     //   75: dup_x1
/*    */     //   76: caload
/*    */     //   77: sipush #19261
/*    */     //   80: ixor
/*    */     //   81: i2c
/*    */     //   82: castore
/*    */     //   83: sipush #4674
/*    */     //   86: iconst_0
/*    */     //   87: iconst_4
/*    */     //   88: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   91: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   94: ldc_w '⧵䡌הּ⛟'
/*    */     //   97: invokevirtual toCharArray : ()[C
/*    */     //   100: dup
/*    */     //   101: dup
/*    */     //   102: iconst_2
/*    */     //   103: dup_x1
/*    */     //   104: caload
/*    */     //   105: sipush #28179
/*    */     //   108: ixor
/*    */     //   109: i2c
/*    */     //   110: castore
/*    */     //   111: sipush #30619
/*    */     //   114: iconst_0
/*    */     //   115: iconst_0
/*    */     //   116: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
/*    */     //   119: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   122: aload_1
/*    */     //   123: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   126: ldc_w '汓蔤뛊㯝'
/*    */     //   129: invokevirtual toCharArray : ()[C
/*    */     //   132: dup
/*    */     //   133: dup
/*    */     //   134: iconst_2
/*    */     //   135: dup_x1
/*    */     //   136: caload
/*    */     //   137: sipush #28285
/*    */     //   140: ixor
/*    */     //   141: i2c
/*    */     //   142: castore
/*    */     //   143: sipush #3109
/*    */     //   146: iconst_1
/*    */     //   147: iconst_1
/*    */     //   148: invokestatic G : (Ljava/lang/Object;SZB)Ljava/lang/String;
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


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\cc.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */