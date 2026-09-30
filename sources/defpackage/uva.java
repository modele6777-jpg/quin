package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uva {
    public final int a;
    public final oq0 b;
    public final Rect c;
    public final int d;
    public final int e;
    public final Matrix f;
    public final utb g;
    public final String h;
    public final m88 j;
    public int k = -1;
    public final ArrayList i = new ArrayList();

    public uva(hm1 hm1Var, oq0 oq0Var, utb utbVar, m88 m88Var, int i) {
        this.a = i;
        this.b = oq0Var;
        this.e = oq0Var.h;
        this.d = oq0Var.g;
        this.c = oq0Var.e;
        this.f = oq0Var.f;
        this.g = utbVar;
        this.h = String.valueOf(hm1Var.hashCode());
        List<so1> list = hm1Var.a;
        Objects.requireNonNull(list);
        for (so1 so1Var : list) {
            ArrayList arrayList = this.i;
            so1Var.getClass();
            arrayList.add(0);
        }
        this.j = m88Var;
        b21.q("ProcessingRequest", "ProcessingRequest: mRequestId = " + this.a + ", mTagBundleKey = " + this.h);
    }

    public final void a(int i) {
        if (this.k != i) {
            this.k = i;
            p8c.m();
            utb utbVar = this.g;
            if (utbVar.g) {
                return;
            }
            oq0 oq0Var = utbVar.a;
            oq0Var.c.execute(new ni(oq0Var, i));
        }
    }
}
