package defpackage;

import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class i48 implements w48, ud1 {
    public final x48 b;
    public final lk1 c;
    public final Object a = new Object();
    public boolean d = false;
    public hc2 e = null;

    public i48(x48 x48Var, lk1 lk1Var, u6c u6cVar) {
        this.b = x48Var;
        this.c = lk1Var;
        if (((a58) x48Var.k()).i.compareTo(g48.d) >= 0) {
            lk1Var.r();
        } else {
            lk1Var.u();
        }
        x48Var.k().a(this);
    }

    @Override // defpackage.ud1
    public final kg1 b() {
        return this.c.a.b;
    }

    public final void c(hc2 hc2Var) {
        synchronized (this.a) {
            try {
                if (this.e == null) {
                    this.e = hc2Var;
                } else {
                    ArrayList arrayList = new ArrayList((List) this.e.f);
                    arrayList.addAll((List) hc2Var.f);
                    this.e = new hc2(arrayList, (List) hc2Var.b);
                }
                synchronized (this.c.y) {
                }
                lk1 lk1Var = this.c;
                List list = (List) hc2Var.b;
                synchronized (lk1Var.y) {
                    lk1Var.v = list;
                }
                synchronized (this.c.y) {
                }
                lk1 lk1Var2 = this.c;
                Range range = (Range) hc2Var.c;
                synchronized (lk1Var2.y) {
                    lk1Var2.w = range;
                }
                ng1 ng1Var = (ng1) b();
                ng1Var.getClass();
                vd9 vd9VarI = eu4.i(ng1Var, hc2Var);
                ((ScheduledExecutorService) hc2Var.v).execute(new ny2(22, vd9VarI, hc2Var));
                this.c.c((List) hc2Var.f, vd9VarI);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final x48 e() {
        x48 x48Var;
        synchronized (this.a) {
            x48Var = this.b;
        }
        return x48Var;
    }

    @dn9(f48.ON_DESTROY)
    public void onDestroy(x48 x48Var) {
        synchronized (this.a) {
            lk1 lk1Var = this.c;
            lk1Var.A((ArrayList) lk1Var.y());
        }
    }

    @dn9(f48.ON_PAUSE)
    public void onPause(x48 x48Var) {
        this.c.a.j(false);
    }

    @dn9(f48.ON_RESUME)
    public void onResume(x48 x48Var) {
        this.c.a.j(true);
    }

    @dn9(f48.ON_START)
    public void onStart(x48 x48Var) {
        synchronized (this.a) {
            try {
                if (!this.d) {
                    this.c.r();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @dn9(f48.ON_STOP)
    public void onStop(x48 x48Var) {
        synchronized (this.a) {
            try {
                if (!this.d) {
                    this.c.u();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final List r() {
        List listUnmodifiableList;
        synchronized (this.a) {
            listUnmodifiableList = Collections.unmodifiableList(this.c.y());
        }
        return listUnmodifiableList;
    }

    public final void s() {
        synchronized (this.a) {
            try {
                if (this.d) {
                    return;
                }
                onStop(this.b);
                this.d = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void t() {
        synchronized (this.a) {
            try {
                List listY = this.c.y();
                this.c.A((ArrayList) listY);
                for (oif oifVar : (ArrayList) listY) {
                    oifVar.getClass();
                    if (oifVar instanceof hv6) {
                        synchronized (oifVar.d) {
                        }
                    }
                }
                this.e = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void u() {
        synchronized (this.a) {
            try {
                if (this.d) {
                    this.d = false;
                    if (((a58) this.b.k()).i.compareTo(g48.d) >= 0) {
                        onStart(this.b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
