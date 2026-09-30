package defpackage;

import android.graphics.Canvas;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mp {
    public static final Canvas a = new Canvas();

    public static final lp a(ks ksVar) {
        lp lpVar = new lp();
        lpVar.a = new Canvas(abg.o(ksVar));
        return lpVar;
    }

    public static final Canvas b(vl1 vl1Var) {
        vl1Var.getClass();
        return ((lp) vl1Var).a;
    }
}
