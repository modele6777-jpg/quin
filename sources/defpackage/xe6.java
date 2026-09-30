package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xe6 implements ze6 {
    @Override // defpackage.ze6
    public final ArrayList a(sw3 sw3Var, int i, int i2) {
        return an1.l(i, Math.max((i + i2) / (sw3Var.D0(108.0f) + i2), 1), i2);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof xe6) && yi4.b(108.0f, 108.0f);
    }

    public final int hashCode() {
        return Float.hashCode(108.0f);
    }
}
