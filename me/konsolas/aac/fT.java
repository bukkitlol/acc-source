package me.konsolas.aac;

import aacinternal.v;
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

public final class ft {
  private static final long a = nc.a(5404741622637851778L, -3274180007910625132L, MethodHandles.lookup().lookupClass()).a(11892613818517L);
  
  private static final String[] b;
  
  private static final String[] c;
  
  private static final Map d = new HashMap<>(13);
  
  public static boolean b(short paramShort1, short paramShort2, int paramInt, String paramString) {
    // Byte code:
    //   0: iload_0
    //   1: i2l
    //   2: bipush #48
    //   4: lshl
    //   5: iload_1
    //   6: i2l
    //   7: bipush #48
    //   9: lshl
    //   10: bipush #16
    //   12: lushr
    //   13: lor
    //   14: iload_2
    //   15: i2l
    //   16: bipush #32
    //   18: lshl
    //   19: bipush #32
    //   21: lushr
    //   22: lor
    //   23: getstatic me/konsolas/aac/ft.a : J
    //   26: lxor
    //   27: lstore #4
    //   29: ldc2_w -1263925468993382418
    //   32: lload #4
    //   34: <illegal opcode> w : (JJ)Z
    //   39: istore #6
    //   41: aload_3
    //   42: sipush #9977
    //   45: ldc2_w 1065529602305846052
    //   48: lload #4
    //   50: lxor
    //   51: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   56: invokevirtual equals : (Ljava/lang/Object;)Z
    //   59: iload #6
    //   61: ifeq -> 82
    //   64: ifne -> 85
    //   67: goto -> 81
    //   70: ldc2_w -1178545811155820875
    //   73: lload #4
    //   75: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   80: athrow
    //   81: iconst_1
    //   82: goto -> 86
    //   85: iconst_0
    //   86: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 41
    // Exception table:
    //   from	to	target	type
    //   41	67	70	aacinternal/v
  }
  
  public static boolean a(short paramShort, long paramLong, String paramString) {
    // Byte code:
    //   0: iload_0
    //   1: i2l
    //   2: bipush #48
    //   4: lshl
    //   5: lload_1
    //   6: bipush #16
    //   8: lshl
    //   9: bipush #16
    //   11: lushr
    //   12: lor
    //   13: getstatic me/konsolas/aac/ft.a : J
    //   16: lxor
    //   17: lstore #4
    //   19: aload_3
    //   20: sipush #20627
    //   23: ldc2_w 8472895613971900681
    //   26: lload #4
    //   28: lxor
    //   29: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   34: invokevirtual equals : (Ljava/lang/Object;)Z
    //   37: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #6	-> 19
  }
  
