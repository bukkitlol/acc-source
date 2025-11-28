/*  1 */ package me.konsolas.aac;final class bv extends bS implements kl { bv(i7 parami7, kI paramkI) { this(parami7); } final i7 b; public Spliterator spliterator() {
/*  2 */     return a(); } public void forEach(Consumer<h2> paramConsumer) {
/*  3 */     byte b = 0; int i = i7.a(this.b); try { while (b < i)
/*    */       
/*    */       { 
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
/* 28 */         paramConsumer.accept(new h2(i7.a(this.b)[b], i7.a(this.b)[b]));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 37 */         b++; }  } catch (v v) { throw b(null); }
/*    */   
/*    */   }
/*    */   
/*    */   public ae a() {
/*    */     return new eL(this, 0, i7.a(this.b));
/*    */   }
/*    */   
/*    */   public boolean contains(Object paramObject) {
/*    */     try {
/*    */       if (!(paramObject instanceof Map.Entry))
/*    */         return false; 
/*    */     } catch (v v) {
/*    */       throw b(null);
/*    */     } 
/*    */     Map.Entry entry = (Map.Entry)paramObject;
/*    */     try {
/*    */       if (entry.getKey() != null) {
/*    */         try {
/*    */           if (!(entry.getKey() instanceof Integer))
/*    */             return false; 
/*    */         } catch (v v) {
/*    */           throw b(null);
/*    */         } 
/*    */       } else {
/*    */         return false;
/*    */       } 
/*    */     } catch (v v) {
/*    */       throw b(null);
/*    */     } 
/*    */     int i = ((Integer)entry.getKey()).intValue();
/*    */     try {
/*    */       if (this.b.g(i))
/*    */         try {
/*    */           if (Objects.equals(this.b.a(i), entry.getValue()));
/*    */         } catch (v v) {
/*    */           throw b(null);
/*    */         }  
/*    */     } catch (v v) {
/*    */       throw b(null);
/*    */     } 
/*    */     return false;
/*    */   }
/*    */   
/*    */   public int size() {
/*    */     return i7.a(this.b);
/*    */   }
/*    */   
/*    */   public void a(Consumer<h2> paramConsumer) {
/*    */     h2 h2 = new h2();
/*    */     byte b = 0;
/*    */     int i = i7.a(this.b);
/*    */     try {
/*    */       while (b < i) {
/*    */         h2.b = i7.a(this.b)[b];
/*    */         h2.a = i7.a(this.b)[b];
/*    */         paramConsumer.accept(h2);
/*    */         b++;
/*    */       } 
/*    */     } catch (v v) {
/*    */       throw b(null);
/*    */     } 
/*    */   }
/*    */   
/*    */   public boolean remove(Object paramObject) {
/*    */     try {
/*    */       if (!(paramObject instanceof Map.Entry))
/*    */         return false; 
/*    */     } catch (v v) {
/*    */       throw b(null);
/*    */     } 
/*    */     Map.Entry entry = (Map.Entry)paramObject;
/*    */     try {
/*    */       if (entry.getKey() != null) {
/*    */         try {
/*    */           if (!(entry.getKey() instanceof Integer))
/*    */             return false; 
/*    */         } catch (v v) {
/*    */           throw b(null);
/*    */         } 
/*    */       } else {
/*    */         return false;
/*    */       } 
/*    */     } catch (v v) {
/*    */       throw b(null);
/*    */     } 
/*    */     int i = ((Integer)entry.getKey()).intValue();
/*    */     Object object = entry.getValue();
/*    */     int j = i7.a(this.b, i);
/*    */     try {
/*    */       if (j != -1)
/*    */         try {
/*    */           if (Objects.equals(object, i7.a(this.b)[j])) {
/*    */             int k = i7.a(this.b) - j - 1;
/*    */             System.arraycopy(i7.a(this.b), j + 1, i7.a(this.b), j, k);
/*    */             System.arraycopy(i7.a(this.b), j + 1, i7.a(this.b), j, k);
/*    */             i7.b(this.b);
/*    */             i7.a(this.b)[i7.a(this.b)] = null;
/*    */             return true;
/*    */           } 
/*    */           return false;
/*    */         } catch (v v) {
/*    */           throw b(null);
/*    */         }  
/*    */     } catch (v v) {
/*    */       throw b(null);
/*    */     } 
/*    */     return false;
/*    */   }
/*    */   
/*    */   public ea a() {
/*    */     return new bA(this);
/*    */   }
/*    */   
/*    */   private bv(i7 parami7) {}
/*    */   
/*    */   public Iterator iterator() {
/*    */     return b();
/*    */   }
/*    */   
/*    */   public ea b() {
/*    */     return new cY(this);
/*    */   }
/*    */   
/*    */   private static v b(v paramv) {
/*    */     return paramv;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\bv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */