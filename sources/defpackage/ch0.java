package defpackage;

import coil3.compose.AsyncImagePainter$State$Error;
import coil3.compose.AsyncImagePainter$State$Success;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ch0 {
    public static final ch0 a = new ch0();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(aw6 aw6Var, sw6 sw6Var, zn2 zn2Var) {
        bh0 bh0Var;
        if (zn2Var instanceof bh0) {
            bh0Var = (bh0) zn2Var;
            int i = bh0Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bh0Var.label = i - Integer.MIN_VALUE;
            } else {
                bh0Var = new bh0(this, zn2Var);
            }
        } else {
            bh0Var = new bh0(this, zn2Var);
        }
        Object objB = bh0Var.result;
        int i2 = bh0Var.label;
        if (i2 == 0) {
            jzb.q(objB);
            bh0Var.L$0 = null;
            bh0Var.L$1 = sw6Var;
            bh0Var.label = 1;
            objB = ((mib) aw6Var).b(sw6Var, bh0Var);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sw6Var = (sw6) bh0Var.L$1;
            jzb.q(objB);
        }
        zw6 zw6Var = (zw6) objB;
        if (zw6Var instanceof k8e) {
            k8e k8eVar = (k8e) zw6Var;
            return new AsyncImagePainter$State$Success(cgg.p(k8eVar.a, sw6Var.a, 1), k8eVar);
        }
        if (!(zw6Var instanceof ly4)) {
            ap.c();
            return null;
        }
        ly4 ly4Var = (ly4) zw6Var;
        bv6 bv6Var = ly4Var.a;
        return new AsyncImagePainter$State$Error(bv6Var != null ? cgg.p(bv6Var, sw6Var.a, 1) : null, ly4Var);
    }
}
