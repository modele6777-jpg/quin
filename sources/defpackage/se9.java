package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class se9 {
    public final WeakReference a;
    public final Executor b;
    public final /* synthetic */ te9 c;

    public se9(te9 te9Var, kp3 kp3Var, Executor executor) {
        this.c = te9Var;
        this.a = new WeakReference(kp3Var);
        this.b = executor;
    }
}
