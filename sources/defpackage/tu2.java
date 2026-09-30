package defpackage;

import ai.askquin.data.QuotaBlockReason;
import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.divination.k;
import java.time.LocalDate;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tu2 implements xj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ tu2(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        int i = this.a;
        boolean z = true;
        wef wefVar = wef.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                cre creVar = (cre) obj3;
                r38 r38Var = (r38) obj5;
                if (((Boolean) obj).booleanValue() && r38Var.b()) {
                    lmg.q0((gte) obj4, r38Var, creVar.l(), (rx6) obj2, creVar.b);
                } else {
                    lmg.f0(r38Var);
                }
                break;
            case 1:
                ((Number) obj).intValue();
                j18 j18Var = (j18) obj5;
                int iJ = j18Var.e.b.j() / 12;
                int iJ2 = (j18Var.e.b.j() % 12) + 1;
                int i2 = ((z67) obj2).a + iJ;
                l91 l91Var = (l91) ((j91) obj3);
                l91Var.getClass();
                ((a26) obj4).d(new Long(l91Var.e(LocalDate.of(i2, iJ2, 1)).e));
                break;
            case 2:
                l77 l77Var = (l77) obj;
                kmb kmbVar = (kmb) obj3;
                kmb kmbVar2 = (kmb) obj4;
                kmb kmbVar3 = (kmb) obj5;
                if (l77Var instanceof pta) {
                    kmbVar3.element++;
                } else if ((l77Var instanceof qta) || (l77Var instanceof ota)) {
                    kmbVar3.element--;
                } else if (l77Var instanceof yq6) {
                    kmbVar2.element++;
                } else if (l77Var instanceof zq6) {
                    kmbVar2.element--;
                } else if (l77Var instanceof rn5) {
                    kmbVar.element++;
                } else if (l77Var instanceof sn5) {
                    kmbVar.element--;
                }
                boolean z2 = false;
                boolean z3 = kmbVar3.element > 0;
                boolean z4 = kmbVar2.element > 0;
                boolean z5 = kmbVar.element > 0;
                vp3 vp3Var = (vp3) obj2;
                if (vp3Var.E0 != z3) {
                    vp3Var.E0 = z3;
                    z2 = true;
                }
                if (vp3Var.F0 != z4) {
                    vp3Var.F0 = z4;
                    z2 = true;
                }
                if (vp3Var.G0 != z5) {
                    vp3Var.G0 = z5;
                } else {
                    z = z2;
                }
                if (z) {
                    qn4.G(vp3Var);
                }
                break;
            default:
                k.g((j4a) obj5, (t7) obj4, (r0) obj3, (tr2) obj2, (QuotaBlockReason) obj, "followup_clarifying_card");
                break;
        }
        return wefVar;
    }
}
