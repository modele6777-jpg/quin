package defpackage;

import android.util.Log;
import io.sentry.android.core.b1;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class bt extends rs0 {
    public final /* synthetic */ int p;

    public /* synthetic */ bt(int i) {
        this.p = i;
    }

    @Override // defpackage.rs0
    public final void u(a48 a48Var, String str) {
        switch (this.p) {
            case 0:
                int iOrdinal = a48Var.ordinal();
                if (iOrdinal == 0) {
                    Log.d("[Koin]", str);
                } else if (iOrdinal == 1) {
                    Log.i("[Koin]", str);
                } else if (iOrdinal == 2) {
                    b1.l("[Koin]", str);
                } else if (iOrdinal == 3) {
                    b1.d("[Koin]", str);
                } else {
                    b1.d("[Koin]", str);
                }
                break;
        }
    }

    private final void T(a48 a48Var, String str) {
    }
}
