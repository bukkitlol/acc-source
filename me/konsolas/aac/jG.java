/*  1 */ package me.konsolas.aac;public final class jg { public static f8 b(f8 paramf8) { try {  } catch (v v) { throw a(null); }  return (paramf8 instanceof java.util.RandomAccess) ? new mj(paramf8) : new mT(paramf8); } public static f8 a(Object paramObject) {
/*  2 */     return new aK(((Integer)paramObject).intValue());
/*    */   }
/*    */   
/*    */   public static f8 a(f8 paramf8, Random paramRandom) {
/*  6 */     for (int i = paramf8.size(); i-- != 0; )
/*  7 */     { int j = paramRandom.nextInt(i + 1);
/*    */ 
/*    */ 
/*    */       
/*    */       int k = paramf8.b(i);
/*    */ 
/*    */       
/* 14 */       paramf8.a(i, paramf8.b(j)); }  return paramf8; } public static f8 a(f8 paramf8) { try {  }
/* 15 */     catch (v v) { throw a(null); }  return (paramf8 instanceof java.util.RandomAccess) ? new cf(paramf8) : new cD(paramf8); }
/*    */ 
/*    */   
/*    */   public static f8 a() {
/*    */     return a;
/*    */   }
/*    */   
/*    */   public static f8 a(f8 paramf8, Object paramObject) {
/*    */     try {
/*    */     
/*    */     } catch (v v) {
/*    */       throw a(null);
/*    */     } 
/*    */     return (paramf8 instanceof java.util.RandomAccess) ? new mj(paramf8, paramObject) : new mT(paramf8, paramObject);
/*    */   }
/*    */   
/*    */   public static final aM a = new aM();
/*    */   
/*    */   public static f8 a(int paramInt) {
/*    */     return new aK(paramInt);
/*    */   }
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\jg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */