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

final class c_ {
  final boolean g;
  
  final bX b;
  
  final mQ k;
  
  boolean j;
  
  int l;
  
  long e;
  
  boolean d;
  
  boolean a;
  
  private final fw c;
  
  private final fw h;
  
  private final byte[] i;
  
  private final gG f;
  
  private static final long m = nc.a(-7063561452814741618L, 1508667524160995078L, MethodHandles.lookup().lookupClass()).a(119308018602200L);
  
  private static final String[] n;
  
  private static final String[] o;
  
  private static final Map p = new HashMap<>(13);
  
  private void a(int paramInt1, int paramInt2, short paramShort) {
    // Byte code:
    //   0: iload_1
    //   1: i2l
    //   2: bipush #32
    //   4: lshl
    //   5: iload_2
    //   6: i2l
    //   7: bipush #48
    //   9: lshl
    //   10: bipush #32
    //   12: lushr
    //   13: lor
    //   14: iload_3
    //   15: i2l
    //   16: bipush #48
    //   18: lshl
    //   19: bipush #48
    //   21: lushr
    //   22: lor
    //   23: getstatic me/konsolas/aac/c_.m : J
    //   26: lxor
    //   27: lstore #4
    //   29: lload #4
    //   31: dup2
    //   32: ldc2_w 15229058222701
    //   35: lxor
    //   36: lstore #6
    //   38: dup2
    //   39: ldc2_w 5813674134432
    //   42: lxor
    //   43: lstore #8
    //   45: dup2
    //   46: ldc2_w 139338628116148
    //   49: lxor
    //   50: lstore #10
    //   52: pop2
    //   53: ldc2_w 800563332582063988
    //   56: lload #4
    //   58: <illegal opcode> w : (JJ)[I
    //   63: aload_0
    //   64: getfield l : I
    //   67: istore #13
    //   69: astore #12
    //   71: iload #13
    //   73: iconst_1
    //   74: aload #12
    //   76: ifnonnull -> 225
    //   79: if_icmpeq -> 193
    //   82: goto -> 96
    //   85: ldc2_w 762608133702123088
    //   88: lload #4
    //   90: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   95: athrow
    //   96: iload #13
    //   98: iconst_2
    //   99: iload_2
    //   100: ifle -> 225
    //   103: aload #12
    //   105: ifnonnull -> 225
    //   108: goto -> 122
    //   111: ldc2_w 762608133702123088
    //   114: lload #4
    //   116: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   121: athrow
    //   122: if_icmpeq -> 193
    //   125: goto -> 139
    //   128: ldc2_w 762608133702123088
    //   131: lload #4
    //   133: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   138: athrow
    //   139: new java/net/ProtocolException
    //   142: dup
    //   143: new java/lang/StringBuilder
    //   146: dup
    //   147: invokespecial <init> : ()V
    //   150: sipush #6867
    //   153: ldc2_w 3052917570226413759
    //   156: lload #4
    //   158: lxor
    //   159: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   164: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   167: iload #13
    //   169: invokestatic toHexString : (I)Ljava/lang/String;
    //   172: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   175: invokevirtual toString : ()Ljava/lang/String;
    //   178: invokespecial <init> : (Ljava/lang/String;)V
    //   181: athrow
    //   182: ldc2_w 762608133702123088
    //   185: lload #4
    //   187: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   192: athrow
    //   193: iload_3
    //   194: ifle -> 208
    //   197: aload_0
    //   198: aload #12
    //   200: ifnonnull -> 280
    //   203: lload #8
    //   205: invokespecial d : (J)V
    //   208: iload #13
    //   210: iconst_1
    //   211: goto -> 225
    //   214: ldc2_w 762608133702123088
    //   217: lload #4
    //   219: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   224: athrow
    //   225: if_icmpne -> 265
    //   228: aload_0
    //   229: getfield k : Lme/konsolas/aac/mQ;
    //   232: aload_0
    //   233: getfield h : Lme/konsolas/aac/fw;
    //   236: lload #10
    //   238: invokevirtual c : (J)Ljava/lang/String;
    //   241: invokeinterface a : (Ljava/lang/String;)V
    //   246: aload #12
    //   248: ifnull -> 297
    //   251: goto -> 265
    //   254: ldc2_w 762608133702123088
    //   257: lload #4
    //   259: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   264: athrow
    //   265: aload_0
    //   266: goto -> 280
    //   269: ldc2_w 762608133702123088
    //   272: lload #4
    //   274: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   279: athrow
    //   280: getfield k : Lme/konsolas/aac/mQ;
    //   283: aload_0
    //   284: getfield h : Lme/konsolas/aac/fw;
    //   287: lload #6
    //   289: invokevirtual a : (J)Lme/konsolas/aac/gZ;
    //   292: invokeinterface c : (Lme/konsolas/aac/gZ;)V
    //   297: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #17	-> 63
    //   #2	-> 71
    //   #95	-> 139
    //   #84	-> 193
    //   #91	-> 208
    //   #76	-> 228
    //   #75	-> 265
    //   #12	-> 297
    // Exception table:
    //   from	to	target	type
    //   71	82	85	java/io/IOException
    //   79	108	111	java/io/IOException
    //   96	125	128	java/io/IOException
    //   122	182	182	java/io/IOException
    //   193	211	214	java/io/IOException
    //   225	251	254	java/io/IOException
    //   228	266	269	java/io/IOException
  }
  
  private void b(long paramLong) {
    // Byte code:
    //   0: getstatic me/konsolas/aac/c_.m : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 78871709725468
    //   11: lxor
    //   12: lstore_3
    //   13: dup2
    //   14: ldc2_w 22182096430948
    //   17: lxor
    //   18: dup2
    //   19: bipush #16
    //   21: lushr
    //   22: lstore #5
    //   24: dup2
    //   25: bipush #48
    //   27: lshl
    //   28: bipush #48
    //   30: lushr
    //   31: l2i
    //   32: istore #7
    //   34: pop2
    //   35: pop2
    //   36: ldc2_w -9037584436203735300
    //   39: lload_1
    //   40: <illegal opcode> w : (JJ)[I
    //   45: astore #8
    //   47: aload_0
    //   48: getfield j : Z
    //   51: ifne -> 135
    //   54: aload_0
    //   55: lload_3
    //   56: invokespecial e : (J)V
    //   59: lload_1
    //   60: lconst_0
    //   61: lcmp
    //   62: iflt -> 130
    //   65: aload_0
    //   66: aload #8
    //   68: ifnonnull -> 122
    //   71: getfield a : Z
    //   74: ifne -> 108
    //   77: goto -> 90
    //   80: ldc2_w -8998908095143282728
    //   83: lload_1
    //   84: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   89: athrow
    //   90: aload #8
    //   92: ifnull -> 135
    //   95: goto -> 108
    //   98: ldc2_w -8998908095143282728
    //   101: lload_1
    //   102: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   107: athrow
    //   108: aload_0
    //   109: goto -> 122
    //   112: ldc2_w -8998908095143282728
    //   115: lload_1
    //   116: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   121: athrow
    //   122: lload #5
    //   124: iload #7
    //   126: i2c
    //   127: invokespecial f : (JC)V
    //   130: aload #8
    //   132: ifnull -> 47
    //   135: lload_1
    //   136: lconst_0
    //   137: lcmp
    //   138: iflt -> 59
    //   141: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #21	-> 47
    //   #104	-> 54
    //   #79	-> 59
    //   #4	-> 90
    //   #94	-> 108
    //   #66	-> 135
    // Exception table:
    //   from	to	target	type
    //   54	77	80	java/io/IOException
    //   71	95	98	java/io/IOException
    //   90	109	112	java/io/IOException
  }
  
