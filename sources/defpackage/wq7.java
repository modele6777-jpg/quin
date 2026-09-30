package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wq7 {
    public int a;
    public bzd b;
    public final ArrayList c = new ArrayList(0);
    public wq7 d;
    public wq7 e;
    public rq7 f;
    public final ArrayList g;

    public wq7(int i) {
        this.a = i;
        wu8.a.getClass();
        List listA = vu8.a();
        ArrayList arrayList = new ArrayList(t72.u(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((tk7) ((wu8) it.next())).getClass();
            arrayList.add(new yl7());
        }
        this.g = arrayList;
    }

    public final bzd a() {
        bzd bzdVar = this.b;
        if (bzdVar != null) {
            return bzdVar;
        }
        pa7.g0("classifier");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!wq7.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        wq7 wq7Var = (wq7) obj;
        return this.a == wq7Var.a && a().equals(wq7Var.a()) && pa7.t(this.c, wq7Var.c) && pa7.t(this.e, wq7Var.e) && pa7.t(this.d, wq7Var.d) && pa7.t(this.f, wq7Var.f) && pa7.t(this.g, wq7Var.g);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((a().hashCode() + (this.a * 31)) * 31);
    }
}
