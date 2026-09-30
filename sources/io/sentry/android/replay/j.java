package io.sentry.android.replay;

import defpackage.a26;
import defpackage.gu7;
import defpackage.mmb;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends gu7 implements a26 {
    final /* synthetic */ mmb $screen;
    final /* synthetic */ long $until;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(long j, k kVar, mmb mmbVar) {
        super(1);
        this.$until = j;
        this.this$0 = kVar;
        this.$screen = mmbVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        l lVar = (l) obj;
        lVar.getClass();
        if (lVar.b < this.$until) {
            this.this$0.h(lVar.a);
            return Boolean.TRUE;
        }
        mmb mmbVar = this.$screen;
        if (mmbVar.element == null) {
            mmbVar.element = lVar.c;
        }
        return Boolean.FALSE;
    }
}
