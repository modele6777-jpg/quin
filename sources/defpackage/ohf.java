package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ohf implements Runnable {
    public final /* synthetic */ lp0 a;
    public final /* synthetic */ qq0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ ohf(lp0 lp0Var, qq0 qq0Var, int i, Runnable runnable) {
        this.a = lp0Var;
        this.b = qq0Var;
        this.c = i;
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qq0 qq0Var = this.b;
        int i = this.c;
        Runnable runnable = this.d;
        lp0 lp0Var = this.a;
        w8c w8cVar = (w8c) lp0Var.g;
        try {
            w8c w8cVar2 = (w8c) lp0Var.d;
            Objects.requireNonNull(w8cVar2);
            w8cVar.E(new phf(w8cVar2, 1));
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) lp0Var.b).getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                w8cVar.E(new q45(lp0Var, qq0Var, i));
            } else {
                lp0Var.d(qq0Var, i);
            }
        } catch (ybe unused) {
            ((gg7) lp0Var.e).w(qq0Var, i + 1, false);
        } finally {
            runnable.run();
        }
    }
}
