package io.sentry.android.replay.capture;

import defpackage.a26;
import defpackage.gu7;
import defpackage.wef;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends gu7 implements a26 {
    final /* synthetic */ a26 $onSegmentSent;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, io.sentry.android.replay.n nVar) {
        super(1);
        this.this$0 = oVar;
        this.$onSegmentSent = nVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) throws InterruptedException {
        u uVar = (u) obj;
        uVar.getClass();
        o oVar = this.this$0;
        ArrayList arrayList = oVar.z;
        arrayList.getClass();
        s sVar = (s) (arrayList.isEmpty() ? null : arrayList.remove(0));
        while (sVar != null) {
            s.a(sVar, oVar.w);
            sVar = (s) (arrayList.isEmpty() ? null : arrayList.remove(0));
            Thread.sleep(100L);
        }
        if (uVar instanceof s) {
            s sVar2 = (s) uVar;
            s.a(sVar2, this.this$0.w);
            this.$onSegmentSent.d(sVar2.a.J0);
        }
        return wef.a;
    }
}
