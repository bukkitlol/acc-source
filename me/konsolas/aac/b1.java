package me.konsolas.aac;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class b1 {
  static final String l;
  
  static final int t = 128;
  
  static final int e = 64;
  
  static final int p = 32;
  
  static final int n = 16;
  
  static final int v = 15;
  
  static final int r = 8;
  
  static final int m = 128;
  
  static final int a = 127;
  
  static final int k = 0;
  
  static final int i = 1;
  
  static final int d = 2;
  
  static final int h = 8;
  
  static final int s = 9;
  
  static final int f = 10;
  
  static final long u = 125L;
  
  static final long c = 123L;
  
  static final int g = 126;
  
  static final long q = 65535L;
  
  static final int j = 127;
  
  static final int o = 1001;
  
  static final int b = 1005;
  
  private static final long w = nc.a(-180349665659695730L, -1253109420412838242L, MethodHandles.lookup().lookupClass()).a(203359534365930L);
  
  private static final String[] x;
  
  private static final String[] y;
  
  private static final Map z = new HashMap<>(13);
  
  public static String a(String paramString, long paramLong) {
    // Byte code:
    //   0: getstatic me/konsolas/aac/b1.w : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 95801816553193
    //   11: lxor
    //   12: dup2
    //   13: bipush #32
    //   15: lushr
    //   16: l2i
    //   17: istore_3
    //   18: dup2
    //   19: bipush #32
    //   21: lshl
    //   22: bipush #48
    //   24: lushr
    //   25: l2i
    //   26: istore #4
    //   28: dup2
    //   29: bipush #48
    //   31: lshl
    //   32: bipush #48
    //   34: lushr
    //   35: l2i
    //   36: istore #5
    //   38: pop2
    //   39: dup2
    //   40: ldc2_w 94377420064949
    //   43: lxor
    //   44: lstore #6
    //   46: dup2
    //   47: ldc2_w 34577977986631
    //   50: lxor
    //   51: lstore #8
    //   53: pop2
    //   54: new java/lang/StringBuilder
    //   57: dup
    //   58: invokespecial <init> : ()V
    //   61: aload_0
    //   62: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   65: sipush #5344
    //   68: ldc2_w 1241998859457322818
    //   71: lload_1
    //   72: lxor
    //   73: <illegal opcode> v : (IJ)Ljava/lang/String;
    //   78: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: invokevirtual toString : ()Ljava/lang/String;
    //   84: lload #6
    //   86: invokestatic a : (Ljava/lang/String;J)Lme/konsolas/aac/gZ;
    //   89: iload_3
    //   90: iload #4
    //   92: iload #5
    //   94: invokevirtual a : (III)Lme/konsolas/aac/gZ;
    //   97: lload #8
    //   99: invokevirtual b : (J)Ljava/lang/String;
    //   102: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #5	-> 54
  }
  
  static String a(long paramLong, int paramInt) {
    // Byte code:
    //   0: getstatic me/konsolas/aac/b1.w : J
    //   3: lload_0
    //   4: lxor
    //   5: lstore_0
    //   6: ldc2_w -8228270416528066137
    //   9: lload_0
    //   10: <illegal opcode> w : (JJ)[I
    //   15: astore_3
    //   16: iload_2
    //   17: sipush #1000
    //   20: aload_3
    //   21: ifnonnull -> 57
    //   24: if_icmplt -> 83
    //   27: goto -> 40
    //   30: ldc2_w -8221109463130326078
    //   33: lload_0
    //   34: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
    //   39: athrow
    //   40: iload_2
    //   41: sipush #5000
    //   44: goto -> 57
    //   47: ldc2_w -8221109463130326078
    //   50: lload_0
    //   51: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
    //   56: athrow
    //   57: aload_3
    //   58: lload_0
    //   59: lconst_0
    //   60: lcmp
    //   61: iflt -> 129
    //   64: ifnonnull -> 128
    //   67: if_icmplt -> 124
    //   70: goto -> 83
    //   73: ldc2_w -8221109463130326078
    //   76: lload_0
    //   77: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
    //   82: athrow
    //   83: new java/lang/StringBuilder
    //   86: dup
    //   87: invokespecial <init> : ()V
    //   90: sipush #12132
    //   93: ldc2_w 8322714651224954109
    //   96: lload_0
    //   97: lxor
    //   98: <illegal opcode> v : (IJ)Ljava/lang/String;
    //   103: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   106: iload_2
    //   107: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   110: invokevirtual toString : ()Ljava/lang/String;
    //   113: areturn
    //   114: ldc2_w -8221109463130326078
    //   117: lload_0
    //   118: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
    //   123: athrow
    //   124: iload_2
    //   125: sipush #1004
    //   128: aload_3
    //   129: ifnonnull -> 208
    //   132: if_icmplt -> 191
    //   135: goto -> 148
    //   138: ldc2_w -8221109463130326078
    //   141: lload_0
    //   142: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
    //   147: athrow
    //   148: iload_2
    //   149: sipush #1006
    //   152: aload_3
    //   153: lload_0
    //   154: lconst_0
    //   155: lcmp
    //   156: ifle -> 215
    //   159: ifnonnull -> 208
    //   162: goto -> 175
    //   165: ldc2_w -8221109463130326078
    //   168: lload_0
    //   169: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
    //   174: athrow
    //   175: if_icmple -> 254
    //   178: goto -> 191
    //   181: ldc2_w -8221109463130326078
    //   184: lload_0
    //   185: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
    //   190: athrow
    //   191: iload_2
    //   192: sipush #1012
    //   195: goto -> 208
    //   198: ldc2_w -8221109463130326078
    //   201: lload_0
    //   202: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
    //   207: athrow
    //   208: lload_0
    //   209: lconst_0
    //   210: lcmp
    //   211: iflt -> 251
    //   214: aload_3
    //   215: ifnonnull -> 251
    //   218: if_icmplt -> 311
    //   221: goto -> 234
    //   224: ldc2_w -8221109463130326078
    //   227: lload_0
    //   228: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
    //   233: athrow
    //   234: iload_2
    //   235: sipush #2999
    //   238: goto -> 251
    //   241: ldc2_w -8221109463130326078
    //   244: lload_0
    //   245: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
    //   250: athrow
    //   251: if_icmpgt -> 311
    //   254: new java/lang/StringBuilder
    //   257: dup
    //   258: invokespecial <init> : ()V
    //   261: sipush #9862
    //   264: ldc2_w 6690532793329179934
    //   267: lload_0
    //   268: lxor
    //   269: <illegal opcode> v : (IJ)Ljava/lang/String;
    //   274: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   277: iload_2
    //   278: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   281: sipush #5198
    //   284: ldc2_w 3779309319476506580
    //   287: lload_0
    //   288: lxor
    //   289: <illegal opcode> v : (IJ)Ljava/lang/String;
    //   294: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   297: invokevirtual toString : ()Ljava/lang/String;
    //   300: areturn
    //   301: ldc2_w -8221109463130326078
    //   304: lload_0
    //   305: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
    //   310: athrow
    //   311: aconst_null
    //   312: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #6	-> 16
    //   #11	-> 83
    //   #7	-> 124
    //   #4	-> 254
    //   #15	-> 311
    // Exception table:
    //   from	to	target	type
    //   16	27	30	java/lang/IllegalArgumentException
    //   24	44	47	java/lang/IllegalArgumentException
    //   57	70	73	java/lang/IllegalArgumentException
    //   67	114	114	java/lang/IllegalArgumentException
    //   128	135	138	java/lang/IllegalArgumentException
    //   132	162	165	java/lang/IllegalArgumentException
    //   148	178	181	java/lang/IllegalArgumentException
    //   175	195	198	java/lang/IllegalArgumentException
    //   208	221	224	java/lang/IllegalArgumentException
    //   218	238	241	java/lang/IllegalArgumentException
    //   251	301	301	java/lang/IllegalArgumentException
  }
  
  static void a(gG paramgG, long paramLong, byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: getstatic me/konsolas/aac/b1.w : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 132966201583946
    //   11: lxor
    //   12: lstore #4
    //   14: pop2
    //   15: ldc2_w -1757766947459804173
    //   18: lload_1
    //   19: <illegal opcode> w : (JJ)[I
    //   24: iconst_0
    //   25: istore #7
    //   27: astore #6
    //   29: aload_3
    //   30: arraylength
    //   31: istore #8
    //   33: aload_0
    //   34: getfield c : [B
    //   37: astore #9
    //   39: aload_0
    //   40: getfield b : I
    //   43: istore #10
    //   45: aload_0
    //   46: getfield f : I
    //   49: istore #11
    //   51: iload #10
    //   53: iload #11
    //   55: if_icmpge -> 103
    //   58: iload #7
    //   60: iload #8
    //   62: irem
    //   63: istore #7
    //   65: aload #9
    //   67: iload #10
    //   69: aload #9
    //   71: iload #10
    //   73: baload
    //   74: aload_3
    //   75: iload #7
    //   77: baload
    //   78: ixor
    //   79: i2b
    //   80: bastore
    //   81: iinc #10, 1
    //   84: iinc #7, 1
    //   87: aload #6
    //   89: ifnonnull -> 45
    //   92: aload #6
    //   94: lload_1
    //   95: lconst_0
    //   96: lcmp
    //   97: iflt -> 89
    //   100: ifnull -> 51
    //   103: aload_0
    //   104: lload #4
    //   106: invokevirtual a : (J)I
    //   109: iconst_m1
    //   110: if_icmpne -> 33
    //   113: aload #6
    //   115: lload_1
    //   116: lconst_0
    //   117: lcmp
    //   118: ifle -> 89
    //   121: ifnonnull -> 103
    //   124: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #8	-> 24
    //   #3	-> 29
    //   #17	-> 33
    //   #12	-> 39
    //   #16	-> 58
    //   #2	-> 65
    //   #19	-> 81
    //   #20	-> 103
    //   #13	-> 113
  }
  
  private b1(long paramLong) {
    // Byte code:
    //   0: getstatic me/konsolas/aac/b1.w : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: aload_0
    //   7: invokespecial <init> : ()V
    //   10: new java/lang/AssertionError
    //   13: dup
    //   14: sipush #13258
    //   17: ldc2_w 1344146317946202824
    //   20: lload_1
    //   21: lxor
    //   22: <illegal opcode> v : (IJ)Ljava/lang/String;
    //   27: invokespecial <init> : (Ljava/lang/Object;)V
    //   30: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #9	-> 6
    //   #1	-> 10
  }
  
  static void a(int paramInt, long paramLong) {
    // Byte code:
    //   0: getstatic me/konsolas/aac/b1.w : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 99762039280962
    //   11: lxor
    //   12: lstore_3
    //   13: pop2
    //   14: lload_3
    //   15: iload_0
    //   16: invokestatic a : (JI)Ljava/lang/String;
    //   19: astore #5
    //   21: aload #5
    //   23: ifnull -> 46
    //   26: new java/lang/IllegalArgumentException
    //   29: dup
    //   30: aload #5
    //   32: invokespecial <init> : (Ljava/lang/String;)V
    //   35: athrow
    //   36: ldc2_w 1578410375512400845
    //   39: lload_1
    //   40: <illegal opcode> w : (Ljava/lang/IllegalArgumentException;JJ)Ljava/lang/IllegalArgumentException;
    //   45: athrow
    //   46: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #14	-> 14
    //   #18	-> 21
    //   #10	-> 46
    // Exception table:
    //   from	to	target	type
    //   21	36	36	java/lang/IllegalArgumentException
  }
  
  static {
    long l = w ^ 0x3C2A86F8A10CL;
    "䁑钻莄ᢋ캈纭㺱ᝲ᧯?ᑙ峉챔챹ང糬攤誓쯝瞢".toCharArray()[7] = (char)("䁑钻莄ᢋ캈纭㺱ᝲ᧯?ᑙ峉챔챹ང糬攤誓쯝瞢".toCharArray()[7] ^ 0x32AA);
    "煚⳰᥉".toCharArray()[0] = (char)("煚⳰᥉".toCharArray()[0] ^ 0x6819);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b2 = 1; b2 < 8; b2++)
      (new byte[8])[b2] = (byte)(int)(l << b2 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance(a0$cc.G("䁑钻莄ᢋ캈纭㺱ᝲ᧯?ᑙ峉챔챹ང糬攤誓쯝瞢".toCharArray(), (short)11383, false, (byte)3))).init(2, SecretKeyFactory.getInstance(a0$cc.G("煚⳰᥉".toCharArray(), (short)24820, true, (byte)1)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[6];
    boolean bool = false;
    "☀韺凞驎哇艏췊⏫⇨ᇉ븇⛌쮡?彰臨뒌膩ﬡ쇯᯷܊?湳ර䷬걤ℤぁ婧ᔚ숀꼀ዡ??沕磗￮涇앣ꑭ섲ᩳ㴟칭ᛇ꺂⺟㤣뺽踁掋䅄赓ᡴᜋ㐌ﭣᜬ姒᧜䰲䠣?⑟꧐瘟녺譳?녑♒噚၃?ৈ웗⍏궽弾皮ퟒ鰾蜇谴뒹䌐ꙮ涫ɺꨐ⚯Ⰼ똎丰욳⌫?ၟ刽齮ᰣ笠Ċꤧ땕﯀䳊?⛗?玹玒쩰쭣ﲪԇ奴䬕喅?补솝툎㭸黤੡ｬ중裵쇉鈏և圬ꭳ㲽뀷募⭝햶栕蔍骇啉䊑㴂Ⅸ⠨㪒됆ူ㿝䨱灝꯬燩躼⍲ᠯﰆ䫲Mに".toCharArray()[102] = (char)("☀韺凞驎哇艏췊⏫⇨ᇉ븇⛌쮡?彰臨뒌膩ﬡ쇯᯷܊?湳ර䷬걤ℤぁ婧ᔚ숀꼀ዡ??沕磗￮涇앣ꑭ섲ᩳ㴟칭ᛇ꺂⺟㤣뺽踁掋䅄赓ᡴᜋ㐌ﭣᜬ姒᧜䰲䠣?⑟꧐瘟녺譳?녑♒噚၃?ৈ웗⍏궽弾皮ퟒ鰾蜇谴뒹䌐ꙮ涫ɺꨐ⚯Ⰼ똎丰욳⌫?ၟ刽齮ᰣ笠Ċꤧ땕﯀䳊?⛗?玹玒쩰쭣ﲪԇ奴䬕喅?补솝툎㭸黤੡ｬ중裵쇉鈏և圬ꭳ㲽뀷募⭝햶栕蔍骇啉䊑㴂Ⅸ⠨㪒됆ူ㿝䨱灝꯬燩躼⍲ᠯﰆ䫲Mに".toCharArray()[102] ^ 0x3DD1);
    String str;
    int i = (str = a0$cc.G("☀韺凞驎哇艏췊⏫⇨ᇉ븇⛌쮡?彰臨뒌膩ﬡ쇯᯷܊?湳ර䷬걤ℤぁ婧ᔚ숀꼀ዡ??沕磗￮涇앣ꑭ섲ᩳ㴟칭ᛇ꺂⺟㤣뺽踁掋䅄赓ᡴᜋ㐌ﭣᜬ姒᧜䰲䠣?⑟꧐瘟녺譳?녑♒噚၃?ৈ웗⍏궽弾皮ퟒ鰾蜇谴뒹䌐ꙮ涫ɺꨐ⚯Ⰼ똎丰욳⌫?ၟ刽齮ᰣ笠Ċꤧ땕﯀䳊?⛗?玹玒쩰쭣ﲪԇ奴䬕喅?补솝툎㭸黤੡ｬ중裵쇉鈏և圬ꭳ㲽뀷募⭝햶栕蔍骇啉䊑㴂Ⅸ⠨㪒됆ူ㿝䨱灝꯬燩躼⍲ᠯﰆ䫲Mに".toCharArray(), (short)21954, false, (byte)3)).length();
    byte b3 = 32;
    byte b = -1;
    while (true);
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  private static String a(byte[] paramArrayOfbyte) {
    byte b2 = 0;
    int i;
    char[] arrayOfChar = new char[i = paramArrayOfbyte.length];
    for (byte b3 = 0; b3 < i; b3++) {
      int j;
      if ((j = 0xFF & paramArrayOfbyte[b3]) < 192) {
        arrayOfChar[b2++] = (char)j;
      } else if (j < 224) {
        char c = (char)((char)(j & 0x1F) << 6);
        j = paramArrayOfbyte[++b3];
        c = (char)(c | (char)(j & 0x3F));
        arrayOfChar[b2++] = c;
      } else if (b3 < i - 2) {
        char c = (char)((char)(j & 0xF) << 12);
        j = paramArrayOfbyte[++b3];
        c = (char)(c | (char)(j & 0x3F) << 6);
        j = paramArrayOfbyte[++b3];
        c = (char)(c | (char)(j & 0x3F));
        arrayOfChar[b2++] = c;
      } 
    } 
    return new String(arrayOfChar, 0, b2);
  }
  
  private static String b(int paramInt, long paramLong) {
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x773C;
    if (y[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])z.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          "鬌裒疃맣≙༜慌ᖞ揚파݀锺㐢쑶眖䝛㣁ﴹⵊ".toCharArray()[9] = (char)("鬌裒疃맣≙༜慌ᖞ揚파݀锺㐢쑶眖䝛㣁ﴹⵊ".toCharArray()[9] ^ 0x24E5);
          arrayOfObject[0] = Cipher.getInstance(hY$g6.H("鬌裒疃맣≙༜慌ᖞ揚파݀锺㐢쑶眖䝛㣁ﴹⵊ".toCharArray(), (short)28075, (byte)3, (byte)0));
          "瘻龎䡭ƺ".toCharArray()[2] = (char)("瘻龎䡭ƺ".toCharArray()[2] ^ 0x22BB);
          arrayOfObject[1] = SecretKeyFactory.getInstance(hY$g6.H("瘻龎䡭ƺ".toCharArray(), (short)9843, (byte)2, (byte)4));
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          z.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        "?䓘႕⡵쾪I㽻庭盼췸Ҕ痁ꑾ덓뭢?뚃⻑".toCharArray()[10] = (char)("?䓘႕⡵쾪I㽻庭盼췸Ҕ痁ꑾ덓뭢?뚃⻑".toCharArray()[10] ^ 0x50BB);
        throw new RuntimeException(hY$g6.H("?䓘႕⡵쾪I㽻庭盼췸Ҕ痁ꑾ덓뭢?뚃⻑".toCharArray(), (short)4876, (byte)2, (byte)4), exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      "㗈䧄术詟鷟錇㘖⏌䥂࿊嘸".toCharArray()[8] = (char)("㗈䧄术詟鷟錇㘖⏌䥂࿊嘸".toCharArray()[8] ^ 0x43FB);
      byte[] arrayOfByte2 = x[i].getBytes(hY$g6.H("㗈䧄术詟鷟錇㘖⏌䥂࿊嘸".toCharArray(), (short)30891, (byte)4, (byte)0));
      y[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return y[i];
  }
  
  private static Object a(MethodHandles.Lookup paramLookup, MutableCallSite paramMutableCallSite, String paramString, Object[] paramArrayOfObject) {
    int i = ((Integer)paramArrayOfObject[0]).intValue();
    long l = ((Long)paramArrayOfObject[1]).longValue();
    String str = b(i, l);
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
    //   50: goto -> 171
    //   53: astore #4
    //   55: new java/lang/RuntimeException
    //   58: dup
    //   59: new java/lang/StringBuilder
    //   62: dup
    //   63: invokespecial <init> : ()V
    //   66: ldc_w '獝⹴Ἲᘝ䳳᫸谓㲘抛킖ꯔ?ꨘ࣪꺀㩖򍻫䀪'
    //   69: invokevirtual toCharArray : ()[C
    //   72: dup
    //   73: dup
    //   74: bipush #16
    //   76: dup_x1
    //   77: caload
    //   78: sipush #20629
    //   81: ixor
    //   82: i2c
    //   83: castore
    //   84: sipush #10703
    //   87: iconst_0
    //   88: iconst_1
    //   89: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
    //   92: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   95: ldc_w '䲾皣枋'
    //   98: invokevirtual toCharArray : ()[C
    //   101: dup
    //   102: dup
    //   103: iconst_1
    //   104: dup_x1
    //   105: caload
    //   106: sipush #24788
    //   109: ixor
    //   110: i2c
    //   111: castore
    //   112: sipush #21253
    //   115: iconst_1
    //   116: iconst_1
    //   117: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
    //   120: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   123: aload_1
    //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   127: ldc_w '遤嘮㽊玍'
    //   130: invokevirtual toCharArray : ()[C
    //   133: dup
    //   134: dup
    //   135: iconst_2
    //   136: dup_x1
    //   137: caload
    //   138: sipush #692
    //   141: ixor
    //   142: i2c
    //   143: castore
    //   144: sipush #6680
    //   147: iconst_1
    //   148: iconst_0
    //   149: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
    //   152: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: aload_2
    //   156: invokevirtual toString : ()Ljava/lang/String;
    //   159: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   162: invokevirtual toString : ()Ljava/lang/String;
    //   165: aload #4
    //   167: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   170: athrow
    //   171: aload_3
    //   172: areturn
    // Exception table:
    //   from	to	target	type
    //   9	50	53	java/lang/Exception
  }
}


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\b1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */