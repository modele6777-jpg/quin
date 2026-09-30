package defpackage;

import android.hardware.camera2.CaptureRequest;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class m0e extends gbe implements l26 {
    final /* synthetic */ lmb $revision$inlined;
    int label;
    final /* synthetic */ n0e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0e(xn2 xn2Var, n0e n0eVar, lmb lmbVar) {
        super(2, xn2Var);
        this.this$0 = n0eVar;
        this.$revision$inlined = lmbVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new m0e(xn2Var, this.this$0, this.$revision$inlined);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        boolean z;
        int i;
        int i2;
        boolean z2;
        Integer num;
        int i3;
        List listJ1;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        n0e n0eVar = this.this$0;
        long j = this.$revision$inlined.element;
        int i4 = 1;
        ajf ajfVar = n0eVar.e;
        if (ajfVar == null) {
            n0eVar.c(new ye1("Camera is not active."));
        } else {
            synchronized (n0eVar.d) {
                z = j == n0eVar.g;
            }
            if (z) {
                synchronized (n0eVar.d) {
                    i = n0eVar.h;
                    i2 = n0eVar.i;
                    z2 = n0eVar.j;
                    num = n0eVar.k;
                }
                int iD = n0eVar.d(i, z2, num);
                int i5 = 4;
                if (i2 != 1) {
                    i3 = i2 != 3 ? 4 : 3;
                }
                iy9 iy9Var = new iy9(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(mh3.H(n0eVar.a.b, iD)));
                CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
                yg1 yg1Var = n0eVar.a.b;
                yg1Var.getClass();
                if (mh3.B(yg1Var).contains(Integer.valueOf(i3))) {
                    i5 = i3;
                } else if (!mh3.B(yg1Var).contains(4)) {
                    i5 = mh3.B(yg1Var).contains(1) ? 1 : 0;
                }
                iy9 iy9Var2 = new iy9(key, Integer.valueOf(i5));
                CaptureRequest.Key key2 = CaptureRequest.CONTROL_AWB_MODE;
                yg1 yg1Var2 = n0eVar.a.b;
                yg1Var2.getClass();
                if (!mh3.C(yg1Var2).contains(1) && !mh3.C(yg1Var2).contains(1)) {
                    i4 = 0;
                }
                try {
                    dg7 dg7VarG = ajfVar.g(bm8.H(iy9Var, iy9Var2, new iy9(key2, Integer.valueOf(i4))), zif.b, yif.b);
                    synchronized (n0eVar.d) {
                        listJ1 = s72.j1(n0eVar.f);
                    }
                    ((rg7) dg7VarG).E(new h6b(29, listJ1, n0eVar));
                } catch (Exception e) {
                    n0eVar.c(e);
                }
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        m0e m0eVar = (m0e) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        m0eVar.r(wefVar);
        return wefVar;
    }
}
