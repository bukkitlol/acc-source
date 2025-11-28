/* 1 */ package me.konsolas.aac;public abstract class iz implements c6, Serializable { private static final long serialVersionUID = -4940583368468432370L; public void i(Object paramObject) { this.a = paramObject; }
/*   */    protected Object a; private static aN[] b; public Object i() {
/* 3 */     return this.a;
/*   */   }
/*   */   
/*   */   public static void b(aN[] paramArrayOfaN) {
/*   */     b = paramArrayOfaN;
/*   */   }
/*   */   
/*   */   public static aN[] b() {
/*   */     return b;
/*   */   }
/*   */   
/*   */   static {
/*   */     // Byte code:
/*   */     //   0: ldc2_w 3655430937297795486
/*   */     //   3: ldc2_w 7213166000725473788
/*   */     //   6: invokestatic lookup : ()Ljava/lang/invoke/MethodHandles$Lookup;
/*   */     //   9: invokevirtual lookupClass : ()Ljava/lang/Class;
/*   */     //   12: invokestatic a : (JJLjava/lang/Object;)Lme/konsolas/aac/na;
/*   */     //   15: ldc2_w 270700719501836
/*   */     //   18: invokeinterface a : (J)J
/*   */     //   23: ldc2_w 100588054569824
/*   */     //   26: lxor
/*   */     //   27: lstore_0
/*   */     //   28: ldc2_w -2078716460673582450
/*   */     //   31: lload_0
/*   */     //   32: <illegal opcode> w : (JJ)[Lme/konsolas/aac/aN;
/*   */     //   37: ifnull -> 53
/*   */     //   40: iconst_3
/*   */     //   41: anewarray me/konsolas/aac/aN
/*   */     //   44: ldc2_w -2076843680643446518
/*   */     //   47: lload_0
/*   */     //   48: <illegal opcode> w : ([Lme/konsolas/aac/aN;JJ)V
/*   */     //   53: return
/*   */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\iz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */