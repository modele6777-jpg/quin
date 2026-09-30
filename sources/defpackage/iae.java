package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class iae {
    public final int a;
    public final Matrix b;
    public final boolean c;
    public final Rect d;
    public final boolean e;
    public final int f;
    public final hq0 g;
    public int h;
    public int i;
    public wae k;
    public hae l;
    public boolean j = false;
    public final HashSet m = new HashSet();
    public boolean n = false;
    public final ArrayList o = new ArrayList();

    public iae(int i, int i2, hq0 hq0Var, Matrix matrix, boolean z, Rect rect, int i3, int i4, boolean z2) {
        this.f = i;
        this.a = i2;
        this.g = hq0Var;
        this.b = matrix;
        this.c = z;
        this.d = rect;
        this.i = i3;
        this.h = i4;
        this.e = z2;
        this.l = new hae(i2, hq0Var.a);
    }

    public final void a() {
        ok8.o("Edge is already closed.", !this.n);
    }

    public final void b() {
        p8c.m();
        this.l.a();
        this.n = true;
        this.o.clear();
        this.m.clear();
    }

    public final wae c(pg1 pg1Var, boolean z) {
        p8c.m();
        a();
        hq0 hq0Var = this.g;
        Size size = hq0Var.a;
        qr4 qr4Var = hq0Var.c;
        int i = 0;
        wae waeVar = new wae(size, pg1Var, z, qr4Var, new dae(this, i));
        try {
            vx6 vx6Var = waeVar.k;
            hae haeVar = this.l;
            if (haeVar.g(vx6Var, new cae(haeVar, i))) {
                bm8.J(haeVar.e).b(new eae(vx6Var, 0), g94.a());
            }
            this.k = waeVar;
            e();
            return waeVar;
        } catch (RuntimeException e) {
            waeVar.c();
            throw e;
        } catch (ju3 e2) {
            throw new AssertionError("Surface is somehow already closed", e2);
        }
    }

    public final void d() {
        boolean z;
        p8c.m();
        a();
        hae haeVar = this.l;
        p8c.m();
        if (haeVar.p == null) {
            synchronized (haeVar.a) {
                z = haeVar.c;
            }
            if (!z) {
                return;
            }
        }
        this.j = false;
        this.l.a();
        this.l = new hae(this.a, this.g.a);
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void e() {
        vae vaeVar;
        Executor executor;
        p8c.m();
        lq0 lq0Var = new lq0(this.d, this.i, this.h, this.c, this.b, this.e);
        wae waeVar = this.k;
        if (waeVar != null) {
            synchronized (waeVar.a) {
                waeVar.l = lq0Var;
                vaeVar = waeVar.m;
                executor = waeVar.n;
            }
            if (vaeVar != null && executor != null) {
                executor.execute(new sae(vaeVar, lq0Var, 1));
            }
        }
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((yl2) it.next()).accept(lq0Var);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurfaceEdge{targets=");
        sb.append(this.f);
        sb.append(", format=");
        sb.append(this.a);
        sb.append(", resolution=");
        sb.append(this.g.a);
        sb.append(", cropRect=");
        sb.append(this.d);
        sb.append(", rotationDegrees=");
        sb.append(this.i);
        sb.append(", mirroring=");
        sb.append(this.e);
        sb.append(", sensorToBufferTransform= ");
        Matrix matrix = this.b;
        sb.append(matrix);
        sb.append(", rotationInTransform= ");
        sb.append(s2f.b(matrix));
        sb.append(", isMirrorInTransform= ");
        sb.append(s2f.e(matrix));
        sb.append(", isClosed=");
        sb.append(this.n);
        sb.append('}');
        return sb.toString();
    }
}
