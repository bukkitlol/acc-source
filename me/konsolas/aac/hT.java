/*    */ package me.konsolas.aac;
/*    */ public class ht implements c6 { protected final Function a;
/*    */   public Object a(int paramInt, Object paramObject) {
/*    */     Object object = this.a.apply(Integer.valueOf(paramInt));
/*    */     try {
/*    */       if (object == null)
/*    */         return paramObject; 
/*    */     } catch (UnsupportedOperationException unsupportedOperationException) {
/*    */       throw a(null);
/*    */     } 
/*    */     return object;
/*    */   }
/*    */   
/* 14 */   protected ht(Function paramFunction) { this.a = paramFunction; }
/*    */   public boolean g(int paramInt) { try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return (this.a.apply(Integer.valueOf(paramInt)) != null); }
/* 16 */   @Deprecated public Object getOrDefault(Object paramObject1, Object paramObject2) { try { if (paramObject1 == null) return paramObject2;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  Object object; return ((object = this.a.apply((Integer)paramObject1)) == null) ? paramObject2 : object; } @Deprecated public Object a(Integer paramInteger, Object paramObject) { throw new UnsupportedOperationException(); } @Deprecated public boolean containsKey(Object paramObject) { try { if (paramObject == null) return false;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  try {  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }  return (this.a.apply(paramObject) != null); } public Object a(int paramInt) { Object object = this.a.apply(Integer.valueOf(paramInt)); try { if (object == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/* 17 */      return object; } @Deprecated public Object get(Object paramObject) { try { if (paramObject == null) return null;  } catch (UnsupportedOperationException unsupportedOperationException) { throw a(null); }
/* 18 */      return this.a.apply(paramObject); } @Deprecated public Object put(Object paramObject1, Object paramObject2) { return a((Integer)paramObject1, paramObject2); }
/*    */ 
/*    */   
/*    */   private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
/*    */     return paramUnsupportedOperationException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\ht.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */