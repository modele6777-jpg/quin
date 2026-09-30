package defpackage;

import ai.askquin.qa.bridge.QaResult;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fta implements d3b {
    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        m65 m65Var = u04.a;
        m65 m65Var2 = u04.a;
        if (m65Var2 == null) {
            return new QaResult.Err("nav unavailable — foreground the app first", "no_nav");
        }
        new Handler(Looper.getMainLooper()).post(new m45(16, m65Var2));
        iy9 iy9Var = new iy9("destination", oh7.c("tomorrow-fortune-reminder-guide-preview"));
        iy9 iy9Var2 = new iy9("navigationRequested", oh7.a(Boolean.TRUE));
        Boolean bool = Boolean.FALSE;
        return new QaResult.Ok(new ti7(bm8.H(iy9Var, iy9Var2, new iy9("productionStateChanged", oh7.a(bool)), new iy9("systemNotificationsChanged", oh7.a(bool)))));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "event.prepare-tomorrow-fortune-reminder-guide";
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "明日运势通知弹窗·直接预览（不修改通知设置）";
    }
}
