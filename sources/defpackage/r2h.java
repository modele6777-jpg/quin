package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class r2h implements Comparable {
    public static int d(byte b) {
        return (b >> 5) & 7;
    }

    public static r2h e(byte... bArr) {
        bArr.getClass();
        w2h w2hVar = new w2h(new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length)));
        try {
            return gdc.o(w2hVar);
        } finally {
            try {
                w2hVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public abstract int a();

    public int b() {
        return 0;
    }

    public final r2h c(Class cls) throws o2h {
        if (cls.isInstance(this)) {
            return (r2h) cls.cast(this);
        }
        throw new o2h(ub3.k("Expected a ", cls.getName(), " value, but got ", getClass().getName()));
    }
}
