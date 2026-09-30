package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class dyg {
    protected transient int zza;

    public abstract void a(p90 p90Var);

    public final byte[] b() {
        try {
            int iD = d();
            byte[] bArr = new byte[iD];
            p90 p90Var = new p90(bArr, iD);
            a(p90Var);
            int i = p90Var.b;
            int i2 = p90Var.c;
            if (i - i2 > 0) {
                qc0.p("Did not write as much data as expected.");
            } else if (i - i2 < 0) {
                qc0.p("Wrote more data than expected.");
            }
            return bArr;
        } catch (IOException e) {
            cva.q(ib8.j("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }

    public abstract int c(s3h s3hVar);

    public abstract int d();
}
