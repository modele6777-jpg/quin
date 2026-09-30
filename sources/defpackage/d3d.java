package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.qa.bridge.ParamSpec;
import ai.askquin.qa.bridge.ParamType;
import ai.askquin.qa.bridge.QaResult;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d3d implements d3b {
    public final xof a;
    public final kmd b;
    public final List c = t72.H(new ParamSpec("skin", ParamType.STRING, true, (nh7) null, 8, (rp3) null));

    public d3d(xof xofVar, kmd kmdVar) {
        this.a = xofVar;
        this.b = kmdVar;
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        String string;
        Object next;
        TarotSkinIdentify tarotSkinIdentify;
        nh7 nh7Var = (nh7) ti7Var.get("skin");
        if (nh7Var != null) {
            yi7 yi7VarI = oh7.i(nh7Var);
            String strC = yi7VarI instanceof qi7 ? null : yi7VarI.c();
            if (strC != null && (string = v4e.o0(strC).toString()) != null) {
                if (string.equalsIgnoreCase("clear") || string.equalsIgnoreCase("none")) {
                    bm8.P(new b3d(this, null));
                    return new QaResult.Ok(new ti7(ib8.q("skin", oh7.c("cleared"))));
                }
                Iterator<E> it = TarotSkinIdentify.getEntries().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    tarotSkinIdentify = (TarotSkinIdentify) next;
                    if (c5e.v(tarotSkinIdentify.name(), string, true)) {
                        break;
                    }
                } while (!c5e.v(tarotSkinIdentify.getFolder(), string, true));
                TarotSkinIdentify tarotSkinIdentify2 = (TarotSkinIdentify) next;
                if (tarotSkinIdentify2 == null) {
                    return new QaResult.Err(ib8.j("unknown skin '", string, "'"), "invalid_params");
                }
                Boolean bool = (Boolean) z5c.I(nu4.a, new c3d(this, tarotSkinIdentify2, null));
                bool.getClass();
                return new QaResult.Ok(new ti7(bm8.H(new iy9("skin", oh7.c(tarotSkinIdentify2.name())), new iy9("isDownloaded", oh7.a(bool)))));
            }
        }
        return new QaResult.Err("missing 'skin'", "invalid_params");
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "data.set-skin";
    }

    @Override // defpackage.d3b
    public final List getParams() {
        return this.c;
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "设置当前塔罗皮肤（skin=clear 清除已购；用于未下载路径复现）";
    }
}
