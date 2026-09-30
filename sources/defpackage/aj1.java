package defpackage;

import android.os.Looper;
import android.util.Log;
import io.sentry.android.core.b1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class aj1 {
    public final Object a = new Object();
    public final m6c b = new m6c(22);
    public final v69 c = new v69();
    public yf1 d;
    public og1 e;
    public io0 f;
    public boolean g;
    public final LinkedHashMap h;

    public aj1() {
        og1 og1Var = og1.a;
        this.e = og1Var;
        this.h = new LinkedHashMap();
        c(og1Var, null);
    }

    public final void a(yf1 yf1Var, ee6 ee6Var) {
        ae6 ae6Var = ae6.c;
        ae6 ae6Var2 = ae6.b;
        if (!yf1Var.equals(this.d)) {
            if (b21.F(3, "CXCP")) {
                Log.d("CXCP", "Ignored stale transition " + ee6Var + " for " + yf1Var);
                return;
            }
            return;
        }
        og1 og1Var = this.e;
        og1Var.getClass();
        ee6Var.getClass();
        int iOrdinal = og1Var.ordinal();
        og1 og1Var2 = og1.e;
        og1 og1Var3 = og1.d;
        zi1 zi1Var = null;
        if (iOrdinal != 2) {
            og1 og1Var4 = og1.b;
            og1 og1Var5 = og1.a;
            if (iOrdinal != 3) {
                be6 be6Var = be6.b;
                og1 og1Var6 = og1.c;
                if (iOrdinal != 4) {
                    ce6 ce6Var = ce6.b;
                    if (iOrdinal != 5) {
                        if (iOrdinal == 6) {
                            if (ee6Var.equals(ce6Var)) {
                                zi1Var = new zi1(og1Var6);
                            } else if (ee6Var.equals(be6Var)) {
                                zi1Var = new zi1(og1Var5);
                            } else if (ee6Var instanceof zd6) {
                                int i = ((zd6) ee6Var).b;
                                zi1Var = dj6.P(i) ? new zi1(og1Var4, dj6.Y(i)) : new zi1(og1Var5, dj6.Y(i));
                            }
                        }
                    } else if (ee6Var.equals(ae6Var2)) {
                        zi1Var = new zi1(og1Var2);
                    } else if (ee6Var instanceof zd6) {
                        zd6 zd6Var = (zd6) ee6Var;
                        int i2 = zd6Var.b;
                        if (zd6Var.c) {
                            zi1Var = new zi1(og1Var3, dj6.Y(i2));
                        } else {
                            zi1Var = dj6.P(i2) ? new zi1(og1Var4, dj6.Y(i2)) : new zi1(og1Var6, dj6.Y(i2));
                        }
                    } else if (ee6Var.equals(ce6Var)) {
                        zi1Var = new zi1(og1Var6);
                    } else if (ee6Var.equals(be6Var)) {
                        zi1Var = new zi1(og1Var5);
                    }
                } else if (ee6Var.equals(be6Var)) {
                    zi1Var = new zi1(og1Var5);
                } else if (ee6Var.equals(ae6Var)) {
                    zi1Var = new zi1(og1Var3);
                } else if (ee6Var instanceof zd6) {
                    zi1Var = new zi1(og1Var6, dj6.Y(((zd6) ee6Var).b));
                }
            } else if (ee6Var.equals(ae6Var)) {
                zi1Var = new zi1(og1Var3);
            } else if (ee6Var.equals(ae6Var2)) {
                zi1Var = new zi1(og1Var2);
            } else if (ee6Var instanceof zd6) {
                int i3 = ((zd6) ee6Var).b;
                zi1Var = dj6.P(i3) ? new zi1(og1Var4, dj6.Y(i3)) : new zi1(og1Var5, dj6.Y(i3));
            }
        } else if (ee6Var.equals(ae6Var)) {
            zi1Var = new zi1(og1Var3);
        } else if (ee6Var.equals(ae6Var2)) {
            zi1Var = new zi1(og1Var2);
        }
        if (zi1Var == null) {
            if (b21.F(5, "CXCP")) {
                b1.l("CXCP", "Impermissible state transition: current camera internal state: " + this.e + ", received graph state: " + ee6Var);
                return;
            }
            return;
        }
        this.e = zi1Var.a;
        this.f = zi1Var.b;
        if (b21.F(3, "CXCP")) {
            Log.d("CXCP", "Updated current camera internal state to " + zi1Var);
        }
        c(this.e, this.f);
    }

    public final void b(yf1 yf1Var, ee6 ee6Var) {
        ee6Var.getClass();
        synchronized (this.a) {
            if (this.g) {
                if (b21.F(5, "CXCP")) {
                    b1.l("CXCP", "Ignoring graph state update " + ee6Var + " on removed camera.");
                }
                return;
            }
            if (b21.F(3, "CXCP")) {
                Log.d("CXCP", yf1Var + " state updated to " + ee6Var);
            }
            a(yf1Var, ee6Var);
        }
    }

    public final void c(og1 og1Var, io0 io0Var) {
        List<Map.Entry> listJ1;
        int i = 2;
        ((v69) this.b.b).i(new brg(2, og1Var));
        og1Var.getClass();
        int iOrdinal = og1Var.ordinal();
        if (iOrdinal == 2) {
            i = 5;
        } else if (iOrdinal == 3) {
            i = 1;
        } else if (iOrdinal == 4) {
            i = 4;
        } else if (iOrdinal != 5) {
            if (iOrdinal != 6) {
                yg5.l(og1Var, "Unexpected CameraInternal state: ");
                return;
            }
            i = 3;
        }
        ho0 ho0Var = new ho0(i, io0Var);
        v69 v69Var = this.c;
        v69Var.getClass();
        if (pa7.t(Looper.myLooper(), Looper.getMainLooper())) {
            v69Var.k(ho0Var);
        } else {
            v69Var.i(ho0Var);
        }
        synchronized (this.a) {
            listJ1 = s72.j1(this.h.entrySet());
        }
        for (Map.Entry entry : listJ1) {
            ((Executor) entry.getValue()).execute(new fe(19, (yl2) entry.getKey(), ho0Var));
        }
    }
}
