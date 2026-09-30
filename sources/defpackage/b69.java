package defpackage;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b69 implements u8e, Serializable {
    private final int expectedValuesPerKey;

    public b69() {
        ynb.D(2, "expectedValuesPerKey");
        this.expectedValuesPerKey = 2;
    }

    @Override // defpackage.u8e
    public final Object get() {
        return new ArrayList(this.expectedValuesPerKey);
    }
}
