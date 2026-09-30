package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hq7 implements mq7 {
    public int a;
    public String b;
    public String m;
    public wq7 n;
    public final ArrayList s;
    public final ArrayList c = new ArrayList(0);
    public final ArrayList d = new ArrayList(1);
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList(0);
    public final ArrayList h = new ArrayList(1);
    public final ArrayList i = new ArrayList(0);
    public final ArrayList j = new ArrayList(0);
    public final ArrayList k = new ArrayList(0);
    public final ArrayList l = new ArrayList(0);
    public final ArrayList o = new ArrayList(0);
    public final ArrayList p = new ArrayList(0);
    public final ArrayList q = new ArrayList(0);
    public final LinkedHashMap r = new LinkedHashMap(0);

    public hq7() {
        wu8.a.getClass();
        List listA = vu8.a();
        ArrayList arrayList = new ArrayList(t72.u(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((tk7) ((wu8) it.next())).getClass();
            arrayList.add(new fk7());
        }
        this.s = arrayList;
    }

    @Override // defpackage.mq7
    public final ArrayList a() {
        return this.f;
    }

    @Override // defpackage.mq7
    public final ArrayList b() {
        return this.e;
    }

    @Override // defpackage.mq7
    public final ArrayList c() {
        return this.g;
    }
}
