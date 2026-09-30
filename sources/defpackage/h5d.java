package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class h5d extends du0 {
    public final z4d h;
    public final Path i;
    public ArrayList j;

    public h5d(List list) {
        super(list);
        this.h = new z4d();
        this.i = new Path();
    }

    @Override // defpackage.du0
    public final Object e(bp7 bp7Var, float f) {
        int i;
        float f2;
        z4d z4dVar = (z4d) bp7Var.b;
        z4d z4dVar2 = (z4d) bp7Var.c;
        if (z4dVar2 == null) {
            z4dVar2 = z4dVar;
        }
        z4d z4dVar3 = this.h;
        ArrayList arrayList = z4dVar3.a;
        if (z4dVar3.b == null) {
            z4dVar3.b = new PointF();
        }
        boolean z = z4dVar.c;
        ArrayList arrayList2 = z4dVar.a;
        boolean z2 = true;
        z4dVar3.c = z || z4dVar2.c;
        int size = arrayList2.size();
        ArrayList arrayList3 = z4dVar2.a;
        if (size != arrayList3.size()) {
            gf8.b("Curves must have the same number of control points. Shape 1: " + arrayList2.size() + "\tShape 2: " + arrayList3.size());
        }
        int iMin = Math.min(arrayList2.size(), arrayList3.size());
        if (arrayList.size() < iMin) {
            for (int size2 = arrayList.size(); size2 < iMin; size2++) {
                arrayList.add(new r03());
            }
        } else if (arrayList.size() > iMin) {
            for (int size3 = arrayList.size() - 1; size3 >= iMin; size3--) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
        PointF pointF = z4dVar.b;
        PointF pointF2 = z4dVar2.b;
        float fE = aw8.e(pointF.x, pointF2.x, f);
        float fE2 = aw8.e(pointF.y, pointF2.y, f);
        PointF pointF3 = z4dVar3.b;
        if (pointF3 == null) {
            pointF3 = new PointF();
            z4dVar3.b = pointF3;
        }
        pointF3.set(fE, fE2);
        int size4 = arrayList.size() - 1;
        while (size4 >= 0) {
            r03 r03Var = (r03) arrayList2.get(size4);
            r03 r03Var2 = (r03) arrayList3.get(size4);
            PointF pointF4 = r03Var.a;
            PointF pointF5 = r03Var.b;
            PointF pointF6 = r03Var.c;
            PointF pointF7 = r03Var2.a;
            PointF pointF8 = r03Var2.b;
            PointF pointF9 = r03Var2.c;
            ((r03) arrayList.get(size4)).a.set(aw8.e(pointF4.x, pointF7.x, f), aw8.e(pointF4.y, pointF7.y, f));
            ((r03) arrayList.get(size4)).b.set(aw8.e(pointF5.x, pointF8.x, f), aw8.e(pointF5.y, pointF8.y, f));
            ((r03) arrayList.get(size4)).c.set(aw8.e(pointF6.x, pointF9.x, f), aw8.e(pointF6.y, pointF9.y, f));
            size4--;
            z2 = z2;
        }
        boolean z3 = z2;
        ArrayList arrayList4 = this.j;
        if (arrayList4 != null) {
            int size5 = arrayList4.size() - 1;
            while (true) {
                ArrayList arrayList5 = z4dVar3.a;
                if (size5 < 0) {
                    break;
                }
                c7c c7cVar = (c7c) this.j.get(size5);
                c7cVar.getClass();
                if (arrayList5.size() > 2) {
                    float fFloatValue = ((Float) c7cVar.b.d()).floatValue();
                    if (fFloatValue != 0.0f) {
                        boolean z4 = z4dVar3.c;
                        int size6 = arrayList5.size() - 1;
                        int i2 = 0;
                        while (size6 >= 0) {
                            r03 r03Var3 = (r03) arrayList5.get(size6);
                            r03 r03Var4 = (r03) arrayList5.get(c7c.d(size6 - 1, arrayList5.size()));
                            PointF pointF10 = (size6 != 0 || z4) ? r03Var4.c : z4dVar3.b;
                            i2 = (((size6 != 0 || z4) ? r03Var4.b : pointF10).equals(pointF10) && r03Var3.a.equals(pointF10) && !((z4dVar3.c || (size6 != 0 && size6 != arrayList5.size() + (-1))) ? false : z3)) ? i2 + 2 : i2 + 1;
                            size6--;
                        }
                        z4d z4dVar4 = c7cVar.c;
                        if (z4dVar4 == null || z4dVar4.a.size() != i2) {
                            ArrayList arrayList6 = new ArrayList(i2);
                            for (int i3 = 0; i3 < i2; i3++) {
                                arrayList6.add(new r03());
                            }
                            i = 0;
                            c7cVar.c = new z4d(new PointF(0.0f, 0.0f), false, arrayList6);
                        } else {
                            i = 0;
                        }
                        z4d z4dVar5 = c7cVar.c;
                        z4dVar5.c = z4;
                        PointF pointF11 = z4dVar3.b;
                        float f3 = pointF11.x;
                        float f4 = pointF11.y;
                        PointF pointF12 = z4dVar5.b;
                        if (pointF12 == null) {
                            pointF12 = new PointF();
                            z4dVar5.b = pointF12;
                        }
                        pointF12.set(f3, f4);
                        ArrayList arrayList7 = z4dVar5.a;
                        boolean z5 = z4dVar3.c;
                        int i4 = i;
                        int i5 = i4;
                        while (i4 < arrayList5.size()) {
                            r03 r03Var5 = (r03) arrayList5.get(i4);
                            r03 r03Var6 = (r03) arrayList5.get(c7c.d(i4 - 1, arrayList5.size()));
                            r03 r03Var7 = (r03) arrayList5.get(c7c.d(i4 - 2, arrayList5.size()));
                            PointF pointF13 = (i4 != 0 || z5) ? r03Var6.c : z4dVar3.b;
                            PointF pointF14 = (i4 != 0 || z5) ? r03Var6.b : pointF13;
                            PointF pointF15 = r03Var5.a;
                            PointF pointF16 = r03Var7.c;
                            int i6 = size5;
                            PointF pointF17 = r03Var5.c;
                            ArrayList arrayList8 = arrayList5;
                            boolean z6 = (z4dVar3.c || !(i4 == 0 || i4 == arrayList8.size() + (-1))) ? false : z3;
                            if (pointF14.equals(pointF13) && pointF15.equals(pointF13) && !z6) {
                                float f5 = pointF13.x;
                                float f6 = f5 - pointF16.x;
                                float f7 = pointF13.y;
                                float f8 = f7 - pointF16.y;
                                float f9 = pointF17.x - f5;
                                float f10 = pointF17.y - f7;
                                f2 = fFloatValue;
                                float fHypot = (float) Math.hypot(f6, f8);
                                float fHypot2 = (float) Math.hypot(f9, f10);
                                float fMin = Math.min(f2 / fHypot, 0.5f);
                                float fMin2 = Math.min(f2 / fHypot2, 0.5f);
                                float f11 = pointF13.x;
                                float fA = ks0.a(pointF16.x, f11, fMin, f11);
                                float f12 = pointF13.y;
                                float fA2 = ks0.a(pointF16.y, f12, fMin, f12);
                                float fA3 = ks0.a(pointF17.x, f11, fMin2, f11);
                                float fA4 = ks0.a(pointF17.y, f12, fMin2, f12);
                                float f13 = fA - ((fA - f11) * 0.5519f);
                                float f14 = fA2 - ((fA2 - f12) * 0.5519f);
                                float f15 = fA3 - ((fA3 - f11) * 0.5519f);
                                float f16 = fA4 - ((fA4 - f12) * 0.5519f);
                                r03 r03Var8 = (r03) arrayList7.get(c7c.d(i5 - 1, arrayList7.size()));
                                r03 r03Var9 = (r03) arrayList7.get(i5);
                                r03Var8.b.set(fA, fA2);
                                r03Var8.c.set(fA, fA2);
                                if (i4 == 0) {
                                    PointF pointF18 = z4dVar5.b;
                                    if (pointF18 == null) {
                                        pointF18 = new PointF();
                                        z4dVar5.b = pointF18;
                                    }
                                    pointF18.set(fA, fA2);
                                }
                                r03Var9.a.set(f13, f14);
                                r03 r03Var10 = (r03) arrayList7.get(i5 + 1);
                                r03Var9.b.set(f15, f16);
                                r03Var9.c.set(fA3, fA4);
                                r03Var10.a.set(fA3, fA4);
                                i5 += 2;
                            } else {
                                f2 = fFloatValue;
                                r03 r03Var11 = (r03) arrayList7.get(c7c.d(i5 - 1, arrayList7.size()));
                                r03 r03Var12 = (r03) arrayList7.get(i5);
                                PointF pointF19 = r03Var6.b;
                                r03Var11.b.set(pointF19.x, pointF19.y);
                                PointF pointF20 = r03Var6.c;
                                r03Var11.c.set(pointF20.x, pointF20.y);
                                PointF pointF21 = r03Var5.a;
                                r03Var12.a.set(pointF21.x, pointF21.y);
                                i5++;
                            }
                            i4++;
                            size5 = i6;
                            arrayList5 = arrayList8;
                            z4dVar3 = z4dVar3;
                            fFloatValue = f2;
                            z5 = z5;
                        }
                        z4dVar3 = z4dVar5;
                    }
                }
                size5--;
            }
        }
        Path path = this.i;
        path.reset();
        PointF pointF22 = z4dVar3.b;
        ArrayList arrayList9 = z4dVar3.a;
        path.moveTo(pointF22.x, pointF22.y);
        PointF pointF23 = aw8.a;
        pointF23.set(pointF22.x, pointF22.y);
        for (int i7 = 0; i7 < arrayList9.size(); i7++) {
            r03 r03Var13 = (r03) arrayList9.get(i7);
            PointF pointF24 = r03Var13.a;
            PointF pointF25 = r03Var13.b;
            PointF pointF26 = r03Var13.c;
            if (pointF24.equals(pointF23) && pointF25.equals(pointF26)) {
                path.lineTo(pointF26.x, pointF26.y);
            } else {
                path.cubicTo(pointF24.x, pointF24.y, pointF25.x, pointF25.y, pointF26.x, pointF26.y);
            }
            pointF23.set(pointF26.x, pointF26.y);
        }
        if (z4dVar3.c) {
            path.close();
        }
        return path;
    }

    @Override // defpackage.du0
    public final boolean h() {
        ArrayList arrayList = this.j;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }
}
