package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class z9a extends p3 implements Collection, an7 {
    public y9a a;
    public Object b;
    public Object c;
    public final z8a d;

    public z9a(y9a y9aVar) {
        this.a = y9aVar;
        this.b = y9aVar.a;
        this.c = y9aVar.b;
        this.d = y9aVar.c.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        z8a z8aVar = this.d;
        if (z8aVar.containsKey(obj)) {
            return false;
        }
        if (isEmpty()) {
            this.b = obj;
            this.c = obj;
            z8aVar.put(obj, new w68());
            return true;
        }
        V v = z8aVar.get(this.c);
        v.getClass();
        z8aVar.put(this.c, new w68(((w68) v).a, obj));
        z8aVar.put(obj, new w68(this.c));
        this.c = obj;
        return true;
    }

    @Override // defpackage.p3
    public final int c() {
        return this.d.d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.d.clear();
        af8 af8Var = af8.y;
        this.b = af8Var;
        this.c = af8Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.containsKey(obj);
    }

    public final y9a d() {
        w8a w8aVarG = this.d.g();
        y9a y9aVar = this.a;
        if (w8aVarG != y9aVar.c) {
            y9aVar = new y9a(this.b, this.c, w8aVarG);
        }
        this.a = y9aVar;
        return y9aVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new aaa(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        z8a z8aVar = this.d;
        w68 w68Var = (w68) z8aVar.remove(obj);
        if (w68Var == null) {
            return false;
        }
        Object obj2 = w68Var.b;
        Object obj3 = w68Var.a;
        af8 af8Var = af8.y;
        if (obj3 != af8Var) {
            V v = z8aVar.get(obj3);
            v.getClass();
            z8aVar.put(obj3, new w68(((w68) v).a, obj2));
        } else {
            this.b = obj2;
        }
        if (obj2 == af8Var) {
            this.c = obj3;
            return true;
        }
        V v2 = z8aVar.get(obj2);
        v2.getClass();
        z8aVar.put(obj2, new w68(obj3, ((w68) v2).b));
        return true;
    }
}
