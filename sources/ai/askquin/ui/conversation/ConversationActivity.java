package ai.askquin.ui.conversation;

import ai.askquin.ui.draw.model.DrawCardSaves;
import ai.askquin.ui.router.AppRoute;
import android.content.Intent;
import android.os.Bundle;
import com.adjust.sdk.Constants;
import defpackage.a82;
import defpackage.acb;
import defpackage.bsc;
import defpackage.ca2;
import defpackage.cr0;
import defpackage.dc9;
import defpackage.dce;
import defpackage.dd2;
import defpackage.dsc;
import defpackage.dzb;
import defpackage.eb3;
import defpackage.ef8;
import defpackage.fcb;
import defpackage.fzc;
import defpackage.g3b;
import defpackage.gmc;
import defpackage.h1;
import defpackage.h6a;
import defpackage.hf8;
import defpackage.hs3;
import defpackage.i6a;
import defpackage.jo2;
import defpackage.job;
import defpackage.k7a;
import defpackage.ko2;
import defpackage.lo2;
import defpackage.lw7;
import defpackage.mic;
import defpackage.mma;
import defpackage.mo3;
import defpackage.nu4;
import defpackage.o48;
import defpackage.op9;
import defpackage.ps4;
import defpackage.qp9;
import defpackage.s7;
import defpackage.v4e;
import defpackage.vpf;
import defpackage.w28;
import defpackage.wb2;
import defpackage.xh7;
import defpackage.xqa;
import defpackage.yic;
import defpackage.ynb;
import defpackage.z18;
import defpackage.z5c;
import defpackage.znd;
import java.time.ZoneId;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ConversationActivity extends h1 {
    public static final /* synthetic */ int X0 = 0;
    public final lw7 Q0;
    public final lw7 R0;
    public final a82 S0;
    public final lw7 T0;
    public final lw7 U0;
    public final lw7 V0;
    public final lw7 W0;

    public ConversationActivity() {
        lo2 lo2Var = new lo2(this, 4);
        z18 z18Var = z18.c;
        this.Q0 = eb3.N(z18Var, lo2Var);
        lo2 lo2Var2 = new lo2(this, 0);
        z18 z18Var2 = z18.a;
        this.R0 = eb3.N(z18Var2, lo2Var2);
        this.S0 = new a82(job.a.b(dc9.class), new lo2(this, 7), new lo2(this, 6), new lo2(this, 8));
        this.T0 = eb3.N(z18Var2, new lo2(this, 1));
        this.U0 = eb3.N(z18Var, new lo2(this, 5));
        this.V0 = eb3.N(z18Var2, new lo2(this, 2));
        this.W0 = eb3.N(z18Var2, new lo2(this, 3));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x009a  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f8  */
    @Override // defpackage.h1, defpackage.nx5, defpackage.vb2, defpackage.ub2, android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        boolean z;
        super.onCreate(bundle);
        int i = 0;
        ps4.a(this, new dce(0, 0, new znd(23)), 1);
        fcb fcbVar = (fcb) this.R0.getValue();
        fcbVar.getClass();
        ca2.a.getClass();
        if (!ca2.c) {
            ynb.V(fcbVar.b, null, null, new acb(fcbVar, null), 3);
        }
        w28.a(this);
        if (!getIntent().getBooleanExtra("directToFirstReading", false)) {
            bsc bscVar = dsc.a;
            Intent intent = getIntent();
            intent.getClass();
            Intent intent2 = dsc.c;
            if (intent2 != null) {
                Bundle extras = intent2.getExtras();
                if (extras != null) {
                    intent.putExtras(extras);
                }
                if (intent.getData() == null) {
                    intent.setData(intent2.getData());
                }
            }
            dsc.c = null;
        }
        if (bundle != null || getIntent().getBooleanExtra("directToFirstReading", false) || getIntent().getBooleanExtra("isNewUser", false)) {
            dsc.a.b = true;
        } else {
            hs3 hs3Var = xqa.b;
            if (!v4e.Q((CharSequence) z5c.I(nu4.a, new ko2(hs3Var.a, hs3Var.b, null)))) {
                dsc.a.b = true;
            }
        }
        w(getIntent(), true);
        if (bundle == null) {
            mic micVar = mic.AutumnEquinox2026;
            yic yicVar = new yic(micVar.b(), micVar.c());
            ((s7) this.V0.getValue()).getClass();
            String strA = s7.a();
            bsc bscVar2 = dsc.a;
            boolean zQ = v4e.Q(strA);
            boolean z2 = ((Boolean) dsc.b.getValue()).booleanValue() || dsc.a(getIntent());
            if (bscVar2.a || zQ) {
                z = false;
            } else {
                bscVar2.a = true;
                if (bscVar2.b || z2) {
                    z = false;
                } else {
                    z = true;
                }
            }
            dc9 dc9VarX = x();
            gmc gmcVar = (gmc) this.W0.getValue();
            String strA2 = yicVar.a();
            strA2.getClass();
            gmcVar.getClass();
            boolean z3 = !v4e.Q(strA) && gmcVar.a.getBoolean(gmc.a(strA, strA2), false);
            Long l = g3b.a;
            ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
            zoneIdSystemDefault.getClass();
            dc9VarX.y.setValue(Boolean.valueOf(z && !v4e.Q(strA) && !z3 && cr0.b(g3b.a(zoneIdSystemDefault))));
            if (((Boolean) x().y.getValue()).booleanValue()) {
                mma mmaVar = (mma) this.U0.getValue();
                mmaVar.R0 = true;
                mmaVar.R();
            }
        }
        i6a i6aVar = (i6a) this.T0.getValue();
        o48 o48VarH = vpf.H(this);
        i6aVar.getClass();
        if (((mo3) i6aVar.a).b() && !i6aVar.c) {
            List listC = k7a.c();
            if (!listC.isEmpty()) {
                i6aVar.c = true;
                ynb.V(o48VarH, null, null, new h6a(i6aVar, listC, null), 3);
            }
        }
        wb2.a(this, new dd2(new jo2(this, i), true, 1155072279));
    }

    @Override // defpackage.vb2, android.app.Activity
    public final void onNewIntent(Intent intent) throws Throwable {
        intent.getClass();
        super.onNewIntent(intent);
        setIntent(intent);
        if (dsc.a(intent)) {
            dsc.b.setValue(Boolean.TRUE);
        }
        w(intent, false);
    }

    public final void w(Intent intent, boolean z) throws Throwable {
        Object dzbVar;
        if (intent != null && intent.getBooleanExtra("directToFirstReading", false)) {
            intent.removeExtra("directToFirstReading");
            hf8.Q.getClass();
            ef8.a("Quin.FirstReading").e("direct first reading handover");
            dc9 dc9VarX = x();
            hs3 hs3Var = xqa.d;
            DrawCardSaves drawCardSaves = null;
            qp9 qp9Var = new qp9(hs3Var.a, hs3Var.b, null);
            nu4 nu4Var = nu4.a;
            dc9VarX.c.setValue((String) z5c.I(nu4Var, qp9Var));
            dc9VarX.d = Constants.NORMAL;
            dc9 dc9VarX2 = x();
            hs3 hs3Var2 = xqa.e;
            Object objI = z5c.I(nu4Var, new op9(hs3Var2.a, hs3Var2.b, null));
            if (v4e.Q((String) objI)) {
                objI = null;
            }
            String str = (String) objI;
            if (str != null) {
                try {
                    xh7 xh7Var = fzc.a;
                    xh7Var.getClass();
                    dzbVar = (DrawCardSaves) xh7Var.b(DrawCardSaves.Companion.serializer(), str);
                } catch (Throwable th) {
                    dzbVar = new dzb(th);
                }
                drawCardSaves = (DrawCardSaves) (dzbVar instanceof dzb ? null : dzbVar);
            }
            dc9VarX2.w = drawCardSaves;
            AppRoute.Conversation conversation = AppRoute.Conversation.INSTANCE;
            x().v.setValue(Boolean.TRUE);
            if (z) {
                x().x = conversation;
            } else {
                x().g(conversation);
            }
        }
    }

    public final dc9 x() {
        return (dc9) this.S0.getValue();
    }
}
