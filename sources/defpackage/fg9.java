package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class fg9 extends n1 implements dg7 {
    public static final fg9 b = new fg9(ndb.Y0);

    @Override // defpackage.dg7
    public final lqb C0() {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.dg7
    public final ta4 E(a26 a26Var) {
        return hg9.a;
    }

    @Override // defpackage.dg7
    public final boolean L0() {
        return false;
    }

    @Override // defpackage.dg7
    public final CancellationException N() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.dg7
    public final Object U0(zn2 zn2Var) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.dg7
    public final boolean b() {
        return true;
    }

    @Override // defpackage.dg7
    public final ta4 h0(boolean z, boolean z2, uj3 uj3Var) {
        return hg9.a;
    }

    @Override // defpackage.dg7
    public final boolean isCancelled() {
        return false;
    }

    @Override // defpackage.dg7
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.dg7
    public final xy1 x(rg7 rg7Var) {
        return hg9.a;
    }

    @Override // defpackage.dg7
    public final void h(CancellationException cancellationException) {
    }
}
