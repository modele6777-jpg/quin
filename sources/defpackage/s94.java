package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class s94 extends ele {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s94(String str, x16 x16Var) {
        super(str);
        this.e = 2;
        this.f = x16Var;
    }

    @Override // defpackage.ele
    public final long a() {
        long j;
        dib dibVar;
        int i = 0;
        long j2 = -1;
        switch (this.e) {
            case 0:
                w94 w94Var = (w94) this.f;
                synchronized (w94Var) {
                    try {
                        if (w94Var.X && !w94Var.Y) {
                            try {
                                w94Var.g0();
                            } catch (IOException unused) {
                                w94Var.Z = true;
                            }
                            try {
                                if (w94Var.E()) {
                                    w94Var.U();
                                    w94Var.x = 0;
                                }
                            } catch (IOException unused2) {
                                w94Var.E0 = true;
                                xhb xhbVar = w94Var.v;
                                if (xhbVar != null) {
                                    ieg.b(xhbVar);
                                }
                                w94Var.v = new xhb(new wz0());
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return -1L;
            case 1:
                ws4 ws4Var = (ws4) this.f;
                long jNanoTime = System.nanoTime();
                long j3 = (jNanoTime - ws4Var.a) + 1;
                Iterator it = ((ConcurrentLinkedQueue) ws4Var.d).iterator();
                it.getClass();
                long j4 = Long.MAX_VALUE;
                dib dibVar2 = null;
                long j5 = j3;
                dib dibVar3 = null;
                int i2 = 0;
                while (it.hasNext()) {
                    long j6 = j2;
                    dib dibVar4 = (dib) it.next();
                    dibVar4.getClass();
                    synchronized (dibVar4) {
                        if (ws4Var.c(dibVar4, jNanoTime) > 0) {
                            i2++;
                        } else {
                            long j7 = j5;
                            long j8 = dibVar4.q;
                            if (j8 < j7) {
                                dibVar3 = dibVar4;
                                j7 = j8;
                            }
                            i++;
                            if (j8 < j4) {
                                dibVar2 = dibVar4;
                                j4 = j8;
                            }
                            j5 = j7;
                        }
                    }
                    j2 = j6;
                }
                long j9 = j2;
                long j10 = j5;
                if (dibVar3 != null) {
                    dibVar = dibVar3;
                    j = j10;
                } else if (i > 5) {
                    j = j4;
                    dibVar = dibVar2;
                } else {
                    j = j9;
                    dibVar = null;
                }
                if (dibVar == null) {
                    if (dibVar2 != null) {
                        return (j4 + ws4Var.a) - jNanoTime;
                    }
                    return i2 > 0 ? ws4Var.a : j9;
                }
                synchronized (dibVar) {
                    if (dibVar.p.isEmpty() && dibVar.q == j) {
                        dibVar.j = true;
                        ((ConcurrentLinkedQueue) ws4Var.d).remove(dibVar);
                        keg.c(dibVar.e);
                        if (!((ConcurrentLinkedQueue) ws4Var.d).isEmpty()) {
                            return 0L;
                        }
                        jle jleVar = (jle) ws4Var.b;
                        synchronized (jleVar.a) {
                            if (jleVar.a()) {
                                jleVar.a.c(jleVar);
                            }
                            break;
                        }
                        return 0L;
                    }
                    return 0L;
                }
            default:
                ((x16) this.f).invoke();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s94(int i, Object obj, String str) {
        super(str);
        this.e = i;
        this.f = obj;
    }
}
