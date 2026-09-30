package defpackage;

import android.util.SparseArray;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ykb {
    public SparseArray a;
    public int b;
    public Set c;

    public final xkb a(int i) {
        SparseArray sparseArray = this.a;
        xkb xkbVar = (xkb) sparseArray.get(i);
        if (xkbVar != null) {
            return xkbVar;
        }
        xkb xkbVar2 = new xkb();
        sparseArray.put(i, xkbVar2);
        return xkbVar2;
    }
}
