package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.personality.model.PersonalityAnalysisQuestion;
import tech.chatmind.api.personality.model.UserDecision;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x4b implements l26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ u5b b;
    public final /* synthetic */ a26 c;

    public /* synthetic */ x4b(u5b u5bVar, a26 a26Var) {
        this.b = u5bVar;
        this.c = a26Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.a;
        wef wefVar = wef.a;
        final a26 a26Var = this.c;
        final u5b u5bVar = this.b;
        final int i2 = 1;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                final int i3 = 0;
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                    return wefVar;
                }
                if (!(u5bVar instanceof t5b)) {
                    l46Var.f0(-168426852);
                    l46Var.r(false);
                    return wefVar;
                }
                l46Var.f0(-170923840);
                g09 g09Var = g09.a;
                j09 j09VarN = mh3.N(ynb.b0(16.0f, 0.0f, ynb.d0(0.0f, 0.0f, 0.0f, 12.0f, 7, b.c(g09Var, 1.0f)), 2));
                t7c t7cVarA = s7c.a(xc0.g, ndb.z, l46Var, 54);
                int iHashCode = Long.hashCode(l46Var.T);
                u8a u8aVarM = l46Var.m();
                j09 j09VarJ = m93.J(l46Var, j09VarN);
                lf2.q.getClass();
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(LayoutNode.h1);
                } else {
                    l46Var.s0();
                }
                dec.l(hj6.z, l46Var, t7cVarA);
                dec.l(hj6.y, l46Var, u8aVarM);
                dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
                dec.k(l46Var);
                dec.l(hj6.x, l46Var, j09VarJ);
                j09 j09VarD = b.d(g09Var, 56.0f);
                t5b t5bVar = (t5b) u5bVar;
                List list = t5bVar.a;
                int i4 = t5bVar.b;
                boolean z4 = !(i4 == 0);
                y6c y6cVarB = a7c.b(20.0f);
                boolean zI = l46Var.i(u5bVar) | l46Var.g(a26Var);
                Object objR = l46Var.R();
                i8c i8cVar = sf2.a;
                if (zI || objR == i8cVar) {
                    objR = new x16() { // from class: z4b
                        @Override // defpackage.x16
                        public final Object invoke() {
                            int i5 = i3;
                            wef wefVar2 = wef.a;
                            a26 a26Var2 = a26Var;
                            u5b u5bVar2 = u5bVar;
                            switch (i5) {
                                case 0:
                                    int i6 = ((t5b) u5bVar2).b - 1;
                                    if (i6 >= 0) {
                                        a26Var2.d(new p4b(i6));
                                    }
                                    break;
                                default:
                                    t5b t5bVar2 = (t5b) u5bVar2;
                                    int i7 = t5bVar2.b + 1;
                                    if (i7 < t5bVar2.c) {
                                        a26Var2.d(new p4b(i7));
                                    }
                                    break;
                            }
                            return wefVar2;
                        }
                    };
                    l46Var.p0(objR);
                }
                cgg.a((x16) objR, j09VarD, z4, y6cVarB, null, null, null, null, t72.g, l46Var, 805306416, 496);
                mue mueVar = oue.a;
                mue mueVarC = pue.c(l46Var);
                l46Var.f0(-407655529);
                i00 i00Var = new i00();
                pr4 pr4Var = o82.a;
                int iK = i00Var.k(new xtd(((m82) l46Var.k(pr4Var)).a, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                try {
                    i00Var.f(String.valueOf(((t5b) u5bVar).b + 1));
                    i00Var.h(iK);
                    int iK2 = i00Var.k(new xtd(y72.b(((m82) l46Var.k(pr4Var)).o, 0.5f), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                    try {
                        i00Var.f("/" + ((t5b) u5bVar).c);
                        i00Var.h(iK2);
                        k00 k00VarL = i00Var.l();
                        l46Var.r(false);
                        nte.c(k00VarL, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, mueVarC, l46Var, 0, 0, 262142);
                        if (i4 == list.size() - 1) {
                            l46Var.f0(248076646);
                            j09 j09VarD2 = b.d(g09Var, 56.0f);
                            ArrayList arrayList = new ArrayList(t72.u(list, 10));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((PersonalityAnalysisQuestion) it.next()).getUserDecision());
                            }
                            if (arrayList.isEmpty()) {
                                z3 = true;
                            } else {
                                Iterator it2 = arrayList.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        z3 = true;
                                    } else if (((UserDecision) it2.next()) == null) {
                                        z3 = false;
                                    }
                                }
                            }
                            y6c y6cVarB2 = a7c.b(20.0f);
                            boolean zG = l46Var.g(a26Var);
                            Object objR2 = l46Var.R();
                            if (zG || objR2 == i8cVar) {
                                objR2 = new a5b(a26Var, 0);
                                l46Var.p0(objR2);
                            }
                            cgg.a((x16) objR2, j09VarD2, z3, y6cVarB2, null, null, null, null, t72.h, l46Var, 805306416, 496);
                            z = false;
                            l46Var.r(false);
                            z2 = true;
                        } else {
                            l46Var.f0(248641776);
                            j09 j09VarD3 = b.d(g09Var, 56.0f);
                            PersonalityAnalysisQuestion personalityAnalysisQuestion = (PersonalityAnalysisQuestion) s72.y0(i4, list);
                            boolean z5 = (personalityAnalysisQuestion != null ? personalityAnalysisQuestion.getUserDecision() : null) != null;
                            y6c y6cVarB3 = a7c.b(20.0f);
                            boolean zI2 = l46Var.i(u5bVar) | l46Var.g(a26Var);
                            Object objR3 = l46Var.R();
                            if (zI2 || objR3 == i8cVar) {
                                objR3 = new x16() { // from class: z4b
                                    @Override // defpackage.x16
                                    public final Object invoke() {
                                        int i5 = i2;
                                        wef wefVar2 = wef.a;
                                        a26 a26Var2 = a26Var;
                                        u5b u5bVar2 = u5bVar;
                                        switch (i5) {
                                            case 0:
                                                int i6 = ((t5b) u5bVar2).b - 1;
                                                if (i6 >= 0) {
                                                    a26Var2.d(new p4b(i6));
                                                }
                                                break;
                                            default:
                                                t5b t5bVar2 = (t5b) u5bVar2;
                                                int i7 = t5bVar2.b + 1;
                                                if (i7 < t5bVar2.c) {
                                                    a26Var2.d(new p4b(i7));
                                                }
                                                break;
                                        }
                                        return wefVar2;
                                    }
                                };
                                l46Var.p0(objR3);
                            }
                            cgg.a((x16) objR3, j09VarD3, z5, y6cVarB3, null, null, null, null, t72.i, l46Var, 805306416, 496);
                            z = false;
                            l46Var.r(false);
                            z2 = true;
                        }
                        l46Var.r(z2);
                        l46Var.r(z);
                        return wefVar;
                    } catch (Throwable th) {
                        i00Var.h(iK2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    i00Var.h(iK);
                    throw th2;
                }
            default:
                ((Integer) obj2).getClass();
                i7h.f(u5bVar, a26Var, (l46) obj, k99.P(1));
                return wefVar;
        }
    }

    public /* synthetic */ x4b(u5b u5bVar, a26 a26Var, int i) {
        this.b = u5bVar;
        this.c = a26Var;
    }
}
