package io.sentry.android.fragment;

import defpackage.mmb;
import defpackage.v4e;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.e1;
import io.sentry.g4;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements g4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mmb b;

    public /* synthetic */ c(mmb mmbVar, int i) {
        this.a = i;
        this.b = mmbVar;
    }

    @Override // io.sentry.g4
    public final void g(e1 e1Var) {
        int i = this.a;
        mmb mmbVar = this.b;
        switch (i) {
            case 0:
                e1Var.getClass();
                mmbVar.element = e1Var.p();
                break;
            case 1:
                int i2 = ReplayIntegration.H0;
                e1Var.getClass();
                String strH = e1Var.H();
                mmbVar.element = strH != null ? v4e.g0('.', strH, strH) : null;
                break;
            default:
                e1Var.getClass();
                mmbVar.element = new ArrayList(e1Var.v());
                break;
        }
    }
}
