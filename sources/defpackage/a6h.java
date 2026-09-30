package defpackage;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a6h {
    public final Context a;
    public final Boolean b;
    public final long c;
    public final gwg d;
    public final boolean e;
    public final Long f;
    public final Long g;
    public final String h;

    public a6h(Context context, gwg gwgVar, Long l, Long l2) {
        this.e = true;
        oa7.A(context);
        Context applicationContext = context.getApplicationContext();
        oa7.A(applicationContext);
        this.a = applicationContext;
        this.f = l;
        this.g = l2;
        if (gwgVar != null) {
            this.d = gwgVar;
            this.e = gwgVar.c;
            this.c = gwgVar.b;
            this.h = gwgVar.e;
            Bundle bundle = gwgVar.d;
            if (bundle != null) {
                this.b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
