package me.konsolas.aac;

import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

final class gv extends gS {
  private final long e;
  
  private long f;
  
  private boolean b;
  
  private boolean c;
  
  final ec d;
  
  private static final long g = nc.a(-803308478035225210L, 8234996344147192012L, MethodHandles.lookup().lookupClass()).a(151407958891806L);
  
  private static final String[] j;
  
  private static final String[] k;
  
  private static final Map l = new HashMap<>(13);
  
  @Nullable
  IOException a(@Nullable IOException paramIOException, long paramLong) {
    // Byte code:
    //   0: getstatic me/konsolas/aac/gv.g : J
    //   3: lload_2
    //   4: lxor
    //   5: lstore_2
    //   6: lload_2
    //   7: dup2
    //   8: ldc2_w 105316868704694
    //   11: lxor
    //   12: dup2
    //   13: bipush #48
    //   15: lushr
    //   16: l2i
    //   17: istore #4
    //   19: dup2
    //   20: bipush #16
    //   22: lshl
    //   23: bipush #32
    //   25: lushr
    //   26: l2i
    //   27: istore #5
    //   29: dup2
    //   30: bipush #48
    //   32: lshl
    //   33: bipush #48
    //   35: lushr
    //   36: l2i
    //   37: istore #6
    //   39: pop2
    //   40: pop2
    //   41: ldc2_w 2896561260784155666
    //   44: lload_2
    //   45: <illegal opcode> w : (JJ)I
    //   50: istore #7
    //   52: aload_0
    //   53: iload #7
    //   55: ifne -> 95
    //   58: getfield b : Z
    //   61: ifeq -> 89
    //   64: goto -> 77
    //   67: ldc2_w 2906424234294211397
    //   70: lload_2
    //   71: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   76: athrow
    //   77: aload_1
    //   78: areturn
    //   79: ldc2_w 2906424234294211397
    //   82: lload_2
    //   83: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   88: athrow
    //   89: aload_0
    //   90: iconst_1
    //   91: putfield b : Z
    //   94: aload_0
    //   95: getfield d : Lme/konsolas/aac/ec;
    //   98: aload_0
    //   99: getfield f : J
    //   102: iload #4
    //   104: i2s
    //   105: iload #5
    //   107: iconst_1
    //   108: iload #6
    //   110: iconst_0
    //   111: aload_1
    //   112: invokevirtual a : (JSIZIZLjava/io/IOException;)Ljava/io/IOException;
    //   115: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #11	-> 52
    //   #21	-> 89
    //   #12	-> 94
    // Exception table:
    //   from	to	target	type
    //   52	64	67	java/lang/IllegalStateException
    //   58	79	79	java/lang/IllegalStateException
  }
  
  gv(long paramLong1, ec paramec, hp paramhp, long paramLong2) {
    // Byte code:
    //   0: getstatic me/konsolas/aac/gv.g : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 50591024450479
    //   11: lxor
    //   12: lstore #7
    //   14: dup2
    //   15: ldc2_w 139973367033786
    //   18: lxor
    //   19: lstore #9
    //   21: pop2
    //   22: ldc2_w 1956975623555206920
    //   25: lload_1
    //   26: <illegal opcode> w : (JJ)I
    //   31: aload_0
    //   32: aload_3
    //   33: putfield d : Lme/konsolas/aac/ec;
    //   36: istore #11
    //   38: aload_0
    //   39: aload #4
    //   41: lload #7
    //   43: invokespecial <init> : (Lme/konsolas/aac/hp;J)V
    //   46: aload_0
    //   47: iload #11
    //   49: ifne -> 78
    //   52: lload #5
    //   54: putfield e : J
    //   57: lload #5
    //   59: lconst_0
    //   60: lcmp
    //   61: ifne -> 85
    //   64: aload_0
    //   65: goto -> 78
    //   68: ldc2_w 1967937357073629279
    //   71: lload_1
    //   72: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   77: athrow
    //   78: aconst_null
    //   79: lload #9
    //   81: invokevirtual a : (Ljava/io/IOException;J)Ljava/io/IOException;
    //   84: pop
    //   85: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #20	-> 31
    //   #23	-> 38
    //   #3	-> 46
    //   #30	-> 57
    //   #10	-> 64
    //   #15	-> 85
    // Exception table:
    //   from	to	target	type
    //   52	65	68	java/lang/IllegalStateException
  }
  
