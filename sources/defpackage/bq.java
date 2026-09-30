package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bq extends i6 {
    public final /* synthetic */ AndroidComposeView d;
    public final /* synthetic */ LayoutNode e;
    public final /* synthetic */ AndroidComposeView f;

    public bq(AndroidComposeView androidComposeView, LayoutNode layoutNode, AndroidComposeView androidComposeView2) {
        this.d = androidComposeView;
        this.e = layoutNode;
        this.f = androidComposeView2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    @Override // defpackage.i6
    public final void d(View view, t6 t6Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = t6Var.a;
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        AndroidComposeView androidComposeView = this.d;
        lq lqVar = androidComposeView.O0;
        if (lqVar.v()) {
            accessibilityNodeInfo.setVisibleToUser(false);
        }
        LayoutNode layoutNode = this.e;
        LayoutNode layoutNodeF = layoutNode.F();
        while (true) {
            if (layoutNodeF == null) {
                layoutNodeF = null;
                break;
            } else if (layoutNodeF.V0.i(8)) {
                break;
            } else {
                layoutNodeF = layoutNodeF.F();
            }
        }
        Integer numValueOf = layoutNodeF != null ? Integer.valueOf(layoutNodeF.b) : null;
        if (numValueOf != null) {
            if (numValueOf.intValue() == androidComposeView.getSemanticsOwner().a().f) {
                numValueOf = -1;
            }
        } else {
            numValueOf = -1;
        }
        int iIntValue = numValueOf.intValue();
        t6Var.b = iIntValue;
        AndroidComposeView androidComposeView2 = this.f;
        accessibilityNodeInfo.setParent(androidComposeView2, iIntValue);
        int i = layoutNode.b;
        int iD = lqVar.Q0.d(i);
        if (iD != -1) {
            ax axVarK = ndc.k(androidComposeView.getAndroidViewsHandler$ui(), iD);
            if (axVarK != null) {
                accessibilityNodeInfo.setTraversalBefore(axVarK);
            } else {
                accessibilityNodeInfo.setTraversalBefore(androidComposeView2, iD);
            }
            androidComposeView.b(i, accessibilityNodeInfo, lqVar.S0);
        }
        int iD2 = lqVar.R0.d(i);
        if (iD2 != -1) {
            ax axVarK2 = ndc.k(androidComposeView.getAndroidViewsHandler$ui(), iD2);
            if (axVarK2 != null) {
                accessibilityNodeInfo.setTraversalAfter(axVarK2);
            } else {
                accessibilityNodeInfo.setTraversalAfter(androidComposeView2, iD2);
            }
            androidComposeView.b(i, accessibilityNodeInfo, lqVar.T0);
        }
    }
}
