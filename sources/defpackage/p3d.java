package defpackage;

import android.util.Size;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class p3d extends gs5 {
    public final Object d;
    public final vv6 e;
    public final int f;
    public final int g;

    public p3d(iw6 iw6Var, Size size, vv6 vv6Var) {
        super(iw6Var);
        this.d = new Object();
        if (size == null) {
            this.f = this.b.d();
            this.g = this.b.c();
        } else {
            this.f = size.getWidth();
            this.g = size.getHeight();
        }
        this.e = vv6Var;
    }

    @Override // defpackage.gs5, defpackage.iw6
    public final int c() {
        return this.g;
    }

    @Override // defpackage.gs5, defpackage.iw6
    public final int d() {
        return this.f;
    }

    @Override // defpackage.gs5, defpackage.iw6
    public final vv6 u0() {
        return this.e;
    }
}
