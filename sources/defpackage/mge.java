package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mge {
    public static final List a = t72.I(new bge(4.6f, new float[]{1.0f, 1.0f, 1.0f}, new float[]{-0.55f, -0.65f, -0.5f}), new bge(1.5f, new float[]{1.0f, 1.0f, 1.0f}, new float[]{0.55f, 0.42f, 0.5f}));

    public static final c78 a(List list, Set set, int i) {
        int i2 = 0;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (set.contains(it.next()) && (i2 = i2 + 1) < 0) {
                    t72.Y();
                    throw null;
                }
            }
        }
        int iMax = Math.max(i, i2);
        int size = list.size();
        c78 c78VarW = t72.w();
        for (Object obj : list) {
            if (!set.contains(obj) && size > iMax) {
                c78VarW.add(obj);
                size--;
            }
        }
        return c78VarW.n();
    }
}
