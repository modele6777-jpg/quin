package defpackage;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jh1 {
    public static final wh0 a = vpf.n(0);

    public static final hh1 a(dh1 dh1Var) {
        try {
            Trace.beginSection("CameraPipe");
            return new hh1(new r23(new m6c(7, dh1Var), new sug(dh1Var.b)));
        } finally {
            Trace.endSection();
        }
    }
}