  public static boolean c(long paramLong, String paramString) {
    // Byte code:
    //   0: getstatic me/konsolas/aac/ft.a : J
    //   3: lload_0
    //   4: lxor
    //   5: lstore_0
    //   6: ldc2_w 2928667753402316683
    //   9: lload_0
    //   10: <illegal opcode> w : (JJ)Z
    //   15: istore_3
    //   16: aload_2
    //   17: sipush #26834
    //   20: ldc2_w 9145170885671510932
    //   23: lload_0
    //   24: lxor
    //   25: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   30: invokevirtual equals : (Ljava/lang/Object;)Z
    //   33: iload_3
    //   34: ifne -> 254
    //   37: ifne -> 253
    //   40: goto -> 53
    //   43: ldc2_w 2968679232199235619
    //   46: lload_0
    //   47: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   52: athrow
    //   53: aload_2
    //   54: sipush #27922
    //   57: ldc2_w 5437509210371745360
    //   60: lload_0
    //   61: lxor
    //   62: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   67: invokevirtual equals : (Ljava/lang/Object;)Z
    //   70: iload_3
    //   71: ifne -> 254
    //   74: goto -> 87
    //   77: ldc2_w 2968679232199235619
    //   80: lload_0
    //   81: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   86: athrow
    //   87: ifne -> 253
    //   90: goto -> 103
    //   93: ldc2_w 2968679232199235619
    //   96: lload_0
    //   97: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   102: athrow
    //   103: aload_2
    //   104: sipush #12537
    //   107: ldc2_w 252580458396433340
    //   110: lload_0
    //   111: lxor
    //   112: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   117: invokevirtual equals : (Ljava/lang/Object;)Z
    //   120: iload_3
    //   121: ifne -> 254
    //   124: goto -> 137
    //   127: ldc2_w 2968679232199235619
    //   130: lload_0
    //   131: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   136: athrow
    //   137: ifne -> 253
    //   140: goto -> 153
    //   143: ldc2_w 2968679232199235619
    //   146: lload_0
    //   147: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   152: athrow
    //   153: aload_2
    //   154: sipush #28848
    //   157: ldc2_w 4200715796941569023
    //   160: lload_0
    //   161: lxor
    //   162: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   167: invokevirtual equals : (Ljava/lang/Object;)Z
    //   170: iload_3
    //   171: ifne -> 254
    //   174: goto -> 187
    //   177: ldc2_w 2968679232199235619
    //   180: lload_0
    //   181: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   186: athrow
    //   187: ifne -> 253
    //   190: goto -> 203
    //   193: ldc2_w 2968679232199235619
    //   196: lload_0
    //   197: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   202: athrow
    //   203: aload_2
    //   204: sipush #5710
    //   207: ldc2_w 7581404829652819200
    //   210: lload_0
    //   211: lxor
    //   212: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   217: invokevirtual equals : (Ljava/lang/Object;)Z
    //   220: iload_3
    //   221: ifne -> 254
    //   224: goto -> 237
    //   227: ldc2_w 2968679232199235619
    //   230: lload_0
    //   231: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   236: athrow
    //   237: ifeq -> 257
    //   240: goto -> 253
    //   243: ldc2_w 2968679232199235619
    //   246: lload_0
    //   247: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   252: athrow
    //   253: iconst_1
    //   254: goto -> 258
    //   257: iconst_0
    //   258: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #7	-> 16
    //   #11	-> 67
    //   #9	-> 117
    //   #5	-> 167
    //   #10	-> 217
    //   #16	-> 258
    // Exception table:
    //   from	to	target	type
    //   16	40	43	aacinternal/v
    //   37	74	77	aacinternal/v
    //   53	90	93	aacinternal/v
    //   87	124	127	aacinternal/v
    //   103	140	143	aacinternal/v
    //   137	174	177	aacinternal/v
    //   153	190	193	aacinternal/v
    //   187	224	227	aacinternal/v
    //   203	240	243	aacinternal/v
  }
  
  public static boolean d(long paramLong, String paramString) {
    // Byte code:
    //   0: getstatic me/konsolas/aac/ft.a : J
    //   3: lload_0
    //   4: lxor
    //   5: lstore_0
    //   6: ldc2_w -3734060155342899786
    //   9: lload_0
    //   10: <illegal opcode> w : (JJ)Z
    //   15: istore_3
    //   16: aload_2
    //   17: sipush #24046
    //   20: ldc2_w 1725836489335845481
    //   23: lload_0
    //   24: lxor
    //   25: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   30: invokevirtual equals : (Ljava/lang/Object;)Z
    //   33: iload_3
    //   34: ifeq -> 254
    //   37: ifne -> 253
    //   40: goto -> 53
    //   43: ldc2_w -3603828867551953683
    //   46: lload_0
    //   47: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   52: athrow
    //   53: aload_2
    //   54: sipush #18934
    //   57: ldc2_w 5884098651007919730
    //   60: lload_0
    //   61: lxor
    //   62: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   67: invokevirtual equals : (Ljava/lang/Object;)Z
    //   70: iload_3
    //   71: ifeq -> 254
    //   74: goto -> 87
    //   77: ldc2_w -3603828867551953683
    //   80: lload_0
    //   81: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   86: athrow
    //   87: ifne -> 253
    //   90: goto -> 103
    //   93: ldc2_w -3603828867551953683
    //   96: lload_0
    //   97: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   102: athrow
    //   103: aload_2
    //   104: sipush #28756
    //   107: ldc2_w 7641134021796896722
    //   110: lload_0
    //   111: lxor
    //   112: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   117: invokevirtual equals : (Ljava/lang/Object;)Z
    //   120: iload_3
    //   121: ifeq -> 254
    //   124: goto -> 137
    //   127: ldc2_w -3603828867551953683
    //   130: lload_0
    //   131: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   136: athrow
    //   137: ifne -> 253
    //   140: goto -> 153
    //   143: ldc2_w -3603828867551953683
    //   146: lload_0
    //   147: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   152: athrow
    //   153: aload_2
    //   154: sipush #20264
    //   157: ldc2_w 5277483246079778981
    //   160: lload_0
    //   161: lxor
    //   162: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   167: invokevirtual equals : (Ljava/lang/Object;)Z
    //   170: iload_3
    //   171: ifeq -> 254
    //   174: goto -> 187
    //   177: ldc2_w -3603828867551953683
    //   180: lload_0
    //   181: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   186: athrow
    //   187: ifne -> 253
    //   190: goto -> 203
    //   193: ldc2_w -3603828867551953683
    //   196: lload_0
    //   197: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   202: athrow
    //   203: aload_2
    //   204: sipush #32753
    //   207: ldc2_w 3171942675539628152
    //   210: lload_0
    //   211: lxor
    //   212: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   217: invokevirtual equals : (Ljava/lang/Object;)Z
    //   220: iload_3
    //   221: ifeq -> 254
    //   224: goto -> 237
    //   227: ldc2_w -3603828867551953683
    //   230: lload_0
    //   231: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   236: athrow
    //   237: ifeq -> 257
    //   240: goto -> 253
    //   243: ldc2_w -3603828867551953683
    //   246: lload_0
    //   247: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   252: athrow
    //   253: iconst_1
    //   254: goto -> 258
    //   257: iconst_0
    //   258: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #12	-> 16
    //   #3	-> 67
    //   #13	-> 117
    //   #15	-> 167
    //   #17	-> 217
    //   #4	-> 258
    // Exception table:
    //   from	to	target	type
    //   16	40	43	aacinternal/v
    //   37	74	77	aacinternal/v
    //   53	90	93	aacinternal/v
    //   87	124	127	aacinternal/v
    //   103	140	143	aacinternal/v
    //   137	174	177	aacinternal/v
    //   153	190	193	aacinternal/v
    //   187	224	227	aacinternal/v
    //   203	240	243	aacinternal/v
  }
  
