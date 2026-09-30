package ai.askquin.widget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.os.Bundle;
import defpackage.a6c;
import defpackage.n6g;
import defpackage.pu4;
import defpackage.qd0;
import defpackage.t72;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class DailyFortuneWidgetWideReceiver extends AppWidgetProvider {
    @Override // android.appwidget.AppWidgetProvider
    public final void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        context.getClass();
        appWidgetManager.getClass();
        bundle.getClass();
        a6c.h(context, new n6g(t72.H(Integer.valueOf(i)), false, false));
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onEnabled(Context context) {
        context.getClass();
        super.onEnabled(context);
        a6c.h(context, new n6g(pu4.a, true, true));
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        context.getClass();
        appWidgetManager.getClass();
        iArr.getClass();
        a6c.h(context, new n6g(qd0.E0(iArr), !(iArr.length == 0), true));
    }
}
