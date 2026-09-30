package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zv1 extends cw1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(zv1.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;
    public final yv1 d;
    public final boolean e;

    public /* synthetic */ zv1(yv1 yv1Var, boolean z) {
        this(yv1Var, z, nu4.a, -3, i41.a);
    }

    @Override // defpackage.cw1, defpackage.wj5
    public final Object b(xj5 xj5Var, xn2 xn2Var) throws Throwable {
        int i = this.b;
        bw2 bw2Var = bw2.a;
        if (i == -3) {
            boolean z = this.e;
            if (z && f.getAndSet(this, 1) == 1) {
                qc0.p("ReceiveChannel.consumeAsFlow can be collected just once");
                return null;
            }
            Object objH = db6.H(xj5Var, this.d, z, xn2Var);
            if (objH == bw2Var) {
                return objH;
            }
        } else {
            Object objB = super.b(xj5Var, xn2Var);
            if (objB == bw2Var) {
                return objB;
            }
        }
        return wef.a;
    }

    @Override // defpackage.cw1
    public final String e() {
        return "channel=" + this.d;
    }

    @Override // defpackage.cw1
    public final Object f(awa awaVar, xn2 xn2Var) throws Throwable {
        Object objH = db6.H(new byc(awaVar), this.d, this.e, xn2Var);
        return objH == bw2.a ? objH : wef.a;
    }

    @Override // defpackage.cw1
    public final cw1 g(pv2 pv2Var, int i, i41 i41Var) {
        return new zv1(this.d, this.e, pv2Var, i, i41Var);
    }

    @Override // defpackage.cw1
    public final wj5 j() {
        return new zv1(this.d, this.e);
    }

    @Override // defpackage.cw1
    public final yv1 k(aw2 aw2Var) {
        if (!this.e || f.getAndSet(this, 1) != 1) {
            return this.b == -3 ? this.d : super.k(aw2Var);
        }
        qc0.p("ReceiveChannel.consumeAsFlow can be collected just once");
        return null;
    }

    public zv1(yv1 yv1Var, boolean z, pv2 pv2Var, int i, i41 i41Var) {
        super(pv2Var, i, i41Var);
        this.d = yv1Var;
        this.e = z;
    }
}
