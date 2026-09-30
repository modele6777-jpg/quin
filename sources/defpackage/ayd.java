package defpackage;

import ai.askquin.qa.bridge.ParamSpec;
import ai.askquin.qa.bridge.ParamType;
import ai.askquin.qa.bridge.QaResult;
import ai.askquin.ui.popup.dailyfortune.DailyFortuneGuideTrigger;
import ai.askquin.ui.popup.dailyfortune.v;
import android.os.Handler;
import android.os.Looper;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ayd implements d3b {
    public final v a;
    public final List b = t72.H(new ParamSpec("trigger", ParamType.STRING, true, (nh7) null, 8, (rp3) null));

    static {
        int i = v.d;
    }

    public ayd(v vVar) {
        this.a = vVar;
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        boolean z;
        DailyFortuneGuideTrigger dailyFortuneGuideTriggerB = j73.b(ti7Var);
        if (dailyFortuneGuideTriggerB == null) {
            return j73.a(ti7Var);
        }
        k73 k73Var = (k73) z5c.I(nu4.a, new zxd(this, dailyFortuneGuideTriggerB, null));
        if (k73Var == null) {
            return new QaResult.Err("no signed-in account", "no_account");
        }
        hl hlVar = pa7.h;
        if (hlVar == null) {
            z = false;
        } else {
            new Handler(Looper.getMainLooper()).post(new wp(5, hlVar));
            z = true;
        }
        return new QaResult.Ok(j73.c(k73Var, new iy9("presentationDismissRequested", oh7.a(Boolean.valueOf(z)))));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "event.stage-daily-fortune-guide";
    }

    @Override // defpackage.d3b
    public final List getParams() {
        return this.b;
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "仅写入今日运势推荐 pending 状态";
    }
}
