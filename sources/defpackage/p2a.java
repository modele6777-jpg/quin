package defpackage;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class p2a {
    public final rg2 a;
    public final lg2 b;
    public final l46 c;
    public final l26 d;
    public final boolean e;
    public final taf f;
    public final Object g;
    public final AtomicReference h = new AtomicReference(r2a.c);
    public long i = o8c.k();
    public lec j;
    public final bw k;
    public final bkb l;

    public p2a(rg2 rg2Var, lg2 lg2Var, l46 l46Var, a89 a89Var, l26 l26Var, boolean z, taf tafVar, Object obj) {
        this.a = rg2Var;
        this.b = lg2Var;
        this.c = l46Var;
        this.d = l26Var;
        this.e = z;
        this.f = tafVar;
        this.g = obj;
        x79 x79Var = mec.a;
        x79Var.getClass();
        this.j = x79Var;
        bw bwVar = new bw();
        bwVar.k(a89Var, l46Var.D());
        this.k = bwVar;
        this.l = new bkb(tafVar.c);
    }

    public final void a() throws Exception {
        AtomicReference atomicReference = this.h;
        try {
            switch (((r2a) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 5:
                    b();
                    r2a r2aVar = r2a.f;
                    r2a r2aVar2 = r2a.g;
                    while (!atomicReference.compareAndSet(r2aVar, r2aVar2)) {
                        if (atomicReference.get() != r2aVar) {
                            epa.b("Unexpected state change from: " + r2aVar + " to: " + r2aVar2 + ".");
                            return;
                        }
                    }
                    return;
                case 6:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new rf9();
            }
        } catch (Exception e) {
            atomicReference.set(r2a.a);
            throw e;
        }
    }

    public final void b() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.g) {
                try {
                    this.l.b(this.f, this.k);
                    this.k.f();
                    this.k.g();
                    this.k.e();
                    this.a.F0 = null;
                } catch (Throwable th) {
                    this.k.e();
                    this.a.F0 = null;
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final boolean c() {
        return ((r2a) this.h.get()).compareTo(r2a.f) >= 0;
    }

    public final void d() {
        AtomicReference atomicReference;
        r2a r2aVar;
        r2a r2aVar2;
        do {
            atomicReference = this.h;
            r2aVar = r2a.d;
            r2aVar2 = r2a.f;
            if (atomicReference.compareAndSet(r2aVar, r2aVar2)) {
                return;
            }
        } while (atomicReference.get() == r2aVar);
        epa.b("Unexpected state change from: " + r2aVar + " to: " + r2aVar2 + ".");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0082 A[Catch: Exception -> 0x0023, TryCatch #1 {Exception -> 0x0023, blocks: (B:3:0x0004, B:6:0x001d, B:7:0x0022, B:10:0x0026, B:11:0x002d, B:12:0x002e, B:13:0x0035, B:14:0x0036, B:15:0x0040, B:16:0x0041, B:22:0x0069, B:24:0x0079, B:25:0x007b, B:31:0x00a3, B:33:0x00ab, B:28:0x0082, B:30:0x0088, B:35:0x00b1, B:36:0x00b3, B:38:0x00b9, B:41:0x00c0, B:42:0x00db, B:19:0x0048, B:21:0x004e, B:45:0x00e3, B:48:0x00f2, B:50:0x00f6, B:54:0x0100, B:53:0x00fb, B:55:0x0105, B:56:0x0107, B:62:0x012f, B:64:0x0137, B:59:0x010e, B:61:0x0114, B:68:0x0140, B:69:0x0141, B:70:0x0148, B:71:0x0149, B:72:0x0150, B:23:0x006b, B:46:0x00e8), top: B:77:0x0004, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ab A[Catch: Exception -> 0x0023, TryCatch #1 {Exception -> 0x0023, blocks: (B:3:0x0004, B:6:0x001d, B:7:0x0022, B:10:0x0026, B:11:0x002d, B:12:0x002e, B:13:0x0035, B:14:0x0036, B:15:0x0040, B:16:0x0041, B:22:0x0069, B:24:0x0079, B:25:0x007b, B:31:0x00a3, B:33:0x00ab, B:28:0x0082, B:30:0x0088, B:35:0x00b1, B:36:0x00b3, B:38:0x00b9, B:41:0x00c0, B:42:0x00db, B:19:0x0048, B:21:0x004e, B:45:0x00e3, B:48:0x00f2, B:50:0x00f6, B:54:0x0100, B:53:0x00fb, B:55:0x0105, B:56:0x0107, B:62:0x012f, B:64:0x0137, B:59:0x010e, B:61:0x0114, B:68:0x0140, B:69:0x0141, B:70:0x0148, B:71:0x0149, B:72:0x0150, B:23:0x006b, B:46:0x00e8), top: B:77:0x0004, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0137 A[Catch: Exception -> 0x0023, TRY_LEAVE, TryCatch #1 {Exception -> 0x0023, blocks: (B:3:0x0004, B:6:0x001d, B:7:0x0022, B:10:0x0026, B:11:0x002d, B:12:0x002e, B:13:0x0035, B:14:0x0036, B:15:0x0040, B:16:0x0041, B:22:0x0069, B:24:0x0079, B:25:0x007b, B:31:0x00a3, B:33:0x00ab, B:28:0x0082, B:30:0x0088, B:35:0x00b1, B:36:0x00b3, B:38:0x00b9, B:41:0x00c0, B:42:0x00db, B:19:0x0048, B:21:0x004e, B:45:0x00e3, B:48:0x00f2, B:50:0x00f6, B:54:0x0100, B:53:0x00fb, B:55:0x0105, B:56:0x0107, B:62:0x012f, B:64:0x0137, B:59:0x010e, B:61:0x0114, B:68:0x0140, B:69:0x0141, B:70:0x0148, B:71:0x0149, B:72:0x0150, B:23:0x006b, B:46:0x00e8), top: B:77:0x0004, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:? A[LOOP:1: B:25:0x007b->B:85:?, LOOP_END, SYNTHETIC] */
    public final boolean e(cfd cfdVar) throws Exception {
        long j;
        r2a r2aVar = r2a.e;
        AtomicReference atomicReference = this.h;
        try {
            int iOrdinal = ((r2a) atomicReference.get()).ordinal();
            r2a r2aVar2 = r2a.d;
            rg2 rg2Var = this.a;
            lg2 lg2Var = this.b;
            switch (iOrdinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    l46 l46Var = this.c;
                    boolean z = this.e;
                    if (z) {
                        l46Var.z = 0;
                        l46Var.y = true;
                    }
                    this.j = lg2Var.b(rg2Var, cfdVar, this.d);
                    if (z) {
                        if (l46Var.F || l46Var.z != 0) {
                            epa.a("Cannot disable reuse from root if it was caused by other groups");
                        }
                        l46Var.z = -1;
                        l46Var.y = false;
                    }
                    r2a r2aVar3 = r2a.c;
                    while (!atomicReference.compareAndSet(r2aVar3, r2aVar2)) {
                        if (atomicReference.get() != r2aVar3) {
                            epa.b("Unexpected state change from: " + r2aVar3 + " to: " + r2aVar2 + ".");
                            if (this.j.c()) {
                                d();
                            }
                            return c();
                        }
                    }
                    if (this.j.c()) {
                        d();
                    }
                    return c();
                case 3:
                    try {
                        while (!atomicReference.compareAndSet(r2aVar2, r2aVar)) {
                            if (atomicReference.get() != r2aVar2) {
                                epa.b("Unexpected state change from: " + r2aVar2 + " to: " + r2aVar + ".");
                                j = this.i;
                                this.i = o8c.k();
                                this.j = lg2Var.q(rg2Var, cfdVar, this.j);
                                this.i = j;
                                while (!atomicReference.compareAndSet(r2aVar, r2aVar2)) {
                                    if (atomicReference.get() != r2aVar) {
                                        epa.b("Unexpected state change from: " + r2aVar + " to: " + r2aVar2 + ".");
                                        if (this.j.c()) {
                                            d();
                                        }
                                        return c();
                                    }
                                }
                                if (this.j.c()) {
                                    d();
                                }
                                return c();
                            }
                        }
                        this.i = o8c.k();
                        this.j = lg2Var.q(rg2Var, cfdVar, this.j);
                        this.i = j;
                        while (!atomicReference.compareAndSet(r2aVar, r2aVar2)) {
                            if (atomicReference.get() != r2aVar) {
                                epa.b("Unexpected state change from: " + r2aVar + " to: " + r2aVar2 + ".");
                                if (this.j.c()) {
                                    d();
                                }
                                return c();
                            }
                        }
                        if (this.j.c()) {
                            d();
                        }
                        return c();
                    } catch (Throwable th) {
                        this.i = j;
                        while (!atomicReference.compareAndSet(r2aVar, r2aVar2)) {
                            if (atomicReference.get() != r2aVar) {
                                epa.b("Unexpected state change from: " + r2aVar + " to: " + r2aVar2 + ".");
                                throw th;
                            }
                        }
                        throw th;
                    }
                    j = this.i;
                case 4:
                    wf2.b("Recursive call to resume()");
                    throw new nt7();
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new rf9();
            }
        } catch (Exception e) {
            atomicReference.set(r2a.a);
            throw e;
        }
    }
}