  public void close() {
    // Byte code:
    //   0: getstatic me/konsolas/aac/gv.g : J
    //   3: ldc2_w 82289552166682
    //   6: lxor
    //   7: lstore_1
    //   8: lload_1
    //   9: dup2
    //   10: ldc2_w 77307759863313
    //   13: lxor
    //   14: lstore_3
    //   15: pop2
    //   16: ldc2_w 5945785012675282595
    //   19: lload_1
    //   20: <illegal opcode> w : (JJ)I
    //   25: istore #5
    //   27: aload_0
    //   28: iload #5
    //   30: ifne -> 73
    //   33: getfield c : Z
    //   36: ifeq -> 63
    //   39: goto -> 52
    //   42: ldc2_w 5973107466598681076
    //   45: lload_1
    //   46: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   51: athrow
    //   52: return
    //   53: ldc2_w 5973107466598681076
    //   56: lload_1
    //   57: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   62: athrow
    //   63: aload_0
    //   64: iconst_1
    //   65: putfield c : Z
    //   68: aload_0
    //   69: invokespecial close : ()V
    //   72: aload_0
    //   73: aconst_null
    //   74: lload_3
    //   75: invokevirtual a : (Ljava/io/IOException;J)Ljava/io/IOException;
    //   78: pop
    //   79: goto -> 92
    //   82: astore #6
    //   84: aload_0
    //   85: aload #6
    //   87: lload_3
    //   88: invokevirtual a : (Ljava/io/IOException;J)Ljava/io/IOException;
    //   91: athrow
    //   92: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #24	-> 27
    //   #16	-> 63
    //   #1	-> 68
    //   #26	-> 72
    //   #7	-> 79
    //   #5	-> 82
    //   #31	-> 84
    //   #29	-> 92
    // Exception table:
    //   from	to	target	type
    //   27	39	42	java/io/IOException
    //   33	53	53	java/io/IOException
    //   68	79	82	java/io/IOException
  }
  
