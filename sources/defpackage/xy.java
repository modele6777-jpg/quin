package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xy implements mm3 {
    public final boolean a;

    public xy() {
        this.a = Build.VERSION.SDK_INT < 34;
    }

    @Override // defpackage.mm3
    public final nm3 a(otd otdVar, as9 as9Var) {
        v41 v41VarP0 = otdVar.a.P0();
        if (!v41VarP0.I(0L, lm3.b) && !v41VarP0.I(0L, lm3.a) && (!v41VarP0.I(0L, lm3.c) || !v41VarP0.I(8L, lm3.d) || !v41VarP0.I(12L, lm3.e) || !v41VarP0.request(21L) || ((byte) (v41VarP0.i().G(20L) & 2)) <= 0)) {
            if (Build.VERSION.SDK_INT < 30 || !v41VarP0.I(4L, lm3.f)) {
                return null;
            }
            if (!v41VarP0.I(8L, lm3.g) && !v41VarP0.I(8L, lm3.h) && !v41VarP0.I(8L, lm3.i)) {
                return null;
            }
        }
        return new cz(otdVar.a, as9Var, this.a);
    }
}
