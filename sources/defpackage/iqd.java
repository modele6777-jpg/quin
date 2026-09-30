package defpackage;

import android.os.Build;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class iqd extends gbe implements l26 {
    final /* synthetic */ n6 $accessibilityManager;
    final /* synthetic */ fqd $currentSnackbarData;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqd(fqd fqdVar, n6 n6Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$currentSnackbarData = fqdVar;
        this.$accessibilityManager = n6Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new iqd(this.$currentSnackbarData, this.$accessibilityManager, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0062  */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        long j;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            fqd fqdVar = this.$currentSnackbarData;
            if (fqdVar != null) {
                uqd uqdVar = ((lqd) fqdVar).a;
                gqd gqdVar = uqdVar.b;
                uqdVar.getClass();
                n6 n6Var = this.$accessibilityManager;
                int iOrdinal = gqdVar.ordinal();
                long j2 = Long.MAX_VALUE;
                if (iOrdinal == 0) {
                    j = 4000;
                } else if (iOrdinal == 1) {
                    j = 10000;
                } else {
                    if (iOrdinal != 2) {
                        ap.c();
                        return null;
                    }
                    j = Long.MAX_VALUE;
                }
                if (n6Var == null) {
                    j2 = j;
                } else {
                    AccessibilityManager accessibilityManager = ((to) n6Var).a;
                    if (j < 2147483647L && Build.VERSION.SDK_INT >= 29) {
                        int iW = bp.w(accessibilityManager, (int) j, 3);
                        if (iW != Integer.MAX_VALUE) {
                            j2 = iW;
                        }
                    } else {
                        j2 = j;
                    }
                }
                this.label = 1;
                Object objQ = vfh.q(j2, this);
                bw2 bw2Var = bw2.a;
                if (objQ == bw2Var) {
                    return bw2Var;
                }
            }
            return wef.a;
        }
        if (i != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        ((lqd) this.$currentSnackbarData).a();
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((iqd) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
