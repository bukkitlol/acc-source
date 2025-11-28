/*    */ package me.konsolas.aac;public class h2 implements eB {
/*    */   public boolean equals(Object paramObject) {
/*    */     
/*  4 */     try { if (!(paramObject instanceof Map.Entry)) return false;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/*    */     
/*  6 */     if (paramObject instanceof eB) {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 15 */       eB eB1 = (eB)paramObject;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 23 */       try { if (this.b == eB1.a()) try { if (Objects.equals(this.a, eB1.getValue())); } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }   } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return false;
/*    */     } 
/*    */     Map.Entry entry = (Map.Entry)paramObject;
/*    */     Object object1 = entry.getKey();
/*    */     try {
/*    */       if (object1 != null) {
/*    */         try {
/*    */           if (!(object1 instanceof Integer))
/*    */             return false; 
/*    */         } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */           throw a(null);
/*    */         } 
/*    */       } else {
/*    */         return false;
/*    */       } 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     Object object2 = entry.getValue();
/*    */     try {
/*    */       if (this.b == ((Integer)object1).intValue())
/*    */         try {
/*    */           if (Objects.equals(this.a, object2));
/*    */         } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */           throw a(null);
/*    */         }  
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return false;
/*    */   }
/*    */   
/*    */   protected int b;
/*    */   protected Object a;
/*    */   private static final long c = nc.a(2792388424922148164L, 7398108380059144010L, MethodHandles.lookup().lookupClass()).a(256984455332295L);
/*    */   
/*    */   public h2(int paramInt, Object paramObject) {
/*    */     this.b = paramInt;
/*    */     this.a = paramObject;
/*    */   }
/*    */   
/*    */   public Object getValue() {
/*    */     return this.a;
/*    */   }
/*    */   
/*    */   public int a() {
/*    */     return this.b;
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     try {
/*    */     
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return this.b ^ ((this.a == null) ? 0 : this.a.hashCode());
/*    */   }
/*    */   
/*    */   public Object setValue(Object paramObject) {
/*    */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   public String toString() {
/*    */     long l = c ^ 0x245AD7673675L;
/*    */     "現숦㺒".toCharArray()[0] = (char)("現숦㺒".toCharArray()[0] ^ 0x6F0B);
/*    */     return this.b + da$gx.U("現숦㺒".toCharArray(), (short)20026, true, true) + this.a;
/*    */   }
/*    */   
/*    */   public h2() {}
/*    */   
/*    */   public h2(Integer paramInteger, Object paramObject) {
/*    */     this.b = paramInteger.intValue();
/*    */     this.a = paramObject;
/*    */   }
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   }
/*    */ }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\h2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */