package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mjc implements xn8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ e89 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;
    public final /* synthetic */ Integer h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ float j;
    public final /* synthetic */ float k;
    public final /* synthetic */ float l;
    public final /* synthetic */ List m;
    public final /* synthetic */ e89 n;
    public final /* synthetic */ e89 o;

    public mjc(int i, int i2, float f, e89 e89Var, float f2, float f3, float f4, Integer num, boolean z, float f5, float f6, float f7, List list, e89 e89Var2, e89 e89Var3) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = e89Var;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        this.h = num;
        this.i = z;
        this.j = f5;
        this.k = f6;
        this.l = f7;
        this.m = list;
        this.n = e89Var2;
        this.o = e89Var3;
    }

    @Override // defpackage.xn8
    public final yn8 b(zn8 zn8Var, List list, long j) {
        list.getClass();
        final ArrayList arrayList = new ArrayList(t72.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tn8 tn8Var = (tn8) it.next();
            int i = this.a;
            boolean z = i >= 0;
            int i2 = this.b;
            if (!((i2 >= 0) & z)) {
                k37.a("width and height must be >= 0");
            }
            arrayList.add(tn8Var.v(ll2.h(i, i, i2, i2)));
        }
        final int iH = kl2.h(j);
        final int iG = kl2.g(j);
        final float f = this.c;
        final e89 e89Var = this.d;
        final float f2 = this.e;
        final float f3 = this.f;
        final float f4 = this.g;
        final Integer num = this.h;
        final boolean z2 = this.i;
        final float f5 = this.j;
        final float f6 = this.k;
        final float f7 = this.l;
        final List list2 = this.m;
        final e89 e89Var2 = this.n;
        final e89 e89Var3 = this.o;
        return zn8Var.n0(iH, iG, qu4.a, new a26() { // from class: ljc
            @Override // defpackage.a26
            public final Object d(Object obj) {
                bea beaVar = (bea) obj;
                beaVar.getClass();
                float f8 = iH * 0.5f;
                float f9 = iG / f;
                e89Var.setValue(new hl9((((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f9)) & 4294967295L)));
                ArrayList arrayList2 = new ArrayList();
                int i3 = 0;
                for (Object obj2 : arrayList) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        t72.Z();
                        throw null;
                    }
                    cea ceaVar = (cea) obj2;
                    float f10 = (-i3) * f2;
                    float f11 = f3;
                    float f12 = f4;
                    float radians = (float) Math.toRadians(f10 + f11 + f12);
                    Integer num2 = (Integer) e89Var2.getValue();
                    boolean z3 = num2 != null && i3 == num2.intValue();
                    Integer num3 = num;
                    boolean z4 = num3 != null && i3 == num3.intValue() && z2;
                    float f13 = f7 + (z3 ? f5 * f6 : 0.0f);
                    float f14 = f8;
                    float f15 = f9;
                    double d = radians;
                    float fCos = (((float) Math.cos(d)) * f13) + f14;
                    float fSin = (f13 * ((float) Math.sin(d))) + f15;
                    float f16 = (!z3 || z4) ? fCos : Float.MAX_VALUE;
                    beaVar.k(ceaVar, ym8.L(fCos) - (ceaVar.a / 2), ym8.L(fSin) - (ceaVar.b / 2), f16);
                    arrayList2.add(new cjc(i3, fCos, fSin, ceaVar.a, ceaVar.b, f10 + f12 + f11 + 90.0f, f16, list2.contains(Integer.valueOf(i3))));
                    i3 = i4;
                    f8 = f14;
                    f9 = f15;
                }
                if (!arrayList2.isEmpty()) {
                    e89Var3.setValue(arrayList2);
                }
                return wef.a;
            }
        });
    }
}
