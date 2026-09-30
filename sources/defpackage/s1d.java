package defpackage;

import ai.askquin.qa.bridge.ParamSpec;
import ai.askquin.qa.bridge.ParamType;
import ai.askquin.qa.bridge.QaResult;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class s1d implements d3b {
    public final List a = t72.H(new ParamSpec("domain", ParamType.STRING, false, (nh7) null, 8, (rp3) null));

    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        String strC;
        nh7 nh7Var = (nh7) ti7Var.get("domain");
        if (nh7Var != null) {
            yi7 yi7VarI = oh7.i(nh7Var);
            strC = yi7VarI instanceof qi7 ? null : yi7VarI.c();
            if (strC == null || v4e.Q(strC)) {
                strC = null;
            }
        } else {
            strC = null;
        }
        if (strC != null) {
            v4e.Q(strC);
        }
        ynb.V(lw2.a, null, null, new rra(xqa.U.a, strC == null ? "" : strC, null), 3);
        if (strC == null) {
            strC = "";
        }
        return new QaResult.Ok(new ti7(ib8.q("domain", oh7.c(strC))));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "flag.set-custom-domain";
    }

    @Override // defpackage.d3b
    public final List getParams() {
        return this.a;
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "设置自定义后端域名（空=清除；重启 app 生效）";
    }
}
