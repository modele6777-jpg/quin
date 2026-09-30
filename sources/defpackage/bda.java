package defpackage;

import java.util.List;
import java.util.Set;
import tech.chatmind.api.ArcanaGroup;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bda implements n26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    public /* synthetic */ bda(j09 j09Var, xw9 xw9Var, dvd dvdVar, List list, boolean z, suc sucVar, a26 a26Var, a26 a26Var2) {
        this.c = j09Var;
        this.g = xw9Var;
        this.d = dvdVar;
        this.e = list;
        this.b = z;
        this.v = sucVar;
        this.f = a26Var;
        this.w = a26Var2;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        e89 e89Var;
        int i = this.a;
        wef wefVar = wef.a;
        Object obj4 = this.w;
        Object obj5 = this.f;
        Object obj6 = this.v;
        Object obj7 = this.e;
        Object obj8 = this.d;
        Object obj9 = this.g;
        Object obj10 = this.c;
        boolean z = false;
        switch (i) {
            case 0:
                Set set = (Set) obj10;
                eda edaVar = (eda) obj9;
                aw2 aw2Var = (aw2) obj8;
                ted tedVar = (ted) obj7;
                h0e h0eVar = (h0e) obj6;
                e89 e89Var2 = (e89) obj5;
                s69 s69Var = (s69) obj4;
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    l46Var.Z();
                } else {
                    boolean z2 = this.b;
                    int size = z2 ? 1 : ((dda) h0eVar.getValue()).a.size();
                    boolean zI = l46Var.i(edaVar) | l46Var.i(aw2Var) | l46Var.g(tedVar);
                    Object objR = l46Var.R();
                    i8c i8cVar = sf2.a;
                    if (zI || objR == i8cVar) {
                        wca wcaVar = new wca(edaVar, aw2Var, tedVar, e89Var2, 0);
                        l46Var.p0(wcaVar);
                        objR = wcaVar;
                    }
                    a26 a26Var = (a26) objR;
                    boolean zI2 = l46Var.i(edaVar) | l46Var.i(aw2Var) | l46Var.g(tedVar);
                    Object objR2 = l46Var.R();
                    if (zI2 || objR2 == i8cVar) {
                        kf kfVar = new kf(edaVar, s69Var, aw2Var, tedVar, e89Var2, 17);
                        aw2Var = aw2Var;
                        e89Var = e89Var2;
                        l46Var.p0(kfVar);
                        objR2 = kfVar;
                    } else {
                        e89Var = e89Var2;
                    }
                    a26 a26Var2 = (a26) objR2;
                    boolean zI3 = l46Var.i(aw2Var) | l46Var.g(tedVar);
                    Object objR3 = l46Var.R();
                    if (zI3 || objR3 == i8cVar) {
                        objR3 = new xca(aw2Var, tedVar, e89Var, z ? 1 : 0);
                        l46Var.p0(objR3);
                    }
                    z7f.a(null, size, set, z2, false, null, false, a26Var, a26Var2, (x16) objR3, l46Var, 196656, 193);
                }
                break;
            case 1:
                bjc bjcVar = (bjc) obj9;
                jnc jncVar = (jnc) obj6;
                Set set2 = (Set) obj10;
                ArcanaGroup arcanaGroup = (ArcanaGroup) obj4;
                aw2 aw2Var2 = (aw2) obj8;
                ted tedVar2 = (ted) obj7;
                e89 e89Var3 = (e89) obj5;
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    l46Var2.Z();
                } else {
                    mh3.a(qd8.a.a(bjcVar), af1.b0(-1686855702, new dj3(this.b, jncVar, set2, arcanaGroup, aw2Var2, tedVar2, e89Var3), l46Var2), l46Var2, 48);
                }
                break;
            default:
                j09 j09Var = (j09) obj10;
                xw9 xw9Var = (xw9) obj9;
                dvd dvdVar = (dvd) obj8;
                List list = (List) obj7;
                suc sucVar = (suc) obj6;
                a26 a26Var3 = (a26) obj5;
                a26 a26Var4 = (a26) obj4;
                l46 l46Var3 = (l46) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((c31) obj).getClass();
                if (!l46Var3.W(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    l46Var3.Z();
                } else {
                    z7c.c(ynb.Y(j09Var, xw9Var), dvdVar, list, this.b, sucVar, 0.0f, a26Var3, a26Var4, l46Var3, 0, 64);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ bda(bjc bjcVar, boolean z, jnc jncVar, Set set, ArcanaGroup arcanaGroup, aw2 aw2Var, ted tedVar, e89 e89Var) {
        this.g = bjcVar;
        this.b = z;
        this.v = jncVar;
        this.c = set;
        this.w = arcanaGroup;
        this.d = aw2Var;
        this.e = tedVar;
        this.f = e89Var;
    }

    public /* synthetic */ bda(boolean z, Set set, eda edaVar, aw2 aw2Var, ted tedVar, h0e h0eVar, e89 e89Var, s69 s69Var) {
        this.b = z;
        this.c = set;
        this.g = edaVar;
        this.d = aw2Var;
        this.e = tedVar;
        this.v = h0eVar;
        this.f = e89Var;
        this.w = s69Var;
    }
}
