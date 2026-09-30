package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y9a extends a5 implements sy6, Collection, zm7 {
    public static final y9a d;
    public final Object a;
    public final Object b;
    public final w8a c;

    static {
        af8 af8Var = af8.y;
        d = new y9a(af8Var, af8Var, w8a.c);
    }

    public y9a(Object obj, Object obj2, w8a w8aVar) {
        this.a = obj;
        this.b = obj2;
        this.c = w8aVar;
    }

    @Override // defpackage.d1
    public final int c() {
        return this.c.d();
    }

    @Override // defpackage.d1, java.util.Collection
    public final boolean contains(Object obj) {
        return this.c.containsKey(obj);
    }

    public final y9a d(Object obj) {
        w8a w8aVar = this.c;
        if (w8aVar.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            return new y9a(obj, obj, w8aVar.h(obj, new w68()));
        }
        Object obj2 = this.b;
        Object obj3 = w8aVar.get(obj2);
        obj3.getClass();
        return new y9a(this.a, obj, w8aVar.h(obj2, new w68(((w68) obj3).a, obj)).h(obj, new w68(obj2)));
    }

    public final y9a e(Object obj) {
        w8a w8aVarH = this.c;
        w68 w68Var = (w68) w8aVarH.get(obj);
        if (w68Var == null) {
            return this;
        }
        Object obj2 = w68Var.a;
        Object obj3 = w68Var.b;
        p4f p4fVar = w8aVarH.a;
        p4f p4fVarV = p4fVar.v(obj != null ? obj.hashCode() : 0, obj, 0);
        if (p4fVar != p4fVarV) {
            w8aVarH = p4fVarV == null ? w8a.c : new w8a(p4fVarV, w8aVarH.b - 1);
        }
        af8 af8Var = af8.y;
        if (obj2 != af8Var) {
            Object obj4 = w8aVarH.get(obj2);
            obj4.getClass();
            w8aVarH = w8aVarH.h(obj2, new w68(((w68) obj4).a, obj3));
        }
        if (obj3 != af8Var) {
            Object obj5 = w8aVarH.get(obj3);
            obj5.getClass();
            w8aVarH = w8aVarH.h(obj3, new w68(obj2, ((w68) obj5).b));
        }
        Object obj6 = obj2 != af8Var ? this.a : obj3;
        if (obj3 != af8Var) {
            obj2 = this.b;
        }
        return new y9a(obj6, obj2, w8aVarH);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new x9a(this.a, this.c, 1);
    }
}