  public static boolean e(String paramString, short paramShort, int paramInt, char paramChar) {
    // Byte code:
    //   0: iload_1
    //   1: i2l
    //   2: bipush #48
    //   4: lshl
    //   5: iload_2
    //   6: i2l
    //   7: bipush #32
    //   9: lshl
    //   10: bipush #16
    //   12: lushr
    //   13: lor
    //   14: iload_3
    //   15: i2l
    //   16: bipush #48
    //   18: lshl
    //   19: bipush #48
    //   21: lushr
    //   22: lor
    //   23: getstatic me/konsolas/aac/ft.a : J
    //   26: lxor
    //   27: lstore #4
    //   29: ldc2_w -7498818011383402891
    //   32: lload #4
    //   34: <illegal opcode> w : (JJ)Z
    //   39: istore #6
    //   41: aload_0
    //   42: sipush #30089
    //   45: ldc2_w 6742735246288437696
    //   48: lload #4
    //   50: lxor
    //   51: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   56: invokevirtual equals : (Ljava/lang/Object;)Z
    //   59: iload #6
    //   61: ifeq -> 113
    //   64: ifne -> 139
    //   67: goto -> 81
    //   70: ldc2_w -7620218042182785234
    //   73: lload #4
    //   75: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   80: athrow
    //   81: aload_0
    //   82: sipush #15067
    //   85: ldc2_w 8673432757473873563
    //   88: lload #4
    //   90: lxor
    //   91: <illegal opcode> o : (IJ)Ljava/lang/String;
    //   96: invokevirtual equals : (Ljava/lang/Object;)Z
    //   99: goto -> 113
    //   102: ldc2_w -7620218042182785234
    //   105: lload #4
    //   107: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   112: athrow
    //   113: iload #6
    //   115: ifeq -> 136
    //   118: ifne -> 139
    //   121: goto -> 135
    //   124: ldc2_w -7620218042182785234
    //   127: lload #4
    //   129: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
    //   134: athrow
    //   135: iconst_1
    //   136: goto -> 140
    //   139: iconst_0
    //   140: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #14	-> 41
    // Exception table:
    //   from	to	target	type
    //   41	67	70	aacinternal/v
    //   64	99	102	aacinternal/v
    //   113	121	124	aacinternal/v
  }
  
