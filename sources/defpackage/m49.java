package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class m49 extends g41 {
    public final long c;
    public final ArrayList d;
    public final ArrayList e;

    public m49(int i, long j) {
        super(i);
        this.c = j;
        this.d = new ArrayList();
        this.e = new ArrayList();
    }

    public final m49 e(int i) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            m49 m49Var = (m49) arrayList.get(i2);
            if (m49Var.b == i) {
                return m49Var;
            }
        }
        return null;
    }

    public final n49 g(int i) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            n49 n49Var = (n49) arrayList.get(i2);
            if (n49Var.b == i) {
                return n49Var;
            }
        }
        return null;
    }

    @Override // defpackage.g41
    public final String toString() {
        return g41.b(this.b) + " leaves: " + Arrays.toString(this.d.toArray()) + " containers: " + Arrays.toString(this.e.toArray());
    }
}