  public long a(long paramLong1, fw paramfw, long paramLong2) {
    // Byte code:
    //   0: lload_1
    //   1: dup2
    //   2: ldc2_w 0
    //   5: lxor
    //   6: lstore #6
    //   8: dup2
    //   9: ldc2_w 84176021716323
    //   12: lxor
    //   13: lstore #8
    //   15: pop2
    //   16: ldc2_w -8552019322204819301
    //   19: lload_1
    //   20: <illegal opcode> w : (JJ)I
    //   25: istore #10
    //   27: aload_0
    //   28: iload #10
    //   30: ifeq -> 87
    //   33: getfield c : Z
    //   36: ifeq -> 83
    //   39: goto -> 52
    //   42: ldc2_w -8532430849724460410
    //   45: lload_1
    //   46: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   51: athrow
    //   52: new java/lang/IllegalStateException
    //   55: dup
    //   56: sipush #11312
    //   59: ldc2_w 4327493351502027414
    //   62: lload_1
    //   63: lxor
    //   64: <illegal opcode> r : (IJ)Ljava/lang/String;
    //   69: invokespecial <init> : (Ljava/lang/String;)V
    //   72: athrow
    //   73: ldc2_w -8532430849724460410
    //   76: lload_1
    //   77: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   82: athrow
    //   83: aload_0
    //   84: invokevirtual a : ()Lme/konsolas/aac/hp;
    //   87: lload #6
    //   89: aload_3
    //   90: lload #4
    //   92: invokeinterface a : (JLme/konsolas/aac/fw;J)J
    //   97: lstore #11
    //   99: lload #11
    //   101: lload_1
    //   102: lconst_0
    //   103: lcmp
    //   104: ifle -> 151
    //   107: ldc2_w -1
    //   110: iload #10
    //   112: ifeq -> 150
    //   115: lcmp
    //   116: ifne -> 144
    //   119: goto -> 132
    //   122: ldc2_w -8532430849724460410
    //   125: lload_1
    //   126: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   131: athrow
    //   132: aload_0
    //   133: aconst_null
    //   134: lload #8
    //   136: invokevirtual a : (Ljava/io/IOException;J)Ljava/io/IOException;
    //   139: pop
    //   140: ldc2_w -1
    //   143: lreturn
    //   144: aload_0
    //   145: getfield f : J
    //   148: lload #11
    //   150: ladd
    //   151: lstore #13
    //   153: aload_0
    //   154: getfield e : J
    //   157: ldc2_w -1
    //   160: lcmp
    //   161: iload #10
    //   163: ifeq -> 332
    //   166: ifeq -> 301
    //   169: goto -> 182
    //   172: ldc2_w -8532430849724460410
    //   175: lload_1
    //   176: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   181: athrow
    //   182: lload #13
    //   184: aload_0
    //   185: getfield e : J
    //   188: lcmp
    //   189: lload_1
    //   190: lconst_0
    //   191: lcmp
    //   192: iflt -> 332
    //   195: iload #10
    //   197: ifeq -> 332
    //   200: goto -> 213
    //   203: ldc2_w -8532430849724460410
    //   206: lload_1
    //   207: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   212: athrow
    //   213: ifle -> 301
    //   216: goto -> 229
    //   219: ldc2_w -8532430849724460410
    //   222: lload_1
    //   223: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   228: athrow
    //   229: new java/net/ProtocolException
    //   232: dup
    //   233: new java/lang/StringBuilder
    //   236: dup
    //   237: invokespecial <init> : ()V
    //   240: sipush #12119
    //   243: ldc2_w 8600593079315044851
    //   246: lload_1
    //   247: lxor
    //   248: <illegal opcode> r : (IJ)Ljava/lang/String;
    //   253: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   256: aload_0
    //   257: getfield e : J
    //   260: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   263: sipush #9103
    //   266: ldc2_w 6428801661961999658
    //   269: lload_1
    //   270: lxor
    //   271: <illegal opcode> r : (IJ)Ljava/lang/String;
    //   276: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   279: lload #13
    //   281: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   284: invokevirtual toString : ()Ljava/lang/String;
    //   287: invokespecial <init> : (Ljava/lang/String;)V
    //   290: athrow
    //   291: ldc2_w -8532430849724460410
    //   294: lload_1
    //   295: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   300: athrow
    //   301: aload_0
    //   302: lload #13
    //   304: putfield f : J
    //   307: lload #13
    //   309: iload #10
    //   311: ifeq -> 358
    //   314: aload_0
    //   315: getfield e : J
    //   318: lcmp
    //   319: goto -> 332
    //   322: ldc2_w -8532430849724460410
    //   325: lload_1
    //   326: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   331: athrow
    //   332: ifne -> 356
    //   335: aload_0
    //   336: aconst_null
    //   337: lload #8
    //   339: invokevirtual a : (Ljava/io/IOException;J)Ljava/io/IOException;
    //   342: pop
    //   343: goto -> 356
    //   346: ldc2_w -8532430849724460410
    //   349: lload_1
    //   350: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   355: athrow
    //   356: lload #11
    //   358: lreturn
    //   359: astore #11
    //   361: aload_0
    //   362: aload #11
    //   364: lload #8
    //   366: invokevirtual a : (Ljava/io/IOException;J)Ljava/io/IOException;
    //   369: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #25	-> 27
    //   #22	-> 83
    //   #13	-> 99
    //   #4	-> 132
    //   #14	-> 140
    //   #17	-> 144
    //   #18	-> 153
    //   #27	-> 229
    //   #28	-> 301
    //   #8	-> 307
    //   #9	-> 335
    //   #2	-> 356
    //   #19	-> 359
    //   #6	-> 361
    // Exception table:
    //   from	to	target	type
    //   27	39	42	java/io/IOException
    //   33	73	73	java/io/IOException
    //   83	143	359	java/io/IOException
    //   99	119	122	java/io/IOException
    //   144	358	359	java/io/IOException
    //   153	169	172	java/io/IOException
    //   166	200	203	java/io/IOException
    //   182	216	219	java/io/IOException
    //   213	291	291	java/io/IOException
    //   301	319	322	java/io/IOException
    //   332	343	346	java/io/IOException
  }
  
