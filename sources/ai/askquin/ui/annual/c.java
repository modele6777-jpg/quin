package ai.askquin.ui.annual;

import ai.askquin.ui.annual.model.AnnualActionFor;
import defpackage.bw2;
import defpackage.eb3;
import defpackage.fzc;
import defpackage.gbe;
import defpackage.gd8;
import defpackage.hf8;
import defpackage.jzb;
import defpackage.lb8;
import defpackage.p40;
import defpackage.qc0;
import defpackage.tm7;
import defpackage.wc8;
import defpackage.zn2;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements hf8 {
    public static final /* synthetic */ int b = 0;
    public final gd8 a;

    public c(gd8 gd8Var) {
        this.a = gd8Var;
    }

    public static String e(ResumeRoute resumeRoute) {
        return fzc.a.d(ResumeRoute.Companion.serializer(), resumeRoute);
    }

    public final Object a(zn2 zn2Var) {
        d().e("clearProgress");
        return this.a.d(zn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j, zn2 zn2Var) {
        a aVar;
        if (zn2Var instanceof a) {
            aVar = (a) zn2Var;
            int i = aVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.label = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, zn2Var);
            }
        } else {
            aVar = new a(this, zn2Var);
        }
        Object objB = aVar.result;
        int i2 = aVar.label;
        Object obj = bw2.a;
        if (i2 == 0) {
            jzb.q(objB);
            wc8 wc8Var = this.a.d;
            aVar.J$0 = j;
            aVar.label = 1;
            objB = tm7.B(wc8Var, aVar);
            if (objB != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objB);
            return null;
        }
        j = aVar.J$0;
        jzb.q(objB);
        p40 p40Var = ((lb8) objB).r;
        if (p40Var != null) {
            long jE = (j - p40Var.b.e()) / 86400000;
            if (jE <= 30) {
                d().e("getSavedProgress: " + p40Var);
                return p40Var;
            }
            aVar.L$0 = null;
            aVar.L$1 = null;
            aVar.J$0 = j;
            aVar.J$1 = jE;
            aVar.label = 2;
            if (a(aVar) == obj) {
                return obj;
            }
        }
        return null;
    }

    public final Object c(ResumeRoute resumeRoute, gbe gbeVar) {
        d().f("saveReportViewingProgress: route={}", resumeRoute);
        return this.a.n(e(resumeRoute), gbeVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(AnnualActionFor annualActionFor, int i, List list, zn2 zn2Var) {
        b bVar;
        ResumeRoute.UserInfoFilling userInfo;
        if (zn2Var instanceof b) {
            bVar = (b) zn2Var;
            int i2 = bVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.label = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, zn2Var);
            }
        } else {
            bVar = new b(this, zn2Var);
        }
        Object objB = bVar.result;
        int i3 = bVar.label;
        Object obj = bw2.a;
        if (i3 == 0) {
            jzb.q(objB);
            d().f("updateDrawingProgress: cardIndex={}, cardsCount={}", new Integer(i), new Integer(list.size()));
            bVar.L$0 = annualActionFor;
            bVar.L$1 = list;
            bVar.I$0 = i;
            bVar.label = 1;
            objB = b(System.currentTimeMillis(), bVar);
            if (objB != obj) {
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objB);
            return objB;
        }
        i = bVar.I$0;
        list = (List) bVar.L$1;
        annualActionFor = (AnnualActionFor) bVar.L$0;
        jzb.q(objB);
        p40 p40Var = (p40) objB;
        ResumeRoute resumeRouteR = p40Var != null ? eb3.R(p40Var) : null;
        if (resumeRouteR instanceof ResumeRoute.UserInfoFilling) {
            userInfo = (ResumeRoute.UserInfoFilling) resumeRouteR;
        } else {
            userInfo = resumeRouteR instanceof ResumeRoute.Drawing ? ((ResumeRoute.Drawing) resumeRouteR).getUserInfo() : null;
        }
        String strE = e(new ResumeRoute.Drawing(annualActionFor, i, list, userInfo));
        bVar.L$0 = null;
        bVar.L$1 = null;
        bVar.L$2 = null;
        bVar.I$0 = i;
        bVar.label = 2;
        Object objN = this.a.n(strE, bVar);
        return objN == obj ? obj : objN;
    }
}
