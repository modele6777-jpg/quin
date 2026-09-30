package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fq implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lq b;

    public /* synthetic */ fq(lq lqVar, int i) {
        this.a = i;
        this.b = lqVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        lq lqVar = this.b;
        switch (i) {
            case 0:
                View view = lqVar.d;
                return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (AccessibilityEvent) obj));
            default:
                ehc ehcVar = (ehc) obj;
                if (ehcVar.b.contains(ehcVar)) {
                    gw9 snapshotObserver = lqVar.d.getSnapshotObserver();
                    snapshotObserver.a.d(ehcVar, lqVar.b1, new v6(5, ehcVar, lqVar));
                }
                return wef.a;
        }
    }
}
