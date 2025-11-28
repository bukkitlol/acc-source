/*    */ package me.konsolas.aac;
/*    */ 
/*    */ import java.lang.invoke.CallSite;
/*    */ import java.lang.invoke.MethodHandle;
/*    */ import java.lang.invoke.MethodHandles;
/*    */ import java.lang.invoke.MethodType;
/*    */ import java.lang.invoke.MutableCallSite;
/*    */ import java.lang.reflect.Method;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import javax.crypto.Cipher;
/*    */ import javax.crypto.SecretKey;
/*    */ import javax.crypto.SecretKeyFactory;
/*    */ import javax.crypto.spec.DESKeySpec;
/*    */ import javax.crypto.spec.IvParameterSpec;
/*    */ 
/*    */ final class dy {
/*    */   dy(Method paramMethod1, Method paramMethod2, Method paramMethod3) {
/* 19 */     this.c = paramMethod1;
/*    */     
/*    */     this.b = paramMethod2;
/*    */     
/* 23 */     this.a = paramMethod3;
/*    */   }
/*    */   
/*    */   private final Method c;
/*    */   private final Method b;
/*    */   private final Method a;
/*    */   private static final long d = nc.a(8390343735223404978L, -4346858532005385738L, MethodHandles.lookup().lookupClass()).a(174533079417442L);
/*    */   private static final String[] e;
/*    */   private static final String[] f;
/*    */   private static final Map g = new HashMap<>(13);
/*    */   
/*    */   Object a(long paramLong, String paramString) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/dy.d : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: ldc2_w -1356875994061997312
/*    */     //   9: lload_1
/*    */     //   10: <illegal opcode> w : (JJ)I
/*    */     //   15: istore #4
/*    */     //   17: aload_0
/*    */     //   18: getfield c : Ljava/lang/reflect/Method;
/*    */     //   21: iload #4
/*    */     //   23: ifeq -> 54
/*    */     //   26: ifnull -> 79
/*    */     //   29: goto -> 42
/*    */     //   32: ldc2_w -1363991453344072508
/*    */     //   35: lload_1
/*    */     //   36: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   41: athrow
/*    */     //   42: aload_0
/*    */     //   43: getfield c : Ljava/lang/reflect/Method;
/*    */     //   46: aconst_null
/*    */     //   47: iconst_0
/*    */     //   48: anewarray java/lang/Object
/*    */     //   51: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   54: astore #5
/*    */     //   56: aload_0
/*    */     //   57: getfield b : Ljava/lang/reflect/Method;
/*    */     //   60: aload #5
/*    */     //   62: iconst_1
/*    */     //   63: anewarray java/lang/Object
/*    */     //   66: dup
/*    */     //   67: iconst_0
/*    */     //   68: aload_3
/*    */     //   69: aastore
/*    */     //   70: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   73: pop
/*    */     //   74: aload #5
/*    */     //   76: areturn
/*    */     //   77: astore #5
/*    */     //   79: aconst_null
/*    */     //   80: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #11	-> 17
/*    */     //   #26	-> 42
/*    */     //   #18	-> 56
/*    */     //   #17	-> 74
/*    */     //   #15	-> 77
/*    */     //   #20	-> 79
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   17	29	32	java/lang/Exception
/*    */     //   42	76	77	java/lang/Exception
/*    */   }
/*    */   
/*    */   boolean a(long paramLong, Object paramObject) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/dy.d : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: ldc2_w 5650410470472702017
/*    */     //   9: lload_1
/*    */     //   10: <illegal opcode> w : (JJ)I
/*    */     //   15: iconst_0
/*    */     //   16: istore #5
/*    */     //   18: istore #4
/*    */     //   20: aload_3
/*    */     //   21: iload #4
/*    */     //   23: ifeq -> 54
/*    */     //   26: ifnull -> 63
/*    */     //   29: goto -> 42
/*    */     //   32: ldc2_w 5643857943628636037
/*    */     //   35: lload_1
/*    */     //   36: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
/*    */     //   41: athrow
/*    */     //   42: aload_0
/*    */     //   43: getfield a : Ljava/lang/reflect/Method;
/*    */     //   46: aload_3
/*    */     //   47: iconst_0
/*    */     //   48: anewarray java/lang/Object
/*    */     //   51: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   54: pop
/*    */     //   55: iconst_1
/*    */     //   56: istore #5
/*    */     //   58: goto -> 63
/*    */     //   61: astore #6
/*    */     //   63: iload #5
/*    */     //   65: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #14	-> 15
/*    */     //   #24	-> 20
/*    */     //   #3	-> 42
/*    */     //   #4	-> 55
/*    */     //   #2	-> 58
/*    */     //   #7	-> 61
/*    */     //   #6	-> 63
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   20	29	32	java/lang/Exception
/*    */     //   42	58	61	java/lang/Exception
/*    */   }
/*    */   
/*    */   static dy a(long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/dy.d : J
/*    */     //   3: lload_0
/*    */     //   4: lxor
/*    */     //   5: lstore_0
/*    */     //   6: sipush #13483
/*    */     //   9: ldc2_w 7563677286119971389
/*    */     //   12: lload_0
/*    */     //   13: lxor
/*    */     //   14: <illegal opcode> w : (IJ)Ljava/lang/String;
/*    */     //   19: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
/*    */     //   22: astore #5
/*    */     //   24: aload #5
/*    */     //   26: sipush #9585
/*    */     //   29: ldc2_w 3915726948196027364
/*    */     //   32: lload_0
/*    */     //   33: lxor
/*    */     //   34: <illegal opcode> w : (IJ)Ljava/lang/String;
/*    */     //   39: iconst_0
/*    */     //   40: anewarray java/lang/Class
/*    */     //   43: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/*    */     //   46: astore_2
/*    */     //   47: aload #5
/*    */     //   49: sipush #794
/*    */     //   52: ldc2_w 5080480579698470285
/*    */     //   55: lload_0
/*    */     //   56: lxor
/*    */     //   57: <illegal opcode> w : (IJ)Ljava/lang/String;
/*    */     //   62: iconst_1
/*    */     //   63: anewarray java/lang/Class
/*    */     //   66: dup
/*    */     //   67: iconst_0
/*    */     //   68: ldc java/lang/String
/*    */     //   70: aastore
/*    */     //   71: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/*    */     //   74: astore_3
/*    */     //   75: aload #5
/*    */     //   77: sipush #6526
/*    */     //   80: ldc2_w 802304372248033258
/*    */     //   83: lload_0
/*    */     //   84: lxor
/*    */     //   85: <illegal opcode> w : (IJ)Ljava/lang/String;
/*    */     //   90: iconst_0
/*    */     //   91: anewarray java/lang/Class
/*    */     //   94: invokevirtual getMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/*    */     //   97: astore #4
/*    */     //   99: goto -> 111
/*    */     //   102: astore #5
/*    */     //   104: aconst_null
/*    */     //   105: astore_2
/*    */     //   106: aconst_null
/*    */     //   107: astore_3
/*    */     //   108: aconst_null
/*    */     //   109: astore #4
/*    */     //   111: new me/konsolas/aac/dy
/*    */     //   114: dup
/*    */     //   115: aload_2
/*    */     //   116: aload_3
/*    */     //   117: aload #4
/*    */     //   119: invokespecial <init> : (Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V
/*    */     //   122: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #28	-> 6
/*    */     //   #13	-> 24
/*    */     //   #16	-> 47
/*    */     //   #25	-> 75
/*    */     //   #10	-> 99
/*    */     //   #22	-> 102
/*    */     //   #8	-> 104
/*    */     //   #1	-> 106
/*    */     //   #9	-> 108
/*    */     //   #21	-> 111
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   6	99	102	java/lang/Exception
/*    */   }
/*    */   
/*    */   static {
/*    */     long l = d ^ 0x7591A5BE36A8L;
/*    */     "ﲥ멕탾啾⠊鸉䃼廯൤솽ȱ拼Ṏ㬤꟥?戇佭⅜".toCharArray()[18] = (char)("ﲥ멕탾啾⠊鸉䃼廯൤솽ȱ拼Ṏ㬤꟥?戇佭⅜".toCharArray()[18] ^ 0x2957);
/*    */     "则㻶ꇳ徬".toCharArray()[0] = (char)("则㻶ꇳ徬".toCharArray()[0] ^ 0x440B);
/*    */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*    */     for (byte b1 = 1; b1 < 8; b1++)
/*    */       (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
/*    */     Cipher cipher;
/*    */     (cipher = Cipher.getInstance(dP$dt.X("ﲥ멕탾啾⠊鸉䃼廯൤솽ȱ拼Ṏ㬤꟥?戇佭⅜".toCharArray(), (short)28664, false, true))).init(2, SecretKeyFactory.getInstance(dP$dt.X("则㻶ꇳ徬".toCharArray(), (short)19361, true, true)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*    */     String[] arrayOfString = new String[4];
/*    */     boolean bool = false;
/*    */     "悧믍壒ᆭ픿봤篓￿킢乲髢엾ꤷ徤ຑ賜瘘ⴹȧ甓汘煿ꔨ㪲⟏计舻扥ᩎ鷺傊푓䮠滨╉䞌အ䆔៽썓钦ಬɟ엋鼌指\"".toCharArray()[10] = (char)("悧믍壒ᆭ픿봤篓￿킢乲髢엾ꤷ徤ຑ賜瘘ⴹȧ甓汘煿ꔨ㪲⟏计舻扥ᩎ鷺傊푓䮠滨╉䞌အ䆔៽썓钦ಬɟ엋鼌指\"".toCharArray()[10] ^ 0x6C19);
/*    */     String str;
/*    */     int i = (str = dP$dt.X("悧믍壒ᆭ픿봤篓￿킢乲髢엾ꤷ徤ຑ賜瘘ⴹȧ甓汘煿ꔨ㪲⟏计舻扥ᩎ鷺傊푓䮠滨╉䞌အ䆔៽썓钦ಬɟ엋鼌指\"".toCharArray(), (short)15194, true, false)).length();
/*    */     byte b2 = 32;
/*    */     byte b = -1;
/*    */     while (true);
/*    */   }
/*    */   
/*    */   private static Exception a(Exception paramException) {
/*    */     return paramException;
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
/*    */     int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x781A;
/*    */     if (f[i] == null) {
/*    */       Object[] arrayOfObject;
/*    */       try {
/*    */         Long long_ = Long.valueOf(Thread.currentThread().getId());
/*    */         arrayOfObject = (Object[])g.get(long_);
/*    */         if (arrayOfObject == null) {
/*    */           arrayOfObject = new Object[3];
/*    */           "ᴳဌ켟ꂨ錾뻖논ﭐ悛οン箸濻ີ흫禤咴ㄋ牞".toCharArray()[1] = (char)("ᴳဌ켟ꂨ錾뻖논ﭐ悛οン箸濻ີ흫禤咴ㄋ牞".toCharArray()[1] ^ 0x1C69);
/*    */           arrayOfObject[0] = Cipher.getInstance(fW$gy.A("ᴳဌ켟ꂨ錾뻖논ﭐ悛οン箸濻ີ흫禤咴ㄋ牞".toCharArray(), (short)19188, true, 2));
/*    */           "?ꑑ跠ᅅ".toCharArray()[2] = (char)("?ꑑ跠ᅅ".toCharArray()[2] ^ 0x5DEB);
/*    */           arrayOfObject[1] = SecretKeyFactory.getInstance(fW$gy.A("?ꑑ跠ᅅ".toCharArray(), (short)25224, true, 3));
/*    */           arrayOfObject[2] = new IvParameterSpec(new byte[8]);
/*    */           g.put(long_, arrayOfObject);
/*    */         } 
/*    */       } catch (Exception exception) {
/*    */         "䛍邓牏릘쾬碍ℼ㺁쀮挖殘?鼿燑႐锦䴍".toCharArray()[6] = (char)("䛍邓牏릘쾬碍ℼ㺁쀮挖殘?鼿燑႐锦䴍".toCharArray()[6] ^ 0x37E3);
/*    */         throw new RuntimeException(fW$gy.A("䛍邓牏릘쾬碍ℼ㺁쀮挖殘?鼿燑႐锦䴍".toCharArray(), (short)29438, true, 3), exception);
/*    */       } 
/*    */       byte[] arrayOfByte1 = new byte[8];
/*    */       arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
/*    */       for (byte b = 1; b < 8; b++)
/*    */         arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
/*    */       DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
/*    */       SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
/*    */       ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
/*    */       "㉮䞣먚虶␾㘉पɂ\017ʸ⯗".toCharArray()[8] = (char)("㉮䞣먚虶␾㘉पɂ\017ʸ⯗".toCharArray()[8] ^ 0x52C8);
/*    */       byte[] arrayOfByte2 = e[i].getBytes(fW$gy.A("㉮䞣먚虶␾㘉पɂ\017ʸ⯗".toCharArray(), (short)3636, false, 0));
/*    */       f[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
/*    */     } 
/*    */     return f[i];
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
/*    */     //   65: ldc_w '篼珿㖵툒ᎍ뇽༥↭ṕ穱欔轜₁륛麚⻇出'
/*    */     //   68: invokevirtual toCharArray : ()[C
/*    */     //   71: dup
/*    */     //   72: dup
/*    */     //   73: bipush #9
/*    */     //   75: dup_x1
/*    */     //   76: caload
/*    */     //   77: sipush #22385
/*    */     //   80: ixor
/*    */     //   81: i2c
/*    */     //   82: castore
/*    */     //   83: sipush #11178
/*    */     //   86: iconst_0
/*    */     //   87: iconst_1
/*    */     //   88: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*    */     //   91: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   94: ldc_w '址櫧쁷ᖶ'
/*    */     //   97: invokevirtual toCharArray : ()[C
/*    */     //   100: dup
/*    */     //   101: dup
/*    */     //   102: iconst_2
/*    */     //   103: dup_x1
/*    */     //   104: caload
/*    */     //   105: sipush #10996
/*    */     //   108: ixor
/*    */     //   109: i2c
/*    */     //   110: castore
/*    */     //   111: sipush #823
/*    */     //   114: iconst_1
/*    */     //   115: iconst_1
/*    */     //   116: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
/*    */     //   119: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   122: aload_1
/*    */     //   123: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   126: ldc_w 'ỗ赚惏ඣ'
/*    */     //   129: invokevirtual toCharArray : ()[C
/*    */     //   132: dup
/*    */     //   133: dup
/*    */     //   134: iconst_1
/*    */     //   135: dup_x1
/*    */     //   136: caload
/*    */     //   137: sipush #23854
/*    */     //   140: ixor
/*    */     //   141: i2c
/*    */     //   142: castore
/*    */     //   143: sipush #10832
/*    */     //   146: iconst_0
/*    */     //   147: iconst_5
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
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\dy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */