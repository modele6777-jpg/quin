package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fd0 implements Iterator, zm7 {
    public int a;
    public int b;
    public boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fd0(kd0 kd0Var, int i) {
        this(kd0Var.c);
        this.d = i;
        switch (i) {
            case 1:
                this.e = kd0Var;
                this(kd0Var.c);
                break;
            default:
                this.e = kd0Var;
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objF;
        if (!hasNext()) {
            s8f.c();
            return null;
        }
        int i = this.b;
        int i2 = this.d;
        Object obj = this.e;
        switch (i2) {
            case 0:
                objF = ((kd0) obj).f(i);
                break;
            case 1:
                objF = ((kd0) obj).i(i);
                break;
            default:
                objF = ((od0) obj).b[i];
                break;
        }
        this.b++;
        this.c = true;
        return objF;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            qc0.p("Call next() before removing an element.");
            return;
        }
        int i = this.b - 1;
        this.b = i;
        int i2 = this.d;
        Object obj = this.e;
        switch (i2) {
            case 0:
                ((kd0) obj).g(i);
                break;
            case 1:
                ((kd0) obj).g(i);
                break;
            default:
                ((od0) obj).c(i);
                break;
        }
        this.a--;
        this.c = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fd0(od0 od0Var) {
        this(od0Var.c);
        this.d = 2;
        this.e = od0Var;
    }

    public fd0(int i) {
        this.a = i;
    }
}
