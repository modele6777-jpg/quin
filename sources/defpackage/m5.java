package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class m5 implements j7f {
    public int a;
    public final ae8 b;

    public m5(ge8 ge8Var) {
        ge8Var.getClass();
        this.b = new ae8(ge8Var, new j5(1, this), new x(5, this));
    }

    public abstract Collection a();

    public abstract tt7 b();

    public abstract m8c c();

    @Override // defpackage.j7f
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final List e() {
        return ((l5) this.b.invoke()).b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof j7f) && obj.hashCode() == hashCode()) {
            j7f j7fVar = (j7f) obj;
            if (j7fVar.getParameters().size() == getParameters().size()) {
                y22 y22VarM = m();
                y22 y22VarM2 = j7fVar.m();
                if (y22VarM2 == null || sy4.f(y22VarM) || oz3.m(y22VarM) || sy4.f(y22VarM2) || oz3.m(y22VarM2)) {
                    return false;
                }
                return g(y22VarM2);
            }
        }
        return false;
    }

    public abstract boolean g(y22 y22Var);

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        y22 y22VarM = m();
        int iIdentityHashCode = (sy4.f(y22VarM) || oz3.m(y22VarM)) ? System.identityHashCode(this) : oz3.f(y22VarM).a.hashCode();
        this.a = iIdentityHashCode;
        return iIdentityHashCode;
    }

    public List h(List list) {
        return list;
    }
}
