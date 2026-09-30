package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ka2 implements Iterator {
    public int a;
    public int b;
    public int c;
    public final /* synthetic */ na2 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ na2 f;

    public ka2(na2 na2Var, int i) {
        this.e = i;
        this.f = na2Var;
        this.d = na2Var;
        this.a = na2Var.e;
        this.b = na2Var.isEmpty() ? -1 : 0;
        this.c = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object ma2Var;
        na2 na2Var = this.d;
        if (na2Var.e != this.a) {
            qc0.e();
            return null;
        }
        if (!hasNext()) {
            s8f.c();
            return null;
        }
        int i = this.b;
        this.c = i;
        int i2 = this.e;
        na2 na2Var2 = this.f;
        switch (i2) {
            case 0:
                ma2Var = na2Var2.l()[i];
                break;
            case 1:
                ma2Var = new ma2(na2Var2, i);
                break;
            default:
                ma2Var = na2Var2.m()[i];
                break;
        }
        int i3 = this.b + 1;
        if (i3 >= na2Var.f) {
            i3 = -1;
        }
        this.b = i3;
        return ma2Var;
    }

    @Override // java.util.Iterator
    public final void remove() {
        na2 na2Var = this.d;
        if (na2Var.e != this.a) {
            qc0.e();
            return;
        }
        pa7.I("no calls to next() since the last call to remove()", this.c >= 0);
        this.a += 32;
        int i = this.c;
        Object obj = na2.x;
        na2Var.remove(na2Var.l()[i]);
        this.b--;
        this.c = -1;
    }
}
