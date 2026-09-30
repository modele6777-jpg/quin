package io.sentry.android.sqlite;

import defpackage.gu7;
import defpackage.x16;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends gu7 implements x16 {
    final /* synthetic */ String $query;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, String str) {
        super(0);
        this.this$0 = iVar;
        this.$query = str;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        return this.this$0.a.l0(this.$query);
    }
}
