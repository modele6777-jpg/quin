package defpackage;

import ai.askquin.qa.bridge.QaResult;
import android.app.Activity;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y03 implements d3b {
    @Override // defpackage.d3b
    public final dm1 a() {
        return dm1.a;
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        Object objC;
        Object objC2;
        Activity activity = ir5.c;
        String name = activity != null ? activity.getClass().getName() : null;
        String str = ir5.d;
        if (name == null || (objC = oh7.c(name)) == null) {
            objC = qi7.INSTANCE;
        }
        iy9 iy9Var = new iy9("activity", objC);
        if (str == null || (objC2 = oh7.c(str)) == null) {
            objC2 = qi7.INSTANCE;
        }
        return new QaResult.Ok(new ti7(bm8.H(iy9Var, new iy9("route", objC2))));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "ui.current-page";
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "上报当前前台 Activity 与 Compose 路由";
    }
}
