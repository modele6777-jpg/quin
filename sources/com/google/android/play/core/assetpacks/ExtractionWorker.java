package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.os.Bundle;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import defpackage.agg;
import defpackage.bb3;
import defpackage.cgg;
import defpackage.kr5;
import defpackage.psd;
import defpackage.r88;
import defpackage.sfc;
import defpackage.t88;
import defpackage.tgg;
import defpackage.u88;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ExtractionWorker extends Worker {
    public final agg e;

    public ExtractionWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.e = (agg) cgg.n(context).c.a();
    }

    @Override // androidx.work.Worker
    public final u88 c() {
        bb3 bb3Var = this.b.b;
        agg aggVar = this.e;
        aggVar.getClass();
        psd psdVar = new psd("session_bundle:", bb3Var);
        sfc.j(psdVar);
        Bundle bundle = (Bundle) psdVar.d;
        try {
            k kVar = aggVar.a;
            kVar.getClass();
            if (((Boolean) kVar.b(new j(kVar, bundle, 0))).booleanValue()) {
                aggVar.b.a();
            }
            return new t88();
        } catch (g e) {
            agg.d.b("Error while updating ExtractorSessionStoreView: %s", e.getMessage());
            return new r88();
        }
    }

    @Override // androidx.work.Worker
    public final kr5 e() {
        bb3 bb3Var = this.b.b;
        tgg tggVar = this.e.c;
        psd psdVar = new psd("notification_bundle:", bb3Var);
        sfc.i(psdVar);
        Bundle bundle = (Bundle) psdVar.d;
        tggVar.b(bundle);
        return new kr5(-1883842196, tggVar.a(bundle), 0);
    }
}
