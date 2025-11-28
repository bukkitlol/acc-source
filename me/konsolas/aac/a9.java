/*  1 */ package me.konsolas.aac;final class a9 extends aw { final i7 b; public Iterator iterator() { return b(); }
/*    */ 
/*    */   
/*  4 */   public void clear() { this.b.clear(); }
/*    */   public boolean c(int paramInt) { try {  } catch (v v) { throw a(null); }
/*  6 */      return (i7.a(this.b, paramInt) != -1); } public void a(IntConsumer paramIntConsumer) { byte b = 0; int i = i7.a(this.b); try { while (b < i)
/*    */       
/*  8 */       { paramIntConsumer.accept(i7.a(this.b)[b]);
/*    */ 
/*    */ 
/*    */         
/* 12 */         b++; }  } catch (v v) { throw a(null); }
/* 13 */      } public int size() { return i7.a(this.b); }
/* 14 */   public fK b() { return new b_(this, 0, i7.a(this.b)); }
/* 15 */   public boolean d(int paramInt) { int i = i7.a(this.b, paramInt); try { if (i == -1)
/*    */         return false;  } catch (v v) { throw a(null); }
/* 17 */      int j = i7.a(this.b) - i - 1; System.arraycopy(i7.a(this.b), i + 1, i7.a(this.b), i, j); System.arraycopy(i7.a(this.b), i + 1, i7.a(this.b), i, j); i7.b(this.b);
/*    */ 
/*    */ 
/*    */     
/* 21 */     i7.a(this.b)[i7.a(this.b)] = null;
/* 22 */     return true; } private a9(i7 parami7) {} public Spliterator spliterator() { return b(); }
/*    */ 
/*    */   
/*    */   a9(i7 parami7, kI paramkI) {
/*    */     this(parami7);
/*    */   }
/*    */   
/*    */   public cA b() {
/*    */     return new mH(this);
/*    */   }
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\a9.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */