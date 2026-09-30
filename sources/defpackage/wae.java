package defpackage;

import android.util.Range;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wae {
    public final Object a = new Object();
    public final Size b;
    public final qr4 c;
    public final pg1 d;
    public final boolean e;
    public final pa1 f;
    public final la1 g;
    public final pa1 h;
    public final la1 i;
    public final la1 j;
    public final vx6 k;
    public lq0 l;
    public vae m;
    public Executor n;

    static {
        Range range = hq0.h;
    }

    public wae(Size size, pg1 pg1Var, boolean z, qr4 qr4Var, dae daeVar) {
        this.b = size;
        this.d = pg1Var;
        this.e = z;
        ok8.k("SurfaceRequest's DynamicRange must always be fully specified.", qr4Var.b());
        this.c = qr4Var;
        String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        AtomicReference atomicReference = new AtomicReference(null);
        la1 la1Var = new la1();
        la1Var.c = new qxb();
        pa1 pa1Var = new pa1(la1Var);
        la1Var.b = pa1Var;
        la1Var.a = kv2.class;
        try {
            atomicReference.set(la1Var);
            la1Var.a = str.concat("-cancellation");
        } catch (Exception e) {
            pa1Var.a(e);
        }
        la1 la1Var2 = (la1) atomicReference.get();
        la1Var2.getClass();
        this.j = la1Var2;
        AtomicReference atomicReference2 = new AtomicReference(null);
        la1 la1Var3 = new la1();
        la1Var3.c = new qxb();
        pa1 pa1Var2 = new pa1(la1Var3);
        la1Var3.b = pa1Var2;
        la1Var3.a = kv2.class;
        try {
            atomicReference2.set(la1Var3);
            la1Var3.a = str.concat("-status");
        } catch (Exception e2) {
            pa1Var2.a(e2);
        }
        this.h = pa1Var2;
        a90 a90Var = new a90(3, la1Var2, pa1Var);
        int i = 0;
        pa1Var2.b(new w36(i, pa1Var2, a90Var), g94.a());
        la1 la1Var4 = (la1) atomicReference2.get();
        la1Var4.getClass();
        AtomicReference atomicReference3 = new AtomicReference(null);
        la1 la1Var5 = new la1();
        la1Var5.c = new qxb();
        pa1 pa1Var3 = new pa1(la1Var5);
        la1Var5.b = pa1Var3;
        la1Var5.a = kv2.class;
        try {
            atomicReference3.set(la1Var5);
            la1Var5.a = str.concat("-Surface");
        } catch (Exception e3) {
            pa1Var3.a(e3);
        }
        this.f = pa1Var3;
        la1 la1Var6 = (la1) atomicReference3.get();
        la1Var6.getClass();
        this.g = la1Var6;
        vx6 vx6Var = new vx6(this, size);
        this.k = vx6Var;
        m88 m88VarJ = bm8.J(vx6Var.e);
        pa1Var3.b(new w36(i, pa1Var3, new ta0(m88VarJ, la1Var4, str, 4)), g94.a());
        m88VarJ.b(new et3(this, 1), g94.a());
        g94 g94VarA = g94.a();
        AtomicReference atomicReference4 = new AtomicReference(null);
        pa1 pa1VarT = y41.t(new bo1(24, this, atomicReference4));
        pa1VarT.b(new w36(i, pa1VarT, new vrb(6, daeVar)), g94VarA);
        la1 la1Var7 = (la1) atomicReference4.get();
        la1Var7.getClass();
        this.i = la1Var7;
    }

    public final void a(final Surface surface, Executor executor, final yl2 yl2Var) {
        final int i = 0;
        if (!surface.isValid()) {
            executor.execute(new Runnable() { // from class: tae
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    Surface surface2 = surface;
                    yl2 yl2Var2 = yl2Var;
                    switch (i2) {
                        case 0:
                            yl2Var2.accept(new kq0(2, surface2));
                            break;
                        case 1:
                            yl2Var2.accept(new kq0(3, surface2));
                            break;
                        default:
                            yl2Var2.accept(new kq0(4, surface2));
                            break;
                    }
                }
            });
            return;
        }
        if (!this.g.b(surface)) {
            pa1 pa1Var = this.f;
            if (!pa1Var.isCancelled()) {
                ok8.o(null, pa1Var.b.isDone());
                try {
                    pa1Var.get();
                    final int i2 = 1;
                    executor.execute(new Runnable() { // from class: tae
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i3 = i2;
                            Surface surface2 = surface;
                            yl2 yl2Var2 = yl2Var;
                            switch (i3) {
                                case 0:
                                    yl2Var2.accept(new kq0(2, surface2));
                                    break;
                                case 1:
                                    yl2Var2.accept(new kq0(3, surface2));
                                    break;
                                default:
                                    yl2Var2.accept(new kq0(4, surface2));
                                    break;
                            }
                        }
                    });
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    final int i3 = 2;
                    executor.execute(new Runnable() { // from class: tae
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i4 = i3;
                            Surface surface2 = surface;
                            yl2 yl2Var2 = yl2Var;
                            switch (i4) {
                                case 0:
                                    yl2Var2.accept(new kq0(2, surface2));
                                    break;
                                case 1:
                                    yl2Var2.accept(new kq0(3, surface2));
                                    break;
                                default:
                                    yl2Var2.accept(new kq0(4, surface2));
                                    break;
                            }
                        }
                    });
                    return;
                }
            }
        }
        k47 k47Var = new k47(4, yl2Var, surface);
        pa1 pa1Var2 = this.h;
        pa1Var2.b(new w36(i, pa1Var2, k47Var), executor);
    }

    public final void b(Executor executor, vae vaeVar) {
        lq0 lq0Var;
        synchronized (this.a) {
            this.m = vaeVar;
            this.n = executor;
            lq0Var = this.l;
        }
        if (lq0Var != null) {
            executor.execute(new sae(vaeVar, lq0Var, 0));
        }
    }

    public final void c() {
        this.g.d(new ku3("Surface request will not complete."));
    }
}
