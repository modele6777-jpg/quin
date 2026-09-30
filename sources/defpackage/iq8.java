package defpackage;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iq8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kq8 b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ v98 d;
    public final /* synthetic */ qp8 e;

    public /* synthetic */ iq8(kq8 kq8Var, Pair pair, v98 v98Var, qp8 qp8Var, int i) {
        this.a = i;
        this.b = kq8Var;
        this.c = pair;
        this.d = v98Var;
        this.e = qp8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        qp8 qp8Var = this.e;
        v98 v98Var = this.d;
        Pair pair = this.c;
        kq8 kq8Var = this.b;
        switch (i) {
            case 0:
                kq8Var.b.i.j(((Integer) pair.first).intValue(), (zp8) pair.second, v98Var, qp8Var);
                break;
            default:
                kq8Var.b.i.m(((Integer) pair.first).intValue(), (zp8) pair.second, v98Var, qp8Var);
                break;
        }
    }
}
