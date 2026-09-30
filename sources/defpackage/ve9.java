package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ve9 implements bp1 {
    public final i8f a;
    public x16 b;
    public final ve9 c;
    public final c8f d;
    public final lw7 e;

    public ve9(i8f i8fVar, x16 x16Var, ve9 ve9Var, c8f c8fVar) {
        i8fVar.getClass();
        this.a = i8fVar;
        this.b = x16Var;
        this.c = ve9Var;
        this.d = c8fVar;
        this.e = eb3.N(z18.b, new wj7(13, this));
    }

    @Override // defpackage.j7f
    public final Collection e() {
        List list = (List) this.e.getValue();
        return list == null ? pu4.a : list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ve9.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        ve9 ve9Var = (ve9) obj;
        ve9 ve9Var2 = this.c;
        if (ve9Var2 != null) {
            this = ve9Var2;
        }
        ve9 ve9Var3 = ve9Var.c;
        if (ve9Var3 != null) {
            obj = ve9Var3;
        }
        return this == obj;
    }

    @Override // defpackage.j7f
    public final xr7 f() {
        tt7 tt7VarB = this.a.b();
        tt7VarB.getClass();
        return o7c.p(tt7VarB);
    }

    @Override // defpackage.j7f
    public final List getParameters() {
        return pu4.a;
    }

    public final int hashCode() {
        ve9 ve9Var = this.c;
        return ve9Var != null ? ve9Var.hashCode() : super.hashCode();
    }

    @Override // defpackage.j7f
    public final y22 m() {
        return null;
    }

    @Override // defpackage.j7f
    public final boolean t() {
        return false;
    }

    public final String toString() {
        return "CapturedType(" + this.a + ')';
    }

    @Override // defpackage.bp1
    public final i8f u() {
        return this.a;
    }

    public /* synthetic */ ve9(i8f i8fVar, yz3 yz3Var, c8f c8fVar, int i) {
        this(i8fVar, (i & 2) != 0 ? null : yz3Var, (ve9) null, (i & 8) != 0 ? null : c8fVar);
    }
}
