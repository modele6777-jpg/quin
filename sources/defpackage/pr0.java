package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class pr0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(pr0.class, "notCompletedCount$volatile");
    public final nu3[] a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public pr0(nu3[] nu3VarArr) {
        this.a = nu3VarArr;
        this.notCompletedCount$volatile = nu3VarArr.length;
    }
}
