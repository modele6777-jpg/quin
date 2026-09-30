package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class oa5 implements v25 {
    public long a;
    public Object b;
    public Object c;
    public Object d;
    public final Object e;

    public oa5(sib sibVar, kle kleVar) {
        kleVar.getClass();
        this.b = sibVar;
        this.c = kleVar;
        this.a = Long.MIN_VALUE;
        this.d = new CopyOnWriteArrayList();
        this.e = new LinkedBlockingDeque();
    }

    public void a() {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.d;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            j7c j7cVar = (j7c) it.next();
            j7cVar.cancel();
            j7c j7cVarB = j7cVar.b();
            if (j7cVarB != null) {
                ((sib) this.b).p.addLast(j7cVarB);
            }
        }
        copyOnWriteArrayList.clear();
    }

    public i7c b() {
        j7c aa5Var;
        sib sibVar = (sib) this.b;
        if (sibVar.a(null)) {
            try {
                aa5Var = sibVar.b();
            } catch (Throwable th) {
                aa5Var = new aa5(th);
            }
            if (aa5Var.a()) {
                return new i7c(aa5Var, (Throwable) null, 6);
            }
            if (aa5Var instanceof aa5) {
                return ((aa5) aa5Var).a;
            }
            ((CopyOnWriteArrayList) this.d).add(aa5Var);
            ((kle) this.c).d().c(new na5(keg.b + " connect " + sibVar.i.h.i(), aa5Var, this), 0L);
        }
        return null;
    }

    @Override // defpackage.v25
    public dib c() throws IOException {
        i7c i7cVarB;
        long j;
        i7c i7cVar;
        IOException iOException = null;
        while (true) {
            try {
                if (((CopyOnWriteArrayList) this.d).isEmpty() && !((sib) this.b).a(null)) {
                    a();
                    iOException.getClass();
                    throw iOException;
                }
                if (((sib) this.b).k.F0) {
                    throw new IOException("Canceled");
                }
                vrb vrbVar = ((kle) this.c).a;
                long jNanoTime = System.nanoTime();
                long j2 = this.a - jNanoTime;
                if (((CopyOnWriteArrayList) this.d).isEmpty() || j2 <= 0) {
                    i7cVarB = b();
                    j = 250000000;
                    this.a = jNanoTime + 250000000;
                } else {
                    j = j2;
                    i7cVarB = null;
                }
                if (i7cVarB == null) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.d;
                    if (copyOnWriteArrayList.isEmpty() || (i7cVar = (i7c) ((LinkedBlockingDeque) this.e).poll(j, timeUnit)) == null) {
                        i7cVarB = null;
                    } else {
                        copyOnWriteArrayList.remove(i7cVar.a);
                        i7cVarB = i7cVar;
                    }
                    if (i7cVarB == null) {
                    }
                }
                boolean z = false;
                if (i7cVarB.b == null && i7cVarB.c == null) {
                    a();
                    if (!i7cVarB.a.a()) {
                        i7cVarB = i7cVarB.a.g();
                    }
                    if (i7cVarB.b == null && i7cVarB.c == null) {
                        z = true;
                    }
                    if (z) {
                        dib dibVarC = i7cVarB.a.c();
                        a();
                        return dibVarC;
                    }
                }
                Throwable th = i7cVarB.c;
                if (th != null) {
                    if (!(th instanceof IOException)) {
                        throw th;
                    }
                    if (iOException == null) {
                        iOException = (IOException) th;
                    } else {
                        bzd.m(iOException, th);
                    }
                }
                j7c j7cVar = i7cVarB.b;
                if (j7cVar != null) {
                    ((sib) this.b).p.addFirst(j7cVar);
                }
            } catch (Throwable th2) {
                a();
                throw th2;
            }
        }
    }

    @Override // defpackage.v25
    public sib d() {
        return (sib) this.b;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x009c  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d5 A[RETURN] */
    public boolean e(long j, v2h v2hVar) {
        z3h z3hVar;
        if (((ArrayList) this.d) == null) {
            this.d = new ArrayList();
        }
        if (((ArrayList) this.c) == null) {
            this.c = new ArrayList();
        }
        if (((ArrayList) this.d).isEmpty() || ((((v2h) ((ArrayList) this.d).get(0)).y() / 1000) / 60) / 60 == ((v2hVar.y() / 1000) / 60) / 60) {
            long jK = this.a + ((long) v2hVar.k());
            ich ichVar = (ich) this.e;
            if (!ichVar.f0().L0(null, bzg.Y0)) {
                ichVar.f0();
                if (jK < Math.max(0, ((Integer) bzg.j.a(null)).intValue())) {
                    this.a = jK;
                    ((ArrayList) this.d).add(v2hVar);
                    ((ArrayList) this.c).add(Long.valueOf(j));
                    z3hVar = (z3h) this.b;
                    if (((ArrayList) this.d).size() < Math.max(1, ichVar.f0().J0(z3hVar != null ? z3hVar.r() : null, bzg.k))) {
                        return true;
                    }
                }
            } else if (((ArrayList) this.d).isEmpty()) {
                this.a = jK;
                ((ArrayList) this.d).add(v2hVar);
                ((ArrayList) this.c).add(Long.valueOf(j));
                z3hVar = (z3h) this.b;
                if (((ArrayList) this.d).size() < Math.max(1, ichVar.f0().J0(z3hVar != null ? z3hVar.r() : null, bzg.k))) {
                    return true;
                }
            } else {
                ichVar.f0();
                if (jK < Math.max(0, ((Integer) bzg.j.a(null)).intValue())) {
                    this.a = jK;
                    ((ArrayList) this.d).add(v2hVar);
                    ((ArrayList) this.c).add(Long.valueOf(j));
                    z3hVar = (z3h) this.b;
                    if (((ArrayList) this.d).size() < Math.max(1, ichVar.f0().J0(z3hVar != null ? z3hVar.r() : null, bzg.k))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public /* synthetic */ oa5(ich ichVar) {
        this.e = ichVar;
    }
}
