package defpackage;

import ai.askquin.qa.bridge.ParamSpec;
import ai.askquin.qa.bridge.ParamType;
import ai.askquin.qa.bridge.QaResult;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vm6 implements d3b {
    public final List a = t72.H(new ParamSpec("state", ParamType.STRING, true, (nh7) null, 8, (rp3) null));

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        q3b p3bVar;
        nh7 nh7Var = (nh7) ti7Var.get("state");
        if (nh7Var != null) {
            yi7 yi7VarI = oh7.i(nh7Var);
            String strC = yi7VarI instanceof qi7 ? null : yi7VarI.c();
            if (strC != null) {
                switch (strC.hashCode()) {
                    case -1217487446:
                        if (strC.equals("hidden")) {
                            p3bVar = n3b.a;
                            break;
                        }
                        return new QaResult.Err("unknown daily fortune tooltip state: ".concat(strC), "invalid_params");
                    case -1037172987:
                        if (strC.equals("tomorrow")) {
                            p3bVar = new p3b(h73.b);
                            break;
                        }
                        return new QaResult.Err("unknown daily fortune tooltip state: ".concat(strC), "invalid_params");
                    case 110534465:
                        if (strC.equals("today")) {
                            p3bVar = new p3b(h73.a);
                            break;
                        }
                        return new QaResult.Err("unknown daily fortune tooltip state: ".concat(strC), "invalid_params");
                    case 1728911401:
                        if (strC.equals("natural")) {
                            p3bVar = o3b.a;
                            break;
                        }
                        return new QaResult.Err("unknown daily fortune tooltip state: ".concat(strC), "invalid_params");
                    default:
                        return new QaResult.Err("unknown daily fortune tooltip state: ".concat(strC), "invalid_params");
                }
                return m3b.a(p3bVar) ? new QaResult.Ok(new ti7(ib8.q("state", oh7.c(strC)))) : new QaResult.Err("home screen is not active", "not_on_home");
            }
        }
        return new QaResult.Err("state is required", "invalid_params");
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "home.preview-daily-fortune-tooltip";
    }

    @Override // defpackage.d3b
    public final List getParams() {
        return this.a;
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "首页今明日运势 Tooltip";
    }
}
