package ai.askquin.ui.conversation;

import ai.askquin.R;
import ai.askquin.data.QuotaBlockReason;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.conversation.dialogue.ClarifyingCardState;
import ai.askquin.ui.draw.mixed.MixedDeckSnapshot;
import ai.askquin.ui.draw.model.DrawCardSaves;
import ai.askquin.ui.feedback.FeedbackUiState;
import ai.askquin.ui.persistence.database.InterruptedDrawing;
import ai.askquin.ui.persistence.query.PendingClarifyingCardSubmission;
import ai.askquin.ui.share.SharedDivination;
import android.content.Context;
import com.adjust.sdk.Constants;
import defpackage.a26;
import defpackage.ad4;
import defpackage.af4;
import defpackage.af8;
import defpackage.al5;
import defpackage.ale;
import defpackage.ap;
import defpackage.az1;
import defpackage.ba5;
import defpackage.bd4;
import defpackage.be4;
import defpackage.bf4;
import defpackage.bm8;
import defpackage.bw2;
import defpackage.c78;
import defpackage.cd4;
import defpackage.cf4;
import defpackage.cfb;
import defpackage.cgg;
import defpackage.cl8;
import defpackage.cm4;
import defpackage.cp5;
import defpackage.d6f;
import defpackage.d99;
import defpackage.dd4;
import defpackage.df4;
import defpackage.dl;
import defpackage.dm4;
import defpackage.dt8;
import defpackage.dvd;
import defpackage.dzb;
import defpackage.eab;
import defpackage.eb3;
import defpackage.ec4;
import defpackage.ed4;
import defpackage.ef4;
import defpackage.ef8;
import defpackage.el;
import defpackage.el8;
import defpackage.et8;
import defpackage.ewf;
import defpackage.f1d;
import defpackage.f99;
import defpackage.fab;
import defpackage.fb4;
import defpackage.fc4;
import defpackage.fcb;
import defpackage.fd4;
import defpackage.fe4;
import defpackage.fg9;
import defpackage.fl8;
import defpackage.ft8;
import defpackage.fzc;
import defpackage.ga4;
import defpackage.gbe;
import defpackage.gd4;
import defpackage.gd8;
import defpackage.ge4;
import defpackage.gf4;
import defpackage.gl;
import defpackage.gm4;
import defpackage.gq3;
import defpackage.hd4;
import defpackage.he4;
import defpackage.hf4;
import defpackage.hf8;
import defpackage.ho7;
import defpackage.hr3;
import defpackage.hwf;
import defpackage.i7h;
import defpackage.ia;
import defpackage.ib8;
import defpackage.id4;
import defpackage.if4;
import defpackage.if9;
import defpackage.il;
import defpackage.iqf;
import defpackage.iy9;
import defpackage.j6a;
import defpackage.j97;
import defpackage.jcc;
import defpackage.jd4;
import defpackage.je0;
import defpackage.je4;
import defpackage.jgb;
import defpackage.jhb;
import defpackage.js3;
import defpackage.jsd;
import defpackage.jt8;
import defpackage.jzb;
import defpackage.jzc;
import defpackage.k97;
import defpackage.k99;
import defpackage.kl5;
import defpackage.ks0;
import defpackage.ks2;
import defpackage.kyb;
import defpackage.l26;
import defpackage.l97;
import defpackage.l9b;
import defpackage.lm4;
import defpackage.lr7;
import defpackage.lsd;
import defpackage.lw2;
import defpackage.lw7;
import defpackage.lyd;
import defpackage.m1f;
import defpackage.m8b;
import defpackage.m97;
import defpackage.me4;
import defpackage.mf4;
import defpackage.mk8;
import defpackage.mke;
import defpackage.mmb;
import defpackage.mo3;
import defpackage.mx3;
import defpackage.mxb;
import defpackage.n2f;
import defpackage.n9b;
import defpackage.ncd;
import defpackage.ndc;
import defpackage.nh7;
import defpackage.nm4;
import defpackage.nt8;
import defpackage.nyb;
import defpackage.nzc;
import defpackage.o1d;
import defpackage.o7c;
import defpackage.o9b;
import defpackage.oa7;
import defpackage.ocd;
import defpackage.oe4;
import defpackage.oh7;
import defpackage.ok8;
import defpackage.ot1;
import defpackage.ot8;
import defpackage.oyb;
import defpackage.p05;
import defpackage.p8c;
import defpackage.p9b;
import defpackage.pa7;
import defpackage.pe4;
import defpackage.pje;
import defpackage.pp5;
import defpackage.pu4;
import defpackage.pzd;
import defpackage.q1c;
import defpackage.q9b;
import defpackage.qc0;
import defpackage.qd0;
import defpackage.qd4;
import defpackage.qe4;
import defpackage.qi7;
import defpackage.qj2;
import defpackage.qje;
import defpackage.qke;
import defpackage.ql6;
import defpackage.qn2;
import defpackage.qn4;
import defpackage.qp5;
import defpackage.qs6;
import defpackage.qu4;
import defpackage.quc;
import defpackage.r05;
import defpackage.rab;
import defpackage.rd4;
import defpackage.re4;
import defpackage.rf4;
import defpackage.rp3;
import defpackage.rp5;
import defpackage.rs0;
import defpackage.ruc;
import defpackage.s12;
import defpackage.s7;
import defpackage.s72;
import defpackage.s8f;
import defpackage.sbb;
import defpackage.sc3;
import defpackage.sd4;
import defpackage.se4;
import defpackage.sfb;
import defpackage.sfe;
import defpackage.shb;
import defpackage.sk5;
import defpackage.suc;
import defpackage.sz9;
import defpackage.t12;
import defpackage.t68;
import defpackage.t6f;
import defpackage.t7;
import defpackage.t72;
import defpackage.t8e;
import defpackage.td4;
import defpackage.tgc;
import defpackage.tje;
import defpackage.to3;
import defpackage.tq0;
import defpackage.u27;
import defpackage.u97;
import defpackage.ub3;
import defpackage.uc4;
import defpackage.ud4;
import defpackage.uhb;
import defpackage.uje;
import defpackage.uke;
import defpackage.urg;
import defpackage.v27;
import defpackage.v4e;
import defpackage.vd4;
import defpackage.vfb;
import defpackage.vje;
import defpackage.vyb;
import defpackage.vz9;
import defpackage.w27;
import defpackage.w6f;
import defpackage.wd4;
import defpackage.wef;
import defpackage.whb;
import defpackage.wj5;
import defpackage.x12;
import defpackage.x16;
import defpackage.x1f;
import defpackage.x27;
import defpackage.x72;
import defpackage.xd4;
import defpackage.xf4;
import defpackage.xfb;
import defpackage.xh7;
import defpackage.xke;
import defpackage.xn2;
import defpackage.xo5;
import defpackage.xof;
import defpackage.xt6;
import defpackage.y27;
import defpackage.y41;
import defpackage.ybc;
import defpackage.yc4;
import defpackage.yd4;
import defpackage.yf4;
import defpackage.yi7;
import defpackage.yk5;
import defpackage.ym8;
import defpackage.ynb;
import defpackage.yq2;
import defpackage.yt6;
import defpackage.z18;
import defpackage.z27;
import defpackage.zb5;
import defpackage.zc4;
import defpackage.zd4;
import defpackage.zf4;
import defpackage.zn2;
import defpackage.zrd;
import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import tech.chatmind.api.CloudMixedDeckSnapshot;
import tech.chatmind.api.LimitedQuota;
import tech.chatmind.api.Message;
import tech.chatmind.api.PatternData;
import tech.chatmind.api.SelectedCard;
import tech.chatmind.api.SpreadDetail;
import tech.chatmind.api.SpreadDetailCard;
import tech.chatmind.api.SpreadDetailPattern;
import tech.chatmind.api.SpreadRecommendationResult;
import tech.chatmind.api.SubmitSpreadRequest;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.TarotReadingBody;
import tech.chatmind.api.TarotReadingHistory;
import tech.chatmind.api.TarotReadingMetadata;
import tech.chatmind.api.UserSelectedSpread;
import tech.chatmind.api.credits.QuotaUsage;
import tech.chatmind.api.credits.UsageBilling;
import tech.chatmind.api.credits.UsageBillingBalance;
import tech.chatmind.api.credits.UsageBillingDailyLimit;
import tech.chatmind.api.dto.ScenarioPattern;
import tech.chatmind.api.server.NullableServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends ewf implements hf8, lr7 {
    public static final /* synthetic */ int j2 = 0;
    public boolean A1;
    public final lw7 B1;
    public String C1;
    public PhysicalDeckReading D1;
    public final t6f E0;
    public final vz9 E1;
    public final z27 F0;
    public lyd F1;
    public final lw7 G0;
    public String G1;
    public fc4 H0;
    public final vz9 H1;
    public final String I0;
    public InterruptedDrawing I1;
    public final vz9 J0;
    public final vz9 J1;
    public final LinkedHashSet K0;
    public final vz9 K1;
    public boolean L0;
    public final vz9 L1;
    public final vz9 M0;
    public final vz9 M1;
    public final vz9 N0;
    public final vz9 N1;
    public boolean O0;
    public boolean O1;
    public boolean P0;
    public boolean P1;
    public final vz9 Q0;
    public final vz9 Q1;
    public final jsd R0;
    public final vz9 R1;
    public final lsd S0;
    public final sz9 S1;
    public final lsd T0;
    public final vz9 T1;
    public final lsd U0;
    public final vz9 U1;
    public final lsd V0;
    public final vz9 V1;
    public final ncd W0;
    public final vz9 W1;
    public final gd8 X;
    public final uhb X0;
    public Instant X1;
    public final ai.askquin.ui.popup.dailyfortune.v Y;
    public final LinkedHashSet Y0;
    public final vz9 Y1;
    public final xof Z;
    public final f99 Z0;
    public final vz9 Z1;
    public lyd a1;
    public final vz9 a2;
    public final xt6 b;
    public final mx3 b1;
    public final vz9 b2;
    public final zb5 c;
    public final mx3 c1;
    public final vz9 c2;
    public final yt6 d;
    public final vz9 d1;
    public final vz9 d2;
    public final u97 e;
    public final vz9 e1;
    public final vz9 e2;
    public final uc4 f;
    public String f1;
    public String f2;
    public final gm4 g;
    public final vz9 g1;
    public lyd g2;
    public final vz9 h1;
    public final vz9 h2;
    public final vz9 i1;
    public final vz9 i2;
    public final vz9 j1;
    public final vz9 k1;
    public final vz9 l1;
    public final qn2 m1;
    public final f99 n1;
    public iy9 o1;
    public final whb p1;
    public final vz9 q1;
    public final vz9 r1;
    public sfb s1;
    public final vz9 t1;
    public final vz9 u1;
    public final fab v;
    public final vz9 v1;
    public final q9b w;
    public final vz9 w1;
    public final lm4 x;
    public String x1;
    public final t7 y;
    public String y1;
    public final fcb z;
    public final vz9 z1;

    public r0(xt6 xt6Var, zb5 zb5Var, yt6 yt6Var, u97 u97Var, uc4 uc4Var, gm4 gm4Var, fab fabVar, q9b q9bVar, lm4 lm4Var, t7 t7Var, fcb fcbVar, gd8 gd8Var, ai.askquin.ui.popup.dailyfortune.v vVar, xof xofVar, t6f t6fVar, z27 z27Var) {
        this.b = xt6Var;
        this.c = zb5Var;
        this.d = yt6Var;
        this.e = u97Var;
        this.f = uc4Var;
        this.g = gm4Var;
        this.v = fabVar;
        this.w = q9bVar;
        this.x = lm4Var;
        this.y = t7Var;
        this.z = fcbVar;
        this.X = gd8Var;
        this.Y = vVar;
        this.Z = xofVar;
        this.E0 = t6fVar;
        this.F0 = z27Var;
        tq0 tq0Var = new tq0(16, this);
        z18 z18Var = z18.a;
        this.G0 = eb3.N(z18Var, tq0Var);
        this.I0 = ib8.i();
        Boolean bool = Boolean.FALSE;
        this.J0 = q1c.f(bool);
        this.K0 = new LinkedHashSet();
        hd4 hd4Var = hd4.a;
        this.M0 = q1c.f(hd4Var);
        this.N0 = q1c.f(null);
        this.Q0 = q1c.f(bool);
        this.R0 = new jsd();
        this.S0 = new lsd();
        this.T0 = new lsd();
        this.U0 = new lsd();
        this.V0 = new lsd();
        ncd ncdVarB = ocd.b(0, 1, null, 5);
        this.W0 = ncdVarB;
        this.X0 = if9.m(ncdVarB);
        this.Y0 = new LinkedHashSet();
        this.Z0 = new f99();
        this.b1 = zrd.b(new qj2(this, 6));
        this.c1 = zrd.b(new qj2(this, 7));
        this.d1 = q1c.f(bool);
        vz9 vz9VarF = q1c.f("");
        this.e1 = vz9VarF;
        this.g1 = q1c.f(bool);
        this.h1 = q1c.f(null);
        this.i1 = q1c.f(bool);
        this.j1 = q1c.f(null);
        this.k1 = q1c.f(bool);
        this.l1 = q1c.f(null);
        t8e t8eVarD = iqf.d();
        js3 js3Var = ga4.a;
        this.m1 = jgb.k(i7h.I(t8eVarD, mk8.a.f));
        this.n1 = new f99();
        this.p1 = t6fVar.Y;
        t6fVar.Z = new qj2(this, 8);
        this.q1 = q1c.f(bool);
        this.r1 = q1c.f(null);
        Boolean bool2 = Boolean.TRUE;
        this.t1 = q1c.f(bool2);
        this.u1 = q1c.f(bool);
        pu4 pu4Var = pu4.a;
        this.v1 = q1c.f(pu4Var);
        this.w1 = q1c.f(null);
        this.z1 = q1c.f(null);
        this.B1 = eb3.N(z18Var, new tq0(17, this));
        this.E1 = q1c.f(bool);
        this.H1 = q1c.f(bool);
        mxb.e();
        this.J1 = q1c.f(null);
        this.K1 = q1c.f(null);
        this.L1 = q1c.f(bool);
        this.M1 = q1c.f(bool);
        this.N1 = q1c.f(pu4Var);
        this.Q1 = q1c.f(bool2);
        this.R1 = q1c.f(bool);
        this.S1 = new sz9(0);
        this.T1 = q1c.f(null);
        this.U1 = q1c.f(null);
        this.V1 = q1c.f(null);
        this.W1 = q1c.f(null);
        this.Y1 = q1c.f(bool);
        this.Z1 = q1c.f(null);
        this.a2 = q1c.f(null);
        this.b2 = q1c.f(pu4Var);
        this.c2 = q1c.f(0);
        this.d2 = q1c.f(new quc(0));
        this.e2 = q1c.f(defpackage.f.a);
        this.h2 = q1c.f(null);
        this.i2 = q1c.f(FeedbackUiState.NONE);
        d().e("Init divination view model with: " + z27Var);
        ynb.V(hwf.a(this), null, null, new td4(this, null), 3);
        w27 w27Var = z27Var instanceof w27 ? (w27) z27Var : null;
        if (w27Var == null) {
            c0(this, z27Var instanceof v27 ? (v27) z27Var : null, z27Var instanceof u27 ? (u27) z27Var : null, z27Var instanceof y27 ? (y27) z27Var : null, null, 8);
            return;
        }
        String str = w27Var.d;
        String strJ = str != null ? k99.J(str) : null;
        if (strJ == null) {
            c0(this, null, null, null, null, 15);
            return;
        }
        this.H0 = new fc4(strJ, 2);
        K1(hd4Var);
        vz9VarF.setValue("");
        C1(true);
        ynb.V(hwf.a(this), null, null, new fe4(this, strJ, null), 3);
    }

    public static void I0(r0 r0Var, DrawCardSaves drawCardSaves, QuotaBlockReason quotaBlockReason) {
        r0Var.getClass();
        String str = r0Var.I0;
        drawCardSaves.getClass();
        r0Var.d().e("Tarot cards confirmed: " + drawCardSaves + ", locked: " + (quotaBlockReason != null));
        MixedDeckSnapshot mixedDeck = drawCardSaves.getMixedDeck();
        if (mixedDeck == null) {
            mixedDeck = r0Var.R();
        }
        r0Var.D1(mixedDeck);
        xd4 xd4VarI = r0Var.I();
        if (xd4VarI instanceof ud4) {
            ConcurrentHashMap concurrentHashMap = xfb.a;
            xfb.i(str, "reading");
            zc4 zc4Var = ((ud4) xd4VarI).a;
            r0Var.K1(new ad4(zc4Var, drawCardSaves.getChoices(), null, null, null));
            r0Var.R0.add(new dt8(zc4Var.a, drawCardSaves.getChoices()));
            if (quotaBlockReason == null) {
                l9b l9bVar = QuotaBlockReason.Companion;
                quotaBlockReason = null;
            }
            if (quotaBlockReason != null) {
                r0Var.y(quotaBlockReason);
                return;
            } else {
                r0Var.V0();
                return;
            }
        }
        if (xd4VarI instanceof vd4) {
            ynb.V(r0Var.m1, null, null, new me4(r0Var, drawCardSaves, null), 3);
            return;
        }
        if (xd4VarI instanceof wd4) {
            ConcurrentHashMap concurrentHashMap2 = xfb.a;
            xfb.i(str, "question_after_draw");
            wd4 wd4Var = (wd4) xd4VarI;
            r0Var.w1.setValue(new SceneTarot(wd4Var.a, wd4Var.b, drawCardSaves.getChoices(), wd4Var.c, r0Var.x1));
            return;
        }
        if (xd4VarI == null) {
            r0Var.d().b("drawingFor is null when onCardsDrawn");
        } else {
            ap.c();
        }
    }

    public static iy9 K(kyb kybVar) {
        Object objZ;
        Throwable th = kybVar.a;
        Object objZ2 = FailReason.Network.INSTANCE;
        if (tgc.j(th, false)) {
            return new iy9(FailReason.Unauthorized.INSTANCE, th.getMessage());
        }
        if (th instanceof ba5) {
            ba5 ba5Var = (ba5) th;
            return new iy9(new FailReason.IllegalContent(ba5Var.getOriginMessage()), ba5Var.getOriginMessage());
        }
        String str = "";
        if (th instanceof jzc) {
            jzc jzcVar = (jzc) th;
            if (jzcVar.getCode() == 401 || jzcVar.getErrorCode() == 401) {
                objZ = FailReason.Unauthorized.INSTANCE;
            } else {
                int errorCode = jzcVar.getErrorCode();
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                objZ = z(errorCode, message, null);
            }
            objZ2 = objZ;
        } else if (th instanceof qs6) {
            try {
                if (((qs6) th).a() == 401) {
                    objZ2 = FailReason.Unauthorized.INSTANCE;
                } else {
                    vyb vybVar = ((qs6) th).a.c;
                    String strU = vybVar != null ? vybVar.u() : null;
                    if (strU != null) {
                        try {
                            xh7 xh7Var = fzc.a;
                            xh7Var.getClass();
                            NullableServerResponse nullableServerResponse = (NullableServerResponse) xh7Var.b(NullableServerResponse.Companion.serializer(nh7.Companion.serializer()), strU);
                            objZ2 = z(nullableServerResponse.getErrorCode(), nullableServerResponse.getErrorMessage(), strU);
                        } catch (Throwable unused) {
                        }
                    }
                    str = strU;
                }
            } catch (Throwable unused2) {
            }
        }
        return new iy9(objZ2, str);
    }

    public static kl5 K0(wj5 wj5Var, l26 l26Var) {
        return new kl5(wj5Var, new pe4(l26Var, null), 1);
    }

    public static ArrayList M1(List list, List list2) {
        Iterator it = list.iterator();
        Iterator it2 = list2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(t72.u(list, 10), t72.u(list2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            Object next = it.next();
            TarotCardChoice tarotCardChoice = (TarotCardChoice) it2.next();
            PatternData patternData = (PatternData) next;
            String name = patternData.getName();
            SpreadDetailPattern spreadDetailPattern = null;
            if (v4e.Q(name)) {
                name = null;
            }
            String desc = patternData.getDesc();
            if (desc == null || v4e.Q(desc)) {
                desc = null;
            }
            if (name != null || desc != null) {
                spreadDetailPattern = new SpreadDetailPattern(name, desc);
            }
            arrayList.add(new SpreadDetail(new SpreadDetailCard(tarotCardChoice.getCard().getCardKey(), (String) null, !tarotCardChoice.isReversed() ? 1 : 0, 2, (rp3) null), spreadDetailPattern));
        }
        return arrayList;
    }

    public static /* synthetic */ Object Q0(r0 r0Var, Context context, jd4 jd4Var, String str, gbe gbeVar, int i) {
        if ((i & 2) != 0) {
            jd4Var = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        return r0Var.P0(context, jd4Var, str, gbeVar);
    }

    public static void c0(r0 r0Var, v27 v27Var, u27 u27Var, y27 y27Var, Instant instant, int i) {
        String str;
        String str2 = null;
        v27 v27Var2 = (i & 1) != 0 ? null : v27Var;
        u27 u27Var2 = (i & 2) != 0 ? null : u27Var;
        y27 y27Var2 = (i & 4) != 0 ? null : y27Var;
        Instant instant2 = (i & 8) != 0 ? null : instant;
        jsd jsdVar = r0Var.R0;
        qn2 qn2Var = r0Var.m1;
        r0Var.i1();
        r0Var.x1(null);
        vz9 vz9Var = r0Var.J0;
        Boolean bool = Boolean.FALSE;
        vz9Var.setValue(bool);
        r0Var.C1(true);
        r0Var.L0 = false;
        int i2 = 3;
        if (v27Var2 != null) {
            ec4 ec4Var = v27Var2.a;
            wj5 wj5Var = v27Var2.b;
            r0Var.d().e("Load divination: " + ec4Var.a);
            ynb.V(qn2Var, null, null, new m(r0Var, ec4Var, wj5Var, instant2, null), 3);
            return;
        }
        jsdVar.clear();
        r0Var.T1.setValue(null);
        r0Var.U1.setValue(null);
        r0Var.H0 = new fc4(str2, i2);
        r0Var.K1(hd4.a);
        z27 z27Var = r0Var.F0;
        if (z27Var instanceof x27) {
            str = ((x27) z27Var).a;
        } else {
            str = z27Var instanceof w27 ? ((w27) z27Var).c : "";
        }
        str.getClass();
        r0Var.e1.setValue(str);
        r0Var.q1.setValue(bool);
        r0Var.M1.setValue(bool);
        r0Var.w1(false);
        r0Var.A1(null);
        r0Var.D1(null);
        r0Var.X1 = null;
        r0Var.y1(null);
        r0Var.O0 = false;
        r0Var.P0 = false;
        r0Var.y1 = y27Var2 != null ? "physical_deck" : null;
        r0Var.I1 = null;
        if (u27Var2 != null) {
            String str3 = u27Var2.a;
            r0Var.K1(new zc4(str3, u27Var2.b, u27Var2.c, new gd4(str3, 247), null, u27Var2.d, null, 80));
        }
        if (y27Var2 != null) {
            r0Var.D1 = new PhysicalDeckReading(y27Var2.b, y27Var2.c);
            jsdVar.add(new nt8(y27Var2.a, null));
            ynb.V(qn2Var, null, null, new n(r0Var, null), 3);
        }
        r0Var.C1(false);
    }

    public static /* synthetic */ void l(r0 r0Var, String str, String str2, int i) {
        if ((i & 1) != 0) {
            str = r0Var.U();
        }
        if ((i & 2) != 0) {
            str2 = r0Var.Y0(r0Var.a0());
        }
        r0Var.k(str, str2);
    }

    public static String m(String str) {
        return ub3.i("clarifying-draft:", str);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c8  */
    public static FailReason z(int i, String str, String str2) {
        Object dzbVar;
        String str3;
        QuotaBlockReason quotaBlockReason;
        switch (i) {
            case 60002:
                return FailReason.NoRemainingTokens.INSTANCE;
            case 60019:
                return FailReason.Network.INSTANCE;
            case 60020:
                return FailReason.NoFreeCount.INSTANCE;
            case 60022:
                QuotaBlockReason quotaBlockReason2 = null;
                if (str2 != null) {
                    try {
                        nh7 nh7Var = (nh7) oh7.h(fzc.a.e(str2)).get("message");
                        if (nh7Var != null) {
                            yi7 yi7VarI = oh7.i(nh7Var);
                            if (!(yi7VarI instanceof qi7)) {
                                dzbVar = yi7VarI.c();
                            } else {
                                dzbVar = null;
                            }
                        } else {
                            dzbVar = null;
                        }
                    } catch (Throwable th) {
                        dzbVar = new dzb(th);
                    }
                    if (dzbVar instanceof dzb) {
                        dzbVar = null;
                    }
                    str3 = (String) dzbVar;
                } else {
                    str3 = null;
                }
                if (str3 == null) {
                    str3 = "";
                }
                if (str2 == null) {
                    str2 = "";
                }
                Iterator it = t72.I(str, str3, str2).iterator();
                while (it.hasNext()) {
                    String string = v4e.o0(v4e.i0(v4e.i0(v4e.i0(v4e.o0(v4e.f0((String) it.next(), "usage blocked:", "")).toString(), '\"'), ','), '}')).toString();
                    int iHashCode = string.hashCode();
                    if (iHashCode != -1932488279) {
                        if (iHashCode != -1342601465) {
                            if (iHashCode == 1425374994 && string.equals("insufficient-balance")) {
                                quotaBlockReason = QuotaBlockReason.InsufficientBalance;
                            } else {
                                quotaBlockReason = null;
                            }
                        } else if (string.equals("daily-limit")) {
                            quotaBlockReason = QuotaBlockReason.DailyLimit;
                        } else {
                            quotaBlockReason = null;
                        }
                    } else if (string.equals("no-subscription")) {
                        quotaBlockReason = QuotaBlockReason.NoFollowUpPermission;
                    } else {
                        quotaBlockReason = null;
                    }
                    if (quotaBlockReason != null) {
                        quotaBlockReason2 = quotaBlockReason;
                        return quotaBlockReason2 != null ? new FailReason.UsageBlocked(quotaBlockReason2) : FailReason.Network.INSTANCE;
                    }
                }
                if (quotaBlockReason2 != null) {
                }
                break;
            default:
                return FailReason.Network.INSTANCE;
        }
    }

    public final List A() {
        return (List) this.b2.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object A0(Context context, ale aleVar, zn2 zn2Var) {
        u uVar;
        if (zn2Var instanceof u) {
            uVar = (u) zn2Var;
            int i = uVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                uVar.label = i - Integer.MIN_VALUE;
            } else {
                uVar = new u(this, zn2Var);
            }
        } else {
            uVar = new u(this, zn2Var);
        }
        Object objE0 = uVar.result;
        int i2 = uVar.label;
        try {
            try {
                try {
                    if (i2 == 0) {
                        jzb.q(objE0);
                        if (W() != aleVar || n0() || !y41.N(this.y, context, null, 6)) {
                            return null;
                        }
                        E1(true);
                        uVar.L$0 = null;
                        uVar.L$1 = aleVar;
                        uVar.label = 1;
                        objE0 = E0(aleVar, uVar);
                        Object obj = bw2.a;
                        if (objE0 == obj) {
                            return obj;
                        }
                    } else {
                        if (i2 != 1) {
                            qc0.p("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        aleVar = (ale) uVar.L$1;
                        jzb.q(objE0);
                    }
                    List list = (List) objE0;
                    if (W() != aleVar) {
                        E1(false);
                        return null;
                    }
                    x1(aleVar);
                    this.d2.setValue(new ruc(aleVar));
                    this.h2.setValue(new vd4(aleVar, list));
                    e1("preset");
                    ConcurrentHashMap concurrentHashMap = xfb.a;
                    xfb.i(this.I0, "shuffle");
                    nm4 nm4Var = DrawCardSaves.Companion;
                    fc4 fc4Var = this.H0;
                    if (fc4Var == null) {
                        pa7.g0("divinationKey");
                        throw null;
                    }
                    String str = fc4Var.a;
                    nm4Var.getClass();
                    str.getClass();
                    pu4 pu4Var = pu4.a;
                    DrawCardSaves drawCardSaves = new DrawCardSaves(str, list, pu4Var, pu4Var, null, null);
                    E1(false);
                    return drawCardSaves;
                } catch (Exception e) {
                    d().c("Failed to load quick draw positions", e);
                    jcc.k(0, new Integer(R.string.network_common_error));
                    E1(false);
                    return null;
                }
            } catch (CancellationException e2) {
                throw e2;
            }
        } catch (Throwable th) {
            E1(false);
            throw th;
        }
    }

    public final void A1(Instant instant) {
        this.h1.setValue(instant);
    }

    public final boolean B() {
        if (pa7.t(a0(), hd4.a) && !d0() && L() == null) {
            return (!(a0() instanceof bd4) || Q()) && !l0() && !m0() && !this.L0 && H() == null && !(I() instanceof wd4) && V() == null && this.y1 == null && !o0() && O() == null && (this.F0 instanceof x27);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B0(zn2 zn2Var) {
        v vVar;
        if (zn2Var instanceof v) {
            vVar = (v) zn2Var;
            int i = vVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                vVar.label = i - Integer.MIN_VALUE;
            } else {
                vVar = new v(this, zn2Var);
            }
        } else {
            vVar = new v(this, zn2Var);
        }
        Object objB = vVar.result;
        int i2 = vVar.label;
        q9b q9bVar = this.w;
        try {
            if (i2 == 0) {
                jzb.q(objB);
                fab fabVar = this.v;
                vVar.label = 1;
                objB = ((rab) fabVar).b(vVar);
                bw2 bw2Var = bw2.a;
                if (objB == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(objB);
            }
            QuotaUsage quotaUsage = (QuotaUsage) objB;
            return quotaUsage == null ? ((eab) q9bVar).b() : quotaUsage;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            d().c("Failed to refresh quota before restoring reading", e2);
            return ((eab) q9bVar).b();
        }
    }

    public final void B1(Operation operation, FailReason failReason) {
        this.T1.setValue(operation);
        this.U1.setValue(failReason);
    }

    public final az1 C() {
        String spreadId;
        w27 w27VarO = O();
        if (w27VarO == null) {
            return null;
        }
        SceneTarot sceneTarotV = V();
        if ((sceneTarotV == null || (spreadId = sceneTarotV.getSpreadId()) == null) && (spreadId = this.y1) == null) {
            spreadId = "general";
        }
        return new az1(new shb(spreadId, w27VarO.a), E());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object C0(zn2 zn2Var) throws Throwable {
        w wVar;
        if (zn2Var instanceof w) {
            wVar = (w) zn2Var;
            int i = wVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                wVar.label = i - Integer.MIN_VALUE;
            } else {
                wVar = new w(this, zn2Var);
            }
        } else {
            wVar = new w(this, zn2Var);
        }
        Object obj = wVar.result;
        int i2 = wVar.label;
        wef wefVar = wef.a;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    jzb.q(obj);
                    return wefVar;
                }
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
            int i3 = 0;
            jsd jsdVar = this.R0;
            if (jsdVar == null || !jsdVar.isEmpty()) {
                ListIterator listIterator = jsdVar.listIterator();
                while (true) {
                    ql6 ql6Var = (ql6) listIterator;
                    if (!ql6Var.hasNext()) {
                        break;
                    }
                    ot8 ot8Var = (ot8) ql6Var.next();
                    if (ot8Var instanceof jt8) {
                        jt8 jt8Var = (jt8) ot8Var;
                        t68 t68Var = jt8Var.d;
                        String str = jt8Var.c;
                        if (str == null) {
                            str = t68Var != null ? t68Var.a : null;
                        }
                        if (str != null && (!v4e.Q(str))) {
                            String str2 = t68Var != null ? t68Var.c : null;
                            if (str2 == null || v4e.Q(str2)) {
                                i3 = 1;
                                break;
                            }
                        }
                    }
                }
            }
            if (i3 != 0) {
                wVar.I$0 = i3;
                wVar.label = 1;
                Object objV0 = v0(wVar);
                Object obj2 = bw2.a;
                if (objV0 == obj2) {
                    return obj2;
                }
            }
            return wefVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            m8b m8bVarD = d();
            fc4 fc4Var = this.H0;
            if (fc4Var == null) {
                pa7.g0("divinationKey");
                throw null;
            }
            m8bVarD.c("Refresh linked new readings while restoring history failed: chatId=" + fc4Var.a, e2);
            return wefVar;
        }
    }

    public final void C1(boolean z) {
        this.i1.setValue(Boolean.valueOf(z));
    }

    public final ArrayList D() {
        c78 c78VarW = t72.w();
        ad4 ad4VarM = ym8.m(a0());
        List list = ad4VarM != null ? ad4VarM.b : null;
        pu4 pu4Var = pu4.a;
        if (list == null) {
            list = pu4Var;
        }
        c78VarW.addAll(list);
        Iterator it = P().b.values().iterator();
        while (it.hasNext()) {
            ft8 ft8Var = ((t12) it.next()).b;
            List list2 = ft8Var != null ? ft8Var.b : null;
            if (list2 == null) {
                list2 = pu4Var;
            }
            c78VarW.addAll(list2);
        }
        c78 c78VarN = c78VarW.n();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = c78VarN.listIterator(0);
        while (true) {
            ql6 ql6Var = (ql6) listIterator;
            if (!ql6Var.hasNext()) {
                return arrayList;
            }
            Object next = ql6Var.next();
            if (hashSet.add(((TarotCardChoice) next).getCard())) {
                arrayList.add(next);
            }
        }
    }

    public final void D0(String str) {
        String string = v4e.o0(str).toString();
        if (string.length() != 0 && V() == null) {
            if ((this.y1 == null || o0()) && !pa7.t(this.G1, string)) {
                lyd lydVar = this.F1;
                if (lydVar != null) {
                    lydVar.h(null);
                }
                this.F1 = null;
                this.G1 = string;
                this.E1.setValue(Boolean.FALSE);
                this.F1 = ynb.V(hwf.a(this), null, null, new je4(this, string, null), 3);
            }
        }
    }

    public final void D1(MixedDeckSnapshot mixedDeckSnapshot) {
        this.z1.setValue(mixedDeckSnapshot);
    }

    public final String E() {
        fc4 fc4Var = this.H0;
        if (fc4Var != null) {
            return fc4Var.a;
        }
        pa7.g0("divinationKey");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object E0(ale aleVar, zn2 zn2Var) {
        x xVar;
        if (zn2Var instanceof x) {
            xVar = (x) zn2Var;
            int i = xVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                xVar.label = i - Integer.MIN_VALUE;
            } else {
                xVar = new x(this, zn2Var);
            }
        } else {
            xVar = new x(this, zn2Var);
        }
        Object objA = xVar.result;
        int i2 = xVar.label;
        if (i2 == 0) {
            jzb.q(objA);
            String id = aleVar.getId();
            xVar.L$0 = aleVar;
            xVar.label = 1;
            objA = ((sfe) this.b).a(id, "quick_draw", xVar);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aleVar = (ale) xVar.L$0;
            jzb.q(objA);
        }
        if (objA == null) {
            qc0.j("Required value was null.");
            return null;
        }
        List<PatternData> patternData = ((ScenarioPattern) objA).getPatternData();
        if (patternData.isEmpty()) {
            patternData = aleVar.d();
        }
        if (patternData.size() == aleVar.e()) {
            return patternData;
        }
        qc0.j("Failed requirement.");
        return null;
    }

    public final void E1(boolean z) {
        this.Y1.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001a A[PHI: r2
  0x001a: PHI (r2v13 java.lang.Integer) = 
  (r2v2 java.lang.Integer)
  (r2v4 java.lang.Integer)
  (r2v6 java.lang.Integer)
  (r2v8 java.lang.Integer)
  (r2v15 java.lang.Integer)
 binds: [B:24:0x003b, B:33:0x0053, B:42:0x006d, B:49:0x0087, B:10:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x001d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0025  */
    /* JADX WARN: Code duplicated, block: B:16:0x0028  */
    /* JADX WARN: Code duplicated, block: B:23:0x003a  */
    /* JADX WARN: Code duplicated, block: B:25:0x003d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0055  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:46:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    public final int F() {
        xd4 xd4VarI;
        vd4 vd4Var;
        Integer numValueOf;
        PhysicalDeckReading physicalDeckReading;
        SceneTarot sceneTarotV;
        xd4 xd4VarI2;
        wd4 wd4Var;
        int size;
        List<TarotCardChoice> choices;
        List<TarotCardChoice> cards;
        List list;
        List list2;
        cm4 cm4VarH = H();
        Integer num = null;
        if (cm4VarH == null || (list2 = cm4VarH.c) == null) {
            xd4VarI = I();
            if (xd4VarI instanceof vd4) {
                vd4Var = (vd4) xd4VarI;
            } else {
                vd4Var = null;
            }
            if (vd4Var != null || (list = vd4Var.b) == null) {
                numValueOf = null;
            } else {
                int size2 = list.size();
                numValueOf = Integer.valueOf(size2);
                if (size2 <= 0) {
                    numValueOf = null;
                }
            }
            if (numValueOf != null) {
                num = numValueOf;
            } else {
                physicalDeckReading = this.D1;
                if (physicalDeckReading != null || (cards = physicalDeckReading.getCards()) == null) {
                    numValueOf = null;
                } else {
                    int size3 = cards.size();
                    numValueOf = Integer.valueOf(size3);
                    if (size3 <= 0) {
                        numValueOf = null;
                    }
                }
                if (numValueOf != null) {
                    num = numValueOf;
                } else {
                    sceneTarotV = V();
                    if (sceneTarotV != null || (choices = sceneTarotV.getChoices()) == null) {
                        numValueOf = null;
                    } else {
                        int size4 = choices.size();
                        numValueOf = Integer.valueOf(size4);
                        if (size4 <= 0) {
                            numValueOf = null;
                        }
                    }
                    if (numValueOf == null) {
                        xd4VarI2 = I();
                        if (xd4VarI2 instanceof wd4) {
                            wd4Var = (wd4) xd4VarI2;
                        } else {
                            wd4Var = null;
                        }
                        if (wd4Var != null) {
                            size = wd4Var.b.size();
                            numValueOf = Integer.valueOf(size);
                            if (size > 0) {
                                num = numValueOf;
                            }
                        }
                    } else {
                        num = numValueOf;
                    }
                }
            }
        } else {
            int size5 = list2.size();
            numValueOf = Integer.valueOf(size5);
            if (size5 <= 0) {
                numValueOf = null;
            }
            if (numValueOf == null) {
                xd4VarI = I();
                if (xd4VarI instanceof vd4) {
                    vd4Var = (vd4) xd4VarI;
                } else {
                    vd4Var = null;
                }
                if (vd4Var != null) {
                    numValueOf = null;
                } else {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    num = numValueOf;
                } else {
                    physicalDeckReading = this.D1;
                    if (physicalDeckReading != null) {
                        numValueOf = null;
                    } else {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        num = numValueOf;
                    } else {
                        sceneTarotV = V();
                        if (sceneTarotV != null) {
                            numValueOf = null;
                        } else {
                            numValueOf = null;
                        }
                        if (numValueOf == null) {
                            xd4VarI2 = I();
                            if (xd4VarI2 instanceof wd4) {
                                wd4Var = (wd4) xd4VarI2;
                            } else {
                                wd4Var = null;
                            }
                            if (wd4Var != null) {
                                size = wd4Var.b.size();
                                numValueOf = Integer.valueOf(size);
                                if (size > 0) {
                                    num = numValueOf;
                                }
                            }
                        } else {
                            num = numValueOf;
                        }
                    }
                }
            } else {
                num = numValueOf;
            }
        }
        pzd pzdVar = ale.a;
        if (num != null) {
            int iIntValue = num.intValue();
            pzdVar.getClass();
            return pzd.k(iIntValue);
        }
        suc sucVarX = X();
        if (sucVarX instanceof quc) {
            SpreadRecommendationResult spreadRecommendationResult = (SpreadRecommendationResult) s72.y0(((quc) sucVarX).a, A());
            if (spreadRecommendationResult != null) {
                return spreadRecommendationResult.getUsageCount();
            }
            return 1;
        }
        if (!(sucVarX instanceof ruc)) {
            ap.c();
            return 0;
        }
        int iE = ((ruc) sucVarX).a.e();
        pzdVar.getClass();
        return pzd.k(iE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object F0(zn2 zn2Var) throws Throwable {
        y yVar;
        if (zn2Var instanceof y) {
            yVar = (y) zn2Var;
            int i = yVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                yVar.label = i - Integer.MIN_VALUE;
            } else {
                yVar = new y(this, zn2Var);
            }
        } else {
            yVar = new y(this, zn2Var);
        }
        Object objJ = yVar.result;
        int i2 = yVar.label;
        try {
            if (i2 == 0) {
                jzb.q(objJ);
                yt6 yt6Var = this.d;
                fc4 fc4Var = this.H0;
                if (fc4Var == null) {
                    pa7.g0("divinationKey");
                    throw null;
                }
                String str = fc4Var.a;
                yVar.label = 1;
                objJ = ((uke) yt6Var).j(str, yVar);
                bw2 bw2Var = bw2.a;
                if (objJ == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(objJ);
            }
            return (List) objJ;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            ynb.h0(e2);
            d().c("Failed to load recommended follow-up questions", e2);
            return pu4.a;
        }
    }

    public final void F1(QuotaBlockReason quotaBlockReason) {
        this.l1.setValue(quotaBlockReason);
    }

    public final String G() {
        UsageBilling usageBilling;
        UsageBillingDailyLimit dailyLimit;
        QuotaUsage quotaUsageB = ((eab) this.w).b();
        if (quotaUsageB == null || (usageBilling = quotaUsageB.getUsageBilling()) == null || (dailyLimit = usageBilling.getDailyLimit()) == null) {
            return null;
        }
        return dailyLimit.getResetAt();
    }

    public final boolean G0(QuotaUsage quotaUsage) {
        int iF = F();
        this.x.getClass();
        p9b p9bVarB = lm4.b(quotaUsage, iF);
        if (p9bVarB.equals(n9b.a)) {
            return false;
        }
        if (p9bVarB instanceof o9b) {
            y(((o9b) p9bVarB).a);
            return true;
        }
        ap.c();
        return false;
    }

    public final void G1(boolean z) {
        this.k1.setValue(Boolean.valueOf(z));
    }

    public final cm4 H() {
        return (cm4) this.N0.getValue();
    }

    public final ArrayList H0() {
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = this.R0.listIterator();
        while (true) {
            ql6 ql6Var = (ql6) listIterator;
            if (!ql6Var.hasNext()) {
                return arrayList;
            }
            Message messageA = ((ot8) ql6Var.next()).a();
            if (messageA != null) {
                arrayList.add(messageA);
            }
        }
    }

    public final void H1(boolean z) {
        this.Q0.setValue(Boolean.valueOf(z));
    }

    public final xd4 I() {
        return (xd4) this.h2.getValue();
    }

    public final void I1(boolean z) {
        this.Q1.setValue(Boolean.valueOf(z));
    }

    public final DrawCardSaves J() {
        return (DrawCardSaves) this.K1.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:71:0x0113 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:72:0x0114  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object J0(DrawCardSaves drawCardSaves, xn2 xn2Var) {
        z zVar;
        cm4 cm4Var;
        String str;
        String id;
        List listA;
        List<TarotCardChoice> choices;
        cm4 cm4VarH;
        Instant instantNow;
        bw2 bw2Var;
        cm4 cm4Var2;
        if (xn2Var instanceof z) {
            zVar = (z) xn2Var;
            int i = zVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                zVar.label = i - Integer.MIN_VALUE;
            } else {
                zVar = new z(this, xn2Var);
            }
        } else {
            zVar = new z(this, xn2Var);
        }
        Object objA = zVar.result;
        int i2 = zVar.label;
        dm4 dm4Var = dm4.a;
        boolean z = false;
        try {
            try {
                if (i2 == 0) {
                    jzb.q(objA);
                    if (this.P0) {
                        return Boolean.TRUE;
                    }
                    if (r0() || this.L0) {
                        return Boolean.FALSE;
                    }
                    xd4 xd4VarI = I();
                    if (xd4VarI == null) {
                        return Boolean.FALSE;
                    }
                    boolean z2 = xd4VarI instanceof vd4;
                    if (!z2 && !(xd4VarI instanceof wd4)) {
                        return Boolean.FALSE;
                    }
                    if (drawCardSaves.getChoices().isEmpty() || drawCardSaves.getChoices().size() != xd4VarI.a().size()) {
                        return Boolean.FALSE;
                    }
                    dm4 dm4Var2 = z2 ? dm4Var : dm4.b;
                    if (z2) {
                        id = ((vd4) xd4VarI).a.getId();
                    } else {
                        if (xd4VarI instanceof wd4) {
                            id = ((wd4) xd4VarI).c;
                        } else {
                            str = null;
                        }
                        listA = xd4VarI.a();
                        choices = drawCardSaves.getChoices();
                        cm4VarH = H();
                        if (cm4VarH != null || (instantNow = cm4VarH.e) == null) {
                            instantNow = Instant.now();
                        }
                        Instant instant = instantNow;
                        cm4Var = new cm4(dm4Var2, str, listA, choices, instant);
                        if (xd4VarI instanceof wd4) {
                            wd4 wd4Var = (wd4) xd4VarI;
                            this.w1.setValue(new SceneTarot(wd4Var.a, listA, choices, wd4Var.c, this.x1));
                        }
                        y1(cm4Var);
                        A1(instant);
                        this.I1 = null;
                        K1(cd4.a);
                        H1(true);
                        gm4 gm4Var = this.g;
                        yc4 yc4VarW = w();
                        zVar.L$0 = null;
                        zVar.L$1 = null;
                        zVar.L$2 = cm4Var;
                        zVar.label = 1;
                        objA = gm4Var.a(yc4VarW, zVar);
                        bw2Var = bw2.a;
                        if (objA == bw2Var) {
                            return bw2Var;
                        }
                        cm4Var2 = cm4Var;
                    }
                    str = id;
                    listA = xd4VarI.a();
                    choices = drawCardSaves.getChoices();
                    cm4VarH = H();
                    if (cm4VarH != null) {
                        instantNow = Instant.now();
                    } else {
                        instantNow = Instant.now();
                    }
                    Instant instant2 = instantNow;
                    cm4Var = new cm4(dm4Var2, str, listA, choices, instant2);
                    if (xd4VarI instanceof wd4) {
                        wd4 wd4Var2 = (wd4) xd4VarI;
                        this.w1.setValue(new SceneTarot(wd4Var2.a, listA, choices, wd4Var2.c, this.x1));
                    }
                    y1(cm4Var);
                    A1(instant2);
                    this.I1 = null;
                    K1(cd4.a);
                    H1(true);
                    gm4 gm4Var2 = this.g;
                    yc4 yc4VarW2 = w();
                    zVar.L$0 = null;
                    zVar.L$1 = null;
                    zVar.L$2 = cm4Var;
                    zVar.label = 1;
                    objA = gm4Var2.a(yc4VarW2, zVar);
                    bw2Var = bw2.a;
                    if (objA == bw2Var) {
                        return bw2Var;
                    }
                    cm4Var2 = cm4Var;
                } else {
                    if (i2 != 1) {
                        qc0.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cm4Var2 = (cm4) zVar.L$2;
                    jzb.q(objA);
                }
                yc4 yc4Var = (yc4) objA;
                this.O0 = yc4Var.b;
                this.X1 = yc4Var.p;
                this.P0 = true;
                if (cm4Var2.a == dm4Var) {
                    x1f x1fVar = x1f.a;
                    x1f.k(new r05("quick_draw_completed"), new ot1(19, cm4Var2), 2);
                }
                H1(false);
                z = true;
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                d().c("Failed to save drawn cards", e2);
                jcc.k(0, new Integer(R.string.network_common_error));
                H1(false);
            }
            return Boolean.valueOf(z);
        } catch (Throwable th) {
            H1(false);
            throw th;
        }
    }

    public final void J1(dvd dvdVar) {
        this.Z1.setValue(dvdVar);
    }

    public final void K1(jd4 jd4Var) {
        this.M0.setValue(jd4Var);
    }

    public final Operation L() {
        return (Operation) this.T1.getValue();
    }

    public final void L0(String str) {
        x1f x1fVar = x1f.a;
        x1f.k(p05.a, new ia(str, 26), 2);
        fc4 fc4Var = this.H0;
        if (fc4Var == null) {
            pa7.g0("divinationKey");
            throw null;
        }
        String str2 = fc4Var.a;
        t6f t6fVar = this.E0;
        t6fVar.getClass();
        str2.getClass();
        w6f w6fVar = (w6f) t6fVar.X.getValue();
        String str3 = w6fVar.a;
        d6f d6fVar = w6fVar.b;
        if (pa7.t(str3, str2) && d6fVar == d6f.b) {
            t6fVar.g();
            return;
        }
        if (pa7.t(str3, str2) && d6fVar == d6f.c) {
            t6fVar.g();
            return;
        }
        if (!pa7.t(str3, str2) || d6fVar != d6f.d) {
            t6fVar.k();
            t6fVar.j(str2, null, false);
        } else if (t6fVar.z) {
            t6fVar.g();
        } else {
            t6fVar.h();
        }
    }

    public final void L1(Operation operation) {
        this.V1.setValue(operation);
    }

    public final FailReason M() {
        return (FailReason) this.U1.getValue();
    }

    public final void M0(Operation operation) {
        String strI;
        m97 m97VarC;
        k97 k97VarK;
        String string;
        if (this.L0) {
            return;
        }
        jd4 jd4VarA0 = a0();
        int i = 1;
        w1(true);
        if (operation instanceof Operation.Ask) {
            if (((Operation.Ask) operation).asRequisite(jd4VarA0) == null) {
                ho7.o("Invalid operation: ", operation, " in state: ", jd4VarA0);
                return;
            }
            String content = ((Message) s72.F0(H0())).getContent();
            iy9 iy9VarT = t();
            String str = (String) iy9VarT.a();
            String str2 = (String) iy9VarT.b();
            b1(str);
            yt6 yt6Var = this.d;
            fc4 fc4Var = this.H0;
            if (fc4Var == null) {
                pa7.g0("divinationKey");
                throw null;
            }
            String str3 = fc4Var.a;
            UserSelectedSpread userSelectedSpreadR = r();
            w27 w27VarO = O();
            String str4 = w27VarO != null ? w27VarO.b : null;
            uke ukeVar = (uke) yt6Var;
            ukeVar.getClass();
            str3.getClass();
            content.getClass();
            ok8.C(K0(f1(o1(W0(ndc.f(new tje(ukeVar, str3, content, str, str2, userSelectedSpreadR, str4, null))), operation)), new qe4(this, content, str, str2, null)), this.m1);
            return;
        }
        if (operation instanceof Operation.UpdateQuestion) {
            Operation.UpdateQuestion updateQuestion = (Operation.UpdateQuestion) operation;
            gd4 gd4VarAsRequisite = updateQuestion.asRequisite(jd4VarA0);
            if (gd4VarAsRequisite == null) {
                ho7.o("Invalid operation: ", operation, " in state: ", jd4VarA0);
                return;
            }
            iy9 iy9VarT2 = t();
            String str5 = (String) iy9VarT2.a();
            String str6 = (String) iy9VarT2.b();
            b1(str5);
            yt6 yt6Var2 = this.d;
            fc4 fc4Var2 = this.H0;
            if (fc4Var2 == null) {
                pa7.g0("divinationKey");
                throw null;
            }
            String str7 = fc4Var2.a;
            String question = updateQuestion.getQuestion();
            UserSelectedSpread userSelectedSpreadR2 = r();
            w27 w27VarO2 = O();
            String str8 = w27VarO2 != null ? w27VarO2.b : null;
            uke ukeVar2 = (uke) yt6Var2;
            ukeVar2.getClass();
            str7.getClass();
            question.getClass();
            ok8.C(K0(f1(o1(W0(ndc.f(new tje(ukeVar2, str7, question, str5, str6, userSelectedSpreadR2, str8, null))), operation)), new a0(this, operation, gd4VarAsRequisite, null)), this.m1);
            return;
        }
        if (operation instanceof Operation.SubmitAdditionalInfo) {
            Operation.SubmitAdditionalInfo submitAdditionalInfo = (Operation.SubmitAdditionalInfo) operation;
            fd4 fd4VarAsRequisite = submitAdditionalInfo.asRequisite(jd4VarA0);
            if (fd4VarAsRequisite == null) {
                ho7.o("Invalid operation: ", operation, " in state: ", jd4VarA0);
                return;
            }
            String additionalInfo = submitAdditionalInfo.getAdditionalInfo();
            yt6 yt6Var3 = this.d;
            fc4 fc4Var3 = this.H0;
            if (fc4Var3 == null) {
                pa7.g0("divinationKey");
                throw null;
            }
            String str9 = fc4Var3.a;
            uke ukeVar3 = (uke) yt6Var3;
            ukeVar3.getClass();
            str9.getClass();
            additionalInfo.getClass();
            ok8.C(K0(f1(o1(W0(ndc.f(new qke(ukeVar3, str9, additionalInfo, null))), operation)), new b0(this, fd4VarAsRequisite, additionalInfo, null)), this.m1);
            return;
        }
        if (operation instanceof Operation.SubmitSpread) {
            Operation.SubmitSpread submitSpread = (Operation.SubmitSpread) operation;
            zc4 zc4VarAsRequisite = submitSpread.asRequisite(jd4VarA0);
            if (zc4VarAsRequisite == null) {
                ho7.o("Invalid operation: ", operation, " in state: ", jd4VarA0);
                return;
            }
            MixedDeckSnapshot mixedDeckSnapshotR = R();
            if (mixedDeckSnapshotR != null && !mixedDeckSnapshotR.isValid()) {
                d().b("Cannot submit an invalid mixed deck snapshot");
                B1(operation, FailReason.Network.INSTANCE);
                jcc.k(0, Integer.valueOf(R.string.network_common_error));
                return;
            }
            if (this.F0 instanceof u27) {
                b1((String) t().d());
            }
            fc4 fc4Var4 = this.H0;
            if (fc4Var4 != null) {
                ok8.C(K0(o1(W0(new ybc(new re4(this, fc4Var4.a, u(zc4VarAsRequisite, submitSpread.getCards()), null))), operation), new c0(this, null)), this.m1);
                return;
            } else {
                pa7.g0("divinationKey");
                throw null;
            }
        }
        int i2 = 3;
        if (operation instanceof Operation.Pattern) {
            String strI2 = ib8.i();
            ed4 ed4VarAsRequisite = ((Operation.Pattern) operation).asRequisite(jd4VarA0);
            if (ed4VarAsRequisite == null) {
                ho7.o("Invalid operation: ", operation, " in state: ", jd4VarA0);
                return;
            }
            cm4 cm4VarH = H();
            if (cm4VarH != null) {
                ynb.V(this.m1, null, null, new l(cm4VarH, this, ed4VarAsRequisite, null), 3);
                return;
            }
            SceneTarot sceneTarotV = V();
            if (sceneTarotV != null) {
                K1(new ad4(new zc4(ed4VarAsRequisite.a(), sceneTarotV.getPattern(), sceneTarotV.getPatternData(), ed4VarAsRequisite, f1d.c, null, sceneTarotV.getSpreadId(), 32), sceneTarotV.getChoices(), null, null, null));
                if (G0(((eab) this.w).b())) {
                    return;
                }
                V0();
                return;
            }
            PhysicalDeckReading physicalDeckReading = this.D1;
            if (physicalDeckReading != null) {
                String strA = ed4VarAsRequisite.a();
                pzd pzdVar = ale.a;
                int size = physicalDeckReading.getCards().size();
                pzdVar.getClass();
                K1(new ad4(new zc4(strA, pzd.g(size).d(), physicalDeckReading.getPatternData(), ed4VarAsRequisite, null, null, "user_customized", 16), physicalDeckReading.getCards(), null, null, null));
                this.R0.add(new dt8(ed4VarAsRequisite.a(), physicalDeckReading.getCards()));
                if (G0(((eab) this.w).b())) {
                    return;
                }
                V0();
                return;
            }
            yt6 yt6Var4 = this.d;
            fc4 fc4Var5 = this.H0;
            if (fc4Var5 == null) {
                pa7.g0("divinationKey");
                throw null;
            }
            String str10 = fc4Var5.a;
            uke ukeVar4 = (uke) yt6Var4;
            ukeVar4.getClass();
            str10.getClass();
            ok8.C(K0(f1(o1(W0(ndc.f(new pje(ukeVar4, str10, null))), operation)), new be4(null, ed4VarAsRequisite, this, operation, strI2)), this.m1);
            return;
        }
        int i3 = 2;
        if (!(operation instanceof Operation.Explanation)) {
            if (!(operation instanceof Operation.Chat)) {
                ap.c();
                return;
            }
            String strI3 = ib8.i();
            Operation.Chat chat = (Operation.Chat) operation;
            if (chat.asRequisite(jd4VarA0) == null) {
                ho7.o("Invalid operation: ", operation, " in state: ", jd4VarA0);
                return;
            }
            fcb fcbVar = this.z;
            fc4 fc4Var6 = this.H0;
            if (fc4Var6 == null) {
                pa7.g0("divinationKey");
                throw null;
            }
            String str11 = fc4Var6.a;
            fcbVar.getClass();
            str11.getClass();
            ynb.V(fcbVar.b, null, null, new sbb(fcbVar, str11, null), 3);
            x72.i0(new to3(19), this.R0);
            el elVar = new el(this, strI3, i3);
            el elVar2 = new el(this, strI3, i2);
            jsd jsdVar = this.R0;
            ArrayList arrayList = new ArrayList();
            ListIterator listIterator = jsdVar.listIterator();
            while (true) {
                ql6 ql6Var = (ql6) listIterator;
                if (!ql6Var.hasNext()) {
                    break;
                }
                Object next = ql6Var.next();
                if (next instanceof nt8) {
                    arrayList.add(next);
                }
            }
            nt8 nt8Var = (nt8) s72.H0(arrayList);
            String str12 = nt8Var != null ? nt8Var.a : null;
            if (str12 == null) {
                str12 = "";
            }
            yt6 yt6Var5 = this.d;
            fc4 fc4Var7 = this.H0;
            if (fc4Var7 == null) {
                pa7.g0("divinationKey");
                throw null;
            }
            String str13 = fc4Var7.a;
            uke ukeVar5 = (uke) yt6Var5;
            ukeVar5.getClass();
            str13.getClass();
            ok8.C(K0(new kl5(f1(o1(W0(new ybc(new mke(null, new vje(ukeVar5, str13, str12, null)))), chat)), new oe4(new ks2(elVar, this, 23), new el(this, strI3, 4), null), i), new k(elVar2, this, strI3, null)), this.m1);
            return;
        }
        dd4 dd4VarAsRequisite = ((Operation.Explanation) operation).asRequisite(jd4VarA0);
        if (dd4VarAsRequisite == null) {
            ho7.o("Invalid operation: ", operation, " in state: ", jd4VarA0);
            return;
        }
        ListIterator listIterator2 = this.R0.listIterator();
        do {
            ql6 ql6Var2 = (ql6) listIterator2;
            if (!ql6Var2.hasNext()) {
                strI = null;
                break;
            } else {
                ot8 ot8Var = (ot8) ql6Var2.next();
                et8 et8Var = ot8Var instanceof et8 ? (et8) ot8Var : null;
                strI = et8Var != null ? et8Var.a : null;
            }
        } while (strI == null);
        u97 u97Var = this.e;
        fc4 fc4Var8 = this.H0;
        if (fc4Var8 == null) {
            pa7.g0("divinationKey");
            throw null;
        }
        String str14 = fc4Var8.a;
        u97Var.getClass();
        str14.getClass();
        String strA2 = s7.a();
        l97 l97Var = new l97(strA2, str14);
        synchronized (u97Var.f) {
            try {
                m97VarC = u97Var.c(l97Var);
                if (m97VarC == null) {
                    if (u97Var.e(l97Var)) {
                        m97VarC = null;
                    } else {
                        if (strI == null) {
                            string = UUID.randomUUID().toString();
                            string.getClass();
                        } else {
                            string = strI;
                        }
                        m97VarC = u97Var.j(l97Var, string);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (m97VarC == null) {
            if (strI == null) {
                strI = ib8.i();
            }
            String strI4 = ib8.i();
            Instant instantNow = Instant.now();
            instantNow.getClass();
            k97VarK = new k97(strI4, strA2, str14, strI, instantNow, new sc3(i3, new kyb(new IllegalStateException("Interpretation session is unavailable for the current account"))));
        } else {
            Object value = m97VarC.e.getValue();
            nyb nybVar = value instanceof nyb ? (nyb) value : null;
            if (nybVar != null) {
                u97Var.b(m97VarC, (j97) nybVar.a);
            }
            k97VarK = u97Var.k(m97VarC);
        }
        this.W1.setValue(k97VarK);
        String str15 = k97VarK.c;
        Instant instant = k97VarK.d;
        ok8.C(K0(new kl5(o1(W0(k97VarK.e), operation), new oe4(new ot1(18, new sd4(this, instant, str15, dd4VarAsRequisite, 0)), new to3(20), null), i), new gl(2, new ks2(new sd4(this, instant, str15, dd4VarAsRequisite, 1), this, 22), oa7.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Ltech/chatmind/api/InterpretResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 11)), this.m1);
    }

    public final QuotaBlockReason N() {
        if (a0() instanceof bd4) {
            QuotaUsage quotaUsageB = ((eab) this.w).b();
            this.x.getClass();
            p9b p9bVarA = lm4.a(quotaUsageB);
            o9b o9bVar = p9bVarA instanceof o9b ? (o9b) p9bVarA : null;
            if (o9bVar != null) {
                return o9bVar.a;
            }
        }
        return null;
    }

    public final void N0(TarotReadingHistory tarotReadingHistory) {
        TarotReadingMetadata metadata;
        CloudMixedDeckSnapshot mixedDeckSnapshot;
        if (tarotReadingHistory == null) {
            return;
        }
        String strJ = k99.J(tarotReadingHistory.getChatId());
        fc4 fc4Var = this.H0;
        if (fc4Var == null) {
            pa7.g0("divinationKey");
            throw null;
        }
        if (strJ.equals(k99.J(fc4Var.a)) && (metadata = tarotReadingHistory.getMetadata()) != null && (mixedDeckSnapshot = metadata.getMixedDeckSnapshot()) != null) {
            fc4 fc4Var2 = this.H0;
            if (fc4Var2 == null) {
                pa7.g0("divinationKey");
                throw null;
            }
            MixedDeckSnapshot mixedDeckSnapshotW = eb3.W(mixedDeckSnapshot, fc4Var2.a, R());
            if (mixedDeckSnapshotW != null) {
                D1(mixedDeckSnapshotW);
            }
        }
        this.X1 = Instant.now();
        ynb.V(hwf.a(this), null, null, new se4(this, tarotReadingHistory, null), 3);
    }

    public final void N1() {
        cm4 cm4VarH = H();
        if (cm4VarH != null && this.P0 && !r0() && pa7.t(a0(), cd4.a)) {
            if (cm4VarH.a == dm4.a) {
                x1f x1fVar = x1f.a;
                x1f.k(new r05("quick_draw_reading_started"), new ks2(cm4VarH, this, 24), 2);
            }
            K1(hd4.a);
            ConcurrentHashMap concurrentHashMap = xfb.a;
            xfb.i(this.I0, "question_after_draw");
            q1();
        }
    }

    public final w27 O() {
        z27 z27Var = this.F0;
        if (z27Var instanceof w27) {
            return (w27) z27Var;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object O0(zn2 zn2Var) {
        d0 d0Var;
        if (zn2Var instanceof d0) {
            d0Var = (d0) zn2Var;
            int i = d0Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                d0Var.label = i - Integer.MIN_VALUE;
            } else {
                d0Var = new d0(this, zn2Var);
            }
        } else {
            d0Var = new d0(this, zn2Var);
        }
        Object obj = d0Var.result;
        int i2 = d0Var.label;
        boolean z = true;
        try {
            try {
                try {
                    if (i2 == 0) {
                        jzb.q(obj);
                        if (H() == null) {
                            return Boolean.TRUE;
                        }
                        this.O0 = false;
                        w1(true);
                        uc4 uc4Var = this.f;
                        yc4 yc4VarW = w();
                        d0Var.label = 1;
                        Object objH = ((gq3) uc4Var).h(yc4VarW, d0Var);
                        bw2 bw2Var = bw2.a;
                        if (objH == bw2Var) {
                            return bw2Var;
                        }
                    } else {
                        if (i2 != 1) {
                            qc0.p("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        jzb.q(obj);
                    }
                    w1(false);
                } catch (CancellationException e) {
                    throw e;
                }
            } catch (Exception e2) {
                d().c("Failed to persist cloud reading association", e2);
                jcc.k(0, new Integer(R.string.network_common_error));
                w1(false);
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (Throwable th) {
            w1(false);
            throw th;
        }
    }

    public final boolean O1(String str, TarotCardChoice tarotCardChoice, int i) {
        t12 t12Var;
        str.getClass();
        tarotCardChoice.getClass();
        if (!pa7.t(P().e, str) || (t12Var = (t12) P().b.get(str)) == null || !qd0.I0(new ClarifyingCardState[]{ClarifyingCardState.PendingDecision, ClarifyingCardState.Drawing}).contains(t12Var.d)) {
            return false;
        }
        ArrayList arrayListD = D();
        if (!arrayListD.isEmpty()) {
            Iterator it = arrayListD.iterator();
            while (it.hasNext()) {
                if (((TarotCardChoice) it.next()).getCard() == tarotCardChoice.getCard()) {
                    return false;
                }
            }
        }
        ClarifyingCardDrawActionState clarifyingCardDrawActionStateN = n(str);
        ClarifyingCardDrawActionState.Loading loading = ClarifyingCardDrawActionState.Loading.INSTANCE;
        if (pa7.t(clarifyingCardDrawActionStateN, loading)) {
            return false;
        }
        j6a j6aVar = new j6a(tarotCardChoice, i);
        lsd lsdVar = this.V0;
        j6a j6aVar2 = (j6a) lsdVar.get(str);
        if (j6aVar2 != null && !j6aVar2.equals(j6aVar)) {
            return false;
        }
        lsdVar.put(str, j6aVar);
        this.U0.put(str, s12.a);
        this.T0.put(str, loading);
        x(m(str));
        q1();
        fc4 fc4Var = this.H0;
        if (fc4Var == null) {
            pa7.g0("divinationKey");
            throw null;
        }
        String str2 = fc4Var.a;
        List listH = t72.H(new SelectedCard(tarotCardChoice.getCard().getCardKey(), !tarotCardChoice.isReversed() ? 1 : 0, (String) null, 4, (rp3) null));
        uke ukeVar = (uke) this.d;
        ukeVar.getClass();
        str2.getClass();
        ok8.C(new sk5(new kl5(f1(new ybc(new mke(null, new uje(ukeVar, str2, listH, str, null)))), new p0(this, str, null), 1), new q0(this, str, null)), this.m1);
        return true;
    }

    public final pp5 P() {
        return (pp5) this.b1.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:106:0x030e A[PHI: r0 r8
  0x030e: PHI (r0v35 ai.askquin.ui.draw.model.DrawCardSaves) = (r0v32 ai.askquin.ui.draw.model.DrawCardSaves), (r0v41 ai.askquin.ui.draw.model.DrawCardSaves) binds: [B:104:0x030b, B:18:0x005a] A[DONT_GENERATE, DONT_INLINE]
  0x030e: PHI (r8v16 int) = (r8v14 int), (r8v17 int) binds: [B:104:0x030b, B:18:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:111:0x0330  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:89:0x0200  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code duplicated, block: B:91:0x020c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0230  */
    /* JADX WARN: Code duplicated, block: B:94:0x0237  */
    /* JADX WARN: Code duplicated, block: B:97:0x02e1  */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0327, code lost:
    
        if (r1.b(r6) == r13) goto L108;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object P0(android.content.Context r31, defpackage.jd4 r32, java.lang.String r33, defpackage.zn2 r34) {
        /*
            Method dump skipped, instruction units count: 820
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.askquin.ui.conversation.r0.P0(android.content.Context, jd4, java.lang.String, zn2):java.lang.Object");
    }

    public final void P1(sfb sfbVar, cfb cfbVar, List list, String str) {
        ynb.V(hwf.a(this), null, null, new xf4(this, sfbVar, cfbVar, list, str, null), 3);
    }

    public final boolean Q() {
        et8 et8Var;
        if (!(a0() instanceof bd4) || (b0() instanceof Operation.Explanation) || (L() instanceof Operation.Explanation)) {
            return false;
        }
        Iterator<E> it = this.R0.iterator();
        do {
            et8Var = null;
            if (!it.hasNext()) {
                break;
            }
            ot8 ot8Var = (ot8) it.next();
            if (ot8Var instanceof et8) {
                et8Var = (et8) ot8Var;
            }
        } while (et8Var == null);
        if (et8Var != null) {
            return et8Var.c;
        }
        return true;
    }

    public final void Q1(String str) {
        x12 x12Var;
        TarotCardChoice tarotCardChoice;
        String spreadId;
        LinkedHashSet linkedHashSet = this.Y0;
        if (linkedHashSet.contains(str) || (x12Var = (x12) cgg.s(this.R0).get(str)) == null) {
            return;
        }
        j6a j6aVar = (j6a) this.V0.get(str);
        if ((j6aVar == null || (tarotCardChoice = j6aVar.a) == null) && (tarotCardChoice = x12Var.d) == null) {
            return;
        }
        SceneTarot sceneTarotV = V();
        if ((sceneTarotV == null || (spreadId = sceneTarotV.getSpreadId()) == null) && (spreadId = this.y1) == null) {
            spreadId = "general";
        }
        String strE = E();
        strE.getClass();
        linkedHashSet.add(str);
        Integer num = x12Var.c;
        int iIntValue = num != null ? num.intValue() : x12Var.b + 1;
        String str2 = x12Var.a;
        str2.getClass();
        cgg.x(new rp5("button_click", bm8.H((iy9[]) Arrays.copyOf(new iy9[]{new iy9("btn", "extra_reading"), new iy9("pathway", "reading_general"), new iy9("triggered_by", "extra"), new iy9("divination_type", spreadId), new iy9("parent_session_id", strE), new iy9("card_label", str2), new iy9("extra_n", Integer.valueOf(iIntValue)), new iy9("card_id", tarotCardChoice.getCard().getCardKey()), new iy9("dir", tarotCardChoice.isReversed() ? "reversed" : "upright")}, 9))));
    }

    public final MixedDeckSnapshot R() {
        return (MixedDeckSnapshot) this.z1.getValue();
    }

    public final void R0() {
        if (a0() instanceof bd4) {
            String strJ = ym8.J(a0());
            if (strJ == null) {
                strJ = "";
            }
            D0(strJ);
        }
        z27 z27Var = this.F0;
        if ((z27Var instanceof x27) || (z27Var instanceof v27)) {
            jd4 jd4VarA0 = a0();
            bd4 bd4Var = jd4VarA0 instanceof bd4 ? (bd4) jd4VarA0 : null;
            if (bd4Var == null || v4e.Q(bd4Var.a)) {
                return;
            }
            zc4 zc4Var = ((ad4) bd4Var.b).a;
            f1d f1dVar = zc4Var.e;
            if ((f1dVar == f1d.a || f1dVar == f1d.c) && zc4Var.f == null && !p0()) {
                if (V() != null || this.y1 == null) {
                    ynb.V(hwf.a(this), fg9.b, null, new zd4(this, null), 2);
                }
            }
        }
    }

    public final void R1(zc4 zc4Var, List list) {
        if (this.L0) {
            return;
        }
        MixedDeckSnapshot mixedDeckSnapshotR = R();
        if (mixedDeckSnapshotR == null || mixedDeckSnapshotR.isValid()) {
            fc4 fc4Var = this.H0;
            if (fc4Var == null) {
                pa7.g0("divinationKey");
                throw null;
            }
            ynb.V(this.m1, null, null, new yf4(this, fc4Var.a, u(zc4Var, list), null), 3);
        }
    }

    public final iy9 S() {
        PhysicalDeckReading physicalDeckReading = this.D1;
        if (physicalDeckReading == null) {
            return null;
        }
        List<TarotCardChoice> cards = physicalDeckReading.getCards();
        List<PatternData> patternData = physicalDeckReading.getPatternData();
        ArrayList arrayList = new ArrayList(t72.u(patternData, 10));
        Iterator<T> it = patternData.iterator();
        while (it.hasNext()) {
            arrayList.add(((PatternData) it.next()).getName());
        }
        return new iy9(cards, arrayList);
    }

    public final DrawCardSaves S0() {
        Object vd4Var;
        vz9 vz9Var = this.J1;
        iy9 iy9Var = (iy9) vz9Var.getValue();
        if (iy9Var != null) {
            String str = (String) iy9Var.a();
            InterruptedDrawing interruptedDrawing = (InterruptedDrawing) iy9Var.b();
            hf8.Q.getClass();
            ef8.a("DrawCardScreen").e("Recovering interrupted drawing for chatId: " + str + ", patterns: " + interruptedDrawing.getPatterns() + ", cards: " + interruptedDrawing.getCards() + ", drawnIndexes: " + interruptedDrawing.getDrawnIndexes());
            jd4 jd4VarA0 = a0();
            if (jd4VarA0 instanceof zc4) {
                vd4Var = new ud4(zc4.b((zc4) jd4VarA0, null, interruptedDrawing.getPatterns(), null, 123));
            } else {
                if (!(jd4VarA0 instanceof id4)) {
                    d().b("Invalid state " + a0() + " for recovery drawing");
                    return null;
                }
                String str2 = ((id4) jd4VarA0).a;
                if (str2 != null) {
                    ale.a.getClass();
                    ale aleVarH = pzd.h(str2);
                    if (aleVarH != null) {
                        vd4Var = new vd4(aleVarH, interruptedDrawing.getPatterns());
                    }
                }
            }
            this.h2.setValue(vd4Var);
            vz9Var.setValue(null);
            nm4 nm4Var = DrawCardSaves.Companion;
            List<PatternData> patterns = interruptedDrawing.getPatterns();
            List<TarotCardChoice> cards = interruptedDrawing.getCards();
            List<Integer> drawnIndexes = interruptedDrawing.getDrawnIndexes();
            MixedDeckSnapshot mixedDeckSnapshotR = R();
            nm4Var.getClass();
            return nm4.a(str, patterns, cards, drawnIndexes, mixedDeckSnapshotR);
        }
        return null;
    }

    public final cfb T() {
        if (p0() || this.y1 != null) {
            return cfb.CAMERA;
        }
        return V() != null ? cfb.SCENARIO : cfb.MAIN;
    }

    public final void T0(a26 a26Var) {
        TarotCardChoice tarotCardChoiceCopy$default;
        zc4 zc4Var;
        jd4 jd4VarA0 = a0();
        if (jd4VarA0 instanceof bd4) {
            bd4 bd4Var = (bd4) jd4VarA0;
            dd4 dd4Var = bd4Var.b;
            ad4 ad4Var = dd4Var instanceof ad4 ? (ad4) dd4Var : null;
            List list = ad4Var != null ? ad4Var.b : null;
            List list2 = pu4.a;
            if (list == null) {
                list = list2;
            }
            List list3 = (ad4Var == null || (zc4Var = ad4Var.a) == null) ? null : zc4Var.c;
            if (list3 != null) {
                list2 = list3;
            }
            ArrayList arrayList = new ArrayList(t72.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((PatternData) it.next()).getName());
            }
            long[] jArr = zf4.a;
            ArrayList arrayList2 = new ArrayList(t72.u(list, 10));
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    t72.Z();
                    throw null;
                }
                TarotCardChoice tarotCardChoice = (TarotCardChoice) obj;
                String str = (String) s72.y0(i, arrayList);
                if (str != null) {
                    String str2 = !v4e.Q(str) ? str : null;
                    if (str2 != null && (tarotCardChoiceCopy$default = TarotCardChoice.copy$default(tarotCardChoice, null, false, str2, 3, null)) != null) {
                        tarotCardChoice = tarotCardChoiceCopy$default;
                    }
                }
                arrayList2.add(tarotCardChoice);
                i = i2;
            }
            List listD = o7c.D(P());
            fc4 fc4Var = this.H0;
            if (fc4Var == null) {
                pa7.g0("divinationKey");
                throw null;
            }
            ad4 ad4Var2 = (ad4) dd4Var;
            a26Var.d(new SharedDivination(fc4Var.a, ad4Var2.a.a, bd4Var.a, arrayList2, listD, o7c.C(P(), ad4Var2.a.a, bd4Var.a), R()));
        }
    }

    public final String U() {
        if (l0() || ((Boolean) this.J0.getValue()).booleanValue() || m0() || this.L0 || O() != null || o0()) {
            return null;
        }
        if (V() == null && this.y1 != null) {
            return null;
        }
        z27 z27Var = this.F0;
        if ((z27Var instanceof x27) || (z27Var instanceof v27)) {
            if (q0()) {
                return "quick_draw";
            }
            return (V() != null || (I() instanceof wd4)) ? "scene" : Constants.NORMAL;
        }
        if ((z27Var instanceof u27) || (z27Var instanceof w27) || (z27Var instanceof y27)) {
            return null;
        }
        ap.c();
        return null;
    }

    public final void U0(Operation operation, x16 x16Var) {
        w1(true);
        ynb.V(hwf.a(this), null, null, new af4(this, operation, x16Var, null), 3);
    }

    public final SceneTarot V() {
        return (SceneTarot) this.w1.getValue();
    }

    public final void V0() {
        ad4 ad4VarM = ym8.m(a0());
        if (ad4VarM == null || (H() == null && s() != null)) {
            M0(Operation.Explanation.INSTANCE);
        } else {
            M0(new Operation.SubmitSpread(ad4VarM.b));
        }
    }

    public final ale W() {
        String str;
        jd4 jd4VarA0 = a0();
        id4 id4Var = jd4VarA0 instanceof id4 ? (id4) jd4VarA0 : null;
        if (id4Var == null || (str = id4Var.a) == null) {
            return null;
        }
        ale.a.getClass();
        return pzd.h(str);
    }

    public final kl5 W0(wj5 wj5Var) {
        return new kl5(wj5Var, new bf4(this, null), 1);
    }

    public final suc X() {
        return (suc) this.d2.getValue();
    }

    public final void X0(ot8 ot8Var) {
        qn4.Q(this.R0, ot8Var);
    }

    public final boolean Y() {
        UsageBilling usageBilling;
        QuotaUsage quotaUsageB = ((eab) this.w).b();
        if (quotaUsageB != null && (usageBilling = quotaUsageB.getUsageBilling()) != null && !usageBilling.getCanFollowUp()) {
            long[] jArr = zf4.a;
            List<UsageBillingBalance> balances = usageBilling.getBalances();
            if (balances == null || !balances.isEmpty()) {
                for (UsageBillingBalance usageBillingBalance : balances) {
                    if (usageBillingBalance.isAvailable() && zf4.c.contains(usageBillingBalance.getSource())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String Y0(jd4 jd4Var) {
        if (pa7.t(jd4Var, hd4.a)) {
            return (q0() || V() != null) ? "question_after_draw" : "question";
        }
        if (jd4Var instanceof id4) {
            return "spread_select";
        }
        if (pa7.t(jd4Var, cd4.a)) {
            return "draw";
        }
        if (jd4Var instanceof gd4) {
            return "question_edit";
        }
        if (jd4Var instanceof fd4) {
            return "question_info";
        }
        if (jd4Var instanceof zc4) {
            return "spread_select";
        }
        if ((jd4Var instanceof ad4) || (jd4Var instanceof bd4)) {
            return "reading";
        }
        ap.c();
        return null;
    }

    public final boolean Z() {
        UsageBilling usageBilling;
        UsageBilling usageBilling2;
        Instant instantC;
        QuotaUsage quotaUsageB = ((eab) this.w).b();
        this.x.getClass();
        if (quotaUsageB != null && !quotaUsageB.getHasSubscription() && ((usageBilling = quotaUsageB.getUsageBilling()) == null || !usageBilling.getCanFollowUp())) {
            UsageBilling usageBilling3 = quotaUsageB.getUsageBilling();
            Instant instant = lm4.d(quotaUsageB, !(usageBilling3 != null && usageBilling3.getEnabled())).b;
            if (instant != null && ((usageBilling2 = quotaUsageB.getUsageBilling()) == null || (instantC = lm4.c(usageBilling2)) == null || instant.compareTo(instantC) <= 0)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Z0(String str, boolean z, zn2 zn2Var) throws Throwable {
        f0 f0Var;
        if (zn2Var instanceof f0) {
            f0Var = (f0) zn2Var;
            int i = f0Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                f0Var.label = i - Integer.MIN_VALUE;
            } else {
                f0Var = new f0(this, zn2Var);
            }
        } else {
            f0Var = new f0(this, zn2Var);
        }
        Object obj = f0Var.result;
        int i2 = f0Var.label;
        boolean z2 = true;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                d().g("Clarifying card already resolved; refreshing requestId=" + str);
                f0Var.L$0 = str;
                f0Var.Z$0 = z;
                f0Var.label = 1;
                Object objV0 = v0(f0Var);
                Object obj2 = bw2.a;
                if (objV0 == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = f0Var.Z$0;
                str = (String) f0Var.L$0;
                jzb.q(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            d().c("Refresh follow-up messages after clarifying conflict failed: requestId=" + str, e2);
            z2 = false;
        }
        t12 t12Var = (t12) P().b.get(str);
        ClarifyingCardState clarifyingCardState = t12Var != null ? t12Var.d : null;
        lsd lsdVar = this.S0;
        if (z2 && !s72.o0(qd0.I0(new ClarifyingCardState[]{ClarifyingCardState.PendingDecision, ClarifyingCardState.Drawing}), clarifyingCardState)) {
            p(str);
            lsdVar.remove(str);
        } else if (z) {
            lsdVar.put(str, new ClarifyingCardSkipActionState.Failed(FailReason.Network.INSTANCE));
        } else {
            this.U0.put(str, s12.a);
            this.T0.put(str, new ClarifyingCardDrawActionState.Failed(FailReason.Network.INSTANCE));
        }
        q1();
        return wef.a;
    }

    public final jd4 a0() {
        return (jd4) this.M0.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a1(Operation operation, zn2 zn2Var) {
        g0 g0Var;
        Operation operation2;
        int i;
        if (zn2Var instanceof g0) {
            g0Var = (g0) zn2Var;
            int i2 = g0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g0Var.label = i2 - Integer.MIN_VALUE;
            } else {
                g0Var = new g0(this, zn2Var);
            }
        } else {
            g0Var = new g0(this, zn2Var);
        }
        Object objZ0 = g0Var.result;
        int i3 = g0Var.label;
        wef wefVar = wef.a;
        Object obj = bw2.a;
        if (i3 == 0) {
            jzb.q(objZ0);
            w1(true);
            g0Var.L$0 = operation;
            g0Var.label = 1;
            objZ0 = z0(g0Var);
            if (objZ0 != obj) {
            }
            return obj;
        }
        if (i3 == 1) {
            operation = (Operation) g0Var.L$0;
            jzb.q(objZ0);
        } else {
            if (i3 != 2) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = g0Var.I$0;
            operation2 = (Operation) g0Var.L$0;
            jzb.q(objZ0);
        }
        if (((Boolean) objZ0).booleanValue() && i == 0) {
            if (!(operation2 instanceof Operation.SubmitSpread) && ym8.m(a0()) != null) {
                M0(Operation.Explanation.INSTANCE);
                return wefVar;
            }
            if (operation2 instanceof Operation.Explanation) {
                w1(false);
                B1(operation2, FailReason.Network.INSTANCE);
                q1();
            }
        }
        return wefVar;
        TarotReadingHistory tarotReadingHistory = (TarotReadingHistory) objZ0;
        L1(null);
        q();
        if (tarotReadingHistory == null) {
            w1(false);
            B1(operation, FailReason.Network.INSTANCE);
            q1();
            return wefVar;
        }
        TarotReadingBody reading = tarotReadingHistory.getReading();
        String content = reading != null ? reading.getContent() : null;
        int i4 = ((content == null || v4e.Q(content)) ? 1 : 0) ^ 1;
        g0Var.L$0 = operation;
        g0Var.L$1 = null;
        g0Var.I$0 = i4;
        g0Var.label = 2;
        objZ0 = f(tarotReadingHistory, operation, g0Var);
        if (objZ0 != obj) {
            operation2 = operation;
            i = i4;
            if (((Boolean) objZ0).booleanValue()) {
                if (!(operation2 instanceof Operation.SubmitSpread)) {
                }
                if (operation2 instanceof Operation.Explanation) {
                    w1(false);
                    B1(operation2, FailReason.Network.INSTANCE);
                    q1();
                }
            }
            return wefVar;
        }
        return obj;
    }

    public final Operation b0() {
        return (Operation) this.V1.getValue();
    }

    public final void b1(String str) {
        String str2;
        if (!j0() || this.X1 == null) {
            fl8 fl8Var = new fl8();
            fc4 fc4Var = this.H0;
            if (fc4Var == null) {
                pa7.g0("divinationKey");
                throw null;
            }
            fl8Var.put("conversation_id", fc4Var.a);
            if (str == null) {
                str = "main";
            }
            fl8Var.put("divination_type", str);
            if (V() != null) {
                str2 = "scene";
            } else if (O() != null) {
                str2 = "new_reading";
            } else if (o0()) {
                str2 = "camera";
            } else {
                z27 z27Var = this.F0;
                if (z27Var instanceof u27) {
                    str2 = "activity";
                } else if (j0()) {
                    str2 = "history";
                } else {
                    x27 x27Var = z27Var instanceof x27 ? (x27) z27Var : null;
                    if (x27Var == null || (str2 = x27Var.b) == null) {
                        str2 = Constants.NORMAL;
                    }
                }
            }
            fl8Var.put("triggered_by", str2);
            if (q0()) {
                fl8Var.put("entry_source", "quick_draw");
            }
            az1 az1VarC = C();
            if (az1VarC != null) {
                fl8Var.putAll(bm8.H(new iy9("triggered_by", "new_reading"), new iy9("divination_type", az1VarC.a.a), new iy9("session_id", az1VarC.b)));
            }
            fl8 fl8VarJ = fl8Var.j();
            fc4 fc4Var2 = this.H0;
            if (fc4Var2 == null) {
                pa7.g0("divinationKey");
                throw null;
            }
            String str3 = fc4Var2.a;
            str3.getClass();
            if (v4e.Q(str3)) {
                return;
            }
            x1f x1fVar = x1f.a;
            if (x1f.d()) {
                il ilVar = il.a;
                Map mapM = bm8.M(fl8VarJ, new iy9("app_state", il.a()));
                qn2 qn2Var = lw2.a;
                js3 js3Var = ga4.a;
                ynb.V(qn2Var, hr3.c, null, new yq2(str3, mapM, null), 2);
            }
        }
    }

    public final void c1(oyb oybVar, boolean z) {
        if (oybVar instanceof nyb) {
            this.X1 = Instant.now();
            if (z) {
                ConcurrentHashMap concurrentHashMap = xfb.a;
                String str = this.I0;
                str.getClass();
                vfb vfbVar = (vfb) xfb.a.get(str);
                if (vfbVar != null) {
                    synchronized (vfbVar) {
                        vfbVar.k = true;
                    }
                }
            }
        }
    }

    public final boolean d0() {
        return ((Boolean) this.g1.getValue()).booleanValue();
    }

    public final void d1(String str) {
        Object dzbVar;
        boolean zEquals = str.equals("mixed_tarot");
        String str2 = this.I0;
        if (zEquals) {
            ConcurrentHashMap concurrentHashMap = xfb.a;
            xfb.b(str2, str);
            return;
        }
        try {
            xke xkeVar = TarotSkinIdentify.Companion;
            n2f n2fVarValueOf = n2f.valueOf(str);
            xkeVar.getClass();
            dzbVar = xke.a(n2fVarValueOf);
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        if (dzbVar instanceof dzb) {
            dzbVar = null;
        }
        TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) dzbVar;
        if (tarotSkinIdentify == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap2 = xfb.a;
        xfb.b(str2, urg.r(tarotSkinIdentify));
        this.C1 = str;
    }

    @Override // defpackage.ewf
    public final void e() {
        ConcurrentHashMap concurrentHashMap = xfb.a;
        String str = this.I0;
        str.getClass();
        xfb.a.remove(str);
        xfb.b.remove(str);
        t6f t6fVar = this.E0;
        t6fVar.k();
        jgb.I(t6fVar.d, null);
        ((je0) this.G0.getValue()).c();
        jgb.I(this.m1, null);
    }

    public final boolean e0() {
        if (d0() || L() != null) {
            return false;
        }
        if (pa7.t(a0(), hd4.a) || (a0() instanceof fd4)) {
            return true;
        }
        if (m0() || ((Boolean) this.Q1.getValue()).booleanValue() || !(a0() instanceof bd4)) {
            return false;
        }
        return Q();
    }

    public final void e1(String str) {
        str.getClass();
        ConcurrentHashMap concurrentHashMap = xfb.a;
        xfb.h(this.I0, new jhb(str, null, null, null));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a2 A[Catch: Exception -> 0x007a, CancellationException -> 0x01f8, TryCatch #0 {Exception -> 0x007a, blocks: (B:22:0x0071, B:32:0x009d, B:34:0x00a2, B:36:0x00d8, B:29:0x0086), top: B:75:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:44:0x0100  */
    /* JADX WARN: Code duplicated, block: B:47:0x0120  */
    /* JADX WARN: Code duplicated, block: B:51:0x014d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0162  */
    /* JADX WARN: Code duplicated, block: B:59:0x016e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0184  */
    /* JADX WARN: Code duplicated, block: B:63:0x0189  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x011d, code lost:
    
        if (r4.h(defpackage.s7.a(), r0, r2) == r10) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r28v0, types: [ai.askquin.ui.conversation.r0, ewf, hf8] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [ai.askquin.ui.conversation.Operation] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(tech.chatmind.api.TarotReadingHistory r29, ai.askquin.ui.conversation.Operation r30, defpackage.zn2 r31) {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.askquin.ui.conversation.r0.f(tech.chatmind.api.TarotReadingHistory, ai.askquin.ui.conversation.Operation, zn2):java.lang.Object");
    }

    public final boolean f0() {
        QuotaUsage quotaUsageB = ((eab) this.w).b();
        int iF = F();
        this.x.getClass();
        p9b p9bVarB = lm4.b(quotaUsageB, iF);
        QuotaBlockReason quotaBlockReason = QuotaBlockReason.DailyLimit;
        o9b o9bVar = p9bVarB instanceof o9b ? (o9b) p9bVarB : null;
        return (o9bVar != null ? o9bVar.a : null) == quotaBlockReason;
    }

    public final kl5 f1(wj5 wj5Var) {
        return new kl5(wj5Var, new df4(this, null), 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(ad4 ad4Var, String str, zn2 zn2Var) {
        j jVar;
        if (zn2Var instanceof j) {
            jVar = (j) zn2Var;
            int i = jVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                jVar.label = i - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, zn2Var);
            }
        } else {
            jVar = new j(this, zn2Var);
        }
        Object obj = jVar.result;
        int i2 = jVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            fc4 fc4Var = this.H0;
            if (fc4Var == null) {
                pa7.g0("divinationKey");
                throw null;
            }
            String str2 = fc4Var.a;
            jVar.L$0 = ad4Var;
            jVar.L$1 = str;
            jVar.label = 1;
            u97 u97Var = this.e;
            u97Var.getClass();
            Object objH = u97Var.h(s7.a(), str2, jVar);
            bw2 bw2Var = bw2.a;
            if (objH == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) jVar.L$1;
            ad4Var = (ad4) jVar.L$0;
            jzb.q(obj);
        }
        String strI = ib8.i();
        x72.i0(new to3(23), this.R0);
        fc4 fc4Var2 = this.H0;
        if (fc4Var2 == null) {
            pa7.g0("divinationKey");
            throw null;
        }
        ((gq3) this.f).i(fc4Var2.a, false);
        A1(Instant.now());
        X0(new et8(strI, str, true));
        K1(new bd4(str, ad4Var));
        g1("reading_done");
        ynb.V(hwf.a(this), null, null, new cf4(this, null), 3);
        R0();
        G1(false);
        F1(null);
        w1(false);
        this.X1 = Instant.now();
        q1();
        return wef.a;
    }

    public final boolean g0() {
        return H() != null || (I() instanceof vd4) || (I() instanceof wd4);
    }

    public final void g1(String str) {
        cm4 cm4VarH;
        List list;
        ad4 ad4VarM = ym8.m(a0());
        int iK = 0;
        int size = ((ad4VarM == null || (list = ad4VarM.b) == null) && ((cm4VarH = H()) == null || (list = cm4VarH.d) == null)) ? 0 : list.size();
        if (size > 0) {
            ale.a.getClass();
            iK = pzd.k(size);
        }
        ConcurrentHashMap concurrentHashMap = xfb.a;
        if (xfb.e(iK, this.I0, str)) {
            this.J0.setValue(Boolean.TRUE);
        }
    }

    public final void h(String str, List list) {
        if (pa7.t(this.f2, str)) {
            Iterator it = A().iterator();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                } else if (pa7.t(((SpreadRecommendationResult) it.next()).getSpreadId(), str)) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 >= 0) {
                List listA = A();
                ArrayList arrayList = new ArrayList(t72.u(listA, 10));
                for (Object obj : listA) {
                    int i3 = i + 1;
                    if (i < 0) {
                        t72.Z();
                        throw null;
                    }
                    SpreadRecommendationResult spreadRecommendationResultCopy$default = (SpreadRecommendationResult) obj;
                    if (i == i2) {
                        spreadRecommendationResultCopy$default = SpreadRecommendationResult.copy$default(spreadRecommendationResultCopy$default, null, list, null, null, false, 0, 61, null);
                    }
                    arrayList.add(spreadRecommendationResultCopy$default);
                    i = i3;
                }
                this.b2.setValue(arrayList);
            }
            v1(defpackage.d.a);
            jd4 jd4VarA0 = a0();
            zc4 zc4Var = jd4VarA0 instanceof zc4 ? (zc4) jd4VarA0 : null;
            if (zc4Var != null) {
                if (!pa7.t(zc4Var.g, str)) {
                    zc4Var = null;
                }
                if (zc4Var != null) {
                    K1(zc4.b(zc4Var, null, list, null, 123));
                }
            }
            q1();
        }
    }

    public final boolean h0() {
        return ((Boolean) this.c1.getValue()).booleanValue();
    }

    public final void h1() {
        if (this.O1) {
            return;
        }
        jd4 jd4VarA0 = a0();
        boolean zM0 = m0();
        boolean zP0 = p0();
        boolean z = false;
        boolean z2 = V() != null;
        String strK1 = k1();
        String str = this.y1;
        jd4VarA0.getClass();
        jsd jsdVar = this.R0;
        jsdVar.getClass();
        if (!zM0) {
            bd4 bd4Var = jd4VarA0 instanceof bd4 ? (bd4) jd4VarA0 : null;
            if (bd4Var != null) {
                boolean z3 = zP0 || pa7.t(str, "physical_deck");
                if ((!z2 || (strK1 != null && !v4e.Q(strK1))) && ((str == null || z2 || z3) && ((ad4) bd4Var.b).a.f == null)) {
                    z = !ok8.z(jsdVar);
                }
            }
        }
        if (z) {
            this.O1 = true;
            ynb.V(hwf.a(this), null, null, new ef4(this, null), 3);
        }
    }

    public final void i(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = cp5.c(list).iterator();
        while (it.hasNext()) {
            qn4.Q(arrayList, (ot8) it.next());
        }
        jsd jsdVar = this.R0;
        ListIterator listIterator = jsdVar.listIterator();
        int i = 0;
        while (true) {
            ql6 ql6Var = (ql6) listIterator;
            if (!ql6Var.hasNext()) {
                i = -1;
                break;
            } else if (((ot8) ql6Var.next()) instanceof et8) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            List listC1 = s72.c1(jsdVar, i + 1);
            jsdVar.clear();
            jsdVar.addAll(listC1);
            jsdVar.addAll(arrayList);
        } else {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                X0((ot8) it2.next());
            }
        }
        Set set = qp5.a;
        LinkedHashMap linkedHashMap = qp5.a(qu4.a, jsdVar).b;
        lsd lsdVar = this.S0;
        Iterator it3 = s72.j1(lsdVar.c).iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            String str = (String) it3.next();
            t12 t12Var = (t12) linkedHashMap.get(str);
            if ((t12Var != null ? t12Var.d : null) != ClarifyingCardState.PendingDecision) {
                lsdVar.remove(str);
            }
        }
        o1d o1dVar = new o1d();
        o1dVar.addAll(this.T0.c);
        o1dVar.addAll(this.U0.c);
        o1dVar.addAll(this.V0.c);
        Object it4 = o1dVar.d().iterator();
        while (((el8) it4).hasNext()) {
            String str2 = (String) ((cl8) it4).next();
            t12 t12Var2 = (t12) linkedHashMap.get(str2);
            ClarifyingCardState clarifyingCardState = t12Var2 != null ? t12Var2.d : null;
            switch (clarifyingCardState == null ? -1 : yd4.a[clarifyingCardState.ordinal()]) {
                case -1:
                case 1:
                case 2:
                case 3:
                case 4:
                    p(str2);
                    break;
                case 0:
                default:
                    ap.c();
                    return;
                case 5:
                case 6:
                    break;
            }
        }
        q1();
    }

    public final boolean i0() {
        Object next;
        Object next2;
        UsageBillingBalance usageBillingBalance;
        UsageBilling usageBilling;
        QuotaUsage quotaUsageB = ((eab) this.w).b();
        List<UsageBillingBalance> balances = (quotaUsageB == null || (usageBilling = quotaUsageB.getUsageBilling()) == null) ? null : usageBilling.getBalances();
        if (balances == null) {
            balances = pu4.a;
        }
        Iterator<T> it = balances.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((UsageBillingBalance) next).getInUse());
        UsageBillingBalance usageBillingBalance2 = (UsageBillingBalance) next;
        if (usageBillingBalance2 == null) {
            Iterator<T> it2 = balances.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                usageBillingBalance = (UsageBillingBalance) next2;
                if (pa7.t(usageBillingBalance.getSource(), UsageBillingBalance.SOURCE_VIP_WEEK)) {
                    break;
                }
            } while (!pa7.t(usageBillingBalance.getResetType(), "weekly"));
            usageBillingBalance2 = (UsageBillingBalance) next2;
        }
        if (pa7.t(usageBillingBalance2 != null ? usageBillingBalance2.getSource() : null, UsageBillingBalance.SOURCE_VIP_WEEK)) {
            return true;
        }
        return pa7.t(usageBillingBalance2 != null ? usageBillingBalance2.getResetType() : null, "weekly");
    }

    public final void i1() {
        lyd lydVar = this.F1;
        if (lydVar != null) {
            lydVar.h(null);
        }
        this.F1 = null;
        this.G1 = null;
        this.E1.setValue(Boolean.FALSE);
    }

    public final boolean j0() {
        if (this.F0 instanceof v27) {
            return true;
        }
        w27 w27VarO = O();
        return (w27VarO != null ? w27VarO.d : null) != null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j1(ad4 ad4Var, QuotaBlockReason quotaBlockReason, zn2 zn2Var) {
        i0 i0Var;
        if (zn2Var instanceof i0) {
            i0Var = (i0) zn2Var;
            int i = i0Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                i0Var.label = i - Integer.MIN_VALUE;
            } else {
                i0Var = new i0(this, zn2Var);
            }
        } else {
            i0Var = new i0(this, zn2Var);
        }
        Object objX0 = i0Var.result;
        int i2 = i0Var.label;
        Object obj = bw2.a;
        if (i2 == 0) {
            jzb.q(objX0);
            w1(true);
            i0Var.L$0 = ad4Var;
            i0Var.L$1 = quotaBlockReason;
            i0Var.label = 1;
            objX0 = x0(i0Var);
            if (objX0 != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objX0);
            return objX0;
        }
        quotaBlockReason = (QuotaBlockReason) i0Var.L$1;
        ad4Var = (ad4) i0Var.L$0;
        jzb.q(objX0);
        String str = (String) objX0;
        L1(null);
        q();
        if (str == null) {
            y(quotaBlockReason);
            return wef.a;
        }
        d().e("quota failure: adopting cloud reading content (len=" + str.length() + ")");
        i0Var.L$0 = null;
        i0Var.L$1 = null;
        i0Var.L$2 = null;
        i0Var.label = 2;
        Object objG = g(ad4Var, str, i0Var);
        return objG == obj ? obj : objG;
    }

    public final void k(String str, String str2) {
        str2.getClass();
        if (((Boolean) this.J0.getValue()).booleanValue() || str == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = xfb.a;
        String str3 = this.I0;
        str3.getClass();
        if (xfb.b.contains(str3)) {
            return;
        }
        xfb.a.putIfAbsent(str3, new vfb(str, str2, null, null));
    }

    public final boolean k0() {
        if (j0() && (a0() instanceof zc4)) {
            return ((iy9) this.J1.getValue()) != null || (I() instanceof ud4);
        }
        return false;
    }

    public final String k1() {
        String sceneId;
        String str = this.x1;
        if (str != null) {
            if (v4e.Q(str)) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        SceneTarot sceneTarotV = V();
        if (sceneTarotV == null || (sceneId = sceneTarotV.getSceneId()) == null || v4e.Q(sceneId)) {
            return null;
        }
        return sceneId;
    }

    public final boolean l0() {
        return ((Boolean) this.i1.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object l1(List list, zn2 zn2Var) throws Throwable {
        j0 j0Var;
        if (zn2Var instanceof j0) {
            j0Var = (j0) zn2Var;
            int i = j0Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                j0Var.label = i - Integer.MIN_VALUE;
            } else {
                j0Var = new j0(this, zn2Var);
            }
        } else {
            j0Var = new j0(this, zn2Var);
        }
        Object obj = j0Var.result;
        int i2 = j0Var.label;
        s12 s12Var = s12.a;
        qu4 qu4Var = qu4.a;
        jsd jsdVar = this.R0;
        wef wefVar = wef.a;
        lsd lsdVar = this.U0;
        lsd lsdVar2 = this.T0;
        lsd lsdVar3 = this.V0;
        ClarifyingCardState clarifyingCardState = null;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                lsdVar2.clear();
                lsdVar.clear();
                lsdVar3.clear();
                if (list.isEmpty()) {
                    return wefVar;
                }
                Set set = qp5.a;
                pp5 pp5VarA = qp5.a(qu4Var, jsdVar);
                HashSet hashSet = new HashSet();
                ArrayList<PendingClarifyingCardSubmission> arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (hashSet.add(((PendingClarifyingCardSubmission) obj2).getRequestMessageId())) {
                        arrayList.add(obj2);
                    }
                }
                for (PendingClarifyingCardSubmission pendingClarifyingCardSubmission : arrayList) {
                    t12 t12Var = (t12) pp5VarA.b.get(pendingClarifyingCardSubmission.getRequestMessageId());
                    if ((t12Var != null ? t12Var.d : clarifyingCardState) == ClarifyingCardState.PendingDecision) {
                        lsdVar3.put(pendingClarifyingCardSubmission.getRequestMessageId(), new j6a(pendingClarifyingCardSubmission.getCard(), pendingClarifyingCardSubmission.getWheelIndex()));
                        lsdVar.put(pendingClarifyingCardSubmission.getRequestMessageId(), s12Var);
                        lsdVar2.put(pendingClarifyingCardSubmission.getRequestMessageId(), ClarifyingCardDrawActionState.Loading.INSTANCE);
                    }
                    clarifyingCardState = null;
                }
                if (lsdVar3.isEmpty()) {
                    q1();
                    return wefVar;
                }
                j0Var.L$0 = null;
                j0Var.L$1 = null;
                j0Var.label = 1;
                Object objV0 = v0(j0Var);
                Object obj3 = bw2.a;
                if (objV0 == obj3) {
                    return obj3;
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            m8b m8bVarD = d();
            fc4 fc4Var = this.H0;
            if (fc4Var == null) {
                pa7.g0("divinationKey");
                throw null;
            }
            m8bVarD.c("Refresh follow-up messages while restoring clarifying card failed: chatId=" + fc4Var.a, e2);
        }
        Set set2 = qp5.a;
        pp5 pp5VarA2 = qp5.a(qu4Var, jsdVar);
        for (String str : s72.j1(lsdVar3.c)) {
            t12 t12Var2 = (t12) pp5VarA2.b.get(str);
            if ((t12Var2 != null ? t12Var2.d : null) == ClarifyingCardState.PendingDecision) {
                lsdVar.put(str, s12Var);
                lsdVar2.put(str, new ClarifyingCardDrawActionState.Failed(FailReason.Network.INSTANCE));
            } else {
                p(str);
            }
        }
        q1();
        return wefVar;
    }

    public final boolean m0() {
        return ((Boolean) this.H1.getValue()).booleanValue();
    }

    public final void m1() {
        Operation operation = (Operation) q().a();
        if (operation == null) {
            return;
        }
        if ((operation instanceof Operation.Explanation) || ((operation instanceof Operation.SubmitSpread) && ym8.m(a0()) != null)) {
            if (ym8.m(a0()) == null) {
                B1(operation, FailReason.Network.INSTANCE);
                return;
            } else {
                w1(true);
                ynb.V(hwf.a(this), null, null, new k0(null, this, operation), 3);
                return;
            }
        }
        if ((operation instanceof Operation.Ask) || (operation instanceof Operation.UpdateQuestion)) {
            U0(operation, new qd4(this, operation, 0));
        } else {
            M0(operation);
        }
    }

    public final ClarifyingCardDrawActionState n(String str) {
        str.getClass();
        ClarifyingCardDrawActionState clarifyingCardDrawActionState = (ClarifyingCardDrawActionState) this.T0.get(str);
        return clarifyingCardDrawActionState == null ? ClarifyingCardDrawActionState.Idle.INSTANCE : clarifyingCardDrawActionState;
    }

    public final boolean n0() {
        return ((Boolean) this.Y1.getValue()).booleanValue();
    }

    public final void n1(String str) {
        j6a j6aVar;
        str.getClass();
        if (pa7.t(o(str), ClarifyingCardSkipActionState.Loading.INSTANCE) || (j6aVar = (j6a) this.V0.get(str)) == null || !O1(str, j6aVar.a, j6aVar.b)) {
            return;
        }
        this.S0.remove(str);
    }

    public final ClarifyingCardSkipActionState o(String str) {
        str.getClass();
        ClarifyingCardSkipActionState clarifyingCardSkipActionState = (ClarifyingCardSkipActionState) this.S0.get(str);
        return clarifyingCardSkipActionState == null ? ClarifyingCardSkipActionState.Idle.INSTANCE : clarifyingCardSkipActionState;
    }

    public final boolean o0() {
        return p0() || pa7.t(this.y1, "physical_deck");
    }

    public final sk5 o1(kl5 kl5Var, Operation operation) {
        L1(operation);
        q1();
        return new sk5(new kl5(new al5(new yk5(kl5Var, new gf4(null, this, operation)), new hf4(3, null)), new l0(null, this, operation), 1), new if4(this, null));
    }

    public final void p(String str) {
        this.T0.remove(str);
        this.U0.remove(str);
        this.V0.remove(str);
    }

    public final boolean p0() {
        return this.D1 != null;
    }

    public final void p1() {
        jd4 jd4VarA0 = a0();
        if ((jd4VarA0 instanceof ad4) && (L() instanceof Operation.Explanation)) {
            this.R0.removeIf(new rd4(new to3(18), 0));
            K1(((ad4) jd4VarA0).a);
            q();
        }
    }

    public final iy9 q() {
        iy9 iy9Var = new iy9(L(), M());
        d().e("clear failed operation: " + iy9Var);
        this.T1.setValue(null);
        this.U1.setValue(null);
        return iy9Var;
    }

    public final boolean q0() {
        cm4 cm4VarH = H();
        return (cm4VarH != null ? cm4VarH.a : null) == dm4.a || (I() instanceof vd4) || (a0() instanceof id4);
    }

    public final void q1() {
        if (this.L0 || r0()) {
            return;
        }
        if (H() == null || this.P0 || this.X1 != null) {
            if (this.R0.isEmpty() && H() == null) {
                return;
            }
            ((gq3) this.f).g(w());
        }
    }

    public final UserSelectedSpread r() {
        String strS = s();
        if (strS == null || H() != null) {
            return null;
        }
        SceneTarot sceneTarotV = V();
        if (sceneTarotV != null) {
            return new UserSelectedSpread(strS, M1(sceneTarotV.getPatternData(), sceneTarotV.getChoices()));
        }
        PhysicalDeckReading physicalDeckReading = this.D1;
        if (physicalDeckReading != null) {
            return new UserSelectedSpread(strS, M1(physicalDeckReading.getPatternData(), physicalDeckReading.getCards()));
        }
        return null;
    }

    public final boolean r0() {
        return ((Boolean) this.Q0.getValue()).booleanValue();
    }

    public final void r1(List list, List list2, List list3) {
        if (list2.isEmpty()) {
            return;
        }
        m8b m8bVarD = d();
        fc4 fc4Var = this.H0;
        if (fc4Var == null) {
            pa7.g0("divinationKey");
            throw null;
        }
        StringBuilder sbO = ib8.o("saveInterruptedDrawingCard for ", fc4Var.a, ": ", s72.D0(list2, ",", null, null, new to3(24), 30), ", drawnIndexes: ");
        sbO.append(list3);
        m8bVarD.e(sbO.toString());
        this.I1 = new InterruptedDrawing(s72.j1(list2), list, list3);
        q1();
    }

    public final String s() {
        String str;
        if (H() != null) {
            cm4 cm4VarH = H();
            return (cm4VarH == null || (str = cm4VarH.b) == null) ? "user_customized" : str;
        }
        if (V() == null) {
            if (this.D1 != null) {
                return "user_customized";
            }
            return null;
        }
        SceneTarot sceneTarotV = V();
        if (sceneTarotV != null) {
            return sceneTarotV.getSpreadId();
        }
        return null;
    }

    public final boolean s0() {
        return this.S1.j() > 0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object s1(DrawCardSaves drawCardSaves, zn2 zn2Var) {
        m0 m0Var;
        if (zn2Var instanceof m0) {
            m0Var = (m0) zn2Var;
            int i = m0Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                m0Var.label = i - Integer.MIN_VALUE;
            } else {
                m0Var = new m0(this, zn2Var);
            }
        } else {
            m0Var = new m0(this, zn2Var);
        }
        Object objA = m0Var.result;
        int i2 = m0Var.label;
        boolean z = true;
        try {
            try {
                try {
                    if (i2 == 0) {
                        jzb.q(objA);
                        if (this.P0 || drawCardSaves.getChoices().isEmpty()) {
                            return Boolean.TRUE;
                        }
                        xd4 xd4VarI = I();
                        vd4 vd4Var = xd4VarI instanceof vd4 ? (vd4) xd4VarI : null;
                        if (vd4Var == null) {
                            return Boolean.FALSE;
                        }
                        if (!this.L0 && !r0()) {
                            String chatId = drawCardSaves.getChatId();
                            fc4 fc4Var = this.H0;
                            if (fc4Var == null) {
                                pa7.g0("divinationKey");
                                throw null;
                            }
                            if (pa7.t(chatId, fc4Var.a)) {
                                if (drawCardSaves.getChoices().size() >= vd4Var.b.size()) {
                                    return Boolean.FALSE;
                                }
                                y1(new cm4(dm4.a, vd4Var.a.getId(), drawCardSaves.getPatterns(), drawCardSaves.getChoices(), null));
                                MixedDeckSnapshot mixedDeck = drawCardSaves.getMixedDeck();
                                if (mixedDeck == null) {
                                    mixedDeck = R();
                                }
                                D1(mixedDeck);
                                this.I1 = new InterruptedDrawing(drawCardSaves.getChoices(), drawCardSaves.getPatterns(), drawCardSaves.getDrawnIndexes());
                                H1(true);
                                gm4 gm4Var = this.g;
                                yc4 yc4VarW = w();
                                m0Var.L$0 = null;
                                m0Var.L$1 = null;
                                m0Var.label = 1;
                                objA = gm4Var.a(yc4VarW, m0Var);
                                bw2 bw2Var = bw2.a;
                                if (objA == bw2Var) {
                                    return bw2Var;
                                }
                            }
                        }
                        return Boolean.FALSE;
                    }
                    if (i2 != 1) {
                        qc0.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jzb.q(objA);
                    yc4 yc4Var = (yc4) objA;
                    this.O0 = yc4Var.b;
                    this.X1 = yc4Var.p;
                    H1(false);
                } catch (Exception e) {
                    d().c("Failed to save interrupted quick draw", e);
                    jcc.k(0, new Integer(R.string.network_common_error));
                    H1(false);
                    z = false;
                }
                return Boolean.valueOf(z);
            } catch (CancellationException e2) {
                throw e2;
            }
        } catch (Throwable th) {
            H1(false);
            throw th;
        }
    }

    public final iy9 t() {
        if (V() != null) {
            return new iy9("scenario", k1());
        }
        return o0() ? new iy9("camera", null) : new iy9(null, null);
    }

    public final void t0(SpreadRecommendationResult spreadRecommendationResult, boolean z) {
        spreadRecommendationResult.getClass();
        defpackage.g gVar = defpackage.g.a;
        if (!z) {
            boolean zT = pa7.t(this.f2, spreadRecommendationResult.getSpreadId());
            vz9 vz9Var = this.e2;
            defpackage.d dVar = defpackage.d.a;
            if (zT && pa7.t((defpackage.h) vz9Var.getValue(), dVar)) {
                return;
            }
            if (pa7.t(this.f2, spreadRecommendationResult.getSpreadId()) && pa7.t((defpackage.h) vz9Var.getValue(), gVar)) {
                return;
            }
            if (p8c.p(spreadRecommendationResult)) {
                this.f2 = spreadRecommendationResult.getSpreadId();
                v1(dVar);
                return;
            }
        }
        lyd lydVar = this.g2;
        if (lydVar != null) {
            lydVar.h(null);
        }
        this.f2 = spreadRecommendationResult.getSpreadId();
        v1(gVar);
        fc4 fc4Var = this.H0;
        if (fc4Var == null) {
            pa7.g0("divinationKey");
            throw null;
        }
        String str = fc4Var.a;
        String spreadId = spreadRecommendationResult.getSpreadId();
        uke ukeVar = (uke) this.d;
        ukeVar.getClass();
        str.getClass();
        spreadId.getClass();
        this.g2 = ok8.C(new kl5(ndc.f(new qje(ukeVar, str, spreadId, null)), new ge4(this, spreadRecommendationResult, null), 1), this.m1);
    }

    public final void t1(int i) {
        if (i < 0 || i >= A().size() || pa7.t(X(), new quc(i))) {
            return;
        }
        this.d2.setValue(new quc(i));
        x1(null);
        t0((SpreadRecommendationResult) A().get(i), false);
        q1();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    public final SubmitSpreadRequest u(zc4 zc4Var, List list) {
        CloudMixedDeckSnapshot cloudMixedDeckSnapshot;
        Object next;
        List<PatternData> patternData;
        String strL;
        Iterator it = A().iterator();
        do {
            cloudMixedDeckSnapshot = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!pa7.t(((SpreadRecommendationResult) next).getSpreadId(), zc4Var.g));
        SpreadRecommendationResult spreadRecommendationResult = (SpreadRecommendationResult) next;
        if (spreadRecommendationResult == null || (patternData = spreadRecommendationResult.getPatternData()) == null) {
            patternData = zc4Var.c;
        } else {
            if (patternData.isEmpty()) {
                patternData = null;
            }
            if (patternData == null) {
                patternData = zc4Var.c;
            }
        }
        UserSelectedSpread userSelectedSpread = new UserSelectedSpread(zc4Var.g, M1(patternData, list));
        MixedDeckSnapshot mixedDeckSnapshotR = R();
        if (mixedDeckSnapshotR != null) {
            if (!mixedDeckSnapshotR.isValid()) {
                qc0.j("A mixed reading must submit its complete version-1 deck mapping");
                return null;
            }
            int version = mixedDeckSnapshotR.getVersion();
            Map<String, String> skinsByCard = mixedDeckSnapshotR.getSkinsByCard();
            LinkedHashMap linkedHashMap = new LinkedHashMap(bm8.F(skinsByCard.size()));
            Iterator<T> it2 = skinsByCard.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                Object key = entry.getKey();
                String str = (String) entry.getValue();
                TarotSkinIdentify tarotSkinIdentifyQ = eb3.Q(str);
                if (tarotSkinIdentifyQ != null && (strL = eb3.L(tarotSkinIdentifyQ)) != null) {
                    str = strL;
                }
                linkedHashMap.put(key, str);
            }
            cloudMixedDeckSnapshot = new CloudMixedDeckSnapshot(version, linkedHashMap);
        }
        return new SubmitSpreadRequest(userSelectedSpread, cloudMixedDeckSnapshot);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0047 A[PHI: r1 r4 r9
  0x0047: PHI (r1v2 java.util.Set) = (r1v1 java.util.Set), (r1v3 java.util.Set) binds: [B:14:0x0038, B:29:0x0087] A[DONT_GENERATE, DONT_INLINE]
  0x0047: PHI (r4v1 java.util.List) = (r4v0 java.util.List), (r4v2 java.util.List) binds: [B:14:0x0038, B:29:0x0087] A[DONT_GENERATE, DONT_INLINE]
  0x0047: PHI (r9v4 java.lang.String) = (r9v3 java.lang.String), (r9v9 java.lang.String) binds: [B:14:0x0038, B:29:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0068 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0078  */
    /* JADX WARN: Code duplicated, block: B:25:0x007f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    /* JADX WARN: Code duplicated, block: B:30:0x0089  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0066 -> B:20:0x0069). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.io.Serializable u0(defpackage.zn2 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof ai.askquin.ui.conversation.o
            if (r0 == 0) goto L13
            r0 = r9
            ai.askquin.ui.conversation.o r0 = (ai.askquin.ui.conversation.o) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            ai.askquin.ui.conversation.o r0 = new ai.askquin.ui.conversation.o
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L38
            if (r1 != r2) goto L32
            java.lang.Object r1 = r0.L$2
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r0.L$1
            java.util.Set r1 = (java.util.Set) r1
            java.lang.Object r4 = r0.L$0
            java.util.List r4 = (java.util.List) r4
            defpackage.jzb.q(r9)
            goto L69
        L32:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r8)
            return r3
        L38:
            defpackage.jzb.q(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r4 = r9
            r9 = r3
        L47:
            fc4 r5 = r8.H0
            if (r5 == 0) goto L9c
            java.lang.String r5 = r5.a
            java.lang.Integer r6 = new java.lang.Integer
            r7 = 100
            r6.<init>(r7)
            r0.L$0 = r4
            r0.L$1 = r1
            r0.L$2 = r3
            r0.label = r2
            yt6 r7 = r8.d
            uke r7 = (defpackage.uke) r7
            java.lang.Object r9 = r7.h(r5, r9, r6, r0)
            bw2 r5 = defpackage.bw2.a
            if (r9 != r5) goto L69
            return r5
        L69:
            tech.chatmind.api.TarotReadingMessagesResponse r9 = (tech.chatmind.api.TarotReadingMessagesResponse) r9
            java.util.List r5 = r9.getMessages()
            r4.add(r5)
            java.lang.String r9 = r9.getContinuationToken()
            if (r9 == 0) goto L92
            boolean r5 = defpackage.v4e.Q(r9)
            if (r5 != 0) goto L7f
            goto L80
        L7f:
            r9 = r3
        L80:
            if (r9 != 0) goto L83
            goto L92
        L83:
            boolean r5 = r1.add(r9)
            if (r5 != 0) goto L47
            m8b r8 = r8.d()
            java.lang.String r9 = "Stop follow-up message refresh at repeated continuation token"
            r8.g(r9)
        L92:
            n0c r8 = new n0c
            r8.<init>(r4)
            java.util.ArrayList r8 = defpackage.t72.y(r8)
            return r8
        L9c:
            java.lang.String r8 = "divinationKey"
            defpackage.pa7.g0(r8)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.askquin.ui.conversation.r0.u0(zn2):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01da  */
    /* JADX WARN: Code duplicated, block: B:112:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:114:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:116:0x0214  */
    /* JADX WARN: Code duplicated, block: B:119:0x021b  */
    public final boolean u1(String str) {
        jd4 jd4VarA0;
        UsageBilling usageBilling;
        List<UsageBillingBalance> balances;
        str.getClass();
        if (!r0() && !d0() && !this.L0) {
            if (a0() instanceof fd4) {
                if (v4e.Q(str)) {
                    jd4 jd4VarA1 = a0();
                    fd4 fd4Var = jd4VarA1 instanceof fd4 ? (fd4) jd4VarA1 : null;
                    if (fd4Var != null) {
                        K1(fd4Var.a);
                        M0(Operation.Pattern.INSTANCE);
                        return true;
                    }
                } else {
                    jd4 jd4VarA2 = a0();
                    if ((jd4VarA2 instanceof fd4 ? (fd4) jd4VarA2 : null) != null) {
                        M0(new Operation.SubmitAdditionalInfo(str));
                        return true;
                    }
                }
            } else if ((!m0() || !(a0() instanceof bd4)) && ((!(a0() instanceof bd4) || Q()) && !h0() && !v4e.Q(str))) {
                jd4 jd4VarA3 = a0();
                hd4 hd4Var = hd4.a;
                int i = 3;
                if (pa7.t(jd4VarA3, hd4Var) && U() != null) {
                    l(this, null, null, 3);
                }
                if (m0() && pa7.t(a0(), hd4Var)) {
                    ynb.V(hwf.a(this), null, null, new mf4(str, null), 3);
                }
                if (!(a0() instanceof bd4)) {
                    this.R0.add(new nt8(str, null));
                    this.e1.setValue("");
                    jd4VarA0 = a0();
                    if (pa7.t(jd4VarA0, hd4Var)) {
                        I1(true);
                        this.M1.setValue(Boolean.FALSE);
                        M0(Operation.Ask.INSTANCE);
                        return true;
                    }
                    if (jd4VarA0 instanceof bd4) {
                        x1f x1fVar = x1f.a;
                        x1f.h("follow_up_message", m1f.a, new dl(this, i));
                        x1f.g(new r05("follow_up"), m1f.b, new dl(this, 4));
                        M0(Operation.Chat.INSTANCE);
                        return true;
                    }
                    if (V() == null) {
                        s8f.h(a0(), "Invalid state: ");
                    }
                } else if (N() == null) {
                    QuotaUsage quotaUsageB = ((eab) this.w).b();
                    pu4 pu4Var = pu4.a;
                    if (quotaUsageB != null && (usageBilling = quotaUsageB.getUsageBilling()) != null) {
                        long[] jArr = zf4.a;
                        if (usageBilling.getEnabled() && usageBilling.getCanFollowUp() && ((balances = usageBilling.getBalances()) == null || !balances.isEmpty())) {
                            for (UsageBillingBalance usageBillingBalance : balances) {
                                if (usageBillingBalance.isAvailable() && zf4.b.contains(usageBillingBalance.getSource())) {
                                    List<LimitedQuota> limitedQuotaList = quotaUsageB.getLimitedQuotaList();
                                    if (limitedQuotaList == null) {
                                        limitedQuotaList = pu4Var;
                                    }
                                    if (limitedQuotaList.isEmpty()) {
                                        break;
                                    }
                                    Iterator<T> it = limitedQuotaList.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        LimitedQuota limitedQuota = (LimitedQuota) it.next();
                                        String category = limitedQuota.getCategory();
                                        Locale locale = Locale.ROOT;
                                        String lowerCase = category.toLowerCase(locale);
                                        lowerCase.getClass();
                                        String lowerCase2 = limitedQuota.getProductName().toLowerCase(locale);
                                        lowerCase2.getClass();
                                        String strJ = ib8.j(lowerCase, " ", lowerCase2);
                                        if (limitedQuota.getTotalCount() - limitedQuota.getUsedCount() > 0) {
                                            if (!lowerCase.equals(LimitedQuota.CATEGORY_TIME_MEMBERSHIP)) {
                                                String[] strArr = {"times-card", "time-membership", "pass", "次卡", "回数券", "횟수권", "pase"};
                                                int i2 = 0;
                                                while (true) {
                                                    if (i2 >= 7) {
                                                        continue;
                                                    } else if (!v4e.F(strJ, strArr[i2], false)) {
                                                        i2++;
                                                    }
                                                }
                                            }
                                            String strA = ((mo3) this.y).a();
                                            if (v4e.Q(strA) || !this.K0.add(strA)) {
                                                break;
                                                break;
                                            }
                                            ynb.V(hwf.a(this), null, null, new rf4(strA, null), 3);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    this.P1 = true;
                    this.N1.setValue(pu4Var);
                    this.R0.add(new nt8(str, null));
                    this.e1.setValue("");
                    jd4VarA0 = a0();
                    if (pa7.t(jd4VarA0, hd4Var)) {
                        I1(true);
                        this.M1.setValue(Boolean.FALSE);
                        M0(Operation.Ask.INSTANCE);
                        return true;
                    }
                    if (jd4VarA0 instanceof bd4) {
                        x1f x1fVar2 = x1f.a;
                        x1f.h("follow_up_message", m1f.a, new dl(this, i));
                        x1f.g(new r05("follow_up"), m1f.b, new dl(this, 4));
                        M0(Operation.Chat.INSTANCE);
                        return true;
                    }
                    if (V() == null) {
                        s8f.h(a0(), "Invalid state: ");
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void v(String str) {
        jd4 jd4VarA0 = a0();
        gd4 gd4Var = jd4VarA0 instanceof gd4 ? (gd4) jd4VarA0 : null;
        if (gd4Var == null) {
            return;
        }
        String str2 = gd4Var.d;
        if (gd4Var.a || !pa7.t(str, str2)) {
            if (str == null && (str = (String) s72.x0(gd4Var.c)) == null) {
                str = str2;
            }
            if (!pa7.t(str, str2)) {
                ConcurrentHashMap concurrentHashMap = xfb.a;
                xfb.i(this.I0, "question_edit");
                K1(gd4.b(gd4Var, str, false, null, 247));
                M0(new Operation.UpdateQuestion(str));
                return;
            }
            ed4 ed4VarB = ok8.B(gd4.b(gd4Var, str, false, null, 240), null, V() != null || o0());
            K1(ed4VarB);
            D0(str);
            if (ed4VarB instanceof fd4) {
                q1();
            } else {
                M0(Operation.Pattern.INSTANCE);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [d99] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [d99] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    public final Object v0(zn2 zn2Var) throws Throwable {
        p pVar;
        ?? r9;
        f99 f99Var;
        ?? r0;
        if (zn2Var instanceof p) {
            pVar = (p) zn2Var;
            int i = pVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pVar.label = i - Integer.MIN_VALUE;
            } else {
                pVar = new p(this, zn2Var);
            }
        } else {
            pVar = new p(this, zn2Var);
        }
        Object obj = pVar.result;
        int i2 = pVar.label;
        vz9 vz9Var = this.d1;
        bw2 bw2Var = bw2.a;
        try {
            try {
                try {
                    if (i2 == 0) {
                        jzb.q(obj);
                        f99Var = this.Z0;
                        pVar.L$0 = f99Var;
                        pVar.label = 1;
                        if (f99Var.b(pVar) != bw2Var) {
                        }
                        r9 = f99Var;
                        return bw2Var;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            qc0.p("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = (r0) pVar.L$1;
                        d99 d99Var = (d99) pVar.L$0;
                        try {
                            jzb.q(obj);
                            r0 = d99Var;
                            this.i((List) obj);
                            vz9Var.setValue(Boolean.FALSE);
                            r0.h(null);
                            return wef.a;
                        } catch (Throwable th) {
                            th = th;
                            vz9Var.setValue(Boolean.FALSE);
                            throw th;
                        }
                    }
                    d99 d99Var2 = (d99) pVar.L$0;
                    jzb.q(obj);
                    r9 = d99Var2;
                    pVar.L$0 = r9;
                    pVar.L$1 = this;
                    pVar.label = 2;
                    Serializable serializableU0 = u0(pVar);
                    if (serializableU0 != bw2Var) {
                        r0 = r9;
                        obj = serializableU0;
                        this.i((List) obj);
                        vz9Var.setValue(Boolean.FALSE);
                        r0.h(null);
                        return wef.a;
                    }
                    r9 = f99Var;
                    return bw2Var;
                } catch (Throwable th2) {
                    th = th2;
                    vz9Var.setValue(Boolean.FALSE);
                    throw th;
                }
                r9 = f99Var;
                vz9Var.setValue(Boolean.TRUE);
            } catch (Throwable th3) {
                th = th3;
                r9.h(null);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            r9 = pVar;
        }
    }

    public final void v1(defpackage.h hVar) {
        this.e2.setValue(hVar);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final yc4 w() {
        fc4 fc4Var = this.H0;
        Integer numValueOf = null;
        if (fc4Var == null) {
            pa7.g0("divinationKey");
            throw null;
        }
        jd4 jd4VarA0 = a0();
        Instant instant = (Instant) this.h1.getValue();
        Operation operationL = L();
        FailReason failReasonM = M();
        Operation operationB0 = b0();
        boolean zBooleanValue = ((Boolean) this.q1.getValue()).booleanValue();
        SceneTarot sceneTarotV = V();
        InterruptedDrawing interruptedDrawing = this.I1;
        String str = this.y1;
        String str2 = this.C1;
        List listA = A();
        if (listA.isEmpty()) {
            listA = null;
        }
        suc sucVarX = X();
        quc qucVar = sucVarX instanceof quc ? (quc) sucVarX : null;
        if (qucVar != null) {
            numValueOf = Integer.valueOf(qucVar.a);
        }
        Integer num = numValueOf;
        Instant instant2 = this.X1;
        boolean z = this.O0;
        cm4 cm4VarH = H();
        PhysicalDeckReading physicalDeckReading = this.D1;
        QuotaBlockReason quotaBlockReason = (QuotaBlockReason) this.l1.getValue();
        lsd lsdVar = this.V0;
        ArrayList arrayList = new ArrayList(lsdVar.size());
        Iterator it = lsdVar.b.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Iterator it2 = it;
            String str3 = (String) entry.getKey();
            j6a j6aVar = (j6a) entry.getValue();
            arrayList.add(new PendingClarifyingCardSubmission(str3, j6aVar.a, j6aVar.b));
            instant = instant;
            it = it2;
            operationL = operationL;
        }
        yc4 yc4VarA = fc4Var.a(jd4VarA0, instant, this.R0, operationL, failReasonM, operationB0, zBooleanValue, sceneTarotV, interruptedDrawing, str, str2, listA, num, instant2, z, cm4VarH, physicalDeckReading, arrayList, quotaBlockReason);
        return yc4.a(yc4VarA, null, false, null, null, 0, fb4.a(yc4VarA.h, null, null, null, null, null, null, null, null, R(), 255), null, null, null, null, null, null, null, 4194175);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w0(String str, zn2 zn2Var) {
        q qVar;
        xo5 xo5Var;
        if (zn2Var instanceof q) {
            qVar = (q) zn2Var;
            int i = qVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                qVar.label = i - Integer.MIN_VALUE;
            } else {
                qVar = new q(this, zn2Var);
            }
        } else {
            qVar = new q(this, zn2Var);
        }
        Object objG = qVar.result;
        int i2 = qVar.label;
        try {
            if (i2 == 0) {
                jzb.q(objG);
                yt6 yt6Var = this.d;
                qVar.L$0 = str;
                qVar.label = 1;
                objG = ((uke) yt6Var).g(str, qVar);
                bw2 bw2Var = bw2.a;
                if (objG == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = (String) qVar.L$0;
                jzb.q(objG);
            }
            yc4 yc4VarM = af8.m((TarotReadingHistory) objG, null, 6);
            ((gq3) this.f).g(yc4VarM);
            return yc4VarM;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            long[] jArr = zf4.a;
            Throwable thB = nzc.b(e2);
            if (!(thB instanceof jzc) ? (thB instanceof qs6) && ((qs6) thB).a() == 404 : ((jzc) thB).getErrorCode() == 90005) {
                d().c("Failed to load child reading " + str + " from cloud", e2);
                xo5Var = xo5.b;
            } else {
                d().e("Child reading " + str + " no longer exists in cloud");
                xo5Var = xo5.a;
            }
            this.L0 = true;
            this.j1.setValue(xo5Var);
            C1(false);
            return null;
        }
    }

    public final void w1(boolean z) {
        this.g1.setValue(Boolean.valueOf(z));
    }

    public final void x(String str) {
        this.R0.removeIf(new rd4(new ia(str, 25), 1));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x0(zn2 zn2Var) {
        r rVar;
        TarotReadingBody reading;
        String content;
        if (zn2Var instanceof r) {
            rVar = (r) zn2Var;
            int i = rVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rVar.label = i - Integer.MIN_VALUE;
            } else {
                rVar = new r(this, zn2Var);
            }
        } else {
            rVar = new r(this, zn2Var);
        }
        Object objZ0 = rVar.result;
        int i2 = rVar.label;
        if (i2 == 0) {
            jzb.q(objZ0);
            rVar.label = 1;
            objZ0 = z0(rVar);
            Object obj = bw2.a;
            if (objZ0 == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objZ0);
        }
        TarotReadingHistory tarotReadingHistory = (TarotReadingHistory) objZ0;
        if (tarotReadingHistory == null || (reading = tarotReadingHistory.getReading()) == null || (content = reading.getContent()) == null || v4e.Q(content)) {
            return null;
        }
        return content;
    }

    public final void x1(ale aleVar) {
        this.a2.setValue(aleVar);
    }

    public final void y(QuotaBlockReason quotaBlockReason) {
        ad4 ad4VarM = ym8.m(a0());
        if (ad4VarM != null) {
            K1(ad4VarM);
        }
        x72.i0(new to3(21), this.R0);
        G1(true);
        F1(quotaBlockReason);
        I1(false);
        w1(false);
        q1();
        ad4 ad4VarM2 = ym8.m(a0());
        if (ad4VarM2 != null) {
            R1(ad4VarM2.a, ad4VarM2.b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y0(zn2 zn2Var) {
        s sVar;
        mmb mmbVar;
        if (zn2Var instanceof s) {
            sVar = (s) zn2Var;
            int i = sVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sVar.label = i - Integer.MIN_VALUE;
            } else {
                sVar = new s(this, zn2Var);
            }
        } else {
            sVar = new s(this, zn2Var);
        }
        Object obj = sVar.result;
        int i2 = sVar.label;
        if (i2 == 0) {
            mmb mmbVarD = ks0.d(obj);
            he4 he4Var = new he4(mmbVarD, this, null);
            sVar.L$0 = mmbVarD;
            sVar.label = 1;
            Object objS = rs0.S(35000L, he4Var, sVar);
            bw2 bw2Var = bw2.a;
            if (objS == bw2Var) {
                return bw2Var;
            }
            mmbVar = mmbVarD;
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mmbVar = (mmb) sVar.L$0;
            jzb.q(obj);
        }
        return mmbVar.element;
    }

    public final void y1(cm4 cm4Var) {
        this.N0.setValue(cm4Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z0(zn2 zn2Var) {
        t tVar;
        if (zn2Var instanceof t) {
            tVar = (t) zn2Var;
            int i = tVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tVar.label = i - Integer.MIN_VALUE;
            } else {
                tVar = new t(this, zn2Var);
            }
        } else {
            tVar = new t(this, zn2Var);
        }
        Object objG = tVar.result;
        int i2 = tVar.label;
        try {
            if (i2 == 0) {
                jzb.q(objG);
                yt6 yt6Var = this.d;
                fc4 fc4Var = this.H0;
                if (fc4Var == null) {
                    pa7.g0("divinationKey");
                    throw null;
                }
                String str = fc4Var.a;
                tVar.label = 1;
                objG = ((uke) yt6Var).g(str, tVar);
                bw2 bw2Var = bw2.a;
                if (objG == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(objG);
            }
            return (TarotReadingHistory) objG;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            d().c("Failed to probe cloud reading history", e2);
            return null;
        }
    }

    public final void z1(DrawCardSaves drawCardSaves) {
        this.K1.setValue(drawCardSaves);
    }
}