  c_(boolean paramBoolean, long paramLong, bX parambX, mQ parammQ) {
    // Byte code:
    //   0: getstatic me/konsolas/aac/c_.m : J
    //   3: lload_2
    //   4: lxor
    //   5: lstore_2
    //   6: ldc2_w 4995688376750502204
    //   9: lload_2
    //   10: <illegal opcode> w : (JJ)[I
    //   15: aload_0
    //   16: invokespecial <init> : ()V
    //   19: aload_0
    //   20: new me/konsolas/aac/fw
    //   23: dup
    //   24: invokespecial <init> : ()V
    //   27: putfield c : Lme/konsolas/aac/fw;
    //   30: astore #6
    //   32: aload_0
    //   33: new me/konsolas/aac/fw
    //   36: dup
    //   37: invokespecial <init> : ()V
    //   40: putfield h : Lme/konsolas/aac/fw;
    //   43: aload #4
    //   45: ifnonnull -> 79
    //   48: new java/lang/NullPointerException
    //   51: dup
    //   52: sipush #31816
    //   55: ldc2_w 4089962392577820783
    //   58: lload_2
    //   59: lxor
    //   60: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   65: invokespecial <init> : (Ljava/lang/String;)V
    //   68: athrow
    //   69: ldc2_w 4962184001006612504
    //   72: lload_2
    //   73: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   78: athrow
    //   79: lload_2
    //   80: lconst_0
    //   81: lcmp
    //   82: ifle -> 138
    //   85: aload #5
    //   87: ifnonnull -> 121
    //   90: new java/lang/NullPointerException
    //   93: dup
    //   94: sipush #29837
    //   97: ldc2_w 2214394180962893985
    //   100: lload_2
    //   101: lxor
    //   102: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   107: invokespecial <init> : (Ljava/lang/String;)V
    //   110: athrow
    //   111: ldc2_w 4962184001006612504
    //   114: lload_2
    //   115: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   120: athrow
    //   121: aload_0
    //   122: iload_1
    //   123: putfield g : Z
    //   126: aload_0
    //   127: aload #4
    //   129: putfield b : Lme/konsolas/aac/bX;
    //   132: aload_0
    //   133: aload #5
    //   135: putfield k : Lme/konsolas/aac/mQ;
    //   138: aload_0
    //   139: iload_1
    //   140: aload #6
    //   142: ifnonnull -> 176
    //   145: ifeq -> 175
    //   148: goto -> 161
    //   151: ldc2_w 4962184001006612504
    //   154: lload_2
    //   155: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   160: athrow
    //   161: aconst_null
    //   162: goto -> 178
    //   165: ldc2_w 4962184001006612504
    //   168: lload_2
    //   169: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   174: athrow
    //   175: iconst_4
    //   176: newarray byte
    //   178: putfield i : [B
    //   181: aload_0
    //   182: iload_1
    //   183: ifeq -> 200
    //   186: aconst_null
    //   187: goto -> 207
    //   190: ldc2_w 4962184001006612504
    //   193: lload_2
    //   194: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   199: athrow
    //   200: new me/konsolas/aac/gG
    //   203: dup
    //   204: invokespecial <init> : ()V
    //   207: putfield f : Lme/konsolas/aac/gG;
    //   210: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #54	-> 15
    //   #29	-> 19
    //   #45	-> 32
    //   #10	-> 43
    //   #28	-> 79
    //   #67	-> 121
    //   #56	-> 126
    //   #96	-> 132
    //   #90	-> 138
    //   #98	-> 181
    //   #30	-> 210
    // Exception table:
    //   from	to	target	type
    //   32	69	69	java/lang/NullPointerException
    //   79	111	111	java/lang/NullPointerException
    //   121	148	151	java/lang/NullPointerException
    //   145	165	165	java/lang/NullPointerException
    //   178	190	190	java/lang/NullPointerException
  }
  
