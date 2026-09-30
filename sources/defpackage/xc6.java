package defpackage;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xc6 extends cp7 {
    public final /* synthetic */ int h;
    public final Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc6(List list, int i) {
        super(list);
        this.h = i;
        switch (i) {
            case 1:
                super(list);
                this.i = new PointF();
                break;
            case 2:
                super(list);
                this.i = new fec(1.0f, 1.0f);
                break;
            default:
                int iMax = 0;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    wc6 wc6Var = (wc6) ((bp7) list.get(i2)).b;
                    if (wc6Var != null) {
                        iMax = Math.max(iMax, wc6Var.b.length);
                    }
                }
                this.i = new wc6(new float[iMax], new int[iMax]);
                break;
        }
    }

    @Override // defpackage.du0
    public final Object e(bp7 bp7Var, float f) {
        Object obj;
        int i = this.h;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                wc6 wc6Var = (wc6) obj2;
                wc6 wc6Var2 = (wc6) bp7Var.b;
                wc6 wc6Var3 = (wc6) bp7Var.c;
                int[] iArr = wc6Var.b;
                float[] fArr = wc6Var.a;
                boolean zEquals = wc6Var2.equals(wc6Var3);
                int[] iArr2 = wc6Var2.b;
                if (zEquals || f <= 0.0f) {
                    wc6Var.a(wc6Var2);
                } else if (f >= 1.0f) {
                    wc6Var.a(wc6Var3);
                } else {
                    int length = iArr2.length;
                    int[] iArr3 = wc6Var3.b;
                    if (length != iArr3.length) {
                        StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
                        sb.append(iArr2.length);
                        sb.append(" vs ");
                        qc0.j(tec.g(iArr3.length, ")", sb));
                        return null;
                    }
                    for (int i2 = 0; i2 < iArr2.length; i2++) {
                        fArr[i2] = aw8.e(wc6Var2.a[i2], wc6Var3.a[i2], f);
                        iArr[i2] = tm7.A(f, iArr2[i2], iArr3[i2]);
                    }
                    for (int length2 = iArr2.length; length2 < fArr.length; length2++) {
                        fArr[length2] = fArr[iArr2.length - 1];
                        iArr[length2] = iArr[iArr2.length - 1];
                    }
                }
                return wc6Var;
            case 1:
                return i(bp7Var, f, f);
            default:
                fec fecVar = (fec) obj2;
                Object obj3 = bp7Var.b;
                if (obj3 == null || (obj = bp7Var.c) == null) {
                    qc0.p("Missing values for keyframe.");
                    return null;
                }
                fec fecVar2 = (fec) obj3;
                fec fecVar3 = (fec) obj;
                float fE = aw8.e(fecVar2.a, fecVar3.a, f);
                float fE2 = aw8.e(fecVar2.b, fecVar3.b, f);
                fecVar.a = fE;
                fecVar.b = fE2;
                return fecVar;
        }
    }

    @Override // defpackage.du0
    public /* bridge */ /* synthetic */ Object f(bp7 bp7Var, float f, float f2, float f3) {
        switch (this.h) {
            case 1:
                return i(bp7Var, f2, f3);
            default:
                return super.f(bp7Var, f, f2, f3);
        }
    }

    public PointF i(bp7 bp7Var, float f, float f2) {
        Object obj;
        PointF pointF = (PointF) this.i;
        Object obj2 = bp7Var.b;
        if (obj2 == null || (obj = bp7Var.c) == null) {
            qc0.p("Missing values for keyframe.");
            return null;
        }
        PointF pointF2 = (PointF) obj2;
        PointF pointF3 = (PointF) obj;
        float f3 = pointF2.x;
        float fA = ks0.a(pointF3.x, f3, f, f3);
        float f4 = pointF2.y;
        pointF.set(fA, ks0.a(pointF3.y, f4, f2, f4));
        return pointF;
    }
}
