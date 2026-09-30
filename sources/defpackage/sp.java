package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sp implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AndroidComposeView b;

    public /* synthetic */ sp(AndroidComposeView androidComposeView, int i) {
        this.a = i;
        this.b = androidComposeView;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        AndroidComposeView androidComposeView = this.b;
        switch (i) {
            case 0:
                Class cls = AndroidComposeView.X1;
                return new iu(androidComposeView, androidComposeView.getTextInputService(), (aw2) obj);
            case 1:
                x16 x16Var = (x16) obj;
                Class cls2 = AndroidComposeView.X1;
                Handler handler = androidComposeView.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    x16Var.invoke();
                } else {
                    Handler handler2 = androidComposeView.getHandler();
                    if (handler2 != null) {
                        handler2.post(new wp(0, x16Var));
                    }
                }
                return wefVar;
            case 2:
                Class cls3 = AndroidComposeView.X1;
                ((bo5) androidComposeView.getFocusOwner()).h(((mn5) obj).a, false);
                return wefVar;
            case 3:
                return androidComposeView.getSavedStateRegistry();
            default:
                return Boolean.valueOf(androidComposeView.getScrollCaptureInProgress());
        }
    }
}
