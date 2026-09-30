package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nd1 {
    public final Object a = new Object();
    public final LinkedHashMap b = new LinkedHashMap();

    public final void a(int i, String str, boolean z) {
        eyf eyfVar;
        str.getClass();
        synchronized (this.a) {
            eyfVar = (eyf) this.b.get(new ig1(str));
        }
        if (eyfVar == null) {
            return;
        }
        eyfVar.b.a(new zd6(i, z));
    }
}
