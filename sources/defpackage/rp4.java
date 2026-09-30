package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rp4 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rp4(Object obj, int i, int i2, int i3) {
        this.a = i3;
        this.d = obj;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.c;
        int i3 = this.b;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                yg0 yg0Var = (yg0) obj;
                yg0Var.getClass();
                ((l26) obj2).z(Integer.valueOf((i3 * 4) + i2), yg0Var);
                return wefVar;
            case 1:
                zt ztVar = (zt) obj2;
                oy9 oy9Var = (oy9) obj;
                tt ttVar = oy9Var.a;
                int iD = oy9Var.d(i3);
                int iD2 = oy9Var.d(i2);
                CharSequence charSequence = ttVar.e;
                if (iD < 0 || iD > iD2 || iD2 > charSequence.length()) {
                    int length = charSequence.length();
                    StringBuilder sbN = ib8.n(iD, iD2, "start(", ") or end(", ") is out of range [0..");
                    sbN.append(length);
                    sbN.append("], or start > end!");
                    j37.a(sbN.toString());
                }
                Path path = new Path();
                qte qteVar = ttVar.d;
                qteVar.f.getSelectionPath(iD, iD2, path);
                int i4 = qteVar.h;
                if (i4 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i4);
                }
                zt ztVar2 = new zt(path);
                ztVar2.m((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(oy9Var.f)) & 4294967295L));
                zt.a(ztVar, ztVar2);
                return wefVar;
            default:
                ArrayList arrayList = (ArrayList) obj2;
                bea beaVar = (bea) obj;
                Float fValueOf = Float.valueOf(0.8f);
                Float fValueOf2 = Float.valueOf(0.4f);
                beaVar.getClass();
                if (!arrayList.isEmpty()) {
                    List listI = t72.I(new iy9(Float.valueOf(0.18f), fValueOf2), new iy9(Float.valueOf(0.5f), Float.valueOf(0.15f)), new iy9(Float.valueOf(0.82f), fValueOf2), new iy9(Float.valueOf(0.3f), fValueOf), new iy9(Float.valueOf(0.7f), fValueOf));
                    int i5 = 0;
                    for (Object obj3 : s72.c1(arrayList, 5)) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            t72.Z();
                            throw null;
                        }
                        cea ceaVar = (cea) obj3;
                        iy9 iy9Var = (iy9) listI.get(i5);
                        beaVar.k(ceaVar, (int) ((i3 * ((Number) iy9Var.a()).floatValue()) - (ceaVar.a / 2)), (int) ((i2 * ((Number) iy9Var.b()).floatValue()) - (ceaVar.b / 2)), 0.0f);
                        i5 = i6;
                    }
                    if (arrayList.size() > 5) {
                        cea ceaVar2 = (cea) arrayList.get(5);
                        beaVar.k(ceaVar2, (i3 / 2) - (ceaVar2.a / 2), (i2 / 2) - (ceaVar2.b / 2), 0.0f);
                    }
                }
                return wefVar;
        }
    }
}
