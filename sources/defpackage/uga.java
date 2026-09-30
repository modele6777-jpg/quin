package defpackage;

import android.util.SparseBooleanArray;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uga {
    public final pk1 a = new pk1(2);

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = {16, 17, 18, 21, 22, 23, 28, 30};
        for (int i = 0; i < 8; i++) {
            int i2 = iArr[i];
            pa7.J(!false);
            sparseBooleanArray.append(i2, true);
        }
        pa7.J(!false);
        SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
        int[] iArr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 19, 31, 20, 24, 25, 33, 26, 34, 35, 27, 29, 32};
        for (int i3 = 0; i3 < 27; i3++) {
            int i4 = iArr2[i3];
            pa7.J(!false);
            sparseBooleanArray2.append(i4, true);
        }
        pa7.J(!false);
    }

    public final void a(int i, boolean z) {
        if (z) {
            this.a.a(i);
        }
    }
}
