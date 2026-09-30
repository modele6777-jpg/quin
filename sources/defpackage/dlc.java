package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import java.util.List;
import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dlc implements n26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ a26 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    public /* synthetic */ dlc(xn5 xn5Var, a26 a26Var, erc ercVar, use useVar, String str, SolarTerm solarTerm, boolean z, boolean z2) {
        this.e = ercVar;
        this.f = useVar;
        this.b = z;
        this.c = z2;
        this.g = solarTerm;
        this.v = str;
        this.d = a26Var;
        this.w = xn5Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        wef wefVar = wef.a;
        Object obj4 = this.w;
        Object obj5 = this.v;
        Object obj6 = this.g;
        Object obj7 = this.f;
        Object obj8 = this.e;
        switch (i) {
            case 0:
                final erc ercVar = (erc) obj8;
                final use useVar = (use) obj7;
                final SolarTerm solarTerm = (SolarTerm) obj6;
                final String str = (String) obj5;
                final xn5 xn5Var = (xn5) obj4;
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((oz) obj).getClass();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    l46Var.Z();
                } else {
                    j09 j09VarC = b.c(g09.a, 1.0f);
                    boolean z = !(ercVar instanceof drc);
                    boolean zI = l46Var.i(ercVar);
                    final boolean z2 = this.b;
                    boolean zH = zI | l46Var.h(z2);
                    final boolean z3 = this.c;
                    boolean zH2 = zH | l46Var.h(z3) | l46Var.e(solarTerm.ordinal()) | l46Var.g(str) | l46Var.g(useVar);
                    final a26 a26Var = this.d;
                    boolean zG = zH2 | l46Var.g(a26Var) | l46Var.i(xn5Var);
                    Object objR = l46Var.R();
                    if (zG || objR == sf2.a) {
                        x16 x16Var = new x16() { // from class: wkc
                            @Override // defpackage.x16
                            public final Object invoke() {
                                use useVar2 = useVar;
                                jlc.c(ercVar, z2, z3, useVar2, a26Var, xn5Var, solarTerm, str, useVar2.d().c.toString());
                                return wef.a;
                            }
                        };
                        l46Var.p0(x16Var);
                        objR = x16Var;
                    }
                    rs0.b(j09VarC, z, useVar, false, false, false, 200, false, false, R.string.seasonal_follow_up_input_placeholder, false, false, null, null, false, false, null, null, (x16) objR, l46Var, 1572870, 6, 260536);
                }
                break;
            default:
                j09 j09Var = (j09) obj8;
                dvd dvdVar = (dvd) obj7;
                List list = (List) obj6;
                suc sucVar = (suc) obj5;
                a26 a26Var2 = (a26) obj4;
                xw9 xw9Var = (xw9) obj;
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                xw9Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= l46Var2.g(xw9Var) ? 4 : 2;
                }
                if (!l46Var2.W(1 & iIntValue2, (iIntValue2 & 19) != 18)) {
                    l46Var2.Z();
                } else {
                    bzd.l(null, this.b, 0L, null, null, af1.b0(-2024997852, new bda(j09Var, xw9Var, dvdVar, list, this.c, sucVar, this.d, a26Var2), l46Var2), l46Var2, 1572864, 61);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ dlc(boolean z, j09 j09Var, dvd dvdVar, List list, boolean z2, suc sucVar, a26 a26Var, a26 a26Var2) {
        this.b = z;
        this.e = j09Var;
        this.f = dvdVar;
        this.g = list;
        this.c = z2;
        this.v = sucVar;
        this.d = a26Var;
        this.w = a26Var2;
    }
}
