package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class qlg {
    protected transient int zza;

    public final byte[] a() {
        try {
            omg omgVar = (omg) this;
            int iK = omgVar.k();
            byte[] bArr = new byte[iK];
            boolean z = gmg.b;
            bmg bmgVar = new bmg(bArr, iK);
            omgVar.d(bmgVar);
            if (bmgVar.x() > 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            if (bmgVar.x() >= 0) {
                return bArr;
            }
            throw new IllegalStateException("Wrote more data than expected.");
        } catch (IOException e) {
            String name = getClass().getName();
            cva.q(ib8.m(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }

    public abstract int b(yng yngVar);
}
