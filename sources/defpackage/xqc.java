package defpackage;

import ai.askquin.data.SeasonalDraftStore$Draft;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xqc extends ewf implements hf8 {
    public final ckc b;
    public final ycc c;
    public final s0e d;
    public final whb e;
    public lyd f;

    /* JADX WARN: Code duplicated, block: B:6:0x0020  */
    public xqc(ckc ckcVar, ycc yccVar) {
        mic micVarB;
        this.b = ckcVar;
        this.c = yccVar;
        Integer num = (Integer) yccVar.a("seasonal_campaign_year");
        if (num != null) {
            int iIntValue = num.intValue();
            String str = (String) yccVar.a("seasonal_campaign_solar_term");
            if (str == null) {
                micVarB = null;
            } else {
                yic yicVar = yic.c;
                yic yicVarF = drb.f(iIntValue, str);
                if (yicVarF != null) {
                    micVarB = yicVarF.b();
                } else {
                    micVarB = null;
                }
            }
        } else {
            micVarB = null;
        }
        s0e s0eVarA = t0e.a(micVarB != null ? k(micVarB) : null);
        this.d = s0eVarA;
        this.e = if9.n(s0eVarA);
        lsc lscVar = (lsc) s0eVarA.getValue();
        if (lscVar != null) {
            g(lscVar);
        }
    }

    public final int f() {
        lsc lscVar = (lsc) this.d.getValue();
        if (lscVar == null || lscVar.a == null) {
            return 0;
        }
        if (lscVar.b == null) {
            return 1;
        }
        return lscVar.c == null ? 2 : 3;
    }

    public final void g(lsc lscVar) {
        this.f = ok8.C(new kl5(dj6.I(k99.z(jzb.p(new hla(18, lscVar)), 300L)), new vqc(this, lscVar.d, null), 1), hwf.a(this));
    }

    public final void h() {
        lsc lscVar = (lsc) this.d.getValue();
        if (lscVar != null) {
            String string = lscVar.d.d().c.toString();
            ynb.V(hwf.a(this), null, null, new wqc(this, lscVar.e, lscVar, v4e.Q(string) ? null : string, null), 3);
        }
    }

    public final boolean i(yic yicVar) {
        yicVar.getClass();
        mic micVarB = yicVar.b();
        if (micVarB == null) {
            return false;
        }
        s0e s0eVar = this.d;
        lsc lscVar = (lsc) s0eVar.getValue();
        if ((lscVar != null ? lscVar.e : null) == micVarB) {
            return true;
        }
        Integer numValueOf = Integer.valueOf(yicVar.a);
        ycc yccVar = this.c;
        yccVar.d("seasonal_campaign_year", numValueOf);
        yccVar.d("seasonal_campaign_solar_term", yicVar.b.getWireValue());
        lsc lscVarK = k(micVarB);
        lyd lydVar = this.f;
        if (lydVar != null) {
            lydVar.h(null);
        }
        s0eVar.getClass();
        s0eVar.n(null, lscVarK);
        g(lscVarK);
        return true;
    }

    public final lsc k(mic micVar) {
        a56 a56VarP;
        pu1 pu1VarV;
        SeasonalDraftStore$Draft seasonalDraftStore$DraftB = this.b.b(micVar.b(), micVar.c().getWireValue());
        if (seasonalDraftStore$DraftB == null) {
            return new lsc((a56) null, (pu1) null, (kpb) null, (use) null, micVar, 47);
        }
        String genderKey = seasonalDraftStore$DraftB.getGenderKey();
        kpb kpbVarH = null;
        if (genderKey != null) {
            a56.a.getClass();
            a56VarP = y25.p(genderKey);
        } else {
            a56VarP = null;
        }
        String careerKey = seasonalDraftStore$DraftB.getCareerKey();
        if (careerKey != null) {
            pu1.a.getClass();
            pu1VarV = m8c.v(careerKey);
        } else {
            pu1VarV = null;
        }
        String relationshipKey = seasonalDraftStore$DraftB.getRelationshipKey();
        if (relationshipKey != null) {
            kpb.a.getClass();
            kpbVarH = yx4.h(relationshipKey);
        }
        kpb kpbVar = kpbVarH;
        String question = seasonalDraftStore$DraftB.getQuestion();
        if (question == null) {
            question = "";
        }
        return new lsc(a56VarP, pu1VarV, kpbVar, new use(question, 2), micVar, 32);
    }
}
