package defpackage;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class q4h implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ndh b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ e5h d;

    public /* synthetic */ q4h(e5h e5hVar, ndh ndhVar, Bundle bundle, int i) {
        this.a = i;
        this.b = ndhVar;
        this.c = bundle;
        this.d = e5hVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        int i = this.a;
        Bundle bundle = this.c;
        ndh ndhVar = this.b;
        e5h e5hVar = this.d;
        switch (i) {
            case 0:
                ich ichVar = e5hVar.d;
                ichVar.U();
                return ichVar.e0(bundle, ndhVar);
            default:
                ich ichVar2 = e5hVar.d;
                ichVar2.U();
                return ichVar2.e0(bundle, ndhVar);
        }
    }
}
