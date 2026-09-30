package defpackage;

import android.content.Context;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qbb {
    public final ji2 a;
    public final double b;
    public final double c;
    public final pbb d;
    public final pbb e;

    public qbb(Context context, ip3 ip3Var) {
        i8c i8cVar = new i8c(18);
        double dNextDouble = new Random().nextDouble();
        double dNextDouble2 = new Random().nextDouble();
        ji2 ji2VarE = ji2.e();
        this.d = null;
        this.e = null;
        boolean z = false;
        if (!(0.0d <= dNextDouble && dNextDouble < 1.0d)) {
            qc0.j("Sampling bucket ID should be in range [0.0, 1.0).");
            throw null;
        }
        if (0.0d <= dNextDouble2 && dNextDouble2 < 1.0d) {
            z = true;
        }
        if (!z) {
            qc0.j("Fragment sampling bucket ID should be in range [0.0, 1.0).");
            throw null;
        }
        this.b = dNextDouble;
        this.c = dNextDouble2;
        this.a = ji2VarE;
        this.d = new pbb(ip3Var, i8cVar, ji2VarE, "Trace");
        this.e = new pbb(ip3Var, i8cVar, ji2VarE, "Network");
        jzb.l(context);
    }

    public static boolean a(n87 n87Var) {
        return n87Var.size() > 0 && ((m8a) n87Var.get(0)).t() > 0 && ((m8a) n87Var.get(0)).s() == j1d.GAUGES_AND_SYSTEM_EVENTS;
    }
}
