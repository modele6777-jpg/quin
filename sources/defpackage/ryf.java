package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ryf implements Serializable {
    private final int firstVisibleItemIndex;
    private final int firstVisibleItemScrollOffset;

    public ryf(int i, int i2) {
        this.firstVisibleItemIndex = i;
        this.firstVisibleItemScrollOffset = i2;
    }

    public final int a() {
        return this.firstVisibleItemIndex;
    }

    public final int b() {
        return this.firstVisibleItemScrollOffset;
    }
}
