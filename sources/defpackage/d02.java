package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d02 implements xn8 {
    public final /* synthetic */ v02 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ sw3 e;
    public final /* synthetic */ jx f;
    public final /* synthetic */ e89 g;
    public final /* synthetic */ e89 h;
    public final /* synthetic */ float i;
    public final /* synthetic */ float j;
    public final /* synthetic */ Integer k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ float m;
    public final /* synthetic */ float n;
    public final /* synthetic */ int[] o;
    public final /* synthetic */ List p;
    public final /* synthetic */ e89 q;
    public final /* synthetic */ e89 r;

    public d02(v02 v02Var, float f, int i, int i2, sw3 sw3Var, jx jxVar, e89 e89Var, e89 e89Var2, float f2, float f3, Integer num, boolean z, float f4, float f5, int[] iArr, List list, e89 e89Var3, e89 e89Var4) {
        this.a = v02Var;
        this.b = f;
        this.c = i;
        this.d = i2;
        this.e = sw3Var;
        this.f = jxVar;
        this.g = e89Var;
        this.h = e89Var2;
        this.i = f2;
        this.j = f3;
        this.k = num;
        this.l = z;
        this.m = f4;
        this.n = f5;
        this.o = iArr;
        this.p = list;
        this.q = e89Var3;
        this.r = e89Var4;
    }

    @Override // defpackage.xn8
    public final yn8 b(zn8 zn8Var, List list, long j) {
        int i;
        int iJ;
        list.getClass();
        final ArrayList arrayList = new ArrayList(t72.u(list, 10));
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            i = this.c;
            if (!zHasNext) {
                break;
            }
            tn8 tn8Var = (tn8) it.next();
            int i2 = this.d;
            if (!((i >= 0) & (i2 >= 0))) {
                k37.a("width and height must be >= 0");
            }
            arrayList.add(tn8Var.v(ll2.h(i2, i2, i, i)));
        }
        float f = this.b;
        int iG = (i / 2) + ((int) (f * 2.0f));
        v02 v02Var = this.a;
        v02 v02Var2 = v02.b;
        if (v02Var == v02Var2 && kl2.d(j)) {
            iJ = kl2.h(j);
        } else {
            iJ = kl2.j(j);
            if (iG >= iJ) {
                iJ = iG;
            }
        }
        if (v02Var == v02Var2 && kl2.c(j)) {
            iG = kl2.g(j);
        } else {
            int i3 = kl2.i(j);
            if (iG < i3) {
                iG = i3;
            }
        }
        final u02 u02Var = v02Var == v02Var2 ? new u02(iJ, iG, iJ, (i / 2.0f) + f) : new u02(iJ, iG, iJ - (i / 1.4f), iG / 1.6f);
        final sw3 sw3Var = this.e;
        final jx jxVar = this.f;
        final e89 e89Var = this.g;
        final e89 e89Var2 = this.h;
        final float f2 = this.i;
        final float f3 = this.j;
        final Integer num = this.k;
        final boolean z = this.l;
        final float f4 = this.m;
        final float f5 = this.n;
        final float f6 = this.b;
        final int[] iArr = this.o;
        final List list2 = this.p;
        final e89 e89Var3 = this.q;
        final e89 e89Var4 = this.r;
        return zn8Var.n0(u02Var.a, u02Var.b, qu4.a, new a26() { // from class: c02
            @Override // defpackage.a26
            public final Object d(Object obj) {
                bea beaVar = (bea) obj;
                beaVar.getClass();
                u02 u02Var2 = u02Var;
                float f7 = u02Var2.c;
                float f8 = u02Var2.d;
                int i4 = u02Var2.a;
                float f9 = i4 / 2.0f;
                int i5 = u02Var2.b;
                float f10 = i5 / 2.0f;
                float fP0 = sw3Var.p0(0.5f);
                float fFloatValue = ((Number) jxVar.e()).floatValue();
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f7)) << 32) | (((long) Float.floatToRawIntBits(f8)) & 4294967295L);
                wn7[] wn7VarArr = q02.a;
                e89Var.setValue(new hl9(jFloatToRawIntBits));
                e89Var2.setValue(new iy9(Integer.valueOf(i4), Integer.valueOf(i5)));
                ArrayList arrayList2 = new ArrayList();
                int i6 = 0;
                for (Object obj2 : arrayList) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        t72.Z();
                        throw null;
                    }
                    cea ceaVar = (cea) obj2;
                    float f11 = f2;
                    float f12 = (-i6) * f11;
                    float f13 = f3;
                    float f14 = (f12 - 80.0f) + f13;
                    float f15 = f7;
                    float f16 = f8;
                    float radians = (float) Math.toRadians(f14);
                    Integer num2 = (Integer) e89Var3.getValue();
                    boolean z2 = num2 != null && i6 == num2.intValue();
                    Integer num3 = num;
                    boolean z3 = num3 != null && i6 == num3.intValue() && z;
                    float f17 = f6 + (z2 ? f5 * f4 : 0.0f);
                    double d = radians;
                    float fCos = (f17 * ((float) Math.cos(d))) + f15;
                    float f18 = fP0;
                    float f19 = f10;
                    float fSin = (((float) Math.sin(d)) * f17) + f16;
                    float f20 = f19 - (iArr[i6] * f18);
                    float fA = ks0.a(fCos, f9, fFloatValue, f9);
                    float fA2 = ks0.a(fSin, f20, fFloatValue, f20);
                    float fD = q02.d(f14);
                    if (z2 && !z3) {
                        fD = Float.MAX_VALUE;
                    }
                    beaVar.k(ceaVar, ym8.L(fA) - (ceaVar.a / 2), ym8.L(fA2) - (ceaVar.b / 2), fD);
                    arrayList2.add(new vs1(i6, fA, fA2, ceaVar.a, ceaVar.b, f12 + f13 + f11, fD, list2.contains(Integer.valueOf(i6))));
                    f10 = f19;
                    i6 = i7;
                    f7 = f15;
                    f8 = f16;
                    fP0 = f18;
                }
                if (!arrayList2.isEmpty()) {
                    e89Var4.setValue(arrayList2);
                }
                return wef.a;
            }
        });
    }
}
