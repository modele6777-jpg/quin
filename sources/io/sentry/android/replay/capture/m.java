package io.sentry.android.replay.capture;

import defpackage.a26;
import defpackage.gu7;
import defpackage.wef;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends gu7 implements a26 {
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar) {
        super(1);
        this.this$0 = oVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        u uVar = (u) obj;
        uVar.getClass();
        if (uVar instanceof s) {
            this.this$0.z.add(uVar);
            o oVar = this.this$0;
            oVar.k(oVar.e() + 1);
        }
        return wef.a;
    }
}
