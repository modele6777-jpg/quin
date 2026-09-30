package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jn2 implements nyc {
    public final pyc a;
    public final em7 b;
    public final String c;

    public jn2(pyc pycVar, em7 em7Var) {
        em7Var.getClass();
        this.a = pycVar;
        this.b = em7Var;
        this.c = pycVar.a + '<' + em7Var.r() + '>';
    }

    @Override // defpackage.nyc
    public final String a() {
        return this.c;
    }

    @Override // defpackage.nyc
    public final boolean c() {
        return false;
    }

    @Override // defpackage.nyc
    public final int d(String str) {
        str.getClass();
        return this.a.d(str);
    }

    @Override // defpackage.nyc
    public final int e() {
        return this.a.c;
    }

    public final boolean equals(Object obj) {
        jn2 jn2Var = obj instanceof jn2 ? (jn2) obj : null;
        return jn2Var != null && this.a.equals(jn2Var.a) && pa7.t(jn2Var.b, this.b);
    }

    @Override // defpackage.nyc
    public final String f(int i) {
        return this.a.f[i];
    }

    @Override // defpackage.nyc
    public final iec g() {
        return this.a.b;
    }

    @Override // defpackage.nyc
    public final List getAnnotations() {
        return this.a.d;
    }

    @Override // defpackage.nyc
    public final List h(int i) {
        return this.a.h[i];
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // defpackage.nyc
    public final nyc i(int i) {
        return this.a.g[i];
    }

    @Override // defpackage.nyc
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.nyc
    public final boolean j(int i) {
        return this.a.i[i];
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.b + ", original: " + this.a + ')';
    }
}
