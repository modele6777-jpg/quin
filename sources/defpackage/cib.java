package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class cib implements v91, Cloneable {
    public boolean E0;
    public volatile boolean F0;
    public volatile zi0 G0;
    public final CopyOnWriteArrayList H0;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final hm9 a;
    public final btb b;
    public final ws4 c;
    public volatile tz4 d;
    public final bib e;
    public final AtomicBoolean f;
    public Object g;
    public v25 v;
    public dib w;
    public boolean x;
    public zi0 y;
    public boolean z;

    static {
        AtomicReferenceFieldUpdater.newUpdater(cib.class, tz4.class, "d");
    }

    public cib(hm9 hm9Var, btb btbVar) {
        hm9Var.getClass();
        btbVar.getClass();
        this.a = hm9Var;
        this.b = btbVar;
        this.c = (ws4) hm9Var.D.a;
        hm9Var.d.getClass();
        this.d = tz4.a;
        bib bibVar = new bib(this);
        bibVar.g(0L);
        this.e = bibVar;
        this.f = new AtomicBoolean();
        this.E0 = true;
        this.H0 = new CopyOnWriteArrayList();
        new AtomicReference(btbVar.e);
    }

    public final void a(dib dibVar) {
        dibVar.getClass();
        TimeZone timeZone = keg.a;
        if (this.w != null) {
            qc0.p("Check failed.");
        } else {
            this.w = dibVar;
            dibVar.p.add(new aib(this, this.g));
        }
    }

    public final IOException b(IOException iOException) {
        IOException interruptedIOException;
        Socket socketH;
        TimeZone timeZone = keg.a;
        dib dibVar = this.w;
        if (dibVar != null) {
            synchronized (dibVar) {
                socketH = h();
            }
            if (this.w == null) {
                if (socketH != null) {
                    keg.c(socketH);
                }
                this.d.getClass();
            } else if (socketH != null) {
                qc0.p("Check failed.");
                return null;
            }
        }
        if (!this.x && this.e.i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        tz4 tz4Var = this.d;
        if (iOException == null) {
            tz4Var.getClass();
            return interruptedIOException;
        }
        interruptedIOException.getClass();
        tz4Var.getClass();
        return interruptedIOException;
    }

    public final ryb c() {
        if (!this.f.compareAndSet(false, true)) {
            qc0.p("Already Executed");
            return null;
        }
        this.e.h();
        sea seaVar = sea.a;
        this.g = sea.a.g();
        this.d.getClass();
        try {
            da4 da4Var = this.a.a;
            synchronized (da4Var) {
                ((ArrayDeque) da4Var.f).add(this);
            }
            ryb rybVarE = e();
            da4 da4Var2 = this.a.a;
            da4Var2.getClass();
            da4.e(da4Var2, null, this, null, 5);
            return rybVarE;
        } catch (Throwable th) {
            da4 da4Var3 = this.a.a;
            da4Var3.getClass();
            da4.e(da4Var3, null, this, null, 5);
            throw th;
        }
    }

    public final void cancel() {
        if (this.F0) {
            return;
        }
        this.F0 = true;
        zi0 zi0Var = this.G0;
        if (zi0Var != null) {
            ((u25) zi0Var.d).cancel();
        }
        Iterator it = this.H0.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((j7c) it.next()).cancel();
        }
        this.d.getClass();
    }

    public final Object clone() {
        return new cib(this.a, this.b);
    }

    public final void d(boolean z) {
        zi0 zi0Var;
        synchronized (this) {
            if (!this.E0) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (zi0Var = this.G0) != null) {
            ((u25) zi0Var.d).cancel();
            ((cib) zi0Var.b).f(zi0Var, true, true, true, true, null);
        }
        this.y = null;
    }

    public final ryb e() {
        ArrayList arrayList = new ArrayList();
        x72.g0(arrayList, this.a.b);
        arrayList.add(new ba1(5));
        arrayList.add(new ba1(2));
        arrayList.add(new ba1(3));
        arrayList.add(ba1.c);
        x72.g0(arrayList, this.a.c);
        arrayList.add(ba1.b);
        btb btbVar = this.b;
        hm9 hm9Var = this.a;
        btbVar.getClass();
        hm9Var.getClass();
        try {
            try {
                ryb rybVarB = new oib(this, arrayList, 0, null, btbVar, hm9Var.w, hm9Var.x, hm9Var.y, hm9Var.g, hm9Var.k, hm9Var.u, hm9Var.D, hm9Var.j, hm9Var.l, hm9Var.t, hm9Var.n, hm9Var.m, hm9Var.e, hm9Var.o, hm9Var.p, hm9Var.q, hm9Var.v).b(this.b);
                if (this.F0) {
                    ieg.b(rybVarB);
                    throw new IOException("Canceled");
                }
                g(null);
                return rybVarB;
            } catch (IOException e) {
                IOException iOExceptionG = g(e);
                iOExceptionG.getClass();
                throw iOExceptionG;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                g(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x002b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x002d A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x003f, B:34:0x0043, B:36:0x0047, B:41:0x0050, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:63:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0031 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x003f, B:34:0x0043, B:36:0x0047, B:41:0x0050, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:63:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0035 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x003f, B:34:0x0043, B:36:0x0047, B:41:0x0050, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:63:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0039 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:23:0x002d, B:25:0x0031, B:27:0x0035, B:29:0x0039, B:30:0x003b, B:32:0x003f, B:34:0x0043, B:36:0x0047, B:41:0x0050, B:14:0x001b, B:17:0x0021, B:20:0x0027), top: B:63:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x004d  */
    public final IOException f(zi0 zi0Var, boolean z, boolean z2, boolean z3, boolean z4, IOException iOException) {
        boolean z5;
        boolean z6;
        boolean z7;
        zi0Var.getClass();
        if (zi0Var.equals(this.G0)) {
            synchronized (this) {
                z5 = false;
                if (z) {
                    try {
                        if (this.z) {
                            if (z) {
                                this.z = false;
                            }
                            if (z2) {
                                this.X = false;
                            }
                            if (z4) {
                                this.Y = false;
                            }
                            if (z3) {
                                this.Z = false;
                            }
                            if (this.z) {
                                z7 = false;
                            } else {
                                z7 = false;
                            }
                            if (z7) {
                                z5 = true;
                            }
                            boolean z8 = z5;
                            z5 = z7;
                            z6 = z8;
                        } else if ((!z2 && this.X) || ((z4 && this.Y) || (z3 && this.Z))) {
                            if (z) {
                                this.z = false;
                            }
                            if (z2) {
                                this.X = false;
                            }
                            if (z4) {
                                this.Y = false;
                            }
                            if (z3) {
                                this.Z = false;
                            }
                            if (this.z || this.X || this.Y || this.Z) {
                                z7 = false;
                            } else {
                                z7 = true;
                            }
                            if (z7 && !this.E0) {
                                z5 = true;
                            }
                            boolean z9 = z5;
                            z5 = z7;
                            z6 = z9;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    z6 = !z2 ? false : false;
                }
            }
            if (z5) {
                this.G0 = null;
                dib dibVar = this.w;
                if (dibVar != null) {
                    synchronized (dibVar) {
                        dibVar.m++;
                    }
                }
            }
            if (z6) {
                return b(iOException);
            }
        }
        return iOException;
    }

    public final IOException g(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.E0) {
                this.E0 = false;
                if (!this.z && !this.X && !this.Y && !this.Z) {
                    z = true;
                }
            }
        }
        return z ? b(iOException) : iOException;
    }

    public final Socket h() {
        dib dibVar = this.w;
        dibVar.getClass();
        TimeZone timeZone = keg.a;
        ArrayList arrayList = dibVar.p;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (pa7.t(((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            qc0.p("Check failed.");
            return null;
        }
        arrayList.remove(i);
        this.w = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        dibVar.q = System.nanoTime();
        ws4 ws4Var = this.c;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) ws4Var.d;
        TimeZone timeZone2 = keg.a;
        if (!dibVar.j) {
            ((jle) ws4Var.b).c((s94) ws4Var.c, 0L);
            return null;
        }
        dibVar.j = true;
        concurrentLinkedQueue.remove(dibVar);
        if (concurrentLinkedQueue.isEmpty()) {
            jle jleVar = (jle) ws4Var.b;
            synchronized (jleVar.a) {
                if (jleVar.a()) {
                    jleVar.a.c(jleVar);
                }
            }
        }
        return dibVar.e;
    }
}
