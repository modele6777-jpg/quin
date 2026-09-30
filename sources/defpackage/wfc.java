package defpackage;

import com.google.firebase.perf.metrics.Trace;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class wfc {
    public static final ct a = ct.d();

    public static void a(Trace trace, wy5 wy5Var) {
        int i = wy5Var.a;
        int i2 = wy5Var.c;
        int i3 = wy5Var.b;
        if (i > 0) {
            trace.putMetric(cl2.FRAMES_TOTAL.toString(), i);
        }
        if (i3 > 0) {
            trace.putMetric(cl2.FRAMES_SLOW.toString(), i3);
        }
        if (i2 > 0) {
            trace.putMetric(cl2.FRAMES_FROZEN.toString(), i2);
        }
        a.a("Screen trace: " + trace.d + " _fr_tot:" + i + " _fr_slo:" + i3 + " _fr_fzn:" + i2);
    }
}
