/*    */ package me.konsolas.aac;
/*    */ public abstract class aw extends U implements Cloneable, kQ {
/*  3 */   public int hashCode() { int i = 0, j = size();
/*  4 */     cA cA = b();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 13 */     while (j-- != 0) { int k = cA.nextInt(); i += k; }
/* 14 */      return i; }
/*    */   @Deprecated
/* 16 */   public boolean b(int paramInt) { return d(paramInt); } public boolean d(int paramInt) { return super.b(paramInt); }
/* 17 */   public Iterator iterator() { return b(); } public boolean equals(Object paramObject) { try { if (paramObject == this) return true;  } catch (v v) { throw d(null); }
/*    */     
/*    */     try {
/*    */       if (!(paramObject instanceof Set))
/*    */         return false; 
/*    */     } catch (v v) {
/*    */       throw d(null);
/*    */     } 
/*    */     Set set = (Set)paramObject;
/*    */     try {
/*    */       if (set.size() != size())
/*    */         return false; 
/*    */     } catch (v v) {
/*    */       throw d(null);
/*    */     } 
/*    */     try {
/*    */       if (set instanceof kQ)
/*    */         return d((kQ)set); 
/*    */     } catch (v v) {
/*    */       throw d(null);
/*    */     } 
/*    */     return containsAll(set); }
/*    */ 
/*    */   
/*    */   public abstract cA b();
/*    */   
/*    */   private static v d(v paramv) {
/*    */     return paramv;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\aw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */