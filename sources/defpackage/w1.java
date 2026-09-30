package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class w1 {
    public static final w1 d = new w1();
    public final Runnable a;
    public final Executor b;
    public w1 c;

    public w1() {
        this.a = null;
        this.b = null;
    }

    public w1(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
