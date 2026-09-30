package ai.askquin.ui.conversation;

import ai.askquin.ui.draw.model.DrawCardSaves;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.a26;
import defpackage.a60;
import defpackage.ad1;
import defpackage.af1;
import defpackage.an1;
import defpackage.b21;
import defpackage.cb9;
import defpackage.da9;
import defpackage.dc9;
import defpackage.dr2;
import defpackage.e89;
import defpackage.eec;
import defpackage.er2;
import defpackage.fc9;
import defpackage.fme;
import defpackage.fr2;
import defpackage.fyc;
import defpackage.g21;
import defpackage.gr2;
import defpackage.gy2;
import defpackage.h57;
import defpackage.ib8;
import defpackage.ir2;
import defpackage.j4a;
import defpackage.job;
import defpackage.jzb;
import defpackage.kob;
import defpackage.kr7;
import defpackage.l26;
import defpackage.l46;
import defpackage.mmb;
import defpackage.nfc;
import defpackage.nm4;
import defpackage.no2;
import defpackage.ojb;
import defpackage.or2;
import defpackage.p3c;
import defpackage.pr2;
import defpackage.pwf;
import defpackage.q7b;
import defpackage.qc0;
import defpackage.qd8;
import defpackage.qr2;
import defpackage.sf2;
import defpackage.sr2;
import defpackage.tr2;
import defpackage.u27;
import defpackage.uo2;
import defpackage.uq;
import defpackage.v27;
import defpackage.whb;
import defpackage.x16;
import defpackage.x27;
import defpackage.xo5;
import defpackage.y27;
import defpackage.ycc;
import defpackage.z27;
import defpackage.z5c;
import defpackage.zo1;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.PatternData;
import tech.chatmind.api.events.model.EventInfo;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, x16, z3b] */
    public static final void a(q7b q7bVar, da9 da9Var, z27 z27Var, boolean z, l46 l46Var, int i) {
        int i2;
        Object next;
        pwf pwfVarH;
        cb9 cb9Var;
        Object next2;
        pwf pwfVarH2;
        ?? r11;
        l46Var.h0(-1116041687);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(q7bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.i(da9Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? l46Var.g(z27Var) : l46Var.i(z27Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var.h(z) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if (l46Var.W(i2 & 1, (i2 & 1171) != 1170)) {
            cb9 cb9Var2 = q7bVar.a;
            cb9 cb9VarD0 = g21.d0(new fc9[0], l46Var);
            eec.b(cb9VarD0, l46Var, 0);
            int i3 = i2 & 896;
            nfc nfcVarB = kr7.b(l46Var);
            boolean zBooleanValue = ((Boolean) l46Var.k(h57.a)).booleanValue();
            Object obj = sf2.a;
            if (zBooleanValue) {
                pwfVarH = ib8.h(l46Var, 1471494079, l46Var, false);
            } else {
                l46Var.f0(1471494731);
                Object objK = l46Var.k(uq.b);
                Object objR = l46Var.R();
                if (objR == obj) {
                    objR = zo1.J0;
                    l46Var.p0(objR);
                }
                Iterator it = fyc.u((a26) objR, objK).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((Context) next) instanceof pwf));
                pwfVarH = (pwf) next;
                l46Var.r(false);
            }
            if (pwfVarH == null) {
                qc0.p("No ViewModelStoreOwner found in the context chain");
                return;
            }
            gy2 gy2VarR = b21.r(pwfVarH);
            kob kobVar = job.a;
            dc9 dc9Var = (dc9) z5c.G(kobVar.b(dc9.class), pwfVarH.g(), null, gy2VarR, nfcVarB, null);
            String str = (String) dc9Var.c.getValue();
            if (str == null) {
                str = "";
            }
            mmb mmbVar = new mmb();
            mmbVar.element = z27Var == null ? new x27(str, dc9Var.d) : z27Var;
            ir2 ir2Var = (ir2) dc9Var.b.getValue();
            if (ir2Var == null || z27Var != null) {
                ir2Var = null;
            }
            if (ir2Var instanceof er2) {
                er2 er2Var = (er2) ir2Var;
                mmbVar.element = new v27(er2Var.a, er2Var.b);
                cb9Var = cb9VarD0;
            } else if (ir2Var instanceof fr2) {
                EventInfo eventInfo = ((fr2) ir2Var).a;
                String recommendQuestion = eventInfo.getRecommendQuestion();
                recommendQuestion.getClass();
                String pattern = eventInfo.getPattern();
                if (pattern == null) {
                    pattern = "";
                }
                String str2 = pattern;
                cb9Var = cb9VarD0;
                List<PatternData> patternData = eventInfo.getPatternData();
                patternData.getClass();
                mmbVar.element = new u27(recommendQuestion, patternData, str2, eventInfo.getId());
            } else {
                cb9Var = cb9VarD0;
                if (ir2Var instanceof gr2) {
                    gr2 gr2Var = (gr2) ir2Var;
                    mmbVar.element = new y27(gr2Var.c, gr2Var.a, gr2Var.b);
                }
            }
            uo2 uo2Var = new uo2(3, mmbVar);
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            r0 r0Var = (r0) z5c.G(kobVar.b(r0.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), uo2Var);
            ad1 ad1Var = new ad1(20, ir2Var, mmbVar);
            pwf pwfVarA2 = qd8.a(l46Var);
            if (pwfVarA2 == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            fme fmeVar = (fme) z5c.G(kobVar.b(fme.class), pwfVarA2.g(), null, b21.r(pwfVarA2), kr7.b(l46Var), ad1Var);
            pwf pwfVarA3 = qd8.a(l46Var);
            if (pwfVarA3 == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            tr2 tr2Var = new tr2(cb9Var2, cb9Var, r0Var, fmeVar, (p3c) z5c.G(kobVar.b(p3c.class), pwfVarA3.g(), null, b21.r(pwfVarA3), kr7.b(l46Var), null));
            cb9 cb9Var3 = cb9Var;
            nfc nfcVarB2 = kr7.b(l46Var);
            if (((Boolean) l46Var.k(h57.a)).booleanValue()) {
                pwfVarH2 = ib8.h(l46Var, 1471494079, l46Var, false);
            } else {
                l46Var.f0(1471494731);
                Object objK2 = l46Var.k(uq.b);
                Object objR2 = l46Var.R();
                if (objR2 == obj) {
                    objR2 = zo1.H0;
                    l46Var.p0(objR2);
                }
                Iterator it2 = fyc.u((a26) objR2, objK2).iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!(((Context) next2) instanceof pwf));
                pwfVarH2 = (pwf) next2;
                l46Var.r(false);
            }
            if (pwfVarH2 == null) {
                qc0.p("No ViewModelStoreOwner found in the context chain");
                return;
            }
            gy2 gy2VarR2 = b21.r(pwfVarH2);
            kob kobVar2 = job.a;
            dc9 dc9Var2 = (dc9) z5c.G(kobVar2.b(dc9.class), pwfVarH2.g(), null, gy2VarR2, nfcVarB2, null);
            Boolean boolValueOf = Boolean.valueOf(dc9Var2.f());
            DrawCardSaves drawCardSaves = dc9Var2.w;
            boolean zI = l46Var.i(tr2Var) | l46Var.i(dc9Var2);
            Object objR3 = l46Var.R();
            if (zI || objR3 == obj) {
                objR3 = new or2(tr2Var, dc9Var2, null);
                l46Var.p0(objR3);
            }
            nm4 nm4Var = DrawCardSaves.Companion;
            af1.p(boolValueOf, drawCardSaves, (l26) objR3, l46Var);
            ycc yccVarA = da9Var.a();
            Boolean bool = Boolean.FALSE;
            whb whbVarB = yccVarA.b("follow_up_child_returned", bool);
            e89 e89VarI = jzb.i(whbVarB, whbVarB.getValue(), l46Var, 0, 0);
            Boolean bool2 = (Boolean) e89VarI.getValue();
            bool2.getClass();
            boolean zG = l46Var.g(e89VarI) | l46Var.i(da9Var) | l46Var.i(tr2Var);
            Object objR4 = l46Var.R();
            if (zG || objR4 == obj) {
                objR4 = new pr2(da9Var, tr2Var, e89VarI, null);
                l46Var.p0(objR4);
            }
            af1.o((l26) objR4, l46Var, bool2);
            whb whbVarB2 = da9Var.a().b("followup_action_paywall", bool);
            e89 e89VarI2 = jzb.i(whbVarB2, whbVarB2.getValue(), l46Var, 0, 0);
            Boolean bool3 = (Boolean) e89VarI2.getValue();
            bool3.getClass();
            boolean zG2 = l46Var.g(e89VarI2) | l46Var.i(da9Var) | l46Var.i(tr2Var);
            Object objR5 = l46Var.R();
            if (zG2 || objR5 == obj) {
                objR5 = new qr2(da9Var, tr2Var, e89VarI2, null);
                l46Var.p0(objR5);
            }
            af1.o((l26) objR5, l46Var, bool3);
            boolean zG3 = l46Var.g(cb9Var2) | (i3 == 256 || ((i2 & 512) != 0 && l46Var.g(z27Var)));
            Object objR6 = l46Var.R();
            if (zG3 || objR6 == obj) {
                objR6 = new ad1(18, z27Var, cb9Var2);
                l46Var.p0(objR6);
            }
            x16 x16Var = (x16) objR6;
            boolean zG4 = l46Var.g(x16Var) | l46Var.g(r0Var);
            Object objR7 = l46Var.R();
            if (zG4 || objR7 == obj) {
                objR7 = new ad1(19, tr2Var, x16Var);
                l46Var.p0(objR7);
            }
            x16 x16Var2 = (x16) objR7;
            xo5 xo5Var = (xo5) r0Var.j1.getValue();
            Context context = (Context) l46Var.k(uq.b);
            boolean zE = l46Var.e(xo5Var == null ? -1 : xo5Var.ordinal()) | l46Var.i(context) | l46Var.g(x16Var);
            Object objR8 = l46Var.R();
            if (zE || objR8 == obj) {
                r11 = 0;
                objR8 = new sr2(xo5Var, context, x16Var, null);
                l46Var.p0(objR8);
            } else {
                r11 = 0;
            }
            af1.o((l26) objR8, l46Var, xo5Var);
            nfc nfcVarB3 = kr7.b(l46Var);
            boolean zG5 = l46Var.g(r11) | l46Var.g(nfcVarB3);
            Object objR9 = l46Var.R();
            if (zG5 || objR9 == obj) {
                objR9 = nfcVarB3.b(kobVar2.b(j4a.class), r11, r11);
                l46Var.p0(objR9);
            }
            j4a j4aVar = (j4a) objR9;
            Object objR10 = l46Var.R();
            if (objR10 == obj) {
                objR10 = new dr2(tr2Var, q7bVar, j4aVar, new defpackage.l0(29, x16Var2, cb9Var3));
                l46Var.p0(objR10);
            }
            dr2 dr2Var = (dr2) objR10;
            ConversationRoute.Conversation conversation = ConversationRoute.Conversation.INSTANCE;
            FillElement fillElement = androidx.compose.foundation.layout.b.c;
            boolean zI2 = l46Var.i(tr2Var) | ((i2 & 7168) == 2048) | l46Var.i(cb9Var2) | l46Var.g(x16Var2) | l46Var.i(cb9Var3) | l46Var.i(dr2Var);
            Object objR11 = l46Var.R();
            if (zI2 || objR11 == obj) {
                no2 no2Var = new no2(cb9Var2, cb9Var3, dr2Var, tr2Var, x16Var2, z);
                l46Var.p0(no2Var);
                objR11 = no2Var;
            }
            an1.g(cb9Var3, conversation, fillElement, null, null, null, null, null, null, (a26) objR11, l46Var, 432, 2040);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new a60(q7bVar, da9Var, z, z27Var, i, 1);
        }
    }
}
