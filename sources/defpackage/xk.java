package defpackage;

import ai.askquin.R;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xk implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kt8 b;

    public /* synthetic */ xk(kt8 kt8Var, int i) {
        this.a = i;
        this.b = kt8Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        wef wefVar = wef.a;
        String str = null;
        kt8 kt8Var = this.b;
        boolean z = true;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    l46Var.Z();
                } else {
                    vd0.l(432, af1.b0(-785146458, new xk(kt8Var, z ? 1 : 0), l46Var), l46Var, null, false);
                }
                break;
            default:
                d92 d92Var = (d92) obj;
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                d92Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= l46Var2.g(d92Var) ? 4 : 2;
                }
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    l46Var2.Z();
                } else {
                    int i2 = iIntValue2 & 14;
                    vd0.q(d92Var, null, afc.q(R.string.divintation_question_analysis, l46Var2), l46Var2, i2, 1);
                    if (kt8Var == null) {
                        l46Var2.f0(94469052);
                        l46Var2.r(false);
                    } else {
                        String str2 = kt8Var.b;
                        l46Var2.f0(94249944);
                        boolean zG = l46Var2.g(str2);
                        Object objR = l46Var2.R();
                        i8c i8cVar = sf2.a;
                        if (zG || objR == i8cVar) {
                            str2.getClass();
                            um8 um8VarB = rob.b(new rob("(?:\\p{Zs}|[\\t\\r\\n])*+([:：])(?:\\p{Zs}|[\\t\\r\\n])*+([^\\r\\n]*)"), str2);
                            if (um8VarB != null) {
                                String strH = new rob("\\p{Zs}+").h(v4e.o0((String) ((sm8) um8VarB.a()).get(2)).toString(), " ");
                                if (strH.length() > 0) {
                                    str = strH;
                                }
                            }
                            if (str != null) {
                                str2 = str;
                            }
                            l46Var2.p0(str2);
                            objR = str2;
                        }
                        String str3 = (String) objR;
                        Object objR2 = l46Var2.R();
                        if (objR2 == i8cVar) {
                            objR2 = new z4(13);
                            l46Var2.p0(objR2);
                        }
                        vd0.k(d92Var, null, str3, false, false, (a26) objR2, null, l46Var2, i2 | 196608, 45);
                        l46Var2.r(false);
                    }
                }
                break;
        }
        return wefVar;
    }
}
