package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class h3h extends FutureTask implements Comparable {
    public final long a;
    public final boolean b;
    public final String c;
    public final /* synthetic */ m3h d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3h(m3h m3hVar, Callable callable, boolean z) {
        super(callable);
        this.d = m3hVar;
        long andIncrement = m3h.z.getAndIncrement();
        this.a = andIncrement;
        this.c = "Task exception on worker thread";
        this.b = z;
        if (andIncrement == Long.MAX_VALUE) {
            w0h w0hVar = ((w3h) m3hVar.b).f;
            w3h.h(w0hVar);
            w0hVar.g.a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h3h h3hVar = (h3h) obj;
        boolean z = h3hVar.b;
        boolean z2 = this.b;
        if (z2 != z) {
            return !z2 ? 1 : -1;
        }
        long j = h3hVar.a;
        long j2 = this.a;
        if (j2 < j) {
            return -1;
        }
        if (j2 > j) {
            return 1;
        }
        w0h w0hVar = ((w3h) this.d.b).f;
        w3h.h(w0hVar);
        w0hVar.v.b(Long.valueOf(j2), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        w0h w0hVar = ((w3h) this.d.b).f;
        w3h.h(w0hVar);
        w0hVar.g.b(th, this.c);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3h(m3h m3hVar, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.d = m3hVar;
        long andIncrement = m3h.z.getAndIncrement();
        this.a = andIncrement;
        this.c = str;
        this.b = z;
        if (andIncrement == Long.MAX_VALUE) {
            w0h w0hVar = ((w3h) m3hVar.b).f;
            w3h.h(w0hVar);
            w0hVar.g.a("Tasks index overflow");
        }
    }
}
