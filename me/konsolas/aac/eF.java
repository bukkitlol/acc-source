/*  1 */ package me.konsolas.aac;public class ef { private final UUID e; private final long f; private final String g; public long a() { return this.c; } private final long c; private final boolean d; private static int b; private static final long a; public boolean a() {
/*  2 */     return this.d;
/*    */   }
/*    */   
/*  5 */   public String a() { return this.g; } public ef a(long paramLong) {
/*    */     // Byte code:
/*    */     //   0: getstatic me/konsolas/aac/ef.a : J
/*    */     //   3: lload_1
/*    */     //   4: lxor
/*    */     //   5: lstore_1
/*    */     //   6: new me/konsolas/aac/ef
/*    */     //   9: dup
/*    */     //   10: aload_0
/*    */     //   11: getfield e : Ljava/util/UUID;
/*    */     //   14: aload_0
/*    */     //   15: getfield f : J
/*    */     //   18: aload_0
/*    */     //   19: getfield g : Ljava/lang/String;
/*    */     //   22: aload_0
/*    */     //   23: getfield c : J
/*    */     //   26: aload_0
/*    */     //   27: getfield d : Z
/*    */     //   30: ifne -> 47
/*    */     //   33: iconst_1
/*    */     //   34: goto -> 48
/*    */     //   37: ldc2_w 7505269741136913819
/*    */     //   40: lload_1
/*    */     //   41: <illegal opcode> w : (Laacinternal/v;JJ)Laacinternal/v;
/*    */     //   46: athrow
/*    */     //   47: iconst_0
/*    */     //   48: invokespecial <init> : (Ljava/util/UUID;JLjava/lang/String;JZ)V
/*    */     //   51: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #6	-> 6
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   6	37	37	aacinternal/v
/*    */   } public UUID a() {
/*  8 */     return this.e;
/*    */   } public long b() {
/* 10 */     return this.f;
/*    */   } public ef(UUID paramUUID, long paramLong1, String paramString, long paramLong2, boolean paramBoolean) {
/* 12 */     this.e = paramUUID;
/*    */     this.f = paramLong1;
/*    */     this.g = paramString;
/*    */     this.c = paramLong2;
/*    */     this.d = paramBoolean;
/*    */   }
/*    */   
/*    */   public static void b(int paramInt) {
/*    */     b = paramInt;
/*    */   }
/*    */   
/*    */   public static int b() {
/*    */     return b;
/*    */   }
/*    */   
/*    */   public static int c() {
/*    */     int i = b();
/*    */     try {
/*    */       if (i == 0)
/*    */         return 51; 
/*    */     } catch (v v) {
/*    */       throw a(null);
/*    */     } 
/*    */     return 0;
/*    */   }
/*    */   
/*    */   static {
/*    */     // Byte code:
/*    */     //   0: ldc2_w -3404168521738480476
/*    */     //   3: ldc2_w 1129007424961708348
/*    */     //   6: invokestatic lookup : ()Ljava/lang/invoke/MethodHandles$Lookup;
/*    */     //   9: invokevirtual lookupClass : ()Ljava/lang/Class;
/*    */     //   12: invokestatic a : (JJLjava/lang/Object;)Lme/konsolas/aac/na;
/*    */     //   15: ldc2_w 57521649243163
/*    */     //   18: invokeinterface a : (J)J
/*    */     //   23: putstatic me/konsolas/aac/ef.a : J
/*    */     //   26: getstatic me/konsolas/aac/ef.a : J
/*    */     //   29: ldc2_w 52654589187073
/*    */     //   32: lxor
/*    */     //   33: lstore_0
/*    */     //   34: ldc2_w 2039711871929470952
/*    */     //   37: lload_0
/*    */     //   38: <illegal opcode> w : (JJ)I
/*    */     //   43: ifeq -> 57
/*    */     //   46: bipush #96
/*    */     //   48: ldc2_w 2137745954842268368
/*    */     //   51: lload_0
/*    */     //   52: <illegal opcode> w : (IJJ)V
/*    */     //   57: return
/*    */   }
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ef.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */