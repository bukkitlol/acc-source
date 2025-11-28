/*    */ package me.konsolas.aac;public class ci { private final mZ d; private final gg e; private final Vector c; private final cJ g;
/*    */   public Vector a() {
/*  3 */     return this.c.clone();
/*    */   } private final N b; private final int a; private static int f; private static final long h;
/*    */   public ci a(Vector paramVector) {
/*  6 */     Vector vector = paramVector.clone();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 48 */     return new ci(this.d, this.b, this.c, this.e, new cJ(vector, vector, this.g.b(), this.g.a(), this.g.c()), this.a); } public ci(mZ parammZ, N paramN, Vector paramVector, gg paramgg, cJ paramcJ) { this(parammZ, paramN, paramVector, paramgg, paramcJ, 0); }
/*    */   public gg a() { return this.e; }
/*    */   public N a() { return this.b; }
/* 51 */   private ci(mZ parammZ, N paramN, Vector paramVector, gg paramgg, cJ paramcJ, int paramInt) { this.d = parammZ; this.e = paramgg; this.c = paramVector;
/*    */     this.g = paramcJ;
/*    */     this.b = paramN;
/*    */     this.a = paramInt; }
/*    */ 
/*    */   
/*    */   public cJ a() {
/*    */     return this.g;
/*    */   }
/*    */   
/*    */   public ci a() {
/*    */     return new ci(this.d, this.b, this.c, this.e, new cJ(this.g.b(), this.g.a(), this.g.b(), true, this.g.c()), this.a);
/*    */   }
/*    */   
/*    */   public ci a(double paramDouble) {
/*    */     Vector vector = this.g.a();
/*    */     vector.setY(paramDouble);
/*    */     return b(vector);
/*    */   }
/*    */   
/*    */   public ci b(Vector paramVector) {
/*    */     return new ci(this.d, this.b, this.c, this.e, new cJ(this.g.b(), paramVector, this.g.b(), this.g.a(), this.g.c()), this.a);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return Objects.hash(new Object[] { this.e, this.g, this.b });
/*    */   }
/*    */   
/*    */   public boolean equals(Object paramObject) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/ci.h : J
/*    */     //   3: ldc2_w 20853222877357
/*    */     //   6: lxor
/*    */     //   7: lstore_2
/*    */     //   8: ldc2_w -8145801365130002191
/*    */     //   11: lload_2
/*    */     //   12: <illegal opcode> w : (JJ)I
/*    */     //   17: istore #4
/*    */     //   19: aload_0
/*    */     //   20: iload #4
/*    */     //   22: ifne -> 55
/*    */     //   25: aload_1
/*    */     //   26: if_acmpne -> 54
/*    */     //   29: goto -> 42
/*    */     //   32: ldc2_w -8148431183207066813
/*    */     //   35: lload_2
/*    */     //   36: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   41: athrow
/*    */     //   42: iconst_1
/*    */     //   43: ireturn
/*    */     //   44: ldc2_w -8148431183207066813
/*    */     //   47: lload_2
/*    */     //   48: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   53: athrow
/*    */     //   54: aload_1
/*    */     //   55: ifnull -> 100
/*    */     //   58: aload_0
/*    */     //   59: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   62: iload #4
/*    */     //   64: ifne -> 113
/*    */     //   67: goto -> 80
/*    */     //   70: ldc2_w -8148431183207066813
/*    */     //   73: lload_2
/*    */     //   74: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   79: athrow
/*    */     //   80: aload_1
/*    */     //   81: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   84: if_acmpeq -> 112
/*    */     //   87: goto -> 100
/*    */     //   90: ldc2_w -8148431183207066813
/*    */     //   93: lload_2
/*    */     //   94: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   99: athrow
/*    */     //   100: iconst_0
/*    */     //   101: ireturn
/*    */     //   102: ldc2_w -8148431183207066813
/*    */     //   105: lload_2
/*    */     //   106: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   111: athrow
/*    */     //   112: aload_1
/*    */     //   113: checkcast me/konsolas/aac/ci
/*    */     //   116: astore #5
/*    */     //   118: aload_0
/*    */     //   119: getfield e : Lme/konsolas/aac/gg;
/*    */     //   122: aload #5
/*    */     //   124: getfield e : Lme/konsolas/aac/gg;
/*    */     //   127: invokestatic equals : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   130: iload #4
/*    */     //   132: ifne -> 176
/*    */     //   135: ifeq -> 247
/*    */     //   138: goto -> 151
/*    */     //   141: ldc2_w -8148431183207066813
/*    */     //   144: lload_2
/*    */     //   145: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   150: athrow
/*    */     //   151: aload_0
/*    */     //   152: getfield g : Lme/konsolas/aac/cJ;
/*    */     //   155: aload #5
/*    */     //   157: getfield g : Lme/konsolas/aac/cJ;
/*    */     //   160: invokestatic equals : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   163: goto -> 176
/*    */     //   166: ldc2_w -8148431183207066813
/*    */     //   169: lload_2
/*    */     //   170: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   175: athrow
/*    */     //   176: iload #4
/*    */     //   178: ifne -> 222
/*    */     //   181: ifeq -> 247
/*    */     //   184: goto -> 197
/*    */     //   187: ldc2_w -8148431183207066813
/*    */     //   190: lload_2
/*    */     //   191: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   196: athrow
/*    */     //   197: aload_0
/*    */     //   198: getfield b : Lme/konsolas/aac/N;
/*    */     //   201: aload #5
/*    */     //   203: getfield b : Lme/konsolas/aac/N;
/*    */     //   206: invokestatic equals : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   209: goto -> 222
/*    */     //   212: ldc2_w -8148431183207066813
/*    */     //   215: lload_2
/*    */     //   216: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   221: athrow
/*    */     //   222: iload #4
/*    */     //   224: ifne -> 244
/*    */     //   227: ifeq -> 247
/*    */     //   230: goto -> 243
/*    */     //   233: ldc2_w -8148431183207066813
/*    */     //   236: lload_2
/*    */     //   237: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   242: athrow
/*    */     //   243: iconst_1
/*    */     //   244: goto -> 248
/*    */     //   247: iconst_0
/*    */     //   248: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #38	-> 19
/*    */     //   #8	-> 54
/*    */     //   #24	-> 112
/*    */     //   #19	-> 118
/*    */     //   #34	-> 160
/*    */     //   #26	-> 206
/*    */     //   #42	-> 248
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   19	29	32	aacinternal/v
/*    */     //   25	44	44	aacinternal/v
/*    */     //   55	67	70	aacinternal/v
/*    */     //   58	87	90	aacinternal/v
/*    */     //   80	102	102	aacinternal/v
/*    */     //   118	138	141	aacinternal/v
/*    */     //   135	163	166	aacinternal/v
/*    */     //   176	184	187	aacinternal/v
/*    */     //   181	209	212	aacinternal/v
/*    */     //   222	230	233	aacinternal/v
/*    */   }
/*    */   
/*    */   public ci b() {
/*    */     return new ci(this.d, this.b, this.c, this.e, new cJ(this.g.b(), this.g.a(), true, this.g.a(), this.g.c()), this.a);
/*    */   }
/*    */   
/*    */   public mZ a() {
/*    */     return this.d;
/*    */   }
/*    */   
/*    */   public int a() {
/*    */     return this.a;
/*    */   }
/*    */   
/*    */   public static void b(int paramInt) {
/*    */     f = paramInt;
/*    */   }
/*    */   
/*    */   public static int d() {
/*    */     return f;
/*    */   }
/*    */   
/*    */   public static int c() {
/*    */     int i = d();
/*    */     try {
/*    */       if (i == 0)
/*    */         return 126; 
/*    */     } catch (v v) {
/*    */       throw a(null);
/*    */     } 
/*    */     return 0;
/*    */   }
/*    */   
/*    */   static {
/*    */     // Byte code:
/*    */     //   0: ldc2_w 5986661174001542270
/*    */     //   3: ldc2_w 2391217705057166738
/*    */     //   6: invokestatic lookup : ()Ljava/lang/invoke/MethodHandles$Lookup;
/*    */     //   9: invokevirtual lookupClass : ()Ljava/lang/Class;
/*    */     //   12: invokestatic a : (JJLjava/lang/Object;)Lme/konsolas/aac/na;
/*    */     //   15: ldc2_w 93373702152778
/*    */     //   18: invokeinterface a : (J)J
/*    */     //   23: putstatic me/konsolas/aac/ci.h : J
/*    */     //   26: getstatic me/konsolas/aac/ci.h : J
/*    */     //   29: ldc2_w 44411603244758
/*    */     //   32: lxor
/*    */     //   33: lstore_0
/*    */     //   34: ldc2_w 8110831480590843530
/*    */     //   37: lload_0
/*    */     //   38: <illegal opcode> w : (JJ)I
/*    */     //   43: ifeq -> 56
/*    */     //   46: iconst_2
/*    */     //   47: ldc2_w 8169066987431068886
/*    */     //   50: lload_0
/*    */     //   51: <illegal opcode> w : (IJJ)V
/*    */     //   56: return
/*    */   }
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ci.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */