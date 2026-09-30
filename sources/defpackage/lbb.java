package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class lbb extends mbb implements Serializable {
    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return kbb.a;
    }

    @Override // defpackage.mbb
    public final int a(int i) {
        return mbb.b.a(i);
    }

    @Override // defpackage.mbb
    public final float b() {
        throw null;
    }

    @Override // defpackage.mbb
    public final int c() {
        return mbb.b.c();
    }

    @Override // defpackage.mbb
    public final int d(int i, int i2) {
        return mbb.b.d(0, i2);
    }

    @Override // defpackage.mbb
    public final long e() {
        return mbb.b.e();
    }

    @Override // defpackage.mbb
    public final long g() {
        throw null;
    }
}
