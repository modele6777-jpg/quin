package defpackage;

import ai.askquin.qa.bridge.QaResult;
import ai.askquin.ui.popup.dailyfortune.v;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class iub implements d3b {
    public final v a;

    static {
        int i = v.d;
    }

    public iub(v vVar) {
        this.a = vVar;
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        boolean z;
        k73 k73Var = (k73) z5c.I(nu4.a, new hub(this, null));
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
        return "event.reset-daily-fortune-guide";
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "重置当前账号今日运势推荐弹窗";
    }
}
