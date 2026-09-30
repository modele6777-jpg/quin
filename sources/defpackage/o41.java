package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o41 extends h36 implements n26 {
    public static final o41 a = new o41(3, r41.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        r41 r41Var = (r41) obj;
        AtomicLongFieldUpdater atomicLongFieldUpdater = r41.d;
        r41Var.getClass();
        if (obj3 == t41.l) {
            obj3 = new pw1(r41Var.q());
        }
        return new rw1(obj3);
    }
}