  private void f(long paramLong, char paramChar) {
    // Byte code:
    //   0: lload_1
    //   1: bipush #16
    //   3: lshl
    //   4: iload_3
    //   5: i2l
    //   6: bipush #48
    //   8: lshl
    //   9: bipush #48
    //   11: lushr
    //   12: lor
    //   13: getstatic me/konsolas/aac/c_.m : J
    //   16: lxor
    //   17: lstore #4
    //   19: lload #4
    //   21: dup2
    //   22: ldc2_w 135943243491841
    //   25: lxor
    //   26: lstore #6
    //   28: dup2
    //   29: ldc2_w 47611458713354
    //   32: lxor
    //   33: lstore #8
    //   35: dup2
    //   36: ldc2_w 47669570339947
    //   39: lxor
    //   40: lstore #10
    //   42: dup2
    //   43: ldc2_w 8758965155094
    //   46: lxor
    //   47: lstore #12
    //   49: dup2
    //   50: ldc2_w 123232864377341
    //   53: lxor
    //   54: dup2
    //   55: bipush #48
    //   57: lushr
    //   58: l2i
    //   59: istore #14
    //   61: dup2
    //   62: bipush #16
    //   64: lshl
    //   65: bipush #48
    //   67: lushr
    //   68: l2i
    //   69: istore #15
    //   71: dup2
    //   72: bipush #32
    //   74: lshl
    //   75: bipush #32
    //   77: lushr
    //   78: l2i
    //   79: istore #16
    //   81: pop2
    //   82: dup2
    //   83: ldc2_w 83305488007590
    //   86: lxor
    //   87: lstore #17
    //   89: dup2
    //   90: ldc2_w 9621922729688
    //   93: lxor
    //   94: lstore #19
    //   96: dup2
    //   97: ldc2_w 48537060781042
    //   100: lxor
    //   101: lstore #21
    //   103: dup2
    //   104: ldc2_w 71340000881633
    //   107: lxor
    //   108: lstore #23
    //   110: dup2
    //   111: ldc2_w 49387720300920
    //   114: lxor
    //   115: dup2
    //   116: bipush #32
    //   118: lushr
    //   119: l2i
    //   120: istore #25
    //   122: dup2
    //   123: bipush #32
    //   125: lshl
    //   126: bipush #32
    //   128: lushr
    //   129: lstore #26
    //   131: pop2
    //   132: pop2
    //   133: ldc2_w -1481584883122413800
    //   136: lload #4
    //   138: <illegal opcode> w : (JJ)[I
    //   143: astore #28
    //   145: aload_0
    //   146: getfield e : J
    //   149: lconst_0
    //   150: lcmp
    //   151: aload #28
    //   153: ifnonnull -> 332
    //   156: ifle -> 303
    //   159: goto -> 173
    //   162: ldc2_w -1515141915169481156
    //   165: lload #4
    //   167: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   172: athrow
    //   173: aload_0
    //   174: getfield b : Lme/konsolas/aac/bX;
    //   177: aload_0
    //   178: getfield c : Lme/konsolas/aac/fw;
    //   181: lload #10
    //   183: dup2_x1
    //   184: pop2
    //   185: aload_0
    //   186: getfield e : J
    //   189: invokeinterface a : (JLme/konsolas/aac/fw;J)V
    //   194: aload_0
    //   195: getfield g : Z
    //   198: aload #28
    //   200: ifnonnull -> 332
    //   203: goto -> 217
    //   206: ldc2_w -1515141915169481156
    //   209: lload #4
    //   211: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   216: athrow
    //   217: ifne -> 303
    //   220: goto -> 234
    //   223: ldc2_w -1515141915169481156
    //   226: lload #4
    //   228: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   233: athrow
    //   234: aload_0
    //   235: getfield c : Lme/konsolas/aac/fw;
    //   238: aload_0
    //   239: getfield f : Lme/konsolas/aac/gG;
    //   242: lload #12
    //   244: dup2_x1
    //   245: pop2
    //   246: invokevirtual a : (JLme/konsolas/aac/gG;)Lme/konsolas/aac/gG;
    //   249: pop
    //   250: aload_0
    //   251: getfield f : Lme/konsolas/aac/gG;
    //   254: iload #14
    //   256: i2s
    //   257: lconst_0
    //   258: iload #15
    //   260: i2c
    //   261: iload #16
    //   263: invokevirtual a : (SJCI)I
    //   266: pop
    //   267: aload_0
    //   268: getfield f : Lme/konsolas/aac/gG;
    //   271: aload_0
    //   272: getfield i : [B
    //   275: lload #17
    //   277: dup2_x1
    //   278: pop2
    //   279: invokestatic a : (Lme/konsolas/aac/gG;J[B)V
    //   282: aload_0
    //   283: getfield f : Lme/konsolas/aac/gG;
    //   286: invokevirtual close : ()V
    //   289: goto -> 303
    //   292: ldc2_w -1515141915169481156
    //   295: lload #4
    //   297: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   302: athrow
    //   303: aload_0
    //   304: lload_1
    //   305: lconst_0
    //   306: lcmp
    //   307: iflt -> 361
    //   310: aload #28
    //   312: ifnonnull -> 361
    //   315: getfield l : I
    //   318: goto -> 332
    //   321: ldc2_w -1515141915169481156
    //   324: lload #4
    //   326: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   331: athrow
    //   332: tableswitch default -> 650, 8 -> 433, 9 -> 360, 10 -> 396
    //   360: aload_0
    //   361: getfield k : Lme/konsolas/aac/mQ;
    //   364: aload_0
    //   365: getfield c : Lme/konsolas/aac/fw;
    //   368: lload #6
    //   370: invokevirtual a : (J)Lme/konsolas/aac/gZ;
    //   373: iload #25
    //   375: swap
    //   376: lload #26
    //   378: dup2_x1
    //   379: pop2
    //   380: invokeinterface b : (IJLme/konsolas/aac/gZ;)V
    //   385: aload #28
    //   387: lload_1
    //   388: lconst_0
    //   389: lcmp
    //   390: ifle -> 416
    //   393: ifnull -> 706
    //   396: aload_0
    //   397: getfield k : Lme/konsolas/aac/mQ;
    //   400: aload_0
    //   401: getfield c : Lme/konsolas/aac/fw;
    //   404: lload #6
    //   406: invokevirtual a : (J)Lme/konsolas/aac/gZ;
    //   409: invokeinterface a : (Lme/konsolas/aac/gZ;)V
    //   414: aload #28
    //   416: ifnull -> 706
    //   419: goto -> 433
    //   422: ldc2_w -1515141915169481156
    //   425: lload #4
    //   427: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   432: athrow
    //   433: sipush #1005
    //   436: istore #29
    //   438: ldc_w ''
    //   441: astore #30
    //   443: aload_0
    //   444: getfield c : Lme/konsolas/aac/fw;
    //   447: invokevirtual f : ()J
    //   450: lstore #31
    //   452: lload #31
    //   454: lconst_1
    //   455: lcmp
    //   456: aload #28
    //   458: iload_3
    //   459: ifle -> 521
    //   462: ifnonnull -> 519
    //   465: ifne -> 515
    //   468: goto -> 482
    //   471: ldc2_w -1515141915169481156
    //   474: lload #4
    //   476: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   481: athrow
    //   482: new java/net/ProtocolException
    //   485: dup
    //   486: sipush #9938
    //   489: ldc2_w 2423174533652135123
    //   492: lload #4
    //   494: lxor
    //   495: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   500: invokespecial <init> : (Ljava/lang/String;)V
    //   503: athrow
    //   504: ldc2_w -1515141915169481156
    //   507: lload #4
    //   509: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   514: athrow
    //   515: lload #31
    //   517: lconst_0
    //   518: lcmp
    //   519: aload #28
    //   521: ifnonnull -> 565
    //   524: ifeq -> 625
    //   527: goto -> 541
    //   530: ldc2_w -1515141915169481156
    //   533: lload #4
    //   535: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   540: athrow
    //   541: aload_0
    //   542: getfield c : Lme/konsolas/aac/fw;
    //   545: lload #8
    //   547: invokevirtual b : (J)S
    //   550: istore #29
    //   552: aload_0
    //   553: getfield c : Lme/konsolas/aac/fw;
    //   556: lload #19
    //   558: invokevirtual c : (J)Ljava/lang/String;
    //   561: astore #30
    //   563: iload #29
    //   565: lload #21
    //   567: dup2_x1
    //   568: pop2
    //   569: invokestatic a : (JI)Ljava/lang/String;
    //   572: astore #33
    //   574: aload #28
    //   576: lload_1
    //   577: lconst_0
    //   578: lcmp
    //   579: ifle -> 647
    //   582: ifnonnull -> 645
    //   585: aload #33
    //   587: ifnull -> 625
    //   590: goto -> 604
    //   593: ldc2_w -1515141915169481156
    //   596: lload #4
    //   598: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   603: athrow
    //   604: new java/net/ProtocolException
    //   607: dup
    //   608: aload #33
    //   610: invokespecial <init> : (Ljava/lang/String;)V
    //   613: athrow
    //   614: ldc2_w -1515141915169481156
    //   617: lload #4
    //   619: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   624: athrow
    //   625: aload_0
    //   626: getfield k : Lme/konsolas/aac/mQ;
    //   629: iload #29
    //   631: aload #30
    //   633: lload #23
    //   635: invokeinterface a : (ILjava/lang/String;J)V
    //   640: aload_0
    //   641: iconst_1
    //   642: putfield j : Z
    //   645: aload #28
    //   647: ifnull -> 706
    //   650: new java/net/ProtocolException
    //   653: dup
    //   654: new java/lang/StringBuilder
    //   657: dup
    //   658: invokespecial <init> : ()V
    //   661: sipush #18737
    //   664: ldc2_w 4617873770111882035
    //   667: lload #4
    //   669: lxor
    //   670: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   675: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   678: aload_0
    //   679: getfield l : I
    //   682: invokestatic toHexString : (I)Ljava/lang/String;
    //   685: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   688: invokevirtual toString : ()Ljava/lang/String;
    //   691: invokespecial <init> : (Ljava/lang/String;)V
    //   694: athrow
    //   695: ldc2_w -1515141915169481156
    //   698: lload #4
    //   700: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   705: athrow
    //   706: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #57	-> 145
    //   #63	-> 173
    //   #27	-> 194
    //   #13	-> 234
    //   #39	-> 250
    //   #70	-> 267
    //   #37	-> 282
    //   #16	-> 303
    //   #25	-> 360
    //   #14	-> 385
    //   #34	-> 396
    //   #19	-> 414
    //   #18	-> 433
    //   #3	-> 438
    //   #44	-> 443
    //   #6	-> 452
    //   #61	-> 482
    //   #74	-> 515
    //   #59	-> 541
    //   #85	-> 552
    //   #53	-> 563
    //   #20	-> 574
    //   #101	-> 625
    //   #99	-> 640
    //   #83	-> 645
    //   #105	-> 650
    //   #86	-> 706
    // Exception table:
    //   from	to	target	type
    //   145	159	162	java/io/IOException
    //   156	203	206	java/io/IOException
    //   173	220	223	java/io/IOException
    //   217	289	292	java/io/IOException
    //   303	318	321	java/io/IOException
    //   361	419	422	java/io/IOException
    //   452	468	471	java/io/IOException
    //   465	504	504	java/io/IOException
    //   519	527	530	java/io/IOException
    //   574	590	593	java/io/IOException
    //   585	614	614	java/io/IOException
    //   645	695	695	java/io/IOException
  }
  
