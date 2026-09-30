package ai.askquin.ui.annual;

import defpackage.a56;
import defpackage.a62;
import defpackage.bw2;
import defpackage.e50;
import defpackage.ewf;
import defpackage.hf8;
import defpackage.hwf;
import defpackage.i50;
import defpackage.if9;
import defpackage.jzb;
import defpackage.kl5;
import defpackage.kpb;
import defpackage.m8c;
import defpackage.med;
import defpackage.pu1;
import defpackage.qc0;
import defpackage.s0e;
import defpackage.t0e;
import defpackage.use;
import defpackage.uzd;
import defpackage.v40;
import defpackage.v4e;
import defpackage.w50;
import defpackage.wef;
import defpackage.whb;
import defpackage.y25;
import defpackage.yx4;
import defpackage.zn2;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends ewf implements hf8 {
    public final v40 b;
    public final c c;
    public final s0e d;
    public final whb e;
    public final whb f;

    public h(v40 v40Var, c cVar) {
        this.b = v40Var;
        this.c = cVar;
        s0e s0eVarA = t0e.a(new w50());
        this.d = s0eVarA;
        this.e = if9.n(s0eVarA);
        kl5 kl5Var = new kl5(if9.n(v40Var.b), new e50(this, null), 1);
        a62 a62VarA = hwf.a(this);
        uzd uzdVar = med.b;
        this.f = if9.F(new i50(if9.F(kl5Var, a62VarA, uzdVar, null)), hwf.a(this), uzdVar, null);
    }

    public final boolean f() {
        w50 w50Var = (w50) this.d.getValue();
        return (v4e.Q(w50Var.b.d().c) || w50Var.a == null || w50Var.d == null || w50Var.c == null) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(zn2 zn2Var) {
        e eVar;
        if (zn2Var instanceof e) {
            eVar = (e) zn2Var;
            int i = eVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.label = i - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, zn2Var);
            }
        } else {
            eVar = new e(this, zn2Var);
        }
        Object obj = eVar.result;
        int i2 = eVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            eVar.label = 1;
            Object objA = this.c.a(eVar);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        w50 w50Var = new w50();
        s0e s0eVar = this.d;
        s0eVar.getClass();
        s0eVar.n(null, w50Var);
        return wef.a;
    }

    public final void h(ResumeRoute.UserInfoFilling userInfoFilling) {
        String nickname = userInfoFilling.getNickname();
        if (nickname == null) {
            nickname = "";
        }
        use useVar = new use(nickname, 2);
        String gender = userInfoFilling.getGender();
        a56.a.getClass();
        a56 a56VarP = y25.p(gender);
        String career = userInfoFilling.getCareer();
        pu1.a.getClass();
        pu1 pu1VarV = m8c.v(career);
        String relationshipStatus = userInfoFilling.getRelationshipStatus();
        kpb.a.getClass();
        w50 w50Var = new w50(a56VarP, useVar, yx4.h(relationshipStatus), pu1VarV);
        s0e s0eVar = this.d;
        s0eVar.getClass();
        s0eVar.n(null, w50Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(zn2 zn2Var) {
        f fVar;
        if (zn2Var instanceof f) {
            fVar = (f) zn2Var;
            int i = fVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fVar.label = i - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, zn2Var);
            }
        } else {
            fVar = new f(this, zn2Var);
        }
        Object obj = fVar.result;
        int i2 = fVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            w50 w50Var = (w50) this.d.getValue();
            String string = w50Var.b.d().c.toString();
            if (string.length() <= 0) {
                string = null;
            }
            a56 a56Var = w50Var.a;
            String strA = a56Var != null ? a56Var.a() : null;
            pu1 pu1Var = w50Var.d;
            String strA2 = pu1Var != null ? pu1Var.a() : null;
            kpb kpbVar = w50Var.c;
            ResumeRoute.UserInfoFilling userInfoFilling = new ResumeRoute.UserInfoFilling(string, strA, strA2, kpbVar != null ? kpbVar.a() : null);
            fVar.L$0 = null;
            fVar.L$1 = null;
            fVar.label = 1;
            c cVar = this.c;
            cVar.d().f("saveUserInfoProgress: nickname={}, gender={}, career={}, relationship={}", userInfoFilling.getNickname(), userInfoFilling.getGender(), userInfoFilling.getCareer(), userInfoFilling.getRelationshipStatus());
            Object objN = cVar.a.n(c.e(userInfoFilling), fVar);
            bw2 bw2Var = bw2.a;
            if (objN == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        if (g(r0) == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x013e, code lost:
    
        if (r13 == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x016a, code lost:
    
        if (r13 == r1) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Enum k(ai.askquin.ui.annual.model.AnnualActionFor r11, java.util.List r12, defpackage.zn2 r13) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.askquin.ui.annual.h.k(ai.askquin.ui.annual.model.AnnualActionFor, java.util.List, zn2):java.lang.Enum");
    }
}
