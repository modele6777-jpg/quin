package defpackage;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dv8 {
    public final SparseArray a;
    public g9f b;

    public dv8(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(g9f g9fVar, int i, int i2) {
        int iA = g9fVar.a(i);
        SparseArray sparseArray = this.a;
        dv8 dv8Var = (dv8) sparseArray.get(iA);
        if (dv8Var == null) {
            dv8Var = new dv8(1);
            sparseArray.put(g9fVar.a(i), dv8Var);
        }
        if (i2 > i) {
            dv8Var.a(g9fVar, i + 1, i2);
        } else {
            dv8Var.b = g9fVar;
        }
    }
}
