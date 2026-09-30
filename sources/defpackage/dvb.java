package defpackage;

import ai.askquin.qa.bridge.QaResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dvb implements d3b {
    public final k86 a;

    public dvb(k86 k86Var) {
        this.a = k86Var;
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) throws Throwable {
        pqa pqaVar = (pqa) this.a;
        js3 js3Var = ga4.a;
        hr3 hr3Var = hr3.c;
        z5c.I(hr3Var, new oqa(pqaVar, null));
        h86 h86Var = (h86) z5c.I(hr3Var, new lqa(pqaVar, null));
        return new QaResult.Ok(new ti7(bm8.H(new iy9("persistedShown", oh7.a(Boolean.valueOf(h86Var.a))), new iy9("exposureReserved", oh7.a(Boolean.valueOf(h86Var.b))), new iy9("closed", oh7.a(Boolean.valueOf(h86Var.c))))));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "event.reset-gift-card-guide";
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "重置礼品卡会员引导弹窗已展示标记";
    }
}
