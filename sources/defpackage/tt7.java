package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class tt7 implements f00, xt7 {
    public int a;

    public abstract dr8 F();

    public abstract List Z();

    public abstract e7f a0();

    public abstract j7f c0();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tt7)) {
            return false;
        }
        tt7 tt7Var = (tt7) obj;
        if (i0() == tt7Var.i0()) {
            return vd0.w0(qfc.d, k0(), tt7Var.k0());
        }
        return false;
    }

    @Override // defpackage.f00
    public final h10 getAnnotations() {
        return l10.a(a0());
    }

    public final int hashCode() {
        int iHashCode;
        int i = this.a;
        if (i != 0) {
            return i;
        }
        if (i7h.x(this)) {
            iHashCode = super.hashCode();
        } else {
            iHashCode = (i0() ? 1 : 0) + ((Z().hashCode() + (c0().hashCode() * 31)) * 31);
        }
        this.a = iHashCode;
        return iHashCode;
    }

    public abstract boolean i0();

    public abstract tt7 j0(zt7 zt7Var);

    public abstract jgf k0();
}
