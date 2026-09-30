package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b37 implements lw7, Serializable {
    private final Object value;

    public b37(Object obj) {
        this.value = obj;
    }

    @Override // defpackage.lw7
    public final boolean b() {
        return true;
    }

    @Override // defpackage.lw7
    public final Object getValue() {
        return this.value;
    }

    public final String toString() {
        return String.valueOf(this.value);
    }
}
