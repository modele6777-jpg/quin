package defpackage;

import ai.askquin.qa.bridge.ParamSpec;
import ai.askquin.qa.bridge.ParamType;
import ai.askquin.qa.bridge.QaResult;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bp5 implements d3b {
    public final List a = t72.H(new ParamSpec("state", ParamType.STRING, true, (nh7) null, 8, (rp3) null));

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        nh7 nh7Var = (nh7) ti7Var.get("state");
        if (nh7Var != null) {
            yi7 yi7VarI = oh7.i(nh7Var);
            String strC = yi7VarI instanceof qi7 ? null : yi7VarI.c();
            if (strC != null) {
                if (!gp5.k.contains(strC)) {
                    return new QaResult.Err("unknown follow-up fixture: ".concat(strC), "invalid_params");
                }
                j3b j3bVar = (j3b) k3b.a.get();
                boolean zBooleanValue = false;
                if (j3bVar != null) {
                    w wVar = j3bVar.b;
                    if (pa7.t(Looper.myLooper(), Looper.getMainLooper())) {
                        zBooleanValue = ((Boolean) wVar.d(strC)).booleanValue();
                    } else {
                        imb imbVar = new imb();
                        CountDownLatch countDownLatch = new CountDownLatch(1);
                        k3b.b.post(new de1(imbVar, wVar, strC, countDownLatch, 4));
                        if (countDownLatch.await(2L, TimeUnit.SECONDS) && imbVar.element) {
                            zBooleanValue = true;
                        }
                    }
                }
                return zBooleanValue ? new QaResult.Ok(new ti7(ib8.q("state", oh7.c(strC)))) : new QaResult.Err("conversation screen is not active", "not_on_conversation");
            }
        }
        return new QaResult.Err("state is required", "invalid_params");
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "conversation.follow-up-fixture";
    }

    @Override // defpackage.d3b
    public final List getParams() {
        return this.a;
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "追问新占卜与补抽牌确定性场景";
    }
}
