package io.sentry.android.replay.capture;

import defpackage.a26;
import io.sentry.android.replay.b0;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Date c;
    public final /* synthetic */ io.sentry.protocol.w d;
    public final /* synthetic */ b0 e;
    public final /* synthetic */ a26 f;
    public final /* synthetic */ i g;

    public /* synthetic */ j(i iVar, long j, Date date, io.sentry.protocol.w wVar, b0 b0Var, a26 a26Var, int i) {
        this.a = i;
        this.g = iVar;
        this.b = j;
        this.c = date;
        this.d = wVar;
        this.e = b0Var;
        this.f = a26Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        a26 a26Var = this.f;
        b0 b0Var = this.e;
        i iVar = this.g;
        switch (i) {
            case 0:
                o oVar = (o) iVar;
                a26Var.d(i.c(oVar, this.b, this.c, this.d, oVar.e(), b0Var.b, b0Var.a, b0Var.e, b0Var.f));
                break;
            default:
                z zVar = (z) iVar;
                a26Var.d(i.c(zVar, this.b, this.c, this.d, zVar.e(), b0Var.b, b0Var.a, b0Var.e, b0Var.f));
                break;
        }
    }
}
