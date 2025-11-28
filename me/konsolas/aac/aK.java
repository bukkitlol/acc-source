/*    */ package me.konsolas.aac;public class ak extends RecursiveAction { private static final long serialVersionUID = 1L; private final long c;
/*    */   
/*    */   protected void compute() {
/*  4 */     byte[][] arrayOfByte = this.a;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 14 */     long l1 = this.b - this.c;
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
/*    */     try {
/* 32 */       if (l1 < 8192L) {
/*    */         fd.a(arrayOfByte, this.c, this.b);
/*    */         return;
/*    */       } 
/*    */     } catch (v v) {
/* 37 */       throw a(null);
/* 38 */     }  long l2 = this.c + l1 / 2L; long l3 = this.c; long l4 = this.b - 1L; long l5 = l1 / 8L; l3 = fd.a(arrayOfByte, l3, l3 + l5, l3 + 2L * l5); l2 = fd.a(arrayOfByte, l2 - l5, l2, l2 + l5); l4 = fd.a(arrayOfByte, l4 - 2L * l5, l4 - l5, l4); l2 = fd.a(arrayOfByte, l3, l2, l4); byte b = k.a(arrayOfByte, l2);
/*    */     long l6 = this.c, l7 = l6, l8 = this.b - 1L, l9 = l8;
/*    */     while (l7 <= l8) {
/*    */       int i;
/*    */       try {
/*    */         if ((i = Byte.compare(k.a(arrayOfByte, l7), b)) <= 0) {
/*    */           if (i == 0)
/*    */             k.b(arrayOfByte, l6++, l7); 
/*    */           l7++;
/*    */         } 
/*    */       } catch (v v) {
/*    */         throw a(null);
/*    */       } 
/*    */     } 
/*    */     while (l8 >= l7) {
/*    */       int i;
/*    */       try {
/*    */         if ((i = Byte.compare(k.a(arrayOfByte, l8), b)) >= 0) {
/*    */           if (i == 0)
/*    */             k.b(arrayOfByte, l8, l9--); 
/*    */           l8--;
/*    */         } 
/*    */       } catch (v v) {
/*    */         throw a(null);
/*    */       } 
/*    */     } 
/*    */     try {
/*    */       if (l7 > l8) {
/*    */         l5 = Math.min(l6 - this.c, l7 - l6);
/*    */         fd.b(arrayOfByte, this.c, l7 - l5, l5);
/*    */         l5 = Math.min(l9 - l8, this.b - l9 - 1L);
/*    */         fd.b(arrayOfByte, l7, this.b - l5, l5);
/*    */       } 
/*    */     } catch (v v) {
/*    */       throw a(null);
/*    */     } 
/*    */     k.b(arrayOfByte, l7++, l8--);
/*    */   }
/*    */   
/*    */   private final long b;
/*    */   private final byte[][] a;
/*    */   
/*    */   private static v a(v paramv) {
/*    */     return paramv;
/*    */   }
/*    */   
/*    */   public ak(byte[][] paramArrayOfbyte, long paramLong1, long paramLong2) {
/*    */     this.c = paramLong1;
/*    */     this.b = paramLong2;
/*    */     this.a = paramArrayOfbyte;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ak.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */