package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bq9 {
    public final x16 a;
    public final AtomicBoolean b = new AtomicBoolean(true);

    public bq9(x16 x16Var) {
        this.a = x16Var;
    }

    public final void a() {
        if (this.b.compareAndSet(true, false)) {
            this.a.invoke();
        }
    }
}