  private void e(long paramLong) {
    // Byte code:
    //   0: getstatic me/konsolas/aac/c_.m : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 132877762339698
    //   11: lxor
    //   12: lstore_3
    //   13: dup2
    //   14: ldc2_w 68357224052448
    //   17: lxor
    //   18: lstore #5
    //   20: dup2
    //   21: ldc2_w 123889476743007
    //   24: lxor
    //   25: lstore #7
    //   27: dup2
    //   28: ldc2_w 76159422522077
    //   31: lxor
    //   32: lstore #9
    //   34: dup2
    //   35: ldc2_w 11608398583032
    //   38: lxor
    //   39: lstore #11
    //   41: pop2
    //   42: ldc2_w 4541891156558056288
    //   45: lload_1
    //   46: <illegal opcode> w : (JJ)[I
    //   51: astore #13
    //   53: aload_0
    //   54: aload #13
    //   56: ifnonnull -> 110
    //   59: getfield j : Z
    //   62: ifeq -> 109
    //   65: goto -> 78
    //   68: ldc2_w 4504006325369522756
    //   71: lload_1
    //   72: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   77: athrow
    //   78: new java/io/IOException
    //   81: dup
    //   82: sipush #19310
    //   85: ldc2_w 1226605144468817183
    //   88: lload_1
    //   89: lxor
    //   90: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   95: invokespecial <init> : (Ljava/lang/String;)V
    //   98: athrow
    //   99: ldc2_w 4504006325369522756
    //   102: lload_1
    //   103: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   108: athrow
    //   109: aload_0
    //   110: getfield b : Lme/konsolas/aac/bX;
    //   113: invokeinterface a : ()Lme/konsolas/aac/li;
    //   118: invokevirtual b : ()J
    //   121: lstore #15
    //   123: aload_0
    //   124: getfield b : Lme/konsolas/aac/bX;
    //   127: invokeinterface a : ()Lme/konsolas/aac/li;
    //   132: invokevirtual a : ()Lme/konsolas/aac/li;
    //   135: pop
    //   136: aload_0
    //   137: getfield b : Lme/konsolas/aac/bX;
    //   140: lload #5
    //   142: invokeinterface a : (J)B
    //   147: sipush #255
    //   150: iand
    //   151: istore #14
    //   153: aload_0
    //   154: getfield b : Lme/konsolas/aac/bX;
    //   157: invokeinterface a : ()Lme/konsolas/aac/li;
    //   162: lload #15
    //   164: lload #7
    //   166: getstatic java/util/concurrent/TimeUnit.NANOSECONDS : Ljava/util/concurrent/TimeUnit;
    //   169: invokevirtual a : (JJLjava/util/concurrent/TimeUnit;)Lme/konsolas/aac/li;
    //   172: pop
    //   173: goto -> 201
    //   176: astore #17
    //   178: aload_0
    //   179: getfield b : Lme/konsolas/aac/bX;
    //   182: invokeinterface a : ()Lme/konsolas/aac/li;
    //   187: lload #15
    //   189: lload #7
    //   191: getstatic java/util/concurrent/TimeUnit.NANOSECONDS : Ljava/util/concurrent/TimeUnit;
    //   194: invokevirtual a : (JJLjava/util/concurrent/TimeUnit;)Lme/konsolas/aac/li;
    //   197: pop
    //   198: aload #17
    //   200: athrow
    //   201: aload_0
    //   202: iload #14
    //   204: bipush #15
    //   206: iand
    //   207: putfield l : I
    //   210: aload_0
    //   211: iload #14
    //   213: sipush #128
    //   216: iand
    //   217: aload #13
    //   219: ifnonnull -> 239
    //   222: ifeq -> 242
    //   225: goto -> 238
    //   228: ldc2_w 4504006325369522756
    //   231: lload_1
    //   232: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   237: athrow
    //   238: iconst_1
    //   239: goto -> 243
    //   242: iconst_0
    //   243: putfield d : Z
    //   246: aload_0
    //   247: iload #14
    //   249: bipush #8
    //   251: iand
    //   252: aload #13
    //   254: ifnonnull -> 274
    //   257: ifeq -> 277
    //   260: goto -> 273
    //   263: ldc2_w 4504006325369522756
    //   266: lload_1
    //   267: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   272: athrow
    //   273: iconst_1
    //   274: goto -> 278
    //   277: iconst_0
    //   278: putfield a : Z
    //   281: aload_0
    //   282: getfield a : Z
    //   285: aload #13
    //   287: ifnonnull -> 392
    //   290: ifeq -> 387
    //   293: goto -> 306
    //   296: ldc2_w 4504006325369522756
    //   299: lload_1
    //   300: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   305: athrow
    //   306: aload_0
    //   307: getfield d : Z
    //   310: aload #13
    //   312: lload_1
    //   313: lconst_0
    //   314: lcmp
    //   315: ifle -> 394
    //   318: ifnonnull -> 392
    //   321: goto -> 334
    //   324: ldc2_w 4504006325369522756
    //   327: lload_1
    //   328: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   333: athrow
    //   334: lload_1
    //   335: lconst_0
    //   336: lcmp
    //   337: ifle -> 389
    //   340: ifne -> 387
    //   343: goto -> 356
    //   346: ldc2_w 4504006325369522756
    //   349: lload_1
    //   350: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   355: athrow
    //   356: new java/net/ProtocolException
    //   359: dup
    //   360: sipush #14691
    //   363: ldc2_w 7557731756231128855
    //   366: lload_1
    //   367: lxor
    //   368: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   373: invokespecial <init> : (Ljava/lang/String;)V
    //   376: athrow
    //   377: ldc2_w 4504006325369522756
    //   380: lload_1
    //   381: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   386: athrow
    //   387: iload #14
    //   389: bipush #64
    //   391: iand
    //   392: aload #13
    //   394: ifnonnull -> 414
    //   397: ifeq -> 417
    //   400: goto -> 413
    //   403: ldc2_w 4504006325369522756
    //   406: lload_1
    //   407: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   412: athrow
    //   413: iconst_1
    //   414: goto -> 418
    //   417: iconst_0
    //   418: istore #17
    //   420: iload #14
    //   422: bipush #32
    //   424: iand
    //   425: aload #13
    //   427: ifnonnull -> 447
    //   430: ifeq -> 450
    //   433: goto -> 446
    //   436: ldc2_w 4504006325369522756
    //   439: lload_1
    //   440: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   445: athrow
    //   446: iconst_1
    //   447: goto -> 451
    //   450: iconst_0
    //   451: istore #18
    //   453: iload #14
    //   455: bipush #16
    //   457: iand
    //   458: aload #13
    //   460: ifnonnull -> 480
    //   463: ifeq -> 483
    //   466: goto -> 479
    //   469: ldc2_w 4504006325369522756
    //   472: lload_1
    //   473: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   478: athrow
    //   479: iconst_1
    //   480: goto -> 484
    //   483: iconst_0
    //   484: istore #19
    //   486: iload #17
    //   488: aload #13
    //   490: lload_1
    //   491: lconst_0
    //   492: lcmp
    //   493: ifle -> 519
    //   496: ifnonnull -> 517
    //   499: ifne -> 567
    //   502: goto -> 515
    //   505: ldc2_w 4504006325369522756
    //   508: lload_1
    //   509: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   514: athrow
    //   515: iload #18
    //   517: aload #13
    //   519: lload_1
    //   520: lconst_0
    //   521: lcmp
    //   522: ifle -> 548
    //   525: ifnonnull -> 546
    //   528: ifne -> 567
    //   531: goto -> 544
    //   534: ldc2_w 4504006325369522756
    //   537: lload_1
    //   538: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   543: athrow
    //   544: iload #19
    //   546: aload #13
    //   548: ifnonnull -> 613
    //   551: ifeq -> 598
    //   554: goto -> 567
    //   557: ldc2_w 4504006325369522756
    //   560: lload_1
    //   561: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   566: athrow
    //   567: new java/net/ProtocolException
    //   570: dup
    //   571: sipush #21646
    //   574: ldc2_w 8193494418906422008
    //   577: lload_1
    //   578: lxor
    //   579: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   584: invokespecial <init> : (Ljava/lang/String;)V
    //   587: athrow
    //   588: ldc2_w 4504006325369522756
    //   591: lload_1
    //   592: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   597: athrow
    //   598: aload_0
    //   599: getfield b : Lme/konsolas/aac/bX;
    //   602: lload #5
    //   604: invokeinterface a : (J)B
    //   609: sipush #255
    //   612: iand
    //   613: istore #20
    //   615: iload #20
    //   617: sipush #128
    //   620: iand
    //   621: aload #13
    //   623: ifnonnull -> 643
    //   626: ifeq -> 646
    //   629: goto -> 642
    //   632: ldc2_w 4504006325369522756
    //   635: lload_1
    //   636: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   641: athrow
    //   642: iconst_1
    //   643: goto -> 647
    //   646: iconst_0
    //   647: istore #21
    //   649: iload #21
    //   651: aload #13
    //   653: lload_1
    //   654: lconst_0
    //   655: lcmp
    //   656: iflt -> 769
    //   659: ifnonnull -> 767
    //   662: aload_0
    //   663: getfield g : Z
    //   666: if_icmpne -> 749
    //   669: goto -> 682
    //   672: ldc2_w 4504006325369522756
    //   675: lload_1
    //   676: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   681: athrow
    //   682: new java/net/ProtocolException
    //   685: dup
    //   686: aload_0
    //   687: getfield g : Z
    //   690: ifeq -> 732
    //   693: goto -> 706
    //   696: ldc2_w 4504006325369522756
    //   699: lload_1
    //   700: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   705: athrow
    //   706: sipush #7211
    //   709: ldc2_w 5956660013152948821
    //   712: lload_1
    //   713: lxor
    //   714: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   719: goto -> 745
    //   722: ldc2_w 4504006325369522756
    //   725: lload_1
    //   726: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   731: athrow
    //   732: sipush #29141
    //   735: ldc2_w 2191302496585170857
    //   738: lload_1
    //   739: lxor
    //   740: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   745: invokespecial <init> : (Ljava/lang/String;)V
    //   748: athrow
    //   749: aload_0
    //   750: iload #20
    //   752: bipush #127
    //   754: iand
    //   755: i2l
    //   756: putfield e : J
    //   759: aload_0
    //   760: getfield e : J
    //   763: ldc2_w 126
    //   766: lcmp
    //   767: aload #13
    //   769: lload_1
    //   770: lconst_0
    //   771: lcmp
    //   772: iflt -> 860
    //   775: ifnonnull -> 858
    //   778: ifne -> 837
    //   781: goto -> 794
    //   784: ldc2_w 4504006325369522756
    //   787: lload_1
    //   788: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   793: athrow
    //   794: aload_0
    //   795: lload_1
    //   796: lconst_0
    //   797: lcmp
    //   798: ifle -> 1011
    //   801: aload_0
    //   802: getfield b : Lme/konsolas/aac/bX;
    //   805: lload_3
    //   806: invokeinterface b : (J)S
    //   811: i2l
    //   812: ldc2_w 65535
    //   815: land
    //   816: putfield e : J
    //   819: aload #13
    //   821: ifnull -> 1010
    //   824: goto -> 837
    //   827: ldc2_w 4504006325369522756
    //   830: lload_1
    //   831: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   836: athrow
    //   837: aload_0
    //   838: getfield e : J
    //   841: ldc2_w 127
    //   844: lcmp
    //   845: goto -> 858
    //   848: ldc2_w 4504006325369522756
    //   851: lload_1
    //   852: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   857: athrow
    //   858: aload #13
    //   860: ifnonnull -> 1014
    //   863: ifne -> 1010
    //   866: goto -> 879
    //   869: ldc2_w 4504006325369522756
    //   872: lload_1
    //   873: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   878: athrow
    //   879: aload_0
    //   880: aload_0
    //   881: getfield b : Lme/konsolas/aac/bX;
    //   884: lload #9
    //   886: invokeinterface b : (J)J
    //   891: putfield e : J
    //   894: aload_0
    //   895: getfield e : J
    //   898: lconst_0
    //   899: lcmp
    //   900: aload #13
    //   902: lload_1
    //   903: lconst_0
    //   904: lcmp
    //   905: ifle -> 1016
    //   908: ifnonnull -> 1014
    //   911: goto -> 924
    //   914: ldc2_w 4504006325369522756
    //   917: lload_1
    //   918: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   923: athrow
    //   924: ifge -> 1010
    //   927: goto -> 940
    //   930: ldc2_w 4504006325369522756
    //   933: lload_1
    //   934: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   939: athrow
    //   940: new java/net/ProtocolException
    //   943: dup
    //   944: new java/lang/StringBuilder
    //   947: dup
    //   948: invokespecial <init> : ()V
    //   951: sipush #23487
    //   954: ldc2_w 4100044298867054028
    //   957: lload_1
    //   958: lxor
    //   959: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   964: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   967: aload_0
    //   968: getfield e : J
    //   971: invokestatic toHexString : (J)Ljava/lang/String;
    //   974: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   977: sipush #31625
    //   980: ldc2_w 5170754411509134846
    //   983: lload_1
    //   984: lxor
    //   985: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   990: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   993: invokevirtual toString : ()Ljava/lang/String;
    //   996: invokespecial <init> : (Ljava/lang/String;)V
    //   999: athrow
    //   1000: ldc2_w 4504006325369522756
    //   1003: lload_1
    //   1004: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   1009: athrow
    //   1010: aload_0
    //   1011: getfield a : Z
    //   1014: aload #13
    //   1016: ifnonnull -> 1116
    //   1019: ifeq -> 1114
    //   1022: goto -> 1035
    //   1025: ldc2_w 4504006325369522756
    //   1028: lload_1
    //   1029: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   1034: athrow
    //   1035: aload_0
    //   1036: getfield e : J
    //   1039: ldc2_w 125
    //   1042: lcmp
    //   1043: lload_1
    //   1044: lconst_0
    //   1045: lcmp
    //   1046: ifle -> 1116
    //   1049: aload #13
    //   1051: ifnonnull -> 1116
    //   1054: goto -> 1067
    //   1057: ldc2_w 4504006325369522756
    //   1060: lload_1
    //   1061: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   1066: athrow
    //   1067: ifle -> 1114
    //   1070: goto -> 1083
    //   1073: ldc2_w 4504006325369522756
    //   1076: lload_1
    //   1077: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   1082: athrow
    //   1083: new java/net/ProtocolException
    //   1086: dup
    //   1087: sipush #18234
    //   1090: ldc2_w 1254778522334169415
    //   1093: lload_1
    //   1094: lxor
    //   1095: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   1100: invokespecial <init> : (Ljava/lang/String;)V
    //   1103: athrow
    //   1104: ldc2_w 4504006325369522756
    //   1107: lload_1
    //   1108: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   1113: athrow
    //   1114: iload #21
    //   1116: ifeq -> 1149
    //   1119: aload_0
    //   1120: getfield b : Lme/konsolas/aac/bX;
    //   1123: aload_0
    //   1124: getfield i : [B
    //   1127: lload #11
    //   1129: dup2_x1
    //   1130: pop2
    //   1131: invokeinterface a : (J[B)V
    //   1136: goto -> 1149
    //   1139: ldc2_w 4504006325369522756
    //   1142: lload_1
    //   1143: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   1148: athrow
    //   1149: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #78	-> 53
    //   #77	-> 109
    //   #5	-> 123
    //   #22	-> 136
    //   #60	-> 153
    //   #40	-> 173
    //   #23	-> 176
    //   #87	-> 201
    //   #50	-> 210
    //   #106	-> 246
    //   #43	-> 281
    //   #15	-> 356
    //   #88	-> 387
    //   #42	-> 420
    //   #26	-> 453
    //   #97	-> 486
    //   #58	-> 567
    //   #51	-> 598
    //   #8	-> 615
    //   #81	-> 649
    //   #103	-> 682
    //   #102	-> 706
    //   #100	-> 732
    //   #80	-> 749
    //   #11	-> 759
    //   #69	-> 794
    //   #73	-> 837
    //   #33	-> 879
    //   #24	-> 894
    //   #72	-> 940
    //   #35	-> 971
    //   #64	-> 1010
    //   #49	-> 1083
    //   #7	-> 1114
    //   #65	-> 1119
    //   #52	-> 1149
    // Exception table:
    //   from	to	target	type
    //   53	65	68	java/io/IOException
    //   59	99	99	java/io/IOException
    //   136	153	176	finally
    //   176	178	176	finally
    //   201	225	228	java/io/IOException
    //   243	260	263	java/io/IOException
    //   278	293	296	java/io/IOException
    //   290	321	324	java/io/IOException
    //   306	343	346	java/io/IOException
    //   334	377	377	java/io/IOException
    //   392	400	403	java/io/IOException
    //   420	433	436	java/io/IOException
    //   453	466	469	java/io/IOException
    //   486	502	505	java/io/IOException
    //   517	531	534	java/io/IOException
    //   546	554	557	java/io/IOException
    //   551	588	588	java/io/IOException
    //   615	629	632	java/io/IOException
    //   649	669	672	java/io/IOException
    //   662	693	696	java/io/IOException
    //   682	722	722	java/io/IOException
    //   767	781	784	java/io/IOException
    //   778	824	827	java/io/IOException
    //   794	845	848	java/io/IOException
    //   858	866	869	java/io/IOException
    //   863	911	914	java/io/IOException
    //   879	927	930	java/io/IOException
    //   924	1000	1000	java/io/IOException
    //   1014	1022	1025	java/io/IOException
    //   1019	1054	1057	java/io/IOException
    //   1035	1070	1073	java/io/IOException
    //   1067	1104	1104	java/io/IOException
    //   1116	1136	1139	java/io/IOException
  }
  
