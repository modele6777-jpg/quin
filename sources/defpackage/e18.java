package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class e18 implements erd {
    public final /* synthetic */ j18 a;
    public final /* synthetic */ frd b;

    public e18(j18 j18Var, frd frdVar) {
        this.a = j18Var;
        this.b = frdVar;
    }

    @Override // defpackage.erd
    public final float a(float f, float f2) {
        float fAbs = Math.abs(f2);
        List list = this.a.h().l;
        int i = 0;
        if (!list.isEmpty()) {
            int size = list.size();
            int size2 = list.size();
            int i2 = 0;
            while (i < size2) {
                i2 += ((c18) list.get(i)).p;
                i++;
            }
            i = i2 / size;
        }
        float f3 = fAbs - i;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        return Math.signum(f2) * f3;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b6  */
    @Override // defpackage.erd
    public final float b(float f) {
        j18 j18Var = this.a;
        List list = j18Var.h().l;
        int size = list.size();
        float f2 = Float.POSITIVE_INFINITY;
        float f3 = Float.NEGATIVE_INFINITY;
        for (int i = 0; i < size; i++) {
            c18 c18Var = (c18) list.get(i);
            c18 c18Var2 = c18Var != null ? c18Var : null;
            if (c18Var2 == null || !c18Var2.v) {
                b18 b18VarH = j18Var.h();
                int i2 = (int) (b18VarH.p == ks9.a ? b18VarH.i() & 4294967295L : b18VarH.i() >> 32);
                int i3 = -j18Var.h().m;
                int i4 = j18Var.h().q;
                int i5 = c18Var.p;
                int i6 = c18Var.o;
                int i7 = j18Var.h().o;
                float fG = i6 - this.b.g(i2, i5, i3, i4);
                if (fG <= 0.0f && fG > f3) {
                    f3 = fG;
                }
                if (fG >= 0.0f && fG < f2) {
                    f2 = fG;
                }
            }
        }
        char c = Math.abs(f) >= ((b18) j18Var.f.getValue()).i.p0(400.0f) ? f > 0.0f ? (char) 1 : (char) 2 : (char) 0;
        if (c == 0) {
            if (Math.abs(f2) <= Math.abs(f3)) {
                f3 = f2;
            }
        } else if (c == 1) {
            f3 = f2;
        } else if (c != 2) {
            f3 = 0.0f;
        }
        if (f3 == Float.POSITIVE_INFINITY || f3 == Float.NEGATIVE_INFINITY) {
            return 0.0f;
        }
        return f3;
    }
}