  static {
    long l = a ^ 0x1F7D7A72F024L;
    "捦ᰳ⺶ዳ纏좺䧤醴奝甆䅮ࡊ깋궏鰳☨ə涬".toCharArray()[10] = (char)("捦ᰳ⺶ዳ纏좺䧤醴奝甆䅮ࡊ깋궏鰳☨ə涬".toCharArray()[10] ^ 0xF4D);
    "釒螁?敓".toCharArray()[0] = (char)("釒螁?敓".toCharArray()[0] ^ 0x1F24);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance(da$gx.U("捦ᰳ⺶ዳ纏좺䧤醴奝甆䅮ࡊ깋궏鰳☨ə涬".toCharArray(), (short)24837, false, true))).init(2, SecretKeyFactory.getInstance(da$gx.U("釒螁?敓".toCharArray(), (short)20948, true, false)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[14];
    boolean bool = false;
    "䌄⽋軌꠼ꩍⓑ锟풠៝䵰밲⵲芪卢ᶘ㷍ⴒ刾藜⍺숔썕?࠳䫮ꛀ⼱涁㝫⮜⃝ក䁿↯?湆꣏ꑴ嗖맯⮨젘売쏋惼ံሼ싣ェ涻?泬㆒礪肠鈴栮郴ۄᣌ?猕웈褠㚟쒛掙蛚峥钭봷뭭褏㯂綬翔੣鯎ꖔ➬柀㹟Ѥ?䄥䀷칃ꡈꂎ뛋귒輸䵔㭎퇌࿝쒄爫軙지绦漿⹏撁씪إ猻儽롦ꪱ䰉䘳亞턭卷뿤옂ﳯꋖ던ﭟ㏸翸䦝虗娒㺯蟾碪糼㿥䎳炌貋갲Ɫ煏萉邢ᘅ체逃┛敕౏ￕ纓찢鱒?젫꯫঱흏⸫콤順灔ᓯ쬍坳ḷ뉇봽硂뛳⍯쇐㊳綧﷍ট褣ꩧ㸪뎣ॳ?嶅㨝跡㩀㎱웢染懳㚼?퐅毩⵳㚰㍾垛ꘌ嵖猲챴㶵㹚࿤ꖭ甀".toCharArray()[71] = (char)("䌄⽋軌꠼ꩍⓑ锟풠៝䵰밲⵲芪卢ᶘ㷍ⴒ刾藜⍺숔썕?࠳䫮ꛀ⼱涁㝫⮜⃝ក䁿↯?湆꣏ꑴ嗖맯⮨젘売쏋惼ံሼ싣ェ涻?泬㆒礪肠鈴栮郴ۄᣌ?猕웈褠㚟쒛掙蛚峥钭봷뭭褏㯂綬翔੣鯎ꖔ➬柀㹟Ѥ?䄥䀷칃ꡈꂎ뛋귒輸䵔㭎퇌࿝쒄爫軙지绦漿⹏撁씪إ猻儽롦ꪱ䰉䘳亞턭卷뿤옂ﳯꋖ던ﭟ㏸翸䦝虗娒㺯蟾碪糼㿥䎳炌貋갲Ɫ煏萉邢ᘅ체逃┛敕౏ￕ纓찢鱒?젫꯫঱흏⸫콤順灔ᓯ쬍坳ḷ뉇봽硂뛳⍯쇐㊳綧﷍ট褣ꩧ㸪뎣ॳ?嶅㨝跡㩀㎱웢染懳㚼?퐅毩⵳㚰㍾垛ꘌ嵖猲챴㶵㹚࿤ꖭ甀".toCharArray()[71] ^ 0x61AD);
    String str;
    int i = (str = da$gx.U("䌄⽋軌꠼ꩍⓑ锟풠៝䵰밲⵲芪卢ᶘ㷍ⴒ刾藜⍺숔썕?࠳䫮ꛀ⼱涁㝫⮜⃝ក䁿↯?湆꣏ꑴ嗖맯⮨젘売쏋惼ံሼ싣ェ涻?泬㆒礪肠鈴栮郴ۄᣌ?猕웈褠㚟쒛掙蛚峥钭봷뭭褏㯂綬翔੣鯎ꖔ➬柀㹟Ѥ?䄥䀷칃ꡈꂎ뛋귒輸䵔㭎퇌࿝쒄爫軙지绦漿⹏撁씪إ猻儽롦ꪱ䰉䘳亞턭卷뿤옂ﳯꋖ던ﭟ㏸翸䦝虗娒㺯蟾碪糼㿥䎳炌貋갲Ɫ煏萉邢ᘅ체逃┛敕౏ￕ纓찢鱒?젫꯫঱흏⸫콤順灔ᓯ쬍坳ḷ뉇봽硂뛳⍯쇐㊳綧﷍ট褣ꩧ㸪뎣ॳ?嶅㨝跡㩀㎱웢染懳㚼?퐅毩⵳㚰㍾垛ꘌ嵖猲챴㶵㹚࿤ꖭ甀".toCharArray(), (short)22871, false, false)).length();
    byte b2 = 16;
    byte b = -1;
    while (true);
  }
  
  private static v a(v paramv) {
    return paramv;
  }
  
  private static String a(byte[] paramArrayOfbyte) {
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x229F;
    if (c[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])d.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          "圬稌撤ضᄚ簾꣍愐ᕚ팂笅ꤍ⋪ꄤ媂".toCharArray()[1] = (char)("圬稌撤ضᄚ簾꣍愐ᕚ팂笅ꤍ⋪ꄤ媂".toCharArray()[1] ^ 0x3DF4);
          arrayOfObject[0] = Cipher.getInstance(da$gx.U("圬稌撤ضᄚ簾꣍愐ᕚ팂笅ꤍ⋪ꄤ媂".toCharArray(), (short)22785, false, true));
          "㪉䧵巇挳".toCharArray()[1] = (char)("㪉䧵巇挳".toCharArray()[1] ^ 0x48CC);
          arrayOfObject[1] = SecretKeyFactory.getInstance(da$gx.U("㪉䧵巇挳".toCharArray(), (short)11247, false, false));
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          d.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        "羋?忌땷䮫犴?沷잴筓ꊝ㏚ࣧᛧ㪕㫬䢌䌦".toCharArray()[2] = (char)("羋?忌땷䮫犴?沷잴筓ꊝ㏚ࣧᛧ㪕㫬䢌䌦".toCharArray()[2] ^ 0x1588);
        throw new RuntimeException(da$gx.U("羋?忌땷䮫犴?沷잴筓ꊝ㏚ࣧᛧ㪕㫬䢌䌦".toCharArray(), (short)8399, false, false), exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      "Ꞩ롖北皺둍芙鉺ﰮ偛?஫".toCharArray()[0] = (char)("Ꞩ롖北皺둍芙鉺ﰮ偛?஫".toCharArray()[0] ^ 0x2BD9);
      byte[] arrayOfByte2 = b[i].getBytes(da$gx.U("Ꞩ롖北皺둍芙鉺ﰮ偛?஫".toCharArray(), (short)14317, false, false));
      c[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return c[i];
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
    //   13: ldc [Ljava/lang/Object;
    //   15: aload_2
    //   16: invokevirtual parameterCount : ()I
    //   19: invokevirtual asCollector : (Ljava/lang/Class;I)Ljava/lang/invoke/MethodHandle;
    //   22: iconst_0
    //   23: iconst_3
    //   24: anewarray java/lang/Object
    //   27: dup
    //   28: iconst_0
    //   29: aload_0
    //   30: aastore
    //   31: dup
    //   32: iconst_1
    //   33: aload_3
    //   34: aastore
    //   35: dup
    //   36: iconst_2
    //   37: aload_1
    //   38: aastore
    //   39: invokestatic insertArguments : (Ljava/lang/invoke/MethodHandle;I[Ljava/lang/Object;)Ljava/lang/invoke/MethodHandle;
    //   42: aload_2
    //   43: invokestatic explicitCastArguments : (Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/MethodHandle;
    //   46: invokevirtual setTarget : (Ljava/lang/invoke/MethodHandle;)V
    //   49: goto -> 170
    //   52: astore #4
    //   54: new java/lang/RuntimeException
    //   57: dup
    //   58: new java/lang/StringBuilder
    //   61: dup
    //   62: invokespecial <init> : ()V
    //   65: ldc_w '칂짙Ľ巻⫮㔘屉ⓖ篣鿤ö岏祠䟽఼᣷'
    //   68: invokevirtual toCharArray : ()[C
    //   71: dup
    //   72: dup
    //   73: bipush #7
    //   75: dup_x1
    //   76: caload
    //   77: sipush #30341
    //   80: ixor
    //   81: i2c
    //   82: castore
    //   83: sipush #7858
    //   86: iconst_1
    //   87: iconst_3
    //   88: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
    //   91: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: ldc_w 'ِ쐄鵡惽'
    //   97: invokevirtual toCharArray : ()[C
    //   100: dup
    //   101: dup
    //   102: iconst_1
    //   103: dup_x1
    //   104: caload
    //   105: sipush #11223
    //   108: ixor
    //   109: i2c
    //   110: castore
    //   111: sipush #31911
    //   114: iconst_0
    //   115: iconst_4
    //   116: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
    //   119: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   122: aload_1
    //   123: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   126: ldc_w '⫷▁އ⍫'
    //   129: invokevirtual toCharArray : ()[C
    //   132: dup
    //   133: dup
    //   134: iconst_0
    //   135: dup_x1
    //   136: caload
    //   137: sipush #18298
    //   140: ixor
    //   141: i2c
    //   142: castore
    //   143: sipush #16137
    //   146: iconst_0
    //   147: iconst_4
    //   148: invokestatic A : (Ljava/lang/Object;SZI)Ljava/lang/String;
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
    //   9	49	52	java/lang/Exception
  }
}


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ft.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */