/*    */ package me.konsolas.aac;public class jr implements ff, Serializable { private static final long serialVersionUID = 0L; public Object d() {
/*  2 */     return this.a;
/*    */   } protected final int b; protected final Object a; public String toString() {
/*  4 */     "瞏➏".toCharArray()[0] = (char)("瞏➏".toCharArray()[0] ^ 0x6790); "颎⫺".toCharArray()[0] = (char)("颎⫺".toCharArray()[0] ^ 0x57B2); "⸕硺".toCharArray()[0] = (char)("⸕硺".toCharArray()[0] ^ 0x60E4); return dP$dt.X("瞏➏".toCharArray(), (short)9193, false, true) + c() + dP$dt.X("颎⫺".toCharArray(), (short)6975, false, true) + d() + dP$dt.X("⸕硺".toCharArray(), (short)638, true, false);
/*    */   } public int c() {
/*  6 */     return this.b;
/*    */   }
/*    */   public static jr a(int paramInt, Object paramObject) {
/*  9 */     return new jr(paramInt, paramObject);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public jr(int paramInt, Object paramObject)
/*    */   {
/* 20 */     this.b = paramInt; this.a = paramObject; } public boolean equals(Object paramObject) { try { if (paramObject == null)
/* 21 */         return false;  } catch (v v) { throw a(null); }  try { if (paramObject instanceof ff)
/*    */         try {
/*    */           if (this.b == ((ff)paramObject).c())
/*    */             try {
/*    */               if (Objects.equals(this.a, ((ff)paramObject).d()));
/*    */             } catch (v v) {
/*    */               throw a(null);
/*    */             }  
/*    */         } catch (v v) {
/*    */           throw a(null);
/*    */         }   }
/*    */     catch (v v)
/*    */     { throw a(null); }
/*    */     
/*    */     try {
/*    */       if (paramObject instanceof jz)
/*    */         try {
/*    */           if (Objects.equals(Integer.valueOf(this.b), ((jz)paramObject).e()))
/*    */             try {
/*    */               if (Objects.equals(this.a, ((jz)paramObject).d()));
/*    */             } catch (v v) {
/*    */               throw a(null);
/*    */             }  
/*    */         } catch (v v) {
/*    */           throw a(null);
/*    */         }  
/*    */     } catch (v v) {
/*    */       throw a(null);
/*    */     } 
/*    */     return false; }
/*    */ 
/*    */   
/*    */   public int hashCode() {
/*    */     try {
/*    */     
/*    */     } catch (v v) {
/*    */       throw a(null);
/*    */     } 
/*    */     return this.b * 19 + ((this.a == null) ? 0 : this.a.hashCode());
/*    */   }
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\jr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */