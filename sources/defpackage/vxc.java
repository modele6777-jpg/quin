package defpackage;

import ai.askquin.qa.bridge.ParamSpec;
import ai.askquin.qa.bridge.ParamType;
import ai.askquin.qa.bridge.QaResult;
import android.content.Context;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vxc implements d3b {
    public final Context a;
    public final List b = t72.H(new ParamSpec("cancel", ParamType.BOOLEAN, false, (nh7) null, 8, (rp3) null));

    public vxc(Context context) {
        this.a = context;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        boolean zBooleanValue;
        Object dzbVar;
        nh7 nh7Var = (nh7) ti7Var.get("cancel");
        if (nh7Var != null) {
            try {
                dzbVar = Boolean.valueOf(v4e.n0(oh7.i(nh7Var).c()));
            } catch (Throwable th) {
                dzbVar = new dzb(th);
            }
            if (dzbVar instanceof dzb) {
                dzbVar = null;
            }
            Boolean bool = (Boolean) dzbVar;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
        } else {
            zBooleanValue = false;
        }
        y93 y93Var = y93.a;
        y93.k(this.a, zBooleanValue);
        return new QaResult.Ok(new ti7(ib8.q("cancel", oh7.a(Boolean.valueOf(zBooleanValue)))));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "notification.send-daily";
    }

    @Override // defpackage.d3b
    public final List getParams() {
        return this.b;
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "立刻发每日提醒通知（cancel=true 即 Send+Cancel）";
    }
}
