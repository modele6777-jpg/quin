package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ao7 implements k7f, e8f, um7 {
    public final Object a;
    public final lw7 b;
    public final String c;
    public final io7 d;
    public final c8f e;
    public volatile List f;

    /* JADX WARN: Illegal instructions before constructor call */
    public ao7(bo7 bo7Var, c8f c8fVar) {
        io7 io7Var;
        bo7Var.getClass();
        String strB = c8fVar.getName().b();
        strB.getClass();
        dsf dsfVarX = c8fVar.x();
        dsfVarX.getClass();
        int iOrdinal = dsfVarX.ordinal();
        if (iOrdinal == 0) {
            io7Var = io7.a;
        } else if (iOrdinal == 1) {
            io7Var = io7.b;
        } else {
            if (iOrdinal != 2) {
                ap.c();
                throw null;
            }
            io7Var = io7.c;
        }
        c8fVar.s();
        this(c8fVar, bo7Var, strB, io7Var);
        List upperBounds = c8fVar.getUpperBounds();
        upperBounds.getClass();
        ArrayList arrayList = new ArrayList(t72.u(upperBounds, 10));
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(new zy3((tt7) it.next(), 0));
        }
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ao7)) {
            return false;
        }
        ao7 ao7Var = (ao7) obj;
        return pa7.t(this.c, ao7Var.c) && this.a.equals(ao7Var.a);
    }

    public final List getUpperBounds() {
        List list = this.f;
        if (list != null) {
            return list;
        }
        pa7.g0("upperBounds");
        throw null;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int iOrdinal = this.d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                sb.append("in ");
            } else {
                if (iOrdinal != 2) {
                    ap.c();
                    return null;
                }
                sb.append("out ");
            }
        }
        sb.append(this.c);
        return sb.toString();
    }

    public ao7(c8f c8fVar, bo7 bo7Var, String str, io7 io7Var) {
        bo7Var.getClass();
        this.a = bo7Var;
        this.b = eb3.N(z18.b, new zv6(6, this));
        this.c = str;
        this.d = io7Var;
        this.e = c8fVar;
    }
}
