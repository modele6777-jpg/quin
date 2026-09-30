package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ixg implements Callable {
    public static final /* synthetic */ ixg b = new ixg(0);
    public static final /* synthetic */ ixg c = new ixg(1);
    public final /* synthetic */ int a;

    public /* synthetic */ ixg(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                bah bahVar = new bah("internal.platform", 4);
                bahVar.b.put("getVersion", new bah("getVersion", 3));
                return bahVar;
            default:
                return null;
        }
    }
}
