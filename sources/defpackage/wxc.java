package defpackage;

import ai.askquin.qa.bridge.ParamSpec;
import ai.askquin.qa.bridge.ParamType;
import ai.askquin.qa.bridge.QaResult;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wxc implements d3b {
    public final Context a;
    public final List b = t72.H(new ParamSpec("index", ParamType.INT, false, oh7.b(0)));

    public wxc(Context context) {
        this.a = context;
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        Integer numG;
        ArrayList arrayListA = ua3.a();
        if (arrayListA.isEmpty()) {
            return new QaResult.Err("no push templates", "empty");
        }
        nh7 nh7Var = (nh7) ti7Var.get("index");
        x04 x04Var = (x04) arrayListA.get((arrayListA.size() + (((nh7Var == null || (numG = oh7.g(oh7.i(nh7Var))) == null) ? 0 : numG.intValue()) % arrayListA.size())) % arrayListA.size());
        ym8.N(this.a, x04Var);
        return new QaResult.Ok(new ti7(bm8.H(new iy9("index", oh7.b(Integer.valueOf(x04Var.a))), new iy9("pushId", oh7.c(x04Var.b)))));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "notification.send-daily-push-template";
    }

    @Override // defpackage.d3b
    public final List getParams() {
        return this.b;
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "发指定一条今日运势 push 文案（index 取模 13 条）";
    }
}
