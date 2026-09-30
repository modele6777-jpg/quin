package defpackage;

import android.util.Log;
import android.util.Size;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lu3 {
    public static final boolean k;
    public static final AtomicInteger l;
    public static final AtomicInteger m;
    public final Object a = new Object();
    public int b = 0;
    public boolean c = false;
    public la1 d;
    public final pa1 e;
    public la1 f;
    public final pa1 g;
    public final Size h;
    public final int i;
    public Class j;

    static {
        new Size(0, 0);
        k = b21.F(3, "DeferrableSurface");
        l = new AtomicInteger(0);
        m = new AtomicInteger(0);
    }

    public lu3(int i, Size size) {
        final int i2 = 0;
        this.h = size;
        this.i = i;
        pa1 pa1VarT = y41.t(new na1(this) { // from class: iu3
            public final /* synthetic */ lu3 b;

            {
                this.b = this;
            }

            @Override // defpackage.na1
            public final Object x(la1 la1Var) {
                int i3 = i2;
                lu3 lu3Var = this.b;
                switch (i3) {
                    case 0:
                        synchronized (lu3Var.a) {
                            lu3Var.d = la1Var;
                            break;
                        }
                        return "DeferrableSurface-termination(" + lu3Var + ")";
                    default:
                        synchronized (lu3Var.a) {
                            lu3Var.f = la1Var;
                            break;
                        }
                        return "DeferrableSurface-close(" + lu3Var + ")";
                }
            }
        });
        this.e = pa1VarT;
        final int i3 = 1;
        this.g = y41.t(new na1(this) { // from class: iu3
            public final /* synthetic */ lu3 b;

            {
                this.b = this;
            }

            @Override // defpackage.na1
            public final Object x(la1 la1Var) {
                int i4 = i3;
                lu3 lu3Var = this.b;
                switch (i4) {
                    case 0:
                        synchronized (lu3Var.a) {
                            lu3Var.d = la1Var;
                            break;
                        }
                        return "DeferrableSurface-termination(" + lu3Var + ")";
                    default:
                        synchronized (lu3Var.a) {
                            lu3Var.f = la1Var;
                            break;
                        }
                        return "DeferrableSurface-close(" + lu3Var + ")";
                }
            }
        });
        if (b21.F(3, "DeferrableSurface")) {
            e(m.incrementAndGet(), l.get(), "Surface created");
            pa1VarT.b.b(new ny2(12, this, Log.getStackTraceString(new Exception())), g94.a());
        }
    }

    public void a() {
        la1 la1Var;
        synchronized (this.a) {
            try {
                if (this.c) {
                    la1Var = null;
                } else {
                    this.c = true;
                    this.f.b(null);
                    if (this.b == 0) {
                        la1Var = this.d;
                        this.d = null;
                    } else {
                        la1Var = null;
                    }
                    if (b21.F(3, "DeferrableSurface")) {
                        b21.q("DeferrableSurface", "surface closed,  useCount=" + this.b + " closed=true " + this);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (la1Var != null) {
            la1Var.b(null);
        }
    }

    public final void b() {
        la1 la1Var;
        synchronized (this.a) {
            try {
                int i = this.b;
                if (i == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i2 = i - 1;
                this.b = i2;
                if (i2 == 0 && this.c) {
                    la1Var = this.d;
                    this.d = null;
                } else {
                    la1Var = null;
                }
                if (b21.F(3, "DeferrableSurface")) {
                    b21.q("DeferrableSurface", "use count-1,  useCount=" + this.b + " closed=" + this.c + " " + this);
                    if (this.b == 0) {
                        e(m.get(), l.decrementAndGet(), "Surface no longer in use");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (la1Var != null) {
            la1Var.b(null);
        }
    }

    public final m88 c() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return new tx6(1, new ju3("DeferrableSurface already closed.", this));
                }
                return f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.a) {
            try {
                int i = this.b;
                if (i == 0 && this.c) {
                    throw new ju3("Cannot begin use on a closed surface.", this);
                }
                this.b = i + 1;
                if (b21.F(3, "DeferrableSurface")) {
                    if (this.b == 1) {
                        e(m.get(), l.incrementAndGet(), "New surface in use");
                    }
                    b21.q("DeferrableSurface", "use count+1, useCount=" + this.b + " " + this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(int i, int i2, String str) {
        if (!k && b21.F(3, "DeferrableSurface")) {
            b21.q("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        b21.q("DeferrableSurface", str + "[total_surfaces=" + i + ", used_surfaces=" + i2 + "](" + this + "}");
    }

    public abstract m88 f();
}
