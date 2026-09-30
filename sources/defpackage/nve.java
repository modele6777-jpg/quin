package defpackage;

import ai.askquin.qa.bridge.ParamSpec;
import ai.askquin.qa.bridge.ParamType;
import ai.askquin.qa.bridge.QaResult;
import android.app.Activity;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nve implements d3b {
    public final xve a;
    public final List b = t72.H(new ParamSpec("scheme", ParamType.STRING, false, (nh7) null, 8, (rp3) null));

    public nve(xve xveVar) {
        this.a = xveVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0081  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        String strC;
        mfc mfcVar;
        nh7 nh7Var = (nh7) ti7Var.get("scheme");
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
        if (strC == null) {
            return new QaResult.Ok(new ti7(ib8.q("scheme", oh7.c(k8b.c().name()))));
        }
        String lowerCase = v4e.o0(strC).toString().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        switch (lowerCase) {
            case "greyscale":
            case "grayscale":
                mfcVar = mfc.b;
                break;
            case "colorful":
                mfcVar = mfc.a;
                break;
            case "neo":
                mfcVar = mfc.b;
                break;
            case "classic":
                mfcVar = mfc.a;
                break;
            default:
                mfcVar = null;
                break;
        }
        if (mfcVar == null) {
            return new QaResult.Err(ib8.j("invalid scheme '", strC, "'; expected one of: Colorful/classic, Greyscale/neo"), "invalid_params");
        }
        Activity activity = ir5.c;
        if (activity == null) {
            return new QaResult.Err("no resumed activity to re-render", "no_activity");
        }
        xve.a(mfcVar);
        qn2 qn2Var = lw2.a;
        hr3 hr3Var = hr3.c;
        mve mveVar = new mve(this, mfcVar, activity, null);
        int i = 2;
        ynb.V(qn2Var, hr3Var, null, mveVar, 2);
        int iOrdinal = mfcVar.ordinal();
        if (iOrdinal == 0) {
            i = 0;
        } else if (iOrdinal != 1) {
            ap.c();
            return null;
        }
        return new QaResult.Ok(new ti7(bm8.H(new iy9("scheme", oh7.c(mfcVar.name())), new iy9("uiMode", oh7.b(Integer.valueOf(i))))));
    }

    @Override // defpackage.d3b
    public final dm1 d(ti7 ti7Var) {
        return ti7Var.containsKey("scheme") ? dm1.b : dm1.a;
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "theme.set";
    }

    @Override // defpackage.d3b
    public final List getParams() {
        return this.b;
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "切换 App 主题（Classic/彩色 ↔ NEO/单色）并即时重渲染当前界面";
    }
}
