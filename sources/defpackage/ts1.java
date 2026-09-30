package defpackage;

import java.util.List;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ts1 implements o26 {
    public final /* synthetic */ List a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ xp1 c;
    public final /* synthetic */ h0e d;
    public final /* synthetic */ e89 e;

    public ts1(List list, boolean z, xp1 xp1Var, h0e h0eVar, e89 e89Var) {
        this.a = list;
        this.b = z;
        this.c = xp1Var;
        this.d = h0eVar;
        this.e = e89Var;
    }

    @Override // defpackage.o26
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        vw7 vw7Var = (vw7) obj;
        int iIntValue = ((Number) obj2).intValue();
        l46 l46Var = (l46) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (l46Var.g(vw7Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= l46Var.e(iIntValue) ? 32 : 16;
        }
        if (l46Var.W(i & 1, (i & 147) != 146)) {
            zhe zheVar = (zhe) this.a.get(iIntValue);
            l46Var.f0(-1334317022);
            boolean z = ((eie) this.d.getValue()).a;
            boolean z2 = zheVar.d;
            e89 e89Var = this.e;
            boolean z3 = ((TarotCardType) e89Var.getValue()) == zheVar.a;
            boolean z4 = this.b;
            boolean zH = l46Var.h(z4);
            xp1 xp1Var = this.c;
            boolean zI = zH | l46Var.i(xp1Var);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (zI || objR == i8cVar) {
                objR = new ss1(z4, xp1Var, e89Var);
                l46Var.p0(objR);
            }
            a26 a26Var = (a26) objR;
            boolean zI2 = l46Var.i(xp1Var);
            Object objR2 = l46Var.R();
            if (zI2 || objR2 == i8cVar) {
                w wVar = new w(1, xp1Var, xp1.class, "onDirectionChanged", "onDirectionChanged(Ltech/chatmind/api/TarotCardType;)V", 0, 17);
                l46Var.p0(wVar);
                objR2 = wVar;
            }
            z7f.k(z, zheVar, z2, this.b, z3, a26Var, (a26) ((ym7) objR2), l46Var, 0);
            l46Var.r(false);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }
}
