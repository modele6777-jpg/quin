package defpackage;

import android.view.MotionEvent;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uw implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uvf b;

    public /* synthetic */ uw(uvf uvfVar, int i) {
        this.a = i;
        this.b = uvfVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        boolean zDispatchTouchEvent;
        int i = this.a;
        wef wefVar = wef.a;
        uvf uvfVar = this.b;
        switch (i) {
            case 0:
                uvfVar.I0 = (a26) obj;
                return wefVar;
            case 1:
                Owner owner = (Owner) obj;
                AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
                if (androidComposeView != null) {
                    androidComposeView.getAndroidViewsHandler$ui().removeViewInLayout(uvfVar);
                    z7f.q(androidComposeView.getAndroidViewsHandler$ui().getLayoutNodeToHolder()).remove(androidComposeView.getAndroidViewsHandler$ui().getHolderToLayoutNode().remove(uvfVar));
                    uvfVar.setImportantForAccessibility(0);
                }
                uvfVar.removeAllViewsInLayout();
                return wefVar;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                switch (motionEvent.getActionMasked()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        zDispatchTouchEvent = uvfVar.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = uvfVar.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(zDispatchTouchEvent);
        }
    }
}
