package defpackage;

import ai.askquin.qa.bridge.QaResult;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class z6b implements d3b {
    public final Context a;

    public z6b(Context context) {
        this.a = context;
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        Context context = this.a;
        int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, "ai.askquin.widget.QuickDecisionWidgetReceiver"));
        appWidgetIds.getClass();
        if (appWidgetIds.length == 0) {
            return new QaResult.Err("no Quick Decision widget on the home screen", "no_widget");
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("quick_decision_widget", 0);
        long jCurrentTimeMillis = System.currentTimeMillis() - 90000000;
        ArrayList arrayList = new ArrayList();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        for (int i : appWidgetIds) {
            String string = sharedPreferences.getString(d7b.a(i, "qd_state"), "initial");
            if (string == null) {
                string = "initial";
            }
            if (!string.equals("initial")) {
                editorEdit.putLong(d7b.a(i, "qd_state_entered_at"), jCurrentTimeMillis);
                arrayList.add(Integer.valueOf(i));
            }
        }
        editorEdit.apply();
        context.sendBroadcast(new Intent("ai.askquin.widget.QD_AUTO_REFRESH").setClassName(context.getPackageName(), "ai.askquin.widget.QuickDecisionWidgetReceiver"));
        ArrayList arrayList2 = new ArrayList(t72.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(oh7.b(Integer.valueOf(((Number) it.next()).intValue())));
        }
        return new QaResult.Ok(new ti7(bm8.G(new iy9("expired", new yg7(arrayList2)))));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "widget.qd-expire";
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "快进快速决策小组件 24h 无操作计时（验证自动回初始态）";
    }
}
