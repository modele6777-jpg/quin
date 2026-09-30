package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hua implements nyc {
    public final String a;
    public final fua b;

    public hua(String str, fua fuaVar) {
        fuaVar.getClass();
        this.a = str;
        this.b = fuaVar;
    }

    @Override // defpackage.nyc
    public final String a() {
        return this.a;
    }

    public final void b() {
        throw new IllegalStateException(ks0.l(new StringBuilder("Primitive descriptor "), this.a, " does not have elements"));
    }

    @Override // defpackage.nyc
    public final int d(String str) {
        str.getClass();
        b();
        throw null;
    }

    @Override // defpackage.nyc
    public final int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hua)) {
            return false;
        }
        hua huaVar = (hua) obj;
        return this.a.equals(huaVar.a) && pa7.t(this.b, huaVar.b);
    }

    @Override // defpackage.nyc
    public final String f(int i) {
        b();
        throw null;
    }

    @Override // defpackage.nyc
    public final iec g() {
        return this.b;
    }

    @Override // defpackage.nyc
    public final List h(int i) {
        b();
        throw null;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // defpackage.nyc
    public final nyc i(int i) {
        b();
        throw null;
    }

    @Override // defpackage.nyc
    public final boolean j(int i) {
        b();
        throw null;
    }

    public final String toString() {
        return ub3.l(new StringBuilder("PrimitiveDescriptor("), this.a, ')');
    }
}
