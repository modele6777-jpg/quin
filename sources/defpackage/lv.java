package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lv implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rv b;

    public /* synthetic */ lv(rv rvVar, int i) {
        this.a = i;
        this.b = rvVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        rv rvVar = this.b;
        switch (i) {
            case 0:
                x16 x16Var = (x16) obj;
                View view = rvVar.a;
                Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    x16Var.invoke();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new wp(2, x16Var));
                    }
                }
                return wefVar;
            case 1:
                ActionMode actionMode = rvVar.h;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return wefVar;
            case 2:
                ActionMode actionMode2 = rvVar.h;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return wefVar;
            default:
                rvVar.e.e();
                return new lf(3, rvVar);
        }
    }
}
