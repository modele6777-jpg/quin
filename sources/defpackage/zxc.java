package defpackage;

import ai.askquin.qa.bridge.ParamSpec;
import ai.askquin.qa.bridge.ParamType;
import ai.askquin.qa.bridge.QaResult;
import android.content.Context;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zxc implements d3b {
    public final Context a;
    public final List b = t72.I(new ParamSpec("year", ParamType.INT, false, (nh7) null, 8, (rp3) null), new ParamSpec("solarTerm", ParamType.STRING, false, (nh7) null, 8, (rp3) null));

    public zxc(Context context) {
        this.a = context;
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        yic yicVarM;
        boolean zContainsKey = ti7Var.containsKey("year");
        boolean zContainsKey2 = ti7Var.containsKey("solarTerm");
        if (!zContainsKey && !zContainsKey2) {
            mic.a.getClass();
            yicVarM = rmc.c(mic.b);
        } else if (zContainsKey && zContainsKey2) {
            yic yicVar = yic.c;
            nh7 nh7Var = (nh7) ti7Var.get("year");
            Integer numG = nh7Var != null ? oh7.g(oh7.i(nh7Var)) : null;
            nh7 nh7Var2 = (nh7) ti7Var.get("solarTerm");
            yicVarM = drb.m(nh7Var2 != null ? oh7.i(nh7Var2).c() : null, numG);
        } else {
            yicVarM = null;
        }
        if (yicVarM == null) {
            return new QaResult.Err("invalid seasonal campaign", "invalid_params");
        }
        if (!((Boolean) z5c.I(nu4.a, new yxc(this, yicVarM, null))).booleanValue()) {
            return new QaResult.Err("seasonal notification was not displayed", "not_displayed");
        }
        String strA = yicVarM.a();
        if (strA == null) {
            strA = "";
        }
        return new QaResult.Ok(new ti7(ib8.q("seasonalPeriod", oh7.c(strA))));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "notification.send-four-seasons";
    }

    @Override // defpackage.d3b
    public final List getParams() {
        return this.b;
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "立刻发四季牌阵节气提醒通知（绕过闹钟，验内容/点击）";
    }
}
