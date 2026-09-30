package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class n0e implements sif, dkf {
    public final gh1 a;
    public final mm0 b;
    public final lkf c;
    public final Object d;
    public ajf e;
    public final ArrayList f;
    public long g;
    public int h;
    public int i;
    public boolean j;
    public Integer k;

    public n0e(gh1 gh1Var, mm0 mm0Var, lkf lkfVar) {
        gh1Var.getClass();
        lkfVar.getClass();
        this.a = gh1Var;
        this.b = mm0Var;
        this.c = lkfVar;
        this.d = new Object();
        this.f = new ArrayList();
        this.h = 2;
        this.i = 1;
    }

    @Override // defpackage.dkf
    public final void a(LinkedHashSet linkedHashSet) {
        ynb.V(this.c.f, null, null, new l0e(null, s72.o1(linkedHashSet), this), 3);
    }

    @Override // defpackage.sif
    public final void b(ajf ajfVar) {
        this.e = ajfVar;
        f();
    }

    public final void c(Exception exc) {
        List listJ1;
        synchronized (this.d) {
            listJ1 = s72.j1(this.f);
            this.f.clear();
        }
        Iterator it = listJ1.iterator();
        while (it.hasNext()) {
            ((za2) ((ya2) it.next())).i0(exc);
        }
    }

    public final int d(int i, boolean z, Integer num) {
        int iE;
        if (num != null) {
            iE = num.intValue();
        } else if (i != 0) {
            iE = i != 1 ? 1 : 3;
        } else {
            iE = this.b.e();
        }
        if (z && mh3.M(this.a.b)) {
            if (b21.F(3, "CXCP")) {
                Log.d("CXCP", "State3AControl.invalidate: trying external flash AE mode.");
            }
            iE = 5;
        }
        if (b21.F(3, "CXCP")) {
            Log.d("CXCP", "State3AControl.getFinalPreferredAeMode: preferAeMode = " + iE);
        }
        return iE;
    }

    public final int e() {
        int iH;
        synchronized (this.d) {
            iH = mh3.H(this.a.b, d(this.h, this.j, this.k));
        }
        return iH;
    }

    public final za2 f() {
        za2 za2Var = new za2();
        lmb lmbVar = new lmb();
        synchronized (this.d) {
            this.f.add(za2Var);
            long j = this.g + 1;
            this.g = j;
            lmbVar.element = j;
        }
        ynb.V(this.c.f, null, null, new m0e(null, this, lmbVar), 3);
        return za2Var;
    }

    @Override // defpackage.sif
    public final void reset() {
        synchronized (this.d) {
            this.j = false;
            this.k = null;
            this.h = 2;
            this.i = 1;
        }
        f();
    }
}
