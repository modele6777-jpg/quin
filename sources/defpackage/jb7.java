package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jb7 {
    public final w5c a;
    public final j5f b;
    public final LinkedHashMap c;
    public final ReentrantLock d;
    public final yv6 e;
    public final yv6 f;
    public final w84 g;
    public final Object h;

    public jb7(w5c w5cVar, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String... strArr) {
        this.a = w5cVar;
        j5f j5fVar = new j5f(w5cVar, linkedHashMap, linkedHashMap2, strArr, w5cVar.k, new uj3(1, this, jb7.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 27));
        this.b = j5fVar;
        this.c = new LinkedHashMap();
        this.d = new ReentrantLock();
        this.e = new yv6(this, 14);
        this.f = new yv6(this, 15);
        this.g = new w84(w5cVar);
        this.h = new Object();
        j5fVar.k = new zv6(4, this);
    }

    public final Object a(gbe gbeVar) {
        Object objF = this.b.f(gbeVar);
        return objF == bw2.a ? objF : wef.a;
    }
}