  static {
    long l = g ^ 0x2CAD0A58F092L;
    "詯뎳ⷿ⩧霺浕슝읂햹햧툸ꨔﾎ餅ཎ㾍᧜ꏞྲྀ".toCharArray()[8] = (char)("詯뎳ⷿ⩧霺浕슝읂햹햧툸ꨔﾎ餅ཎ㾍᧜ꏞྲྀ".toCharArray()[8] ^ 0x4AD6);
    "퇐ῴ뛴㗕".toCharArray()[1] = (char)("퇐ῴ뛴㗕".toCharArray()[1] ^ 0x3E16);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance(a0$cc.G("詯뎳ⷿ⩧霺浕슝읂햹햧툸ꨔﾎ餅ཎ㾍᧜ꏞྲྀ".toCharArray(), (short)13233, true, (byte)4))).init(2, SecretKeyFactory.getInstance(a0$cc.G("퇐ῴ뛴㗕".toCharArray(), (short)10051, false, (byte)1)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[3];
    boolean bool = false;
    "ྉ眽裁丯?賃娯ݬ獈ﺷ헒걁鏬㲈밂䍀劈䵂櫚莣洪ꥦ衼똜醛න䏛顟ᕵ蘮뇵퐄꿊博?꽕鸢﬩ﳆ谟뫒ꄃॵ烧卖냘퀄Ꜽ왿呓읙ሹ쨌顁듷㱠䷢䲽훉㍧纶袹䬁얼돿㖥鏚栖熟호깬捉䂂葳ꭜ??煊ȓ힑᠋Ǳ".toCharArray()[71] = (char)("ྉ眽裁丯?賃娯ݬ獈ﺷ헒걁鏬㲈밂䍀劈䵂櫚莣洪ꥦ衼똜醛න䏛顟ᕵ蘮뇵퐄꿊博?꽕鸢﬩ﳆ谟뫒ꄃॵ烧卖냘퀄Ꜽ왿呓읙ሹ쨌顁듷㱠䷢䲽훉㍧纶袹䬁얼돿㖥鏚栖熟호깬捉䂂葳ꭜ??煊ȓ힑᠋Ǳ".toCharArray()[71] ^ 0x77CA);
    String str;
    int i = (str = a0$cc.G("ྉ眽裁丯?賃娯ݬ獈ﺷ헒걁鏬㲈밂䍀劈䵂櫚莣洪ꥦ衼똜醛න䏛顟ᕵ蘮뇵퐄꿊博?꽕鸢﬩ﳆ谟뫒ꄃॵ烧卖냘퀄Ꜽ왿呓읙ሹ쨌顁듷㱠䷢䲽훉㍧纶袹䬁얼돿㖥鏚栖熟호깬捉䂂葳ꭜ??煊ȓ힑᠋Ǳ".toCharArray(), (short)2153, true, (byte)0)).length();
    byte b2 = 32;
    byte b = -1;
    while (true);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String b(byte[] paramArrayOfbyte) {
    byte b1 = 0;
    int i;
    char[] arrayOfChar = new char[i = paramArrayOfbyte.length];
    for (byte b2 = 0; b2 < i; b2++) {
      int j;
      if ((j = 0xFF & paramArrayOfbyte[b2]) < 192) {
        arrayOfChar[b1++] = (char)j;
      } else if (j < 224) {
        char c = (char)((char)(j & 0x1F) << 6);
        j = paramArrayOfbyte[++b2];
        c = (char)(c | (char)(j & 0x3F));
        arrayOfChar[b1++] = c;
      } else if (b2 < i - 2) {
        char c = (char)((char)(j & 0xF) << 12);
        j = paramArrayOfbyte[++b2];
        c = (char)(c | (char)(j & 0x3F) << 6);
        j = paramArrayOfbyte[++b2];
        c = (char)(c | (char)(j & 0x3F));
        arrayOfChar[b1++] = c;
      } 
    } 
    return new String(arrayOfChar, 0, b1);
  }
  
  private static String a(int paramInt, long paramLong) {
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x3E6C;
    if (k[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])l.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          "媒멂䈛꾼䰧鄴ꉿ퓫裿浐뱇䮆킯붔磗폒揖勥彭꒓滲".toCharArray()[11] = (char)("媒멂䈛꾼䰧鄴ꉿ퓫裿浐뱇䮆킯붔磗폒揖勥彭꒓滲".toCharArray()[11] ^ 0x327C);
          arrayOfObject[0] = Cipher.getInstance(hY$g6.H("媒멂䈛꾼䰧鄴ꉿ퓫裿浐뱇䮆킯붔磗폒揖勥彭꒓滲".toCharArray(), (short)14499, (byte)3, (byte)5));
          "쨵㘢僤禅".toCharArray()[2] = (char)("쨵㘢僤禅".toCharArray()[2] ^ 0x62EC);
          arrayOfObject[1] = SecretKeyFactory.getInstance(hY$g6.H("쨵㘢僤禅".toCharArray(), (short)24659, (byte)1, (byte)3));
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          l.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        "戔˟ᶉ?꿰鑵쩙胢☀䩃䴓湄ಀ၇觔恫".toCharArray()[10] = (char)("戔˟ᶉ?꿰鑵쩙胢☀䩃䴓湄ಀ၇觔恫".toCharArray()[10] ^ 0x394B);
        throw new RuntimeException(hY$g6.H("戔˟ᶉ?꿰鑵쩙胢☀䩃䴓湄ಀ၇觔恫".toCharArray(), (short)2272, (byte)0, (byte)0), exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      "說僞帝᫐㮙壷풞ׁ".toCharArray()[3] = (char)("說僞帝᫐㮙壷풞ׁ".toCharArray()[3] ^ 0x2E06);
      byte[] arrayOfByte2 = j[i].getBytes(hY$g6.H("說僞帝᫐㮙壷풞ׁ".toCharArray(), (short)8811, (byte)3, (byte)4));
      k[i] = b(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return k[i];
  }
  
  private static Object a(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
    long l = ((Long)paramArrayOfObject[1]).longValue();
    String str = a(i, l);
    MethodHandle methodHandle = MethodHandles.constant(String.class, str);
    paramMutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[] { int.class, long.class }));
    return str;
  }
  
  private static CallSite a(MethodHandles.Lookup paramLookup, String paramString, MethodType paramMethodType) {
    // Byte code:
    //   0: new java/lang/invoke/MutableCallSite
    //   3: dup
    //   4: aload_2
    //   5: invokespecial <init> : (Ljava/lang/invoke/MethodType;)V
    //   8: astore_3
    //   9: aload_3
    //   10: ldc_w
    //   13: ldc_w [Ljava/lang/Object;
    //   16: aload_2
    //   17: invokevirtual parameterCount : ()I
    //   20: invokevirtual asCollector : (Ljava/lang/Class;I)Ljava/lang/invoke/MethodHandle;
    //   23: iconst_0
    //   24: iconst_3
    //   25: anewarray java/lang/Object
    //   28: dup
    //   29: iconst_0
    //   30: aload_0
    //   31: aastore
    //   32: dup
    //   33: iconst_1
    //   34: aload_3
    //   35: aastore
    //   36: dup
    //   37: iconst_2
    //   38: aload_1
    //   39: aastore
    //   40: invokestatic insertArguments : (Ljava/lang/invoke/MethodHandle;I[Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;
    //   43: aload_2
    //   44: invokestatic explicitCastArguments : (Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;
    //   47: invokevirtual setTarget : (Ljava/lang/invoke/MethodHandle;)V
    //   50: goto -> 170
    //   53: astore #4
    //   55: new java/lang/RuntimeException
    //   58: dup
    //   59: new java/lang/StringBuilder
    //   62: dup
    //   63: invokespecial <init> : ()V
    //   66: ldc_w '퓸芁俏扪ꙃ妡䧧㻢﹛ྻᒹኢ堽縌軗ค﫿偵'
    //   69: invokevirtual toCharArray : ()[C
    //   72: dup
    //   73: dup
    //   74: iconst_1
    //   75: dup_x1
    //   76: caload
    //   77: sipush #789
    //   80: ixor
    //   81: i2c
    //   82: castore
    //   83: sipush #32470
    //   86: iconst_1
    //   87: iconst_1
    //   88: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
    //   91: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: ldc_w '榟藟找䇰'
    //   97: invokevirtual toCharArray : ()[C
    //   100: dup
    //   101: dup
    //   102: iconst_2
    //   103: dup_x1
    //   104: caload
    //   105: sipush #3074
    //   108: ixor
    //   109: i2c
    //   110: castore
    //   111: sipush #12311
    //   114: iconst_0
    //   115: iconst_1
    //   116: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
    //   119: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   122: aload_1
    //   123: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   126: ldc_w '齠ྣ⍄䎗'
    //   129: invokevirtual toCharArray : ()[C
    //   132: dup
    //   133: dup
    //   134: iconst_1
    //   135: dup_x1
    //   136: caload
    //   137: sipush #17002
    //   140: ixor
    //   141: i2c
    //   142: castore
    //   143: sipush #14808
    //   146: iconst_0
    //   147: iconst_0
    //   148: invokestatic U : (Ljava/lang/Object;SZZ)Ljava/lang/String;
    //   151: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   154: aload_2
    //   155: invokevirtual toString : ()Ljava/lang/String;
    //   158: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   161: invokevirtual toString : ()Ljava/lang/String;
    //   164: aload #4
    //   166: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   169: athrow
    //   170: aload_3
    //   171: areturn
    // Exception table:
    //   from	to	target	type
    //   9	50	53	java/lang/Exception
  }
}


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\gv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */