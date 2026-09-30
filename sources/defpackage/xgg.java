package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xgg implements cfg {
    public final /* synthetic */ int a;
    public final oid b;

    public /* synthetic */ xgg(oid oidVar, int i) {
        this.a = i;
        this.b = oidVar;
    }

    @Override // defpackage.cfg
    public final Object a() {
        int i = this.a;
        oid oidVar = this.b;
        switch (i) {
            case 0:
                return new wgg((Context) ((ysd) oidVar.b).b);
            default:
                return yag.b((Context) ((ysd) oidVar.b).b);
        }
    }
}
