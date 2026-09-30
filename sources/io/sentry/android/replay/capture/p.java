package io.sentry.android.replay.capture;

import defpackage.a26;
import defpackage.gu7;
import defpackage.wef;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class p extends gu7 implements a26 {
    final /* synthetic */ List<io.sentry.rrweb.b> $recordingPayload;
    final /* synthetic */ Date $segmentTimestamp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Date date, ArrayList arrayList) {
        super(1);
        this.$segmentTimestamp = date;
        this.$recordingPayload = arrayList;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        io.sentry.rrweb.b bVar = (io.sentry.rrweb.b) obj;
        bVar.getClass();
        if (bVar.b >= this.$segmentTimestamp.getTime()) {
            this.$recordingPayload.add(bVar);
        }
        return wef.a;
    }
}
