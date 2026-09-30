package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uf3 implements n26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public uf3(dd2 dd2Var, boolean z) {
        this.c = dd2Var;
        this.b = z;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        String strH;
        int i = this.a;
        wef wefVar = wef.a;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    l46Var.Z();
                } else {
                    ((dd2) obj4).z(l46Var, 0);
                    float f = v51.f;
                    g09 g09Var = g09.a;
                    o5c.f(l46Var, b.l(g09Var, f));
                    gx6 gx6VarB = z7f.n;
                    if (gx6VarB == null) {
                        fx6 fx6Var = new fx6("Filled.ArrowDropDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                        int i2 = msf.a;
                        dtd dtdVar = new dtd(y72.b);
                        ArrayList arrayList = new ArrayList(32);
                        arrayList.add(new p1a(7.0f, 10.0f));
                        arrayList.add(new w1a(5.0f, 5.0f));
                        arrayList.add(new w1a(5.0f, -5.0f));
                        arrayList.add(l1a.c);
                        fx6.a(fx6Var, arrayList, dtdVar, 1.0f, 1.0f, 2, 1.0f);
                        gx6VarB = fx6Var.b();
                        z7f.n = gx6VarB;
                    }
                    gx6 gx6Var = gx6VarB;
                    boolean z = this.b;
                    if (z) {
                        l46Var.f0(1509384391);
                        strH = tgc.h(R.string.m3c_date_picker_switch_to_day_selection, l46Var);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(1509478662);
                        strH = tgc.h(R.string.m3c_date_picker_switch_to_year_selection, l46Var);
                        l46Var.r(false);
                    }
                    gu6.a(gx6Var, strH, q6c.i(g09Var, z ? 180.0f : 0.0f), 0L, l46Var, 0, 8);
                }
                break;
            default:
                int iIntValue2 = ((Number) obj3).intValue();
                uod.a.b((gpd) obj, null, this.b, (pod) obj4, null, null, 0.0f, 0.0f, (l46) obj2, (iIntValue2 & 14) | 100663296);
                break;
        }
        return wefVar;
    }

    public uf3(pod podVar, boolean z) {
        this.b = z;
        this.c = podVar;
    }
}
