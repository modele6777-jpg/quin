package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uv0 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ owc b;

    public /* synthetic */ uv0(owc owcVar, int i) {
        this.a = i;
        this.b = owcVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        owc owcVar = this.b;
        switch (i) {
            case 0:
                AtomicLong atomicLong = owcVar.d;
                long andIncrement = atomicLong.getAndIncrement();
                while (andIncrement == 0) {
                    andIncrement = atomicLong.getAndIncrement();
                }
                return Long.valueOf(andIncrement);
            default:
                AtomicLong atomicLong2 = owcVar.d;
                long andIncrement2 = atomicLong2.getAndIncrement();
                while (andIncrement2 == 0) {
                    andIncrement2 = atomicLong2.getAndIncrement();
                }
                return Long.valueOf(andIncrement2);
        }
    }
}
