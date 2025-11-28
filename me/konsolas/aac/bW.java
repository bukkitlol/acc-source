/*  1 */ package me.konsolas.aac;class bw extends bK { private static final long serialVersionUID = -3185226345314976296L; final b2 g; private Object[] a() { return this.g.d; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Object get(int paramInt) {
/*  8 */     e(paramInt);
/*    */ 
/*    */ 
/*    */     
/* 12 */     return this.g.d[paramInt + this.d];
/*    */   } public i0 a(int paramInt) { return new lI(this, paramInt); } public boolean equals(Object paramObject) { try { if (paramObject == this)
/*    */         return true;  } catch (v v) { throw b(null); }
/*    */      try { if (paramObject == null)
/*    */         return false;  }
/*    */     catch (v v) { throw b(null); }
/* 18 */      try { if (!(paramObject instanceof List)) return false;  } catch (v v) { throw b(null); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 28 */     if (paramObject instanceof b2)
/*    */     
/*    */     { 
/* 31 */       b2 b21 = (b2)paramObject; return a(b21.d, 0, b21.size()); }  if (paramObject instanceof bw) { bw bw1 = (bw)paramObject; return a(bw1.a(), bw1.d, bw1.e); }
/* 32 */      return super.equals(paramObject); } boolean a(Object[] paramArrayOfObject, int paramInt1, int paramInt2) { try { if (this.g.d == paramArrayOfObject)
/*    */         try { if (this.d == paramInt1)
/*    */             try { if (this.e == paramInt2)
/*    */                 return true;  } catch (v v) { throw b(null); }   } catch (v v) { throw b(null); }   }
/*    */     catch (v v) { throw b(null); }
/* 37 */      try { if (paramInt2 - paramInt1 != size())
/*    */         return false;  } catch (v v) { throw b(null); }  int i = this.d, j = paramInt1; while (i < this.e) { if (!Objects.equals(this.g.d[i++], paramArrayOfObject[j++]))
/* 39 */         return false;  }  return true; } int a(Object[] paramArrayOfObject, int paramInt1, int paramInt2) { int i = this.d, j = paramInt1; while (true) { try { if (i < this.e && i < paramInt2) { int k; Object object1 = this.g.d[i]; Object object2 = paramArrayOfObject[j]; }
/*    */          }
/*    */       catch (v v)
/*    */       { throw b(null); }
/*    */       
/*    */       break; }
/*    */     
/*    */     try {
/*    */       try {
/*    */       
/*    */       } catch (v v) {
/*    */         throw b(null);
/*    */       } 
/*    */     } catch (v v) {
/*    */       throw b(null);
/*    */     } 
/*    */     return (i < paramInt2) ? -1 : ((i < this.e) ? 1 : 0); }
/*    */ 
/*    */   
/*    */   public ae a() {
/*    */     return new e7(this);
/*    */   }
/*    */   
/*    */   public Spliterator spliterator() {
/*    */     return a();
/*    */   }
/*    */   
/*    */   public ListIterator listIterator(int paramInt) {
/*    */     return a(paramInt);
/*    */   }
/*    */   
/*    */   public int compareTo(Object paramObject) {
/*    */     return a((List)paramObject);
/*    */   }
/*    */   
/*    */   protected bw(b2 paramb2, int paramInt1, int paramInt2) {
/*    */     super(paramb2, paramInt1, paramInt2);
/*    */   }
/*    */   
/*    */   public int a(List paramList) {
/*    */     if (paramList instanceof b2) {
/*    */       b2 b21 = (b2)paramList;
/*    */       return a(b21.d, 0, b21.size());
/*    */     } 
/*    */     if (paramList instanceof bw) {
/*    */       bw bw1 = (bw)paramList;
/*    */       return a(bw1.a(), bw1.d, bw1.e);
/*    */     } 
/*    */     return super.a(paramList);
/*    */   }
/*    */   
/*    */   private static v b(v paramv) {
/*    */     return paramv;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\bw.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */