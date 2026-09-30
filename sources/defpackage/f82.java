package defpackage;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class f82 extends cp7 {
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f82(List list, int i) {
        super(list);
        this.h = i;
    }

    public static float j(bp7 bp7Var, float f) {
        Object obj = bp7Var.b;
        if (obj == null || bp7Var.c == null) {
            qc0.p("Missing values for keyframe.");
            return 0.0f;
        }
        float fFloatValue = bp7Var.i;
        if (fFloatValue == -3987645.8f) {
            fFloatValue = ((Float) obj).floatValue();
            bp7Var.i = fFloatValue;
        }
        float fFloatValue2 = bp7Var.j;
        if (fFloatValue2 == -3987645.8f) {
            fFloatValue2 = ((Float) bp7Var.c).floatValue();
            bp7Var.j = fFloatValue2;
        }
        return aw8.e(fFloatValue, fFloatValue2, f);
    }

    @Override // defpackage.du0
    public final Object e(bp7 bp7Var, float f) {
        int iIntValue;
        Object obj;
        switch (this.h) {
            case 0:
                return Integer.valueOf(k(bp7Var, f));
            case 1:
                return Float.valueOf(j(bp7Var, f));
            case 2:
                Object obj2 = bp7Var.b;
                if (obj2 == null) {
                    qc0.p("Missing values for keyframe.");
                    return null;
                }
                Object obj3 = bp7Var.c;
                if (obj3 == null) {
                    iIntValue = bp7Var.k;
                    if (iIntValue == 784923401) {
                        iIntValue = ((Integer) obj2).intValue();
                        bp7Var.k = iIntValue;
                    }
                } else {
                    int i = bp7Var.l;
                    if (i == 784923401) {
                        iIntValue = ((Integer) obj3).intValue();
                        bp7Var.l = iIntValue;
                    } else {
                        iIntValue = i;
                    }
                }
                int iIntValue2 = bp7Var.k;
                if (iIntValue2 == 784923401) {
                    iIntValue2 = ((Integer) obj2).intValue();
                    bp7Var.k = iIntValue2;
                }
                PointF pointF = aw8.a;
                return Integer.valueOf((int) ((f * (iIntValue - iIntValue2)) + iIntValue2));
            default:
                return (f != 1.0f || (obj = bp7Var.c) == null) ? (dg4) bp7Var.b : (dg4) obj;
        }
    }

    public float i() {
        return j(this.c.p(), b());
    }

    public int k(bp7 bp7Var, float f) {
        if (bp7Var.b != null && bp7Var.c != null) {
            return tm7.A(aw8.b(f, 0.0f, 1.0f), ((Integer) bp7Var.b).intValue(), ((Integer) bp7Var.c).intValue());
        }
        qc0.p("Missing values for keyframe.");
        return 0;
    }
}