  private void d(long paramLong) {
    // Byte code:
    //   0: getstatic me/konsolas/aac/c_.m : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 41245632152104
    //   11: lxor
    //   12: lstore_3
    //   13: dup2
    //   14: ldc2_w 29641640517927
    //   17: lxor
    //   18: lstore #5
    //   20: dup2
    //   21: ldc2_w 59755070165082
    //   24: lxor
    //   25: lstore #7
    //   27: dup2
    //   28: ldc2_w 72275569261745
    //   31: lxor
    //   32: dup2
    //   33: bipush #48
    //   35: lushr
    //   36: l2i
    //   37: istore #9
    //   39: dup2
    //   40: bipush #16
    //   42: lshl
    //   43: bipush #48
    //   45: lushr
    //   46: l2i
    //   47: istore #10
    //   49: dup2
    //   50: bipush #32
    //   52: lshl
    //   53: bipush #32
    //   55: lushr
    //   56: l2i
    //   57: istore #11
    //   59: pop2
    //   60: dup2
    //   61: ldc2_w 134602240812266
    //   64: lxor
    //   65: lstore #12
    //   67: pop2
    //   68: ldc2_w 5637499347216955988
    //   71: lload_1
    //   72: <illegal opcode> w : (JJ)[I
    //   77: astore #14
    //   79: aload_0
    //   80: getfield j : Z
    //   83: ifeq -> 107
    //   86: new java/io/IOException
    //   89: dup
    //   90: sipush #32139
    //   93: ldc2_w 8334288254486004416
    //   96: lload_1
    //   97: lxor
    //   98: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   103: invokespecial <init> : (Ljava/lang/String;)V
    //   106: athrow
    //   107: aload_0
    //   108: getfield e : J
    //   111: lconst_0
    //   112: lcmp
    //   113: aload #14
    //   115: ifnonnull -> 284
    //   118: ifle -> 280
    //   121: goto -> 134
    //   124: ldc2_w 5743518732152355696
    //   127: lload_1
    //   128: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   133: athrow
    //   134: aload_0
    //   135: getfield b : Lme/konsolas/aac/bX;
    //   138: aload_0
    //   139: getfield h : Lme/konsolas/aac/fw;
    //   142: lload #5
    //   144: dup2_x1
    //   145: pop2
    //   146: aload_0
    //   147: getfield e : J
    //   150: invokeinterface a : (JLme/konsolas/aac/fw;J)V
    //   155: aload_0
    //   156: getfield g : Z
    //   159: aload #14
    //   161: lload_1
    //   162: lconst_0
    //   163: lcmp
    //   164: iflt -> 286
    //   167: ifnonnull -> 284
    //   170: goto -> 183
    //   173: ldc2_w 5743518732152355696
    //   176: lload_1
    //   177: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   182: athrow
    //   183: ifne -> 280
    //   186: goto -> 199
    //   189: ldc2_w 5743518732152355696
    //   192: lload_1
    //   193: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   198: athrow
    //   199: aload_0
    //   200: getfield h : Lme/konsolas/aac/fw;
    //   203: aload_0
    //   204: getfield f : Lme/konsolas/aac/gG;
    //   207: lload #7
    //   209: dup2_x1
    //   210: pop2
    //   211: invokevirtual a : (JLme/konsolas/aac/gG;)Lme/konsolas/aac/gG;
    //   214: pop
    //   215: aload_0
    //   216: getfield f : Lme/konsolas/aac/gG;
    //   219: aload_0
    //   220: getfield h : Lme/konsolas/aac/fw;
    //   223: invokevirtual f : ()J
    //   226: aload_0
    //   227: getfield e : J
    //   230: lsub
    //   231: iload #9
    //   233: i2s
    //   234: dup_x2
    //   235: pop
    //   236: iload #10
    //   238: i2c
    //   239: iload #11
    //   241: invokevirtual a : (SJCI)I
    //   244: pop
    //   245: aload_0
    //   246: getfield f : Lme/konsolas/aac/gG;
    //   249: aload_0
    //   250: getfield i : [B
    //   253: lload #12
    //   255: dup2_x1
    //   256: pop2
    //   257: invokestatic a : (Lme/konsolas/aac/gG;J[B)V
    //   260: aload_0
    //   261: getfield f : Lme/konsolas/aac/gG;
    //   264: invokevirtual close : ()V
    //   267: goto -> 280
    //   270: ldc2_w 5743518732152355696
    //   273: lload_1
    //   274: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   279: athrow
    //   280: aload_0
    //   281: getfield d : Z
    //   284: aload #14
    //   286: ifnonnull -> 320
    //   289: ifeq -> 311
    //   292: goto -> 305
    //   295: ldc2_w 5743518732152355696
    //   298: lload_1
    //   299: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   304: athrow
    //   305: lload_1
    //   306: lconst_0
    //   307: lcmp
    //   308: ifgt -> 378
    //   311: aload_0
    //   312: lload_3
    //   313: invokespecial b : (J)V
    //   316: aload_0
    //   317: getfield l : I
    //   320: ifeq -> 79
    //   323: new java/net/ProtocolException
    //   326: dup
    //   327: new java/lang/StringBuilder
    //   330: dup
    //   331: invokespecial <init> : ()V
    //   334: sipush #6018
    //   337: ldc2_w 6585747749142636739
    //   340: lload_1
    //   341: lxor
    //   342: <illegal opcode> p : (IJ)Ljava/lang/String;
    //   347: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   350: aload_0
    //   351: getfield l : I
    //   354: invokestatic toHexString : (I)Ljava/lang/String;
    //   357: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   360: invokevirtual toString : ()Ljava/lang/String;
    //   363: invokespecial <init> : (Ljava/lang/String;)V
    //   366: lload_1
    //   367: lconst_0
    //   368: lcmp
    //   369: iflt -> 106
    //   372: aload #14
    //   374: ifnonnull -> 106
    //   377: athrow
    //   378: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #89	-> 79
    //   #38	-> 107
    //   #47	-> 134
    //   #62	-> 155
    //   #31	-> 199
    //   #32	-> 215
    //   #46	-> 245
    //   #82	-> 260
    //   #41	-> 280
    //   #9	-> 311
    //   #68	-> 316
    //   #71	-> 323
    //   #1	-> 378
    // Exception table:
    //   from	to	target	type
    //   107	121	124	java/io/IOException
    //   118	170	173	java/io/IOException
    //   134	186	189	java/io/IOException
    //   183	267	270	java/io/IOException
    //   284	292	295	java/io/IOException
  }
  
