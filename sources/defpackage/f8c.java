package defpackage;

import ai.askquin.qa.bridge.ParamSpec;
import ai.askquin.qa.bridge.ParamType;
import ai.askquin.qa.bridge.QaResult;
import ai.askquin.ui.popup.dailyfortune.v;
import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f8c implements d3b {
    public final v a;
    public final List b = t72.H(new ParamSpec("scenario", ParamType.STRING, true, (nh7) null, 8, (rp3) null));

    static {
        int i = v.d;
    }

    public f8c(v vVar) {
        this.a = vVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        String strC;
        Object next;
        nh7 nh7Var = (nh7) ti7Var.get("scenario");
        String strC2 = null;
        if (nh7Var != null) {
            yi7 yi7VarI = oh7.i(nh7Var);
            if (yi7VarI instanceof qi7) {
                strC = null;
            } else {
                strC = yi7VarI.c();
            }
        } else {
            strC = null;
        }
        Iterator it = n73.b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!pa7.t(((n73) next).b(), strC));
        n73 n73Var = (n73) next;
        boolean z = true;
        if (n73Var == null) {
            nh7 nh7Var2 = (nh7) ti7Var.get("scenario");
            if (nh7Var2 != null) {
                yi7 yi7VarI2 = oh7.i(nh7Var2);
                if (!(yi7VarI2 instanceof qi7)) {
                    strC2 = yi7VarI2.c();
                }
            }
            if (strC2 == null) {
                strC2 = "";
            }
            return new QaResult.Err(ub3.k("invalid scenario '", strC2, "'; expected ", s72.D0(n73.b, null, null, null, new i73(1), 31)), "invalid_params");
        }
        m65 m65Var = u04.a;
        m65 m65Var2 = u04.a;
        if (m65Var2 == null) {
            return new QaResult.Err("nav unavailable — foreground the app first", "no_nav");
        }
        k73 k73Var = (k73) z5c.I(nu4.a, new e8c(this, null));
        if (k73Var == null) {
            return new QaResult.Err("no signed-in account", "no_account");
        }
        hl hlVar = pa7.h;
        if (hlVar == null) {
            z = false;
        } else {
            new Handler(Looper.getMainLooper()).post(new wp(5, hlVar));
        }
        new Handler(Looper.getMainLooper()).post(new xu8(14, m65Var2, n73Var));
        return new QaResult.Ok(j73.c(k73Var, new iy9("scenario", oh7.c(n73Var.b())), new iy9("presentationDismissRequested", oh7.a(Boolean.valueOf(z))), new iy9("navigationRequested", oh7.a(Boolean.TRUE))));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "event.run-daily-fortune-guide-paywall-flow";
    }

    @Override // defpackage.d3b
    public final List getParams() {
        return this.b;
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "运行付费墙关闭后推荐今日运势真实链路";
    }
}
