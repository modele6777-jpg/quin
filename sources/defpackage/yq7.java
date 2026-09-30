package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yq7 {
    public int a;
    public final String b;
    public final int c;
    public final br7 d;
    public final ArrayList e;
    public final ArrayList f;

    public yq7(int i, String str, int i2, br7 br7Var) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = br7Var;
        this.e = new ArrayList(1);
        wu8.a.getClass();
        List listA = vu8.a();
        ArrayList arrayList = new ArrayList(t72.u(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((tk7) ((wu8) it.next())).getClass();
            arrayList.add(new zl7());
        }
        this.f = arrayList;
    }
}