  void c(long paramLong) {
    // Byte code:
    //   0: getstatic me/konsolas/aac/c_.m : J
    //   3: lload_1
    //   4: lxor
    //   5: lstore_1
    //   6: lload_1
    //   7: dup2
    //   8: ldc2_w 5228469348036
    //   11: lxor
    //   12: lstore_3
    //   13: dup2
    //   14: ldc2_w 36473817453264
    //   17: lxor
    //   18: dup2
    //   19: bipush #32
    //   21: lushr
    //   22: l2i
    //   23: istore #5
    //   25: dup2
    //   26: bipush #32
    //   28: lshl
    //   29: bipush #48
    //   31: lushr
    //   32: l2i
    //   33: istore #6
    //   35: dup2
    //   36: bipush #48
    //   38: lshl
    //   39: bipush #48
    //   41: lushr
    //   42: l2i
    //   43: istore #7
    //   45: pop2
    //   46: dup2
    //   47: ldc2_w 96027730850492
    //   50: lxor
    //   51: dup2
    //   52: bipush #16
    //   54: lushr
    //   55: lstore #8
    //   57: dup2
    //   58: bipush #48
    //   60: lshl
    //   61: bipush #48
    //   63: lushr
    //   64: l2i
    //   65: istore #10
    //   67: pop2
    //   68: pop2
    //   69: ldc2_w -2932881656143846620
    //   72: lload_1
    //   73: <illegal opcode> w : (JJ)[I
    //   78: aload_0
    //   79: lload_3
    //   80: invokespecial e : (J)V
    //   83: astore #11
    //   85: aload_0
    //   86: aload #11
    //   88: ifnonnull -> 151
    //   91: getfield a : Z
    //   94: ifeq -> 137
    //   97: goto -> 110
    //   100: ldc2_w -2970907087318834688
    //   103: lload_1
    //   104: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   109: athrow
    //   110: aload_0
    //   111: lload #8
    //   113: iload #10
    //   115: i2c
    //   116: invokespecial f : (JC)V
    //   119: aload #11
    //   121: ifnull -> 161
    //   124: goto -> 137
    //   127: ldc2_w -2970907087318834688
    //   130: lload_1
    //   131: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   136: athrow
    //   137: aload_0
    //   138: goto -> 151
    //   141: ldc2_w -2970907087318834688
    //   144: lload_1
    //   145: <illegal opcode> w : (Ljava/lang/Exception;JJ)Ljava/lang/Exception;
    //   150: athrow
    //   151: iload #5
    //   153: iload #6
    //   155: iload #7
    //   157: i2s
    //   158: invokespecial a : (IIS)V
    //   161: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #92	-> 78
    //   #48	-> 85
    //   #55	-> 110
    //   #93	-> 137
    //   #36	-> 161
    // Exception table:
    //   from	to	target	type
    //   85	97	100	java/io/IOException
    //   91	124	127	java/io/IOException
    //   110	138	141	java/io/IOException
  }
  
