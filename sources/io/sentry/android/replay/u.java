package io.sentry.android.replay;

import defpackage.a26;
import defpackage.cgg;
import defpackage.gu7;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class u extends gu7 implements a26 {
    final /* synthetic */ x $this_apply;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(x xVar) {
        super(1);
        this.$this_apply = xVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        io.sentry.util.a aVar = this.$this_apply.b;
        aVar.b();
        try {
            v vVar = this.$this_apply.d;
            vVar.addAll(arrayList);
            cgg.t(aVar, null);
            return vVar;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                cgg.t(aVar, th);
                throw th2;
            }
        }
    }
}
