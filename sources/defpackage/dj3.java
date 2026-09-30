package defpackage;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import java.util.List;
import java.util.Set;
import tech.chatmind.api.ArcanaGroup;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dj3 implements l26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;

    public /* synthetic */ dj3(dd2 dd2Var, x16 x16Var, x16 x16Var2, x16 x16Var3, x16 x16Var4, x16 x16Var5, boolean z, int i) {
        this.e = dd2Var;
        this.c = x16Var;
        this.d = x16Var2;
        this.f = x16Var3;
        this.g = x16Var4;
        this.v = x16Var5;
        this.b = z;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        final aw2 aw2Var;
        final e89 e89Var;
        final jnc jncVar;
        int i = this.a;
        i8c i8cVar = sf2.a;
        int i2 = 6;
        int i3 = 1;
        wef wefVar = wef.a;
        Object obj3 = this.v;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.d;
        Object obj7 = this.c;
        Object obj8 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                xj3.l((List) obj8, (cs3) obj5, (bhe) obj4, this.b, (x16) obj7, (x16) obj6, (j09) obj3, (l46) obj, k99.P(1));
                break;
            case 1:
                dd2 dd2Var = (dd2) obj8;
                String str = (String) obj5;
                e83 e83Var = (e83) obj4;
                x16 x16Var = (x16) obj7;
                x16 x16Var2 = (x16) obj6;
                a26 a26Var = (a26) obj3;
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    FillElement fillElement = b.c;
                    long j = y72.j;
                    boolean z = this.b;
                    xdc.a(fillElement, dd2Var, af1.b0(-631281047, new l30(str, e83Var, z, x16Var, x16Var2), l46Var), null, null, 0, j, 0L, null, af1.b0(530801247, new sg(e83Var, z, a26Var, i2), l46Var), l46Var, 806879622, 440);
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                cgg.i((mfc) obj5, (List) obj8, (wp9) obj4, (x16) obj7, (a26) obj3, (x16) obj6, this.b, (l46) obj, k99.P(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                jfb.d((List) obj8, (List) obj5, (use) obj4, (u47) obj3, this.b, (x16) obj7, (x16) obj6, (l46) obj, k99.P(3121));
                break;
            case 4:
                ((Integer) obj2).getClass();
                jzb.b((mic) obj5, this.b, (List) obj8, (x16) obj7, (x16) obj6, (a26) obj4, (x16) obj3, (l46) obj, k99.P(1));
                break;
            case 5:
                jnc jncVar2 = (jnc) obj8;
                Set set = (Set) obj5;
                ArcanaGroup arcanaGroup = (ArcanaGroup) obj4;
                aw2 aw2Var2 = (aw2) obj7;
                final ted tedVar = (ted) obj6;
                e89 e89Var2 = (e89) obj3;
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                } else {
                    boolean z2 = this.b;
                    int size = z2 ? 1 : jncVar2.d.size();
                    if (!z2) {
                        set = xu4.a;
                    }
                    Set set2 = set;
                    boolean z3 = !z2;
                    boolean zI = l46Var2.i(jncVar2) | l46Var2.i(aw2Var2) | l46Var2.g(tedVar);
                    Object objR = l46Var2.R();
                    if (zI || objR == i8cVar) {
                        aw2Var = aw2Var2;
                        e89Var = e89Var2;
                        jncVar = jncVar2;
                        final int i4 = 0;
                        a26 a26Var2 = new a26() { // from class: enc
                            @Override // defpackage.a26
                            public final Object d(Object obj9) {
                                int i5 = i4;
                                wef wefVar2 = wef.a;
                                e89 e89Var3 = e89Var;
                                ted tedVar2 = tedVar;
                                aw2 aw2Var3 = aw2Var;
                                jnc jncVar3 = jncVar;
                                switch (i5) {
                                    case 0:
                                        List list = (List) obj9;
                                        list.getClass();
                                        jncVar3.h(list);
                                        ynb.V(aw2Var3, null, null, new hnc(tedVar2, e89Var3, null), 3);
                                        break;
                                    default:
                                        TarotCardChoice tarotCardChoice = (TarotCardChoice) obj9;
                                        tarotCardChoice.getClass();
                                        jncVar3.h(t72.H(tarotCardChoice));
                                        ynb.V(aw2Var3, null, null, new hnc(tedVar2, e89Var3, null), 3);
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var2.p0(a26Var2);
                        objR = a26Var2;
                    } else {
                        aw2Var = aw2Var2;
                        jncVar = jncVar2;
                        e89Var = e89Var2;
                    }
                    a26 a26Var3 = (a26) objR;
                    boolean zI2 = l46Var2.i(jncVar) | l46Var2.i(aw2Var) | l46Var2.g(tedVar);
                    Object objR2 = l46Var2.R();
                    if (zI2 || objR2 == i8cVar) {
                        final int i5 = 1;
                        a26 a26Var4 = new a26() { // from class: enc
                            @Override // defpackage.a26
                            public final Object d(Object obj9) {
                                int i6 = i5;
                                wef wefVar2 = wef.a;
                                e89 e89Var3 = e89Var;
                                ted tedVar2 = tedVar;
                                aw2 aw2Var3 = aw2Var;
                                jnc jncVar3 = jncVar;
                                switch (i6) {
                                    case 0:
                                        List list = (List) obj9;
                                        list.getClass();
                                        jncVar3.h(list);
                                        ynb.V(aw2Var3, null, null, new hnc(tedVar2, e89Var3, null), 3);
                                        break;
                                    default:
                                        TarotCardChoice tarotCardChoice = (TarotCardChoice) obj9;
                                        tarotCardChoice.getClass();
                                        jncVar3.h(t72.H(tarotCardChoice));
                                        ynb.V(aw2Var3, null, null, new hnc(tedVar2, e89Var3, null), 3);
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var2.p0(a26Var4);
                        objR2 = a26Var4;
                    }
                    a26 a26Var5 = (a26) objR2;
                    boolean zI3 = l46Var2.i(aw2Var) | l46Var2.g(tedVar);
                    Object objR3 = l46Var2.R();
                    if (zI3 || objR3 == i8cVar) {
                        objR3 = new xca(aw2Var, tedVar, e89Var, i3);
                        l46Var2.p0(objR3);
                    }
                    z7f.a(null, size, set2, z2, false, arcanaGroup, z3, a26Var3, a26Var5, (x16) objR3, l46Var2, 196656, 1);
                }
                break;
            case 6:
                fpc fpcVar = (fpc) obj8;
                String str2 = (String) obj5;
                String str3 = (String) obj4;
                String str4 = (String) obj3;
                x16 x16Var3 = (x16) obj7;
                x16 x16Var4 = (x16) obj6;
                l46 l46Var3 = (l46) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!l46Var3.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    l46Var3.Z();
                } else {
                    j09 j09VarR = b.r(mh3.N(ynb.a0(tm7.n(b.c(g09.a, 1.0f), gec.N(0.0f, 14, t72.I(new y72(y72.j), new y72(bx5.g(l46Var3)))), null, 6), 24.0f, 16.0f)));
                    boolean z4 = fpcVar != null;
                    boolean z5 = this.b;
                    boolean zH = l46Var3.h(z5) | l46Var3.g(str2) | l46Var3.g(str3) | l46Var3.g(str4) | l46Var3.g(x16Var3);
                    Object objR4 = l46Var3.R();
                    if (zH || objR4 == i8cVar) {
                        h20 h20Var = new h20(x16Var3, str2, str3, str4, z5, 3);
                        l46Var3.p0(h20Var);
                        objR4 = h20Var;
                    }
                    z7c.a(z4, (x16) objR4, x16Var4, j09VarR, l46Var3, 0);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                hcc.b((dd2) obj8, (x16) obj7, (x16) obj6, (x16) obj5, (x16) obj4, (x16) obj3, this.b, (l46) obj, k99.P(1572871));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ dj3(dd2 dd2Var, String str, e83 e83Var, boolean z, x16 x16Var, x16 x16Var2, a26 a26Var) {
        this.e = dd2Var;
        this.f = str;
        this.g = e83Var;
        this.b = z;
        this.c = x16Var;
        this.d = x16Var2;
        this.v = a26Var;
    }

    public /* synthetic */ dj3(mfc mfcVar, List list, wp9 wp9Var, x16 x16Var, a26 a26Var, x16 x16Var2, boolean z, int i) {
        this.f = mfcVar;
        this.e = list;
        this.g = wp9Var;
        this.c = x16Var;
        this.v = a26Var;
        this.d = x16Var2;
        this.b = z;
    }

    public /* synthetic */ dj3(mic micVar, boolean z, List list, x16 x16Var, x16 x16Var2, a26 a26Var, x16 x16Var3, int i) {
        this.f = micVar;
        this.b = z;
        this.e = list;
        this.c = x16Var;
        this.d = x16Var2;
        this.g = a26Var;
        this.v = x16Var3;
    }

    public /* synthetic */ dj3(fpc fpcVar, boolean z, String str, String str2, String str3, x16 x16Var, x16 x16Var2) {
        this.e = fpcVar;
        this.b = z;
        this.f = str;
        this.g = str2;
        this.v = str3;
        this.c = x16Var;
        this.d = x16Var2;
    }

    public /* synthetic */ dj3(List list, cs3 cs3Var, bhe bheVar, boolean z, x16 x16Var, x16 x16Var2, j09 j09Var, int i) {
        this.e = list;
        this.f = cs3Var;
        this.g = bheVar;
        this.b = z;
        this.c = x16Var;
        this.d = x16Var2;
        this.v = j09Var;
    }

    public /* synthetic */ dj3(List list, List list2, use useVar, u47 u47Var, boolean z, x16 x16Var, x16 x16Var2, int i) {
        this.e = list;
        this.f = list2;
        this.g = useVar;
        this.v = u47Var;
        this.b = z;
        this.c = x16Var;
        this.d = x16Var2;
    }

    public /* synthetic */ dj3(boolean z, jnc jncVar, Set set, ArcanaGroup arcanaGroup, aw2 aw2Var, ted tedVar, e89 e89Var) {
        this.b = z;
        this.e = jncVar;
        this.f = set;
        this.g = arcanaGroup;
        this.c = aw2Var;
        this.d = tedVar;
        this.v = e89Var;
    }
}