  static {
    long l = m ^ 0x6B9DA4B5309FL;
    "봋玎淐曷僇䑄윺⧀ၭ찖叛奬疿댾㴜㾯촿ǫ".toCharArray()[10] = (char)("봋玎淐曷僇䑄윺⧀ၭ찖叛奬疿댾㴜㾯촿ǫ".toCharArray()[10] ^ 0x6BBE);
    "姘懴粦".toCharArray()[0] = (char)("姘懴粦".toCharArray()[0] ^ 0x20F);
    (new byte[8])[0] = (byte)(int)(l >>> 56L);
    for (byte b1 = 1; b1 < 8; b1++)
      (new byte[8])[b1] = (byte)(int)(l << b1 * 8 >>> 56L); 
    Cipher cipher;
    (cipher = Cipher.getInstance(hY$g6.H("봋玎淐曷僇䑄윺⧀ၭ찖叛奬疿댾㴜㾯촿ǫ".toCharArray(), (short)13700, (byte)0, (byte)0))).init(2, SecretKeyFactory.getInstance(hY$g6.H("姘懴粦".toCharArray(), (short)7684, (byte)5, (byte)5)).generateSecret(new DESKeySpec(new byte[8])), new IvParameterSpec(new byte[8]));
    String[] arrayOfString = new String[15];
    boolean bool = false;
    "횷홀搪퉳呱燦ᔱ㳡㽌菘ᦚ붛蒕녤峺텖?壯앲ꎳʍ같蕳绌鎜貮혠㣦糛Ḗ箢튪쎒덺炥ᔩ?ﭳ㕲溜掕?弑쓉鬟╪ꀷ繎?擀?嬮䈭耚锇蜀⥷哋愁죺⋊浀뙒ﬂ㘏輏䃁ꤴ륮욫澹ا笽⑯畭安৬䫎蔘넗癥ⵧ絲ᳵ紫⦖艂ⴤ䂌囜緂ㅄ텭똶妆ㅔ䤁ꤰᾔ긋엥鄦䂜孃鶑씦懧䥜疓⍺焝逼솣ф핺┮숩审푃犁戔쏘︳渾Ⳍ仼羅豝ᵿ♄饩ḹ咽?ᾙ錘?퓏鿨磖릤 䆙ꄤ篬갾둟㸦㖥뾴ॄ?죛㶹䗐尮₫႐椽䊄抠䬘㫑빟崬ᓦ嵥꿝꟨糤霃씛鈞䊸៳邂㘍譤ﻀꝾꍥ츞禚⛚嵶㰮㭥虍䨁잾騣纖貓䤝휙⟃슏㏌圴࿟䚋籱勄Ꮲ匝⏤繼婀뫺踇廤寁鳞隸鐝윘엯⊗Ⱘㄋ䰥㚜뢭钁쎖삷ꥺ?罕㈛铑Ḛ赚﷖ᙝ搸粖䣱蒋텲㐭ी郕ꬷ喸剻瞨电ﭢ?瀓ㅍ邡Օ㩚?䞍箆螹뇥龑⨈止ꊌ䴉뀙푧燊啉舭虧䡟ﶫ?ꨘ뎤謻㬕డ墶땵뽄濁榨粘鍐倭쬷ꢂ䭠꾑즹䖅䟑趤ﱾ?Ⳡઠ鍟鸂熡?Ƒ⯇㖣嗀娗駁禑먄춗弥敊?ᒴ⏄ʹ穛?⎃㮫钵㒐纂丫ꥪ輏?鉣絫脃趻⠌삒噹痸캟㙺嫦ࣰ籫꽖秩焖晇?ຝ몄눴飕圬曯䛝氷⿪黎蘌蹲芈쒄˯娇ɮຆ៛⎚⾟玶ⓇລꝎἓ㹖ဨ饕츦﵎䣫︍肒壘몽䞄瞐俗躁?ꘂ식꤭쐡銣㜍㞕䓨㘓៿㫽잟ꑕꂑ?ս᥊ꃡ듅촺漐잃魞꺒赟䠽跪ᛇﾦ鑠鴜᠓?㶽䛁项䋯˹슩ﹳᴀסּ䃰곐䪸犦츱ᷴﾕ앲닷褐뢀⵶뻽ኙ婗?㴠⳻縘ာꡢ♉ꏣ僚䉚?蠭᯳ꉼ鞖꽃뗨箇〗꼐쭀丼昕怐慒ᢃꗷ䷫즏ᑫ믵䬍❼쮈놰?T쨰焷៣挛ྋ腔씖嵘ᒳ滏軳曛煉袽끑禜룕ퟃ鵧礍驳㊎猳꩗뻱듿劁⑉Ꙙ㢃僄沩늁ጭ묷ﻶ糄㯗⇅ᎰᎻࠗ뉽쮲␲뗨쯪牱㧳ᠻ빒៌℺௪藡┐㦠䰧죇հ⼷ᠥ긟㏶ਐ瀄㢵ᆣ儘셑૊鱜?纓࿻撶ﵕٱ휧⦜".toCharArray()[412] = (char)("횷홀搪퉳呱燦ᔱ㳡㽌菘ᦚ붛蒕녤峺텖?壯앲ꎳʍ같蕳绌鎜貮혠㣦糛Ḗ箢튪쎒덺炥ᔩ?ﭳ㕲溜掕?弑쓉鬟╪ꀷ繎?擀?嬮䈭耚锇蜀⥷哋愁죺⋊浀뙒ﬂ㘏輏䃁ꤴ륮욫澹ا笽⑯畭安৬䫎蔘넗癥ⵧ絲ᳵ紫⦖艂ⴤ䂌囜緂ㅄ텭똶妆ㅔ䤁ꤰᾔ긋엥鄦䂜孃鶑씦懧䥜疓⍺焝逼솣ф핺┮숩审푃犁戔쏘︳渾Ⳍ仼羅豝ᵿ♄饩ḹ咽?ᾙ錘?퓏鿨磖릤 䆙ꄤ篬갾둟㸦㖥뾴ॄ?죛㶹䗐尮₫႐椽䊄抠䬘㫑빟崬ᓦ嵥꿝꟨糤霃씛鈞䊸៳邂㘍譤ﻀꝾꍥ츞禚⛚嵶㰮㭥虍䨁잾騣纖貓䤝휙⟃슏㏌圴࿟䚋籱勄Ꮲ匝⏤繼婀뫺踇廤寁鳞隸鐝윘엯⊗Ⱘㄋ䰥㚜뢭钁쎖삷ꥺ?罕㈛铑Ḛ赚﷖ᙝ搸粖䣱蒋텲㐭ी郕ꬷ喸剻瞨电ﭢ?瀓ㅍ邡Օ㩚?䞍箆螹뇥龑⨈止ꊌ䴉뀙푧燊啉舭虧䡟ﶫ?ꨘ뎤謻㬕డ墶땵뽄濁榨粘鍐倭쬷ꢂ䭠꾑즹䖅䟑趤ﱾ?Ⳡઠ鍟鸂熡?Ƒ⯇㖣嗀娗駁禑먄춗弥敊?ᒴ⏄ʹ穛?⎃㮫钵㒐纂丫ꥪ輏?鉣絫脃趻⠌삒噹痸캟㙺嫦ࣰ籫꽖秩焖晇?ຝ몄눴飕圬曯䛝氷⿪黎蘌蹲芈쒄˯娇ɮຆ៛⎚⾟玶ⓇລꝎἓ㹖ဨ饕츦﵎䣫︍肒壘몽䞄瞐俗躁?ꘂ식꤭쐡銣㜍㞕䓨㘓៿㫽잟ꑕꂑ?ս᥊ꃡ듅촺漐잃魞꺒赟䠽跪ᛇﾦ鑠鴜᠓?㶽䛁项䋯˹슩ﹳᴀסּ䃰곐䪸犦츱ᷴﾕ앲닷褐뢀⵶뻽ኙ婗?㴠⳻縘ာꡢ♉ꏣ僚䉚?蠭᯳ꉼ鞖꽃뗨箇〗꼐쭀丼昕怐慒ᢃꗷ䷫즏ᑫ믵䬍❼쮈놰?T쨰焷៣挛ྋ腔씖嵘ᒳ滏軳曛煉袽끑禜룕ퟃ鵧礍驳㊎猳꩗뻱듿劁⑉Ꙙ㢃僄沩늁ጭ묷ﻶ糄㯗⇅ᎰᎻࠗ뉽쮲␲뗨쯪牱㧳ᠻ빒៌℺௪藡┐㦠䰧죇հ⼷ᠥ긟㏶ਐ瀄㢵ᆣ儘셑૊鱜?纓࿻撶ﵕٱ휧⦜".toCharArray()[412] ^ 0x1961);
    String str;
    int i = (str = hY$g6.H("횷홀搪퉳呱燦ᔱ㳡㽌菘ᦚ붛蒕녤峺텖?壯앲ꎳʍ같蕳绌鎜貮혠㣦糛Ḗ箢튪쎒덺炥ᔩ?ﭳ㕲溜掕?弑쓉鬟╪ꀷ繎?擀?嬮䈭耚锇蜀⥷哋愁죺⋊浀뙒ﬂ㘏輏䃁ꤴ륮욫澹ا笽⑯畭安৬䫎蔘넗癥ⵧ絲ᳵ紫⦖艂ⴤ䂌囜緂ㅄ텭똶妆ㅔ䤁ꤰᾔ긋엥鄦䂜孃鶑씦懧䥜疓⍺焝逼솣ф핺┮숩审푃犁戔쏘︳渾Ⳍ仼羅豝ᵿ♄饩ḹ咽?ᾙ錘?퓏鿨磖릤 䆙ꄤ篬갾둟㸦㖥뾴ॄ?죛㶹䗐尮₫႐椽䊄抠䬘㫑빟崬ᓦ嵥꿝꟨糤霃씛鈞䊸៳邂㘍譤ﻀꝾꍥ츞禚⛚嵶㰮㭥虍䨁잾騣纖貓䤝휙⟃슏㏌圴࿟䚋籱勄Ꮲ匝⏤繼婀뫺踇廤寁鳞隸鐝윘엯⊗Ⱘㄋ䰥㚜뢭钁쎖삷ꥺ?罕㈛铑Ḛ赚﷖ᙝ搸粖䣱蒋텲㐭ी郕ꬷ喸剻瞨电ﭢ?瀓ㅍ邡Օ㩚?䞍箆螹뇥龑⨈止ꊌ䴉뀙푧燊啉舭虧䡟ﶫ?ꨘ뎤謻㬕డ墶땵뽄濁榨粘鍐倭쬷ꢂ䭠꾑즹䖅䟑趤ﱾ?Ⳡઠ鍟鸂熡?Ƒ⯇㖣嗀娗駁禑먄춗弥敊?ᒴ⏄ʹ穛?⎃㮫钵㒐纂丫ꥪ輏?鉣絫脃趻⠌삒噹痸캟㙺嫦ࣰ籫꽖秩焖晇?ຝ몄눴飕圬曯䛝氷⿪黎蘌蹲芈쒄˯娇ɮຆ៛⎚⾟玶ⓇລꝎἓ㹖ဨ饕츦﵎䣫︍肒壘몽䞄瞐俗躁?ꘂ식꤭쐡銣㜍㞕䓨㘓៿㫽잟ꑕꂑ?ս᥊ꃡ듅촺漐잃魞꺒赟䠽跪ᛇﾦ鑠鴜᠓?㶽䛁项䋯˹슩ﹳᴀסּ䃰곐䪸犦츱ᷴﾕ앲닷褐뢀⵶뻽ኙ婗?㴠⳻縘ာꡢ♉ꏣ僚䉚?蠭᯳ꉼ鞖꽃뗨箇〗꼐쭀丼昕怐慒ᢃꗷ䷫즏ᑫ믵䬍❼쮈놰?T쨰焷៣挛ྋ腔씖嵘ᒳ滏軳曛煉袽끑禜룕ퟃ鵧礍驳㊎猳꩗뻱듿劁⑉Ꙙ㢃僄沩늁ጭ묷ﻶ糄㯗⇅ᎰᎻࠗ뉽쮲␲뗨쯪牱㧳ᠻ빒៌℺௪藡┐㦠䰧죇հ⼷ᠥ긟㏶ਐ瀄㢵ᆣ儘셑૊鱜?纓࿻撶ﵕٱ휧⦜".toCharArray(), (short)7568, (byte)3, (byte)0)).length();
    byte b2 = 64;
    byte b = -1;
    while (true);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
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
    int i = paramInt ^ (int)(paramLong & 0x7FFFL) ^ 0x701D;
    if (o[i] == null) {
      Object[] arrayOfObject;
      try {
        Long long_ = Long.valueOf(Thread.currentThread().getId());
        arrayOfObject = (Object[])p.get(long_);
        if (arrayOfObject == null) {
          arrayOfObject = new Object[3];
          "朞츂繶㾵ᰛⰓ橲䗓ᕰ匤ꦦ鯐鐟㔱砄嗎㩀ẓ准䁚".toCharArray()[13] = (char)("朞츂繶㾵ᰛⰓ橲䗓ᕰ匤ꦦ鯐鐟㔱砄嗎㩀ẓ准䁚".toCharArray()[13] ^ 0x3BC8);
          arrayOfObject[0] = Cipher.getInstance(dP$dt.X("朞츂繶㾵ᰛⰓ橲䗓ᕰ匤ꦦ鯐鐟㔱砄嗎㩀ẓ准䁚".toCharArray(), (short)16866, true, true));
          "쟮꺱㮙".toCharArray()[1] = (char)("쟮꺱㮙".toCharArray()[1] ^ 0x2330);
          arrayOfObject[1] = SecretKeyFactory.getInstance(dP$dt.X("쟮꺱㮙".toCharArray(), (short)30809, true, false));
          arrayOfObject[2] = new IvParameterSpec(new byte[8]);
          p.put(long_, arrayOfObject);
        } 
      } catch (Exception exception) {
        "ྯ뷓쐐ꗷ槯ꭢ遚롯涅ト芉启懲彂鍬奰伣₭".toCharArray()[14] = (char)("ྯ뷓쐐ꗷ槯ꭢ遚롯涅ト芉启懲彂鍬奰伣₭".toCharArray()[14] ^ 0x379C);
        throw new RuntimeException(dP$dt.X("ྯ뷓쐐ꗷ槯ꭢ遚롯涅ト芉启懲彂鍬奰伣₭".toCharArray(), (short)32747, true, true), exception);
      } 
      byte[] arrayOfByte1 = new byte[8];
      arrayOfByte1[0] = (byte)(int)(paramLong >>> 56L);
      for (byte b = 1; b < 8; b++)
        arrayOfByte1[b] = (byte)(int)(paramLong << b * 8 >>> 56L); 
      DESKeySpec dESKeySpec = new DESKeySpec(arrayOfByte1);
      SecretKey secretKey = ((SecretKeyFactory)arrayOfObject[1]).generateSecret(dESKeySpec);
      ((Cipher)arrayOfObject[0]).init(2, secretKey, (IvParameterSpec)arrayOfObject[2]);
      "繹㽃큛賛乌竻㍀ص阽㭯獱".toCharArray()[4] = (char)("繹㽃큛賛乌竻㍀ص阽㭯獱".toCharArray()[4] ^ 0x5A7A);
      byte[] arrayOfByte2 = n[i].getBytes(dP$dt.X("繹㽃큛賛乌竻㍀ص阽㭯獱".toCharArray(), (short)17812, true, true));
      o[i] = a(((Cipher)arrayOfObject[0]).doFinal(arrayOfByte2));
    } 
    return o[i];
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
    //   66: ldc_w '쬸디狕돸㾹㲰淄郔㮚䖈읧ိ허缬咧⍱'
    //   69: invokevirtual toCharArray : ()[C
    //   72: dup
    //   73: dup
    //   74: iconst_4
    //   75: dup_x1
    //   76: caload
    //   77: sipush #25162
    //   80: ixor
    //   81: i2c
    //   82: castore
    //   83: sipush #29920
    //   86: iconst_0
    //   87: iconst_1
    //   88: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
    //   91: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: ldc_w '흁ս吡᱂'
    //   97: invokevirtual toCharArray : ()[C
    //   100: dup
    //   101: dup
    //   102: iconst_2
    //   103: dup_x1
    //   104: caload
    //   105: sipush #23229
    //   108: ixor
    //   109: i2c
    //   110: castore
    //   111: sipush #21580
    //   114: iconst_0
    //   115: iconst_1
    //   116: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
    //   119: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   122: aload_1
    //   123: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   126: ldc_w '䎝概⢒媵'
    //   129: invokevirtual toCharArray : ()[C
    //   132: dup
    //   133: dup
    //   134: iconst_1
    //   135: dup_x1
    //   136: caload
    //   137: sipush #14141
    //   140: ixor
    //   141: i2c
    //   142: castore
    //   143: sipush #12009
    //   146: iconst_1
    //   147: iconst_1
    //   148: invokestatic X : (Ljava/lang/Object;SZZ)Ljava/lang/String;
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


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\c_.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */