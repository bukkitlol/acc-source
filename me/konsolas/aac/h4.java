/*    */ package me.konsolas.aac;public class h4 implements c6, Serializable { private static final long serialVersionUID = -7046029254386353129L; protected final c6 b; protected final Object a;
/*  2 */   public boolean g(int paramInt) { synchronized (this.a) { return this.b.g(paramInt); }
/*  3 */      } public boolean equals(Object paramObject) { try { if (paramObject == this) return true;  } catch (NullPointerException nullPointerException) { throw a(null); }
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
/* 17 */     synchronized (this.a) { return this.b.equals(paramObject); }  }
/* 18 */   @Deprecated public Object remove(Object paramObject) { synchronized (this.a) { return this.b.remove(paramObject); }  } @Deprecated public Object a(Integer paramInteger) { synchronized (this.a) { return this.b.apply(paramInteger); }  } protected h4(c6 paramc6, Object paramObject) { if (paramc6 == null) throw new NullPointerException();  this.b = paramc6; this.a = paramObject; } @Deprecated public Object apply(Object paramObject) { return a((Integer)paramObject); } public Object b(int paramInt, Object paramObject) { synchronized (this.a) { return this.b.b(paramInt, paramObject); }  }
/* 19 */   @Deprecated public Object get(Object paramObject) { synchronized (this.a) { return this.b.get(paramObject); }  } public Object i() { synchronized (this.a) { return this.b.i(); }  } public void i(Object paramObject) { synchronized (this.a) { this.b.i(paramObject); }  } public int hashCode() { synchronized (this.a) { return this.b.hashCode(); }  } protected h4(c6 paramc6) { if (paramc6 == null) throw new NullPointerException(); 
/*    */     this.b = paramc6;
/* 21 */     this.a = this; } public Object apply(int paramInt) { synchronized (this.a) { return this.b.apply(paramInt); }
/* 22 */      } public Object a(int paramInt) { synchronized (this.a) { return this.b.a(paramInt); }
/* 23 */      } private void writeObject(ObjectOutputStream paramObjectOutputStream) { synchronized (this.a) { paramObjectOutputStream.defaultWriteObject(); }
/* 24 */      } @Deprecated public Object put(Object paramObject1, Object paramObject2) { return a((Integer)paramObject1, paramObject2); }
/* 25 */   public String toString() { synchronized (this.a) { return this.b.toString(); }
/* 26 */      } public void clear() { synchronized (this.a) { this.b.clear(); }
/* 27 */      } @Deprecated public Object getOrDefault(Object paramObject1, Object paramObject2) { synchronized (this.a) { return this.b.getOrDefault(paramObject1, paramObject2); }
/* 28 */      } @Deprecated public Object a(Integer paramInteger, Object paramObject) { synchronized (this.a) { return this.b.a(paramInteger, paramObject); }
/* 29 */      } @Deprecated public boolean containsKey(Object paramObject) { synchronized (this.a) { return this.b.containsKey(paramObject); }
/* 30 */      } public Object b(int paramInt) { synchronized (this.a) { return this.b.b(paramInt); }
/*    */      }
/* 32 */   public int size() { synchronized (this.a) { return this.b.size(); }
/*    */      } public Object a(int paramInt, Object paramObject) {
/* 34 */     synchronized (this.a) { return this.b.a(paramInt, paramObject); }
/*    */   
/*    */   }
/*    */   
/*    */   private static NullPointerException a(NullPointerException paramNullPointerException) {
/*    */     return paramNullPointerException;
/*    */   } }


/* Location:              C:\Users\BukkitBypass\Desktop\MatrixAC\AAC\AAC-spigot-5.2.0.jar!\me\konsolas\aac\h4.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */