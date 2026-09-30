package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class gu7 implements w26, Serializable {
    private final int arity;

    public gu7(int i) {
        this.arity = i;
    }

    @Override // defpackage.w26
    public final int getArity() {
        return this.arity;
    }

    public final String toString() {
        String strK = job.a.k(this);
        strK.getClass();
        return strK;
    }
}
