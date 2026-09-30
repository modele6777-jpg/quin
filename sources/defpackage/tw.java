package defpackage;

import android.view.View;
import android.view.WindowInsets;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tw implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uvf b;
    public final /* synthetic */ LayoutNode c;

    public /* synthetic */ tw(uvf uvfVar, LayoutNode layoutNode, int i) {
        this.a = i;
        this.b = uvfVar;
        this.c = layoutNode;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        WindowInsets windowInsetsB;
        int i = this.a;
        wef wefVar = wef.a;
        LayoutNode layoutNode = this.c;
        uvf uvfVar = this.b;
        switch (i) {
            case 0:
                cn1.H(uvfVar, layoutNode);
                ((AndroidComposeView) uvfVar.c).V0 = true;
                int[] iArr = uvfVar.F0;
                int i2 = iArr[0];
                int i3 = iArr[1];
                View view = uvfVar.b;
                view.getLocationOnScreen(iArr);
                long j = uvfVar.G0;
                long jL = ((bv7) obj).l();
                uvfVar.G0 = jL;
                h8g h8gVar = uvfVar.H0;
                if (h8gVar != null && ((i2 != iArr[0] || i3 != iArr[1] || !e77.b(j, jL)) && (windowInsetsB = uvfVar.k(h8gVar).b()) != null)) {
                    view.dispatchApplyWindowInsets(windowInsetsB);
                }
                break;
            case 1:
                View view2 = uvfVar.b;
                Owner owner = (Owner) obj;
                AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
                if (androidComposeView != null) {
                    androidComposeView.getAndroidViewsHandler$ui().getHolderToLayoutNode().put(uvfVar, layoutNode);
                    androidComposeView.getAndroidViewsHandler$ui().addView(uvfVar);
                    androidComposeView.getAndroidViewsHandler$ui().getLayoutNodeToHolder().put(layoutNode, uvfVar);
                    uvfVar.setImportantForAccessibility(1);
                    nvf.j(uvfVar, new bq(androidComposeView, layoutNode, androidComposeView));
                }
                if (view2.getParent() != uvfVar) {
                    uvfVar.addView(view2);
                }
                break;
            default:
                cn1.H(uvfVar, layoutNode);
                break;
        }
        return wefVar;
    }
}
