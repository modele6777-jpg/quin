package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class dxg {
    public static final dxg b;
    public static final dxg c;
    public final Throwable a;

    static {
        if (bbh.d) {
            c = null;
            b = null;
        } else {
            c = new dxg(null);
            b = new dxg(null);
        }
    }

    public dxg(CancellationException cancellationException) {
        this.a = cancellationException;
    }
}
