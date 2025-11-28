/*   */ package me.konsolas.aac;
/*   */ import java.lang.invoke.MethodHandles;
/*   */ import javax.crypto.Cipher;
/*   */ import javax.crypto.spec.DESKeySpec;
/*   */ import javax.crypto.spec.IvParameterSpec;
/*   */ 
/*   */ public class mx extends m8 {
/*   */   public mx(String paramString, eA parameA, DoubleUnaryOperator paramDoubleUnaryOperator) {
/* 9 */     super(paramString);
/*   */     this.e = parameA;
/*   */     this.d = paramDoubleUnaryOperator;
/*   */   }
/*   */   
/*   */   private final eA e;
/*   */   
/*   */   private final DoubleUnaryOperator d;
/*   */   private static final String[] f;
/*   */   private static final String[] g;
/*   */   private static final Map h = new HashMap<>(13);
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
/*   */     //   50: goto -> 170
/*   */     //   53: astore #4
/*   */     //   55: new java/lang/RuntimeException
/*   */     //   58: dup
/*   */     //   59: new java/lang/StringBuilder
/*   */     //   62: dup
/*   */     //   63: invokespecial <init> : ()V
/*   */     //   66: ldc_w '⣆쓔?脓픲쵝⎚꯮ഭ퓞頛ﻧ撢쿾钙⧝'
/*   */     //   69: invokevirtual toCharArray : ()[C
/*   */     //   72: dup
/*   */     //   73: dup
/*   */     //   74: iconst_2
/*   */     //   75: dup_x1
/*   */     //   76: caload
/*   */     //   77: sipush #10825
/*   */     //   80: ixor
/*   */     //   81: i2c
/*   */     //   82: castore
/*   */     //   83: sipush #31505
/*   */     //   86: iconst_0
/*   */     //   87: iconst_1
/*   */     //   88: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*   */     //   91: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   94: ldc_w '곔餝அ'
/*   */     //   97: invokevirtual toCharArray : ()[C
/*   */     //   100: dup
/*   */     //   101: dup
/*   */     //   102: iconst_0
/*   */     //   103: dup_x1
/*   */     //   104: caload
/*   */     //   105: sipush #28929
/*   */     //   108: ixor
/*   */     //   109: i2c
/*   */     //   110: castore
/*   */     //   111: sipush #24023
/*   */     //   114: iconst_1
/*   */     //   115: iconst_1
/*   */     //   116: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*   */     //   119: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   122: aload_1
/*   */     //   123: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   126: ldc_w '蝧?龙℅'
/*   */     //   129: invokevirtual toCharArray : ()[C
/*   */     //   132: dup
/*   */     //   133: dup
/*   */     //   134: iconst_2
/*   */     //   135: dup_x1
/*   */     //   136: caload
/*   */     //   137: sipush #1175
/*   */     //   140: ixor
/*   */     //   141: i2c
/*   */     //   142: castore
/*   */     //   143: sipush #8934
/*   */     //   146: iconst_1
/*   */     //   147: iconst_0
/*   */     //   148: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
/*   */     //   151: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   154: aload_2
/*   */     //   155: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   158: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   161: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   164: aload #4
/*   */     //   166: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*   */     //   169: athrow
/*   */     //   170: aload_3
/*   */     //   171: areturn
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
/*   */     int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x61FE;
/*   */     if (g[i] == null) {
/*   */       Object[] arrayOfObject;
/*   */       try {
/*   */         Long long_ = Long.valueOf(Thread.currentThread().getId());
/*   */         arrayOfObject = (Object[])h.get(long_);
/*   */         if (arrayOfObject == null) {
/*   */           arrayOfObject = new Object[3];
/*   */           "羨⤚厶ᮀ沎Ꭷ픧춉쪥ﰅ輺⋓僻쇜坉밝ꣻḣ".toCharArray()[6] = (char)("羨⤚厶ᮀ沎Ꭷ픧춉쪥ﰅ輺⋓僻쇜坉밝ꣻḣ".toCharArray()[6] ^ 0x5FD9);
/*   */           arrayOfObject[0] = Cipher.getInstance(da$gx.U("羨⤚厶ᮀ沎Ꭷ픧춉쪥ﰅ輺⋓僻쇜坉밝ꣻḣ".toCharArray(), (short)1312, false, false));
/*   */           "껔ᔕ口".toCharArray()[1] = (char)("껔ᔕ口".toCharArray()[1] ^ 0x4BC1);
/*   */           arrayOfObject[1] = SecretKeyFactory.getInstance(da$gx.U("껔ᔕ口".toCharArray(), (short)6935, true, true));
/*   */           arrayOfObject[2] = new IvParameterSpec(new byte[8]);
/*   */           h.put(long_, arrayOfObject);
/*   */         } 
/*   */       } catch (Exception exception) {
/*   */         "紊㏧䰢軾짾喃˼ꬕ챤᳭滿︜砑긄⽻︂ⶐ".toCharArray()[2] = (char)("紊㏧䰢軾짾喃˼ꬕ챤᳭滿︜砑긄⽻︂ⶐ".toCharArray()[2] ^ 0x5426);
/*   */         throw new RuntimeException(da$gx.U("紊㏧䰢軾짾喃˼ꬕ챤᳭滿︜砑긄⽻︂ⶐ".toCharArray(), (short)10398, false, false), exception);
/*   */       } 
/*   */       byte[] arrayOfByte1 = new byte[8];
/*   */       arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
/*   */       for (byte b = 1; b < 8; b++)
/*   */         arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
/*   */       DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
/*   */       SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
/*   */       ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
/*   */       "펄鉞泧퀫Ξ潥歶䈚Ⲣ".toCharArray()[3] = (char)("펄鉞泧퀫Ξ潥歶䈚Ⲣ".toCharArray()[3] ^ 0x5FE6);
/*   */       byte[] arrayOfByte2 = f[i].getBytes(da$gx.U("펄鉞泧퀫Ξ潥歶䈚Ⲣ".toCharArray(), (short)18558, false, false));
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
/*   */   static {
/*   */     long l = nc.a(1205318855269549363L, -7644328518992792390L, MethodHandles.lookup().lookupClass()).a(187145104604062L) ^ 0x2CA8C14F0CCL;
/*   */     "䴏ꠊ郿彥킉퐾蕰拑ၲ➝♓缔⪠彞引㧉▔⧅".toCharArray()[3] = (char)("䴏ꠊ郿彥킉퐾蕰拑ၲ➝♓缔⪠彞引㧉▔⧅".toCharArray()[3] ^ 0x333D);
/*   */     "麅ע瑌㴹".toCharArray()[1] = (char)("麅ע瑌㴹".toCharArray()[1] ^ 0x6E6D);
/*   */     (new byte[8])[0] = (byte)(int)(l >>> 56L);
/*   */     for (byte b1 = 1; b1 < 8; b1++)
/*   */       (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
/*   */     Cipher cipher;
/*   */     (cipher = Cipher.getInstance(da$gx.U("䴏ꠊ郿彥킉퐾蕰拑ၲ➝♓缔⪠彞引㧉▔⧅".toCharArray(), (short)18469, true, true))).init(2, SecretKeyFactory.getInstance(da$gx.U("麅ע瑌㴹".toCharArray(), (short)6992, true, false)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
/*   */     String[] arrayOfString = new String[4];
/*   */     boolean bool = false;
/*   */     "䌸ꦞ鿬쾅⤀腃ᯚ￁론㔓ກ瀕諀鯕⩏腚ᤚᗜ쨯페ౡ䧹陻ኆ遷㕧ꄆ㩜泰Ꮭ똦圸ǿ␩".toCharArray()[6] = (char)("䌸ꦞ鿬쾅⤀腃ᯚ￁론㔓ກ瀕諀鯕⩏腚ᤚᗜ쨯페ౡ䧹陻ኆ遷㕧ꄆ㩜泰Ꮭ똦圸ǿ␩".toCharArray()[6] ^ 0x2B92);
/*   */     String str;
/*   */     int i = (str = da$gx.U("䌸ꦞ鿬쾅⤀腃ᯚ￁론㔓ກ瀕諀鯕⩏腚ᤚᗜ쨯페ౡ䧹陻ኆ遷㕧ꄆ㩜泰Ꮭ똦圸ǿ␩".toCharArray(), (short)10912, true, true)).length();
/*   */     byte b2 = 16;
/*   */     byte b = -1;
/*   */     while (true);
/*   */   }
/*   */   
/*   */   public Optional a(long paramLong, List paramList, lY paramlY, ef paramef, String paramString) {
/*   */     // Byte code:
/*   */     //   0: lload_1
/*   */     //   1: dup2
/*   */     //   2: ldc2_w 39108417017163
/*   */     //   5: lxor
/*   */     //   6: lstore #7
/*   */     //   8: dup2
/*   */     //   9: ldc2_w 70787500493984
/*   */     //   12: lxor
/*   */     //   13: lstore #9
/*   */     //   15: pop2
/*   */     //   16: new java/util/LinkedHashMap
/*   */     //   19: dup
/*   */     //   20: invokespecial <init> : ()V
/*   */     //   23: astore #11
/*   */     //   25: aload #4
/*   */     //   27: aload_0
/*   */     //   28: getfield e : Lme/konsolas/aac/eA;
/*   */     //   31: lload #9
/*   */     //   33: ldc2_w 344463551402315107
/*   */     //   36: lload_1
/*   */     //   37: <illegal opcode> b : (Lme/konsolas/aac/lY;Lme/konsolas/aac/eA;JJJ)I
/*   */     //   42: istore #12
/*   */     //   44: aload_0
/*   */     //   45: getfield d : Ljava/util/function/DoubleUnaryOperator;
/*   */     //   48: iload #12
/*   */     //   50: i2d
/*   */     //   51: ldc2_w 393918399441373073
/*   */     //   54: lload_1
/*   */     //   55: <illegal opcode> b : (Ljava/util/function/DoubleUnaryOperator;DJJ)D
/*   */     //   60: ldc2_w 1000.0
/*   */     //   63: ldc2_w 423779890258894990
/*   */     //   66: lload_1
/*   */     //   67: <illegal opcode> w : (DDJJ)D
/*   */     //   72: dstore #13
/*   */     //   74: aload #11
/*   */     //   76: bipush #74
/*   */     //   78: ldc2_w 7624111293120046543
/*   */     //   81: lload_1
/*   */     //   82: lxor
/*   */     //   83: <illegal opcode> g : (IJ)Ljava/lang/String;
/*   */     //   88: aload_0
/*   */     //   89: ldc2_w 328938820908178744
/*   */     //   92: lload_1
/*   */     //   93: <illegal opcode> b : (Lme/konsolas/aac/m8;JJ)Ljava/lang/String;
/*   */     //   98: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   103: pop
/*   */     //   104: aload #11
/*   */     //   106: sipush #3912
/*   */     //   109: ldc2_w 344444788288875212
/*   */     //   112: lload_1
/*   */     //   113: lxor
/*   */     //   114: <illegal opcode> g : (IJ)Ljava/lang/String;
/*   */     //   119: getstatic java/util/Locale.UK : Ljava/util/Locale;
/*   */     //   122: sipush #3250
/*   */     //   125: ldc2_w 7534750631181183285
/*   */     //   128: lload_1
/*   */     //   129: lxor
/*   */     //   130: <illegal opcode> g : (IJ)Ljava/lang/String;
/*   */     //   135: iconst_1
/*   */     //   136: anewarray java/lang/Object
/*   */     //   139: dup
/*   */     //   140: iconst_0
/*   */     //   141: dload #13
/*   */     //   143: ldc2_w 340189576066490091
/*   */     //   146: lload_1
/*   */     //   147: <illegal opcode> w : (DJJ)Ljava/lang/Double;
/*   */     //   152: aastore
/*   */     //   153: ldc2_w 394174069856740136
/*   */     //   156: lload_1
/*   */     //   157: <illegal opcode> w : (Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;JJ)Ljava/lang/String;
/*   */     //   162: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   167: pop
/*   */     //   168: aload #11
/*   */     //   170: sipush #14428
/*   */     //   173: ldc2_w 8706821999658786266
/*   */     //   176: lload_1
/*   */     //   177: lxor
/*   */     //   178: <illegal opcode> g : (IJ)Ljava/lang/String;
/*   */     //   183: iload #12
/*   */     //   185: ldc2_w 365847678624198656
/*   */     //   188: lload_1
/*   */     //   189: <illegal opcode> w : (IJJ)Ljava/lang/String;
/*   */     //   194: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   199: pop
/*   */     //   200: aload #6
/*   */     //   202: aload #11
/*   */     //   204: dload #13
/*   */     //   206: lload #7
/*   */     //   208: ldc2_w 339672891414467735
/*   */     //   211: lload_1
/*   */     //   212: <illegal opcode> w : (Ljava/lang/String;Ljava/util/Map;DJJJ)Lme/konsolas/aac/ah;
/*   */     //   217: ldc2_w 369840208558991866
/*   */     //   220: lload_1
/*   */     //   221: <illegal opcode> w : (Ljava/lang/Object;JJ)Ljava/util/Optional;
/*   */     //   226: areturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 16
/*   */     //   #6	-> 25
/*   */     //   #11	-> 44
/*   */     //   #7	-> 74
/*   */     //   #8	-> 104
/*   */     //   #10	-> 168
/*   */     //   #5	-> 200
/*   */   }
/*   */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\mx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */