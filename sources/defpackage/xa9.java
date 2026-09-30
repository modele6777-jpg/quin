package defpackage;

import ai.askquin.qa.bridge.ParamSpec;
import ai.askquin.qa.bridge.ParamType;
import ai.askquin.qa.bridge.QaResult;
import android.content.Context;
import android.content.Intent;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xa9 implements d3b {
    public final Context a;
    public final List b = t72.H(new ParamSpec("route", ParamType.STRING, true, (nh7) null, 8, (rp3) null));

    public xa9(Context context) {
        this.a = context;
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        String strC;
        Context context = this.a;
        nh7 nh7Var = (nh7) ti7Var.get("route");
        if (nh7Var == null || (strC = oh7.i(nh7Var).c()) == null) {
            return new QaResult.Err("missing 'route'", "invalid_params");
        }
        try {
            Intent intentAddFlags = new Intent().setClassName(context.getPackageName(), "ai.askquin.MainActivity").putExtra("qa_nav_route", strC).addFlags(268468224);
            intentAddFlags.getClass();
            context.startActivity(intentAddFlags);
            return new QaResult.Ok(new ti7(bm8.G(new iy9("route", oh7.c(strC)))));
        } catch (Exception e) {
            return new QaResult.Err(ub3.i("nav.goto failed to start activity: ", e.getMessage()), "nav_error");
        }
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "nav.goto";
    }

    @Override // defpackage.d3b
    public final List getParams() {
        return this.b;
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "深跳到指定路由（冷启动带 qa_nav_route extra）";
    }
}
