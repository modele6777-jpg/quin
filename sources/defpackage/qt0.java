package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qt0 implements ac3 {
    public final boolean a;
    public final ArrayList b = new ArrayList(1);
    public int c;
    public dc3 d;

    public qt0(boolean z) {
        this.a = z;
    }

    public final void j(int i) {
        boolean z;
        dc3 dc3Var = this.d;
        String str = pqf.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            lp3 lp3Var = (lp3) this.b.get(i2);
            boolean z2 = this.a;
            synchronized (lp3Var) {
                yob yobVar = lp3.p;
                if (z2) {
                    int i3 = dc3Var.i;
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    lp3Var.i += (long) i;
                }
            }
        }
    }

    @Override // defpackage.ac3
    public final void m(lp3 lp3Var) {
        lp3Var.getClass();
        ArrayList arrayList = this.b;
        if (arrayList.contains(lp3Var)) {
            return;
        }
        arrayList.add(lp3Var);
        this.c++;
    }

    public final void n() {
        boolean z;
        dc3 dc3Var = this.d;
        String str = pqf.a;
        for (int i = 0; i < this.c; i++) {
            lp3 lp3Var = (lp3) this.b.get(i);
            boolean z2 = this.a;
            synchronized (lp3Var) {
                try {
                    yob yobVar = lp3.p;
                    if (z2) {
                        int i2 = dc3Var.i;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        pa7.J(lp3Var.g > 0);
                        lp3Var.d.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        int i3 = (int) (jElapsedRealtime - lp3Var.h);
                        lp3Var.j += (long) i3;
                        long j = lp3Var.k;
                        long j2 = lp3Var.i;
                        lp3Var.k = j + j2;
                        if (i3 > 0) {
                            lp3Var.f.a((int) Math.sqrt(j2), (j2 * 8000.0f) / i3);
                            if (lp3Var.j >= 2000 || lp3Var.k >= 524288) {
                                lp3Var.l = (long) lp3Var.f.i();
                            }
                            lp3Var.c(lp3Var.i, i3, lp3Var.l);
                            lp3Var.h = jElapsedRealtime;
                            lp3Var.i = 0L;
                        }
                        lp3Var.g--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.d = null;
    }

    public final void p() {
        for (int i = 0; i < this.c; i++) {
            ((lp3) this.b.get(i)).getClass();
        }
    }

    public final void q(dc3 dc3Var) {
        this.d = dc3Var;
        for (int i = 0; i < this.c; i++) {
            lp3 lp3Var = (lp3) this.b.get(i);
            boolean z = this.a;
            synchronized (lp3Var) {
                try {
                    yob yobVar = lp3.p;
                    if (z) {
                        if (lp3Var.g == 0) {
                            lp3Var.d.getClass();
                            lp3Var.h = SystemClock.elapsedRealtime();
                        }
                        lp3Var.g++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
